package dj0;

/* loaded from: classes14.dex */
public final class i extends android.widget.FrameLayout implements n3.e0, android.view.GestureDetector.OnGestureListener {
    public android.view.ViewGroup A;
    public boolean B;
    public boolean C;
    public android.graphics.Rect D;
    public boolean E;
    public boolean F;
    public java.util.List G;

    /* renamed from: d, reason: collision with root package name */
    public final n3.f0 f232829d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.OverScroller f232830e;

    /* renamed from: f, reason: collision with root package name */
    public int f232831f;

    /* renamed from: g, reason: collision with root package name */
    public int f232832g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f232833h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f232834i;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f232835m;

    /* renamed from: n, reason: collision with root package name */
    public dj0.z f232836n;

    /* renamed from: o, reason: collision with root package name */
    public int f232837o;

    /* renamed from: p, reason: collision with root package name */
    public int f232838p;

    /* renamed from: q, reason: collision with root package name */
    public int f232839q;

    /* renamed from: r, reason: collision with root package name */
    public int f232840r;

    /* renamed from: s, reason: collision with root package name */
    public final int f232841s;

    /* renamed from: t, reason: collision with root package name */
    public final int f232842t;

    /* renamed from: u, reason: collision with root package name */
    public int f232843u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.VelocityTracker f232844v;

    /* renamed from: w, reason: collision with root package name */
    public final int f232845w;

    /* renamed from: x, reason: collision with root package name */
    public final int f232846x;

    /* renamed from: y, reason: collision with root package name */
    public final int f232847y;

    /* renamed from: z, reason: collision with root package name */
    public int f232848z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f232829d = new n3.f0(this);
        this.f232830e = new android.widget.OverScroller(context, dj0.h.f232828a);
        new android.view.GestureDetector(context, this, null);
        this.f232833h = new int[2];
        this.f232834i = new int[2];
        this.f232835m = new int[2];
        this.f232843u = -1;
        this.f232845w = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f232846x = 1;
        this.f232847y = 2;
        this.f232848z = 0;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f232841s = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f232842t = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    public static final void a(dj0.i iVar) {
        android.widget.OverScroller overScroller = iVar.f232830e;
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        boolean isFinished = overScroller.isFinished();
        n3.f0 f0Var = iVar.f232829d;
        if (isFinished) {
            f0Var.k(1);
            return;
        }
        int currY = overScroller.getCurrY() - iVar.f232840r;
        iVar.f232840r = overScroller.getCurrY();
        if (iVar.f232829d.d(0, currY, iVar.f232834i, null, 1)) {
            currY -= iVar.f232834i[1];
        }
        int i17 = iVar.f232832g;
        int i18 = i17 + currY;
        if (i18 < 0) {
            int i19 = 0 - i17;
            iVar.f232832g = 0;
            float f17 = 0 / iVar.getResources().getDisplayMetrics().density;
            dj0.z zVar = iVar.f232836n;
            if (zVar != null) {
                zVar.a(f17);
            }
            boolean f18 = iVar.f232829d.f(0, 0, 0, currY - i19, iVar.f232833h, 1, null);
            if (iVar.f232833h[1] == 0 || !f18) {
                iVar.setScrollState(0);
            }
        } else {
            iVar.f232832g = i18;
            int i27 = iVar.f232831f;
            if (i18 > i27) {
                iVar.f232832g = i27;
                iVar.setScrollState(0);
            }
            float f19 = iVar.f232832g / iVar.getResources().getDisplayMetrics().density;
            dj0.z zVar2 = iVar.f232836n;
            if (zVar2 != null) {
                zVar2.a(f19);
            }
        }
        if (computeScrollOffset) {
            iVar.postOnAnimation(new dj0.a(iVar));
        } else {
            f0Var.k(1);
        }
    }

    private final void setScrollState(int i17) {
        if (i17 == this.f232848z) {
            return;
        }
        this.f232848z = i17;
        if (i17 != this.f232847y) {
            this.f232830e.abortAnimation();
        }
    }

