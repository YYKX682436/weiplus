package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class TestTimeForSns extends android.widget.FrameLayout {
    public final boolean DEBUG;
    public final java.lang.String TAG;
    private byte _hellAccFlag_;
    public long beginTime;
    private boolean hasDrawed;
    private com.tencent.mm.plugin.sns.ui.ew listener;
    private ad4.f util;

    public TestTimeForSns(android.content.Context context) {
        super(context);
        this.DEBUG = true;
        this.TAG = "MicroMsg.TestTimeForSns";
        this.util = new ad4.f(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        super.dispatchDraw(canvas);
        if (!this.hasDrawed) {
            this.hasDrawed = true;
        }
        com.tencent.mm.plugin.report.service.f0.b(10);
        com.tencent.mm.plugin.report.service.f0.b(22);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        ad4.f fVar = this.util;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGestureDetector", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil");
        android.view.GestureDetector gestureDetector = fVar.f3182b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGestureDetector", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/TestTimeForSns", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/sns/ui/TestTimeForSns", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        return dispatchTouchEvent;
    }

    public boolean hasDrawed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasDrawed", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        boolean z17 = this.hasDrawed;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasDrawed", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        return z17;
    }

    public void setListener(com.tencent.mm.plugin.sns.ui.ew ewVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
    }

    public TestTimeForSns(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.DEBUG = true;
        this.TAG = "MicroMsg.TestTimeForSns";
        this.util = new ad4.f(getContext());
    }
}
