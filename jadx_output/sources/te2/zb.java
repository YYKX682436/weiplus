package te2;

/* loaded from: classes.dex */
public final class zb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418570d;

    public zb(te2.hc hcVar) {
        this.f418570d = hcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        te2.hc hcVar = this.f418570d;
        hcVar.getClass();
        pm0.v.X(new te2.gc(true, hcVar, new te2.sa(hcVar)));
        ya2.b2 b2Var = hcVar.I;
        java.lang.String str = "";
        java.lang.String D0 = b2Var != null ? b2Var.D0() : "";
        r45.h32 h32Var = hcVar.f418068J;
        if (h32Var != null && (string = h32Var.getString(4)) != null) {
            str = string;
        }
        gm0.j1.d().g(new db2.g6(D0, str));
    }
}
