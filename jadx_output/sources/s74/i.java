package s74;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f404334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f404335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f404337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f404338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f404339i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i17, r45.jj4 jj4Var, s74.o0 o0Var, int i18, kotlin.jvm.internal.h0 h0Var, android.widget.FrameLayout frameLayout) {
        super(0);
        this.f404334d = i17;
        this.f404335e = jj4Var;
        this.f404336f = o0Var;
        this.f404337g = i18;
        this.f404338h = h0Var;
        this.f404339i = frameLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17;
        android.widget.FrameLayout n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3");
        r45.jj4 jj4Var = this.f404335e;
        s74.o0 o0Var = this.f404336f;
        int i17 = this.f404334d;
        if ((i17 == 5 || i17 == 15) && jj4Var != null) {
            o0Var.C().b().setVisibility(0);
            com.tencent.mm.plugin.sns.ui.MaskImageView F = o0Var.F();
            if (F != null) {
                F.settouchEnable(false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            o0Var.f404455v = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        } else {
            o0Var.C().b().setVisibility(8);
            com.tencent.mm.plugin.sns.ui.MaskImageView F2 = o0Var.F();
            if (F2 != null) {
                F2.settouchEnable(true);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            o0Var.f404455v = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMIsVideoStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        android.view.ViewParent parent = o0Var.C().c().getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(o0Var.C().c());
        }
        int i18 = this.f404337g;
        r45.lj4 lj4Var = jj4Var.f377865p;
        float f18 = (i18 * lj4Var.f379521e) / lj4Var.f379520d;
        s74.f3 D = o0Var.D();
        if (D != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f17 = D.B;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        } else {
            f17 = -1.0f;
        }
        if (f17 > 0.0f) {
            s74.f3 D2 = o0Var.D();
            if (D2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                f18 = D2.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            } else {
                f18 = -1.0f;
            }
        }
        com.tencent.mars.xlog.Log.i(o0Var.j(), "init mainContainer size, w=" + i18 + ", h=" + f18);
        s74.f3 D3 = o0Var.D();
        if (D3 != null && (n17 = D3.n()) != null) {
            n17.addView(o0Var.C().c(), i18, (int) f18);
        }
        s74.f3 D4 = o0Var.D();
        if ((D4 != null ? D4.i() : 0) >= 101) {
            android.view.ViewGroup.LayoutParams layoutParams = o0Var.C().c().getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = 17;
            }
            o0Var.C().c().requestLayout();
        }
        s74.f3 D5 = o0Var.D();
        int i19 = D5 != null ? D5.i() : 0;
        kotlin.jvm.internal.h0 h0Var = this.f404338h;
        if (i19 < 101) {
            s74.o0.y(o0Var, (s74.j3) h0Var.f310123d);
            if (o0Var.H() != 0) {
                java.lang.Object e17 = o0Var.C().e();
                android.widget.FrameLayout frameLayout = this.f404339i;
                frameLayout.setTag(e17);
                com.tencent.mm.plugin.sns.ui.listener.i f19 = o0Var.C().f();
                frameLayout.setOnClickListener(f19 != null ? f19.T : null);
            }
            com.tencent.mm.plugin.sns.ui.MaskImageView F3 = o0Var.F();
            if (F3 != null) {
                F3.setTag(o0Var.C().e());
            }
            com.tencent.mm.plugin.sns.ui.MaskImageView F4 = o0Var.F();
            if (F4 != null) {
                F4.setOnClickListener(new s74.f(o0Var));
            }
            o0Var.C().b().setTag(o0Var.C().e());
            o0Var.C().b().setOnClickListener(new s74.g(o0Var));
        } else {
            s74.h hVar = new s74.h(o0Var, h0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runWithSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            hVar.invoke();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runWithSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3");
        return f0Var;
    }
}
