package singledimension;

public class Passenger {
	private String name;
	  private char gender;
	  private String phone;
	  private String trackId;
	  private String fromPlace;
	  private String destinationPlace;
	  private int seatNo;
	  
	  protected Passenger(String name,char gender, String phone,String trackId, String fromPlace, String destinationPlace, int seatNo ) {
		 super();
		 this.name=name;
		 this.gender=gender;
		 this.phone=phone;
		 this.trackId=trackId;
		 this.fromPlace=fromPlace;
		 this.destinationPlace=destinationPlace;
		 this.seatNo=seatNo;
	  }
	  
	  public String getName() {
		  return name;
	  }
	  
	  public char getGender() {
		  return gender;
	  }
	  
	  public String getPhone() {
		  return phone;
	  }
	  
	  public String getTrackId() {
		  return trackId;
	  }
	  
	  public String getFromPlace() {
		  return fromPlace;
	  }
	  
	  public String getDestinationPlace() {
		  return destinationPlace;
	  }
	  
	  public int getSeatNo() {
		  return seatNo;
	  }
	}
	  
	    class Booking {
		   Passenger[] bus;
		   
		   public Booking(int size) {
			   bus=new Passenger[size];
		   }
		   
		   public void ticketBooking(int seatNo, String name, char gender, String phone, String fromPlace, String destinationPlace) {
			   try {
				   if(bus[seatNo-1]==null) {
					   Passenger p1=new Passenger(name, gender,phone, phone, fromPlace,destinationPlace, seatNo);
					   System.out.println("Seat is confirmed");
					   System.out.println("name:"+"\n"+"gender:"+gender+"\n"+"phone:"+phone+"\n"+"from:"+fromPlace+"\n"+"Destination:"+destinationPlace+"\n"+"seatNo:"+seatNo);
				   }else {
					   System.out.println("Seat is already booked");	
				   }
			   }catch(ArrayIndexOutOfBoundsException e) 
			   {
				   System.out.println("Inavalid seat number");
			   }
		   }
		   
		 public void printAllPassengerData() {
			 System.out.println("SeatNo\tname\tgender\tphone\tfrom\tdestination");
			 for(int i=0;i<bus.length;i++) 
			 {
				 if(bus[i]!=null) 
				 {
				 System.out.print(bus[i].getSeatNo()+"\t"+bus[i].getName()+"\t"+bus[i].getGender()+"\t"+bus[i].getPhone()+"\t"+bus[i].getFromPlace()+"\t"+bus[i].getDestinationPlace());
			 }
		 }
		 }
		 public void searchPassenger(String name) 
		 {
			 for(int i=0;i<bus.length;i++)
			 {
				 if(bus[i]!=null && bus[i].getName().equalsIgnoreCase(name))
				 {
					System.out.println("the passenger"+name+"is travelling in this bus in seat"+(bus[i].getSeatNo()));
					return;
				 }
			 }
			 System.out.println("the passenger"+name+"is not travelling in this bus");
		 }
		 
		 public void searchPassengerBySeatNo(int seat)
		 {
			 try {
				 if(bus[seat-1]!=null)
				 {
					 System.out.println("the passenger"+bus[seat-1].getName()+"is travelling in this bus");
				 }else {
					 System.out.println("the seat is not booked");
				 }
			 }
			 catch(ArrayIndexOutOfBoundsException e)
			 {
				 System.out.println("inavalid seat number");
			 }
		 }
		 
		 public void deletingPassenger(String name)
		 {
			 for(int i=0;i<bus.length;i++)
			 {
				 if(bus[i]!=null && bus[i].getName().equalsIgnoreCase(name))
				 {
					 bus[i]=null;
					 System.out.println("the ticket is canceled");
					 return;
				 }
			 }
			 System.out.println("the seat is not booked");
		 }
		 
		 public void deletingPassengerBySeatNo(int seat)
		 {
			 try {
				 if(bus[seat-1]!=null)
				 {
					 bus[seat-1]=null;
					 System.out.println("the ticket is canceled");
					 return;
				 }else {
					 System.out.println("the seat is not booked");
				 }
			 }
			 catch(ArrayIndexOutOfBoundsException e)
			 {
				 System.out.println("available seats are");
				
			 }
		 }
			 
			 public void availableSeats() {
				 System.out.println("available seats are:");
				 for(int i=0;i<bus.length;i++)
				 {
					 if(bus[i]==null)
					 {
						 System.out.println((i+1));
					 }
				 }
		 }
			 
	public class Redbus{
		 public static void main(String[] args) {
			 Booking b1=new Booking(5);
			 b1.ticketBooking(1, "krusha", 'm', "25458735","dvg", "shm");
			 b1.ticketBooking(2, "manu", 'm', "253658","shm","ckm");
			 b1.ticketBooking(3, "kiran", 'm', "6865368", "dvg", "ckm");
			 b1.ticketBooking(4, "pratam", 'm', "2546873", "mys", "bgr");
			 b1.ticketBooking(5, "surya", 'm', "5879354", "blr", "dvg");
			 b1.printAllPassengerData();
			 b1.searchPassenger("manu");
			 
			 b1.deletingPassengerBySeatNo(1);
			 b1.deletingPassenger("pratam");
			 
			 b1.deletingPassengerBySeatNo(1);
			 b1.availableSeats();
		 }
		}
}
