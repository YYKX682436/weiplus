package com.tencent.mm.ui.chatting.manager;

/* loaded from: classes.dex */
public final class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201978e;

    public q(java.lang.String str, android.content.Context context) {
        this.f201977d = str;
        this.f201978e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f201977d;
        intent.putExtra("rawUrl", str);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(this.f201978e, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17509, 1, str);
    }
}
