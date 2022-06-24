import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Matricula 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade=CascadeType.PERSIST)// declara um relacionamento de muitos para 1 (Many to one)
	private Aluno aluno;
	
	@ManyToOne(cascade=CascadeType.PERSIST)// declara um relacionamento de muitos para 1 (Many to one)
	private Disciplina disciplina;

	public Matricula(Long id, Aluno aluno, Disciplina disciplina) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	
	public Matricula() {
		
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}