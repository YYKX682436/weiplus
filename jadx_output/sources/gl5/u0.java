package gl5;

/* loaded from: classes5.dex */
public final class u0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f273100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f273101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273102f;

    public u0(android.view.View view, gl5.d1 d1Var) {
        this.f273101e = view;
        this.f273102f = d1Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f273100d = motionEvent.getRawY();
        } else {
            float f17 = 0.0f;
            gl5.d1 d1Var = this.f273102f;
            android.view.View view2 = this.f273101e;
            if (valueOf != null && valueOf.intValue() == 2) {
                float rawY = motionEvent.getRawY() - this.f273100d;
                int height = view2.getHeight() / 2;
                d1Var.f272925b.getSelectHelper().a();
                if (rawY > 0.0f) {
                    f17 = height;
                    if (rawY < f17) {
                        f17 = rawY;
                    }
                }
                view2.setTranslationY(f17);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                int height2 = view2.getHeight() / 8;
                float translationY = view2.getTranslationY();
                if (translationY > height2) {
                    d1Var.b();
                } else {
                    if (translationY < ((java.lang.Number) ((jz5.n) d1Var.f272934k).getValue()).intValue() && view != null) {
                        view.performClick();
                    }
                    view2.animate().translationY(0.0f).start();
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
