package ze5;

/* loaded from: classes.dex */
public final class n1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472105e;

    public n1(java.lang.String str, yb5.d dVar) {
        this.f472104d = str;
        this.f472105e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f472104d;
        intent.putExtra("rawUrl", str);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(this.f472105e.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17509, 1, str);
    }
}
