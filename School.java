
public class School {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.setLaststName("Ilias");
		t1.setLaststName("Mathioudakis");
		t1.setAMKA("12345678999");
		t1.setSubject("Mathimatika");
		t1.printInfo();
		
		Teacher t2 = new Teacher();
		t2.setLaststName("Giwrgos");
		t2.setLaststName("Dimitriou");
		t2.setAMKA("65770304651");
		t2.setSubject("Glwssa");
		t2.printInfo();
		
		Teacher t3 = new Teacher();
		t3.setLaststName("Vaggelis");
		t3.setLaststName("Pappas");
		t3.setAMKA("42692301752");
		t3.setSubject("programatismos");
		t3.printInfo();
		
		Teacher t4 = new Teacher();
		t4.setLaststName("Agisilaos");
		t4.setLaststName("Aggelopoulos");
		t4.setAMKA("92783860194");
		t4.setSubject("Praktikh");
		t4.printInfo();
		
		Teacher t5 = new Teacher();
		t5.setLaststName("Arghrhs");
		t5.setLaststName("Niolaou");
		t5.setAMKA("34556285091");
		t5.setSubject("Thewritikh");
		t5.printInfo();
		
		Classroom c1 = new Classroom();
		c1.setClassCode("E1");
		c1.setClassDesc("Ergastirio I");
		c1.printInfo();
		
		Classroom c2 = new Classroom();
		c2.setClassCode("E2");
		c2.setClassDesc("Ergastirio II");
		c2.printInfo();

		Classroom c3 = new Classroom();
		c3.setClassCode("E3");
		c3.setClassDesc("Ergastirio III");
		c3.printInfo();
		
		Classroom c4 = new Classroom();
		c4.setClassCode("E4");
		c4.setClassDesc("Ergastirio IV");
		c4.printInfo();
		
		Classroom c5 = new Classroom();
		c5.setClassCode("E5");
		c5.setClassDesc("Ergastirio V");
		c5.printInfo();
		
		Subject s1 = new Subject();
		s1.setSubDesc("Algorithms and data structures III");
		s1.setSubCode("M1");
		s1.setClassroom("E4");
		s1.printInfo();
		
		Subject s2 = new Subject();
		s2.setSubDesc("Computer architecture and organization II");
		s2.setSubCode("M2");
		s2.setClassroom("E2");
		s2.printInfo();
		
		Subject s3 = new Subject();
		s3.setSubDesc("Programming languages and software engineering II");
		s3.setSubCode("M3");
		s3.setClassroom("E3");
		s3.printInfo();
		
		Subject s4 = new Subject();
		s4.setSubDesc("Operating systems and networking II");
		s4.setSubCode("M4");
		s4.setClassroom("E1");
		s4.printInfo();
		
		Subject s5 = new Subject();
		s5.setSubDesc("Programming languages and software engineering III");
		s5.setSubCode("M5");
		s5.setClassroom("E3");
		s5.printInfo();
		
	
		Student m1 = new Student();
		m1.setFirstName("Eren");
		m1.setLaststName("Jaeger");
		m1.setAMM("0712022");
		m1.setSubject("Algorithms and data structures");
		m1.setSubject("Computer architecture and organization");
		m1.setSubject("Programming languages and software engineering");
		m1.setSubject("Operating systems and networking");
		m1.setSubject("Artificial intelligence and machine learning");
		m1.printInfo();
		
		Student m2 = new Student();
		m2.setFirstName("Antwnhs");
		m2.setLaststName("Antwniou");
		m2.setAMM("1234567");
		m2.setSubject("Algorithms and data structures");
		m2.setSubject("Computer architecture and organization");
		m2.setSubject("Programming languages and software engineering");
		m2.setSubject("Operating systems and networking");
		m2.setSubject("Artificial intelligence and machine learning");
		m2.printInfo();
		
