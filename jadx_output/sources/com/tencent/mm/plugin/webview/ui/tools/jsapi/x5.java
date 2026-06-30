package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class x5 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185534d;

    public x5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185534d = c1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        boolean a17 = gm0.j1.a();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185534d;
        if (a17) {
            contextMenu.add(0, 1, 0, j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.f490407u4));
        }
        contextMenu.add(0, 2, 1, j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.f490415uc));
    }
}
