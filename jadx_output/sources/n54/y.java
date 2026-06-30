package n54;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout f335161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout) {
        super(3);
        this.f335161d = scrollableFrameLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$toTop$1");
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$toTop$1");
        kotlin.jvm.internal.o.g((n54.o) obj, "<anonymous parameter 0>");
        n54.o oVar = n54.o.f335146e;
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout = this.f335161d;
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout.c(scrollableFrameLayout, oVar, intValue);
        n54.t uiEventListener = scrollableFrameLayout.getUiEventListener();
        if (!scrollableFrameLayout.getHasArrivedTop() && uiEventListener != null) {
            uiEventListener.a();
        }
        scrollableFrameLayout.setHasArrivedTop(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$toTop$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$toTop$1");
        return f0Var;
    }
}
