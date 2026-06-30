package ir1;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI f294018d;

    public m(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListUI bizFansBlackListUI) {
        this.f294018d = bizFansBlackListUI;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1001, 0, this.f294018d.getString(com.tencent.mm.R.string.bfh));
    }
}
