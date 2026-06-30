package iu1;

/* loaded from: classes.dex */
public final class q0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI f294939d;

    public q0(com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI) {
        this.f294939d = cardInvalidTicketListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI cardInvalidTicketListUI = this.f294939d;
        db5.e1.K(cardInvalidTicketListUI.getContext(), false, cardInvalidTicketListUI.getString(com.tencent.mm.R.string.ata), "", cardInvalidTicketListUI.getString(com.tencent.mm.R.string.f490939bb1), cardInvalidTicketListUI.getString(com.tencent.mm.R.string.baz), new iu1.o0(cardInvalidTicketListUI), iu1.p0.f294933d);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 10);
        return false;
    }
}
