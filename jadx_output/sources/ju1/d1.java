package ju1;

/* loaded from: classes9.dex */
public final class d1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301707d;

    public d1(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301707d = historyCardListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI = this.f301707d;
        g4Var.d(1, historyCardListUI.getResources().getColor(com.tencent.mm.R.color.f479482a31), historyCardListUI.getString(com.tencent.mm.R.string.f490367t0));
    }
}
