package controller;

import com.jfoenix.controls.JFXTextField;
import dto.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import service.ServiceFactroy;
import service.custom.CustomerService;
import util.ServiceType;

public class CustomerFormController {

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
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtSalary;

    @FXML
    private JFXTextField txtid;

    CustomerService service = ServiceFactroy.getInstance().getServiceType(ServiceType.CUSTOMER);


    @FXML
    void OnAddAction(ActionEvent event) {
        String id = txtid.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        Double salary = Double.parseDouble(txtSalary.getText());
        Customer customer = new Customer(id,name,address,salary);

        service.addCustomer(customer);
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
