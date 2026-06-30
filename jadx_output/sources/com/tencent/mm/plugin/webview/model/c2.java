package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.l2 f182817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182819f;

    public c2(com.tencent.mm.plugin.webview.model.l2 l2Var, java.lang.String str, java.lang.String str2) {
        this.f182817d = l2Var;
        this.f182818e = str;
        this.f182819f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ex4.a aVar;
        com.tencent.mm.plugin.webview.model.l2 l2Var = this.f182817d;
        java.lang.String pageUrl = this.f182818e;
        java.lang.String str = this.f182819f;
        com.tencent.mm.plugin.webview.core.o2 o2Var = (com.tencent.mm.plugin.webview.core.o2) l2Var;
        o2Var.getClass();
        kotlin.jvm.internal.o.g(pageUrl, "pageUrl");
        com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) o2Var.f181901a.get();
        if (e3Var == null || (aVar = e3Var.f181800b1) == null) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) aVar;
        ex4.o oVar = webViewUI.E;
        oVar.getClass();
        if (oVar.f257227c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewSnapshotHelper", "enterSnapshotMode already in snap shot mode now");
            return;
        }
        com.tencent.mm.plugin.webview.model.b6.l(16L);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewSnapshotHelper", "enterSnapshotMode pageUrl=".concat(pageUrl));
        oVar.f257241q = new java.lang.ref.WeakReference(webViewUI);
        if (oVar.f257228d == null) {
            oVar.f257228d = (android.view.ViewGroup) ((android.view.ViewStub) webViewUI.findViewById(com.tencent.mm.R.id.f487582p25)).inflate();
        }
        if (oVar.f257228d != null) {
            oVar.f257229e = webViewUI.findViewById(com.tencent.mm.R.id.n1k);
            oVar.f257230f = (android.widget.FrameLayout) webViewUI.findViewById(com.tencent.mm.R.id.n1j);
            oVar.f257231g = (android.widget.ScrollView) webViewUI.findViewById(com.tencent.mm.R.id.n1e);
            oVar.f257233i = webViewUI.findViewById(com.tencent.mm.R.id.n1f);
            oVar.f257234j = webViewUI.findViewById(com.tencent.mm.R.id.n1i);
            oVar.f257235k = (android.widget.TextView) webViewUI.findViewById(com.tencent.mm.R.id.n1h);
            oVar.f257236l = webViewUI.findViewById(com.tencent.mm.R.id.n1g);
            oVar.f257237m = webViewUI.findViewById(com.tencent.mm.R.id.qwq);
            oVar.f257238n = webViewUI.findViewById(com.tencent.mm.R.id.qwr);
            oVar.f257239o = webViewUI.findViewById(com.tencent.mm.R.id.qwt);
            android.view.View view = oVar.f257236l;
            if (view != null) {
                view.setOnClickListener(ex4.c.f257213d);
            }
            com.tencent.mm.ui.tools.d8.a(oVar.f257234j);
            com.tencent.mm.ui.tools.d8.a(oVar.f257239o);
            fq1.e.f265507a.g(oVar.f257229e, i65.a.b(webViewUI, 8), false, true);
            ex4.f fVar = new ex4.f(oVar);
            android.view.View view2 = oVar.f257234j;
            if (view2 != null) {
                view2.setOnClickListener(new ex4.d(fVar));
            }
            android.view.View view3 = oVar.f257239o;
            if (view3 != null) {
                view3.setOnClickListener(new ex4.e(fVar));
            }
        }
        oVar.f257227c = true;
        webViewUI.getController().D0(8);
        com.tencent.mm.ui.widget.MMWebView mMWebView = webViewUI.f183815f;
        if (mMWebView != null) {
            mMWebView.setVisibility(8);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = webViewUI.getString(com.tencent.mm.R.string.l79);
        }
        android.widget.TextView textView = oVar.f257235k;
        if (textView != null) {
            textView.setText(str);
        }
        com.tencent.mm.ui.widget.MMWebView b17 = al5.l2.b(webViewUI);
        kotlin.jvm.internal.o.d(b17);
        oVar.f257232h = b17;
        b17.setBackgroundColor(0);
        com.tencent.mm.ui.widget.MMWebView mMWebView2 = oVar.f257232h;
        if (mMWebView2 != null) {
            mMWebView2.setWebViewCallbackClient(oVar.f257245u);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = oVar.f257230f;
        if (frameLayout != null) {
            frameLayout.addView(oVar.f257232h, layoutParams);
        }
        android.view.View view4 = oVar.f257233i;
        if (view4 != null) {
            view4.setOnClickListener(new ex4.b(oVar, webViewUI));
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView3 = oVar.f257232h;
        android.widget.ScrollView scrollView = oVar.f257231g;
        kotlin.jvm.internal.o.d(scrollView);
        com.tencent.mm.plugin.webview.core.x3 x3Var = com.tencent.mm.plugin.webview.core.x3.f182012a;
        if (mMWebView3 != null) {
            scrollView.getViewTreeObserver().addOnScrollChangedListener(new com.tencent.mm.plugin.webview.core.w3(scrollView, mMWebView3, mMWebView3.getScale()));
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView4 = oVar.f257232h;
        kotlin.jvm.internal.o.d(mMWebView4);
        com.tencent.mm.plugin.webview.core.e3 e3Var2 = new com.tencent.mm.plugin.webview.core.e3(mMWebView4, null, new zg0.k2(null, false, false, false, false, 0, true, 63, null), kz5.r0.f314002d, null, 18, null);
        oVar.f257240p = e3Var2;
        e3Var2.q0();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", pageUrl);
        oVar.f257242r = true;
        ku5.u0 u0Var = ku5.t0.f312615d;
        ex4.j jVar = new ex4.j(oVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(jVar, 3000L, false);
        com.tencent.mm.plugin.webview.core.e3 e3Var3 = oVar.f257240p;
        if (e3Var3 != null) {
            e3Var3.D(oVar.f257243s);
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var4 = oVar.f257240p;
        if (e3Var4 != null) {
            e3Var4.j(intent);
        }
    }
}
