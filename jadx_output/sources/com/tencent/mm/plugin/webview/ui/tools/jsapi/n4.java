package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class n4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.JsapiPermissionWrapper f185292h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185293i;

    public n4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, nw4.y2 y2Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        this.f185293i = c1Var;
        this.f185288d = str;
        this.f185289e = str2;
        this.f185290f = str3;
        this.f185291g = y2Var;
        this.f185292h = jsapiPermissionWrapper;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, this.f185288d, 5, this.f185289e, this.f185290f, 3);
        this.f185293i.s5(this.f185291g, this.f185292h);
        dialogInterface.dismiss();
    }
}
