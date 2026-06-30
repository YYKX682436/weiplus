package e56;

/* loaded from: classes11.dex */
public abstract class a {
    public static void a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null ? obj2 == null : obj.equals(obj2)) {
            return;
        }
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String)) {
            throw new e56.e("", (java.lang.String) obj, (java.lang.String) obj2);
        }
        java.lang.String b17 = b(null, obj, obj2);
        if (b17 != null) {
            throw new java.lang.AssertionError(b17);
        }
        throw new java.lang.AssertionError();
    }

    public static java.lang.String b(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str2 = "";
        if (str != null && !"".equals(str)) {
            str2 = str.concat(" ");
        }
        java.lang.String valueOf = java.lang.String.valueOf(obj);
        java.lang.String valueOf2 = java.lang.String.valueOf(obj2);
        if (valueOf.equals(valueOf2)) {
            return str2 + "expected: " + c(obj, valueOf) + " but was: " + c(obj2, valueOf2);
        }
        return str2 + "expected:<" + valueOf + "> but was:<" + valueOf2 + ">";
    }

    public static java.lang.String c(java.lang.Object obj, java.lang.String str) {
        return (obj == null ? "null" : obj.getClass().getName()) + "<" + str + ">";
    }
}
