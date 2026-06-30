package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class y implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185544d;

    public y(nw4.k kVar) {
        this.f185544d = kVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        nw4.k kVar = this.f185544d;
        contextMenu.add(0, 1, 0, j65.q.a(kVar.f340860a).getString(com.tencent.mm.R.string.n0r));
        contextMenu.add(0, 2, 1, j65.q.a(kVar.f340860a).getString(com.tencent.mm.R.string.n0y));
    }
}
