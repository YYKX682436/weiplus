package s65;

/* loaded from: classes11.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f403440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.e0 f403441e;

    public d0(s65.e0 e0Var, int i17) {
        this.f403441e = e0Var;
        this.f403440d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        s65.e0 e0Var = this.f403441e;
        s65.f0 f0Var = e0Var.f403445f;
        int i17 = f0Var.f403448b;
        int i18 = f0Var.f403447a;
        if (i17 <= i18) {
            f0Var.f403449c.a(i18, i17);
        }
        e0Var.f403445f.f403449c.c(this.f403440d);
    }
}
