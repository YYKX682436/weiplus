package yf2;

/* loaded from: classes3.dex */
public final class i1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f461716d;

    public i1(yf2.m1 m1Var) {
        this.f461716d = m1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.z53 z53Var;
        r45.n73 n73Var = (r45.n73) obj;
        zl2.r4 r4Var = zl2.r4.f473950a;
        yf2.m1 m1Var = this.f461716d;
        if (r4Var.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) m1Var.getStore().business(mm2.g1.class)).f329068f).getValue())) {
            yf2.m1.Z6(m1Var);
        }
        yf2.t tVar = m1Var.f461751p;
        kz5.h0.B(tVar.f461787a, yf2.s.f461780d);
        java.util.Iterator it = ((java.util.ArrayList) tVar.f461787a).iterator();
        while (it.hasNext()) {
            yf2.r rVar = (yf2.r) ((java.lang.ref.WeakReference) it.next()).get();
            if (rVar != null) {
                com.tencent.mm.plugin.finder.live.widget.z60 z60Var = (com.tencent.mm.plugin.finder.live.widget.z60) rVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGameAppInfoChanged: gameName=");
                sb6.append((n73Var == null || (z53Var = (r45.z53) n73Var.getCustom(1)) == null) ? null : z53Var.getString(1));
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", sb6.toString());
                z60Var.s();
            }
        }
        return jz5.f0.f302826a;
    }
}
