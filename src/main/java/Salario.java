public class Salario{

  public double CalcSalPermanente(double SalarioFixo){
      return SalarioFixo;
    }

  public double CalcSalTemporario(int horas, double SalarioHora){
    try{
      return horas * SalarioHora;
    }catch (ArithmeticException  e){
      System.out.println("Erro ao calcular o salário do funcionário temporário");
      return 0;
    }
  }

  public double CalcSalHorista(int horas, int horasExtras, double SalarioHora){
    try{
      return (horas * SalarioHora) + (horasExtras * (SalarioHora * 1.5));
    }catch (ArithmeticException  e){
      System.out.println("Erro ao calcular o salário do funcionário horista");
      return 0;
    }
  }

  public double CalcSalFreelancer(int projetos, double SalarioProjeto){
    try{
      return projetos * SalarioProjeto;
    }catch (ArithmeticException  e){
      System.out.println("Erro ao calcular o salário do funcionário freelancer");
      return 0;
    }
  }
}
