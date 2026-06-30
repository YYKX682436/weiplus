package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class pa implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderGridGalleryView f132824d;

    public pa(com.tencent.mm.plugin.finder.view.FinderGridGalleryView finderGridGalleryView) {
        this.f132824d = finderGridGalleryView;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.clear();
        for (int i17 : this.f132824d.f131105e) {
            contextMenu.add(i17);
        }
    }
}
