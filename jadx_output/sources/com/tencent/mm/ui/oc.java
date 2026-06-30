package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class oc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm.a f209467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f209468e;

    public oc(tm.a aVar, android.content.Context context) {
        this.f209467d = aVar;
        this.f209468e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f209467d.f420398a);
        sb6.append("&wechat_real_lang=" + com.tencent.mm.sdk.platformtools.m2.d());
        intent.putExtra("rawUrl", sb6.toString());
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(this.f209468e, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
