package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f187238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.j f187239e;

    public h(com.tencent.xweb.z zVar, com.tencent.mm.plugin.webview.ui.tools.widget.j jVar) {
        this.f187238d = zVar;
        this.f187239e = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f187238d.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm cancel %d", java.lang.Integer.valueOf(this.f187239e.f187335d));
    }
}
