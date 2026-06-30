package fe2;

/* loaded from: classes3.dex */
public final class j implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.q f261518d;

    public j(fe2.q qVar) {
        this.f261518d = qVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.qm1 qm1Var = (r45.qm1) obj;
        fe2.q qVar = this.f261518d;
        if (qm1Var != null) {
            boolean z17 = false;
            if (qm1Var.getInteger(0) != 0) {
                if (qm1Var.getInteger(0) == 1) {
                    com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "liveDataLog ".concat("curBoxObserver switchToBox"));
                    oa.i k17 = qVar.f261528s.k(1);
                    java.lang.Object obj2 = k17 != null ? k17.f343778a : null;
                    he2.e eVar = obj2 instanceof he2.e ? (he2.e) obj2 : null;
                    if (eVar != null) {
                        android.widget.ImageView imageView = eVar.f280890d;
                        if (imageView != null && imageView.getVisibility() == 0) {
                            z17 = true;
                        }
                    }
                    qVar.E1(1);
                    com.tencent.mm.plugin.finder.live.plugin.tb tbVar = (com.tencent.mm.plugin.finder.live.plugin.tb) qVar.X0(com.tencent.mm.plugin.finder.live.plugin.tb.class);
                    if (tbVar == null) {
                        return;
                    }
                    java.lang.String str = "status FINDER_LIVE_SWITCH_BOX true, hasReddot:" + z17;
                    kotlin.jvm.internal.o.g(str, "str");
                    com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "mainFlowLog ".concat(str));
                    qo0.b bVar = qo0.b.f365375k5;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("isShow", true);
                    qVar.f261526q.statusChange(bVar, bundle);
                    com.tencent.mars.xlog.Log.i("FinderLiveBoxCommentPlugin", "resumeBoxComment " + tbVar.hashCode() + " id:" + tbVar.f114369q);
                    android.view.ViewTreeObserver viewTreeObserver = tbVar.t1().getViewTreeObserver();
                    jz5.g gVar = tbVar.f114372t;
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener((android.view.ViewTreeObserver.OnGlobalLayoutListener) ((jz5.n) gVar).getValue());
                    }
                    android.view.ViewTreeObserver viewTreeObserver2 = tbVar.t1().getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.addOnGlobalLayoutListener((android.view.ViewTreeObserver.OnGlobalLayoutListener) ((jz5.n) gVar).getValue());
                    }
                    com.tencent.mm.view.recyclerview.WxRecyclerView t17 = tbVar.t1();
                    jz5.g gVar2 = tbVar.f114373u;
                    t17.V0((com.tencent.mm.plugin.finder.live.plugin.rb) ((jz5.n) gVar2).getValue());
                    tbVar.t1().i((com.tencent.mm.plugin.finder.live.plugin.rb) ((jz5.n) gVar2).getValue());
                    tbVar.z1(true);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "liveDataLog ".concat("curBoxObserver switchToPublic"));
        qVar.F1();
    }
}
