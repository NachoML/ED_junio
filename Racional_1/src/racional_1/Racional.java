package racional_1;
/**
 *
 * @author Nacho Morán
 */
public class Racional
{
  private int numerounoparagit;
  private int numerodosparanetbeans;

    /**
     *
     */
    public Racional() 
  {
    this.numerounoparagit = 0;
    this.numerodos = 1;
  }

    /**
     *
     * @param num numero entero que se pasa por parámetro
     */
    public Racional( int num ) 
  {
    this.numerounoparagit = num;
    this.numerodos = 1;
  }

    /**
     *
     * @param num numero entero que se pasa por parámetro
     * @param den otro numero entero que se pasa por parámetro
     */
    public Racional( int num, int den ) 
  {
    this.numerounoparagit = num;
    this.numerodos = den;
    if ( this.numerodos == 0 )
    {
      System.out.println("Error: denominador 0. Se asigna 1.");
      this.numerodos = 1;
    }
    if ( this.numerodos < 0 )
    {
      this.numerounoparagit = -this.numerounoparagit;
      this.numerodos = -this.numerodos;
    }
    
  }
  
    /**
     *
     * @param r Objeto racional que se pasa por parámetro al método
     */
    public Racional( Racional r ) 
  {
     this.numerounoparagit = r.numerounoparagit;
     this.numerodos = r.numerodos;
  }

    /**
     *
     * @param r objeto racional que se pasa por parámetro al metodo
     * @return el metodo devuelve un objeto racional
     */
    public Racional Sumar( Racional r )
  {
    return new Racional(this.getNumerouno() * numerodos +
            numerodos * r.getNumerouno(),
            numerodos * numerodos );
  }
  
    /**
     *
     * @param r objeto racional que se pasa por parámetro al metodo
     * @return el metodo devuelve un objeto racional
     */
    public Racional restar( Racional r )
  {
    Racional resta=new Racional();
    resta.setNumerouno(this.getNumerouno() * numerodos - numerodos * r.getNumerouno());
    resta.setNumerodos(numerodos * numerodos) ;
    return resta;
  }
  
    /**
     *
     * @param r
     * @return el metodo devuelve un objeto racional
     */
    public Racional multiplicar( Racional r )
  {
    return new Racional(this.getNumerouno() * r.getNumerouno(),
            numerodos * numerodos );
  }
  
    /**
     *
     * @param r
     * @return el metodo devuelve un objeto racional
     */
    public Racional dividir( Racional r )
  {
    return new Racional(this.getNumerouno() * numerodos,
            numerodos * r.getNumerouno() );
  }
  
    /**
     *
     * @param r
     * @return el metodo devuelve un objeto racional
     */
    public boolean equals( Racional r )
  {
    return ( this.getNumerouno() * numerodos ==
            numerodos * r.getNumerouno() );
  }

    /**
     *
     * @param r
     * @return el metodo devuelve un objeto racional menor
     */
    public boolean esMenor( Racional r )
  {
    return ( this.getNumerouno() * numerodos <
            numerodos * r.getNumerouno() );
  }

    /**
     *
     * @param r
     * @return el metodo devuelve un objeto racional mayor
     */
    public boolean esMayor( Racional r )
  {
    return ( this.getNumerouno() * numerodos >
            numerodos * r.getNumerouno() );
  }
  
  public String toString()
  {
    return this.getNumerouno() + "/" + numerodos;
  }

    /**
     * @return devuelve el valor del atributo numerouno
     */
    public int getNumerouno() {
        return numerounoparagit;
    }

    /**
     * @param numerouno asigna valor al atributo numerouno
     */
    public void setNumerouno(int numerouno) {
        this.numerounoparagit = numerouno;
    }
    /**
     * @return the numerodos
     */

    /**
     * @param numerodos asigna valor al atributo numerodos
     */
    public void setNumerodos(int numerodos) {
        this.numerodos = numerodos;
    }

 
}
