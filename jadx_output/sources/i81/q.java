package i81;

/* loaded from: classes7.dex */
public class q extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f289605d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f289606e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f289607f;

    /* renamed from: g, reason: collision with root package name */
    public i81.b f289608g;

    /* renamed from: h, reason: collision with root package name */
    public i81.p f289609h;

    public q(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super(context);
        this.f289605d = appBrandRuntime;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f289606e = frameLayout;
        addView(frameLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.f289607f = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, new android.view.ViewGroup.LayoutParams(-1, -2));
        if (linearLayout.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            xi1.f statusBar = appBrandRuntime.getWindowAndroid().getStatusBar();
            int i17 = statusBar == null ? 0 : statusBar.f454702a;
            ((android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).topMargin = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeAdViewContainer[AppBrandSplashAd]", "fakeActionBarLayout topMargin=%d", java.lang.Integer.valueOf(i17));
        }
    }

    public final void a(boolean z17, java.lang.String str, com.tencent.mm.plugin.appbrand.ui.yc ycVar) {
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton optionBtn;
        int i17;
        int i18;
        int i19;
        mi1.v vVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeAdViewContainer[AppBrandSplashAd]", "hideOnMainThread, animation:%s, source:%s", java.lang.Boolean.valueOf(z17), str);
        if (!z17) {
            i81.p pVar = this.f289609h;
            if (pVar != null) {
                pVar.a(str);
            }
            setVisibility(8);
            return;
        }
        if (ycVar != null) {
            i17 = (int) ycVar.f90353a;
            i19 = (int) ycVar.f90354b;
            i18 = ((int) ycVar.f90355c) / 2;
        } else {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f289605d;
            if (appBrandRuntime == null || (vVar = appBrandRuntime.f74821z) == null) {
                i81.b bVar = this.f289608g;
                optionBtn = bVar != null ? bVar.f289523f.getOptionBtn() : null;
            } else {
                optionBtn = vVar.d();
            }
            i17 = 0;
            if (optionBtn != null) {
                int width = optionBtn.getWidth();
                int height = optionBtn.getHeight();
                int[] iArr = new int[2];
                optionBtn.getLocationInWindow(iArr);
                i17 = iArr[0] + (width / 2);
                int i27 = height / 2;
                i19 = iArr[1] + i27;
                i18 = i27;
            } else {
                i18 = 0;
                i19 = 0;
            }
        }
        if (i17 <= 0 || i19 <= 0 || !isAttachedToWindow()) {
            i81.p pVar2 = this.f289609h;
            if (pVar2 != null) {
                pVar2.a(str);
            }
            setVisibility(8);
            return;
        }
        i81.m mVar = new i81.m(this, str);
        android.animation.Animator createCircularReveal = android.view.ViewAnimationUtils.createCircularReveal(this, i17, i19, (float) java.lang.Math.hypot(i17, i19), i18);
        createCircularReveal.addListener(new i81.o(this, mVar));
        createCircularReveal.setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator());
        createCircularReveal.start();
    }

    public void b() {
        android.widget.LinearLayout linearLayout = this.f289607f;
        linearLayout.removeAllViews();
        i81.b bVar = new i81.b(getContext(), this.f289605d);
        this.f289608g = bVar;
        linearLayout.addView(bVar.getActionView());
        this.f289608g.f289521d.setFullscreenMode(true);
        this.f289608g.f289521d.m(false);
        al1.b bVar2 = this.f289608g.f289521d;
        bVar2.f5738o.setVisibility(8);
        bVar2.requestLayout();
        this.f289608g.a(false, al1.h0.PageConfig);
        this.f289608g.f289521d.setBackgroundColor(0);
    }

    public android.view.ViewGroup getContentContainer() {
        return this.f289606e;
    }

    public i81.b getFakeActionBar() {
        return this.f289608g;
    }

    public com.tencent.mm.plugin.appbrand.AppBrandRuntime getRuntime() {
        return this.f289605d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeAdViewContainer[AppBrandSplashAd]", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        i81.p pVar = this.f289609h;
        if (pVar != null) {
            pVar.onDetach();
        }
    }

    public void setActionBarFullscreenMode(boolean z17) {
        i81.b bVar = this.f289608g;
        if (bVar != null) {
            bVar.f289521d.setFullscreenMode(z17);
        }
    }

    public void setBackButtonClickListener(android.view.View.OnClickListener onClickListener) {
        i81.b bVar = this.f289608g;
        if (bVar != null) {
            bVar.setBackButtonClickListener(onClickListener);
        }
    }

    public void setBarTopMargin(int i17) {
        if (this.f289608g != null) {
            ((android.view.ViewGroup.MarginLayoutParams) this.f289607f.getLayoutParams()).topMargin = i17;
        }
    }

    public void setCloseButtonClickListener(android.view.View.OnClickListener onClickListener) {
        i81.b bVar = this.f289608g;
        if (bVar != null) {
            bVar.setCloseButtonClickListener(onClickListener);
        }
    }

    public void setForegroundStyle(boolean z17) {
        i81.b bVar = this.f289608g;
        if (bVar != null) {
            bVar.f289521d.setForegroundStyle(z17);
        }
    }

    public void setOnHideListener(i81.p pVar) {
        this.f289609h = pVar;
    }

    public void setOptionButtonClickListener(android.view.View.OnClickListener onClickListener) {
        i81.b bVar = this.f289608g;
        if (bVar != null) {
            bVar.f289521d.setOptionButtonClickListener(onClickListener);
        }
    }

    public void setTitle(java.lang.String str) {
        i81.b bVar = this.f289608g;
        if (bVar != null) {
            bVar.setMainTitle(str);
        }
    }
}
