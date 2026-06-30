package com.tencent.mm.plugin.webview.ui.tools;

@gm0.a2
/* loaded from: classes8.dex */
public class WebViewDownloadUI extends com.tencent.mm.ui.MMActivity {
    public static final java.util.List K = new java.util.LinkedList();
    public static final com.tencent.mm.plugin.downloader.model.g1 L = new com.tencent.mm.plugin.webview.ui.tools.l4();
    public android.content.Context A;
    public int B;
    public int C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public int H = 0;
    public final com.tencent.mm.plugin.downloader.model.g1 I = new com.tencent.mm.plugin.webview.ui.tools.m4(this);

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader.model.g1 f183748J = new com.tencent.mm.plugin.webview.ui.tools.n4(this);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f183749d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f183750e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f183751f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f183752g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f183753h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f183754i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f183755m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f183756n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f183757o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f183758p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f183759q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f183760r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f183761s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f183762t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ProgressBar f183763u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.o4 f183764v;

    /* renamed from: w, reason: collision with root package name */
    public long f183765w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f183766x;

    /* renamed from: y, reason: collision with root package name */
    public int f183767y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f183768z;

    public static void T6(com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI webViewDownloadUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17) {
        long b17;
        webViewDownloadUI.getClass();
        com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent gameDownloadReport4WebViewEvent = new com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent();
        am.oe oeVar = gameDownloadReport4WebViewEvent.f54361g;
        oeVar.f7526a = str;
        oeVar.f7527b = str2;
        oeVar.f7529d = str3;
        oeVar.f7528c = str4;
        gameDownloadReport4WebViewEvent.e();
        webViewDownloadUI.X6(1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, str4, 2, str6, str, java.lang.Integer.valueOf(webViewDownloadUI.D));
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        t0Var.f97150a = str;
        t0Var.f97151b = str5;
        t0Var.f97153d = str7;
        t0Var.f97154e = str2;
        t0Var.f97156g = str4;
        t0Var.f97157h = str8;
        t0Var.f97158i = true;
        t0Var.f97155f = webViewDownloadUI.f183767y;
        t0Var.f97166q = str3;
        t0Var.f97161l = i17;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_download_use_mars, 1) == 1;
        int i18 = webViewDownloadUI.C;
        if (i18 == 1 && z17) {
            t0Var.f97171v = i18;
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick, lastDownloadId = %d, downloadId=%d, useMars=%b, downloadType=%d", java.lang.Long.valueOf(webViewDownloadUI.f183765w), java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(webViewDownloadUI.C));
        webViewDownloadUI.f183765w = b17;
        ((java.util.LinkedList) K).add(java.lang.Long.valueOf(b17));
        com.tencent.mm.autogen.events.AddDownloadTaskEvent addDownloadTaskEvent = new com.tencent.mm.autogen.events.AddDownloadTaskEvent();
        am.j jVar = addDownloadTaskEvent.f53970g;
        jVar.f6988c = b17;
        jVar.f6987b = false;
        jVar.f6986a = webViewDownloadUI.B;
        jVar.f6989d = webViewDownloadUI.F;
        addDownloadTaskEvent.e();
        webViewDownloadUI.f183766x = true;
        if (b17 > 0) {
            webViewDownloadUI.Y6(com.tencent.mm.plugin.webview.ui.tools.o4.DOWNLOADING);
        } else {
            dp.a.makeText(webViewDownloadUI.getContext(), webViewDownloadUI.getString(com.tencent.mm.R.string.l5w), 1).show();
            webViewDownloadUI.finish();
        }
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "finishCancel");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_err_code", 2);
        intent.putExtra("key_result_err_msg", "user cancel");
        setResult(-1, intent);
        finish();
    }

    public final void V6(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewDownloadUI", "finishFailed %s", str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_err_code", 3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "download failed";
        }
        intent.putExtra("key_result_err_msg", str);
        setResult(-1, intent);
        finish();
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "finishWithResult %s", java.lang.Boolean.valueOf(this.f183766x));
        if (this.f183766x) {
            finish();
        } else {
            U6();
        }
    }

    public final void X6(int i17) {
        java.lang.String stringExtra = getIntent().getStringExtra("download_app_id");
        com.tencent.mm.autogen.events.DownloadPageActionEvent downloadPageActionEvent = new com.tencent.mm.autogen.events.DownloadPageActionEvent();
        am.g4 g4Var = downloadPageActionEvent.f54094g;
        g4Var.f6737a = i17;
        g4Var.f6738b = stringExtra;
        downloadPageActionEvent.e();
    }

    public final void Y6(com.tencent.mm.plugin.webview.ui.tools.o4 o4Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "setDownloadState old=%s new=%s", this.f183764v, o4Var);
        this.f183764v = o4Var;
        int ordinal = o4Var.ordinal();
        if (ordinal == 0) {
            this.f183749d.setVisibility(0);
            this.f183768z.setVisibility(8);
            this.f183750e.setVisibility(8);
            this.f183751f.setVisibility(0);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        this.f183749d.setVisibility(8);
        this.f183750e.setVisibility(0);
        this.f183768z.setText(getString(com.tencent.mm.R.string.f493660l60, 0));
        this.f183768z.setVisibility(0);
        this.f183751f.setVisibility(4);
    }

    public final void Z6(java.lang.String str) {
        db5.e1.y(this, "", getResources().getString(com.tencent.mm.R.string.f493661l61), getResources().getString(com.tencent.mm.R.string.f490454vi), new com.tencent.mm.plugin.webview.ui.tools.e4(this, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(r45.pf0 r42) {
        /*
            Method dump skipped, instructions count: 1431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.a7(r45.pf0):void");
    }

    public final void b7(boolean z17) {
        this.f183749d.setVisibility(z17 ? 0 : 8);
        this.f183750e.setVisibility(z17 ? 0 : 8);
        this.f183751f.setVisibility(z17 ? 0 : 8);
        this.f183752g.setVisibility(z17 ? 0 : 8);
        this.f183753h.setVisibility(z17 ? 0 : 8);
        this.f183754i.setVisibility(z17 ? 0 : 8);
        this.f183755m.setVisibility(z17 ? 0 : 8);
        this.f183756n.setVisibility(z17 ? 0 : 8);
        this.f183757o.setVisibility(z17 ? 0 : 8);
        this.f183758p.setVisibility(z17 ? 0 : 8);
        this.f183759q.setVisibility(z17 ? 0 : 8);
        this.f183760r.setVisibility(z17 ? 0 : 8);
        android.view.View view = this.f183761s;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI", "updateAllInfoView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI", "updateAllInfoView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f183762t.setVisibility(z17 ? 4 : 8);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9t;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        W6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.A = this;
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.webview.ui.tools.d4(this));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        this.f183749d = (android.widget.Button) findViewById(com.tencent.mm.R.id.d3p);
        this.f183750e = (android.widget.Button) findViewById(com.tencent.mm.R.id.f484116d32);
        this.f183751f = (android.widget.Button) findViewById(com.tencent.mm.R.id.f484114d30);
        this.f183752g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d3o);
        this.f183753h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484126d46);
        this.f183754i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d47);
        this.f183755m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d3_);
        this.f183756n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d3a);
        this.f183757o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d38);
        this.f183758p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d39);
        this.f183761s = findViewById(com.tencent.mm.R.id.d0v);
        this.f183759q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f484122d42);
        this.f183760r = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f484123d43);
        this.f183768z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484124d44);
        this.f183763u = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.imd);
        this.f183762t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a1a);
        int intExtra = getIntent().getIntExtra("from_scene", 0);
        this.D = intExtra;
        if (intExtra == 5) {
            java.lang.String stringExtra = getIntent().getStringExtra("download_app_id");
            this.G = stringExtra;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                Z6("invalid download app id");
            } else {
                java.lang.String downloadAppId = this.G;
                this.f183763u.setVisibility(0);
                b7(false);
                com.tencent.mm.plugin.webview.ui.tools.k4 k4Var = new com.tencent.mm.plugin.webview.ui.tools.k4(this, downloadAppId);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = fw4.h.f267100a;
                kotlin.jvm.internal.o.g(downloadAppId, "downloadAppId");
                r45.je3 je3Var = new r45.je3();
                je3Var.f377743d = downloadAppId;
                je3Var.f377744e = com.tencent.mm.sdk.platformtools.z.f193115k ? 2 : 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.GetDownloadAppInfoManager", "getDownloadAppInfo downloadAppId: " + je3Var.f377743d + ", system_version_type: " + je3Var.f377744e);
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = je3Var;
                lVar.f70665b = new r45.ke3();
                lVar.f70666c = "/cgi-bin/micromsg-bin/get_download_app_info";
                lVar.f70667d = 27841;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                com.tencent.mm.modelbase.m1 e17 = com.tencent.mm.modelbase.z2.e(lVar.a(), new fw4.g(downloadAppId), false, null);
                kotlin.jvm.internal.o.f(e17, "run(...)");
                fw4.h.f267100a.put(java.lang.Integer.valueOf(e17.hashCode()), new fw4.f(e17, k4Var));
                this.H = e17.hashCode();
            }
        } else {
            a7(null);
        }
        X6(-1);
        cy1.a aVar = (cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.WebViewDownloadUI)).ik(this, 12, 32337);
        aVar.dk(this, getClass().getSimpleName());
        aVar.fk(this, "post_session_id", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.widget.TextView textView = this.f183762t;
        if (textView != null) {
            java.lang.CharSequence text = textView.getText();
            if (text instanceof android.text.Spanned) {
                for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : (com.tencent.mm.pluginsdk.ui.span.z0[]) ((android.text.Spanned) text).getSpans(0, text.length(), com.tencent.mm.pluginsdk.ui.span.z0.class)) {
                    z0Var.setSpanClickCallback(null);
                }
            }
        }
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewDownloadUI", "onDestroy hasCallback=%b", java.lang.Boolean.valueOf(this.f183766x));
        if (!this.f183766x) {
            com.tencent.mm.autogen.events.AddDownloadTaskEvent addDownloadTaskEvent = new com.tencent.mm.autogen.events.AddDownloadTaskEvent();
            am.j jVar = addDownloadTaskEvent.f53970g;
            jVar.f6987b = true;
            jVar.f6986a = this.B;
            jVar.f6989d = this.F;
            addDownloadTaskEvent.e();
            this.f183766x = true;
        }
        fw4.f fVar = (fw4.f) fw4.h.f267100a.remove(java.lang.Integer.valueOf(this.H));
        if (fVar != null) {
            gm0.j1.n().f273288b.c(fVar.f267097a.hashCode());
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().s(this.I);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().s(this.f183748J);
    }
}
