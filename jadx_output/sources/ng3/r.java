package ng3;

/* loaded from: classes10.dex */
public final class r extends ng3.e {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.GestureDetector f337027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.content.Context context) {
        super("tap");
        kotlin.jvm.internal.o.g(context, "context");
        this.f337027c = new android.view.GestureDetector(context, new ng3.q(this));
    }

    @Override // ng3.e
    public boolean b(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((java.util.ArrayList) this.f337005b).clear();
        android.view.GestureDetector gestureDetector = this.f337027c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(event);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/media/view/gesture/controller/TapController", "handleSyncTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/media/view/gesture/controller/TapController", "handleSyncTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
