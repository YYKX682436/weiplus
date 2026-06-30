package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h1 f185239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f185240e;

    public l(com.tencent.mm.plugin.webview.ui.tools.jsapi.r rVar, com.tencent.mm.plugin.webview.model.h1 h1Var, int i17) {
        this.f185239d = h1Var;
        this.f185240e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "showDlgForJSVerify click cancel");
        com.tencent.mm.plugin.webview.model.h1 h1Var = this.f185239d;
        h1Var.f182908f.b(com.tencent.mm.plugin.webview.ui.tools.jsapi.m.RET_REJECT, "cancel", null, this.f185240e, h1Var.H().f376661d.f377491d);
    }
}
