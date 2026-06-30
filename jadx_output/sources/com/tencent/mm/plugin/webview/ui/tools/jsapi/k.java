package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h1 f185215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f185216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.g14 f185217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.r f185218g;

    public k(com.tencent.mm.plugin.webview.ui.tools.jsapi.r rVar, com.tencent.mm.plugin.webview.model.h1 h1Var, int i17, r45.g14 g14Var) {
        this.f185218g = rVar;
        this.f185215d = h1Var;
        this.f185216e = i17;
        this.f185217f = g14Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.JSVerifyHelper", "showDlgForJSVerify click ok");
        this.f185218g.a(this.f185215d, this.f185216e, this.f185217f);
    }
}