		Student m3 = new Student();
		m3.setFirstName("Nikolao");
		m3.setLaststName("Krisph");
		m3.setAMM("2344342");
		m3.setSubject("Algorithms and data structures");
		m3.setSubject("Computer architecture and organization");
		m3.setSubject("Programming languages and software engineering");
		m3.setSubject("Operating systems and networking");
		m3.setSubject("Artificial intelligence and machine learning");
		m3.printInfo();
		
		Student m4 = new Student();
		m4.setFirstName("Smpyros");
		m4.setLaststName("Andronik");
		m4.setAMM("3467266");
		m4.setSubject("Algorithms and data structures");
		m4.setSubject("Computer architecture and organization");
		m4.setSubject("Programming languages and software engineering");
		m4.setSubject("Operating systems and networking");
		m4.setSubject("Artificial intelligence and machine learning");
		m4.printInfo();
		
		Student m5 = new Student();
		m5.setFirstName("Marios");
		m5.setLaststName("Kotsiai");
		m5.setAMM("0702020");
		m5.setSubject("Algorithms and data structures");
		m5.setSubject("Computer architecture and organization");
		m5.setSubject("Programming languages and software engineering");
		m5.setSubject("Operating systems and networking");
		m5.setSubject("Artificial intelligence and machine learning");
		m5.printInfo();
		
		Student m6 = new Student();
		m6.setFirstName("Lefters");
		m6.setLaststName("Silver");
		m6.setAMM("6969694");
		m6.setSubject("Algorithms and data structures");
		m6.setSubject("Computer architecture and organization");
		m6.setSubject("Programming languages and software engineering");
		m6.setSubject("Operating systems and networking");
		m6.setSubject("Artificial intelligence and machine learning");
		m6.printInfo();
		
		Student m7 = new Student();
		m7.setFirstName("Nikolhs");
		m7.setLaststName("Soufas");
		m7.setAMM("1111114");
		m7.setSubject("Algorithms and data structures");
		m7.setSubject("Computer architecture and organization");
		m7.setSubject("Programming languages and software engineering");
		m7.setSubject("Operating systems and networking");
		m7.setSubject("Artificial intelligence and machine learning");
		m7.printInfo();
		
		Student m8 = new Student();
		m8.setFirstName("Axilleas");
		m8.setLaststName("Lou");
		m8.setAMM("4469284");
		m8.setSubject("Algorithms and data structures");
		m8.setSubject("Computer architecture and organization");
		m8.setSubject("Programming languages and software engineering");
		m8.setSubject("Operating systems and networking");
		m8.setSubject("Artificial intelligence and machine learning");
		m8.printInfo();
		
		Student m9 = new Student();
		m9.setFirstName("Spegos");
		m9.setLaststName("Fas");
		m9.setAMM("1963862");
		m9.setSubject("Algorithms and data structures");
		m9.setSubject("Computer architecture and organization");
		m9.setSubject("Programming languages and software engineering");
		m9.setSubject("Operating systems and networking");
		m9.setSubject("Artificial intelligence and machine learning");
		m9.printInfo();
		
		Student m10 = new Student();
		m10.setFirstName("Loukas");
		m10.setLaststName("Loukanikos");
		m10.setAMM("5682047");
		m10.setSubject("Algorithms and data structures");
		m10.setSubject("Computer architecture and organization");
		m10.setSubject("Programming languages and software engineering");
		m10.setSubject("Operating systems and networking");
		m10.setSubject("Artificial intelligence and machine learning");
		m10.printInfo();
		
		Student m11 = new Student();
		m11.setFirstName("Mhtsos");
		m11.setLaststName("Mhtsaras");
		m11.setAMM("9848562");
		m11.setSubject("Algorithms and data structures");
		m11.setSubject("Computer architecture and organization");
		m11.setSubject("Programming languages and software engineering");
		m11.setSubject("Operating systems and networking");
		m11.setSubject("Artificial intelligence and machine learning");
		m11.printInfo();
		
