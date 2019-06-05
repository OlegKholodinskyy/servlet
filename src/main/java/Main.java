import model.Item;
import repository.ItemDAO;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Item  item = new Item();
        item.setName("Test Item");
        item.setDateCreated(new Date());
        item.setLastUpdatedDate(new Date());
        item.setDescription("Test Description");

        ItemDAO itemDAO = new ItemDAO();
        itemDAO.save(item);
    }
}
