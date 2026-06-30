package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class a5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.t3 f184911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184914g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.JsapiPermissionWrapper f184915h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184916i;

    public a5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, dm.t3 t3Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        this.f184916i = c1Var;
        this.f184911d = t3Var;
        this.f184912e = str;
        this.f184913f = str2;
        this.f184914g = y2Var;
        this.f184915h = jsapiPermissionWrapper;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, this.f184911d.field_appId, 5, this.f184912e, this.f184913f, 3);
        this.f184916i.O5(this.f184914g, this.f184915h);
        dialogInterface.dismiss();
    }
}
