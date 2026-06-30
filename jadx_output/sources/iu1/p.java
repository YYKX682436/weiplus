package iu1;

/* loaded from: classes9.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294932b;

    public p(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI, java.lang.String str) {
        this.f294931a = cardHomePageNewUI;
        this.f294932b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294931a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.ic3 ic3Var = (r45.ic3) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "retCode: %s, refresh: %s", java.lang.Integer.valueOf(ic3Var.f376926d), java.lang.Integer.valueOf(ic3Var.f376929g));
            if (ic3Var.f376926d != 0) {
                lu1.a0.r(cardHomePageNewUI, ic3Var.f376927e);
            } else if (ic3Var.f376929g == 1) {
                cardHomePageNewUI.K = true;
                cardHomePageNewUI.f95187p = 0;
                cardHomePageNewUI.Y6();
            } else {
                int i18 = cardHomePageNewUI.C;
                java.lang.String str = this.f294932b;
                if (i18 != 0) {
                    iu1.c cVar = cardHomePageNewUI.f95184m;
                    if (cVar == null) {
                        kotlin.jvm.internal.o.o("mHomePageAdapter");
                        throw null;
                    }
                    r45.wt card_pkg_mch_info = ic3Var.f376928f;
                    kotlin.jvm.internal.o.f(card_pkg_mch_info, "card_pkg_mch_info");
                    cVar.B(str, card_pkg_mch_info);
                } else if (ic3Var.f376928f.f389436p.size() == 0) {
                    iu1.c cVar2 = cardHomePageNewUI.f95184m;
                    if (cVar2 == null) {
                        kotlin.jvm.internal.o.o("mHomePageAdapter");
                        throw null;
                    }
                    cVar2.z(str);
                } else {
                    iu1.c cVar3 = cardHomePageNewUI.f95184m;
                    if (cVar3 == null) {
                        kotlin.jvm.internal.o.o("mHomePageAdapter");
                        throw null;
                    }
                    r45.wt card_pkg_mch_info2 = ic3Var.f376928f;
                    kotlin.jvm.internal.o.f(card_pkg_mch_info2, "card_pkg_mch_info");
                    cVar3.B(str, card_pkg_mch_info2);
                }
            }
        } else {
            lu1.a0.q(cardHomePageNewUI, "");
        }
        cardHomePageNewUI.C = -1;
        return jz5.f0.f302826a;
    }
}
