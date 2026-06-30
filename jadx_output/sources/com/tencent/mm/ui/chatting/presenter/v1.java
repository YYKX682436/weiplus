package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes4.dex */
public class v1 implements android.view.View.OnCreateContextMenuListener {
    public v1(com.tencent.mm.ui.chatting.presenter.x1 x1Var) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 2, 0, view.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, 3, 0, view.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
