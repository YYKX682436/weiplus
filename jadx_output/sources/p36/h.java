package p36;

/* loaded from: classes16.dex */
public abstract class h {
    public static boolean a(java.lang.String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean b(java.lang.String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }
}
