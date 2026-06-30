package sr2;

/* loaded from: classes5.dex */
public final class s0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f411708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411709e;

    public s0(android.view.View view, sr2.w0 w0Var) {
        this.f411708d = view;
        this.f411709e = w0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostEditUIC$setOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (kotlin.jvm.internal.o.b(view, this.f411708d)) {
            int actionMasked = motionEvent.getActionMasked();
            sr2.w0 w0Var = this.f411709e;
            if (actionMasked == 0) {
                w0Var.Z6().requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked == 1 || actionMasked == 3) {
                w0Var.Z6().requestDisallowInterceptTouchEvent(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/post/PostEditUIC$setOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
