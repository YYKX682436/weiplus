package tk4;

/* loaded from: classes5.dex */
public final class v implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f420014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f420015e;

    public v(tk4.c0 c0Var, android.view.View view) {
        this.f420014d = c0Var;
        this.f420015e = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$show$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        boolean z17 = false;
        tk4.c0 c0Var = this.f420014d;
        if (action == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f420015e.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            c0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioPush.TipsManager", "onDown: ");
            c0Var.f419970h = motionEvent.getRawY();
            c0Var.f419969g = ((android.view.WindowManager.LayoutParams) layoutParams).y;
        } else if (action == 1 || action == 3) {
            c0Var.getClass();
            int rawY = c0Var.f419969g + ((int) (motionEvent.getRawY() - c0Var.f419970h));
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioPush.TipsManager", "onDragFinish: " + rawY);
            if (!c0Var.f419967e) {
                float rawY2 = motionEvent.getRawY();
                int i17 = c0Var.f419969g;
                if (((int) (rawY2 - c0Var.f419970h)) + i17 <= i17) {
                    float rawY3 = motionEvent.getRawY();
                    int i18 = c0Var.f419969g;
                    android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(((int) (rawY3 - c0Var.f419970h)) + i18, i18);
                    android.view.View view2 = c0Var.f419964b;
                    if (view2 != null) {
                        ofInt.addListener(new tk4.t(rawY, view2));
                        ofInt.addUpdateListener(new tk4.u(view2, c0Var));
                    }
                    ofInt.setDuration(300L);
                    ofInt.start();
                }
            }
            c0Var.f419967e = false;
        }
        android.view.GestureDetector gestureDetector = c0Var.f419966d;
        if (gestureDetector != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(motionEvent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$show$1$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z17 = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
            yj0.a.g(gestureDetector, z17, "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$show$1$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        boolean z18 = z17;
        yj0.a.i(z18, this, "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$show$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z18;
    }
}
