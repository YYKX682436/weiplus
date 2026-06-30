package o26;

/* loaded from: classes13.dex */
public abstract class i {
    public static final boolean a(java.lang.Throwable th6) {
        kotlin.jvm.internal.o.g(th6, "<this>");
        java.lang.Class<?> cls = th6.getClass();
        while (!kotlin.jvm.internal.o.b(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }
}
