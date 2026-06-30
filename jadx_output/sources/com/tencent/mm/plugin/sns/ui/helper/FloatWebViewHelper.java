package com.tencent.mm.plugin.sns.ui.helper;

/* loaded from: classes4.dex */
public final class FloatWebViewHelper implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final ab4.f f168500d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 f168501e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f168502f;

    private FloatWebViewHelper(ab4.f fVar, android.view.ViewGroup viewGroup) {
        this.f168500d = fVar;
        this.f168502f = viewGroup;
    }

    public static com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper b(ab4.f fVar, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper floatWebViewHelper = new com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper(fVar, viewGroup);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        return floatWebViewHelper;
    }

    public final void a() {
        ab4.f fVar;
        android.view.View x17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        android.view.ViewGroup viewGroup = this.f168502f;
        if (viewGroup != null && (fVar = this.f168500d) != null) {
            this.f168501e = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0(viewGroup.getContext(), fVar, viewGroup);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachToParent", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 k0Var = this.f168501e;
            if (k0Var != null && (x17 = k0Var.x()) != null && viewGroup != null) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) x17.getParent();
                if (viewGroup2 == null) {
                    viewGroup.addView(x17, viewGroup.getChildCount() - 1);
                } else if (viewGroup2 != viewGroup) {
                    viewGroup2.removeView(x17);
                    viewGroup.addView(x17, viewGroup.getChildCount() - 1);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachToParent", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_CREATE)
    public void onCreate(androidx.lifecycle.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            if (this.f168500d != null) {
                a();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 k0Var = this.f168501e;
            if (k0Var != null) {
                k0Var.L();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onPause(androidx.lifecycle.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 k0Var = this.f168501e;
            if (k0Var != null) {
                k0Var.M();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onResume(androidx.lifecycle.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 k0Var = this.f168501e;
            if (k0Var != null) {
                k0Var.K();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }
}
