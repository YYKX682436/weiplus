package dy4;

/* loaded from: classes15.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f244700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f244701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(dy4.f1 f1Var, sf.f fVar, java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f244699d = f1Var;
        this.f244700e = fVar;
        this.f244701f = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.n23 n23Var = (r45.n23) obj;
        dy4.f1 f1Var = this.f244699d;
        f1Var.C = n23Var;
        java.lang.String string = n23Var != null ? n23Var.getString(2) : null;
        boolean z17 = false;
        boolean z18 = string == null || string.length() == 0;
        sf.f fVar = this.f244700e;
        if (z18) {
            com.tencent.mars.xlog.Log.e(f1Var.x(), "insertVideo getFinderVideoInfo callback url empty");
            fVar.g("fail");
        } else if (((sf.f) this.f244701f.get()) == null) {
            com.tencent.mars.xlog.Log.w(f1Var.x(), "insertVideo getFinderVideoInfo callback context invalid");
        } else {
            ye1.e eVar = f1Var.f244627n;
            if ((eVar instanceof com.tencent.mm.plugin.appbrand.video.player.thumb.v) && n23Var != null) {
                try {
                    com.tencent.mm.plugin.appbrand.video.player.thumb.v vVar = eVar instanceof com.tencent.mm.plugin.appbrand.video.player.thumb.v ? (com.tencent.mm.plugin.appbrand.video.player.thumb.v) eVar : null;
                    if (vVar != null) {
                        vVar.H(n23Var);
                    }
                    z17 = true;
                } catch (java.lang.IllegalStateException e17) {
                    com.tencent.mars.xlog.Log.w(f1Var.x(), "setFinderVideoInfoForMp illegal state: " + e17.getMessage());
                }
            }
            if (z17) {
                f1Var.B();
            }
            com.tencent.mars.xlog.Log.i(f1Var.x(), "insertVideo getFinderVideoInfo callback handleRet: " + z17);
            fVar.g(z17 ? "ok" : "fail");
            f1Var.t(fVar);
        }
        return jz5.f0.f302826a;
    }
}
