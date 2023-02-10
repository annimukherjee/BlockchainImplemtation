import java.util.ArrayList;

public class Main {
    /**
     * Hash = digital signature
     * <p>
     * Each block should have:
     * - List of transactions
     * - Previous Hash
     * - Hash
     * <p>
     * Because of this structure if anything is
     * changed in a previous block a chain reaction
     * will happen and all the blocks after that block
     * will have different digital signatures
     */
    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("ONE NETWORK");

        String[] genesisTransactions = {"ankit send aniruddha a 10 line message", "aniruddha sent ankit a 5 line message"};
        Block genesisBlock = new Block(0, genesisTransactions);
        // genesis block has to be hard coded
        String[] block2Transactions = {"aniruddha send ankit a 10 line message", "ankit sent anituddha a 5 line message"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        String[] block3Transactions = {"aniruddha send ankit a 10 line message", "ankit sent anituddha a 5 line message"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Geneisblock hash " + genesisBlock.getBlockHash());
        System.out.println("Block2 hash " + block2.getBlockHash());
        System.out.println("Block3 hash " + block3.getBlockHash());

        System.out.println("NOW IF WE CHANGE ANYTHING IN GENESIS BLOCK, ALL THE OTHER HASHES WILL CHANGE");
        System.out.println("LIKE A CHAIN REACTION\n--------------");

        genesisTransactions[0] = "ankit send aniruddha a 55 line message";
        System.out.println("genesisBlock transactions changed. Success.");
        genesisBlock = new Block(0, genesisTransactions);
        // genesis block has to be hard coded
        block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Geneisblock hash " + genesisBlock.getBlockHash());
        System.out.println("Block2 hash " + block2.getBlockHash());
        System.out.println("Block3 hash " + block3.getBlockHash());
    }
}