package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class MMViewPager extends com.tencent.mm.ui.mogic.WxViewPager {
    public int A;
    public android.view.View.OnTouchListener A1;
    public int B;
    public final android.graphics.RectF C;
    public boolean D;
    public db5.y7 E;
    public final com.tencent.mm.sdk.platformtools.n3 F;
    public db5.d8 G;
    public db5.a8 H;
    public db5.x7 I;

    /* renamed from: J, reason: collision with root package name */
    public db5.c8 f197607J;
    public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener K;
    public boolean L;
    public androidx.viewpager.widget.ViewPager.OnPageChangeListener M;
    public final android.view.GestureDetector N;
    public float P;
    public float Q;
    public android.view.VelocityTracker R;
    public boolean S;
    public android.view.MotionEvent T;
    public float U;
    public float V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public db5.f0 f197608d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.WxImageView f197609e;

    /* renamed from: f, reason: collision with root package name */
    public int f197610f;

    /* renamed from: g, reason: collision with root package name */
    public int f197611g;

    /* renamed from: h, reason: collision with root package name */
    public int f197612h;

    /* renamed from: i, reason: collision with root package name */
    public int f197613i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f197614l1;

    /* renamed from: m, reason: collision with root package name */
    public final db5.o8 f197615m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197616n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f197617o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f197618p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f197619p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f197620p1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f197621q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f197622r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f197623s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f197624t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f197625u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197626v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f197627w;

    /* renamed from: x, reason: collision with root package name */
    public float f197628x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f197629x0;

    /* renamed from: x1, reason: collision with root package name */
    public db5.z7 f197630x1;

    /* renamed from: y, reason: collision with root package name */
    public float f197631y;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.VelocityTracker f197632y0;

    /* renamed from: y1, reason: collision with root package name */
    public final android.view.GestureDetector.SimpleOnGestureListener f197633y1;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.OverScroller f197634z;

    /* renamed from: z1, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f197635z1;

    public MMViewPager(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f197610f = -1;
        this.f197611g = -1;
        this.f197616n = false;
        this.f197617o = false;
        this.f197618p = false;
        this.f197621q = false;
        this.f197622r = false;
        this.f197623s = false;
        this.f197624t = false;
        this.f197625u = false;
        this.f197626v = false;
        this.f197627w = false;
        this.C = new android.graphics.RectF();
        this.D = false;
        this.F = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.L = false;
        this.M = null;
        this.P = 0.0f;
        this.R = null;
        this.S = false;
        this.U = 0.0f;
        this.V = 0.0f;
        this.W = false;
        this.f197619p0 = false;
        this.f197629x0 = false;
        this.f197614l1 = true;
        this.f197620p1 = false;
        this.f197633y1 = new db5.b8(this, null);
        this.f197635z1 = new db5.w7(this);
        setStaticTransformationsEnabled(true);
    }

    private int getCurrentX() {
        if (getAdapter() == null) {
            return -1;
        }
        return getScrollX() - (this.f197612h * ((getAdapter().getCount() - getCurrentItem()) - 1));
    }

    private com.tencent.mm.ui.base.MultiTouchImageView getSelectedMultiTouchImageView() {
        return ((db5.p8) getAdapter()).c(getCurrentItem(), true);
    }

    private com.tencent.mm.ui.base.WxImageView getSelectedWxImageView() {
        com.tencent.mm.ui.base.WxImageView f17 = ((db5.p8) getAdapter()).f(getCurrentItem(), true);
        if (f17 != null) {
            return f17;
        }
        return null;
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager, android.view.View
    public void computeScroll() {
        super.computeScroll();
        db5.f0 f0Var = this.f197608d;
        if (f0Var == null) {
            return;
        }
        float scale = f0Var.getScale() * this.f197608d.getImageWidth();
        float scale2 = this.f197608d.getScale() * this.f197608d.getImageHeight();
        android.widget.OverScroller overScroller = this.f197634z;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX() - this.A;
            int currY = overScroller.getCurrY() - this.B;
            this.A = overScroller.getCurrX();
            this.B = overScroller.getCurrY();
            float[] fArr = new float[9];
            this.f197608d.getImageMatrix().getValues(fArr);
            float f17 = scale + fArr[2];
            float f18 = fArr[5] + scale2;
            android.graphics.RectF rectF = this.C;
            if (currX < 0 && currX < rectF.right - java.lang.Math.round(f17)) {
                currX = (int) (rectF.right - java.lang.Math.round(f17));
            }
            if (currX > 0 && currX > rectF.left - java.lang.Math.round(r5)) {
                currX = (int) (rectF.left - java.lang.Math.round(r5));
            }
            if (currY < 0 && currY < rectF.bottom - java.lang.Math.round(f18)) {
                currY = (int) (rectF.bottom - java.lang.Math.round(f18));
            }
            if (currY > 0 && currY > rectF.top - java.lang.Math.round(r2)) {
                currY = (int) (rectF.top - java.lang.Math.round(r2));
            }
            if (java.lang.Math.round(r5) >= rectF.left || java.lang.Math.round(f17) <= rectF.right) {
                currX = 0;
            } else if (java.lang.Math.round(r2) >= rectF.top || java.lang.Math.round(f18) <= rectF.bottom) {
                currY = 0;
            }
            this.f197608d.c(currX, scale2 >= ((float) this.f197613i) ? currY : 0);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            motionEvent.getAction();
            if (this.f197609e == null) {
                p();
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMViewPager", e17, "MMViewPager dispatchTouchEvent exception", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager
    public int firstItemPosForDetermine() {
        int b17 = ((db5.p8) getAdapter()).b();
        return b17 >= 0 ? b17 : super.firstItemPosForDetermine();
    }

    public int getScreenWidth() {
        return this.f197612h;
    }

    public db5.f0 getSelectedImageView() {
        com.tencent.mm.ui.base.MultiTouchImageView selectedMultiTouchImageView = getSelectedMultiTouchImageView();
        return selectedMultiTouchImageView != null ? selectedMultiTouchImageView : getSelectedWxImageView();
    }

    public android.view.View getSelectedView() {
        return ((db5.p8) getAdapter()).e(getCurrentItem());
    }

    public int getXDown() {
        return (int) this.U;
    }

    public int getYDown() {
        return (int) this.V;
    }

    @Override // android.view.View
    public boolean isFocused() {
        return super.isFocused();
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager
    public int lastItemPosForDetermine() {
        int g17 = ((db5.p8) getAdapter()).g();
        return g17 >= 0 ? g17 : super.lastItemPosForDetermine();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        if (z17) {
            super.onFocusChanged(z17, i17, rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    @Override // com.tencent.mm.ui.mogic.WxViewPager, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.viewpager.widget.a r0 = r6.getAdapter()
            db5.p8 r0 = (db5.p8) r0
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.a()
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 0
            if (r0 != 0) goto L13
            return r2
        L13:
            boolean r0 = super.onInterceptTouchEvent(r7)
            r6.S = r2
            androidx.viewpager.widget.a r3 = r6.getAdapter()
            db5.p8 r3 = (db5.p8) r3
            r3.getClass()
            db5.f0 r3 = r6.getSelectedImageView()
            if (r3 == 0) goto L2e
            boolean r3 = r3 instanceof com.tencent.mm.ui.base.WxImageView
            if (r3 == 0) goto L2e
            r3 = r1
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 != 0) goto L32
            return r0
        L32:
            if (r0 == 0) goto L35
            return r0
        L35:
            android.view.VelocityTracker r0 = r6.R
            if (r0 != 0) goto L3f
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.R = r0
        L3f:
            android.view.VelocityTracker r0 = r6.R
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.R
            r3 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r3)
            float r3 = r0.getXVelocity()
            int r3 = (int) r3
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            int r4 = r7.getAction()
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 == 0) goto La0
            if (r4 == r1) goto La9
            r5 = 2
            if (r4 == r5) goto L63
            goto La9
        L63:
            boolean r4 = r6.L
            if (r4 == 0) goto L68
            goto Laa
        L68:
            float r4 = r7.getRawX()
            float r5 = r6.Q
            float r4 = r4 - r5
            r7.getRawY()
            float r4 = java.lang.Math.abs(r4)
            r5 = 1132068864(0x437a0000, float:250.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto La9
            int r4 = java.lang.Math.abs(r0)
            int r3 = java.lang.Math.abs(r3)
            if (r4 <= r3) goto La9
            int r0 = java.lang.Math.abs(r0)
            if (r0 <= 0) goto La9
            int r0 = r7.getAction()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "MicroMsg.MMViewPager"
            java.lang.String r3 = "ViewPager onInterceptTouchEvent action: %d"
            com.tencent.mars.xlog.Log.i(r2, r3, r0)
            goto Laa
        La0:
            float r0 = r7.getRawX()
            r6.Q = r0
            r7.getRawY()
        La9:
            r1 = r2
        Laa:
            if (r1 == 0) goto Lc2
            float r0 = r7.getRawX()
            r6.U = r0
            float r7 = r7.getRawY()
            r6.V = r7
            com.tencent.mm.ui.base.WxImageView r7 = r6.f197609e
            if (r7 == 0) goto Lc2
            float r7 = r7.getScale()
            r6.f197631y = r7
        Lc2:
            r6.S = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MMViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f197612h = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        this.f197613i = size;
        this.C.set(0.0f, 0.0f, this.f197612h, size);
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        db5.p8 p8Var = (db5.p8) getAdapter();
        if (p8Var != null ? p8Var.a() : true) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            super.onWindowFocusChanged(z17);
        }
    }

    public final void p() {
        com.tencent.mm.ui.base.WxImageView selectedWxImageView = getSelectedWxImageView();
        this.f197609e = selectedWxImageView;
        if (selectedWxImageView != null) {
            selectedWxImageView.setGestureDetectorListener(this.f197633y1);
            this.f197609e.setOnLongClickListener(this.f197635z1);
            android.view.View.OnTouchListener onTouchListener = this.A1;
            if (onTouchListener != null) {
                this.f197609e.k(onTouchListener);
            }
        }
    }

    public final boolean q(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        return (motionEvent == null || motionEvent2 == null || motionEvent.getX() - motionEvent2.getX() >= 0.0f) ? false : true;
    }

    public final void r(long j17) {
        db5.o8 o8Var = this.f197615m;
        o8Var.removeMessages(1);
        o8Var.f228462b = j17;
        o8Var.sendEmptyMessageDelayed(1, j17);
    }

    public final boolean s(float f17, android.view.View view, float f18) {
        if (getAdapter().getItemPosition(view) == firstItemPosForDetermine() || this.L) {
            db5.f0 f0Var = this.f197608d;
            if (f0Var instanceof com.tencent.mm.ui.base.WxImageView) {
                float translationX = ((com.tencent.mm.ui.base.WxImageView) f0Var).getTranslationX();
                float f19 = f18 * 0.3f;
                if (f19 < 0.0f && translationX - f19 > 0.0f) {
                    this.f197622r = true;
                }
                if (!this.f197622r) {
                    return false;
                }
                ((com.tencent.mm.ui.base.WxImageView) this.f197608d).y(-f19, 0.0f);
                ((com.tencent.mm.ui.base.WxImageView) this.f197608d).setDrawFullSampleSizeBitmap(true);
                return true;
            }
            boolean z17 = this.f197622r;
            android.graphics.RectF rectF = this.C;
            if (z17) {
                if (f18 < 0.0f) {
                    float f27 = rectF.left;
                    if (f17 <= f27) {
                        f0Var.c(-f18, 0.0f);
                    } else {
                        if (f17 > f27 && f17 < this.f197612h * 0.3f) {
                            f0Var.c(-(f18 * 0.3f), 0.0f);
                            return true;
                        }
                        if (this.L && f17 > f27) {
                            f0Var.c(-(f18 * 0.3f), 0.0f);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (f18 < 0.0f) {
                if (f17 > 0.0f) {
                    this.f197622r = true;
                }
                float f28 = rectF.left;
                if (f17 <= f28) {
                    f0Var.c(-f18, 0.0f);
                } else {
                    if (f17 > f28 && f17 < this.f197612h * 0.3f) {
                        f0Var.c(-(f18 * 0.3f), 0.0f);
                        return true;
                    }
                    if (this.L && f17 > f28) {
                        f0Var.c(-(f18 * 0.3f), 0.0f);
                        return true;
                    }
                }
            }
        }
        if (!this.f197621q && !this.f197618p) {
            this.f197622r = false;
        }
        return false;
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager
    public void setAdapter(androidx.viewpager.widget.a aVar) {
        if (!(aVar instanceof db5.p8)) {
            throw new java.lang.IllegalArgumentException("must be MMViewPagerAdapter");
        }
        super.setAdapter(aVar);
    }

    public void setDoubleClickListener(db5.x7 x7Var) {
        this.I = x7Var;
    }

    public void setEnableGalleryPullToExitStrictly(boolean z17) {
        this.f197620p1 = z17;
    }

    public void setEnableGalleryScale(boolean z17) {
        this.f197614l1 = z17;
    }

    public void setGalleryScaleListener(db5.z7 z7Var) {
        this.f197630x1 = z7Var;
    }

    public void setLongClickOverListener(db5.a8 a8Var) {
        this.H = a8Var;
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager
    public void setOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener) {
        this.M = onPageChangeListener;
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.A1 = onTouchListener;
        com.tencent.mm.ui.base.WxImageView wxImageView = this.f197609e;
        if (wxImageView != null) {
            wxImageView.k(onTouchListener);
        }
    }

    public void setScaleChangeReportListener(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener scaleChangeReportListener) {
        this.K = scaleChangeReportListener;
    }

    public void setScaleFinishListener(db5.c8 c8Var) {
        this.f197607J = c8Var;
    }

    public void setSingleClickOverListener(db5.d8 d8Var) {
        this.G = d8Var;
    }

    public void setSingleMode(boolean z17) {
        this.L = z17;
        if (z17) {
            return;
        }
        this.f197616n = false;
    }

    public void setVideoDownNewLogic(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMViewPager", "setVideoDownNewLogic: %b", java.lang.Boolean.valueOf(z17));
        this.D = z17;
    }

    public final boolean t(float f17, android.view.View view, float f18) {
        if (getAdapter().getItemPosition(view) == lastItemPosForDetermine() || this.L) {
            db5.f0 f0Var = this.f197608d;
            if (f0Var instanceof com.tencent.mm.ui.base.WxImageView) {
                float translationX = ((com.tencent.mm.ui.base.WxImageView) f0Var).getTranslationX();
                float f19 = f18 * 0.3f;
                if (f19 > 0.0f && translationX - f19 < 0.0f) {
                    this.f197623s = true;
                }
                if (!this.f197623s) {
                    return false;
                }
                ((com.tencent.mm.ui.base.WxImageView) this.f197608d).y(-f19, 0.0f);
                ((com.tencent.mm.ui.base.WxImageView) this.f197608d).setDrawFullSampleSizeBitmap(true);
                return true;
            }
            if (this.f197623s) {
                if (f18 > 0.0f) {
                    int i17 = this.f197612h;
                    if (f17 >= i17) {
                        f0Var.c(-f18, 0.0f);
                    } else {
                        if (f17 > i17 * 0.7f && f17 < i17) {
                            f0Var.c(-(f18 * 0.3f), 0.0f);
                            return true;
                        }
                        if (this.L && f17 < i17) {
                            f0Var.c(-(f18 * 0.3f), 0.0f);
                        }
                    }
                }
                return false;
            }
            if (f18 > 0.0f) {
                int i18 = this.f197612h;
                if (f17 < i18) {
                    this.f197623s = true;
                }
                if (f17 >= i18) {
                    f0Var.c(-f18, 0.0f);
                } else {
                    if (f17 > i18 * 0.7f && f17 < i18) {
                        f0Var.c(-(f18 * 0.3f), 0.0f);
                        return true;
                    }
                    if (this.L && f17 < i18) {
                        f0Var.c(-(f18 * 0.3f), 0.0f);
                    }
                }
            }
        }
        if (!this.f197621q && !this.f197618p) {
            this.f197623s = false;
        }
        return false;
    }

    public final boolean u(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (this.f197618p) {
            return true;
        }
        this.f197621q = true;
        return false;
    }

    public final boolean v(float f17, float f18, android.view.View view, float f19) {
        return t(f18, view, f19) || s(f17, view, f19);
    }

    public MMViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197610f = -1;
        this.f197611g = -1;
        this.f197616n = false;
        this.f197617o = false;
        this.f197618p = false;
        this.f197621q = false;
        this.f197622r = false;
        this.f197623s = false;
        this.f197624t = false;
        this.f197625u = false;
        this.f197626v = false;
        this.f197627w = false;
        this.C = new android.graphics.RectF();
        this.D = false;
        this.F = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.L = false;
        this.M = null;
        this.P = 0.0f;
        this.R = null;
        this.S = false;
        this.U = 0.0f;
        this.V = 0.0f;
        this.W = false;
        this.f197619p0 = false;
        this.f197629x0 = false;
        this.f197614l1 = true;
        this.f197620p1 = false;
        this.f197633y1 = new db5.b8(this, null);
        this.f197635z1 = new db5.w7(this);
        setStaticTransformationsEnabled(true);
        this.f197615m = new db5.o8(new java.lang.ref.WeakReference(this));
        this.N = new android.view.GestureDetector(context, new db5.b8(this, null));
        this.f197634z = new android.widget.OverScroller(context, new android.view.animation.DecelerateInterpolator(2.0f));
        float f17 = getResources().getDisplayMetrics().density;
        super.setOnPageChangeListener(new db5.u7(this));
        super.setOnTouchListener(new db5.v7(this));
    }
}
