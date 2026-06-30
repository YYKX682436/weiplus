package com.tencent.mm.ui.base;

/* loaded from: classes9.dex */
public class MMPullDownView extends android.widget.FrameLayout implements android.view.GestureDetector.OnGestureListener {
    public static final int S = android.graphics.Color.parseColor("#00000000");
    public android.view.View A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f197525J;
    public db5.h5 K;
    public int L;
    public int M;
    public final com.tencent.mm.sdk.platformtools.n3 N;
    public boolean P;
    public int Q;
    public db5.i5 R;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.Scroller f197526d;

    /* renamed from: e, reason: collision with root package name */
    public final int f197527e;

    /* renamed from: f, reason: collision with root package name */
    public db5.o5 f197528f;

    /* renamed from: g, reason: collision with root package name */
    public db5.m5 f197529g;

    /* renamed from: h, reason: collision with root package name */
    public db5.l5 f197530h;

    /* renamed from: i, reason: collision with root package name */
    public int f197531i;

    /* renamed from: m, reason: collision with root package name */
    public int f197532m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197533n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f197534o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f197535p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f197536q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f197537r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f197538s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f197539t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f197540u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.GestureDetector f197541v;

    /* renamed from: w, reason: collision with root package name */
    public db5.j5 f197542w;

    /* renamed from: x, reason: collision with root package name */
    public db5.k5 f197543x;

    /* renamed from: y, reason: collision with root package name */
    public final android.content.Context f197544y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f197545z;

