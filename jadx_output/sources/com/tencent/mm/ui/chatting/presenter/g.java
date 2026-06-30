package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes4.dex */
public class g implements android.view.View.OnCreateContextMenuListener {
    public g(com.tencent.mm.ui.chatting.presenter.i iVar) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 2, 0, view.getContext().getString(com.tencent.mm.R.string.fgq));
    }
}