		Student m12 = new Student();
		m12.setFirstName("Xemina");
		m12.setLaststName("Apoonomata");
		m12.setAMM("4204202");
		m12.setSubject("Algorithms and data structures");
		m12.setSubject("Computer architecture and organization");
		m12.setSubject("Programming languages and software engineering");
		m12.setSubject("Operating systems and networking");
		m12.setSubject("Artificial intelligence and machine learning");
		m12.printInfo();
		
		Student m13 = new Student();
		m13.setFirstName("Onoma2");
		m13.setLaststName("Eponumo2");
		m13.setAMM("9956932");
		m13.setSubject("Algorithms and data structures");
		m13.setSubject("Computer architecture and organization");
		m13.setSubject("Programming languages and software engineering");
		m13.setSubject("Operating systems and networking");
		m13.setSubject("Artificial intelligence and machine learning");
		m13.printInfo();
		
		Student m14 = new Student();
		m14.setFirstName("Onoma3");
		m14.setLaststName("Epwnhmo3");
		m14.setAMM("3878402");
		m14.setSubject("Algorithms and data structures");
		m14.setSubject("Computer architecture and organization");
		m14.setSubject("Programming languages and software engineering");
		m14.setSubject("Operating systems and networking");
		m14.setSubject("Artificial intelligence and machine learning");
		m14.printInfo();
		
		Student m15 = new Student();
		m15.setFirstName("Onoma4");
		m15.setLaststName("Epwmhmo4");
		m15.setAMM("9093578");
		m15.setSubject("Algorithms and data structures");
		m15.setSubject("Computer architecture and organization");
		m15.setSubject("Programming languages and software engineering");
		m15.setSubject("Operating systems and networking");
		m15.setSubject("Artificial intelligence and machine learning");
		m15.printInfo();
		
		Student m16 = new Student();
		m16.setFirstName("Onoma5");
		m16.setLaststName("Epwnhmo5");
		m16.setAMM("1235656");
		m16.setSubject("Algorithms and data structures");
		m16.setSubject("Computer architecture and organization");
		m16.setSubject("Programming languages and software engineering");
		m16.setSubject("Operating systems and networking");
		m16.setSubject("Artificial intelligence and machine learning");
		m16.printInfo();
		
		Student m17 = new Student();
		m17.setFirstName("Onoma6");
		m17.setLaststName("Epwnhmo6");
		m17.setAMM("9453726");
		m17.setSubject("Algorithms and data structures");
		m17.setSubject("Computer architecture and organization");
		m17.setSubject("Programming languages and software engineering");
		m17.setSubject("Operating systems and networking");
		m17.setSubject("Artificial intelligence and machine learning");
		m17.printInfo();
		
		Student m18 = new Student();
		m18.setFirstName("Onoma7");
		m18.setLaststName("Epwnhmo7");
		m18.setAMM("7439637");
		m18.setSubject("Algorithms and data structures");
		m18.setSubject("Computer architecture and organization");
		m18.setSubject("Programming languages and software engineering");
		m18.setSubject("Operating systems and networking");
		m18.setSubject("Artificial intelligence and machine learning");
		m18.printInfo();
		
		Student m19 = new Student();
		m19.setFirstName("Onoma8");
		m19.setLaststName("Epwnhmo8");
		m19.setAMM("9494926");
		m19.setSubject("Algorithms and data structures");
		m19.setSubject("Computer architecture and organization");
		m19.setSubject("Programming languages and software engineering");
		m19.setSubject("Operating systems and networking");
		m19.setSubject("Artificial intelligence and machine learning");
		m19.printInfo();
		
		Student m20 = new Student();
		m20.setFirstName("Onoma9");
		m20.setLaststName("Epwnhmo9");
		m20.setAMM("0324953");
		m20.setSubject("Algorithms and data structures");
		m20.setSubject("Computer architecture and organization");
		m20.setSubject("Programming languages and software engineering");
		m20.setSubject("Operating systems and networking");
		m20.setSubject("Artificial intelligence and machine learning");
		m20.printInfo();
		

	}

}