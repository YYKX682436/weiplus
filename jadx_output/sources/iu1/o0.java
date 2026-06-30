package iu1;

/* loaded from: classes.dex */
public final class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI f294929d;

    public o0(com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI) {
        this.f294929d = cardInvalidTicketListUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.f95198v;
        this.f294929d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardInvalidTicketListUI", "do clear invalid ticket list");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 11);
    }
}