    public final boolean b(int i17, android.view.MotionEvent motionEvent) {
        int i18 = this.f232832g;
        if (i18 + i17 < 0) {
            int i19 = i17 - (0 - i18);
            int i27 = i17 - i19;
            this.f232832g = 0;
            float f17 = 0 / getResources().getDisplayMetrics().density;
            dj0.z zVar = this.f232836n;
            if (zVar != null) {
                zVar.a(f17);
            }
            if (dispatchNestedScroll(0, i27, 0, i19, this.f232833h)) {
                int i28 = this.f232838p;
                int[] iArr = this.f232833h;
                int i29 = iArr[1];
                this.f232838p = i28 - i29;
                int i37 = this.f232839q;
                int i38 = iArr[0];
                this.f232839q = i37 - i38;
                if (motionEvent != null) {
                    motionEvent.offsetLocation(i38, i29);
                }
                int[] iArr2 = this.f232835m;
                iArr2[0] = iArr2[0] + iArr[0];
                iArr2[1] = iArr2[1] + iArr[1];
            }
        } else {
            int i39 = i18 + i17;
            this.f232832g = i39;
            int i47 = this.f232831f;
            if (i39 > i47) {
                this.f232832g = i47;
            }
            float f18 = this.f232832g / getResources().getDisplayMetrics().density;
            dj0.z zVar2 = this.f232836n;
            if (zVar2 != null) {
                zVar2.a(f18);
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.f232829d.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.f232829d.b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return this.f232829d.c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return this.f232829d.e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f232829d.h(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f232829d.f334334d;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        int[] iArr = this.f232835m;
        iArr[0] = 0;
        iArr[1] = 0;
        this.f232829d.j(2, 0);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent e17, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e17, "e1");
        kotlin.jvm.internal.o.g(e27, "e2");
        n3.f0 f0Var = this.f232829d;
        if (f0Var.b(f17, f18)) {
            return true;
        }
        f0Var.j(2, 0);
        this.f232840r = 0;
        this.f232830e.fling(0, 0, 0, -((int) f18), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        postOnAnimation(new dj0.c(this));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.B
            if (r0 != 0) goto L12
            android.view.ViewGroup r0 = r4.A
            if (r0 == 0) goto Ld
            boolean r5 = r0.onGenericMotionEvent(r5)
            return r5
        Ld:
            boolean r5 = super.onGenericMotionEvent(r5)
            return r5
        L12:
            android.view.ViewGroup r0 = r4.A
            if (r0 == 0) goto L19
            r0.onGenericMotionEvent(r5)
        L19:
            if (r5 != 0) goto L20
            boolean r5 = super.onGenericMotionEvent(r5)
            return r5
        L20:
            int r0 = r5.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L58
            int r0 = r5.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L3a
            r0 = 9
            float r0 = r5.getAxisValue(r0)
        L38:
            float r0 = -r0
            goto L4b
        L3a:
            int r0 = r5.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L4a
            r0 = 26
            float r0 = r5.getAxisValue(r0)
            goto L38
        L4a:
            r0 = r1
        L4b:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L51
            r1 = 1
            goto L52
        L51:
            r1 = r2
        L52:
            if (r1 != 0) goto L58
            int r0 = (int) r0
            r4.b(r0, r5)
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dj0.i.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.B) {
            android.view.ViewGroup viewGroup = this.A;
            return viewGroup != null ? viewGroup.onInterceptTouchEvent(motionEvent) : super.onInterceptTouchEvent(motionEvent);
        }
        android.view.ViewGroup viewGroup2 = this.A;
        if (viewGroup2 != null) {
            viewGroup2.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.f232844v == null) {
            this.f232844v = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f232844v;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        n3.f0 f0Var = this.f232829d;
        int i17 = this.f232846x;
        if (actionMasked == 0) {
            this.f232843u = motionEvent.getPointerId(0);
            this.f232838p = a06.d.b(motionEvent.getY());
            this.f232839q = a06.d.b(motionEvent.getX());
            this.f232837o = this.f232838p;
            if (this.f232848z == this.f232847y) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(i17);
            }
            int[] iArr = this.f232835m;
            iArr[0] = 0;
            iArr[1] = 0;
            f0Var.j(2, 0);
        } else if (actionMasked == 1) {
            android.view.VelocityTracker velocityTracker2 = this.f232844v;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
            f0Var.k(0);
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                android.view.VelocityTracker velocityTracker3 = this.f232844v;
                if (velocityTracker3 != null) {
                    velocityTracker3.clear();
                }
                f0Var.k(0);
                this.C = false;
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f232843u = motionEvent.getPointerId(actionIndex);
                this.f232838p = a06.d.b(motionEvent.getY());
                this.f232839q = a06.d.b(motionEvent.getX());
                this.f232837o = this.f232838p;
            } else if (actionMasked == 6 && motionEvent.getPointerId(actionIndex) == this.f232843u) {
                this.f232843u = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                int b17 = a06.d.b(motionEvent.getY());
                this.f232837o = b17;
                this.f232838p = b17;
                this.f232839q = a06.d.b(motionEvent.getX());
            }
        } else {
            if (motionEvent.findPointerIndex(this.f232843u) < 0) {
                return false;
            }
            int b18 = a06.d.b(motionEvent.getY());
            this.f232839q = a06.d.b(motionEvent.getX());
            if (this.f232848z != i17 && java.lang.Math.abs(b18 - this.f232837o) > this.f232845w) {
                this.f232838p = b18;
                setScrollState(i17);
            }
        }
        return this.f232848z == i17;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/flutter/weui/FlutterNativeScrollView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/flutter/weui/FlutterNativeScrollView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View target, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(target, "target");
        if (z17) {
            return super.onNestedFling(target, f17, f18, z17);
        }
        this.f232830e.fling(0, this.f232832g, 0, -((int) f18), 0, 0, 0, this.f232831f);
        postOnAnimation(new dj0.d(this));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View target, float f17, float f18) {
        kotlin.jvm.internal.o.g(target, "target");
        int i17 = this.f232832g;
        if (i17 == 0 || i17 == this.f232831f) {
            return false;
        }
        this.f232830e.fling(0, 0, 0, -((int) f18), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        postOnAnimation(new dj0.e(this));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View target, int i17, int i18, int[] consumed) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        int i19 = this.f232832g + i18;
        this.f232832g = i19;
        postOnAnimation(new dj0.f(this, i19 / getResources().getDisplayMetrics().density));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View target, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(target, "target");
        int i28 = this.f232832g;
        int i29 = i28 + i27;
        int i37 = this.f232831f;
        if (i29 > i37) {
            i27 = (i27 - i29) - i37;
        } else if (i29 < 0) {
            i27 += i29;
        }
        int i38 = i28 + i27;
        this.f232832g = i38;
        postOnAnimation(new dj0.g(this, i38 / getResources().getDisplayMetrics().density));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent e17, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e17, "e1");
        kotlin.jvm.internal.o.g(e27, "e2");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/flutter/weui/FlutterNativeScrollView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(false, this, "com/tencent/mm/flutter/weui/FlutterNativeScrollView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x028b, code lost:
    
        if (r1 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02f8, code lost:
    
        if ((r22 != null && r22.getAction() == 1) != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if ((r22 != null && r22.getAction() == 1) != false) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dj0.i.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setMaxScrollOffset(int i17) {
        this.f232831f = i17;
    }
}
