package hg5;

/* loaded from: classes8.dex */
public final class i implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f281413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg5.j f281414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f281415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f281416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f281417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f281418i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f281419m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f281420n;

    public i(android.view.View view, hg5.j jVar, kotlin.jvm.internal.g0 g0Var, float f17, android.view.View view2, boolean z17, android.view.View view3, int i17) {
        this.f281413d = view;
        this.f281414e = jVar;
        this.f281415f = g0Var;
        this.f281416g = f17;
        this.f281417h = view2;
        this.f281418i = z17;
        this.f281419m = view3;
        this.f281420n = i17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        float f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.View view2 = this.f281413d;
        if (view2 != null) {
            view2.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        kotlin.jvm.internal.g0 g0Var = this.f281415f;
        hg5.j jVar = this.f281414e;
        if (action != 0) {
            android.view.View view3 = this.f281419m;
            if (action == 1) {
                if (java.lang.System.currentTimeMillis() - g0Var.f310121d < 350) {
                    this.f281417h.performClick();
                }
                jVar.b(view3, this.f281420n);
                jVar.f281422b = 0.0f;
                jVar.f281424d = 0.0f;
                android.view.View view4 = this.f281417h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (action == 2) {
                if (jVar.f281423c == 0.0f) {
                    g0Var.f310121d = java.lang.System.currentTimeMillis();
                    jVar.f281423c = motionEvent.getRawY();
                    jVar.f281425e = motionEvent.getRawX();
                }
                jVar.f281425e = motionEvent.getRawX();
                jVar.f281423c = motionEvent.getRawY();
                float f18 = jVar.f281423c - jVar.f281422b;
                float f19 = jVar.f281425e - jVar.f281424d;
                if (this.f281418i) {
                    float f27 = jVar.f281426f;
                    float f28 = f18 + f27;
                    f17 = f28 >= 0.0f ? f28 : 0.0f;
                    if (!(f17 == f27)) {
                        jVar.f281426f = f17;
                        view3.setTranslationY(f17);
                    }
                } else {
                    float f29 = jVar.f281427g;
                    float f37 = f19 + f29;
                    f17 = f37 >= 0.0f ? f37 : 0.0f;
                    if (!(f17 == f29)) {
                        jVar.f281427g = f17;
                        view3.setTranslationX(f17);
                    }
                }
                jVar.f281422b = jVar.f281423c;
                jVar.f281424d = jVar.f281425e;
            }
        } else {
            jVar.f281422b = motionEvent.getRawY();
            jVar.f281424d = motionEvent.getRawX();
            g0Var.f310121d = java.lang.System.currentTimeMillis();
            float f38 = this.f281416g;
            if (!(f38 == 1.0f)) {
                android.view.View view5 = this.f281417h;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(f38));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view5.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view5, "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
