package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public abstract class PreLoadWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI implements qx4.b {
    public static final /* synthetic */ int Q3 = 0;
    public boolean A3;
    public java.lang.String B3;
    public java.lang.String C3;
    public nw4.p2 D3;
    public qx4.d0 E3;
    public java.util.List F3;
    public boolean G3;
    public com.tencent.mm.plugin.webview.ui.tools.fts.l4 J3;
    public int H3 = 0;
    public java.lang.String I3 = null;
    public boolean K3 = false;
    public boolean L3 = false;
    public boolean M3 = false;
    public final aw4.u N3 = new aw4.u(0);
    public final com.tencent.mm.plugin.webview.core.i3 O3 = new com.tencent.mm.plugin.webview.ui.tools.fts.i4(this);
    public final java.util.concurrent.atomic.AtomicBoolean P3 = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public nw4.p2 B7() {
        return this.D3;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean N7() {
        return !q9().isEmpty();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void R7(int i17, android.os.Bundle bundle) {
        if (i17 == 162) {
            java.lang.String string = bundle.getString("bizKey");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                return;
            }
            com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a.a(string, this.L1, this.E3);
            this.I3 = string;
            return;
        }
        if (i17 != 163) {
            return;
        }
        java.lang.String string2 = bundle.getString("bizKey");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a.c(string2);
        this.I3 = null;
    }

    @Override // qx4.b
    public void Y1() {
        if (this.A3) {
            m9();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void Y7() {
        int intExtra = getIntent().getIntExtra("webview_bg_color_rsID", -1);
        if (intExtra == -1 || getContentView() == null) {
            this.f183815f.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aac));
            return;
        }
        setBackGroundColorResource(intExtra);
        getContentView().setBackgroundResource(intExtra);
        this.f183815f.setBackgroundColor(0);
        this.f183865w.setBackgroundResource(android.R.color.transparent);
        this.f183867x.setBackgroundResource(android.R.color.transparent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        r4 = r1.getUrl();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.ui.widget.MMWebView d7() {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI.d7():com.tencent.mm.ui.widget.MMWebView");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public com.tencent.mm.plugin.webview.core.e3 e7() {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        java.lang.String q96 = q9();
        if (q96.isEmpty()) {
            e3Var = null;
        } else {
            e3Var = com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a.b(q96);
            if (e3Var != null) {
                this.M1 = true;
            }
        }
        if (e3Var == null) {
            e3Var = super.e7();
        }
        e3Var.D(new com.tencent.mm.plugin.webview.ui.tools.fts.j4(this));
        e3Var.E(this.O3);
        return e3Var;
    }

    @Override // av4.j
    public com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView getWebView() {
        return (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) this.f183815f;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean i9() {
        return false;
    }

    public void m9() {
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean n8() {
        return this.A3;
    }

    public java.util.Map n9() {
        java.util.Map w96 = w9();
        java.util.Map t96 = t9();
        if (t96 != null) {
            ((java.util.HashMap) w96).putAll(t96);
        }
        if (this.A3) {
            ((java.util.HashMap) w96).put("isPreload", "1");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PreLoadWebViewUI", "buildOnUiInitParams %s", w96.toString());
        return w96;
    }

    public void o9(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            p9(runnable);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.fts.k4(this, runnable));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ui(this);
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.B3 = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("subSessionId");
        java.lang.String str = this.B3;
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        this.C3 = stringExtra2;
        this.G3 = getIntent().getBooleanExtra("key_back_and_clear_query", false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B3)) {
            try {
                o13.p.f342250c = java.lang.Long.parseLong(this.B3);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PreLoadWebViewUI", "set FTSReportApiLogic.FTSSessionId = %s", this.B3);
            } catch (java.lang.NumberFormatException unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.PreLoadWebViewUI", "Failed to parse sessionId: %s", this.B3);
            }
        }
        if (this.K3) {
            return;
        }
        this.E3.n(n9());
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.lang.String q96 = q9();
        if (this.P3.get() && !q96.isEmpty()) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
            if (mMWebView == null || mMWebView.getParent() == null || this.f183815f.getActivityContextIfHas() != this) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(this.f183815f == null);
                com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.PreLoadWebViewUI", "wv has no parent, %b", objArr);
            } else {
                if (this.E1.c()) {
                    this.E1.a(true);
                }
                this.f183815f.onHide();
                ((android.view.ViewGroup) this.f183815f.getParent()).removeView(this.f183815f);
                this.f183815f.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            nw4.n nVar = this.f183844p0;
            if (nVar != null) {
                nVar.z0(true);
            }
            com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a.a(q96, this.L1, this.E3);
        }
        this.L1.M0(this.O3);
        qx4.d0 d0Var = this.E3;
        if (d0Var != null) {
            nw4.n nVar2 = d0Var.f367394c;
            if (nVar2 != null) {
                nVar2.f340889c = null;
            }
            d0Var.f367401j = null;
            d0Var.f367402k = null;
            d0Var.f14326a = null;
        }
        super.onDestroy();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
        super.onPointerCaptureChanged(z17);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        if (this.K3) {
            yg0.o3 o3Var = (yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class));
            o3Var.getClass();
            int a17 = o3Var.f462231e.a();
            int hashCode = hashCode();
            java.lang.String content = "into activityContainerReady, hashcode: " + hashCode;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
            if (a17 != hashCode) {
                java.lang.String content2 = "activityContainerReady, activity hashcode is not correct, current:" + a17 + ", new hashcode:" + hashCode;
                kotlin.jvm.internal.o.g(content2, "content");
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content2);
                o3Var.Ui(this);
            }
            ch0.z b17 = o3Var.f462231e.b();
            if (b17 != null && b17.f41268h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "activityContainerReady, has called, just quit");
            } else {
                if (b17 != null) {
                    b17.f41268h = true;
                }
                java.lang.String stringExtra = getIntent().getStringExtra("kPreRequestId");
                java.lang.String str3 = "";
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.lang.String stringExtra2 = getIntent().getStringExtra("kPreResponseJson");
                java.lang.String str4 = stringExtra2 == null ? "" : stringExtra2;
                java.lang.String stringExtra3 = getIntent().getStringExtra("kPreRequestParentSearchId");
                java.lang.String str5 = stringExtra3 == null ? "" : stringExtra3;
                int intExtra = getIntent().getIntExtra("ftsType", 0);
                java.lang.String stringExtra4 = getIntent().getStringExtra("ftsQuery");
                java.lang.String str6 = stringExtra4 == null ? "" : stringExtra4;
                boolean booleanExtra = getIntent().getBooleanExtra("kH5RenderPageInPreRequest", false);
                java.lang.String stringExtra5 = getIntent().getStringExtra("kPreSearchId");
                java.lang.String str7 = stringExtra5 == null ? "" : stringExtra5;
                if ((!r26.n0.N(stringExtra)) && (!r26.n0.N(str4)) && (!r26.n0.N(str5))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "activityContainerReady, start report 4 for pre request data");
                    java.lang.String str8 = str6;
                    java.lang.String str9 = str5;
                    java.lang.String str10 = str4;
                    su4.k2.d(b17 != null ? b17.f41262b : 0, b17 != null ? b17.f41264d : null, b17 != null ? b17.f41264d : null, str7, 0, true, stringExtra, str8, intExtra);
                    o3Var.f462230d.f(stringExtra);
                    if (booleanExtra) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "activityContainerReady, start process pre request data");
                        jz5.l[] lVarArr = new jz5.l[10];
                        str = str8;
                        lVarArr[0] = new jz5.l("query", str);
                        lVarArr[1] = new jz5.l("resultJson", str10);
                        lVarArr[2] = new jz5.l("businessType", java.lang.String.valueOf(intExtra));
                        lVarArr[3] = new jz5.l("offset", "0");
                        lVarArr[4] = new jz5.l("requestId", stringExtra);
                        lVarArr[5] = new jz5.l("parentSearchId", str9);
                        lVarArr[6] = new jz5.l("mode", "1");
                        lVarArr[7] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(b17 != null ? java.lang.Integer.valueOf(b17.f41262b) : null));
                        if (b17 != null && (str2 = b17.f41264d) != null) {
                            str3 = str2;
                        }
                        lVarArr[8] = new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str3);
                        lVarArr[9] = new jz5.l("time", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                        java.util.Map k17 = kz5.c1.k(lVarArr);
                        ch0.b0 b0Var = o3Var.f462230d;
                        ch0.k c17 = ch0.d0.f41199a.c(-1, o3Var.f462234h, k17);
                        b0Var.getClass();
                        synchronized (b0Var.f41194a) {
                            b0Var.f41194a.f41240b = c17;
                        }
                    } else {
                        str = str8;
                    }
                    z17 = true;
                } else {
                    str = str6;
                    z17 = false;
                }
                ch0.k kVar = o3Var.f462230d.f41194a.f41240b;
                if (kVar != null) {
                    int i17 = kVar.f41232b;
                    tg0.f2 f2Var = tg0.g2.f419073e;
                    if (i17 == 1) {
                        o3Var.fj(kVar);
                    }
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "activityContainerReady, start report 7 for pre request data");
                    su4.k2.e(b17 != null ? b17.f41262b : 0, b17 != null ? b17.f41264d : null, b17 != null ? b17.f41264d : null, str7, 0, true, stringExtra, true, str, intExtra);
                }
            }
        }
        super.onStart();
    }

    public final void p9(java.lang.Runnable runnable) {
        if (s9() != null && s9().f340895i && this.P3.get()) {
            runnable.run();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PreLoadWebViewUI", "jsapi not ready, waiting");
        if (this.F3 == null) {
            this.F3 = new java.util.ArrayList();
        }
        this.F3.add(runnable);
    }

    public final java.lang.String q9() {
        java.lang.String str;
        com.tencent.mm.plugin.webview.ui.tools.floatball.k kVar = com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a;
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_search_minimize_keepalive_count, 0) > 0)) {
            return "";
        }
        java.lang.String str2 = this.I3;
        if (str2 != null && !str2.isEmpty()) {
            return this.I3;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("fts_float_ball_key");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            return stringExtra;
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) getIntent().getParcelableExtra("fts_multi_task_info");
        return (multiTaskInfo == null || (str = multiTaskInfo.field_id) == null || str.isEmpty()) ? "" : multiTaskInfo.field_id;
    }

    public android.view.View r9() {
        return null;
    }

    public nw4.n s9() {
        return this.f183844p0;
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(rx4.n2.class);
        hashSet.add(rx4.t2.class);
    }

    public java.util.Map t9() {
        int b17 = com.tencent.mm.ui.zk.b(getContext(), i65.a.B(getContext()));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("screenWidth", java.lang.Integer.valueOf(b17));
        return hashMap;
    }

    public void u9() {
        this.P3.compareAndSet(false, true);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            try {
                uv4.g g17 = com.tencent.mm.plugin.websearch.l2.g(0);
                if (g17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchUtils", "showTemplateDebugInfo: template is null for type=0");
                } else {
                    java.lang.String l17 = g17.l();
                    int b17 = g17.b();
                    java.lang.String simpleName = g17.getClass().getSimpleName();
                    boolean D = r26.n0.D(l17, "_udr", false, 2, null);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("模板: " + simpleName + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
                    sb6.append("版本: " + b17 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
                    sb6.append("UDR: ".concat(D ? "是" : "否"));
                    java.lang.String sb7 = sb6.toString();
                    kotlin.jvm.internal.o.f(sb7, "toString(...)");
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.f211776c = sb7;
                    e4Var.c();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchUtils", "showTemplateDebugInfo: ".concat(sb7));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchUtils", e17, "showTemplateDebugInfo failed", new java.lang.Object[0]);
            }
        }
        if (this.K3) {
            qx4.d0 d0Var = this.E3;
            if (d0Var != null) {
                d0Var.webViewUIReadyInFlutter("");
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PreLoadWebViewUI", "sendOnUIInit isPreload:%s", java.lang.Boolean.valueOf(this.A3));
        o9(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI.this;
                if (preLoadWebViewUI.A3) {
                    preLoadWebViewUI.m9();
                }
                preLoadWebViewUI.f183844p0.i0("onUiInit", preLoadWebViewUI.n9(), null);
            }
        });
        java.util.List list = this.F3;
        if (list == null || ((java.util.ArrayList) list).isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.F3);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PreLoadWebViewUI", "jsapi ready callback, running jsapi count %d", java.lang.Integer.valueOf(arrayList.size()));
        ((java.util.ArrayList) this.F3).clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Runnable runnable = (java.lang.Runnable) it.next();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void v9() {
    }

    public java.util.Map w9() {
        java.lang.String F7 = F7();
        if (android.text.TextUtils.isEmpty(F7)) {
            return new java.util.HashMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        android.net.Uri parse = android.net.Uri.parse(F7);
        for (java.lang.String str : parse.getQueryParameterNames()) {
            hashMap.put(str, parse.getQueryParameter(str));
        }
        if (this.K3) {
            hashMap.put("isInFlutter", "1");
        }
        return hashMap;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void z8(android.os.Bundle bundle) {
        java.lang.String sb6;
        super.z8(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("forceUseThemeMode");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.equals("forceUseDarkMode")) {
            this.H3 = 1;
        } else if (stringExtra.equals("forceUseLightMode")) {
            this.H3 = 2;
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("rawUrl");
        android.os.Handler handler = uv4.c0.f431425a;
        java.lang.String str = com.tencent.mm.plugin.websearch.l2.f181562a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            sb6 = null;
        } else {
            kotlin.jvm.internal.o.d(str);
            int K = r26.n0.K(str, '?', 0, false, 6, null);
            if (K >= 0) {
                str = str.substring(0, K);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(str);
            sb7.append("?");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                android.net.Uri parse = android.net.Uri.parse(stringExtra2);
                for (java.lang.String str2 : parse.getQueryParameterNames()) {
                    sb7.append(str2);
                    sb7.append("=");
                    sb7.append(android.net.Uri.encode(parse.getQueryParameter(str2)));
                    sb7.append("&");
                }
            }
            sb7.append("__remote__=1");
            sb6 = sb7.toString();
        }
        if (sb6 != null) {
            getIntent().putExtra("rawUrl", sb6);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PreLoadWebViewUI", "onResetBeforeCreate: debug mode, replaced KRawUrl with remote url");
            qx4.l0 l0Var = qx4.l0.f367422a;
            synchronized (qx4.l0.class) {
                pm0.v.X(qx4.h0.f367409d);
            }
        }
    }
}
