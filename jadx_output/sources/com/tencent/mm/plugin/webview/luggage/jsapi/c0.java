package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class c0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.g0 f182278d;

    public c0(com.tencent.mm.plugin.webview.luggage.jsapi.g0 g0Var) {
        this.f182278d = g0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.webview.luggage.jsapi.g0 g0Var = this.f182278d;
        contextMenu.add(0, 1, 0, g0Var.f182314f.getString(com.tencent.mm.R.string.f490407u4));
        contextMenu.add(0, 2, 1, g0Var.f182314f.getString(com.tencent.mm.R.string.f490415uc));
    }
}
