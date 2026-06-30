package zx4;

/* loaded from: classes8.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f477107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f477110g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f477111h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f477112i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z17, zx4.l0 l0Var, java.lang.String str, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, boolean z18, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(0);
        this.f477107d = z17;
        this.f477108e = l0Var;
        this.f477109f = str;
        this.f477110g = webViewUI;
        this.f477111h = z18;
        this.f477112i = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f477107d) {
            zx4.l0 l0Var = this.f477108e;
            java.lang.String str = this.f477109f;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f477110g;
            boolean z17 = this.f477111h;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f477112i;
            l0Var.getClass();
            if (z17) {
                webViewUI.f183844p0.p("endCapture", new org.json.JSONObject());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            sb6.append(q75.c.d());
            sb6.append("webviewscpic");
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(".png");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", "onPathResolve, tempOutputPath: " + str);
            l0Var.h(webViewUI, sb7);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(str, sb7);
            b17.F = com.tencent.mm.plugin.appbrand.jsapi.audio.k0.CTRL_INDEX;
            b17.f155688z = false;
            com.tencent.mm.protocal.JsapiPermissionWrapper C7 = webViewUI.C7();
            b17.U = C7 != null && C7.d(21) == 10;
            com.tencent.mm.protocal.JsapiPermissionWrapper C72 = webViewUI.C7();
            b17.V = C72 != null && C72.d(com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX) == 10;
            java.lang.String x76 = webViewUI.x7();
            if (x76 == null) {
                x76 = "";
            }
            b17.W = x76;
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.Map map = uICustomParam.f64779h;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ((java.util.HashMap) map).put("plugin_filter", bool);
            ((java.util.HashMap) uICustomParam.f64779h).put("plugin_poi", bool);
            ((java.util.HashMap) uICustomParam.f64779h).put("plugin_tip", bool);
            ((java.util.HashMap) uICustomParam.f64779h).put("plugin_menu", bool);
            b17.f155677o = uICustomParam;
            ut3.m.f431182a.e(webViewUI, 218, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 5);
            webViewUI.J2 = false;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            webViewUI.V7();
        } else {
            if (this.f477111h) {
                this.f477110g.f183844p0.p("endCapture", new org.json.JSONObject());
                this.f477108e.h(this.f477110g, this.f477109f);
            }
            this.f477110g.J2 = false;
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f477112i;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            this.f477110g.V7();
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = this.f477110g;
            db5.t7.i(webViewUI2, webViewUI2.getResources().getString(com.tencent.mm.R.string.n3g), com.tencent.mm.R.raw.icons_filled_done);
        }
        return jz5.f0.f302826a;
    }
}
