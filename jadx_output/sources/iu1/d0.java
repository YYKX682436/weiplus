package iu1;

/* loaded from: classes9.dex */
public final class d0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294853d;

    public d0(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294853d = cardHomePageNewUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(itemId);
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294853d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "click item: %s, sortType: %s", valueOf, java.lang.Integer.valueOf(cardHomePageNewUI.E));
        java.lang.Object obj = cardHomePageNewUI.F.get(itemId);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.qu quVar = (r45.qu) obj;
        cardHomePageNewUI.f95188q = quVar.f384260e;
        int i18 = quVar.f384259d;
        if (i18 == 1 && cardHomePageNewUI.E != 1) {
            if (!cardHomePageNewUI.f95214f) {
                db5.e1.C(cardHomePageNewUI.getContext(), cardHomePageNewUI.getString(com.tencent.mm.R.string.at7), cardHomePageNewUI.getString(com.tencent.mm.R.string.hht), cardHomePageNewUI.getString(com.tencent.mm.R.string.g6z), cardHomePageNewUI.getString(com.tencent.mm.R.string.baz), false, new iu1.c0(cardHomePageNewUI), null);
                return;
            }
            cardHomePageNewUI.K = true;
            cardHomePageNewUI.f95187p = 0;
            cardHomePageNewUI.E = 1;
            cardHomePageNewUI.Y6();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 15);
            return;
        }
        if (i18 == 2 && cardHomePageNewUI.E != 2) {
            cardHomePageNewUI.K = true;
            cardHomePageNewUI.f95187p = 0;
            cardHomePageNewUI.E = 2;
            cardHomePageNewUI.Y6();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 16);
            return;
        }
        if (i18 != 3 || cardHomePageNewUI.E == 3) {
            return;
        }
        cardHomePageNewUI.K = true;
        cardHomePageNewUI.f95187p = 0;
        cardHomePageNewUI.E = 3;
        cardHomePageNewUI.Y6();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 17);
    }
}
