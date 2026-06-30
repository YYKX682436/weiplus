package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class a1 implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView f170923d;

    public a1(com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView snsAdTouchProgressView) {
        this.f170923d = snsAdTouchProgressView;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView$1", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        com.tencent.mars.xlog.Log.i("SnsAdTouchProgressView", if1.m.NAME);
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView snsAdTouchProgressView = this.f170923d;
        snsAdTouchProgressView.getParent().requestDisallowInterceptTouchEvent(true);
        snsAdTouchProgressView.f170833f = true;
        com.tencent.mm.plugin.sns.ui.widget.b1 b1Var = snsAdTouchProgressView.f170837m;
        if (b1Var != null) {
            b1Var.onStart();
        }
        int i17 = snsAdTouchProgressView.f170836i - snsAdTouchProgressView.f170835h;
        if (i17 < 0) {
            i17 = 0;
        }
        snsAdTouchProgressView.f170834g.postDelayed(new com.tencent.mm.plugin.sns.ui.widget.z0(this), i17);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView$1", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView snsAdTouchProgressView = this.f170923d;
        com.tencent.mm.plugin.sns.ui.widget.b1 b1Var = snsAdTouchProgressView.f170837m;
        if (b1Var != null) {
            b1Var.onClick(snsAdTouchProgressView);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        return true;
    }
}
