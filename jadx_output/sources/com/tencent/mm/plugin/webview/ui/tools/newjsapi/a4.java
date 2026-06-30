package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f185940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185942g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185943h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(java.lang.String str, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, java.lang.String str2, nw4.k kVar) {
        super(1);
        this.f185939d = str;
        this.f185940e = h0Var;
        this.f185941f = webViewUI;
        this.f185942g = str2;
        this.f185943h = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.webview.ui.tools.widget.d7 d7Var;
        java.lang.String sourUserName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(sourUserName, "sourUserName");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "recent forward onClick, sourUserName = ".concat(sourUserName));
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5 k5Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186304d;
        java.lang.String str = this.f185939d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            bitmap = null;
        } else {
            android.graphics.Bitmap j07 = com.tencent.mm.sdk.platformtools.x.j0(str, 140, 140, i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a));
            int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            bitmap = com.tencent.mm.sdk.platformtools.x.w0(j07, orientationInDegree);
        }
        android.graphics.Bitmap bitmap2 = bitmap;
        if (com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186311n && (d7Var = (com.tencent.mm.plugin.webview.ui.tools.widget.d7) this.f185940e.f310123d) != null) {
            d7Var.c();
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.z3 z3Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.z3(sourUserName, this.f185941f, this.f185939d, this.f185942g, this.f185943h);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185941f;
        if (str != null) {
            jd5.a aVar = new jd5.a();
            aVar.p(str);
            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
            n13.t tVar = new n13.t();
            tVar.f334133a = z3Var;
            tVar.f334138f.f334139a = 11;
            ((dk5.y) a0Var).wi(webViewUI, aVar, sourUserName, tVar);
        } else {
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ni(webViewUI, sourUserName, bitmap2, webViewUI.getString(com.tencent.mm.R.string.f490551ya), 3, z3Var).show();
        }
        return jz5.f0.f302826a;
    }
}
