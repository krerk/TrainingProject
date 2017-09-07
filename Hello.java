class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Buncha();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("Trainee - Krerk Piromsopa, Ph.D. --- ");
    }
	
	private void Buncha() {
        System.out.println("Trainer - Buncha Poomarin");
        System.out.println("Trainee - Buncha Poomarin --- ");
    }
    public static void main(String [] argv) {
        new Hello();
    }
}
