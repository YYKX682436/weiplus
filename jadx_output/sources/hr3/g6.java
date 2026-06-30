package hr3;

/* loaded from: classes9.dex */
public class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283576d;

    public g6(hr3.t6 t6Var) {
        this.f283576d = t6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hr3.t6 t6Var = this.f283576d;
        if (t6Var.f284002d.isFinishing()) {
            return;
        }
        xp1.c.c(t6Var.f284002d, t6Var.f284004f.d1(), true);
        xp1.c.l(t6Var.f284002d);
    }
}
