
package dictionary;

public class Word {
    
    public Word(String name, String definition, String synonyms, String antonyms){
        this.name = name;
        this.definition = definition;
        this.synonyms = synonyms;
        this.antonyms = antonyms;
    }

   
    public String getName(){
        return name;
    }
    
      public String getDefinition(){
        return definition;
    }   
    
     public String getSynonyms(){
        return synonyms;
    }
     
    public String getAntonyms(){
        return antonyms;
    }
    
    public String toString(){
        String strRepresentationOfWord = name + definition + synonyms + antonyms;
        
        return strRepresentationOfWord;
    }
    
    private String name;
    private String definition;
    private String synonyms;
    private String antonyms;
}


