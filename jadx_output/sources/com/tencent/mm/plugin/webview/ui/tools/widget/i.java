package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class i implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.j f187255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f187256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f187257f;

    public i(com.tencent.mm.plugin.webview.ui.tools.widget.j jVar, com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar) {
        this.f187255d = jVar;
        this.f187256e = pBool;
        this.f187257f = zVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f187255d.f187335d);
        com.tencent.mm.pointers.PBool pBool = this.f187256e;
        com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm, onDismiss %d, %b", valueOf, java.lang.Boolean.valueOf(pBool.value));
        if (pBool.value) {
            return;
        }
        this.f187257f.a();
    }
}
