package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class kc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f185618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.tc f185619f;

    public kc(com.tencent.mm.plugin.webview.ui.tools.tc tcVar, java.lang.String str, com.tencent.xweb.z zVar) {
        this.f185619f = tcVar;
        this.f185617d = str;
        this.f185618e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.tc tcVar = this.f185619f;
        g0Var.d(11683, this.f185617d, 1, java.lang.Integer.valueOf(tcVar.f186913c.f183810d2));
        this.f185618e.a();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsConfirm cancel and finish %d", java.lang.Integer.valueOf(tcVar.f186913c.f183810d2));
        tcVar.f186913c.finish();
    }
}
