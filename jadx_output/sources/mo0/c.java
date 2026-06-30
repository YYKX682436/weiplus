package mo0;

/* loaded from: classes3.dex */
public final class c extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LiveCameraOptionView f330257d;

    public c(com.tencent.mm.live.core.view.LiveCameraOptionView liveCameraOptionView) {
        this.f330257d = liveCameraOptionView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("LiveCameraOptionView", "onDoubleTap");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.live.core.view.LiveCameraOptionView liveCameraOptionView = this.f330257d;
        if (currentTimeMillis - liveCameraOptionView.f68600e > 1000) {
            mo0.b bVar = liveCameraOptionView.f68599d;
            if (bVar != null) {
                bVar.e(e17.getX(), e17.getY());
            }
            liveCameraOptionView.f68600e = java.lang.System.currentTimeMillis();
        }
        yj0.a.i(false, this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("LiveCameraOptionView", "onSingleTapConfirmed");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("LiveCameraOptionView", "onSingleTapUp");
        com.tencent.mm.live.core.view.LiveCameraOptionView liveCameraOptionView = this.f330257d;
        mo0.b bVar = liveCameraOptionView.f68599d;
        if (bVar != null) {
            bVar.c(e17.getX(), e17.getY(), liveCameraOptionView.getWidth(), liveCameraOptionView.getHeight(), 400L);
        }
        com.tencent.mm.live.core.view.LiveCameraFocusView liveCameraFocusView = liveCameraOptionView.f68603h;
        float x17 = e17.getX();
        float y17 = e17.getY();
        android.view.ViewGroup.LayoutParams layoutParams = liveCameraFocusView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((int) x17) - (liveCameraFocusView.f68594q / 2);
            marginLayoutParams.topMargin = ((int) y17) - (liveCameraFocusView.f68595r / 2);
            liveCameraFocusView.setLayoutParams(marginLayoutParams);
            liveCameraFocusView.setVisibility(0);
            liveCameraFocusView.f68585e = true;
            liveCameraFocusView.f68586f = false;
            liveCameraFocusView.f68587g = false;
            liveCameraFocusView.f68588h = java.lang.System.currentTimeMillis();
            liveCameraFocusView.invalidate();
        }
        yj0.a.i(false, this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
