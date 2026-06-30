package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rs implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119686d;

    public rs(com.tencent.mm.plugin.finder.live.widget.et etVar) {
        this.f119686d = etVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1000, 0, this.f119686d.f118183e.getResources().getString(com.tencent.mm.R.string.edq));
    }
}
