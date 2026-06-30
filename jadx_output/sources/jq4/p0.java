package jq4;

/* loaded from: classes3.dex */
public final class p0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f301183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301184e;

    public p0(jq4.z0 z0Var, android.view.View view) {
        this.f301183d = z0Var;
        this.f301184e = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        boolean z17 = false;
        jq4.z0 z0Var = this.f301183d;
        if (action == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f301184e.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            z0Var.getClass();
            com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "onDown: ");
            z0Var.f301246o = motionEvent.getRawY();
            z0Var.f301245n = ((android.view.WindowManager.LayoutParams) layoutParams).y;
        } else if (action == 1 || action == 3) {
            z0Var.getClass();
            int g17 = z0Var.g(motionEvent.getRawY());
            com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "onDragFinish: " + g17);
            if (z0Var.f301243l || z0Var.g(motionEvent.getRawY()) > z0Var.f301245n) {
                z0Var.f301243l = false;
            } else {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(z0Var.g(motionEvent.getRawY()), z0Var.f301245n);
                android.view.View view2 = z0Var.f301236e;
                if (view2 != null) {
                    ofInt.addListener(new jq4.r0(g17, view2, z0Var));
                    ofInt.addUpdateListener(new jq4.s0(view2, z0Var));
                }
                ofInt.setDuration(300L);
                ofInt.start();
            }
        }
        android.view.GestureDetector gestureDetector = z0Var.f301252u;
        if (gestureDetector != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(motionEvent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$6", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z17 = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
            yj0.a.g(gestureDetector, z17, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$6", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        boolean z18 = z17;
        yj0.a.i(z18, this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$initView$1$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z18;
    }
}
