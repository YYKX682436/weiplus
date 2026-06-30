package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f115324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115325e;

    public zc(com.tencent.mm.plugin.finder.live.plugin.ad adVar, android.view.View view) {
        this.f115324d = adVar;
        this.f115325e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.graphics.drawable.Drawable background;
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = this.f115324d;
        if (adVar.x0()) {
            android.view.ViewGroup viewGroup = adVar.f111867w;
            if (viewGroup != null && (background = viewGroup.getBackground()) != null) {
                adVar.E = background;
            }
            android.view.ViewGroup viewGroup2 = adVar.f111867w;
            if (viewGroup2 != null) {
                viewGroup2.setBackground(null);
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.ad.t1(adVar);
            android.view.View view = this.f115325e;
            if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFinishBg but costInnerContainer size:");
                sb6.append(view.getMeasuredWidth());
                sb6.append('-');
                sb6.append(view.getMeasuredHeight());
                sb6.append(",freeTimeOverPag:");
                com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = adVar.D;
                sb6.append((lazyPlayPAGView == null || (layoutParams2 = lazyPlayPAGView.getLayoutParams()) == null) ? null : java.lang.Integer.valueOf(layoutParams2.width));
                sb6.append('-');
                com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView2 = adVar.D;
                sb6.append((lazyPlayPAGView2 == null || (layoutParams = lazyPlayPAGView2.getLayoutParams()) == null) ? null : java.lang.Integer.valueOf(layoutParams.height));
                sb6.append('!');
                com.tencent.mars.xlog.Log.i("FinderLiveChargePayLazyPlugin", sb6.toString());
                view.getViewTreeObserver().addOnGlobalLayoutListener((com.tencent.mm.plugin.finder.live.plugin.pc) ((jz5.n) adVar.F).getValue());
            }
            android.graphics.drawable.Drawable background2 = view.getBackground();
            if (background2 != null) {
                adVar.E = background2;
            }
            view.setBackground(null);
        }
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView3 = adVar.D;
        if (lazyPlayPAGView3 != null) {
            lazyPlayPAGView3.setVisibility(0);
        }
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView4 = adVar.D;
        if (lazyPlayPAGView4 != null) {
            lazyPlayPAGView4.g();
        }
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView5 = adVar.D;
        if (lazyPlayPAGView5 != null) {
            lazyPlayPAGView5.setAlpha(0.0f);
        }
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView6 = adVar.D;
        if (lazyPlayPAGView6 == null || (animate = lazyPlayPAGView6.animate()) == null || (alpha = animate.alpha(1.0f)) == null) {
            return;
        }
        alpha.start();
    }
}
