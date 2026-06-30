package wz5;

/* loaded from: classes7.dex */
public abstract class a {
    public static final void a(java.lang.AutoCloseable autoCloseable, java.lang.Throwable th6) {
        if (autoCloseable != null) {
            if (th6 == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (java.lang.Throwable th7) {
                jz5.a.a(th6, th7);
            }
        }
    }
}
