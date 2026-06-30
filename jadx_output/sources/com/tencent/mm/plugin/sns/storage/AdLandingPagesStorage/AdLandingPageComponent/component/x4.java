package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class x4 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a {

    /* renamed from: s, reason: collision with root package name */
    public ab4.b0 f165804s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f165805t;

    /* renamed from: u, reason: collision with root package name */
    public za4.m1 f165806u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.base.CustomScrollView f165807v;

    public x4(android.content.Context context, ab4.b0 b0Var, android.view.ViewGroup viewGroup) {
        super(context, b0Var, viewGroup);
        this.f165804s = b0Var;
        this.f165805t = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void H(ab4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        if (d0Var instanceof ab4.b0) {
            this.f165804s = (ab4.b0) d0Var;
        }
        super.H(d0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        java.util.Iterator it = ((java.util.ArrayList) this.f165805t).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next();
            if (a2Var.A()) {
                a2Var.J();
            }
        }
        super.J();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        java.util.Iterator it = ((java.util.ArrayList) this.f165805t).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next();
            if (a2Var.A()) {
                a2Var.K();
            }
        }
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        super.L();
        java.util.Iterator it = ((java.util.ArrayList) this.f165805t).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next()).L();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        java.util.Iterator it = ((java.util.ArrayList) this.f165805t).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next()).M();
        }
        super.M();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a
    public java.util.List O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f165806u.a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a
    public void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        java.util.Iterator it = ((java.util.ArrayList) this.f165805t).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next();
            if (a2Var.A()) {
                a2Var.K();
                a2Var.J();
            } else {
                a2Var.M();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public android.view.View j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        android.content.Context context = this.f165049d;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = new com.tencent.mm.ui.widget.RoundedCornerFrameLayout(context);
        com.tencent.mm.ui.base.CustomScrollView customScrollView = new com.tencent.mm.ui.base.CustomScrollView(context);
        this.f165807v = customScrollView;
        customScrollView.setOverScrollMode(2);
        this.f165807v.setHorizontalScrollBarEnabled(false);
        this.f165807v.setVerticalScrollBarEnabled(false);
        this.f165807v.setOnScrollChangeListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w4(this));
        roundedCornerFrameLayout.setBackgroundColor(this.f165051f);
        roundedCornerFrameLayout.addView(this.f165807v);
        roundedCornerFrameLayout.setRadius(this.f165804s.G);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        return roundedCornerFrameLayout;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
        za4.m1 m1Var = this.f165806u;
        if (m1Var == null) {
            za4.m1 m1Var2 = new za4.m1(this.f165804s.F, this.f165049d, 0, this.f165807v);
            this.f165806u = m1Var2;
            m1Var2.b();
            this.f165805t = O();
        } else {
            m1Var.c(this.f165804s.F);
        }
        if (s() == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ab4.d0 d0Var = this.f165050e;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) d0Var.f2821h, (int) d0Var.f2819f, (int) d0Var.f2822i, (int) d0Var.f2820g);
            }
            this.f165056n.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLayout");
    }
}
