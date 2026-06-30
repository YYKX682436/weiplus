package wo;

/* loaded from: classes12.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f447787a = false;

    /* renamed from: b, reason: collision with root package name */
    public volatile java.lang.String f447788b = null;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f447789c = new byte[0];

    public q0(wo.g0 g0Var) {
    }

    public java.lang.String a(java.lang.String str) {
        if (this.f447787a) {
            return this.f447788b;
        }
        synchronized (this.f447789c) {
            if (this.f447787a) {
                return this.f447788b;
            }
            this.f447788b = b();
            if (this.f447788b == null) {
                return str;
            }
            this.f447787a = true;
            return this.f447788b;
        }
    }

    public abstract java.lang.String b();

    public abstract void c(java.lang.String str);

    public void d(java.lang.String str) {
        synchronized (this.f447789c) {
            if (this.f447787a && android.text.TextUtils.equals(this.f447788b, str)) {
                return;
            }
            this.f447788b = str;
            this.f447787a = true;
            c(str);
        }
    }
}
