package dh4;

/* loaded from: classes15.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f232586a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f232587b = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public void a(java.lang.String str) {
        dh4.o0 o0Var = new dh4.o0(this, str);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            o0Var.run();
        } else {
            this.f232587b.post(o0Var);
        }
    }

    public void b(java.lang.String str, int i17, int i18) {
        dh4.l0 l0Var = new dh4.l0(this, str, i17, i18);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            l0Var.run();
        } else {
            this.f232587b.post(l0Var);
        }
    }

    public void c(int i17, int i18, java.lang.String str) {
        dh4.p0 p0Var = new dh4.p0(this, i17, i18, str);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            p0Var.run();
        } else {
            this.f232587b.post(p0Var);
        }
    }

    public void d(int i17) {
        dh4.n0 n0Var = new dh4.n0(this, i17);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            n0Var.run();
        } else {
            this.f232587b.post(n0Var);
        }
    }
}
