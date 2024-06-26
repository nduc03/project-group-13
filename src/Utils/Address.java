package Utils;

public class Address {
    private final String addressLine;
    private final String street;
    private final String district;
    private final String city;
    private final String province;

    public Address(String addressLine, String street, String district, String city, String province) {
        this.addressLine = addressLine;
        this.street = street;
        this.district = district;
        this.city = city;
        this.province = province;
    }

    public Address(String addressLine, String street, String district, String city) {
        this(addressLine, street, district, city, null);
    }

    public String getAddressLine() {
        return null;
    }

    public String getStreet() {
        return null;
    }

    public String getDistrict() {
        return null;
    }

    public String getCity() {
        return null;
    }

    public String getProvince() {
        return null;
    }
}
