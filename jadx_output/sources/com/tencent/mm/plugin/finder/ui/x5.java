package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class x5 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f130004d;

    public x5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        this.f130004d = finderFansListUI;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1001, 0, this.f130004d.getString(com.tencent.mm.R.string.css));
    }
}
