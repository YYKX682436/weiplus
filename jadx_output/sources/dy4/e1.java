package dy4;

/* loaded from: classes15.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(dy4.f1 f1Var) {
        super(1);
        this.f244619d = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.n23 n23Var = (r45.n23) obj;
        dy4.f1 f1Var = this.f244619d;
        java.lang.String x17 = f1Var.x();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFinderFeed getFinderVideoInfo callback, mediaId: ");
        boolean z17 = true;
        sb6.append(n23Var != null ? n23Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i(x17, sb6.toString());
        java.lang.String string = n23Var != null ? n23Var.getString(2) : null;
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e(f1Var.x(), "updateFinderFeed getFinderVideoInfo callback, url empty");
        } else if (n23Var != null) {
            ye1.e eVar = f1Var.f244627n;
            if (eVar instanceof com.tencent.mm.plugin.appbrand.video.player.thumb.v) {
                try {
                    com.tencent.mm.plugin.appbrand.video.player.thumb.v vVar = eVar instanceof com.tencent.mm.plugin.appbrand.video.player.thumb.v ? (com.tencent.mm.plugin.appbrand.video.player.thumb.v) eVar : null;
                    if (vVar != null) {
                        vVar.H(n23Var);
                    }
                    f1Var.B();
                } catch (java.lang.IllegalStateException e17) {
                    com.tencent.mars.xlog.Log.w(f1Var.x(), "setFinderVideoInfoForMp illegal state: " + e17.getMessage());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
