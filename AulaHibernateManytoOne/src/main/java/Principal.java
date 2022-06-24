import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Lucas"); // Cadastra uma nova Pessoa
		Aluno a1 = new Aluno(null, "Lucas"); // Cadastra um novo Aluno
		Disciplina d1 = new Disciplina(null, "Linguagem II", 30); // Cadastra uma nova Disciplina
		Disciplina d2 = new Disciplina(null, "Banco de Dados I", 30); // Cadastra uma nova Disciplina
		Matricula m1 = new Matricula(null, a1, d1); // Cadastra uma nova Matricula
		Matricula m2 = new Matricula(null, a1, d2); // Cadastra uma nova Matricula
		;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaHibernate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		a1.setNome("Andrízia");
		em.persist(a1);
		//em.persist(d1);
		em.persist(m1);
		em.persist(m2);
		em.getTransaction().commit();

	}

}
