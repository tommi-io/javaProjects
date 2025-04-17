package filesys;

import java.util.ArrayList;

public class Directory {
    String nome;
    int peso;
    ArrayList<Directory> innerDirs;
    ArrayList<File> innerFiles;

    public Directory(String nome){
        this.nome = nome;
        peso = 0;
        innerDirs = new ArrayList<Directory>();
        innerFiles = new ArrayList<File>();
    }

    public void addFile(File f){
        innerFiles.add(f);
        this.peso += f.peso;
    }

    public void addDir(Directory d){
        innerDirs.add(d);
        this.peso += d.peso;
    }

    @Override
    public String toString(){
        //stampa cartelle
        //stampa files
        
    }
}
