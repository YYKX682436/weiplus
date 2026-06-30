package r35;

/* loaded from: classes8.dex */
public class k4 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f369170d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369171e;

    /* renamed from: f, reason: collision with root package name */
    public w60.k f369172f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f369173g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f369174h = new com.tencent.mm.sdk.platformtools.b4(new r35.j4(this), false);

    public k4(android.content.Context context) {
        this.f369170d = context;
    }

    public void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ViewQZone", "go fail, qqNum is null");
            return;
        }
        this.f369171e = str;
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(46, null);
        java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(72, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ViewQZone", "get a2key:[%s], get new a2key:[%s]", str2, str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            b(str);
            return;
        }
        c01.d9.e().a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
        w60.j jVar = (w60.j) i95.n0.c(w60.j.class);
        int b17 = kk.v.b(str);
        int a17 = o45.cg.a();
        ((v60.u) jVar).getClass();
        this.f369172f = new com.tencent.mm.modelsimple.k0(b17, a17);
        c01.d9.e().g((com.tencent.mm.modelbase.m1) this.f369172f);
        this.f369174h.c(3000L, 3000L);
    }

    public final void b(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f369170d;
        intent.putExtra("rawUrl", context.getString(com.tencent.mm.R.string.bg7, str));
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("neverGetA8Key", true);
        j45.l.j(context, "webview", ".ui.tools.ContactQZoneWebView", intent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        this.f369174h.d();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f369173g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        c01.d9.e().q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ViewQZone", "getA8Key fail, errType = " + i17 + ", errCode = " + i18);
            b(this.f369171e);
            return;
        }
        com.tencent.mm.modelsimple.k0 k0Var = (com.tencent.mm.modelsimple.k0) ((w60.k) m1Var);
        java.lang.String Q = k0Var.Q();
        if (Q == null || Q.length() == 0) {
            b(this.f369171e);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", Q);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("geta8key_session_id", k0Var.O());
        j45.l.j(this.f369170d, "webview", ".ui.tools.ContactQZoneWebView", intent, null);
    }
}
