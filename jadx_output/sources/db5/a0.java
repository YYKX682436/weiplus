package db5;

/* loaded from: classes15.dex */
public class a0 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.HorizontalListViewV2 f228275d;

    public a0(com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV2, db5.x xVar) {
        this.f228275d = horizontalListViewV2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.f228275d.g(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        this.f228275d.h(motionEvent, motionEvent2, f17, f18);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        int i17 = com.tencent.mm.ui.base.HorizontalListViewV2.H;
        com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV2 = this.f228275d;
        horizontalListViewV2.k();
        int d17 = horizontalListViewV2.d((int) motionEvent.getX(), (int) motionEvent.getY());
        if (d17 >= 0 && !horizontalListViewV2.C) {
            android.view.View childAt = horizontalListViewV2.getChildAt(d17);
            android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = horizontalListViewV2.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV22 = this.f228275d;
                int i18 = horizontalListViewV22.f197290u + d17;
                if (onItemLongClickListener.onItemLongClick(horizontalListViewV22, childAt, i18, horizontalListViewV22.f197279g.getItemId(i18))) {
                    horizontalListViewV2.performHapticFeedback(0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i17 = com.tencent.mm.ui.base.HorizontalListViewV2.H;
        com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV2 = this.f228275d;
        horizontalListViewV2.i(bool);
        horizontalListViewV2.setCurrentScrollState(db5.b0.SCROLL_STATE_TOUCH_SCROLL);
        horizontalListViewV2.k();
        horizontalListViewV2.f197287r += (int) f17;
        com.tencent.mm.ui.base.HorizontalListViewV2.b(horizontalListViewV2, java.lang.Math.round(f17));
        horizontalListViewV2.requestLayout();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        int i17 = com.tencent.mm.ui.base.HorizontalListViewV2.H;
        com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV2 = this.f228275d;
        horizontalListViewV2.k();
        android.widget.AdapterView.OnItemClickListener onItemClickListener = horizontalListViewV2.getOnItemClickListener();
        int d17 = horizontalListViewV2.d((int) motionEvent.getX(), (int) motionEvent.getY());
        if (d17 >= 0 && !horizontalListViewV2.C) {
            android.view.View childAt = horizontalListViewV2.getChildAt(d17);
            com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV22 = this.f228275d;
            int i18 = horizontalListViewV22.f197290u + d17;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(horizontalListViewV22, childAt, i18, horizontalListViewV22.f197279g.getItemId(i18));
                return true;
            }
        }
        android.view.View.OnClickListener onClickListener = horizontalListViewV2.E;
        if (onClickListener == null || horizontalListViewV2.C) {
            return false;
        }
        onClickListener.onClick(horizontalListViewV2);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
