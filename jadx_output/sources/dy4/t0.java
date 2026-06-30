package dy4;

/* loaded from: classes15.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244706d;

    public t0(dy4.f1 f1Var) {
        this.f244706d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar;
        dy4.f1 f1Var = this.f244706d;
        if (!f1Var.I) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onMediaPlayerCompletion, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onCompletion");
        if (f1Var.J() && (wVar = f1Var.U) != null) {
            try {
                wVar.a("onVideoEnded", wVar.c());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e(wVar.f244715a, "OnXWebVideoEnded fail", e17);
            }
            wVar.i();
            com.tencent.mm.sdk.platformtools.u3.h(new dy4.v(wVar));
        }
        ye1.e eVar = f1Var.f244627n;
        if (eVar != null) {
            dy4.h1 h1Var = f1Var.X;
            sf.f fVar = f1Var.F;
            h1Var.getClass();
            dy4.g1 g1Var = h1Var.f244664a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(g1Var.f244660p) && g1Var.f244648d > 0) {
                g1Var.f244656l = java.lang.System.currentTimeMillis();
                h1Var.b(fVar, eVar, "onMediaPlayerVideoEnd");
            }
        }
        if (!f1Var.f244621J) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onCompletion, video end playing");
            f1Var.L = true;
        } else {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onCompletion, video loop playing");
            f1Var.f244629p = true;
            f1Var.H(0L);
        }
    }
}
