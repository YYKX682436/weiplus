package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ks implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f118855d;

    public ks(com.tencent.mm.plugin.finder.live.widget.et etVar) {
        this.f118855d = etVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1000, 0, this.f118855d.f118183e.getResources().getString(com.tencent.mm.R.string.edq));
    }
}
