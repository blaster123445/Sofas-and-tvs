// Save data to local storage
function saveData() {
  localStorage.setItem('customers', JSON.stringify(customers));
  localStorage.setItem('products', JSON.stringify(products));
  localStorage.setItem('payments', JSON.stringify(payments));
}

// Load data from local storage
function loadData() {
  const storedCustomers = localStorage.getItem('customers');
  const storedProducts = localStorage.getItem('products');
  const storedPayments = localStorage.getItem('payments');

  if (storedCustomers) {
    customers = JSON.parse(storedCustomers);
    updateCustomersTable();
    updateCustomerDropdowns();
  }

  if (storedProducts) {
    products = JSON.parse(storedProducts);
    updateProductsTable();
  }

  if (storedPayments) {
    payments = JSON.parse(storedPayments);
    updatePaymentsTable();
  }
}

// Call loadData when the system is initialized
function enterSystem() {
  document.getElementById('welcomeScreen').style.display = 'none';
  document.getElementById('mainSystem').style.display = 'block';
  loadData();
  // Set today's date as default
  document.getElementById('paymentDate').value = new Date().toISOString().split('T')[0];
}

// Call saveData whenever data is modified
function addCustomer() {
  // ... existing code ...
  saveData();
}

function deleteCustomer(customerId) {
  // ... existing code ...
  saveData();
}

function addProduct() {
  // ... existing code ...
  saveData();
}

function deleteProduct(productId) {
  // ... existing code ...
  saveData();
}

function addPayment() {
  // ... existing code ...
  saveData();
}

function deletePayment(paymentId) {
  // ... existing code ...
  saveData();
}