    public MMPullDownView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void j() {
        int scrollY = getScrollY() - this.f197531i;
        android.widget.Scroller scroller = this.f197526d;
        if (scrollY < 0) {
            if (this.f197539t) {
                scroller.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f197531i, 200);
            } else if (!this.f197525J) {
                if (this.f197545z.getVisibility() == 4) {
                    scroller.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f197531i, 200);
                }
                if (this.f197545z.getVisibility() == 0) {
                    scroller.startScroll(0, getScrollY(), 0, -getScrollY(), 200);
                }
                this.B = 0;
                this.f197536q = true;
                this.f197537r = false;
            }
            postInvalidate();
        }
        if (getScrollY() > this.f197532m) {
            if (this.f197540u) {
                scroller.startScroll(0, getScrollY(), 0, this.f197532m - getScrollY(), 200);
            } else {
                if (this.A.getVisibility() == 4) {
                    scroller.startScroll(0, getScrollY(), 0, this.f197532m - getScrollY(), 200);
                }
                if (this.A.getVisibility() == 0) {
                    scroller.startScroll(0, getScrollY(), 0, (this.f197532m - getScrollY()) + this.f197532m, 200);
                }
                this.B = 1;
                this.f197536q = true;
                this.f197537r = false;
            }
            postInvalidate();
        }
        this.f197535p = false;
    }

    public final void b(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPullDownView", "fix android O progress bar bug. visibility=" + i17);
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return;
        }
        if (viewGroup.getTag() == null) {
            viewGroup.setTag(viewGroup.findViewById(com.tencent.mm.R.id.f483684bp1));
        }
        android.view.View view = (android.view.View) viewGroup.getTag();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "fixAndroidOProgressBarOutScreenFlashProblem", "(Landroid/view/ViewGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "fixAndroidOProgressBarOutScreenFlashProblem", "(Landroid/view/ViewGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPullDownView", "forceBottomLoadData start[%b] loadDataBegin[%b] loadDataEnd[%b], isBottomShowAll[%b], getScrollY[%d]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f197536q), java.lang.Boolean.valueOf(this.f197537r), java.lang.Boolean.valueOf(this.f197540u), java.lang.Integer.valueOf(getScrollY()));
        if (!z17) {
            if (!this.f197537r) {
                this.f197537r = true;
                this.f197536q = false;
            }
            android.view.View view = this.A;
            if (view != null && view.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMPullDownView", "forceBottomLoadData false bottomView VISIBLE scroll to 0");
                scrollTo(0, this.f197531i);
            }
            android.view.View view2 = this.A;
            if (view2 == null || view2.getVisibility() != 0) {
                return;
            }
            android.view.View view3 = this.A;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.A;
        if (view4 != null) {
            int i17 = this.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z18 = this.f197540u;
        android.widget.Scroller scroller = this.f197526d;
        if (z18) {
            scroller.startScroll(0, getScrollY(), 0, this.f197532m - getScrollY(), 200);
        } else {
            android.view.View view5 = this.A;
            if (view5 != null && view5.getVisibility() == 4) {
                scroller.startScroll(0, getScrollY(), 0, this.f197532m - getScrollY(), 200);
            }
            android.view.View view6 = this.A;
            if (view6 != null && view6.getVisibility() == 0) {
                scroller.startScroll(0, getScrollY(), 0, (this.f197532m - getScrollY()) + this.f197532m, 200);
            }
            this.B = 1;
            this.f197536q = true;
            this.f197537r = false;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f197526d;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        } else if (this.f197536q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPullDownView", "computeScroll loadDataBegin true UPDATE_DELAY");
            this.f197536q = false;
            this.N.sendEmptyMessageDelayed(0, this.B == 2 ? 0L : 400);
            b((android.view.ViewGroup) this.f197545z, 0);
            b((android.view.ViewGroup) this.A, 0);
        }
        scroller.isFinished();
    }

    public void d(boolean z17) {
        e(z17, 200);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (h()) {
            return true;
        }
        if (!this.G) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.f197537r && i()) {
            return true;
        }
        db5.k5 k5Var = this.f197543x;
        if (k5Var == null) {
            this.f197533n = false;
        } else {
            this.f197533n = k5Var.E0();
        }
        db5.j5 j5Var = this.f197542w;
        if (j5Var == null) {
            this.f197534o = false;
        } else {
            this.f197534o = j5Var.A5();
        }
        if (this.D == 0) {
            if (this.f197539t) {
                android.view.View view = this.f197545z;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = this.f197545z;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.C == 0) {
            if (this.f197540u) {
                android.view.View view3 = this.A;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view4 = this.A;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (motionEvent.getAction() == 1) {
            j();
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 3) {
            j();
            if (this.I) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
        android.view.GestureDetector gestureDetector = this.f197541v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(motionEvent);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(gestureDetector, arrayList5.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList5.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (onTouchEvent) {
            motionEvent.setAction(3);
            return super.dispatchTouchEvent(motionEvent);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMPullDownView", e17, "", new java.lang.Object[0]);
            return true;
        }
    }

    public void e(boolean z17, int i17) {
        f(z17, i17, false);
    }

    public void f(boolean z17, int i17, boolean z18) {
        if (this.f197537r || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPullDownView", "forceTopLoadData start[%b] loadDataBegin[%b], loadDataEnd[%b], isTopShowAll[%b], getScrollY[%d], loadDataIsPreLoad[%b]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f197536q), java.lang.Boolean.valueOf(this.f197537r), java.lang.Boolean.valueOf(this.f197539t), java.lang.Integer.valueOf(getScrollY()), java.lang.Boolean.valueOf(z18));
            if (z17) {
                android.view.View view = this.f197545z;
                if (view != null) {
                    int i18 = this.D;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                boolean z19 = this.f197539t;
                android.widget.Scroller scroller = this.f197526d;
                if (!z19) {
                    android.view.View view2 = this.f197545z;
                    if (view2 != null && view2.getVisibility() == 4 && !z18) {
                        scroller.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f197531i, i17);
                    }
                    android.view.View view3 = this.f197545z;
                    if (view3 != null && view3.getVisibility() == 0 && !z18) {
                        scroller.startScroll(0, getScrollY(), 0, -getScrollY(), i17);
                    }
                    this.B = z18 ? 2 : 0;
                    this.f197536q = true;
                    this.f197537r = false;
                    if (z18) {
                        computeScroll();
                    }
                } else if (!z18) {
                    scroller.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f197531i, i17);
                }
                postInvalidate();
            } else {
                if (!this.f197537r) {
                    this.f197537r = true;
                    this.f197536q = false;
                    android.view.View view4 = this.f197545z;
                    if (view4 != null && view4.getVisibility() == 0 && !z18) {
                        scrollTo(0, this.f197531i);
                    }
                }
                android.view.View view5 = this.f197545z;
                if (view5 != null && view5.getVisibility() == 0) {
                    android.view.View view6 = this.f197545z;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (this.f197539t) {
                return;
            }
            b((android.view.ViewGroup) this.f197545z, 0);
            b((android.view.ViewGroup) this.A, 0);
        }
    }

    public void g() {
        android.content.Context context = this.f197544y;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bsi, null);
        android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.bsi, null);
        addView(inflate, 0, new android.widget.FrameLayout.LayoutParams(-1, -2));
        addView(inflate2, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    public int getBottomHeight() {
        return this.f197532m;
    }

    public int getCurScreen() {
        return this.f197527e;
    }

    public boolean getIsTopShowAll() {
        return this.f197539t;
    }

    public int getTopHeight() {
        return this.f197531i;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        android.widget.Scroller scroller = this.f197526d;
        if (scroller.isFinished()) {
            return false;
        }
        scroller.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        db5.h5 h5Var = this.K;
        if (h5Var != null) {
            h5Var.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                try {
                    childAt.layout(0, i28, childAt.getMeasuredWidth(), i28 + measuredHeight);
                } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMPullDownView", e17, "childCount: %d, i:%d, childHeight:%d", java.lang.Integer.valueOf(childCount), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(measuredHeight));
                }
                i28 += measuredHeight;
            }
        }
        this.f197545z = getChildAt(0);
        this.A = getChildAt(getChildCount() - 1);
        android.view.View view = this.f197545z;
        int i37 = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i37));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.A;
        int i38 = this.C;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i38));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f197531i = this.f197545z.getHeight();
        this.f197532m = this.A.getHeight();
        int i39 = this.f197531i;
        this.Q = i39;
        if (this.f197538s || i39 == 0) {
            return;
        }
        this.f197538s = true;
        scrollTo(0, i39);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!this.E) {
            g();
            this.E = true;
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        int scrollY;
        if (f18 > 0.0f) {
            this.f197535p = true;
        } else {
            this.f197535p = false;
        }
        boolean z17 = java.lang.Math.abs(f18) > java.lang.Math.abs(f17);
        if (!this.f197534o || ((!this.f197535p && getScrollY() - this.f197531i <= 0) || !z17)) {
            if (!this.f197533n || ((this.f197535p && getScrollY() - this.f197531i >= 0) || !z17)) {
                return false;
            }
            if (!this.F && (this.f197545z.getVisibility() != 0 || (!this.f197535p && getScrollY() <= 0))) {
                return !this.H;
            }
            int i17 = (int) (f18 * 0.5d);
            if (i17 == 0) {
                i17 = f18 > 0.0f ? 1 : -1;
            }
            int scrollY2 = getScrollY() + i17;
            int i18 = this.f197531i;
            if (scrollY2 > i18) {
                i17 = i18 - getScrollY();
            } else if (!this.F && getScrollY() + i17 < 0) {
                i17 = -getScrollY();
            }
            scrollBy(0, i17);
            return true;
        }
        if (!this.F && (this.A.getVisibility() != 0 || (this.f197535p && getScrollY() >= this.f197531i * 2))) {
            return !this.H;
        }
        int i19 = (int) (f18 * 0.5d);
        if (i19 == 0) {
            i19 = f18 > 0.0f ? 1 : -1;
        }
        getScrollY();
        int scrollY3 = getScrollY() + i19;
        int i27 = this.f197531i;
        if (scrollY3 >= i27 || this.f197535p) {
            if (!this.F) {
                int scrollY4 = getScrollY() + i19;
                int i28 = this.f197531i;
                if (scrollY4 >= i28 * 2) {
                    i27 = i28 * 2;
                    scrollY = getScrollY();
                }
            }
            scrollBy(0, i19);
            return true;
        }
        scrollY = getScrollY();
        i19 = i27 - scrollY;
        scrollBy(0, i19);
        return true;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        db5.i5 i5Var = this.R;
        if (i5Var != null) {
            i5Var.a(i17, i18, i19, i27);
        }
        if (this.P) {
            if (this.Q == Integer.MIN_VALUE) {
                this.Q = this.f197531i;
            }
            int i28 = this.Q;
            if (i18 <= i28) {
                int i29 = this.M;
                int i37 = S;
                if (i29 != i37) {
                    setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
                    this.M = i37;
                    return;
                }
            }
            if (i18 > i28) {
                int i38 = this.M;
                int i39 = this.L;
                if (i38 != i39) {
                    setBackgroundColor(i39);
                    this.M = this.L;
                }
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (getScrollY() - this.f197531i < 0) {
                this.f197533n = true;
            }
            if (getScrollY() > this.f197532m) {
                this.f197534o = true;
            }
            j();
        }
        return true;
    }

    public void setAtBottomCallBack(db5.j5 j5Var) {
        this.f197542w = j5Var;
    }

    public void setAtTopCallBack(db5.k5 k5Var) {
        this.f197543x = k5Var;
    }

    public void setBgColor(int i17) {
        this.L = i17;
        this.M = i17;
    }

    public void setBottomView(android.view.View view) {
        if (view == null) {
            this.C = 4;
            android.view.View view2 = this.A;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        this.A = view;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.C = 0;
        removeViewAt(getChildCount() - 1);
        addView(this.A, new android.widget.FrameLayout.LayoutParams(-1, -2));
        this.f197532m = 0;
    }

    public void setBottomViewVisible(boolean z17) {
        int i17 = z17 ? 0 : 4;
        this.C = i17;
        android.view.View view = this.A;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setBottomViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "setBottomViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPullDownView", "setBottomViewVisible visible[%b], stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
    }

    public void setCanOverScrool(boolean z17) {
        this.F = z17;
    }

    public void setEnableGesture(boolean z17) {
        this.G = z17;
    }

    public void setIsBottomShowAll(boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f197540u = z17;
    }

    public void setIsIgnoreActionUpForceTopLoad(boolean z17) {
        this.f197525J = z17;
    }

    public void setIsReturnSuperDispatchWhenCancel(boolean z17) {
        this.I = z17;
    }

    public void setIsTopShowAll(boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f197539t = z17;
    }

    public void setNestedOverScrollEnabled(boolean z17) {
        this.H = z17;
    }

    public void setOnBottomLoadDataListener(db5.l5 l5Var) {
        this.f197530h = l5Var;
    }

    public void setOnInterceptTouchEventListener(db5.h5 h5Var) {
        this.K = h5Var;
    }

    public void setOnPreTopLoadDataListener(db5.m5 m5Var) {
        this.f197529g = m5Var;
    }

    public void setOnScrollChangedListener(db5.i5 i5Var) {
        this.R = i5Var;
    }

    public void setOnSrcollDistance(db5.n5 n5Var) {
    }

    public void setOnTopLoadDataListener(db5.o5 o5Var) {
        this.f197528f = o5Var;
    }

    public void setShowBackground(boolean z17) {
        this.P = z17;
    }

    public void setTopView(android.view.View view) {
        if (view == null) {
            this.D = 4;
            android.view.View view2 = this.f197545z;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        removeViewAt(0);
        this.f197545z = view;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.D = 0;
        addView(this.f197545z, 0, new android.widget.FrameLayout.LayoutParams(-1, -2));
        this.f197531i = 0;
    }

    public void setTopViewVisible(boolean z17) {
        int i17 = z17 ? 0 : 4;
        this.D = i17;
        android.view.View view = this.f197545z;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setTopViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "setTopViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPullDownView", "setTopViewVisible visible[%b]", java.lang.Boolean.valueOf(z17));
    }

    public MMPullDownView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197533n = false;
        this.f197534o = false;
        this.f197535p = false;
        this.f197536q = false;
        this.f197537r = true;
        this.f197538s = false;
        this.f197539t = true;
        this.f197540u = true;
        this.C = 4;
        this.D = 4;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = false;
        this.I = false;
        this.f197525J = false;
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.aaw);
        this.L = color;
        this.M = color;
        this.N = new db5.g5(this);
        this.P = false;
        this.Q = Integer.MIN_VALUE;
        this.f197526d = new android.widget.Scroller(context, new android.view.animation.AccelerateInterpolator());
        this.f197527e = 1;
        this.f197541v = new android.view.GestureDetector(context, this);
        this.f197544y = context;
        int color2 = context.getResources().getColor(com.tencent.mm.R.color.aaw);
        this.L = color2;
        this.M = color2;
    }
}
