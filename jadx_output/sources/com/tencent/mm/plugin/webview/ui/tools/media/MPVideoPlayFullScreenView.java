package com.tencent.mm.plugin.webview.ui.tools.media;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00062"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", org.chromium.base.BaseSwitches.V, "Ljz5/f0;", "onClick", "", "F", "I", "getEnterId", "()I", "setEnterId", "(I)V", "enterId", "", "G", "J", "getEnterTimeInMs", "()J", "setEnterTimeInMs", "(J)V", "enterTimeInMs", "", "H", "Z", "getForbidForward", "()Z", "setForbidForward", "(Z)V", "forbidForward", "Lcom/tencent/mm/plugin/webview/ui/tools/media/y0;", "R", "Lcom/tencent/mm/plugin/webview/ui/tools/media/y0;", "getMpShareVideoReport", "()Lcom/tencent/mm/plugin/webview/ui/tools/media/y0;", "mpShareVideoReport", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/lang/Integer;", "getSubScene", "()Ljava/lang/Integer;", "setSubScene", "(Ljava/lang/Integer;)V", "subScene", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MPVideoPlayFullScreenView extends android.widget.RelativeLayout implements android.view.View.OnClickListener {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f185705y0 = 0;
    public final android.view.View A;
    public final android.widget.ProgressBar B;
    public com.tencent.mm.ui.tools.s4 C;
    public double D;
    public boolean E;

    /* renamed from: F, reason: from kotlin metadata */
    public int enterId;

    /* renamed from: G, reason: from kotlin metadata */
    public long enterTimeInMs;

    /* renamed from: H, reason: from kotlin metadata */
    public boolean forbidForward;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public int f185706J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean P;
    public final z41.c Q;

    /* renamed from: R, reason: from kotlin metadata */
    public final com.tencent.mm.plugin.webview.ui.tools.media.y0 mpShareVideoReport;
    public final float S;
    public boolean T;
    public boolean U;

    /* renamed from: V, reason: from kotlin metadata */
    public java.lang.Integer subScene;
    public final com.tencent.mm.sdk.platformtools.b4 W;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f185707d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f185708e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f185709f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f185710g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f185711h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f185712i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f185713m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f185714n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f185715o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f185716p;

    /* renamed from: p0, reason: collision with root package name */
    public final long f185717p0;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f185718q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f185719r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f185720s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f185721t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMNeat7extView f185722u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f185723v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f185724w;

    /* renamed from: x, reason: collision with root package name */
    public ot0.m1 f185725x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f185726x0;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.xweb.o0 f185727y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar f185728z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPVideoPlayFullScreenView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f185707d = "MicroMsg.MPVideoPlayFullScreenView";
        this.I = -3;
        this.f185706J = -3;
        this.K = -1;
        this.Q = new z41.c(context, new com.tencent.mm.plugin.webview.ui.tools.media.t(this, context));
        this.mpShareVideoReport = new com.tencent.mm.plugin.webview.ui.tools.media.y0();
        android.view.View.inflate(context, com.tencent.mm.R.layout.c2m, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ozs);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f185708e = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ozr);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f185709f = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.oy8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f185710g = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ozw);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f185712i = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.jsa);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f185713m = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.p0v);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f185714n = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.jse);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f185723v = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.jsd);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f185720s = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.jsl);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f185721t = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.jsp);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f185722u = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.jsq);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f185724w = findViewById11;
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = (com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar) findViewById(com.tencent.mm.R.id.ozz);
        this.f185728z = redesignVideoPlayerSeekBar;
        this.A = findViewById(com.tencent.mm.R.id.oeq);
        this.B = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.ozy);
        if (redesignVideoPlayerSeekBar != null) {
            redesignVideoPlayerSeekBar.setOnClickListener(this);
        }
        findViewById4.setOnClickListener(com.tencent.mm.plugin.webview.ui.tools.media.b.f185743d);
        findViewById5.setOnClickListener(com.tencent.mm.plugin.webview.ui.tools.media.c.f185748d);
        findViewById7.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.media.d(this, context));
        com.tencent.mm.ui.tools.d8.a(findViewById7);
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.ozv);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f185715o = findViewById12;
        findViewById12.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.media.e(this));
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.ozx);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f185716p = findViewById13;
        findViewById13.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.media.f(this, context));
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.f487557p00);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f185719r = findViewById14;
        findViewById14.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.media.g(context, this));
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.f487564p10);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f185718q = findViewById15;
        findViewById15.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.media.h(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById11, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById11.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById11, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (redesignVideoPlayerSeekBar != null) {
            redesignVideoPlayerSeekBar.setPlayBtnOnClickListener(this);
        }
        if (redesignVideoPlayerSeekBar != null) {
            redesignVideoPlayerSeekBar.setIplaySeekCallback(new com.tencent.mm.plugin.webview.ui.tools.media.p(this));
        }
        this.S = 1.0f;
        this.W = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.webview.ui.tools.media.o(this), true);
        this.f185717p0 = 4000L;
    }

    public static final void a(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        mPVideoPlayFullScreenView.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.media.n(mPVideoPlayFullScreenView));
    }

    public static final void b(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        int c17 = com.tencent.mm.ui.bl.c(mPVideoPlayFullScreenView.getContext());
        int f17 = i65.a.f(mPVideoPlayFullScreenView.getContext(), com.tencent.mm.R.dimen.f479738dv);
        double d17 = f17;
        int i17 = (int) (2.5d * d17);
        int i18 = (int) (d17 * 1.5d);
        int i19 = f17 * 3;
        int i27 = f17 * 2;
        mPVideoPlayFullScreenView.f185712i.setPadding(0, i27, 0, i27 + c17);
        android.view.View view = mPVideoPlayFullScreenView.A;
        if (view != null) {
            view.setPadding(0, 0, 0, c17);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = i65.a.h(mPVideoPlayFullScreenView.getContext(), com.tencent.mm.R.dimen.f479669c6);
            view.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = mPVideoPlayFullScreenView.f185728z;
        kotlin.jvm.internal.o.d(redesignVideoPlayerSeekBar);
        android.view.ViewGroup.LayoutParams layoutParams3 = redesignVideoPlayerSeekBar.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.removeRule(1);
        layoutParams4.removeRule(0);
        layoutParams4.removeRule(15);
        layoutParams4.setMargins(i17, i19, i18, 0);
        redesignVideoPlayerSeekBar.setLayoutParams(layoutParams4);
        android.view.View view2 = mPVideoPlayFullScreenView.f185715o;
        android.view.ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.addRule(3, com.tencent.mm.R.id.ozz);
        layoutParams6.setMargins(i17, i19, 0, 0);
        layoutParams6.removeRule(15);
        view2.setLayoutParams(layoutParams6);
        android.view.View view3 = mPVideoPlayFullScreenView.f185716p;
        android.view.ViewGroup.LayoutParams layoutParams7 = view3.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) layoutParams7;
        layoutParams8.addRule(3, com.tencent.mm.R.id.ozz);
        layoutParams8.setMargins(0, i19, i18, 0);
        layoutParams8.removeRule(15);
        view3.setLayoutParams(layoutParams8);
        android.view.View view4 = mPVideoPlayFullScreenView.f185719r;
        android.view.ViewGroup.LayoutParams layoutParams9 = view4.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) layoutParams9;
        layoutParams10.addRule(3, com.tencent.mm.R.id.ozz);
        layoutParams10.setMargins(0, i19, i18, 0);
        layoutParams10.removeRule(15);
        view4.setLayoutParams(layoutParams10);
    }

    public static final void c(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        mPVideoPlayFullScreenView.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (mPVideoPlayFullScreenView.f185726x0) {
            return;
        }
        mPVideoPlayFullScreenView.f185726x0 = true;
        android.view.View view = mPVideoPlayFullScreenView.f185709f;
        view.getVisibility();
        view.clearAnimation();
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
        com.tencent.mm.sdk.platformtools.b4 b4Var = mPVideoPlayFullScreenView.W;
        if (!b4Var.e()) {
            b4Var.d();
        }
        long j17 = mPVideoPlayFullScreenView.f185717p0;
        b4Var.c(j17, j17);
        android.view.View view2 = mPVideoPlayFullScreenView.f185713m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = mPVideoPlayFullScreenView.f185712i;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static final void d(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView, boolean z17) {
        mPVideoPlayFullScreenView.E = z17;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.media.e0(z17, mPVideoPlayFullScreenView));
    }

    public final synchronized void e() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        if (this.f185725x == null) {
            return;
        }
        if (!this.N && this.P) {
            this.N = true;
            if (this.f185706J == this.I) {
                this.f185706J = activity.getRequestedOrientation();
            }
            java.lang.String str = this.f185707d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adjustOrientation width = ");
            ot0.m1 m1Var = this.f185725x;
            kotlin.jvm.internal.o.d(m1Var);
            sb6.append(m1Var.f373345m);
            sb6.append(", height=");
            ot0.m1 m1Var2 = this.f185725x;
            kotlin.jvm.internal.o.d(m1Var2);
            sb6.append(m1Var2.f373346n);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            ot0.m1 m1Var3 = this.f185725x;
            kotlin.jvm.internal.o.d(m1Var3);
            int i17 = m1Var3.f373345m;
            ot0.m1 m1Var4 = this.f185725x;
            kotlin.jvm.internal.o.d(m1Var4);
            if (i17 <= m1Var4.f373346n) {
                this.K = 1;
                activity.setRequestedOrientation(1);
                this.L = false;
            } else {
                this.L = true;
                this.K = 0;
                activity.setRequestedOrientation(0);
                this.Q.enable();
            }
            int i18 = this.K;
            if (i18 != 0 && i18 != 8) {
                k();
                return;
            }
            j();
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f185707d, "adjustOrientation hasAdjustOrientation=" + this.N + ", hasAddVideoView=" + this.P);
    }

    public final void f() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        android.content.Context context = getContext();
        boolean z17 = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        java.lang.String str = this.f185707d;
        if (!z17 || (mMWebView = (webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).f183815f) == null) {
            com.tencent.mars.xlog.Log.w(str, "should not be here");
        } else if (mMWebView != null) {
            com.tencent.mars.xlog.Log.i(str, "close click");
            o();
            webViewUI.f183815f.m();
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.webview.ui.tools.media.i(this), 500L);
        }
    }

    public final int g(boolean z17) {
        java.lang.Integer num;
        if (!z17 && (num = this.subScene) != null) {
            kotlin.jvm.internal.o.d(num);
            return num.intValue();
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        int intExtra = ((android.app.Activity) context).getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
        if (intExtra != 10000) {
            return intExtra;
        }
        java.lang.Object context2 = getContext();
        com.tencent.mm.plugin.webview.core.w0 w0Var = context2 instanceof com.tencent.mm.plugin.webview.core.w0 ? (com.tencent.mm.plugin.webview.core.w0) context2 : null;
        try {
            return com.tencent.mm.sdk.platformtools.t8.P(android.net.Uri.parse(w0Var != null ? ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) w0Var).F7() : null).getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 10000);
        } catch (java.lang.Exception unused) {
            return intExtra;
        }
    }

    public final int getEnterId() {
        return this.enterId;
    }

    public final long getEnterTimeInMs() {
        return this.enterTimeInMs;
    }

    public final boolean getForbidForward() {
        return this.forbidForward;
    }

    public final com.tencent.mm.plugin.webview.ui.tools.media.y0 getMpShareVideoReport() {
        return this.mpShareVideoReport;
    }

    public final java.lang.Integer getSubScene() {
        return this.subScene;
    }

    public final void h() {
        android.view.ViewTreeObserver viewTreeObserver;
        if (this.C == null) {
            this.C = new com.tencent.mm.ui.tools.s4(getContext());
        }
        ot0.m1 m1Var = this.f185725x;
        if (m1Var == null) {
            this.U = true;
            return;
        }
        this.U = false;
        int i17 = m1Var.f348583u;
        kotlin.jvm.internal.o.d(m1Var);
        int i18 = m1Var.f348584v;
        ot0.m1 m1Var2 = this.f185725x;
        kotlin.jvm.internal.o.d(m1Var2);
        int i19 = m1Var2.f348585w;
        ot0.m1 m1Var3 = this.f185725x;
        kotlin.jvm.internal.o.d(m1Var3);
        int i27 = m1Var3.f348586x;
        com.tencent.mm.ui.tools.s4 s4Var = this.C;
        if (s4Var != null) {
            s4Var.e(i17, i18, i19, i27);
        }
        com.tencent.mm.ui.tools.s4 s4Var2 = this.C;
        if (s4Var2 != null) {
            s4Var2.f210707n = 1.0f;
        }
        if (s4Var2 != null) {
            s4Var2.f210708o = 0;
            s4Var2.f210709p = 0;
        }
        android.view.ViewGroup viewGroup = this.f185711h;
        if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.webview.ui.tools.media.a0(this));
    }

    public final void i(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f185707d, "handleFullScreenStatusBar forwardUiVisibility " + this.M);
        if (!z17) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            android.view.View decorView = activity.getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) decorView).setSystemUiVisibility(this.M);
            activity.getWindow().clearFlags(1024);
            return;
        }
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity2 = (android.app.Activity) context2;
        android.view.View decorView2 = activity2.getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView2;
        this.M = viewGroup.getSystemUiVisibility();
        viewGroup.setOnSystemUiVisibilityChangeListener(new com.tencent.mm.plugin.webview.ui.tools.media.k(this, viewGroup));
        viewGroup.setSystemUiVisibility(4102);
        activity2.getWindow().addFlags(1024);
    }

    public final void j() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.webview.ui.tools.media.l(decorView, this));
    }

    public final void k() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.webview.ui.tools.media.m(decorView, this));
    }

    public final void l() {
        ot0.m1 m1Var = this.f185725x;
        if (m1Var == null) {
            return;
        }
        kotlin.jvm.internal.o.d(m1Var);
        m1Var.f348587y = this.enterId;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.tencent.mm.plugin.webview.stub.v0 v0Var = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).K1;
        com.tencent.mm.plugin.webview.ui.tools.media.y0 y0Var = this.mpShareVideoReport;
        if (v0Var != null) {
            try {
                ot0.m1 m1Var2 = this.f185725x;
                kotlin.jvm.internal.o.d(m1Var2);
                y0Var.f185842h = v0Var.Mb(m1Var2.f373348p);
                y0Var.f185840f = 141;
                y0Var.f185841g = g(true);
            } catch (java.lang.Exception unused) {
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.enterTimeInMs = currentTimeMillis;
        int i17 = (int) (currentTimeMillis / 1000);
        this.enterId = i17;
        y0Var.b(this.f185725x, 1, i17, 101);
        y0Var.b(this.f185725x, 5, this.enterId, 101);
        y0Var.f185843i = 0;
    }

    public final void m() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo;
        r45.lr4 v07;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f185722u;
        mMNeat7extView.getPaint().setFakeBoldText(true);
        android.widget.TextView textView = this.f185721t;
        textView.getPaint().setFakeBoldText(true);
        ot0.m1 m1Var = this.f185725x;
        java.lang.String str = null;
        mMNeat7extView.b(m1Var != null ? m1Var.f373342g : null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        ot0.m1 m1Var2 = this.f185725x;
        java.lang.String str2 = m1Var2 != null ? m1Var2.f373349q : null;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize));
        if (this.forbidForward) {
            android.view.View view = this.f185716p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f185719r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f185716p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f185719r;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.content.Context context2 = getContext();
        if (context2 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
            ot0.m1 m1Var3 = this.f185725x;
            if (com.tencent.mm.sdk.platformtools.t8.K0(m1Var3 != null ? m1Var3.B : null)) {
                vx4.d dVar = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context2).F2;
                if (dVar != null && (multiTaskInfo = dVar.f300077a) != null && (v07 = multiTaskInfo.v0()) != null) {
                    str = v07.getString(5);
                }
            } else {
                ot0.m1 m1Var4 = this.f185725x;
                if (m1Var4 != null) {
                    str = m1Var4.B;
                }
            }
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f342096t = true;
            fVar.f342091o = com.tencent.mm.R.drawable.bgo;
            b17.h(str, this.f185720s, fVar.a());
        }
    }

    public final void n() {
        nw4.n nVar;
        if (getVisibility() == 8) {
            return;
        }
        setVisibility(8);
        this.f185710g.removeAllViews();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).setMMOrientation();
        com.tencent.mars.xlog.Log.i(this.f185707d, "onExitMpVideoFullPage");
        this.N = false;
        this.P = false;
        if (this.f185725x == null) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.media.y0 y0Var = this.mpShareVideoReport;
        y0Var.f185838d = (int) (java.lang.System.currentTimeMillis() - this.enterTimeInMs);
        y0Var.f185837c = (int) (this.D * 1000);
        y0Var.b(this.f185725x, 6, this.enterId, 101);
        y0Var.b(this.f185725x, 2, this.enterId, 101);
        android.content.Context context2 = getContext();
        if ((context2 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) && (nVar = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context2).f183844p0) != null) {
            ot0.m1 m1Var = this.f185725x;
            kotlin.jvm.internal.o.d(m1Var);
            java.lang.String str = m1Var.f373341f;
            int i17 = (int) this.D;
            if (nVar.f340895i) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("videoVid", str);
                hashMap.put("videoCurrTime", java.lang.Integer.valueOf(i17));
                hashMap.put("action", "onExitMpVideoFullPage");
                nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onMPPageAction", hashMap, nVar.f340903q, nVar.f340904r) + ")", null);
            }
        }
        this.f185725x = null;
    }

    public final void o() {
        int i17 = this.f185706J;
        int i18 = this.I;
        if (i17 != i18) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).setRequestedOrientation(this.f185706J);
            this.f185706J = i18;
            this.Q.disable();
        }
        i(false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null && view.getId() == com.tencent.mm.R.id.kwj) {
            if (this.E) {
                com.tencent.xweb.o0 o0Var = this.f185727y;
                if (o0Var != null) {
                    o0Var.c();
                }
            } else {
                com.tencent.xweb.o0 o0Var2 = this.f185727y;
                if (o0Var2 != null) {
                    o0Var2.h();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i17 = newConfig.orientation;
        if (i17 == 1) {
            k();
        } else if (i17 == 2) {
            j();
        }
    }

    public final void p() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (this.f185726x0) {
            this.f185726x0 = false;
            android.view.View view = this.f185709f;
            view.getVisibility();
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator(10.0f));
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.webview.ui.tools.media.j(this));
            view.clearAnimation();
            view.startAnimation(alphaAnimation);
        }
    }

    public final void setEnterId(int i17) {
        this.enterId = i17;
    }

    public final void setEnterTimeInMs(long j17) {
        this.enterTimeInMs = j17;
    }

    public final void setForbidForward(boolean z17) {
        this.forbidForward = z17;
    }

    public final void setSubScene(java.lang.Integer num) {
        this.subScene = num;
    }
}
