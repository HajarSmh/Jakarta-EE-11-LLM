package org.example.hajarsamouh.jsf;

public class RequeteException extends Exception {

    /** JSON de la requête qui a posé problème (peut être null). */
    private final String requeteJson;

    public RequeteException(String message) {
        super(message);
        this.requeteJson = null;
    }

    public RequeteException(String message, String requeteJson) {
        super(message);
        this.requeteJson = requeteJson;
    }

    public RequeteException(String message, Throwable cause) {
        super(message, cause);
        this.requeteJson = null;
    }

    public String getRequeteJson() {
        return requeteJson;
    }
}