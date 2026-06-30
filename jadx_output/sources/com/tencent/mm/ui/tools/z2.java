package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class z2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageView f210937d;

    public z2(com.tencent.mm.ui.tools.CropImageView cropImageView) {
        this.f210937d = cropImageView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.tools.CropImageView cropImageView = this.f210937d;
        if (!cropImageView.B) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (cropImageView.f210012e == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int action = motionEvent.getAction() & 255;
        com.tencent.mm.ui.tools.CropImageView cropImageView2 = this.f210937d;
        if (!cropImageView2.f210022r && action != 0) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (action == 0) {
            cropImageView2.f210014g = motionEvent.getRawX();
            this.f210937d.f210015h = motionEvent.getRawY();
            com.tencent.mm.ui.tools.CropImageView cropImageView3 = this.f210937d;
            float f17 = cropImageView3.f210014g;
            float f18 = cropImageView3.f210015h;
            cropImageView3.f210016i = f17;
            cropImageView3.f210017m = f18;
            android.graphics.Matrix imageMatrix = cropImageView3.getImageMatrix();
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.set(0.0f, 0.0f, this.f210937d.f210012e.getWidth(), this.f210937d.f210012e.getHeight());
            imageMatrix.mapRect(rectF);
            com.tencent.mm.ui.tools.CropImageView cropImageView4 = this.f210937d;
            cropImageView4.f210022r = rectF.contains(cropImageView4.f210014g, cropImageView4.f210015h);
            this.f210937d.f210029y = java.lang.System.currentTimeMillis();
        } else if (action != 1) {
            if (action == 2) {
                if (cropImageView2.f210021q) {
                    cropImageView2.f210020p = db5.s.a(motionEvent);
                    com.tencent.mm.ui.tools.CropImageView cropImageView5 = this.f210937d;
                    float f19 = cropImageView5.f210020p;
                    float f27 = f19 - cropImageView5.f210019o;
                    if (f19 > 5.0f && java.lang.Math.abs(f27) > 5.0f) {
                        db5.s.d(this.f210937d.f210018n, motionEvent);
                        com.tencent.mm.ui.tools.CropImageView cropImageView6 = this.f210937d;
                        android.graphics.PointF pointF = cropImageView6.f210018n;
                        float f28 = pointF.x;
                        float f29 = pointF.y;
                        if (f27 > 0.0f) {
                            cropImageView6.a();
                        } else {
                            cropImageView6.b();
                        }
                    }
                    com.tencent.mm.ui.tools.CropImageView cropImageView7 = this.f210937d;
                    cropImageView7.f210019o = cropImageView7.f210020p;
                }
                if (!this.f210937d.f210013f) {
                    float rawX = motionEvent.getRawX() - this.f210937d.f210014g;
                    float rawY = motionEvent.getRawY() - this.f210937d.f210015h;
                    if (java.lang.Math.abs(rawX) > 5.0f || java.lang.Math.abs(rawY) > 5.0f) {
                        this.f210937d.getImageMatrix().postTranslate(rawX, rawY);
                    }
                    this.f210937d.invalidate();
                }
                com.tencent.mm.ui.tools.CropImageView cropImageView8 = this.f210937d;
                cropImageView8.f210013f = false;
                cropImageView8.f210014g = motionEvent.getRawX();
                this.f210937d.f210015h = motionEvent.getRawY();
            } else if (action == 5) {
                cropImageView2.f210013f = true;
                cropImageView2.f210019o = db5.s.a(motionEvent);
                com.tencent.mm.ui.tools.CropImageView cropImageView9 = this.f210937d;
                if (cropImageView9.f210019o > 5.0f) {
                    cropImageView9.f210021q = true;
                    db5.s.d(cropImageView9.f210018n, motionEvent);
                    yj0.a.i(true, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
            } else if (action == 6) {
                cropImageView2.f210021q = false;
                cropImageView2.f210013f = true;
                yj0.a.i(true, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        } else if (cropImageView2.f210025u) {
            cropImageView2.f210025u = false;
            if (cropImageView2.f210024t) {
                cropImageView2.f210024t = false;
                cropImageView2.b();
                this.f210937d.b();
                this.f210937d.b();
                this.f210937d.b();
                this.f210937d.b();
            } else {
                cropImageView2.f210024t = true;
                cropImageView2.a();
                this.f210937d.a();
                this.f210937d.a();
                this.f210937d.a();
                this.f210937d.a();
            }
        } else {
            cropImageView2.f210025u = true;
            wu5.c cVar = cropImageView2.f210026v;
            if (cVar != null) {
                cVar.cancel(true);
            }
            this.f210937d.f210026v = ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.ui.tools.y2(this, motionEvent), 200L);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
