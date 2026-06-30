package cw4;

/* loaded from: classes8.dex */
public final class i1 implements cw4.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.ld f224229a;

    public i1(com.tencent.mm.plugin.webview.ui.tools.ld webViewUIHelper) {
        kotlin.jvm.internal.o.g(webViewUIHelper, "webViewUIHelper");
        this.f224229a = webViewUIHelper;
    }

    @Override // cw4.n
    public void a(cw4.c0 c0Var, cw4.d0 d0Var) {
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f224229a;
        if (ldVar.f185654e == null) {
            return;
        }
        if (ldVar.f185656g.f181743f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUIStyleHelper", "switchTransHelpEntry not show title and ignore");
            return;
        }
        cw4.c0 c0Var2 = cw4.c0.f224203f;
        if (c0Var == c0Var2 && d0Var == cw4.d0.f224206d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "change trans help button Status and Action");
            d0Var = cw4.d0.f224207e;
            c0Var = cw4.c0.f224202e;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "trans help button Action: %s, Status: %s", c0Var.name(), d0Var.name());
        if (ldVar.f185654e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUIStyleHelper", "showTopBar not ready %s", ldVar.f185657h);
        } else if (ldVar.f185664o == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "init transHelpEntryLayout");
            android.view.View inflate = ldVar.f185654e.getLayoutInflater().inflate(com.tencent.mm.R.layout.d_5, (android.view.ViewGroup) null);
            ldVar.f185664o = inflate;
            com.tencent.mm.plugin.webview.ui.tools.ld.p(inflate, ldVar.f185654e.getController());
            ((android.widget.Button) ldVar.f185664o.findViewById(com.tencent.mm.R.id.oin)).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.cd(ldVar));
        }
        android.widget.TextView textView = (android.widget.TextView) ldVar.f185664o.findViewById(com.tencent.mm.R.id.mv8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ldVar.f185664o.findViewById(com.tencent.mm.R.id.mv7);
        if (d0Var == cw4.d0.f224206d) {
            textView.setText(com.tencent.mm.R.string.l6u);
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_translate);
        } else if (d0Var == cw4.d0.f224207e) {
            textView.setText(com.tencent.mm.R.string.l6w);
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_stoptranslate);
        }
        if (c0Var == cw4.c0.f224201d) {
            return;
        }
        if (c0Var == c0Var2) {
            ldVar.f185665p = true;
            if (ldVar.j()) {
                ldVar.g();
            }
            ldVar.f185654e.getController().D0(8);
            ldVar.f185654e.getController().N.setVisibility(8);
            android.view.View view = ldVar.f185664o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (c0Var == cw4.c0.f224202e) {
            ldVar.f185665p = false;
            android.view.View view2 = ldVar.f185664o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ldVar.f185654e.getController().D0(0);
            ldVar.o();
            if (ldVar.j()) {
                ldVar.n();
            }
        }
    }

    @Override // cw4.n
    public void b(java.lang.String str, java.util.Map values) {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        nw4.n g07;
        kotlin.jvm.internal.o.g(values, "values");
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f224229a.f185654e;
        if (webViewUI == null || (e3Var = webViewUI.L1) == null || (g07 = e3Var.g0()) == null) {
            return;
        }
        g07.o(str, values);
    }

    @Override // cw4.n
    public java.lang.Boolean c() {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f224229a.f185654e;
        if (webViewUI == null || (e3Var = webViewUI.L1) == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(e3Var.B0.contains(java.lang.Integer.valueOf(e3Var.f181943n0)));
    }

    @Override // cw4.n
    public void d(cw4.q0 q0Var, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f224229a;
        if (ldVar.f185654e == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "trans tips status is %s, brand:%s", q0Var.name(), str);
        android.view.View findViewById = ldVar.f185654e.findViewById(com.tencent.mm.R.id.qri);
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUIStyleHelper", "setTransTipsBarText fail, tipsView is null");
            return;
        }
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = ldVar.f185656g;
        if (webViewTransHelper.f181743f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUIStyleHelper", "setTransTipsBarText not show transView and ignore");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = ldVar.f185654e;
        com.tencent.mm.plugin.webview.core.e3 e3Var = webViewUI.L1;
        if (e3Var instanceof com.tencent.mm.plugin.webview.core.r0) {
            float f17 = e3Var.f181938l.f358714c;
            if (webViewTransHelper.f181750p) {
                if (findViewById.getParent() instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) findViewById.getParent()).removeView(findViewById);
                }
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ldVar.f185654e.findViewById(com.tencent.mm.R.id.f487707vp2);
                frameLayout.addView(findViewById);
                frameLayout.setPadding(0, java.lang.Float.valueOf(ldVar.f185653d.getMMDensity() * f17).intValue(), 0, 0);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.webview.ui.tools.fd(ldVar, findViewById, f17));
            } else {
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) webViewUI.findViewById(com.tencent.mm.R.id.f487708vp3);
                if ((findViewById.getParent() instanceof android.view.ViewGroup) && findViewById.getParent() != frameLayout2) {
                    ((android.view.ViewGroup) findViewById.getParent()).removeView(findViewById);
                    frameLayout2.addView(findViewById);
                    ldVar.s(f17);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setBackgroundColor(ldVar.d());
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.qqq);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById.findViewById(com.tencent.mm.R.id.qqr);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.qqo);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.qqp);
        int b17 = i65.a.b(ldVar.f185654e, 12);
        fq1.e.f265507a.b(textView2.getParent(), textView2, b17, b17);
        textView2.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.dd(ldVar));
        weImageView.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.ed(ldVar, findViewById, e3Var));
        if (q0Var == cw4.q0.f224269d) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ldVar.f185654e.hideActionbarLine();
        int ordinal = q0Var.ordinal();
        if (ordinal == 1) {
            textView.setText(com.tencent.mm.R.string.f493668l72);
            progressBar.setVisibility(0);
            weImageView.setVisibility(8);
        } else if (ordinal == 2) {
            textView.setText(com.tencent.mm.sdk.platformtools.t8.K0(str) ? ldVar.f185654e.getResources().getString(com.tencent.mm.R.string.f493666l70) : str);
            progressBar.setVisibility(8);
            weImageView.setVisibility(0);
        } else {
            if (ordinal != 3) {
                return;
            }
            textView.setText(ldVar.f185654e.getResources().getString(com.tencent.mm.R.string.f493667l71));
            progressBar.setVisibility(8);
            weImageView.setVisibility(0);
        }
    }

    @Override // cw4.n
    public void e(cw4.n0 action, cw4.o0 scene) {
        java.lang.String str;
        java.lang.String url;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f224229a;
        com.tencent.mm.ui.widget.MMWebView mMWebView = ldVar.f185653d;
        if (mMWebView == null || (url = mMWebView.getUrl()) == null) {
            str = null;
        } else {
            java.util.HashMap hashMap = com.tencent.mm.plugin.webview.webcompt.a.f187737a;
            str = fp.s0.b(url, com.tencent.mapsdk.internal.rv.f51270c);
        }
        boolean j17 = ldVar.j();
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.f(c17, "getActualTranslateLanguageIso(...)");
        java.lang.String str2 = action.ordinal() + ',' + scene.ordinal() + ',' + str + ',' + (j17 ? 1 : 0) + ',' + c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "webTrans reportStr:" + str2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(21129, str2);
    }

    @Override // cw4.n
    public java.lang.Boolean f(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f224229a.f185654e;
        if (webViewUI != null) {
            return java.lang.Boolean.valueOf(webViewUI.isOptionMenuShow(i17));
        }
        return null;
    }

    @Override // cw4.n
    public android.content.Context getContext() {
        return this.f224229a.f185654e.getContext();
    }

    @Override // cw4.n
    public androidx.lifecycle.y getLifecycleOwner() {
        return this.f224229a.f185654e;
    }

    @Override // cw4.n
    public com.tencent.xweb.WebView getWebView() {
        return this.f224229a.f185653d;
    }
}
