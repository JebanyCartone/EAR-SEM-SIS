package cz.cvut.fel.ear.sis.DAO;

import cz.cvut.fel.ear.sis.model.Program;
import org.springframework.stereotype.Repository;

@Repository
public class ProgramDao extends BaseDao<Program>{
    public ProgramDao() {super(Program.class); }
}