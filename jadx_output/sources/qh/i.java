package qh;

/* loaded from: classes12.dex */
public class i implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qh.u f363358a;

    public i(qh.t tVar, qh.u uVar) {
        this.f363358a = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.b3 b3Var = (rh.b3) obj;
        qh.u uVar = this.f363358a;
        uVar.c("batt_temp_sampling");
        uVar.g(b3Var.f395311c + "(mls)\t" + b3Var.f395309a + "(itv)");
        uVar.h("max", java.lang.String.valueOf(b3Var.f395314f));
        uVar.h("min", java.lang.String.valueOf(b3Var.f395315g));
        uVar.h("avg", java.lang.String.valueOf(b3Var.f395316h));
        uVar.h("cnt", java.lang.String.valueOf(b3Var.f395310b));
    }
}
