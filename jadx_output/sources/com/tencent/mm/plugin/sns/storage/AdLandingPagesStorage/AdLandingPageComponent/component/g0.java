package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class g0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 f165203d;

    public g0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 k0Var) {
        this.f165203d = k0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 k0Var = this.f165203d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$VOnGlobalLayoutListener");
        try {
            com.tencent.mars.xlog.Log.i("AdLandingFloatWebView", "viewTreeObserver OnGlobalLayoutListener is called");
            android.view.View view = k0Var.f165056n;
            if (view != null && view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                android.view.View rootView = view.getRootView();
                if (rootView != null) {
                    view = rootView;
                }
                android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.oxo);
                if ((findViewById instanceof android.view.ViewGroup) && ((android.view.ViewGroup) findViewById).getChildCount() > 0) {
                    android.view.View childAt = ((android.view.ViewGroup) findViewById).getChildAt(0);
                    if (childAt == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$VOnGlobalLayoutListener");
                        return;
                    }
                    android.view.View findViewById2 = childAt.findViewById(com.tencent.mm.R.id.chi);
                    if ((findViewById2 instanceof android.view.ViewGroup) && ((android.view.ViewGroup) findViewById2).getChildCount() > 0) {
                        android.view.View childAt2 = ((android.view.ViewGroup) findViewById2).getChildAt(0);
                        if (!ca4.m0.n()) {
                            int i17 = 0;
                            for (int i18 = 0; i18 < ((android.view.ViewGroup) findViewById2).getChildCount(); i18++) {
                                android.view.View childAt3 = ((android.view.ViewGroup) findViewById2).getChildAt(i18);
                                if (childAt3 != null) {
                                    int height = childAt3.getHeight();
                                    i17 += height;
                                    com.tencent.mars.xlog.Log.i("AdLandingFloatWebView", "OnGlobalLayoutListener rv: child: " + i18 + " height: " + height);
                                }
                            }
                            com.tencent.mars.xlog.Log.i("AdLandingFloatWebView", "OnGlobalLayoutListener rv:  " + findViewById2.getHeight());
                            if (childAt2 != null) {
                                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0.P(k0Var, childAt2.getWidth(), i17);
                            }
                        } else if (childAt2 != null) {
                            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0.P(k0Var, childAt2.getWidth(), childAt2.getHeight());
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$VOnGlobalLayoutListener");
    }
}
