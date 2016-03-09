package prob3;

public class Book {

	int bookNo; //번호
	String title; //제목
	String author; //작가
	int stateCode; //상태코드

	Book(int bookNo,String title,String author){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	//get, set
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
	
	public void rent(){
		this.stateCode = 0;
		System.out.println(this.getTitle()+"이(가) 대여 됐습니다.");
	}

	public void print(){
		System.out.print("책 제목:"+this.getTitle()+", 작가:"+this.getAuthor()+", 대여유무:");
		if(this.getStateCode()==0){
			System.out.println("재고없음");
		}else{
			System.out.println("재고있음");
		}
	}

}
