package ju1;

/* loaded from: classes9.dex */
public final class g1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI f301720d;

    public g1(com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI historyCardListUI) {
        this.f301720d = historyCardListUI;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f301720d.getString(com.tencent.mm.R.string.f490367t0));
    }
}
