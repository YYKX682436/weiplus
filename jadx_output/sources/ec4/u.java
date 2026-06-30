package ec4;

/* loaded from: classes10.dex */
public final class u extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.d0 f251187d;

    public u(ec4.d0 d0Var) {
        this.f251187d = d0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onContextClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onContextClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        ec4.d0.S6(this.f251187d, true);
        super.onLongPress(e17);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        kotlin.jvm.internal.o.g(e27, "e2");
        float rawX = e27.getRawX();
        kotlin.jvm.internal.o.d(motionEvent);
        float rawX2 = rawX - motionEvent.getRawX();
        float rawY = e27.getRawY() - motionEvent.getRawY();
        float abs = java.lang.Math.abs(rawX2);
        ec4.d0 d0Var = this.f251187d;
        if (abs <= ec4.d0.P6(d0Var).getWidth() && java.lang.Math.abs(rawY) <= ec4.d0.P6(d0Var).getHeight() && ec4.d0.Q6(d0Var)) {
            ec4.d0.R6(d0Var).setTranslationX(rawX2);
            ec4.d0.R6(d0Var).setTranslationY(rawY);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        ec4.d0 d0Var = this.f251187d;
        boolean z17 = d0Var.f251130p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        if (!z17) {
            d0Var.V6(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoAniUIC$onCreate$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$onCreate$1");
        return onSingleTapUp;
    }
}
