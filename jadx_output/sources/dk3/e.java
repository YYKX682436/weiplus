package dk3;

/* loaded from: classes8.dex */
public final class e implements dk3.f {

    /* renamed from: a, reason: collision with root package name */
    public final jk3.e f234449a;

    /* renamed from: b, reason: collision with root package name */
    public final ak3.c f234450b;

    /* renamed from: c, reason: collision with root package name */
    public final kk3.g f234451c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView f234452d;

    /* renamed from: e, reason: collision with root package name */
    public int f234453e;

    /* renamed from: f, reason: collision with root package name */
    public int f234454f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout.LayoutParams f234455g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f234456h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f234457i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f234458j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f234459k;

    /* renamed from: l, reason: collision with root package name */
    public long f234460l;

    /* renamed from: m, reason: collision with root package name */
    public float f234461m;

    /* renamed from: n, reason: collision with root package name */
    public float f234462n;

    /* renamed from: o, reason: collision with root package name */
    public long f234463o;

    public e(jk3.e pageHelper, ak3.c pageAdapter, kk3.g gVar) {
        kotlin.jvm.internal.o.g(pageHelper, "pageHelper");
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
        this.f234449a = pageHelper;
        this.f234450b = pageAdapter;
        this.f234451c = gVar;
        this.f234460l = -1L;
        this.f234463o = -1L;
        com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = new com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView(pageAdapter.getActivity(), null, 0, 6, null);
        this.f234452d = floatMultiTaskIndicatorView;
        floatMultiTaskIndicatorView.setOnOrientationChangedListener(new dk3.a(this));
        boolean z17 = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) > i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "updateOrientation, isLandscape:%b", java.lang.Boolean.valueOf(z17));
        this.f234456h = z17;
        d();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        this.f234455g = layoutParams;
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = this.f234454f;
        layoutParams.rightMargin = this.f234453e;
        com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = this.f234452d;
        if (floatMultiTaskIndicatorView2 != null) {
            floatMultiTaskIndicatorView2.setLayoutParams(layoutParams);
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        android.widget.FrameLayout.LayoutParams layoutParams2 = this.f234455g;
        objArr[0] = layoutParams2 != null ? java.lang.Integer.valueOf(layoutParams2.rightMargin) : null;
        android.widget.FrameLayout.LayoutParams layoutParams3 = this.f234455g;
        objArr[1] = layoutParams3 != null ? java.lang.Integer.valueOf(layoutParams3.bottomMargin) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "createFloatIndicator layoutParams, right:%s, bottom:%s", objArr);
    }

    public final int a() {
        ak3.c cVar = this.f234450b;
        return cVar.b() >= 0 ? cVar.b() : com.tencent.mm.plugin.multitask.q0.f150493j;
    }

    public final void b() {
        com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView;
        if (this.f234458j && (floatMultiTaskIndicatorView = this.f234452d) != null) {
            if (floatMultiTaskIndicatorView != null) {
                floatMultiTaskIndicatorView.setVisibility(8);
            }
            this.f234458j = false;
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "start FloatIndicatorController");
        b();
        this.f234460l = -1L;
        this.f234457i = false;
        this.f234458j = false;
        this.f234459k = false;
        ak3.c cVar = this.f234450b;
        if (cVar.g()) {
            cVar.h(new dk3.c(this));
            pm0.v.X(new dk3.d(this));
        }
    }

    public final void d() {
        int i17;
        android.app.Activity activity = this.f234450b.getActivity();
        if (activity != null) {
            int i18 = com.tencent.mm.plugin.multitask.q0.f150484a;
            try {
                i17 = com.tencent.mm.ui.bl.c(activity);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallViewConstants", "getNavigationBarHeight exception:%s", e17);
                i17 = 0;
            }
            com.tencent.mm.plugin.multitask.q0.f150493j = i17;
        }
        if (this.f234456h) {
            int i19 = com.tencent.mm.plugin.multitask.q0.f150489f;
            this.f234454f = -i19;
            this.f234453e = a() - i19;
        } else {
            int i27 = com.tencent.mm.plugin.multitask.q0.f150489f;
            this.f234453e = -i27;
            this.f234454f = a() - i27;
        }
    }
}
