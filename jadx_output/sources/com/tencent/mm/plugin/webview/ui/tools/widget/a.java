package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.j f187091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f187092f;

    public a(java.lang.String str, com.tencent.mm.plugin.webview.ui.tools.widget.j jVar, com.tencent.xweb.z zVar) {
        this.f187090d = str;
        this.f187091e = jVar;
        this.f187092f = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CommWebChromeClient", "onJsAlert, onClose");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.widget.j jVar = this.f187091e;
        g0Var.d(11683, this.f187090d, 1, java.lang.Integer.valueOf(jVar.f187335d));
        this.f187092f.a();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        android.app.Activity s17 = jVar.s();
        kotlin.jvm.internal.o.d(s17);
        s17.finish();
    }
}
