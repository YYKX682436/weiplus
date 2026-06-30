package ng3;

/* loaded from: classes10.dex */
public final class k extends ng3.e {

    /* renamed from: c, reason: collision with root package name */
    public android.view.VelocityTracker f337009c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.GestureDetector f337010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context) {
        super("move");
        kotlin.jvm.internal.o.g(context, "context");
        this.f337010d = new android.view.GestureDetector(context, new ng3.j(this));
    }

    @Override // ng3.e
    public boolean b(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((java.util.ArrayList) this.f337005b).clear();
        if (this.f337009c == null) {
            this.f337009c = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f337009c;
        if (velocityTracker == null) {
            return false;
        }
        velocityTracker.addMovement(android.view.MotionEvent.obtain(event));
        velocityTracker.computeCurrentVelocity(1000);
        android.view.GestureDetector gestureDetector = this.f337010d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(event);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/media/view/gesture/controller/MoveController", "handleSyncTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/media/view/gesture/controller/MoveController", "handleSyncTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (event.getAction() == 1) {
            a(new ng3.l(ng3.t.f337045p, null, event, 0.0f, 0.0f, 26, null));
            a(new ng3.l(ng3.t.f337044o, null, event, 0.0f, 0.0f, 26, null));
        }
        return false;
    }

    @Override // ng3.e
    public void e() {
        this.f337009c = android.view.VelocityTracker.obtain();
    }
}
