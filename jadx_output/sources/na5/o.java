package na5;

/* loaded from: classes.dex */
public final class o implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public static final na5.o f336015d = new na5.o();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean performClick = motionEvent.getAction() == 1 ? view.performClick() : false;
        yj0.a.i(performClick, this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return performClick;
    }
}
