package n56;

/* loaded from: classes13.dex */
public abstract class c {
    static {
        java.util.regex.Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*://\\S+");
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        boolean z17 = (str == null || str.trim().equals("")) ? false : true;
        if (str2 == null || str2.trim().length() <= 0) {
            str2 = "Received an invalid parameter";
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static void b(java.lang.Object obj, java.lang.String str) {
        boolean z17 = obj != null;
        if (str == null || str.trim().length() <= 0) {
            str = "Received an invalid parameter";
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }
}
