package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f165344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 f165345e;

    public m1(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var, int i17) {
        this.f165345e = v0Var;
        this.f165344d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$8");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var = this.f165345e;
        android.view.View view = v0Var.f165056n;
        if (view != null && (i17 = this.f165344d) >= 0) {
            try {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int o17 = (int) za4.z0.o(i17, 1, 750, 1);
                com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "adJuestHeight, curH=" + layoutParams.height + ", newH=" + i17 + ", newPx=" + o17);
                if (layoutParams.height != o17) {
                    ((ab4.v0) v0Var.y()).f2824n = o17;
                    v0Var.g();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "adJuestHeight exp=" + e17.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$8");
    }
}
