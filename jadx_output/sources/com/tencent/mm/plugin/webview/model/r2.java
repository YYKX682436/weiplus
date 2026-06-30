package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class r2 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.y2 f183089d;

    public r2(com.tencent.mm.plugin.webview.model.y2 y2Var) {
        this.f183089d = y2Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f183089d.f183193a.getResources().getString(com.tencent.mm.R.string.h88));
    }
}
