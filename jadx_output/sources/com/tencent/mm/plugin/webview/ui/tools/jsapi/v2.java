package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class v2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f185457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f185458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185459c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185463g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185464h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185465i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185466j;

    public v2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, long j17, com.tencent.mm.pluginsdk.model.app.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f185466j = c1Var;
        this.f185457a = j17;
        this.f185458b = mVar;
        this.f185459c = str;
        this.f185460d = str2;
        this.f185461e = str3;
        this.f185462f = str4;
        this.f185463g = str5;
        this.f185464h = str6;
        this.f185465i = str7;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        this.f185466j.getClass();
        if (this.f185457a >= 0) {
            s01.h z07 = r01.q3.Ui().z0(this.f185457a);
            java.lang.Object obj = s01.r.f401927d;
            synchronized (obj) {
                java.lang.String i17 = s01.r.i();
                s01.r.j(z07);
                this.f185466j.Q5(this.f185458b, this.f185459c, this.f185460d, this.f185461e, this.f185462f, this.f185463g, this.f185464h, this.f185465i);
                synchronized (obj) {
                    s01.r.f401924a = i17;
                }
            }
        } else {
            this.f185466j.Q5(this.f185458b, this.f185459c, this.f185460d, this.f185461e, this.f185462f, this.f185463g, this.f185464h, this.f185465i);
        }
        android.content.Context context = this.f185466j.f184975d;
        if (context != null) {
            db5.e1.T(context, j65.q.a(context).getString(com.tencent.mm.R.string.f490940bb2));
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185466j;
        c1Var.i5(c1Var.f184976e, "send_app_msg:ok", null);
    }
}
