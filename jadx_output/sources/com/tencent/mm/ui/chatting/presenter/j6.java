package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes4.dex */
public class j6 implements android.view.View.OnCreateContextMenuListener {
    public j6(com.tencent.mm.ui.chatting.presenter.l6 l6Var) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, view.getContext().getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, 1, 0, view.getContext().getString(com.tencent.mm.R.string.b1o));
        contextMenu.add(0, 2, 0, view.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, 3, 0, view.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
