package com.tencent.mm.plugin.finder.view.sidebar;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/sidebar/DraggableConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "need", "Ljz5/f0;", "setNeedIntercept", "", "angle", "setAngle", "Lxx2/a;", "D", "Lxx2/a;", "getDragListener", "()Lxx2/a;", "setDragListener", "(Lxx2/a;)V", "dragListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DraggableConstraintLayout extends androidx.constraintlayout.widget.ConstraintLayout {
    public static int L = 45;
    public int A;
    public int B;
    public int C;

    /* renamed from: D, reason: from kotlin metadata */
    public xx2.a dragListener;
    public android.view.VelocityTracker E;
    public boolean F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f133051J;
    public boolean K;

    /* renamed from: v, reason: collision with root package name */
    public final int f133052v;

    /* renamed from: w, reason: collision with root package name */
    public final int f133053w;

    /* renamed from: x, reason: collision with root package name */
    public final int f133054x;

    /* renamed from: y, reason: collision with root package name */
    public final int f133055y;

    /* renamed from: z, reason: collision with root package name */
    public double f133056z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableConstraintLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f133052v = 8;
        this.f133053w = 8000;
        this.f133054x = 25;
        this.f133055y = 400;
        this.f133056z = java.lang.Math.tan((L / 180.0f) * 3.141592653589793d);
        this.A = 0;
        this.C = Integer.MAX_VALUE;
        this.G = -1;
        this.K = true;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.f133052v = viewConfiguration != null ? viewConfiguration.getScaledTouchSlop() : 8;
        this.f133053w = viewConfiguration != null ? viewConfiguration.getScaledMaximumFlingVelocity() : 8000;
        this.f133054x = i65.a.b(getContext(), 25);
        this.f133055y = i65.a.b(getContext(), 400);
    }

    public final void A(int i17, boolean z17, int i18, int i19, android.view.MotionEvent motionEvent) {
        int abs = java.lang.Math.abs(i17);
        int i27 = this.f133052v;
        if (abs > i27 && z17) {
            int i28 = i18 - this.H;
            int i29 = i19 - this.I;
            double abs2 = java.lang.Math.abs(i28 * this.f133056z);
            double d17 = (-1) * abs2;
            C("checkAngle angleRate:" + this.f133056z + ", x,y:(" + i18 + ", " + i19 + "), lastX,Y:(" + this.H + ", " + this.I + "), x1,y1:(" + i28 + ", " + i29 + "), minY:" + d17 + ", maxY:" + abs2);
            double d18 = (double) i29;
            if (d18 >= d17 && d18 <= abs2) {
                this.H = i18;
                this.I = i19;
                this.F = true;
                xx2.a aVar = this.dragListener;
                if (aVar != null) {
                    xx2.l lVar = ((xx2.b) aVar).f457966a;
                    lVar.f457992n = 0.0f;
                    lVar.f457985g.b(lVar.f457987i == 1);
                }
                if (this.E == null) {
                    this.E = android.view.VelocityTracker.obtain();
                }
                android.view.VelocityTracker velocityTracker = this.E;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                android.view.ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
        }
        if (java.lang.Math.abs(i17) > i27) {
            this.H = i18;
            this.I = i19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r14 = this;
            xx2.a r0 = r14.dragListener
            r1 = 0
            if (r0 == 0) goto L96
            int r2 = r14.f133051J
            int r3 = java.lang.Math.abs(r2)
            int r4 = r14.B
            r5 = 1
            r6 = 0
            if (r3 <= r4) goto L12
            goto L4f
        L12:
            android.view.VelocityTracker r3 = r14.E
            if (r3 == 0) goto L1e
            int r4 = r14.f133053w
            float r4 = (float) r4
            r7 = 1000(0x3e8, float:1.401E-42)
            r3.computeCurrentVelocity(r7, r4)
        L1e:
            android.view.VelocityTracker r3 = r14.E
            if (r3 == 0) goto L29
            int r4 = r14.G
            float r3 = r3.getXVelocity(r4)
            goto L2a
        L29:
            r3 = r6
        L2a:
            int r4 = r14.A
            if (r4 != r5) goto L33
            int r4 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r4 >= 0) goto L39
            goto L37
        L33:
            int r4 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r4 <= 0) goto L39
        L37:
            r4 = r5
            goto L3a
        L39:
            r4 = r1
        L3a:
            int r2 = java.lang.Math.abs(r2)
            int r7 = r14.f133054x
            if (r2 <= r7) goto L51
            if (r4 == 0) goto L51
            float r2 = java.lang.Math.abs(r3)
            int r3 = r14.f133055y
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L51
        L4f:
            r2 = r1
            goto L52
        L51:
            r2 = r5
        L52:
            xx2.b r0 = (xx2.b) r0
            xx2.l r7 = r0.f457966a
            int r0 = r7.f457987i
            r3 = 2
            if (r0 != r5) goto L5d
            if (r2 == 0) goto L61
        L5d:
            if (r0 != r3) goto L63
            if (r2 == 0) goto L63
        L61:
            r0 = r5
            goto L64
        L63:
            r0 = r1
        L64:
            float r9 = r7.f457992n
            int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            xx2.d r8 = r7.f457985g
            if (r4 <= 0) goto L8a
            r4 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r10 >= 0) goto L8a
            com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout r3 = r7.f457983e
            r3.A = r1
            if (r2 == 0) goto L7a
            r10 = r6
            goto L7b
        L7a:
            r10 = r4
        L7b:
            xx2.i r13 = new xx2.i
            r13.<init>(r7, r0)
            r8.getClass()
            r11 = 300(0x12c, double:1.48E-321)
            r8 = r3
            r7.d(r8, r9, r10, r11, r13)
            goto L96
        L8a:
            r7.c(r0)
            int r0 = r7.f457987i
            if (r0 != r3) goto L92
            goto L93
        L92:
            r5 = r1
        L93:
            r8.a(r5)
        L96:
            r14.F = r1
            r0 = -1
            r14.G = r0
            r14.f133051J = r1
            r14.H = r1
            r14.I = r1
            android.view.VelocityTracker r0 = r14.E
            if (r0 == 0) goto La8
            r0.recycle()
        La8:
            r0 = 0
            r14.E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.B():void");
    }

    public final void C(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("lxl layout", str);
    }

    public final void D(boolean z17, int i17, int i18) {
        this.A = z17 ? 1 : 2;
        this.C = i18;
        this.B = i17;
        C("enableDrag, dragMode:" + this.A + ", maxTotalDistance:" + i18 + ", springBackDistance:" + i17);
    }

    public final xx2.a getDragListener() {
        return this.dragListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r0 != 3) goto L54;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r0 != 3) goto L66;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        if (this.F) {
            return;
        }
        C("requestDisallowInterceptTouchEvent " + z17);
        super.requestDisallowInterceptTouchEvent(z17);
    }

    public final void setAngle(int i17) {
        this.f133056z = java.lang.Math.tan(((i17 % 180) / 180.0f) * 3.141592653589793d);
    }

    public final void setDragListener(xx2.a aVar) {
        this.dragListener = aVar;
    }

    public final void setNeedIntercept(boolean z17) {
        this.K = z17;
        C("setNeedIntercept, " + this.K);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableConstraintLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f133052v = 8;
        this.f133053w = 8000;
        this.f133054x = 25;
        this.f133055y = 400;
        this.f133056z = java.lang.Math.tan((L / 180.0f) * 3.141592653589793d);
        this.A = 0;
        this.C = Integer.MAX_VALUE;
        this.G = -1;
        this.K = true;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.f133052v = viewConfiguration != null ? viewConfiguration.getScaledTouchSlop() : 8;
        this.f133053w = viewConfiguration != null ? viewConfiguration.getScaledMaximumFlingVelocity() : 8000;
        this.f133054x = i65.a.b(getContext(), 25);
        this.f133055y = i65.a.b(getContext(), 400);
    }
}
