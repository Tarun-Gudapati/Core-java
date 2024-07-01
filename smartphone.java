class smartphone {
    String Cname;
    String model;
    String price;

    public smartphone(String Cname, String model, String price) {
        this.Cname = Cname;
        this.model = model;
        this.price = price;
    }

    public void show() {
        System.out.printf("the model is %S from company %S and the price is %S \n", model, Cname, price);
    }
}

class Main {
    public void main() {
        smartphone s1 = new smartphone("Apple", "15pm", "100000");
        smartphone s2 = new smartphone("Samsung", "21U", "110000");
        smartphone s3 = new smartphone("vivo", "x100", "180000");
        smartphone[] sarr = { s1, s2, s3 };
        for (smartphone sarr1 : sarr) {
            sarr1.show();
        }

    }
}
