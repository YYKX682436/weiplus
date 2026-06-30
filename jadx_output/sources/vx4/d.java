package vx4;

/* loaded from: classes8.dex */
public class d extends jk3.v {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public boolean B;
    public final r45.k97 C;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI f441317x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f441318y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f441319z;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hashSet.add("webpageTitle");
        hashSet.add("hide_option_menu");
        hashSet.add("translate_webview");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
        hashSet.add("KOpenArticleSceneFromScene");
        hashSet.add(com.tencent.mm.ui.w2.f211194g);
        hashSet.add("pay_channel");
        hashSet.add("key_download_restrict");
        hashSet.add("key_wallet_region");
        hashSet.add("key_function_id");
        hashSet.add(com.tencent.mm.ui.w2.f211197j);
        hashSet.add("geta8key_scene");
        hashSet.add("ad_ux_info_for_jsapi_pay");
        hashSet.add("key_menu_hide_expose");
        hashSet.add("webviewCurrentProcess");
    }

    public d(ak3.c cVar, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        super(cVar);
        this.f441318y = true;
        this.f441319z = false;
        this.A = false;
        this.f441317x = webViewUI;
        r45.k97 k97Var = new r45.k97();
        this.C = k97Var;
        if (cVar.getIntent() != null) {
            ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ui(cVar.getIntent().getExtras(), k97Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "createWebMultiTaskHelper, WebViewUI:%s", java.lang.Integer.valueOf(webViewUI.hashCode()));
    }

    @Override // jk3.b
    public void A() {
        super.A();
        this.A = false;
    }

    @Override // jk3.b
    public void B(boolean z17) {
        j();
        super.B(z17);
    }

    @Override // jk3.v, jk3.b
    public void C(boolean z17, int i17) {
        j();
        super.C(z17, i17);
    }

    @Override // jk3.b
    public boolean G() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitask_taskbar_disable_webview_capture_on_close, 0) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "shouldCaptureOnClose:%b", java.lang.Boolean.valueOf(!z17));
        return !z17;
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        j();
        if (!this.f441319z) {
            this.f441318y = false;
        }
        return super.U(i17, this.f441318y);
    }

    public void c0() {
        dk3.f fVar = this.f300115h;
        if (fVar != null) {
            dk3.e eVar = (dk3.e) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "stop FloatIndicatorController");
            com.tencent.mm.sdk.platformtools.u3.h(new dk3.b(eVar));
            eVar.f234450b.h(null);
        }
    }

    @Override // jk3.b, jk3.e
    public void g(android.graphics.Bitmap bitmap) {
        if (this.B) {
            super.g(bitmap);
        }
    }

    @Override // jk3.b, jk3.e
    public java.lang.Boolean i() {
        return java.lang.Boolean.FALSE;
    }

    @Override // jk3.b, jk3.e
    public void j() {
        r45.k97 k97Var = this.C;
        try {
            r45.kr4 kr4Var = this.f300079c;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f441317x;
            if (kr4Var != null) {
                kr4Var.set(4, webViewUI.F7());
            }
            k97Var.set(1, webViewUI.F7());
            com.tencent.mm.plugin.webview.ui.tools.jd w76 = webViewUI.w7();
            if (w76 != null) {
                this.f300077a.v0().set(1, w76.f184874d);
                this.f300077a.v0().set(5, w76.f184873c);
                this.f300077a.v0().set(10, w76.f184871a);
                java.lang.String string = this.f300077a.v0().getString(0);
                if (android.text.TextUtils.isEmpty(string)) {
                    string = w76.f184872b;
                }
                this.f300077a.v0().set(0, string);
                k97Var.set(28, w76.f184875e);
                int i17 = w76.f184877g;
                if (i17 == 16) {
                    k97Var.set(19, java.lang.Integer.valueOf(i17));
                    android.net.Uri parse = android.net.Uri.parse(k97Var.getString(1));
                    android.net.Uri.Builder buildUpon = parse.buildUpon();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(parse.getQueryParameter("item_show_type"))) {
                        buildUpon.appendQueryParameter("item_show_type", "16");
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID))) {
                        buildUpon.appendQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID, w76.f184879i);
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebMultiTaskHelper", "fillMultiTaskInfo  rawUrl:%s,  vid:%s", webViewUI.F7(), w76.f184879i);
                    k97Var.set(1, buildUpon.build().toString());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "fillMultiTaskInfo  webMultiTaskData.rawUrl:" + k97Var.getString(1) + "   itemShowType:" + w76.f184877g);
            }
            java.lang.String string2 = this.f300077a.v0().getString(1);
            if (android.text.TextUtils.isEmpty(string2)) {
                string2 = webViewUI.getIntent().getStringExtra("webpageTitle");
            }
            if (android.text.TextUtils.isEmpty(string2)) {
                string2 = webViewUI.f183815f.getTitle();
            }
            this.f300077a.v0().set(1, string2);
            this.f300077a.field_data = k97Var.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebMultiTaskHelper", e17, "onMenuMultiTaskSelected", new java.lang.Object[0]);
        }
    }

    @Override // jk3.b
    public void m(android.graphics.Bitmap bitmap) {
        if (this.B) {
            super.m(bitmap);
        }
    }

    @Override // jk3.b
    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo o() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        if (multiTaskInfo == null || multiTaskInfo.field_data == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        this.f300077a.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo createFromParcel = com.tencent.mm.plugin.multitask.model.MultiTaskInfo.CREATOR.createFromParcel(obtain);
        createFromParcel.field_id = com.tencent.mm.plugin.multitask.s0.d(((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).wi(this.f441317x.F7()));
        return createFromParcel;
    }

    @Override // jk3.b
    public void r(android.graphics.Bitmap bitmap, boolean z17) {
        if (this.f441317x.w7() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "not MP page");
        } else if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "ended, remove historyTaskInfo");
            D();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "not ended update historyTaskInfo");
            H(bitmap, true);
        }
    }

    @Override // jk3.b
    public boolean w() {
        return true;
    }

    @Override // jk3.b
    public boolean x() {
        return this.f441317x.m8() && this.f300111d.g();
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        java.lang.String a17;
        this.B = true;
        super.y(i17, str);
        if (a()) {
            return;
        }
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f441317x;
        if (((yq1.z) a0Var).o(webViewUI.F7())) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
            try {
                android.net.Uri parse = android.net.Uri.parse(webViewUI.F7());
                long V = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("mid"), 0L);
                int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("idx"), 0);
                a17 = com.tencent.mm.sdk.platformtools.w2.a("" + com.tencent.mm.sdk.platformtools.t8.V(new java.lang.String(android.util.Base64.decode(parse.getQueryParameter("__biz"), 2)), 0L) + V + P);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebMultiTaskHelper", "getUrlKey e:" + e17);
                a17 = com.tencent.mm.sdk.platformtools.w2.a(webViewUI.F7());
            }
            multiTaskInfo.field_id = a17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskHelper", "isMpArticle, url: %s", webViewUI.F7());
        }
    }

    @Override // jk3.b
    public void z() {
        super.z();
        if (this.A) {
            return;
        }
        this.A = true;
    }
}
