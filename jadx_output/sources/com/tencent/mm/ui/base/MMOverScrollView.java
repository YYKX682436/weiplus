package com.tencent.mm.ui.base;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0011\u000b!B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/tencent/mm/ui/base/MMOverScrollView;", "Landroid/widget/FrameLayout;", "", "enableGesture", "Ljz5/f0;", "setEnableGesture", "Ldb5/k5;", "callBack", "setAtTopCallBack", "Ldb5/j5;", "setAtBottomCallBack", "Ldb5/y4;", "u", "Ldb5/y4;", "getViewProvider", "()Ldb5/y4;", "viewProvider", "Ldb5/x4;", org.chromium.base.BaseSwitches.V, "Ldb5/x4;", "getScrollConsumer", "()Ldb5/x4;", "setScrollConsumer", "(Ldb5/x4;)V", "scrollConsumer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "db5/z4", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MMOverScrollView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public db5.j5 f197497d;

    /* renamed from: e, reason: collision with root package name */
    public db5.k5 f197498e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f197499f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.OverScroller f197500g;

    /* renamed from: h, reason: collision with root package name */
    public final n3.q f197501h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f197502i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f197503m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197504n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f197505o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f197506p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f197507q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f197508r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f197509s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f197510t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final db5.y4 viewProvider;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public db5.x4 scrollConsumer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MMOverScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final boolean b(android.view.View view, android.view.MotionEvent motionEvent, android.graphics.PointF pointF) {
        float x17 = pointF.x - motionEvent.getX();
        float y17 = pointF.y - motionEvent.getY();
        motionEvent.offsetLocation(x17, y17);
        boolean dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation(-x17, -y17);
        return motionEvent.getAction() == 1 && dispatchTouchEvent;
    }

    public final android.view.View c(android.view.ViewGroup viewGroup, android.graphics.PointF pointF) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            float left = (childAt.getLeft() - viewGroup.getScrollX()) + childAt.getTranslationX();
            float right = (childAt.getRight() - viewGroup.getScrollY()) + childAt.getTranslationX();
            float top = (childAt.getTop() - viewGroup.getScrollY()) + childAt.getTranslationY();
            float bottom = (childAt.getBottom() - viewGroup.getScrollY()) + childAt.getTranslationY();
            float f17 = pointF.x;
            if (left <= f17 && f17 <= right) {
                float f18 = pointF.y;
                if (top <= f18 && f18 <= bottom) {
                    pointF.offset(-left, -top);
                    return childAt;
                }
            }
            if (childAt instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) childAt;
                if (viewGroup2.getClipChildren()) {
                    continue;
                } else {
                    pointF.offset(-left, -top);
                    android.view.View c17 = c(viewGroup2, pointF);
                    if (c17 != null) {
                        return c17;
                    }
                    pointF.offset(left, top);
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.OverScroller overScroller = this.f197500g;
        if (overScroller.computeScrollOffset()) {
            int currY = overScroller.getCurrY();
            if (this.f197506p && currY == 1) {
                currY = 0;
            }
            scrollTo(0, currY);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
            return;
        }
        this.f197506p = false;
        if (!this.f197507q || this.f197502i) {
            return;
        }
        this.f197507q = false;
        this.f197508r = false;
        db5.x4 x4Var = this.scrollConsumer;
        if (x4Var != null) {
            x4Var.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r0 != 3) goto L51;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.g(r8, r0)
            boolean r0 = r7.f197499f
            r1 = 0
            if (r0 != 0) goto L11
            r7.f197502i = r1
            boolean r8 = super.dispatchTouchEvent(r8)
            return r8
        L11:
            android.graphics.PointF r0 = new android.graphics.PointF
            float r2 = r8.getX()
            float r3 = r8.getY()
            r0.<init>(r2, r3)
            float r2 = r8.getY()
            int r3 = r7.getScrollY()
            int r3 = -r3
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L31
            android.view.View r2 = r7.c(r7, r0)
            goto L32
        L31:
            r2 = 0
        L32:
            db5.k5 r3 = r7.f197498e
            if (r3 == 0) goto L3b
            boolean r3 = r3.E0()
            goto L3c
        L3b:
            r3 = r1
        L3c:
            r7.f197509s = r3
            db5.j5 r3 = r7.f197497d
            if (r3 == 0) goto L47
            boolean r3 = r3.A5()
            goto L48
        L47:
            r3 = r1
        L48:
            r7.f197510t = r3
            int r3 = r8.getAction()
            r4 = 3
            r5 = 1
            if (r3 == 0) goto L5a
            if (r3 == r5) goto L57
            if (r3 == r4) goto L57
            goto L74
        L57:
            r7.f197502i = r1
            goto L74
        L5a:
            r7.f197502i = r5
            r7.f197503m = r1
            r7.f197504n = r1
            r7.f197505o = r1
            r7.f197508r = r1
            r7.f197506p = r1
            r7.f197507q = r1
            android.widget.OverScroller r3 = r7.f197500g
            r3.forceFinished(r5)
            db5.x4 r3 = r7.scrollConsumer
            if (r3 == 0) goto L74
            r3.a()
        L74:
            db5.a5 r3 = new db5.a5
            r3.<init>(r7, r8, r2, r0)
            if (r2 == 0) goto L8a
            boolean r6 = r7.f197504n
            if (r6 != 0) goto L8a
            boolean r6 = r7.f197503m
            if (r6 != 0) goto L8a
            boolean r0 = r7.b(r2, r8, r0)
            if (r0 == 0) goto L8a
            return r5
        L8a:
            n3.q r0 = r7.f197501h
            boolean r0 = r0.a(r8)
            r7.f197503m = r0
            int r0 = r8.getAction()
            if (r0 == r5) goto La8
            r2 = 2
            if (r0 == r2) goto L9e
            if (r0 == r4) goto La8
            goto Lba
        L9e:
            boolean r0 = r7.f197503m
            if (r0 == 0) goto Lba
            r7.f197504n = r5
            r3.invoke()
            goto Lba
        La8:
            db5.x4 r0 = r7.scrollConsumer
            if (r0 == 0) goto Lb3
            boolean r2 = r7.f197508r
            boolean r4 = r7.f197504n
            r0.d(r2, r4)
        Lb3:
            boolean r0 = r7.f197503m
            if (r0 == 0) goto Lba
            r3.invoke()
        Lba:
            boolean r0 = r7.f197503m
            if (r0 != 0) goto Lc8
            boolean r0 = r7.f197504n
            if (r0 != 0) goto Lc8
            boolean r8 = super.dispatchTouchEvent(r8)
            if (r8 == 0) goto Lc9
        Lc8:
            r1 = r5
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MMOverScrollView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final db5.x4 getScrollConsumer() {
        return this.scrollConsumer;
    }

    public final db5.y4 getViewProvider() {
        return this.viewProvider;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
        int scrollY = i18 - getScrollY();
        super.scrollTo(i17, i18);
        db5.x4 x4Var = this.scrollConsumer;
        if (x4Var != null) {
            x4Var.c(scrollY);
        }
    }

    public final void setAtBottomCallBack(db5.j5 callBack) {
        kotlin.jvm.internal.o.g(callBack, "callBack");
        this.f197497d = callBack;
    }

    public final void setAtTopCallBack(db5.k5 callBack) {
        kotlin.jvm.internal.o.g(callBack, "callBack");
        this.f197498e = callBack;
    }

    public final void setEnableGesture(boolean z17) {
        this.f197499f = z17;
    }

    public final void setScrollConsumer(db5.x4 x4Var) {
        this.scrollConsumer = x4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMOverScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f197499f = true;
        this.f197500g = new android.widget.OverScroller(context, new y3.b());
        db5.b5 b5Var = new db5.b5(this);
        this.viewProvider = b5Var;
        this.scrollConsumer = new db5.z4(b5Var);
        this.f197501h = new n3.q(context, new db5.w4(this));
        setClipChildren(false);
        setClipToPadding(false);
    }
}
