package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class o2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f185300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f185301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185306g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185307h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f185308i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185309j;

    public o2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.app.ProgressDialog progressDialog, com.tencent.mm.pluginsdk.model.app.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map map) {
        this.f185309j = c1Var;
        this.f185300a = progressDialog;
        this.f185301b = mVar;
        this.f185302c = str;
        this.f185303d = str2;
        this.f185304e = str3;
        this.f185305f = str4;
        this.f185306g = str5;
        this.f185307h = str6;
        this.f185308i = map;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        android.app.ProgressDialog progressDialog = this.f185300a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f185309j.Q5(this.f185301b, this.f185302c, this.f185303d, this.f185304e, this.f185305f, this.f185306g, null, this.f185307h);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185309j;
        android.content.Context context = c1Var.f184975d;
        if (context != null) {
            db5.e1.T(context, j65.q.a(context).getString(com.tencent.mm.R.string.f490548y7));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("send_app_msg sendChatType=");
        java.util.Map map = this.f185308i;
        sb6.append(map.get("sendChatType") == null ? "NULL" : map.get("sendChatType"));
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", sb6.toString());
        c1Var.i5(c1Var.f184976e, "send_app_msg:ok", map);
    }
}
