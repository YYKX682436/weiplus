package kn5;

/* loaded from: classes5.dex */
public final class h extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout f309808d;

    public h(com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout gestureFoursquareRelativeLayout) {
        this.f309808d = gestureFoursquareRelativeLayout;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        boolean onContextClick = super.onContextClick(e17);
        yj0.a.i(onContextClick, this, "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        boolean onDoubleTap = super.onDoubleTap(e17);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return super.onDoubleTapEvent(e17);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return super.onDown(e17);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return super.onFling(motionEvent, e27, f17, f18);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout gestureFoursquareRelativeLayout = this.f309808d;
        kn5.g itemGestureListener = gestureFoursquareRelativeLayout.getItemGestureListener();
        if (itemGestureListener != null) {
            itemGestureListener.a(e17, gestureFoursquareRelativeLayout);
        }
        super.onLongPress(e17);
        yj0.a.h(this, "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        kn5.g itemGestureListener = this.f309808d.getItemGestureListener();
        return itemGestureListener != null ? itemGestureListener.b(motionEvent, e27, f17, f18, this.f309808d) : super.onScroll(motionEvent, e27, f17, f18);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        super.onShowPress(e17);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return super.onSingleTapConfirmed(e17);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        boolean onSingleTapUp = super.onSingleTapUp(e17);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
