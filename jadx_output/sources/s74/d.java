package s74;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f404236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f404237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s74.o0 o0Var, kotlin.jvm.internal.h0 h0Var, android.widget.FrameLayout frameLayout, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        super(0);
        this.f404235d = o0Var;
        this.f404236e = h0Var;
        this.f404237f = frameLayout;
        this.f404238g = snsInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup.MarginLayoutParams layoutParams;
        s74.g3 b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$1");
        s74.f3 D = this.f404235d.D();
        if (D != null) {
            kotlin.jvm.internal.h0 h0Var = this.f404236e;
            s74.o0 o0Var = this.f404235d;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404238g;
            if (h0Var.f310123d != null && o0Var.H() == 0) {
                s74.a4 a17 = s74.a4.f404208e.a();
                java.lang.String snsId = snsInfo.getSnsId();
                if (snsId == null) {
                    snsId = "";
                }
                s74.r4 r4Var = new s74.r4((s74.j3) h0Var.f310123d, D, snsInfo.getAdXml().xml);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cacheViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                synchronized (a17.f404210a) {
                    try {
                        if (a17.f404210a.size() >= 5) {
                            com.tencent.mars.xlog.Log.w("DynamicView.Preloader", "cacheViewById but size > 5! : ".concat(snsId));
                        } else if (a17.d()) {
                            com.tencent.mars.xlog.Log.e("DynamicView.Preloader", "context is finishing when cache");
                        } else {
                            com.tencent.mars.xlog.Log.i("DynamicView.Preloader", "cacheViewById: ".concat(snsId));
                            a17.f404210a.put(snsId, r4Var);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cacheViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                    } finally {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cacheViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                    }
                }
            }
        }
        java.lang.String j17 = this.f404235d.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add a view ");
        s74.j3 j3Var = (s74.j3) this.f404236e.f310123d;
        sb6.append(j3Var != null ? j3Var.c() : null);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        android.widget.FrameLayout frameLayout = this.f404237f;
        s74.j3 j3Var2 = (s74.j3) this.f404236e.f310123d;
        android.view.View c17 = j3Var2 != null ? j3Var2.c() : null;
        s74.j3 j3Var3 = (s74.j3) this.f404236e.f310123d;
        if (j3Var3 == null || (b17 = j3Var3.b()) == null) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(this.f404235d.B(), -2);
        } else {
            layoutParams = b17.k();
            s74.o0 o0Var2 = this.f404235d;
            if (layoutParams.width == -2) {
                layoutParams.width = o0Var2.B();
            }
        }
        frameLayout.addView(c17, 0, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$1");
        return f0Var;
    }
}
