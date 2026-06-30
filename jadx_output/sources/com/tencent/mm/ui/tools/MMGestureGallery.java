package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class MMGestureGallery extends android.widget.Gallery {
    public float A;
    public int B;
    public long C;
    public long D;
    public float E;
    public float F;
    public final android.widget.OverScroller G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.RectF f210054J;
    public com.tencent.mm.ui.tools.n5 K;
    public final com.tencent.mm.sdk.platformtools.n3 L;
    public com.tencent.mm.ui.tools.s5 M;
    public com.tencent.mm.ui.tools.p5 N;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public android.view.VelocityTracker V;
    public com.tencent.mm.ui.tools.o5 W;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.GestureDetector f210055d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MultiTouchImageView f210056e;

    /* renamed from: f, reason: collision with root package name */
    public int f210057f;

    /* renamed from: g, reason: collision with root package name */
    public int f210058g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.j6 f210059h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.j6 f210060i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.j6 f210061m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f210062n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f210063o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f210064p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f210065p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f210066q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f210067r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f210068s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f210069t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f210070u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f210071v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f210072w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f210073x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f210074y;

    /* renamed from: z, reason: collision with root package name */
    public float f210075z;

    public MMGestureGallery(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f210062n = false;
        this.f210063o = false;
        this.f210064p = false;
        this.f210066q = false;
        this.f210067r = false;
        this.f210068s = false;
        this.f210069t = false;
        this.f210070u = false;
        this.f210071v = false;
        this.f210072w = false;
        this.f210073x = false;
        this.f210074y = false;
        this.B = 0;
        this.C = 0L;
        this.D = 0L;
        this.E = 0.0f;
        this.F = 0.0f;
        this.f210054J = new android.graphics.RectF();
        this.L = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.P = true;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = false;
        this.T = false;
        this.U = false;
        this.f210065p0 = false;
        setStaticTransformationsEnabled(true);
    }

    public static void a(com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery, long j17) {
        mMGestureGallery.f210059h.removeMessages(1);
        com.tencent.mm.ui.tools.j6 j6Var = mMGestureGallery.f210059h;
        j6Var.f210513b = j17;
        j6Var.sendEmptyMessageDelayed(1, j17);
    }

    public final void b(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        try {
            float x17 = motionEvent.getX() - motionEvent2.getX();
            float y17 = motionEvent.getY() - motionEvent2.getY();
            boolean z17 = motionEvent.getX() - motionEvent2.getX() < 0.0f;
            float abs = java.lang.Math.abs(x17);
            float abs2 = java.lang.Math.abs(y17);
            if (java.lang.Math.abs(f17) > 500.0f && abs >= 60.0f && abs >= abs2) {
                if (z17) {
                    onKeyDown(21, null);
                } else {
                    onKeyDown(22, null);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final boolean c(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (this.f210064p || this.f210063o) {
            return true;
        }
        this.f210066q = true;
        return super.onScroll(motionEvent, motionEvent2, f17, f18);
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.OverScroller overScroller = this.G;
        overScroller.computeScrollOffset();
        if (this.f210056e != null && overScroller.computeScrollOffset()) {
            overScroller.getCurrX();
            overScroller.getCurrY();
            int currX = overScroller.getCurrX() - this.H;
            int currY = overScroller.getCurrY() - this.I;
            this.H = overScroller.getCurrX();
            this.I = overScroller.getCurrY();
            float scale = this.f210056e.getScale() * this.f210056e.getImageWidth();
            float scale2 = this.f210056e.getScale() * this.f210056e.getImageHeight();
            float[] fArr = new float[9];
            this.f210056e.getImageMatrix().getValues(fArr);
            float f17 = scale + fArr[2];
            float f18 = fArr[5] + scale2;
            android.graphics.RectF rectF = this.f210054J;
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
            this.f210056e.c(currX, scale2 >= ((float) this.f210058g) ? currY : 0);
            postInvalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(float r8, float r9, android.view.View r10, float r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.MMGestureGallery.d(float, float, android.view.View, float):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGestureGallery", "MMGallery dispatchTouchEvent " + java.lang.String.valueOf(motionEvent.getActionMasked()));
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public int getScreenWidth() {
        return this.f210057f;
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public android.view.View getSelectedView() {
        android.view.View selectedView = super.getSelectedView();
        if (selectedView == null) {
            return null;
        }
        android.view.View findViewById = selectedView.findViewById(com.tencent.mm.R.id.jut);
        android.view.View findViewById2 = selectedView.findViewById(com.tencent.mm.R.id.pr8);
        return (findViewById == null || findViewById.getVisibility() != 0) ? (findViewById2 == null || findViewById2.getVisibility() != 0) ? selectedView : findViewById2 : findViewById;
    }

    public com.tencent.mm.ui.tools.s5 getSingleClickOverListener() {
        return this.M;
    }

    public int getXDown() {
        return (int) this.Q;
    }

    public int getYDown() {
        return (int) this.R;
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        android.widget.OverScroller overScroller = this.G;
        if (overScroller != null) {
            overScroller.forceFinished(true);
        }
        return super.onDown(motionEvent);
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        android.view.View selectedView = getSelectedView();
        if (selectedView instanceof android.view.ViewGroup) {
            android.view.View findViewById = selectedView.findViewById(com.tencent.mm.R.id.h9e);
            if (findViewById == null || findViewById.getVisibility() == 8) {
                b(motionEvent, motionEvent2, f17, f18);
                return false;
            }
            selectedView = findViewById.findViewById(com.tencent.mm.R.id.h88);
            if (selectedView == null) {
                b(motionEvent, motionEvent2, f17, f18);
                return false;
            }
        }
        if (selectedView instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) selectedView;
            float scale = multiTouchImageView.getScale() * multiTouchImageView.getImageWidth();
            float scale2 = multiTouchImageView.getScale() * multiTouchImageView.getImageHeight();
            if (multiTouchImageView.F || multiTouchImageView.G || ((int) scale) > this.f210057f || ((int) scale2) > this.f210058g) {
                float[] fArr = new float[9];
                multiTouchImageView.getImageMatrix().getValues(fArr);
                float f19 = fArr[2];
                float f27 = f19 + scale;
                float f28 = fArr[5] + scale2;
                float round = java.lang.Math.round(f19);
                android.graphics.RectF rectF = this.f210054J;
                float f29 = 0.0f;
                float f37 = (round >= rectF.left || ((float) java.lang.Math.round(f27)) <= rectF.right) ? 0.0f : f17;
                if (java.lang.Math.round(r6) < rectF.top && java.lang.Math.round(f28) > rectF.bottom) {
                    f29 = f18;
                }
                if (java.lang.Math.round(r6) < rectF.top) {
                    this.f210065p0 = true;
                } else {
                    this.f210065p0 = false;
                }
                float f38 = rectF.right;
                int i17 = (int) (f38 - scale);
                int i18 = (int) (f38 + scale);
                float f39 = rectF.bottom;
                android.widget.OverScroller overScroller = this.G;
                overScroller.forceFinished(true);
                overScroller.fling(overScroller.getCurrX(), overScroller.getCurrY(), (int) f37, (int) f29, i17, i18, (int) (f39 - scale2), (int) (f39 + scale2), 0, 0);
            }
        }
        if (this.f210062n) {
            return true;
        }
        b(motionEvent, motionEvent2, f17, f18);
        return true;
    }

    @Override // android.widget.Gallery, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        if (z17) {
            super.onFocusChanged(z17, i17, rect);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View selectedView = getSelectedView();
        return (selectedView instanceof com.tencent.mm.ui.base.WxImageView) && !((com.tencent.mm.ui.base.WxImageView) selectedView).getInternalTouchEventConsumed();
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        this.U = true;
        super.onLongPress(motionEvent);
    }

    @Override // android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f210057f = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        this.f210058g = size;
        this.f210054J.set(0.0f, 0.0f, this.f210057f, size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0187, code lost:
    
        if (r14 < r1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0278, code lost:
    
        if (r12 < (r1 * 0.3f)) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x029e, code lost:
    
        r2 = r19 * 0.3f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02d0, code lost:
    
        if (r10 < (r1 * 0.3f)) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02f6, code lost:
    
        r1 = 0.3f * r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02f4, code lost:
    
        if (r14 < r1) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x029c, code lost:
    
        if (r13 < r1) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
    
        if (r10 < (r1 * 0.3f)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r2 = r20 * 0.3f;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0198  */
    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScroll(android.view.MotionEvent r17, android.view.MotionEvent r18, float r19, float r20) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.MMGestureGallery.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.widget.Gallery, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f210055d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/tools/MMGestureGallery", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/tools/MMGestureGallery", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        motionEvent.getAction();
        if (motionEvent.getAction() == 1) {
            android.view.View selectedView = getSelectedView();
            if (selectedView instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
                com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) selectedView;
                this.f210056e = multiTouchImageView;
                float scale = multiTouchImageView.getScale() * this.f210056e.getImageWidth();
                float scale2 = this.f210056e.getScale() * this.f210056e.getImageHeight();
                if (((int) scale) > this.f210057f || ((int) scale2) > this.f210058g) {
                    this.f210056e.getImageMatrix().getValues(new float[9]);
                } else {
                    com.tencent.mars.xlog.Log.i("dktest", "onTouchEvent width:" + scale + "height:" + scale2);
                }
            }
        }
        computeScroll();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            super.onWindowFocusChanged(z17);
        }
    }

    public void setGalleryScaleListener(com.tencent.mm.ui.tools.o5 o5Var) {
        this.W = o5Var;
    }

    public void setLoadQuit(boolean z17) {
        this.P = z17;
    }

    public void setLongClickOverListener(com.tencent.mm.ui.tools.p5 p5Var) {
        this.N = p5Var;
    }

    public void setScrollLeftRightListener(com.tencent.mm.ui.tools.r5 r5Var) {
    }

    public void setSingleClickOverListener(com.tencent.mm.ui.tools.s5 s5Var) {
        this.M = s5Var;
    }

    public MMGestureGallery(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210062n = false;
        this.f210063o = false;
        this.f210064p = false;
        this.f210066q = false;
        this.f210067r = false;
        this.f210068s = false;
        this.f210069t = false;
        this.f210070u = false;
        this.f210071v = false;
        this.f210072w = false;
        this.f210073x = false;
        this.f210074y = false;
        this.B = 0;
        this.C = 0L;
        this.D = 0L;
        this.E = 0.0f;
        this.F = 0.0f;
        this.f210054J = new android.graphics.RectF();
        this.L = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.P = true;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = false;
        this.T = false;
        this.U = false;
        this.f210065p0 = false;
        setStaticTransformationsEnabled(true);
        this.f210055d = new android.view.GestureDetector(context, new com.tencent.mm.ui.tools.q5(this, null));
        this.f210059h = new com.tencent.mm.ui.tools.j6(new java.lang.ref.WeakReference(this));
        this.f210060i = new com.tencent.mm.ui.tools.j6(new java.lang.ref.WeakReference(this));
        this.f210061m = new com.tencent.mm.ui.tools.j6(new java.lang.ref.WeakReference(this));
        this.G = new android.widget.OverScroller(context, new android.view.animation.DecelerateInterpolator(2.0f));
        float f17 = getResources().getDisplayMetrics().density;
        setOnTouchListener(new com.tencent.mm.ui.tools.m5(this));
    }
}
