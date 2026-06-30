package db5;

/* loaded from: classes15.dex */
public class b8 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMViewPager f228298d;

    public b8(com.tencent.mm.ui.base.MMViewPager mMViewPager, db5.u7 u7Var) {
        this.f228298d = mMViewPager;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f228298d;
        if (mMViewPager.f197608d == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        db5.x7 x7Var = mMViewPager.I;
        if (x7Var != null && x7Var.a(motionEvent)) {
            yj0.a.i(true, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (mMViewPager.f197608d.getScale() <= mMViewPager.f197608d.getScaleRate()) {
            float b17 = mMViewPager.f197608d.b(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
            db5.c8 c8Var = mMViewPager.f197607J;
            if (c8Var != null) {
                c8Var.onScaleFinish(b17);
            }
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener scaleChangeReportListener = mMViewPager.K;
            if (scaleChangeReportListener != null) {
                scaleChangeReportListener.onDoubleClickScale(b17);
            }
        } else {
            mMViewPager.f197608d.d(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener scaleChangeReportListener2 = mMViewPager.K;
            if (scaleChangeReportListener2 != null) {
                scaleChangeReportListener2.onDoubleClickScale(1.0f);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        android.widget.OverScroller overScroller = this.f228298d.f197634z;
        if (overScroller != null) {
            overScroller.forceFinished(true);
        }
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f228298d;
        db5.f0 selectedImageView = mMViewPager.getSelectedImageView();
        if (selectedImageView != null) {
            if (selectedImageView instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
                selectedImageView = (com.tencent.mm.ui.base.MultiTouchImageView) selectedImageView;
            } else if (selectedImageView instanceof com.tencent.mm.ui.base.WxImageView) {
                selectedImageView = (com.tencent.mm.ui.base.WxImageView) selectedImageView;
            }
            float scale = selectedImageView.getScale() * selectedImageView.getImageWidth();
            float scale2 = selectedImageView.getScale() * selectedImageView.getImageHeight();
            if (selectedImageView.g() || selectedImageView.j() || ((int) scale) > mMViewPager.f197612h || ((int) scale2) > mMViewPager.f197613i) {
                float[] fArr = new float[9];
                selectedImageView.getImageMatrix().getValues(fArr);
                float f19 = fArr[2];
                float f27 = f19 + scale;
                float f28 = fArr[5];
                float f29 = f28 + scale2;
                mMViewPager.q(motionEvent, motionEvent2);
                float f37 = (((float) java.lang.Math.round(f19)) >= mMViewPager.C.left || ((float) java.lang.Math.round(f27)) <= mMViewPager.C.right) ? 0.0f : f17;
                float f38 = (((float) java.lang.Math.round(f28)) >= mMViewPager.C.top || ((float) java.lang.Math.round(f29)) <= mMViewPager.C.bottom) ? 0.0f : f18;
                android.graphics.RectF rectF = mMViewPager.C;
                float f39 = rectF.right;
                float f47 = rectF.bottom;
                android.widget.OverScroller overScroller = mMViewPager.f197634z;
                overScroller.fling(overScroller.getCurrX(), mMViewPager.f197634z.getCurrY(), (int) f37, (int) f38, (int) (f39 - scale), (int) (f39 + scale), (int) (f47 - scale2), (int) (f47 + scale2), 0, 0);
                if ((!mMViewPager.q(motionEvent, motionEvent2) || f19 < 0.0f) && (mMViewPager.q(motionEvent, motionEvent2) || f27 > mMViewPager.f197612h)) {
                    return false;
                }
            }
        }
        if (mMViewPager.f197616n) {
            return false;
        }
        mMViewPager.getClass();
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float x17 = motionEvent.getX() - motionEvent2.getX();
        float y17 = motionEvent.getY() - motionEvent2.getY();
        boolean q17 = mMViewPager.q(motionEvent, motionEvent2);
        float abs = java.lang.Math.abs(x17);
        float abs2 = java.lang.Math.abs(y17);
        if (java.lang.Math.abs(f17) <= 500.0f || abs < 60.0f || abs < abs2) {
            return false;
        }
        if (q17) {
            mMViewPager.onKeyDown(21, null);
        } else {
            mMViewPager.onKeyDown(22, null);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f228298d;
        mMViewPager.f197629x0 = true;
        db5.a8 a8Var = mMViewPager.H;
        if (a8Var != null) {
            a8Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        db5.d8 d8Var = this.f228298d.G;
        if (d8Var == null) {
            return true;
        }
        d8Var.a();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
