package com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage;

/* loaded from: classes4.dex */
public final class FloatJumpCompHelper extends com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle<f54.m, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0> {

    /* renamed from: h, reason: collision with root package name */
    public int f163155h;

    public FloatJumpCompHelper(f54.m mVar, android.view.ViewGroup viewGroup) {
        super(mVar, viewGroup);
        this.f163155h = -1;
    }

    public static int d(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSysNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
            if (identifier > 0) {
                int dimensionPixelSize = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSysNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                return dimensionPixelSize;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.FloatJumpCompHelper", "getSysNavigationBarHeight, exp=" + th6.toString());
        }
        int b17 = i65.a.b(context, 30);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSysNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return b17;
    }

    @Override // com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a(android.content.Context context, ab4.d0 d0Var, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        f54.m mVar = (f54.m) d0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        if (context != null && mVar != null) {
            int i17 = mVar.H;
            if (i17 <= 0) {
                i17 = 130;
            }
            this.f163155h = i65.a.b(context, i17);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0 t0Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0(context, mVar, viewGroup, this.f163155h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return t0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle
    public void b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.FloatJumpCompHelper", "prepareContentViewLayoutParams");
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 81;
                layoutParams2.bottomMargin += c();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
    }

    public final int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            android.content.Context context = this.f163154g;
            if (context != null) {
                if (f(context)) {
                    int d17 = d(context);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                    return d17;
                }
                int b17 = i65.a.b(context, 12);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                return b17;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.FloatJumpCompHelper", "the getNavigationBarHeight has something wrong!!, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return 0;
    }

    public void e(int i17) {
        android.view.View x17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBottomFixedMargin", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = this.f163152e;
            if (a2Var != null && (x17 = ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t0) a2Var).x()) != null) {
                android.view.ViewGroup.LayoutParams layoutParams = x17.getLayoutParams();
                if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                    if (layoutParams2.bottomMargin != i17) {
                        com.tencent.mars.xlog.Log.i("SnsAd.FloatJumpCompHelper", "setBottomFixedMargin, margin=" + i17);
                        layoutParams2.bottomMargin = i17;
                        x17.setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.FloatJumpCompHelper", "setBottomFixedMargin, e=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBottomFixedMargin", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
    }

    public final boolean f(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
            return false;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int max = java.lang.Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int min = java.lang.Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        if (min == 0) {
            com.tencent.mars.xlog.Log.w("SnsAd.FloatJumpCompHelper", "the width is zero!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
            return true;
        }
        boolean z17 = java.lang.Float.compare(((float) max) / ((float) min), 1.7777778f) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return z17;
    }
}
