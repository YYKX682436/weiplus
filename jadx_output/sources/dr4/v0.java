package dr4;

/* loaded from: classes14.dex */
public final class v0 extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242753d;

    public v0(dr4.p1 p1Var) {
        this.f242753d = p1Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onAppBackground: ");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        pq4.c l17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("render in onAppForeground: ");
        dr4.p1 p1Var = this.f242753d;
        sb6.append(p1Var.h());
        sb6.append(" || ");
        sb6.append(p1Var.g());
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", sb6.toString());
        boolean z17 = false;
        if (str != null && r26.n0.B(str, "com.tencent.mm", false)) {
            z17 = true;
        }
        if (!z17 || (l17 = gq4.v.Bi().l("CAMERA")) == null) {
            return;
        }
        l17.b(new dr4.u0(p1Var));
    }
}
