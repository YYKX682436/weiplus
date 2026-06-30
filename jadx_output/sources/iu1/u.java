package iu1;

/* loaded from: classes9.dex */
public final class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu1.a f294957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f294958f;

    public u(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI, iu1.a aVar, int i17) {
        this.f294956d = cardHomePageNewUI;
        this.f294957e = aVar;
        this.f294958f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        iu1.a aVar = this.f294957e;
        r45.wt wtVar = aVar.f294831a;
        kotlin.jvm.internal.o.d(wtVar);
        java.lang.String card_pack_merchant_id = wtVar.f389427d;
        kotlin.jvm.internal.o.f(card_pack_merchant_id, "card_pack_merchant_id");
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294956d;
        cardHomePageNewUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "do delete merchant: %s", card_pack_merchant_id);
        new au1.k(card_pack_merchant_id).l().h(new iu1.n(cardHomePageNewUI, card_pack_merchant_id));
        dialogInterface.dismiss();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        r45.wt wtVar2 = aVar.f294831a;
        kotlin.jvm.internal.o.d(wtVar2);
        g0Var.d(16324, 2, wtVar2.f389427d, 0, 0, 9, java.lang.Integer.valueOf(this.f294958f), java.lang.Integer.valueOf(cardHomePageNewUI.E));
    }
}
