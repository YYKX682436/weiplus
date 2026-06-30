package q56;

/* loaded from: classes16.dex */
public class i extends java.lang.RuntimeException {
    public i(java.lang.String str, java.lang.Throwable th6) {
        super(str, th6 == null ? new java.lang.NullPointerException() : th6);
    }

    public i(java.lang.Throwable th6) {
        super(th6 != null ? th6.getMessage() : null, th6 == null ? new java.lang.NullPointerException() : th6);
    }
}
