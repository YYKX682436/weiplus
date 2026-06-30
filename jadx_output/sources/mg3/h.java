package mg3;

/* loaded from: classes10.dex */
public final class h extends mg3.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer f326232d;

    public h(com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer) {
        this.f326232d = previewGestureContainer;
    }

    @Override // mg3.c, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        this.f326232d.onDoubleTap(e17);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return this.f326232d.onFling(motionEvent, e27, f17, f18);
    }

    @Override // mg3.c, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        super.onLongPress(e17);
        mg3.d gestureListener = this.f326232d.getGestureListener();
        if (gestureListener != null) {
            gestureListener.k(e17);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        this.f326232d.onScroll(motionEvent, e27, f17, f18);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        mg3.d gestureListener = this.f326232d.getGestureListener();
        if (gestureListener != null) {
            gestureListener.B(e17);
        }
        return super.onSingleTapConfirmed(e17);
    }
}
