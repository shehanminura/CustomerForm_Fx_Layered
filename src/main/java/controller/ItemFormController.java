package controller;

import com.jfoenix.controls.JFXTextField;
import dto.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import service.ServiceFactroy;
import service.custom.ItemService;
import util.ServiceType;

public class ItemFormController {

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableView<?> tblCustomers;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPrice;

    @FXML
    private JFXTextField txtid;

    @FXML
    private JFXTextField txtqty;

    ItemService service = ServiceFactroy.getInstance().getServiceType(ServiceType.ITEM);

    @FXML
    void OnAddAction(ActionEvent event) {
        String id = txtid.getText();
        String name = txtName.getText();
        Integer qty = Integer.parseInt(txtqty.getText());
        Double price = Double.parseDouble(txtPrice.getText());

        Item item = new Item(id, name, qty, price);

        service.addItem(item);
    }

    @FXML
    void OnDeleteAction(ActionEvent event) {

    }

    @FXML
    void OnSeartchAction(ActionEvent event) {

    }

    @FXML
    void OnUpdateAction(ActionEvent event) {

    }

    @FXML
    void btnGetCustomerReportOnAddAction(ActionEvent event) {

    }

    @FXML
    void btnRelodeOnAction(ActionEvent event) {

    }

}
