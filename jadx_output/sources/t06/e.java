package t06;

/* loaded from: classes15.dex */
public abstract class e {
    public static final java.lang.Class a(java.lang.ClassLoader classLoader, java.lang.String fqName) {
        kotlin.jvm.internal.o.g(classLoader, "<this>");
        kotlin.jvm.internal.o.g(fqName, "fqName");
        try {
            return java.lang.Class.forName(fqName, false, classLoader);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }
}
