package provider.entity;

public class examinfo {
private int id;
private  String classNo;
private  String course;
private  String startime;
private  String endtime;
private  String place;





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    @Override
    public String toString() {
        return "examinfo{" +
                "id=" + id +
                ", classNo='" + classNo + '\'' +
                ", course='" + course + '\'' +
                ", startime='" + startime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", place='" + place + '\'' +
                '}';
    }

    public examinfo(int id, String classNo, String course, String startime, String endtime, String place) {
        this.id = id;
        this.classNo = classNo;
        this.course = course;
        this.startime = startime;
        this.endtime = endtime;
        this.place = place;
    }



}
