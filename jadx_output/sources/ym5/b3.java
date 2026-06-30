package ym5;

/* loaded from: classes15.dex */
public class b3 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.PhotoView f463221d;

    public b3(com.tencent.mm.view.PhotoView photoView) {
        this.f463221d = photoView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        float f17;
        float f18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.view.PhotoView photoView = this.f463221d;
        photoView.S.b();
        android.graphics.RectF rectF = photoView.L;
        float width = rectF.left + (rectF.width() / 2.0f);
        android.graphics.RectF rectF2 = photoView.L;
        float height = rectF2.top + (rectF2.height() / 2.0f);
        photoView.Q.set(width, height);
        photoView.R.set(width, height);
        photoView.F = 0;
        photoView.G = 0;
        if (photoView.f213402z) {
            f17 = photoView.E;
            f18 = 1.0f;
        } else {
            float f19 = photoView.E;
            float f27 = photoView.f213381g;
            photoView.Q.set(motionEvent.getX(), motionEvent.getY());
            f17 = f19;
            f18 = f27;
        }
        photoView.f213391q.reset();
        android.graphics.Matrix matrix = photoView.f213391q;
        android.graphics.RectF rectF3 = photoView.K;
        matrix.postTranslate(-rectF3.left, -rectF3.top);
        android.graphics.Matrix matrix2 = photoView.f213391q;
        android.graphics.PointF pointF = photoView.R;
        matrix2.postTranslate(pointF.x, pointF.y);
        photoView.f213391q.postTranslate(-photoView.H, -photoView.I);
        android.graphics.Matrix matrix3 = photoView.f213391q;
        float f28 = photoView.D;
        android.graphics.PointF pointF2 = photoView.R;
        matrix3.postRotate(f28, pointF2.x, pointF2.y);
        android.graphics.Matrix matrix4 = photoView.f213391q;
        android.graphics.PointF pointF3 = photoView.Q;
        matrix4.postScale(f18, f18, pointF3.x, pointF3.y);
        photoView.f213391q.postTranslate(photoView.F, photoView.G);
        photoView.f213391q.mapRect(photoView.M, photoView.K);
        photoView.t(photoView.M);
        photoView.f213402z = !photoView.f213402z;
        ym5.j3 j3Var = photoView.S;
        j3Var.f463396g.startScroll((int) (f17 * 10000.0f), 0, (int) ((f18 - f17) * 10000.0f), 0, j3Var.f463406t.f213380f);
        j3Var.f463393d = true;
        j3Var.f463406t.post(j3Var);
        yj0.a.i(false, this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.tencent.mm.view.PhotoView photoView = this.f463221d;
        photoView.f213397w = false;
        photoView.f213394t = false;
        photoView.A = false;
        photoView.removeCallbacks(photoView.f213401y0);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        int i17;
        int i18;
        int i19;
        int i27;
        com.tencent.mm.view.PhotoView photoView = this.f463221d;
        if (photoView.f213394t) {
            return false;
        }
        if (!photoView.B && !photoView.C) {
            return false;
        }
        ym5.j3 j3Var = photoView.S;
        if (j3Var.f463393d) {
            return false;
        }
        float f19 = (((float) java.lang.Math.round(photoView.L.left)) >= photoView.f213379J.left || ((float) java.lang.Math.round(photoView.L.right)) <= photoView.f213379J.right) ? 0.0f : f17;
        float f27 = (((float) java.lang.Math.round(photoView.L.top)) >= photoView.f213379J.top || ((float) java.lang.Math.round(photoView.L.bottom)) <= photoView.f213379J.bottom) ? 0.0f : f18;
        if (photoView.A || photoView.D % 90.0f != 0.0f) {
            float f28 = photoView.D;
            float f29 = ((int) (f28 / 90.0f)) * 90;
            float f37 = f28 % 90.0f;
            if (f37 > 45.0f) {
                f29 += 90.0f;
            } else if (f37 < -45.0f) {
                f29 -= 90.0f;
            }
            int i28 = (int) f28;
            j3Var.f463398i.startScroll(i28, 0, ((int) f29) - i28, 0, j3Var.f463406t.f213380f);
            photoView.D = f29;
        }
        photoView.t(photoView.L);
        j3Var.getClass();
        j3Var.f463400n = f19 < 0.0f ? Integer.MAX_VALUE : 0;
        com.tencent.mm.view.PhotoView photoView2 = j3Var.f463406t;
        int abs = (int) (f19 > 0.0f ? java.lang.Math.abs(photoView2.L.left) : photoView2.L.right - photoView2.f213379J.right);
        if (f19 < 0.0f) {
            abs = Integer.MAX_VALUE - abs;
        }
        int i29 = f19 < 0.0f ? abs : 0;
        int i37 = f19 < 0.0f ? Integer.MAX_VALUE : abs;
        if (f19 < 0.0f) {
            abs = Integer.MAX_VALUE - i29;
        }
        j3Var.f463401o = f27 < 0.0f ? Integer.MAX_VALUE : 0;
        int abs2 = (int) (f27 > 0.0f ? java.lang.Math.abs(photoView2.L.top) : photoView2.L.bottom - photoView2.f213379J.bottom);
        if (f27 < 0.0f) {
            abs2 = Integer.MAX_VALUE - abs2;
        }
        int i38 = f27 < 0.0f ? abs2 : 0;
        int i39 = f27 < 0.0f ? Integer.MAX_VALUE : abs2;
        if (f27 < 0.0f) {
            abs2 = Integer.MAX_VALUE - i38;
        }
        if (f19 == 0.0f) {
            i17 = 0;
            i18 = 0;
        } else {
            i17 = i29;
            i18 = i37;
        }
        if (f27 == 0.0f) {
            i19 = 0;
            i27 = 0;
        } else {
            i19 = i38;
            i27 = i39;
        }
        android.widget.OverScroller overScroller = j3Var.f463395f;
        int i47 = j3Var.f463400n;
        int i48 = j3Var.f463401o;
        int i49 = (int) f19;
        int i57 = (int) f27;
        int abs3 = java.lang.Math.abs(abs);
        int i58 = photoView2.f213382h;
        int i59 = abs3 < i58 * 2 ? 0 : i58;
        int abs4 = java.lang.Math.abs(abs2);
        int i66 = photoView2.f213382h;
        overScroller.fling(i47, i48, i49, i57, i17, i18, i19, i27, i59, abs4 < i66 * 2 ? 0 : i66);
        j3Var.f463393d = true;
        j3Var.f463406t.post(j3Var);
        return super.onFling(motionEvent, motionEvent2, f17, f18);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        com.tencent.mm.view.PhotoView photoView = this.f463221d;
        android.view.View.OnLongClickListener onLongClickListener = photoView.f213389p0;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(photoView);
        }
        yj0.a.h(this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.view.PhotoView photoView = this.f463221d;
        ym5.j3 j3Var = photoView.S;
        if (j3Var.f463393d) {
            j3Var.b();
        }
        if (photoView.r(f17)) {
            if (f17 < 0.0f) {
                float f19 = photoView.L.left;
                if (f19 - f17 > photoView.f213379J.left) {
                    f17 = f19;
                }
            }
            if (f17 > 0.0f) {
                float f27 = photoView.L.right;
                float f28 = f27 - f17;
                float f29 = photoView.f213379J.right;
                if (f28 < f29) {
                    f17 = f27 - f29;
                }
            }
            photoView.f213387o.postTranslate(-f17, 0.0f);
            photoView.F = (int) (photoView.F - f17);
        } else if (photoView.B || photoView.f213394t || photoView.f213397w) {
            com.tencent.mm.view.PhotoView.n(photoView);
            if (!photoView.f213394t) {
                if (f17 < 0.0f) {
                    float f37 = photoView.L.left;
                    float f38 = f37 - f17;
                    float f39 = photoView.N.left;
                    if (f38 > f39) {
                        f17 *= java.lang.Math.abs(java.lang.Math.abs(f37 - f39) - photoView.f213383i) / photoView.f213383i;
                    }
                }
                if (f17 > 0.0f) {
                    float f47 = photoView.L.right;
                    float f48 = f47 - f17;
                    float f49 = photoView.N.right;
                    if (f48 < f49) {
                        f17 *= java.lang.Math.abs(java.lang.Math.abs(f47 - f49) - photoView.f213383i) / photoView.f213383i;
                    }
                }
            }
            photoView.F = (int) (photoView.F - f17);
            photoView.f213387o.postTranslate(-f17, 0.0f);
            photoView.f213397w = true;
        }
        if (photoView.s(f18)) {
            if (f18 < 0.0f) {
                float f57 = photoView.L.top;
                if (f57 - f18 > photoView.f213379J.top) {
                    f18 = f57;
                }
            }
            if (f18 > 0.0f) {
                float f58 = photoView.L.bottom;
                float f59 = f58 - f18;
                float f66 = photoView.f213379J.bottom;
                if (f59 < f66) {
                    f18 = f58 - f66;
                }
            }
            photoView.f213387o.postTranslate(0.0f, -f18);
            photoView.G = (int) (photoView.G - f18);
        } else if (photoView.C || photoView.f213397w || photoView.f213394t) {
            com.tencent.mm.view.PhotoView.n(photoView);
            if (!photoView.f213394t) {
                if (f18 < 0.0f) {
                    float f67 = photoView.L.top;
                    float f68 = f67 - f18;
                    float f69 = photoView.N.top;
                    if (f68 > f69) {
                        f18 *= java.lang.Math.abs(java.lang.Math.abs(f67 - f69) - photoView.f213383i) / photoView.f213383i;
                    }
                }
                if (f18 > 0.0f) {
                    float f76 = photoView.L.bottom;
                    float f77 = f76 - f18;
                    float f78 = photoView.N.bottom;
                    if (f77 < f78) {
                        f18 *= java.lang.Math.abs(java.lang.Math.abs(f76 - f78) - photoView.f213383i) / photoView.f213383i;
                    }
                }
            }
            photoView.f213387o.postTranslate(0.0f, -f18);
            photoView.G = (int) (photoView.G - f18);
            photoView.f213397w = true;
        }
        photoView.u();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.view.PhotoView photoView = this.f463221d;
        photoView.postDelayed(photoView.f213401y0, 250L);
        yj0.a.i(false, this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
