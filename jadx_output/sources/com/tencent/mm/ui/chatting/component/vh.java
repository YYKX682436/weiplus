package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class vh implements android.view.View.OnCreateContextMenuListener {
    public vh(com.tencent.mm.ui.chatting.component.yh yhVar) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, view.getContext().getString(com.tencent.mm.R.string.i4p));
        contextMenu.add(0, 1, 1, view.getContext().getString(com.tencent.mm.R.string.i4h));
    }
}
