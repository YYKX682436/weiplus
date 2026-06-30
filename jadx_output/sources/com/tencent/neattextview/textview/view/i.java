package com.tencent.neattextview.textview.view;

/* loaded from: classes15.dex */
public class i implements android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.GestureDetector f215208d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.neattextview.textview.view.a f215209e;

    /* renamed from: f, reason: collision with root package name */
    public ks5.a f215210f;

    /* renamed from: g, reason: collision with root package name */
    public js5.c f215211g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f215212h;

    public i(android.content.Context context, com.tencent.neattextview.textview.view.a aVar, android.os.Handler handler) {
        this.f215209e = aVar;
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(context, this, handler);
        this.f215208d = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
    }

    public void a(int i17) {
        js5.c cVar = this.f215211g;
        if (cVar != null) {
            cVar.f301572h = false;
            this.f215212h.invalidate();
            this.f215211g = null;
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.tencent.neattextview.textview.view.a aVar = this.f215209e;
        if (aVar.getOnDoubleClickListener() == null) {
            return false;
        }
        aVar.getOnDoubleClickListener().f(this.f215212h, motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(android.view.MotionEvent motionEvent) {
        boolean z17;
        com.tencent.neattextview.textview.view.a aVar = this.f215209e;
        if (((com.tencent.neattextview.textview.view.NeatTextView) aVar).f215178e || this.f215210f.m() == null) {
            return false;
        }
        for (js5.c cVar : this.f215210f.m()) {
            float x17 = motionEvent.getX() - aVar.getHorizontalOffset();
            float y17 = motionEvent.getY() - aVar.getVerticalOffset();
            java.util.LinkedList linkedList = cVar.f301568d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (((android.graphics.RectF) it.next()).contains(x17, y17)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                this.f215211g = cVar;
                cVar.f301572h = true;
                this.f215212h.postInvalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        a(3);
        return false;
    }

    public void onLongPress(android.view.MotionEvent motionEvent) {
        a(1);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        js5.c cVar;
        if (((com.tencent.neattextview.textview.view.NeatTextView) this.f215209e).f215178e || (cVar = this.f215211g) == null) {
            return false;
        }
        cVar.onClick(this.f215212h);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.neattextview.textview.view.a aVar = this.f215209e;
        if (aVar.getLayout() == null) {
            return false;
        }
        this.f215210f = aVar.getLayout();
        this.f215212h = view;
        android.view.GestureDetector gestureDetector = this.f215208d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/neattextview/textview/view/NeatViewTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/neattextview/textview/view/NeatViewTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            a(2);
        }
        return onTouchEvent;
    }
}
