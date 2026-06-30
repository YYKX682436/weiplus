package iu1;

/* loaded from: classes.dex */
public final class h1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294876d;

    public h1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI) {
        this.f294876d = cardTicketListUI;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f294876d.getString(com.tencent.mm.R.string.f490367t0));
    }
}
