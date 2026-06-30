package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class l3 implements com.tencent.mm.plugin.mv.ui.view.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151269a;

    public l3(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var) {
        this.f151269a = h4Var;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.b
    public void a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageSettle: ");
        sb6.append(i17);
        sb6.append(", last ");
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = this.f151269a;
        sb6.append(h4Var.f151169p);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString());
        if (h4Var.f151169p == i17) {
            return;
        }
        h4Var.V6(i17);
        com.tencent.mm.plugin.mv.ui.uic.h4.O6(h4Var, i17);
        com.tencent.mm.plugin.mv.ui.uic.g3 g3Var = h4Var.f151171r;
        if (g3Var != null) {
            java.lang.Object obj = h4Var.f151161e.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            fm3.q qVar = (fm3.q) obj;
            int i18 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z6 = ((jm3.c0) g3Var).f300300a.Z6();
            if (Z6 != null) {
                Z6.p(false, qVar.f264108f - qVar.f264107e);
            }
        }
    }
}
