package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hy implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.TouchImageView f168545d;

    public hy(com.tencent.mm.plugin.sns.ui.TouchImageView touchImageView) {
        this.f168545d = touchImageView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.TouchImageView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TouchImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.TouchImageView.f167646m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        com.tencent.mm.plugin.sns.ui.TouchImageView touchImageView = this.f168545d;
        boolean z17 = touchImageView.f167652i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        boolean z18 = false;
        if (!z17) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/TouchImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.TouchImageView$2");
            return false;
        }
        touchImageView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            touchImageView.f167647d.removeCallbacks(touchImageView.f167648e);
        } else if (action == 1 || action == 3) {
            touchImageView.f167647d.post(touchImageView.f167648e);
        }
        if (!touchImageView.isClickable() && !touchImageView.isLongClickable()) {
            z18 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        yj0.a.i(z18, this, "com/tencent/mm/plugin/sns/ui/TouchImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.TouchImageView$2");
        return z18;
    }
}
