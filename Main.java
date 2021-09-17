

class Main {
  static float calculaAreaTriangulo(float base, float altura) {
    return (base*altura)/2;
  }
  public static void main(String[] args) {
    float b = 5;
    float h = 4;

    System.out.println("Área do triangulo: " + calculaAreaTriangulo(b,h));
  }
}