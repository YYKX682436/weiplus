package gx2;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout {
    public yz5.l A;
    public yz5.l B;
    public yz5.p C;
    public yz5.p D;
    public yz5.q E;
    public yz5.s F;
    public android.view.View G;
    public android.widget.FrameLayout H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f277362J;
    public android.widget.FrameLayout K;
    public boolean L;
    public hx2.i M;
    public hx2.i N;
    public hx2.i P;
    public hx2.i Q;
    public final java.util.Set R;
    public float S;
    public float T;
    public final java.util.List U;
    public boolean V;
    public final gx2.d W;

    /* renamed from: l1, reason: collision with root package name */
    public final float f277363l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.Paint f277364p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f277365p1;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f277366v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f277367w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.p f277368x;

    /* renamed from: x0, reason: collision with root package name */
    public android.graphics.Paint f277369x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f277370x1;

    /* renamed from: y, reason: collision with root package name */
    public yz5.l f277371y;

    /* renamed from: y0, reason: collision with root package name */
    public final float[] f277372y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f277373y1;

    /* renamed from: z, reason: collision with root package name */
    public yz5.l f277374z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, gx2.a builder) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f277366v = gx2.c.f277346d;
        this.D = gx2.o.f277358d;
        this.E = gx2.n.f277357d;
        this.F = gx2.m.f277356d;
        this.R = new java.util.HashSet();
        this.S = -1.0f;
        this.U = new java.util.ArrayList();
        this.W = new gx2.d();
        this.f277372y0 = new float[]{0.0f, 1.0f};
        this.f277363l1 = ym5.x.a(getContext(), 60.0f);
        this.S = builder.f277335a;
        this.T = builder.f277337c;
        setCancelSettleOnDown(true);
        this.V = builder.f277336b;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.K = frameLayout;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ag8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        setContainer(inflate);
        android.view.View findViewById = getContainer().findViewById(com.tencent.mm.R.id.d4n);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setHeaderContainer((android.widget.FrameLayout) findViewById);
        android.view.View findViewById2 = getContainer().findViewById(com.tencent.mm.R.id.d4l);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setCenterContainer((android.widget.FrameLayout) findViewById2);
        android.view.View findViewById3 = getContainer().findViewById(com.tencent.mm.R.id.d4m);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f277362J = (android.widget.FrameLayout) findViewById3;
        getHeaderContainer().setOnClickListener(gx2.e.f277347d);
        getCenterContainer().setOnClickListener(gx2.f.f277348d);
        android.widget.FrameLayout frameLayout2 = this.f277362J;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.o.o("footerContainer");
            throw null;
        }
        frameLayout2.setOnClickListener(gx2.g.f277349d);
        android.view.View container = getContainer();
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = container instanceof com.tencent.mm.ui.widget.RoundedCornerFrameLayout ? (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) container : null;
        if (roundedCornerFrameLayout != null) {
            float dimension = roundedCornerFrameLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
            roundedCornerFrameLayout.b(dimension, dimension, 0.0f, 0.0f);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) this.T);
            layoutParams.gravity = 80;
            roundedCornerFrameLayout.setLayoutParams(layoutParams);
        }
        android.widget.FrameLayout frameLayout3 = this.K;
        if (frameLayout3 == null) {
            kotlin.jvm.internal.o.o("backgroundContainer");
            throw null;
        }
        addView(frameLayout3);
        addView(getContainer());
        hx2.i iVar = builder.f277338d;
        if (iVar != null) {
            setHeaderComponent(iVar);
        }
        hx2.i iVar2 = builder.f277339e;
        if (iVar2 != null) {
            setCenterComponent(iVar2);
        }
        hx2.i iVar3 = builder.f277340f;
        if (iVar3 != null) {
            setBackgroundComponent(iVar3);
        }
        java.util.Iterator it = ((java.util.HashSet) builder.f277341g).iterator();
        while (it.hasNext()) {
            hx2.h callbackComponent = (hx2.h) it.next();
            kotlin.jvm.internal.o.g(callbackComponent, "callbackComponent");
            callbackComponent.f285656a = this;
            ((java.util.HashSet) this.R).add(callbackComponent);
        }
        if (builder.f277345k != 0) {
            getContainer().setBackgroundColor(builder.f277345k);
        }
        gx2.d area = this.W;
        kotlin.jvm.internal.o.g(area, "area");
        ((java.util.ArrayList) this.U).add(area);
        java.util.Iterator it6 = ((java.util.ArrayList) builder.f277343i).iterator();
        while (it6.hasNext()) {
            gx2.b area2 = (gx2.b) it6.next();
            kotlin.jvm.internal.o.g(area2, "area");
            ((java.util.ArrayList) this.U).add(area2);
        }
        setLayoutParams(builder.f277342h);
        setContentView(getContainer());
        int i17 = builder.f277344j;
        if (i17 >= 0 && java.lang.Math.abs(i17) <= 2) {
            this.edgeAttached = i17;
        }
        setPeekHeight(this.S);
        setExpandHeight(this.T);
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    public void d() {
        r(new gx2.h(this));
        yz5.l lVar = this.f277371y;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(child, "child");
        if (!this.f277373y1) {
            return super.drawChild(canvas, child, j17);
        }
        int save = canvas.save();
        canvas.rotate(180.0f, this.f277365p1 / 2.0f, this.f277370x1 / 2.0f);
        float f17 = this.f277365p1;
        float f18 = this.f277363l1;
        android.graphics.Paint paint = this.f277369x0;
        kotlin.jvm.internal.o.d(paint);
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        canvas.restoreToCount(save);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, child, j17);
        int save2 = canvas.save();
        canvas.rotate(180.0f, this.f277365p1 / 2.0f, this.f277370x1 / 2.0f);
        float f19 = this.f277365p1;
        float f27 = this.f277363l1;
        android.graphics.Paint paint2 = this.f277364p0;
        kotlin.jvm.internal.o.d(paint2);
        canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    public void e() {
        q((int) this.S, (int) this.T);
        yz5.l lVar = this.A;
        if (lVar != null) {
            lVar.invoke(this);
        }
        r(new gx2.i(this));
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    public void f() {
        yz5.l lVar = this.f277367w;
        if (lVar != null) {
            lVar.invoke(this);
        }
        r(new gx2.j(this));
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    public void g() {
        if (!this.V) {
            q((int) this.T, (int) this.S);
        }
        yz5.l lVar = this.f277374z;
        if (lVar != null) {
            lVar.invoke(this);
        }
        r(new gx2.k(this));
    }

    public final hx2.i getBackgroundComponent() {
        return this.Q;
    }

    public final hx2.i getCenterComponent() {
        return this.N;
    }

    public final android.widget.FrameLayout getCenterContainer() {
        android.widget.FrameLayout frameLayout = this.I;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("centerContainer");
        throw null;
    }

    public final android.view.View getContainer() {
        android.view.View view = this.G;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("container");
        throw null;
    }

    public final yz5.a getContentReachTop() {
        return this.f277366v;
    }

    public final boolean getEnableFading() {
        return this.f277373y1;
    }

    public final hx2.i getFooterComponent() {
        return this.P;
    }

    public final hx2.i getHeaderComponent() {
        return this.M;
    }

    public final android.widget.FrameLayout getHeaderContainer() {
        android.widget.FrameLayout frameLayout = this.H;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("headerContainer");
        throw null;
    }

    public final yz5.l getOnDrawerClose() {
        return this.f277371y;
    }

    public final yz5.l getOnDrawerDetach() {
        return this.B;
    }

    public final yz5.l getOnDrawerExpand() {
        return this.A;
    }

    public final yz5.l getOnDrawerOpen() {
        return this.f277367w;
    }

    public final yz5.l getOnDrawerPeek() {
        return this.f277374z;
    }

    public final yz5.p getOnDrawerWillClose() {
        return this.f277368x;
    }

    public final yz5.s getOnInterceptFling() {
        return this.F;
    }

    public final yz5.q getOnInterceptScroll() {
        return this.E;
    }

    public final yz5.p getOnInterceptTouch() {
        return this.D;
    }

    public final yz5.p getOnTranslationChange() {
        return this.C;
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    public void h(gx2.r closeAction) {
        kotlin.jvm.internal.o.g(closeAction, "closeAction");
        r(new gx2.l(this, closeAction));
        yz5.p pVar = this.f277368x;
        if (pVar != null) {
            pVar.invoke(this, closeAction);
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    public boolean i(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return this.L || (((java.lang.Boolean) this.f277366v.invoke()).booleanValue() && f18 > 0.0f && ((java.lang.Boolean) this.F.v(this, motionEvent, e27, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18))).booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(boolean r5, float r6) {
        /*
            r4 = this;
            yz5.a r0 = r4.f277366v
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L5a
            boolean r3 = r4.isDrawerOpen
            if (r3 == 0) goto L18
            boolean r3 = r4.L
            if (r3 != 0) goto L58
        L18:
            if (r0 == 0) goto L5a
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L58
            float r0 = r4.getTranslation()
            float r3 = r4.getBorderLow()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L2d
            r0 = r1
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 != 0) goto L55
            float r0 = r4.getTranslation()
            float r3 = r4.getBorderHigh()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3e
            r0 = r1
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 != 0) goto L55
            float r0 = r4.getTranslation()
            float r3 = r4.getBorderPeek()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L4f
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            if (r0 == 0) goto L53
            goto L55
        L53:
            r0 = r2
            goto L56
        L55:
            r0 = r1
        L56:
            if (r0 != 0) goto L5a
        L58:
            r0 = r1
            goto L5b
        L5a:
            r0 = r2
        L5b:
            if (r0 == 0) goto L74
            yz5.q r0 = r4.E
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object r5 = r0.invoke(r4, r5, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L74
            goto L75
        L74:
            r1 = r2
        L75:
            if (r1 == 0) goto L80
            float r5 = r4.S
            int r5 = (int) r5
            float r6 = r4.T
            int r6 = (int) r6
            r4.q(r5, r6)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx2.q.j(boolean, float):boolean");
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    public boolean k(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        int action = e17.getAction();
        if (action == 0) {
            this.L = false;
            java.util.Iterator it = this.U.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((gx2.b) it.next()).G6(this).contains((int) e17.getX(), (int) e17.getY())) {
                    this.L = true;
                    break;
                }
            }
        } else if (action == 1 || action == 3) {
            this.L = false;
        }
        boolean z17 = this.isDrawerOpen && ((java.lang.Boolean) this.D.invoke(this, e17)).booleanValue();
        if (!z17) {
            this.L = false;
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    public void l(float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        yz5.p pVar = this.C;
        if (pVar != null) {
            pVar.invoke(this, java.lang.Float.valueOf(f17));
        }
        r(new gx2.p(this, f17, source));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yz5.l lVar = this.B;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        super.onSingleTapUp(e17);
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f277364p0 = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.f277364p0;
        kotlin.jvm.internal.o.d(paint2);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        int[] iArr = {com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.aaw), 0};
        android.graphics.Paint paint3 = this.f277364p0;
        kotlin.jvm.internal.o.d(paint3);
        paint3.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f277363l1, iArr, this.f277372y0, android.graphics.Shader.TileMode.CLAMP));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f277369x0 = paint4;
        paint4.setColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.aaw));
        this.f277365p1 = getWidth();
        this.f277370x1 = getHeight();
    }

    public final void q(int i17, int i18) {
        if (getContainer().getLayoutParams().height == i17) {
            android.view.View container = getContainer();
            android.view.ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
            layoutParams.height = i18;
            container.setLayoutParams(layoutParams);
            android.view.View container2 = getContainer();
            float f17 = i17 - i18;
            container2.setTranslationY(container2.getTranslationY() - f17);
            setOriginalTranslationY(getOriginalTranslationY() - f17);
        }
    }

    public final void r(yz5.l lVar) {
        hx2.i iVar = this.M;
        if (iVar != null) {
            lVar.invoke(iVar);
        }
        hx2.i iVar2 = this.N;
        if (iVar2 != null) {
            lVar.invoke(iVar2);
        }
        hx2.i iVar3 = this.P;
        if (iVar3 != null) {
            lVar.invoke(iVar3);
        }
        hx2.i iVar4 = this.Q;
        if (iVar4 != null) {
            lVar.invoke(iVar4);
        }
        java.util.Iterator it = this.R.iterator();
        while (it.hasNext()) {
            lVar.invoke((hx2.h) it.next());
        }
    }

    public final void s(android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    public final void setBackgroundComponent(hx2.i component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.Q = component;
        component.f285656a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.K;
            if (frameLayout != null) {
                s(frameLayout, a17);
            } else {
                kotlin.jvm.internal.o.o("backgroundContainer");
                throw null;
            }
        }
    }

    public final void setCenterComponent(hx2.i component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.N = component;
        component.f285656a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            s(getCenterContainer(), a17);
        }
    }

    public final void setCenterContainer(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.I = frameLayout;
    }

    public final void setContainer(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.G = view;
    }

    public final void setContentReachTop(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.f277366v = aVar;
    }

    public final void setEnableFading(boolean z17) {
        this.f277373y1 = z17;
    }

    @Override // com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout
    public void setExpandHeight(float f17) {
        super.setExpandHeight(f17);
        if (this.T == f17) {
            return;
        }
        this.T = f17;
        setCurrentState(gx2.s.f277382f);
        android.view.View container = getContainer();
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = container instanceof com.tencent.mm.ui.widget.RoundedCornerFrameLayout ? (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) container : null;
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.getLayoutParams().height = (int) this.T;
            roundedCornerFrameLayout.requestLayout();
        }
    }

    public final void setExpandHeightAndLayoutIfNeeded(float f17) {
        super.setExpandHeight(f17);
        if (this.T == f17) {
            return;
        }
        this.T = f17;
        android.view.View container = getContainer();
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = container instanceof com.tencent.mm.ui.widget.RoundedCornerFrameLayout ? (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) container : null;
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.getLayoutParams().height = (int) this.T;
            roundedCornerFrameLayout.requestLayout();
        }
        if (getCurrentState() == gx2.s.f277381e) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(this, false, null, false, null, 10, null);
        }
    }

    public final void setFooterComponent(hx2.i component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.P = component;
        component.f285656a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.f277362J;
            if (frameLayout != null) {
                s(frameLayout, a17);
            } else {
                kotlin.jvm.internal.o.o("footerContainer");
                throw null;
            }
        }
    }

    public final void setHeaderComponent(hx2.i component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.M = component;
        component.f285656a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            s(getHeaderContainer(), a17);
        }
    }

    public final void setHeaderContainer(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.H = frameLayout;
    }

    public final void setOnDrawerClose(yz5.l lVar) {
        this.f277371y = lVar;
    }

    public final void setOnDrawerDetach(yz5.l lVar) {
        this.B = lVar;
    }

    public final void setOnDrawerExpand(yz5.l lVar) {
        this.A = lVar;
    }

    public final void setOnDrawerOpen(yz5.l lVar) {
        this.f277367w = lVar;
    }

    public final void setOnDrawerPeek(yz5.l lVar) {
        this.f277374z = lVar;
    }

    public final void setOnDrawerWillClose(yz5.p pVar) {
        this.f277368x = pVar;
    }

    public final void setOnInterceptFling(yz5.s sVar) {
        kotlin.jvm.internal.o.g(sVar, "<set-?>");
        this.F = sVar;
    }

    public final void setOnInterceptScroll(yz5.q qVar) {
        kotlin.jvm.internal.o.g(qVar, "<set-?>");
        this.E = qVar;
    }

    public final void setOnInterceptTouch(yz5.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<set-?>");
        this.D = pVar;
    }

    public final void setOnTranslationChange(yz5.p pVar) {
        this.C = pVar;
    }

    public final void setPeekHeightAndLayoutIfNeeded(float f17) {
        if (this.S == f17) {
            return;
        }
        this.S = f17;
        if (getCurrentState() != gx2.s.f277381e) {
            setPeekHeight(f17);
        } else {
            p(f17);
            requestLayout();
        }
    }
}
