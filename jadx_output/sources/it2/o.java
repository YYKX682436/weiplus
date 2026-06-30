package it2;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ it2.x f294515d;

    public o(it2.x xVar) {
        this.f294515d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MagicRewardFeatureService", "auto destroy task triggered");
        it2.x xVar = this.f294515d;
        xVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicRewardFeatureService", "destroy");
        jc3.j0 j0Var = xVar.f294530d;
        if (j0Var != null) {
            rc3.w0 w0Var = (rc3.w0) j0Var;
            w0Var.T(new rc3.v0(w0Var, xVar));
            w0Var.destroy();
            xVar.Ni(null);
            xVar.Di(it2.n.f294514d);
        }
    }
}
