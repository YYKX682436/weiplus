package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zn {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f120581a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f120582b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.ValueAnimator f120583c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f120584d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f120585e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f120586f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f120587g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f120588h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f120589i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f120590j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f120591k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.TextView f120592l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f120593m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.LinearLayout f120594n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f120595o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f120596p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.PassThroughScrollView f120597q;

    /* renamed from: r, reason: collision with root package name */
    public int f120598r;

    /* renamed from: s, reason: collision with root package name */
    public gk2.e f120599s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.ViewGroup f120600t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f120601u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f120602v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f120603w;

    public zn(android.view.ViewGroup root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f120581a = root;
        this.f120582b = "FinderLiveLoadingTipWidget";
        this.f120602v = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.pn(this));
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.iap);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f120584d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.iao);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f120585e = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.iaq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f120586f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f6_);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f120587g = textView;
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.o7n);
        this.f120588h = textView2;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f68);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f120589i = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.f66);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f120590j = (android.widget.TextView) findViewById6;
        this.f120591k = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484695f65);
        this.f120592l = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.tk8);
        this.f120593m = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.tk7);
        this.f120594n = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.f484697tk3);
        this.f120595o = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.f484698tk4);
        this.f120596p = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.tk6);
        this.f120597q = (com.tencent.mm.plugin.finder.live.widget.PassThroughScrollView) root.findViewById(com.tencent.mm.R.id.f484694tk1);
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.f7w);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById7;
        this.f120600t = viewGroup;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
        this.f120601u = new com.tencent.mm.plugin.finder.live.widget.nn(this);
        viewGroup.setClickable(false);
        viewGroup.setElevation(zl2.r4.f473950a.w1() ? root.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480545a42) : root.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3z));
    }

    public static void d(com.tencent.mm.plugin.finder.live.widget.zn znVar, boolean z17, int i17, java.lang.Object obj) {
        int i18;
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i(znVar.f120582b, "hideTimeCount");
        android.widget.TextView textView = znVar.f120588h;
        if (textView != null && textView.getVisibility() == 0) {
            if (z17) {
                if ((textView != null && textView.getVisibility() == 0) && (i18 = znVar.f120598r) > 0) {
                    te2.t8.b(te2.t8.f418440a, 2, i18, 0, false, 12, null);
                }
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = znVar.f120603w;
            if (b4Var != null) {
                b4Var.d();
            }
        }
    }

    public final void a() {
        android.view.Window window;
        android.view.ViewGroup viewGroup = this.f120600t;
        if (viewGroup.getWidth() == 0 && viewGroup.getHeight() == 0) {
            java.lang.String str = this.f120582b;
            com.tencent.mars.xlog.Log.i(str, "checkIfNeedAddToDecorView: width and height = 0");
            android.content.Context context = this.f120581a.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            android.view.View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
            android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
            if (frameLayout == null) {
                return;
            }
            android.view.ViewParent parent = viewGroup.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 == null || kotlin.jvm.internal.o.b(viewGroup2, frameLayout)) {
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "checkIfNeedAddToDecorView: add to decor view");
            viewGroup2.removeView(viewGroup);
            frameLayout.addView(viewGroup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.zn.b(java.lang.String, boolean):boolean");
    }

    public final void c() {
        android.view.View view = this.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "hideProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "hideProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f120586f.setVisibility(8);
    }

    public final void e(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.PassThroughScrollView passThroughScrollView = this.f120597q;
        if (passThroughScrollView == null) {
            return;
        }
        passThroughScrollView.setPassThroughTouch(z17);
    }

    public final void f() {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        gk2.e eVar = this.f120599s;
        if (eVar != null) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = ((mm2.c1) eVar.a(mm2.c1.class)).T4;
            this.f120598r = (1L > j17 ? 1 : (1L == j17 ? 0 : -1)) <= 0 && (j17 > elapsedRealtime ? 1 : (j17 == elapsedRealtime ? 0 : -1)) < 0 ? (int) ((elapsedRealtime - ((mm2.c1) eVar.a(mm2.c1.class)).T4) / 1000) : ((mm2.c1) eVar.a(mm2.c1.class)).U4;
            com.tencent.mars.xlog.Log.i(this.f120582b, "startPauseTime: curTime:" + elapsedRealtime + ", anchorPauseStartTime:" + ((mm2.c1) eVar.a(mm2.c1.class)).T4 + ", anchorPauseTimeCount:" + ((mm2.c1) eVar.a(mm2.c1.class)).U4 + ", pauseTime:" + this.f120598r);
            if (this.f120598r < 0) {
                d(this, false, 1, null);
                return;
            }
            android.widget.TextView textView = this.f120588h;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(no0.m.f338730a.b(this.f120598r, ":"));
            }
            if (this.f120603w == null) {
                this.f120603w = new com.tencent.mm.sdk.platformtools.b4("LiveVisitorPause::Timer", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.widget.yn(this, eVar), true);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f120603w;
            if (!(b4Var2 != null && b4Var2.e()) || (b4Var = this.f120603w) == null) {
                return;
            }
            b4Var.c(1000L, 1000L);
        }
    }
}
