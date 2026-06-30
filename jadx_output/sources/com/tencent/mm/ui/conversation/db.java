package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class db implements android.view.View.OnCreateContextMenuListener {
    public db(com.tencent.mm.ui.conversation.gb gbVar) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, com.tencent.mm.R.string.gqi);
    }
}
