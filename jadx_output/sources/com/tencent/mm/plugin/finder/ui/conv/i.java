package com.tencent.mm.plugin.finder.ui.conv;

/* loaded from: classes9.dex */
public final class i implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.conv.l f129018d;

    public i(com.tencent.mm.plugin.finder.ui.conv.l lVar) {
        this.f129018d = lVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.finder.ui.conv.l lVar = this.f129018d;
        contextMenu.add(0, 1, 0, lVar.f129022a.getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, 2, 0, lVar.f129022a.getString(com.tencent.mm.R.string.b1o));
        contextMenu.add(0, 3, 0, lVar.f129022a.getString(com.tencent.mm.R.string.f2n));
    }
}
