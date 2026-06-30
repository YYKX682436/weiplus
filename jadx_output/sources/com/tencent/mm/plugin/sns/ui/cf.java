package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class cf implements com.tencent.mm.ui.tools.o4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f168125c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f168126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f168127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBrowseUI f168128f;

    public cf(com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI, android.view.View view, android.view.View view2, int i17, int i18, float f17) {
        this.f168128f = snsBrowseUI;
        this.f168123a = view;
        this.f168124b = view2;
        this.f168125c = i17;
        this.f168126d = i18;
        this.f168127e = f17;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5");
    }

    @Override // com.tencent.mm.ui.tools.o4
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = this.f168128f;
        boolean z17 = snsBrowseUI.K1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (z17) {
            android.view.KeyEvent.Callback callback = this.f168123a;
            if (callback instanceof db5.f0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                int i18 = snsBrowseUI.M1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                int i19 = snsBrowseUI.M1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                android.view.View view = this.f168124b;
                view.setTranslationX(i18 + ((this.f168125c - i19) * f17));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                int i27 = snsBrowseUI.N1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                int i28 = snsBrowseUI.N1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                view.setTranslationY(i27 + ((this.f168126d - i28) * f17));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                int i29 = snsBrowseUI.f166826l1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                view.setPivotX(i29 / 2);
                view.setPivotY(com.tencent.mm.plugin.sns.ui.SnsBrowseUI.s7(snsBrowseUI) / 2);
                float r76 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.r7(snsBrowseUI);
                float r77 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.r7(snsBrowseUI);
                float f18 = this.f168127e;
                view.setScaleX(r76 + ((f18 - r77) * f17));
                view.setScaleY(com.tencent.mm.plugin.sns.ui.SnsBrowseUI.r7(snsBrowseUI) + ((f18 - com.tencent.mm.plugin.sns.ui.SnsBrowseUI.r7(snsBrowseUI)) * f17));
                ((db5.f0) callback).n(1.0f - f17, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = this.f168128f;
        snsBrowseUI.O1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.u7(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.sdk.platformtools.n3 n3Var = snsBrowseUI.B1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        n3Var.post(new com.tencent.mm.plugin.sns.ui.bf(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5");
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = this.f168128f;
        snsBrowseUI.f166810o.n0();
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        boolean z17 = snsBrowseUI.K1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            com.tencent.mm.sdk.platformtools.n3 n3Var = snsBrowseUI.B1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            n3Var.postDelayed(new com.tencent.mm.plugin.sns.ui.af(this), 20L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$5");
    }
}
