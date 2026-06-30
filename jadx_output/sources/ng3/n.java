package ng3;

/* loaded from: classes10.dex */
public final class n extends ng3.e {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ScaleGestureDetector f337017c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.MotionEvent f337018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context) {
        super("scale");
        kotlin.jvm.internal.o.g(context, "context");
        this.f337017c = new android.view.ScaleGestureDetector(context, new ng3.m(this));
    }

    @Override // ng3.e
    public boolean b(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((java.util.ArrayList) this.f337005b).clear();
        if ((event.getAction() & 255) == 5 && event.getPointerCount() == 2) {
            c("onScalePrepare pointerCount:" + event.getPointerCount());
            a(new ng3.o(ng3.t.f337036d, 0.0f, 0.0f, 0.0f, event, 14, null));
        }
        if ((event.getAction() & 255) == 6 && event.getPointerCount() == 1) {
            c("onScaleReset pointerCount:" + event.getPointerCount());
            a(new ng3.o(ng3.t.f337039g, 0.0f, 0.0f, 0.0f, event, 14, null));
        } else if ((event.getAction() & 255) == 1) {
            a(new ng3.o(ng3.t.f337039g, 0.0f, 0.0f, 0.0f, event, 14, null));
        }
        this.f337018d = event;
        android.view.ScaleGestureDetector scaleGestureDetector = this.f337017c;
        scaleGestureDetector.isQuickScaleEnabled();
        scaleGestureDetector.onTouchEvent(event);
        return false;
    }

    @Override // ng3.e
    public void e() {
        this.f337018d = null;
    }
}
