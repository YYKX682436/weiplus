package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class pc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f186758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.tc f186759f;

    public pc(com.tencent.mm.plugin.webview.ui.tools.tc tcVar, java.lang.String str, com.tencent.xweb.z zVar) {
        this.f186759f = tcVar;
        this.f186757d = str;
        this.f186758e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsAlert, onClose");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.tc tcVar = this.f186759f;
        g0Var.d(11683, this.f186757d, 1, java.lang.Integer.valueOf(tcVar.f186913c.f183810d2));
        this.f186758e.a();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        tcVar.f186913c.finish();
    }
}
