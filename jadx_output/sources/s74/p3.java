package s74;

/* loaded from: classes4.dex */
public final class p3 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(android.content.Context context, s74.f3 f3Var) {
        super(context);
        this.f404491d = f3Var;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createMainElement$layout$1");
        if (this.f404491d.i() >= 101) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createMainElement$layout$1");
            return true;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createMainElement$layout$1");
        return onInterceptTouchEvent;
    }
}
