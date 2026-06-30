package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class u8 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public int f185443d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f185444e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f185445f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.jsapi.q8 f185446g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f185447h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f185448i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.jsapi.p8 f185449m;

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.p8 p8Var;
        android.content.Context context = (android.content.Context) this.f185448i.get();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.p8 p8Var2 = this.f185449m;
        if (p8Var2 != null && context != null) {
            if (!this.f185444e) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenMapNavigator", "onActivityResult called without msgId attached...");
            } else if (i17 != 33) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenMapNavigator", "onActivityResult, mismatched request_code = %d", java.lang.Integer.valueOf(i17));
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d3) this.f185449m).a(this.f185443d, "fail");
            } else if (i18 == 4097 || i18 == 0) {
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d3) p8Var2).a(this.f185443d, "cancel");
            } else if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("selectpkg");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenMapNavigator", "onActivityResult, get null packageName");
                    ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d3) this.f185449m).a(this.f185443d, "fail");
                } else {
                    (jt.w.GoogleMap.h().equals(stringExtra) ? new com.tencent.mm.plugin.webview.ui.tools.jsapi.o8(null) : jt.w.BaiduMap.h().equals(stringExtra) ? new com.tencent.mm.plugin.webview.ui.tools.jsapi.m8(null) : jt.w.SogouMap.h().equals(stringExtra) ? new com.tencent.mm.plugin.webview.ui.tools.jsapi.s8(null) : jt.w.AutonaviMap.h().equals(stringExtra) ? new com.tencent.mm.plugin.webview.ui.tools.jsapi.n8(null) : new com.tencent.mm.plugin.webview.ui.tools.jsapi.t8(null)).b(context, null, this.f185446g, this.f185447h);
                    ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d3) this.f185449m).a(this.f185443d, "ok");
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenMapNavigator", "onActivityResult, not support result_code = %d", java.lang.Integer.valueOf(i18));
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d3) this.f185449m).a(this.f185443d, "fail");
            }
        }
        if (this.f185444e && (p8Var = this.f185449m) != null) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.g8 g8Var = (com.tencent.mm.plugin.webview.ui.tools.jsapi.g8) ((java.util.HashMap) ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d3) p8Var).f185048a.f185072i.f184986p0).remove(java.lang.Integer.valueOf(this.f185443d));
            if (g8Var != null) {
                g8Var.f185140a = null;
                g8Var.f185141b = null;
            }
        }
        this.f185444e = false;
        this.f185445f = 0;
        this.f185446g = null;
        this.f185448i = null;
        this.f185449m = null;
        this.f185447h = null;
    }
}
