package jz0;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz0.k f302566d;

    public c(jz0.k kVar) {
        this.f302566d = kVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        motionEvent.getAction();
        jz0.k kVar = this.f302566d;
        android.view.GestureDetector gestureDetector = kVar.f302596t;
        if (gestureDetector != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(motionEvent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        if (kVar.f302597u == null) {
            kVar.f302597u = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = kVar.f302597u;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    android.view.VelocityTracker velocityTracker2 = kVar.f302597u;
                    kotlin.jvm.internal.o.d(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    int xVelocity = (int) velocityTracker2.getXVelocity();
                    int yVelocity = (int) velocityTracker2.getYVelocity();
                    float translationX = kVar.P6().getTranslationX();
                    float translationY = kVar.P6().getTranslationY();
                    kVar.f302602z = (int) translationX;
                    kVar.A = (int) translationY;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "scaled:%s, tx:%s, ty:%s, vx:%s, vy:%s", java.lang.Boolean.valueOf(kVar.f302598v), java.lang.Float.valueOf(translationX), java.lang.Float.valueOf(translationY), java.lang.Integer.valueOf(xVelocity), java.lang.Integer.valueOf(yVelocity));
                    if ((java.lang.Math.abs(translationX) > 250.0f || java.lang.Math.abs(yVelocity) <= java.lang.Math.abs(xVelocity) || yVelocity <= 0 || kVar.f302599w) && !kVar.f302598v) {
                        kVar.f302598v = false;
                    } else {
                        float height = 1 - (translationY / kVar.h().getHeight());
                        float f17 = height <= 1.0f ? height : 1.0f;
                        if (((yVelocity > 0 && f17 < kVar.f302601y) || yVelocity < 0) && f17 >= 0.5d) {
                            kVar.f302601y = f17;
                            kVar.P6().setPivotX(kVar.h().getWidth() / 2);
                            kVar.P6().setPivotY(kVar.h().getHeight() / 2);
                            kVar.P6().setScaleX(f17);
                            kVar.P6().setScaleY(f17);
                            kVar.P6().setTranslationY(translationY);
                            android.view.View O6 = kVar.O6();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList3.add(java.lang.Float.valueOf(f17));
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(O6, arrayList3.toArray(), "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            O6.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                            yj0.a.f(O6, "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        kVar.f302598v = true;
                    }
                    if (translationY > 200.0f) {
                        kVar.f302600x = false;
                    } else if (translationY > 10.0f) {
                        kVar.f302600x = true;
                    }
                    if (translationY > 50.0f) {
                        kVar.P6().setOnLongClickListener(null);
                    }
                    android.view.VelocityTracker velocityTracker3 = kVar.f302597u;
                    if (velocityTracker3 != null) {
                        kotlin.jvm.internal.o.d(velocityTracker3);
                        velocityTracker3.recycle();
                        kVar.f302597u = null;
                    }
                    if (kVar.f302598v) {
                        yj0.a.i(true, this, "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return true;
                    }
                }
            } else {
                if (kVar.f302600x) {
                    kVar.P6().setPivotX(kVar.h().getWidth() / 2);
                    kVar.P6().setPivotY(kVar.h().getHeight() / 2);
                    kVar.P6().setScaleX(1.0f);
                    kVar.P6().setScaleY(1.0f);
                    kVar.P6().setTranslationX(0.0f);
                    kVar.P6().setTranslationY(0.0f);
                    android.view.View O62 = kVar.O6();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(O62, arrayList4.toArray(), "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    O62.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                    yj0.a.f(O62, "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    kVar.f302601y = 1.0f;
                    kVar.f302598v = false;
                    kVar.f302599w = false;
                    yj0.a.i(true, this, "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
                if (kVar.f302598v && !kVar.f302599w) {
                    kVar.Q6(false);
                    kVar.f302599w = false;
                    yj0.a.i(true, this, "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
                kVar.f302599w = false;
            }
        } else if (kVar.f302600x) {
            kVar.f302600x = false;
        }
        yj0.a.i(false, this, "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoAniUIC$onCreate$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
