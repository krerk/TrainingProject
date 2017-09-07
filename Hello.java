class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Natthawat();
		this.Piyapat();
	this.Sutthidet();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("Trainee - Krerk Piromsopa, Ph.D. --- ");
    }
	
	private void Piyapat(){
		 System.out.println("Piyapat Plydaung");
        
	}    

	private void Natthawat() {
		System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
		System.out.println("Trainee - Natthawat Sudsang, SSA ---");
	}
	private void Sutthidet() {
		System.out.println("Trainee - Sutthidet Sarue  SE");
	}

    public static void main(String [] argv) {
        new Hello();
    }
}
