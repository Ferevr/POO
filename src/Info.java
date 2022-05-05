
public class Info {
    String Nombre;
    String Carrera;
    int semestre;
    
    public void Imprimir(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Carrera: " + Carrera);
        System.out.println("Semestre: " + semestre);
    }

    public Info(String Nombre, String Carrera, int semestre) {
        this.Nombre = Nombre;
        this.Carrera = Carrera;
        this.semestre = semestre;
    }
    
    
    //Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
}
