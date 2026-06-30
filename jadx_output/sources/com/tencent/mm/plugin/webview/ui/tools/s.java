package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes7.dex */
public class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u f186826e;

    public s(com.tencent.mm.plugin.webview.ui.tools.u uVar, java.lang.String str) {
        this.f186826e = uVar;
        this.f186825d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.u uVar = this.f186826e;
        java.util.HashMap hashMap = (java.util.HashMap) uVar.f186916c;
        java.lang.String str = this.f186825d;
        java.util.List list = (java.util.List) hashMap.get(str);
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, continue selected, list should not be null");
            return;
        }
        ((java.util.HashMap) uVar.f186917d).put(str, java.lang.Boolean.FALSE);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, continue selected, list size = %d", java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.xweb.l0) it.next()).cancel();
        }
        list.clear();
        uVar.f186915b.clearSslPreferences();
        new com.tencent.mm.plugin.webview.modeltools.h().c((android.app.Activity) uVar.f186914a, str);
    }
}
