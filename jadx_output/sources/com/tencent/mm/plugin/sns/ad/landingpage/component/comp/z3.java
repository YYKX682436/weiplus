package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class z3 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {

    /* renamed from: s, reason: collision with root package name */
    public final f54.f0 f162995s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f162996t;

    public z3(android.content.Context context, f54.f0 f0Var, android.view.ViewGroup viewGroup) {
        super(context, f0Var, viewGroup);
        this.f162995s = f0Var;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        if (this.f165056n == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingSeparatorComponent", "setPadding but contentView is null");
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ab4.d0 d0Var = this.f165050e;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) d0Var.f2821h, (int) d0Var.f2819f, (int) d0Var.f2822i, (int) d0Var.f2820g);
        }
        this.f165056n.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public android.view.View j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f165049d);
        this.f162996t = frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        return frameLayout;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        if (this.f162996t == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingSeparatorComponent", "fillItem but layout is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
            return;
        }
        f54.f0 f0Var = this.f162995s;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingSeparatorComponent", "fillItem but info is null");
        }
        try {
            this.f162996t.setBackgroundColor(android.graphics.Color.parseColor(f0Var.F));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingSeparatorComponent", "fillItem but exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
    }
}
