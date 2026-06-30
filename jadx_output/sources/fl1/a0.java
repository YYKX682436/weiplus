package fl1;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.b2 f263696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.b0 f263697e;

    public a0(fl1.b0 b0Var, fl1.b2 b2Var) {
        this.f263697e = b0Var;
        this.f263696d = b2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        fl1.b0 b0Var = this.f263697e;
        b0Var.f263700f.removeView(b0Var.f263698d);
        fl1.c0 c0Var = b0Var.f263700f;
        c0Var.f263725t = true;
        java.util.Iterator it = ((x.d) c0Var.f263723r).iterator();
        while (it.hasNext()) {
            ((fl1.c2) it.next()).a(b0Var.f263699e);
        }
        fl1.c0 c0Var2 = b0Var.f263700f;
        c0Var2.f263725t = false;
        if (!((x.d) c0Var2.f263724s).isEmpty()) {
            fl1.c0 c0Var3 = b0Var.f263700f;
            ((x.d) c0Var3.f263723r).removeAll(c0Var3.f263724s);
            ((x.d) b0Var.f263700f.f263724s).clear();
        }
        fl1.b2 b2Var = this.f263696d;
        if (b2Var != null) {
            b2Var.m();
        }
    }
}
