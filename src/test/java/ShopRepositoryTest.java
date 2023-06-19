import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    Product product1 = new Product(12, "Сумка", 1500);
    Product product2 = new Product(24, "Портфель", 2500);
    Product product3 = new Product(36, "Рюкзак", 3500);

    @Test
    public void shouldDeleteByCorrectId() {
        ShopRepository repo = new ShopRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Product[] 
        Product[] expected = repoProduct(product1, product2);
    }

}
