class course {
    private String name;
    private int mark;
    
    public course(String name) {
        this.name = name;
    }
    
    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public int getMark(Student student) {
        return mark;
    }
    
    public String getName() {
        return name;
    }
    }
    
    