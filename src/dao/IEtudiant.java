package dao;

import entity.Etudiant;

import java.util.List;

public interface IEtudiant extends Repository<Etudiant>{
    public List<Etudiant> getEtudiantByClasse(String classe);
}
