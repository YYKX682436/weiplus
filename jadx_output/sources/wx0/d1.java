package wx0;

/* loaded from: classes2.dex */
public final class d1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView f450469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f450471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f450472g;

    public d1(com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView selectorView, int i17, android.view.View view, int i18) {
        this.f450469d = selectorView;
        this.f450470e = i17;
        this.f450471f = view;
        this.f450472g = i18;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SelectorView$showView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            view.performClick();
            int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView.f69668e;
            this.f450469d.setVisibility(4);
        }
        if (this.f450470e <= motionEvent.getRawX()) {
            float rawX = motionEvent.getRawX();
            android.view.View view2 = this.f450471f;
            if (rawX <= r7 + view2.getWidth()) {
                if (this.f450472g <= motionEvent.getRawY() && motionEvent.getRawY() <= r7 + view2.getHeight()) {
                    z17 = true;
                    yj0.a.i(z17, this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SelectorView$showView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return z17;
                }
            }
        }
        z17 = false;
        yj0.a.i(z17, this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SelectorView$showView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
