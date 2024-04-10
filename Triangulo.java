public class Triangulo {
		private  double ladoA;
		private  double ladoB;
		private double ladoC;
		
		
		public double getLadoA () {
			return ladoA;
		}
		public double getLadoB () {
			return ladoB;
		}
		public double getLadoC () {
			return ladoC;
		}
		public void setLadoA (double la) {
			this.ladoA = la;
		}
		public void setLadoB (double lb) {
			this.ladoB = lb;
		}
		public void setLadoC (double lc) {
			this.ladoC = lc;
		}
		public double calcularPerimetro() {
			return (this.ladoA + this.ladoB + this.ladoC);
			
		}
