package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class p6 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f186750d;

    public p6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, java.util.ArrayList arrayList) {
        this.f186750d = arrayList;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        java.util.Iterator it = this.f186750d.iterator();
        while (it.hasNext()) {
            contextMenu.add((java.lang.String) it.next());
        }
    }
}
