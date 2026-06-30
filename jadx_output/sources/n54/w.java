package n54;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout f335159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout) {
        super(3);
        this.f335159d = scrollableFrameLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$showWithAnimation$1");
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$showWithAnimation$1");
        kotlin.jvm.internal.o.g((n54.o) obj, "<anonymous parameter 0>");
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout.c(this.f335159d, n54.o.f335147f, intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$showWithAnimation$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$showWithAnimation$1");
        return f0Var;
    }
}
