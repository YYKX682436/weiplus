package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes14.dex */
public class t0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.AsyncMaskImageView f170492d;

    public t0(com.tencent.mm.plugin.sns.ui.AsyncMaskImageView asyncMaskImageView) {
        this.f170492d = asyncMaskImageView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/AsyncMaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.AsyncMaskImageView.f166213h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        com.tencent.mm.plugin.sns.ui.AsyncMaskImageView asyncMaskImageView = this.f170492d;
        boolean z17 = asyncMaskImageView.f166217g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        boolean z18 = false;
        if (!z17) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/AsyncMaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$2");
            return false;
        }
        asyncMaskImageView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            asyncMaskImageView.f166214d.removeCallbacks(asyncMaskImageView.f166215e);
        } else if (action == 1 || action == 3) {
            asyncMaskImageView.f166214d.post(asyncMaskImageView.f166215e);
        }
        if (!asyncMaskImageView.isClickable() && !asyncMaskImageView.isLongClickable()) {
            z18 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        yj0.a.i(z18, this, "com/tencent/mm/plugin/sns/ui/AsyncMaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$2");
        return z18;
    }
}
