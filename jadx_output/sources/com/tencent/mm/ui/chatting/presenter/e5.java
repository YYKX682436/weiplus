package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes.dex */
public final class e5 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.presenter.e5 f202203d = new com.tencent.mm.ui.chatting.presenter.e5();

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, view.getContext().getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, 2, 0, view.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, 3, 0, view.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
