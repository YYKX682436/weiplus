package ze5;

/* loaded from: classes.dex */
public final class f3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471921e;

    public f3(java.lang.String str, yb5.d dVar) {
        this.f471920d = str;
        this.f471921e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f471920d;
        intent.putExtra("rawUrl", str);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(this.f471921e.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17509, 1, str);
    }
}
