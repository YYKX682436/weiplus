package k46;

/* loaded from: classes13.dex */
public abstract class f extends java.io.FilterOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f304111d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f304112e;

    public f(java.io.OutputStream outputStream) {
        super(outputStream);
        this.f304112e = new java.lang.Object();
    }

    public java.io.InputStream a() {
        synchronized (this.f304112e) {
            if (this.f304111d == null) {
                this.f304111d = b();
            }
        }
        return this.f304111d;
    }

    public abstract java.io.InputStream b();
}
