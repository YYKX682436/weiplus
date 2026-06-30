package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public final class d0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.d0 f200848d = new com.tencent.mm.ui.chatting.gallery.d0();

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, view.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, 1, 0, view.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
