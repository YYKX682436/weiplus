package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class o0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView f171238d;

    public o0(com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        this.f171238d = snsAdLandingPageFloatView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = this.f171238d;
        android.graphics.Rect rect = new android.graphics.Rect(com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.d(snsAdLandingPageFloatView).x().getLeft(), com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.d(snsAdLandingPageFloatView).x().getTop(), com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.d(snsAdLandingPageFloatView).x().getRight(), com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.d(snsAdLandingPageFloatView).x().getBottom());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdLandingPageFloatView", "view area %s, (%f,%f)", rect, java.lang.Float.valueOf(motionEvent.getX()), java.lang.Float.valueOf(motionEvent.getY()));
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$6");
            return false;
        }
        if (motionEvent.getActionMasked() == 1) {
            snsAdLandingPageFloatView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (!snsAdLandingPageFloatView.f170807n) {
                snsAdLandingPageFloatView.f170811r.start();
                snsAdLandingPageFloatView.f170807n = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$6");
        return true;
    }
}
