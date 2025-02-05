class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', email='" + email + "'}";
    }

    public String toVerticalString() {
        return "Customer:" + "\n" + "  Name: " + name + "\n" + "  Email: " + email;
    }
}