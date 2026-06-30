package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsAdTouchProgressView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f170831d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f170832e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f170833f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Handler f170834g;

    /* renamed from: h, reason: collision with root package name */
    public int f170835h;

    /* renamed from: i, reason: collision with root package name */
    public int f170836i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.b1 f170837m;

    public SnsAdTouchProgressView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170832e = false;
        this.f170833f = false;
        this.f170835h = 500;
        this.f170836i = 500;
        a(context);
    }

    public void a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        this.f170834g = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f170835h = android.view.ViewConfiguration.getLongPressTimeout();
        com.tencent.mars.xlog.Log.i("SnsAdTouchProgressView", "init, longPressTimeout=" + this.f170835h);
        if (this.f170835h < 500) {
            this.f170835h = 500;
        }
        this.f170836i = this.f170835h;
        this.f170831d = new android.view.GestureDetector(context, new com.tencent.mm.plugin.sns.ui.widget.a1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        super.dispatchDraw(canvas);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    public int getLongPressTime() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLongPressTime", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        int i17 = this.f170835h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLongPressTime", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        return i17;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.widget.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        int action = motionEvent.getAction();
        android.view.GestureDetector gestureDetector = this.f170831d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (action == 0) {
            this.f170832e = false;
        } else if (action == 1 || action == 3) {
            com.tencent.mars.xlog.Log.i("SnsAdTouchProgressView", "onTouchEvent cancel， action=" + action + ", IsLongClicked=" + this.f170833f + ", isSuccFinish=" + this.f170832e);
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f170834g.removeCallbacksAndMessages(null);
            if (!this.f170832e && this.f170833f && (b1Var = this.f170837m) != null) {
                b1Var.onCancel();
            }
            this.f170833f = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
            com.tencent.mars.xlog.Log.i("SnsAdTouchProgressView", "clear");
            this.f170834g.removeCallbacksAndMessages(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        return onTouchEvent;
    }

    public void setActionListener(com.tencent.mm.plugin.sns.ui.widget.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        this.f170837m = b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    public void setPressDuration(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPressDuration", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        com.tencent.mars.xlog.Log.i("SnsAdTouchProgressView", "setPressDuration:" + i17);
        int i18 = this.f170835h;
        if (i17 < i18) {
            i17 = i18;
        }
        this.f170836i = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPressDuration", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    public SnsAdTouchProgressView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170832e = false;
        this.f170833f = false;
        this.f170835h = 500;
        this.f170836i = 500;
        a(context);
    }
}
