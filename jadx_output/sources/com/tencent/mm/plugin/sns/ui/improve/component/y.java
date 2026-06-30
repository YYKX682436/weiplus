package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class y implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.z f169057d;

    public y(com.tencent.mm.plugin.sns.ui.improve.component.z zVar) {
        this.f169057d = zVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.plugin.sns.ui.improve.component.z zVar = this.f169057d;
        zVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
        zVar.f169061d = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        kotlin.jvm.internal.o.g(e27, "e2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/ImproveFixUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveFixUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        kotlin.jvm.internal.o.g(e27, "e2");
        com.tencent.mm.plugin.sns.ui.improve.component.z zVar = this.f169057d;
        zVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
        boolean z17 = zVar.f169061d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
            zVar.f169061d = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedFixRVScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager layoutManager = zVar.getLayoutManager();
            layoutManager.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFixScrollDistance", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager");
            layoutManager.f169149w = (int) f18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFixScrollDistance", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/ImproveFixUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveFixUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC$gestureDetector$1");
        return false;
    }
}
