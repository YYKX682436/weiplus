package lx;

/* loaded from: classes11.dex */
public final class p2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.v2 f321903d;

    public p2(lx.v2 v2Var) {
        this.f321903d = v2Var;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj;
        if (w0Var == null || (obj = w0Var.f316976d) == null) {
            return;
        }
        hr1.a aVar = obj instanceof hr1.a ? (hr1.a) obj : null;
        if (aVar == null) {
            return;
        }
        lx.v2 v2Var = this.f321903d;
        v2Var.f321981g.post(new lx.o2(aVar, v2Var));
    }
}
