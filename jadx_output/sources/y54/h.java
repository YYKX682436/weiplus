package y54;

/* loaded from: classes8.dex */
public final class h implements n54.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI f459543a;

    public h(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        this.f459543a = adHalfScreenPageUI;
    }

    public void a(n54.p gestureEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("containerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$3");
        kotlin.jvm.internal.o.g(gestureEvent, "gestureEvent");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459543a;
        if (adHalfScreenPageUI.getF65848t()) {
            if (gestureEvent == n54.p.f335152f) {
                com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = adHalfScreenPageUI.getSwipeBackLayout();
                if (swipeBackLayout != null) {
                    swipeBackLayout.setEnableGesture(true);
                }
            } else {
                com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout2 = adHalfScreenPageUI.getSwipeBackLayout();
                if (swipeBackLayout2 != null) {
                    swipeBackLayout2.setEnableGesture(false);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$3");
    }
}
