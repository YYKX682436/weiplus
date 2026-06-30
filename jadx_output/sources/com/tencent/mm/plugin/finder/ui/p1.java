package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class p1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI f129615d;

    public p1(com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI) {
        this.f129615d = finderBlockListSearchUI;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            this.f129615d.getClass();
            contextMenu.add(0, 0, 0, com.tencent.mm.R.string.eoj);
        }
    }
}
