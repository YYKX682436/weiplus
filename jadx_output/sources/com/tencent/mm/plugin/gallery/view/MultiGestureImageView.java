package com.tencent.mm.plugin.gallery.view;

/* loaded from: classes13.dex */
public class MultiGestureImageView extends android.widget.LinearLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f138651z = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MultiTouchImageView f138652d;

    /* renamed from: e, reason: collision with root package name */
    public int f138653e;

    /* renamed from: f, reason: collision with root package name */
    public long f138654f;

    /* renamed from: g, reason: collision with root package name */
    public long f138655g;

    /* renamed from: h, reason: collision with root package name */
    public float f138656h;

    /* renamed from: i, reason: collision with root package name */
    public float f138657i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f138658m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.OverScroller f138659n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.GestureDetector f138660o;

    /* renamed from: p, reason: collision with root package name */
    public int f138661p;

    /* renamed from: q, reason: collision with root package name */
    public int f138662q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.RectF f138663r;

    /* renamed from: s, reason: collision with root package name */
    public float f138664s;

    /* renamed from: t, reason: collision with root package name */
    public float f138665t;

    /* renamed from: u, reason: collision with root package name */
    public k33.o f138666u;

    /* renamed from: v, reason: collision with root package name */
    public k33.o f138667v;

    /* renamed from: w, reason: collision with root package name */
    public k33.o f138668w;

    /* renamed from: x, reason: collision with root package name */
    public int f138669x;

    /* renamed from: y, reason: collision with root package name */
    public int f138670y;

    public MultiGestureImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138653e = 0;
        this.f138654f = 0L;
        this.f138655g = 0L;
        this.f138656h = 0.0f;
        this.f138657i = 0.0f;
        this.f138658m = false;
        this.f138663r = new android.graphics.RectF();
        a(context, attributeSet);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.f138652d = new com.tencent.mm.ui.base.MultiTouchImageView(context, attributeSet);
        this.f138660o = new android.view.GestureDetector(context, new k33.m(this, null));
        this.f138659n = new android.widget.OverScroller(context, new android.view.animation.DecelerateInterpolator(2.0f));
        this.f138652d.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        addView(this.f138652d);
        this.f138666u = new k33.o(this, new java.lang.ref.WeakReference(this));
        this.f138667v = new k33.o(this, new java.lang.ref.WeakReference(this));
        this.f138668w = new k33.o(this, new java.lang.ref.WeakReference(this));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f138652d != null && this.f138659n.computeScrollOffset()) {
            int currX = this.f138659n.getCurrX() - this.f138661p;
            int currY = this.f138659n.getCurrY() - this.f138662q;
            this.f138661p = this.f138659n.getCurrX();
            this.f138662q = this.f138659n.getCurrY();
            float scale = this.f138652d.getScale();
            float imageWidth = this.f138652d.getImageWidth() * scale;
            float imageHeight = scale * this.f138652d.getImageHeight();
            float[] fArr = new float[9];
            this.f138652d.getImageMatrix().getValues(fArr);
            float f17 = imageWidth + fArr[2];
            float f18 = fArr[5] + imageHeight;
            android.graphics.RectF rectF = this.f138663r;
            if (currX < 0 && currX < rectF.right - java.lang.Math.round(f17)) {
                currX = (int) (rectF.right - java.lang.Math.round(f17));
            }
            if (currX > 0 && currX > rectF.left - java.lang.Math.round(r5)) {
                currX = (int) (rectF.left - java.lang.Math.round(r5));
            }
            if (currY < 0 && currY < rectF.bottom - java.lang.Math.round(f18)) {
                currY = (int) (rectF.bottom - java.lang.Math.round(f18));
            }
            if (currY > 0 && currY > rectF.top - java.lang.Math.round(r4)) {
                currY = (int) (rectF.top - java.lang.Math.round(r4));
            }
            if (java.lang.Math.round(r5) >= rectF.left || java.lang.Math.round(f17) <= rectF.right) {
                currX = 0;
            } else if (java.lang.Math.round(r4) >= rectF.top || java.lang.Math.round(f18) <= rectF.bottom) {
                currY = 0;
            }
            this.f138652d.c(currX, imageHeight >= ((float) this.f138670y) ? currY : 0);
            postInvalidate();
        }
    }

    public int getImageHeight() {
        return this.f138652d.getImageHeight();
    }

    public int getImageWidth() {
        return this.f138652d.getImageWidth();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f138669x = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        this.f138670y = size;
        this.f138663r.set(0.0f, 0.0f, this.f138669x, size);
    }

    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v39 */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        ?? r07;
        android.view.GestureDetector gestureDetector = this.f138660o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/gallery/view/MultiGestureImageView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/gallery/view/MultiGestureImageView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 0) {
            this.f138659n.forceFinished(true);
            this.f138668w.removeMessages(2);
            k33.o oVar = this.f138668w;
            oVar.f303873b = 0L;
            oVar.sendEmptyMessageDelayed(2, 500L);
            this.f138652d.o();
            int i17 = this.f138653e + 1;
            this.f138653e = i17;
            if (i17 == 1) {
                this.f138654f = java.lang.System.currentTimeMillis();
                this.f138656h = db5.s.b(motionEvent, 0);
                this.f138657i = db5.s.c(motionEvent, 0);
            } else if (i17 == 2) {
                if (java.lang.System.currentTimeMillis() - this.f138655g >= 350) {
                    this.f138653e = 1;
                } else if (java.lang.Math.abs(this.f138656h - db5.s.b(motionEvent, 0)) >= 35.0f || java.lang.Math.abs(this.f138657i - db5.s.c(motionEvent, 0)) >= 35.0f) {
                    this.f138653e = 1;
                } else {
                    this.f138653e = 0;
                    if (this.f138652d.getScale() <= this.f138652d.getScaleRate()) {
                        this.f138652d.b(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
                    } else {
                        this.f138652d.d(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
                        this.f138652d.h();
                    }
                }
            }
        }
        if (motionEvent.getAction() == 6 || motionEvent.getAction() == 262) {
            this.f138668w.removeMessages(2);
            this.f138665t = 0.0f;
            float scale = this.f138652d.getScale();
            this.f138664s = scale;
            this.f138658m = true;
            if (scale < this.f138652d.getScaleRate()) {
                this.f138652d.d((db5.s.b(motionEvent, 0) - db5.s.b(motionEvent, 1)) + db5.s.b(motionEvent, 1), (db5.s.c(motionEvent, 0) - db5.s.c(motionEvent, 1)) + db5.s.c(motionEvent, 1));
            }
            if (this.f138664s > this.f138652d.getDoubleTabScale()) {
                this.f138652d.b((db5.s.b(motionEvent, 0) - db5.s.b(motionEvent, 1)) + db5.s.b(motionEvent, 1), (db5.s.c(motionEvent, 0) - db5.s.c(motionEvent, 1)) + db5.s.c(motionEvent, 1));
            }
        }
        if (motionEvent.getAction() == 1) {
            this.f138668w.removeMessages(2);
            this.f138665t = 0.0f;
            this.f138664s = this.f138652d.getScale();
            if (this.f138653e == 1) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                this.f138655g = currentTimeMillis;
                if (currentTimeMillis - this.f138654f >= 350) {
                    this.f138653e = 0;
                } else if (java.lang.Math.abs(this.f138656h - db5.s.b(motionEvent, 0)) < 10.0f && java.lang.Math.abs(this.f138657i - db5.s.c(motionEvent, 0)) < 10.0f) {
                    k33.o oVar2 = this.f138667v;
                    oVar2.getClass();
                    oVar2.f303873b = 0L;
                    oVar2.sendEmptyMessageDelayed(0, 350L);
                }
            }
        }
        if (motionEvent.getAction() == 5 || motionEvent.getAction() == 261) {
            this.f138665t = 0.0f;
            this.f138664s = this.f138652d.getScale();
            r07 = 1;
            this.f138658m = true;
        } else {
            r07 = 1;
        }
        if (motionEvent.getAction() != 2) {
            return r07;
        }
        if (motionEvent.getPointerCount() == 2) {
            this.f138668w.removeMessages(2);
            this.f138658m = r07;
            this.f138653e = 0;
            float b17 = db5.s.b(motionEvent, 0) - db5.s.b(motionEvent, r07);
            float c17 = db5.s.c(motionEvent, 0) - db5.s.c(motionEvent, r07);
            float sqrt = (float) java.lang.Math.sqrt((b17 * b17) + (c17 * c17));
            float f17 = this.f138665t;
            if (f17 == 0.0f) {
                this.f138665t = sqrt;
            } else {
                float f18 = sqrt / f17;
                if (this.f138658m) {
                    this.f138652d.a(this.f138664s * f18, b17 + db5.s.b(motionEvent, 1), c17 + db5.s.c(motionEvent, 1));
                    this.f138652d.h();
                }
            }
        } else if (java.lang.Math.abs(this.f138656h - db5.s.b(motionEvent, 0)) > 10.0f || java.lang.Math.abs(this.f138657i - db5.s.c(motionEvent, 0)) > 10.0f) {
            this.f138668w.removeMessages(2);
            this.f138653e = 0;
            computeScroll();
        }
        return true;
    }

    public void setEnableHorLongBmpMode(boolean z17) {
        this.f138652d.setEnableHorLongBmpMode(z17);
    }

    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.f138652d.setImageBitmap(bitmap);
        this.f138652d.i();
    }

    public void setImageHeight(int i17) {
        this.f138652d.setImageHeight(i17);
    }

    public void setImageWidth(int i17) {
        this.f138652d.setImageWidth(i17);
    }

    public void setLongClickOverListener(k33.l lVar) {
    }

    public void setSingleClickOverListener(k33.n nVar) {
    }

    public MultiGestureImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f138653e = 0;
        this.f138654f = 0L;
        this.f138655g = 0L;
        this.f138656h = 0.0f;
        this.f138657i = 0.0f;
        this.f138658m = false;
        this.f138663r = new android.graphics.RectF();
        a(context, attributeSet);
    }
}
