package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class k2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117176d;

    /* renamed from: e, reason: collision with root package name */
    public int f117177e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117178f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f117179g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f117180h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f117181i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f117182m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f117183n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f117184o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.viewmodel.j2 f117185p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f117186q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117176d = "Finder.FinderGameFinishUIC";
        this.f117177e = 6;
        this.f117178f = "";
        this.f117185p = new com.tencent.mm.plugin.finder.live.viewmodel.j2(this, activity);
        this.f117186q = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.viewmodel.i2(this), true);
    }

    public final void O6() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator withEndAction;
        com.tencent.mm.ui.ga controller;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null && (controller = mMActivity.getController()) != null) {
            controller.G0(getActivity().getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        android.view.View view = this.f117179g;
        if (view == null || (animate = view.animate()) == null || (translationX = animate.translationX(-com.tencent.mm.ui.bl.b(getActivity()).x)) == null || (withEndAction = translationX.withEndAction(new com.tencent.mm.plugin.finder.live.viewmodel.f2(this))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void P6() {
        android.view.View findViewById;
        com.tencent.mm.ui.ga controller;
        android.view.View findViewById2;
        android.view.View findViewById3;
        android.view.View view = this.f117179g;
        this.f117182m = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.eyn) : null;
        android.view.View view2 = this.f117179g;
        this.f117183n = view2 != null ? view2.findViewById(com.tencent.mm.R.id.eyk) : null;
        getActivity();
        com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) this.f117179g.findViewById(com.tencent.mm.R.id.ezd);
        mMWebView.getClass();
        this.f117180h = mMWebView;
        mMWebView.setWebChromeClient(this.f117185p);
        android.view.View view3 = this.f117179g;
        android.widget.Button button = view3 != null ? (android.widget.Button) view3.findViewById(com.tencent.mm.R.id.eym) : null;
        this.f117181i = button;
        android.view.ViewGroup.LayoutParams layoutParams = button != null ? button.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = com.tencent.mm.ui.zk.a(getActivity(), 48) + com.tencent.mm.ui.bl.c(getActivity());
        }
        android.view.View view4 = this.f117179g;
        android.view.ViewGroup.LayoutParams layoutParams2 = (view4 == null || (findViewById3 = view4.findViewById(com.tencent.mm.R.id.eyl)) == null) ? null : findViewById3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin = com.tencent.mm.ui.bl.c(getActivity());
        }
        android.widget.Button button2 = this.f117181i;
        if (button2 != null) {
            button2.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.g2(this));
        }
        android.view.View view5 = this.f117183n;
        if (view5 != null) {
            view5.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.h2(this));
        }
        if (getContext() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI) {
            android.view.View view6 = this.f117179g;
            android.view.ViewGroup.LayoutParams layoutParams3 = (view6 == null || (findViewById = view6.findViewById(com.tencent.mm.R.id.ezb)) == null) ? null : findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = (int) getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
            }
        } else {
            android.view.View view7 = this.f117179g;
            android.view.ViewGroup.LayoutParams layoutParams4 = (view7 == null || (findViewById2 = view7.findViewById(com.tencent.mm.R.id.ezb)) == null) ? null : findViewById2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.topMargin = com.tencent.mm.ui.bl.h(getActivity());
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null && (controller = mMActivity.getController()) != null) {
            controller.G0(getActivity().getResources().getColor(com.tencent.mm.R.color.BW_100));
        }
        android.view.View view8 = this.f117179g;
        if (view8 != null) {
            view8.setTranslationX(0.0f);
        }
        android.view.View view9 = this.f117179g;
        if (view9 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view9, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        try {
            this.f117178f = "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_game_agreement";
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f117180h;
            if (mMWebView2 != null) {
                mMWebView2.loadUrl("https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_game_agreement");
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f117186q;
            b4Var.d();
            this.f117177e = 6;
            b4Var.c(1000L, 1000L);
            android.widget.Button button3 = this.f117181i;
            if (button3 == null) {
                return;
            }
            button3.setEnabled(false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f117176d, e17.getMessage());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f117179g = findViewById(com.tencent.mm.R.id.lcj);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f117186q.d();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f117180h;
        if (mMWebView != null) {
            mMWebView.destroy();
        }
    }
}
