package ju1;

/* loaded from: classes9.dex */
public final class e1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju1.a f301710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f301711f;

    public e1(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI, ju1.a aVar, int i17) {
        this.f301709d = historyCardListUI;
        this.f301710e = aVar;
        this.f301711f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301709d;
            int i18 = historyCardListUI.f95427p;
            int i19 = 2;
            if (i18 != 2 && i18 == 3) {
                i19 = 1;
            }
            ju1.a aVar = this.f301710e;
            r45.tt ttVar = aVar.f301690c;
            java.lang.String str = ttVar != null ? ttVar.f386765d : null;
            if (str == null) {
                str = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete card, cardIndex: ");
            int i27 = this.f301711f;
            sb6.append(i27);
            sb6.append(", cardID: ");
            sb6.append(str);
            sb6.append(", pageScene: ");
            sb6.append(i19);
            com.tencent.mars.xlog.Log.i("MicroMsg.HistoryCardListUI", sb6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21329, java.lang.Integer.valueOf(i19), 1, str, java.lang.Integer.valueOf(i27));
            ju1.k kVar = historyCardListUI.f95425n;
            if (kVar != null) {
                kVar.P6(aVar);
            } else {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
        }
    }
}
