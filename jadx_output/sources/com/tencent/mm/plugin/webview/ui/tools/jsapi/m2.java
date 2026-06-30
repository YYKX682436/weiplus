package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class m2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f185268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f185269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185273f;

    public m2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.app.ProgressDialog progressDialog, com.tencent.mm.pluginsdk.model.app.m mVar, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f185273f = c1Var;
        this.f185268a = progressDialog;
        this.f185269b = mVar;
        this.f185270c = str;
        this.f185271d = str2;
        this.f185272e = y2Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        android.app.ProgressDialog progressDialog = this.f185268a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f185273f.Q5(this.f185269b, "", this.f185270c, this.f185271d, null, null, null, null);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185273f;
        nw4.y2 y2Var = this.f185272e;
        c1Var.i5(y2Var, "send_service_app_msg:ok", null);
        c1Var.n5(y2Var);
    }
}
