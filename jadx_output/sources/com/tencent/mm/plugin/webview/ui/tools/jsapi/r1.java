package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class r1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185377d;

    public r1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185377d = c1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185377d;
        contextMenu.add(0, 1, 0, j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.i9c));
        contextMenu.add(0, 2, 1, j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.f492922i94));
    }
}
