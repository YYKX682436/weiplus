package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class t5 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f165510s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f165511t;

    public t5(android.content.Context context, ab4.s0 s0Var, android.view.ViewGroup viewGroup) {
        super(context, s0Var, viewGroup);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        this.f165510s = (android.widget.FrameLayout) this.f165056n;
        com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(this.f165049d);
        this.f165511t = a17;
        this.f165510s.addView(a17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public android.view.View j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f165049d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        return frameLayout;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        this.f165511t.setVerticalScrollBarEnabled(false);
        this.f165511t.setHorizontalScrollBarEnabled(false);
        this.f165511t.getSettings().E(true);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f165511t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        ab4.s0 s0Var = (ab4.s0) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        mMWebView.loadUrl(s0Var.F);
        this.f165511t.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f165511t.setVisibility(0);
        android.widget.FrameLayout frameLayout = this.f165510s;
        int paddingLeft = frameLayout.getPaddingLeft();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        ab4.s0 s0Var2 = (ab4.s0) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        int i17 = (int) s0Var2.f2819f;
        int paddingRight = this.f165510s.getPaddingRight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        ab4.s0 s0Var3 = (ab4.s0) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        frameLayout.setPadding(paddingLeft, i17, paddingRight, (int) s0Var3.f2820g);
        this.f165510s.setLayoutParams(new android.widget.LinearLayout.LayoutParams(this.f165058p, this.f165059q));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageH5Component");
        return Integer.MAX_VALUE;
    }
}
