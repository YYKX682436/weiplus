package pe2;

/* loaded from: classes3.dex */
public final class c implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe2.h f353615d;

    public c(pe2.h hVar) {
        this.f353615d = hVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.j0 j0Var = (mm2.j0) obj;
        pe2.h hVar = this.f353615d;
        jz5.f0 f0Var = null;
        if (j0Var != null) {
            if (j0Var.f329152b) {
                com.tencent.mars.xlog.Log.i("FinderLiveCheerAnimationPlugin", "showCheerAnimation isLandscape: " + hVar.x0() + " data : " + j0Var);
                kotlinx.coroutines.r2 r2Var = hVar.f353631q;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                com.tencent.mm.view.MMPAGView mMPAGView = hVar.f353630p;
                mMPAGView.n();
                mMPAGView.setProgress(0.0d);
                hVar.f353631q = com.tencent.mm.plugin.finder.live.util.y.m(hVar, kotlinx.coroutines.q1.f310570c, null, new pe2.g(hVar, j0Var, null), 2, null);
            } else {
                hVar.t1(true);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            hVar.t1(true);
        }
    }
}
