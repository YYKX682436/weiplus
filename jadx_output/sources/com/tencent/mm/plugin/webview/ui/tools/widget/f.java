package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f187204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f187205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.j f187206f;

    public f(com.tencent.mm.pointers.PBool pBool, com.tencent.xweb.z zVar, com.tencent.mm.plugin.webview.ui.tools.widget.j jVar) {
        this.f187204d = pBool;
        this.f187205e = zVar;
        this.f187206f = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f187204d.value = true;
        this.f187205e.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsConfirm confirm %d", java.lang.Integer.valueOf(this.f187206f.f187335d));
    }
}
