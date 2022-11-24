package Test;

public class ResourceData {

    private String driverClassName;
    private String url;
    private String username;
    private String pw;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void Connection(){
        System.out.println("url: " + this.url + "\n" + "username/password: " + this.username + "/" + this.pw);
    }
}
