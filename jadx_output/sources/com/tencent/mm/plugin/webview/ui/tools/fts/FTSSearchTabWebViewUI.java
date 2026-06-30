package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class FTSSearchTabWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: c5, reason: collision with root package name */
    public static final /* synthetic */ int f184321c5 = 0;
    public boolean V4;
    public android.view.View W4;
    public com.tencent.mm.plugin.webview.ui.tools.fts.j3 X4;

    /* renamed from: a5, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f184322a5;
    public int Y4 = 0;
    public android.animation.ObjectAnimator Z4 = null;

    /* renamed from: b5, reason: collision with root package name */
    public boolean f184323b5 = true;

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str, str2, list, oVar);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void E9() {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText = this.F4.getFtsEditText();
        if (ftsEditText != null) {
            ftsEditText.e();
            ftsEditText.getEditText().setEllipsize(null);
            ftsEditText.getEditText().setKeyListener(new android.text.method.TextKeyListener(android.text.method.TextKeyListener.Capitalize.NONE, false));
            if (!ftsEditText.k()) {
                ftsEditText.m();
                showVKB();
            }
            ftsEditText.setHint(ha());
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, tj5.n
    public boolean G0() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.tencent.mm.ui.search.WebSearchView webSearchView = this.F4;
        if (webSearchView != null) {
            webSearchView.getFtsEditText().d();
        }
        int intExtra = getIntent().getIntExtra(com.tencent.mm.ui.w2.f211201n, 0);
        if (intExtra != 0 && (stringArrayListExtra = getIntent().getStringArrayListExtra(com.tencent.mm.ui.w2.f211202o)) != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(intExtra, stringArrayListExtra);
        }
        super.G0();
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void I9() {
        G0();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public java.lang.String K9() {
        return this.F4.getFtsEditText().getTotalQuery();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public int L9() {
        return this.Y4;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public android.graphics.drawable.Drawable M9(int i17) {
        return this.f184255l4 ? getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_wechat_search_one_search) : super.M9(i17);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void R9() {
        ma(8);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public void da(java.lang.String str) {
        if (this.F4.getFtsEditText() != null) {
            this.F4.getFtsEditText().p(str, null, tj5.o.UserInput, false, true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceUIMode() {
        if (this.J4) {
            return 1;
        }
        return super.getForceUIMode();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String ha() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI.ha():java.lang.String");
    }

    public void ma(int i17) {
        android.view.View view = this.W4;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchTabWebViewUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchTabWebViewUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, tj5.y
    public void onClickCancelBtn(android.view.View view) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4);
        java.util.HashMap hashMap = this.f184261s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f184246c4);
        }
        hashMap.put("exittype", "5");
        super.onClickCancelBtn(view);
        finish();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var;
        super.onClickClearTextBtn(view);
        if (!this.V4 || (j3Var = this.X4) == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = j3Var.B;
        n3Var.removeMessages(1);
        n3Var.sendEmptyMessageDelayed(1, 0L);
        j3Var.D = "";
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        boolean z17 = false;
        if (fp.h.c(23)) {
            if (this.J4) {
                Q8(getResources().getColor(com.tencent.mm.R.color.f478512u), false);
            } else {
                Q8(getResources().getColor(com.tencent.mm.R.color.aaw), !com.tencent.mm.ui.bk.C());
            }
        }
        if (this.J4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSearchTabWebViewUI", "isforceShowNightMode.");
            com.tencent.mm.ui.search.WebSearchView webSearchView = this.F4;
            if (webSearchView != null && webSearchView.getFtsEditText() != null) {
                this.F4.getFtsEditText().f209815f.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigVoiceSearchNewStyle()) == 1 && j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigFTSFloatingVoiceSearch()) <= 0 && !com.tencent.mm.ui.bk.U()) {
            z17 = true;
        }
        this.V4 = z17;
        if (z17) {
            com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
            this.f184322a5 = f5Var;
            f5Var.f210400e = this;
            this.W4 = findViewById(com.tencent.mm.R.id.f485075rq1);
            if (com.tencent.mm.ui.bk.C()) {
                this.W4.setBackgroundColor(-13619152);
            } else {
                this.W4.setBackgroundColor(-855310);
            }
            com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var = new com.tencent.mm.plugin.webview.ui.tools.fts.j3(getContext(), new java.lang.ref.WeakReference(this));
            this.X4 = j3Var;
            j3Var.e(getContext(), this.W4);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var;
        z21.e eVar;
        if (this.V4 && (j3Var = this.X4) != null && (eVar = j3Var.A) != null) {
            eVar.cancel(true);
            j3Var.A = null;
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.f184322a5;
        if (f5Var != null) {
            f5Var.d();
            this.f184322a5.f210400e = null;
        }
        ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).hj(this.K4, this.B3, new org.json.JSONObject(this.f184261s4));
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        su4.k3.l();
        com.tencent.mm.ui.tools.f5 f5Var = this.f184322a5;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        if (this.J4 && (mMWebView = this.f183815f) != null) {
            mMWebView.getSettings().B(2);
        }
        super.onResume();
        su4.k3.f412979a.f412966c = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.tools.f5 f5Var = this.f184322a5;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.ui.tools.f5 f5Var = this.f184322a5;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void q8(int i17) {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView == null || mMWebView.getSettings() == null) {
            return;
        }
        getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        float b17 = j65.c.b(getContext());
        if (b17 >= i65.a.v(getContext())) {
            this.f183815f.getSettings().O(140);
            return;
        }
        if (b17 >= i65.a.u(getContext())) {
            this.f183815f.getSettings().O(140);
            return;
        }
        if (b17 >= i65.a.t(getContext())) {
            this.f183815f.getSettings().O(140);
            return;
        }
        if (b17 >= i65.a.s(getContext())) {
            this.f183815f.getSettings().O(130);
            return;
        }
        if (b17 >= i65.a.z(getContext())) {
            this.f183815f.getSettings().O(120);
            return;
        }
        if (b17 >= i65.a.w(getContext())) {
            this.f183815f.getSettings().O(110);
            return;
        }
        i65.a.x(getContext());
        if (b17 >= 1.0f) {
            this.f183815f.getSettings().O(100);
        } else if (b17 >= i65.a.y(getContext())) {
            this.f183815f.getSettings().O(90);
        } else {
            this.f183815f.getSettings().O(80);
        }
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.animation.ObjectAnimator objectAnimator = this.Z4;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.Z4.cancel();
        }
        android.view.View view = this.W4;
        if (view == null) {
            return;
        }
        this.Y4 = i17;
        if (i17 > 0) {
            if (view.getTranslationY() != 0.0f) {
                view.setTranslationY(0.0f);
            }
            this.Z4 = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, -i17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.F4.getFtsEditText().getTotalQuery())) {
                ma(0);
            }
        } else {
            this.Z4 = android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
            ma(8);
        }
        this.Z4.setDuration(200L);
        this.Z4.setInterpolator(new y3.b());
        this.Z4.addUpdateListener(new com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI$$a());
        this.Z4.start();
    }
}
