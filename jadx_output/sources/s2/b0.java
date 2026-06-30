package s2;

/* loaded from: classes14.dex */
public final class b0 extends androidx.compose.ui.platform.AbstractComposeView {
    public final android.graphics.Rect A;
    public final n0.v2 B;
    public boolean C;
    public final int[] D;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f402197n;

    /* renamed from: o, reason: collision with root package name */
    public s2.g0 f402198o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f402199p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f402200q;

    /* renamed from: r, reason: collision with root package name */
    public final s2.c0 f402201r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.WindowManager f402202s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f402203t;

    /* renamed from: u, reason: collision with root package name */
    public s2.f0 f402204u;

    /* renamed from: v, reason: collision with root package name */
    public p2.s f402205v;

    /* renamed from: w, reason: collision with root package name */
    public final n0.v2 f402206w;

    /* renamed from: x, reason: collision with root package name */
    public final n0.v2 f402207x;

    /* renamed from: y, reason: collision with root package name */
    public p2.o f402208y;

    /* renamed from: z, reason: collision with root package name */
    public final n0.e5 f402209z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(yz5.a r15, s2.g0 r16, java.lang.String r17, android.view.View r18, p2.f r19, s2.f0 r20, java.util.UUID r21, s2.c0 r22, int r23, kotlin.jvm.internal.i r24) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.b0.<init>(yz5.a, s2.g0, java.lang.String, android.view.View, p2.f, s2.f0, java.util.UUID, s2.c0, int, kotlin.jvm.internal.i):void");
    }

    private final yz5.p getContent() {
        return (yz5.p) this.B.getValue();
    }

    private final int getDisplayHeight() {
        return a06.d.b(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return a06.d.b(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s1.z getParentLayoutCoordinates() {
        return (s1.z) this.f402207x.getValue();
    }

    private final void setClippingEnabled(boolean z17) {
        android.view.WindowManager.LayoutParams layoutParams = this.f402203t;
        layoutParams.flags = z17 ? layoutParams.flags & (-513) : layoutParams.flags | 512;
        ((s2.e0) this.f402201r).b(this.f402202s, this, layoutParams);
    }

    private final void setContent(yz5.p pVar) {
        ((n0.q4) this.B).setValue(pVar);
    }

    private final void setIsFocusable(boolean z17) {
        android.view.WindowManager.LayoutParams layoutParams = this.f402203t;
        layoutParams.flags = !z17 ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        ((s2.e0) this.f402201r).b(this.f402202s, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(s1.z zVar) {
        ((n0.q4) this.f402207x).setValue(zVar);
    }

    private final void setSecurePolicy(s2.h0 h0Var) {
        android.view.View view = this.f402200q;
        kotlin.jvm.internal.o.g(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        boolean z17 = true;
        boolean z18 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        kotlin.jvm.internal.o.g(h0Var, "<this>");
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            z17 = z18;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            z17 = false;
        }
        android.view.WindowManager.LayoutParams layoutParams3 = this.f402203t;
        layoutParams3.flags = z17 ? layoutParams3.flags | 8192 : layoutParams3.flags & (-8193);
        ((s2.e0) this.f402201r).b(this.f402202s, this, layoutParams3);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void a(n0.o oVar, int i17) {
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-857613600);
        getContent().invoke(y0Var, 0);
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new s2.z(this, i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getKeyCode() == 4 && this.f402198o.f402224b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                yz5.a aVar = this.f402197n;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void e(boolean z17, int i17, int i18, int i19, int i27) {
        super.e(z17, i17, i18, i19, i27);
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        android.view.WindowManager.LayoutParams layoutParams = this.f402203t;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        ((s2.e0) this.f402201r).b(this.f402202s, this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void f(int i17, int i18) {
        this.f402198o.getClass();
        super.f(android.view.View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((java.lang.Boolean) ((n0.x1) this.f402209z).getValue()).booleanValue();
    }

    public final android.view.WindowManager.LayoutParams getParams$ui_release() {
        return this.f402203t;
    }

    public final p2.s getParentLayoutDirection() {
        return this.f402205v;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final p2.q m534getPopupContentSizebOM6tXw() {
        return (p2.q) this.f402206w.getValue();
    }

    public final s2.f0 getPositionProvider() {
        return this.f402204u;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.C;
    }

    public androidx.compose.ui.platform.AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final java.lang.String getTestTag() {
        return this.f402199p;
    }

    public android.view.View getViewRoot() {
        return null;
    }

    public final void j(n0.g1 parent, yz5.p content) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.C = true;
    }

    public final void k(yz5.a aVar, s2.g0 properties, java.lang.String testTag, p2.s layoutDirection) {
        int i17;
        kotlin.jvm.internal.o.g(properties, "properties");
        kotlin.jvm.internal.o.g(testTag, "testTag");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        this.f402197n = aVar;
        this.f402198o = properties;
        this.f402199p = testTag;
        setIsFocusable(properties.f402223a);
        setSecurePolicy(properties.f402226d);
        setClippingEnabled(properties.f402228f);
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i17 = 1;
            if (ordinal != 1) {
                throw new jz5.j();
            }
        } else {
            i17 = 0;
        }
        super.setLayoutDirection(i17);
    }

    public final void l() {
        s1.z parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        u1.c1 c1Var = (u1.c1) parentLayoutCoordinates;
        long j17 = c1Var.f402052f;
        long u07 = c1Var.u0(d1.e.f225623b);
        long a17 = p2.n.a(a06.d.b(d1.e.c(u07)), a06.d.b(d1.e.d(u07)));
        int i17 = (int) (a17 >> 32);
        p2.o oVar = new p2.o(i17, p2.m.b(a17), ((int) (j17 >> 32)) + i17, p2.m.b(a17) + p2.q.b(j17));
        if (kotlin.jvm.internal.o.b(oVar, this.f402208y)) {
            return;
        }
        this.f402208y = oVar;
        n();
    }

    public final void m(s1.z parentLayoutCoordinates) {
        kotlin.jvm.internal.o.g(parentLayoutCoordinates, "parentLayoutCoordinates");
        setParentLayoutCoordinates(parentLayoutCoordinates);
        l();
    }

    public final void n() {
        p2.q m534getPopupContentSizebOM6tXw;
        long a17;
        p2.o oVar = this.f402208y;
        if (oVar == null || (m534getPopupContentSizebOM6tXw = m534getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        s2.c0 c0Var = this.f402201r;
        ((s2.e0) c0Var).getClass();
        android.view.View composeView = this.f402200q;
        kotlin.jvm.internal.o.g(composeView, "composeView");
        android.graphics.Rect outRect = this.A;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
        long a18 = p2.r.a(outRect.right - outRect.left, outRect.bottom - outRect.top);
        s2.f0 f0Var = this.f402204u;
        p2.s layoutDirection = this.f402205v;
        k0.l lVar = (k0.l) f0Var;
        lVar.getClass();
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        int ordinal = lVar.f302941a.ordinal();
        long j17 = lVar.f302942b;
        int i17 = oVar.f351392b;
        int i18 = oVar.f351391a;
        if (ordinal != 0) {
            long j18 = m534getPopupContentSizebOM6tXw.f351396a;
            if (ordinal == 1) {
                a17 = p2.n.a((i18 + ((int) (j17 >> 32))) - ((int) (j18 >> 32)), i17 + p2.m.b(j17));
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                int i19 = p2.m.f351389c;
                a17 = p2.n.a((i18 + ((int) (j17 >> 32))) - (((int) (j18 >> 32)) / 2), i17 + p2.m.b(j17));
            }
        } else {
            a17 = p2.n.a(i18 + ((int) (j17 >> 32)), i17 + p2.m.b(j17));
        }
        android.view.WindowManager.LayoutParams layoutParams = this.f402203t;
        layoutParams.x = (int) (a17 >> 32);
        layoutParams.y = p2.m.b(a17);
        if (this.f402198o.f402227e) {
            c0Var.a(this, (int) (a18 >> 32), p2.q.b(a18));
        }
        ((s2.e0) c0Var).b(this.f402202s, this, layoutParams);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f402198o.f402225c) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z17 = false;
        if ((motionEvent != null && motionEvent.getAction() == 0) && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            yz5.a aVar = this.f402197n;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z17 = true;
        }
        if (!z17) {
            return super.onTouchEvent(motionEvent);
        }
        yz5.a aVar2 = this.f402197n;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i17) {
    }

    public final void setParentLayoutDirection(p2.s sVar) {
        kotlin.jvm.internal.o.g(sVar, "<set-?>");
        this.f402205v = sVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m535setPopupContentSizefhxjrPA(p2.q qVar) {
        ((n0.q4) this.f402206w).setValue(qVar);
    }

    public final void setPositionProvider(s2.f0 f0Var) {
        kotlin.jvm.internal.o.g(f0Var, "<set-?>");
        this.f402204u = f0Var;
    }

    public final void setTestTag(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f402199p = str;
    }
}
