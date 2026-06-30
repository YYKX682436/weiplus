package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class n1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlackListUI f129531d;

    public n1(com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI) {
        this.f129531d = finderBlackListUI;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1001, 0, this.f129531d.getString(com.tencent.mm.R.string.bfh));
    }
}
