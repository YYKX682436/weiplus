package lm4;

/* loaded from: classes14.dex */
public class b0 extends com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout {
    public yz5.l A;
    public yz5.p B;
    public yz5.p C;
    public yz5.q D;
    public yz5.s E;
    public android.view.View F;
    public android.widget.FrameLayout G;
    public android.widget.FrameLayout H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f319530J;
    public boolean K;
    public mm4.g L;
    public mm4.g M;
    public mm4.g N;
    public mm4.g P;
    public final java.util.Set Q;
    public float R;
    public float S;
    public final java.util.List T;
    public final lm4.o U;
    public android.graphics.Paint V;
    public android.graphics.Paint W;

    /* renamed from: l1, reason: collision with root package name */
    public int f319531l1;

    /* renamed from: p0, reason: collision with root package name */
    public final float[] f319532p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f319533p1;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f319534v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f319535w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f319536x;

    /* renamed from: x0, reason: collision with root package name */
    public final float f319537x0;

    /* renamed from: y, reason: collision with root package name */
    public yz5.l f319538y;

    /* renamed from: y0, reason: collision with root package name */
    public int f319539y0;

    /* renamed from: z, reason: collision with root package name */
    public yz5.l f319540z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, lm4.l builder) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f319534v = lm4.n.f319587d;
        this.C = lm4.z.f319598d;
        this.D = lm4.y.f319597d;
        this.E = lm4.x.f319596d;
        this.Q = new java.util.HashSet();
        this.R = -1.0f;
        this.T = new java.util.ArrayList();
        this.U = new lm4.o();
        this.f319532p0 = new float[]{0.0f, 1.0f};
        this.f319537x0 = ym5.x.a(getContext(), 60.0f);
        this.R = -1.0f;
        this.S = builder.f319580a;
        setCancelSettleOnDown(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f319530J = frameLayout;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489578d14, (android.view.ViewGroup) null);
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
        this.I = (android.widget.FrameLayout) findViewById3;
        getHeaderContainer().setOnClickListener(lm4.p.f319588d);
        getCenterContainer().setOnClickListener(lm4.q.f319589d);
        android.widget.FrameLayout frameLayout2 = this.I;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.o.o("footerContainer");
            throw null;
        }
        frameLayout2.setOnClickListener(lm4.r.f319590d);
        android.view.View container = getContainer();
        android.widget.FrameLayout frameLayout3 = container instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) container : null;
        if (frameLayout3 != null) {
            getContainer().setOutlineProvider(new lm4.s(frameLayout3.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9)));
            getContainer().setClipToOutline(true);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) this.S);
            layoutParams.gravity = 80;
            frameLayout3.setLayoutParams(layoutParams);
        }
        android.widget.FrameLayout frameLayout4 = this.f319530J;
        if (frameLayout4 == null) {
            kotlin.jvm.internal.o.o("backgroundContainer");
            throw null;
        }
        addView(frameLayout4);
        addView(getContainer());
        mm4.g gVar = builder.f319581b;
        if (gVar != null) {
            setHeaderComponent(gVar);
        }
        mm4.g gVar2 = builder.f319582c;
        if (gVar2 != null) {
            setCenterComponent(gVar2);
        }
        java.util.Iterator it = ((java.util.HashSet) builder.f319583d).iterator();
        while (it.hasNext()) {
            mm4.f callbackComponent = (mm4.f) it.next();
            kotlin.jvm.internal.o.g(callbackComponent, "callbackComponent");
            ((java.util.HashSet) this.Q).add(callbackComponent);
        }
        lm4.o area = this.U;
        kotlin.jvm.internal.o.g(area, "area");
        ((java.util.ArrayList) this.T).add(area);
        java.util.Iterator it6 = ((java.util.ArrayList) builder.f319585f).iterator();
        while (it6.hasNext()) {
            lm4.m area2 = (lm4.m) it6.next();
            kotlin.jvm.internal.o.g(area2, "area");
            ((java.util.ArrayList) this.T).add(area2);
        }
        setLayoutParams(builder.f319584e);
        setContentView(getContainer());
        int i17 = builder.f319586g;
        if (i17 >= 0 && java.lang.Math.abs(i17) <= 2) {
            this.edgeAttached = i17;
        }
        setPeekHeight(this.R);
        setExpandHeight(this.S);
    }

    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout
    public void b() {
        yz5.l lVar = this.f319536x;
        if (lVar != null) {
            lVar.invoke(this);
        }
        l(new lm4.t(this));
    }

    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout
    public void c() {
        k((int) this.R, (int) this.S);
        yz5.l lVar = this.f319540z;
        if (lVar != null) {
            lVar.invoke(this);
        }
        l(new lm4.u(this));
    }

    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout
    public void d() {
        yz5.l lVar = this.f319535w;
        if (lVar != null) {
            lVar.invoke(this);
        }
        l(new lm4.v(this));
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(child, "child");
        if (!this.f319533p1) {
            return super.drawChild(canvas, child, j17);
        }
        int save = canvas.save();
        canvas.rotate(180.0f, this.f319539y0 / 2.0f, this.f319531l1 / 2.0f);
        float f17 = this.f319539y0;
        float f18 = this.f319537x0;
        android.graphics.Paint paint = this.W;
        kotlin.jvm.internal.o.d(paint);
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        canvas.restoreToCount(save);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, child, j17);
        int save2 = canvas.save();
        canvas.rotate(180.0f, this.f319539y0 / 2.0f, this.f319531l1 / 2.0f);
        float f19 = this.f319539y0;
        float f27 = this.f319537x0;
        android.graphics.Paint paint2 = this.V;
        kotlin.jvm.internal.o.d(paint2);
        canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout
    public void e() {
        k((int) this.S, (int) this.R);
        yz5.l lVar = this.f319538y;
        if (lVar != null) {
            lVar.invoke(this);
        }
        l(new lm4.w(this));
    }

    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout
    public boolean f(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return this.K || (((java.lang.Boolean) this.f319534v.invoke()).booleanValue() && f18 > 0.0f && ((java.lang.Boolean) this.E.v(this, motionEvent, e27, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18))).booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(boolean r5, float r6) {
        /*
            r4 = this;
            yz5.a r0 = r4.f319534v
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L5a
            boolean r3 = r4.isDrawerOpen
            if (r3 == 0) goto L18
            boolean r3 = r4.K
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
            yz5.q r0 = r4.D
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
            float r5 = r4.R
            int r5 = (int) r5
            float r6 = r4.S
            int r6 = (int) r6
            r4.k(r5, r6)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lm4.b0.g(boolean, float):boolean");
    }

    public final mm4.g getBackgroundComponent() {
        return this.P;
    }

    public final mm4.g getCenterComponent() {
        return this.M;
    }

    public final android.widget.FrameLayout getCenterContainer() {
        android.widget.FrameLayout frameLayout = this.H;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("centerContainer");
        throw null;
    }

    public final android.view.View getContainer() {
        android.view.View view = this.F;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("container");
        throw null;
    }

    public final yz5.a getContentReachTop() {
        return this.f319534v;
    }

    public final boolean getEnableFading() {
        return this.f319533p1;
    }

    public final mm4.g getFooterComponent() {
        return this.N;
    }

    public final mm4.g getHeaderComponent() {
        return this.L;
    }

    public final android.widget.FrameLayout getHeaderContainer() {
        android.widget.FrameLayout frameLayout = this.G;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("headerContainer");
        throw null;
    }

    public final yz5.l getOnDrawerClose() {
        return this.f319536x;
    }

    public final yz5.l getOnDrawerDetach() {
        return this.A;
    }

    public final yz5.l getOnDrawerExpand() {
        return this.f319540z;
    }

    public final yz5.l getOnDrawerOpen() {
        return this.f319535w;
    }

    public final yz5.l getOnDrawerPeek() {
        return this.f319538y;
    }

    public final yz5.s getOnInterceptFling() {
        return this.E;
    }

    public final yz5.q getOnInterceptScroll() {
        return this.D;
    }

    public final yz5.p getOnInterceptTouch() {
        return this.C;
    }

    public final yz5.p getOnTranslationChange() {
        return this.B;
    }

    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout
    public boolean h(android.view.MotionEvent e17) {
        android.view.View a17;
        kotlin.jvm.internal.o.g(e17, "e");
        int action = e17.getAction();
        if (action == 0) {
            this.K = false;
            java.util.Iterator it = ((java.util.ArrayList) this.T).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ((lm4.o) ((lm4.m) it.next())).getClass();
                android.graphics.Rect rect = new android.graphics.Rect();
                mm4.g headerComponent = getHeaderComponent();
                if (headerComponent != null && (a17 = headerComponent.a()) != null) {
                    a17.getGlobalVisibleRect(rect);
                }
                if (rect.contains((int) e17.getX(), (int) e17.getY())) {
                    this.K = true;
                    break;
                }
            }
        } else if (action == 1 || action == 3) {
            this.K = false;
        }
        boolean z17 = this.isDrawerOpen && ((java.lang.Boolean) this.C.invoke(this, e17)).booleanValue();
        if (!z17) {
            this.K = false;
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout
    public void i(float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        yz5.p pVar = this.B;
        if (pVar != null) {
            pVar.invoke(this, java.lang.Float.valueOf(f17));
        }
        l(new lm4.a0(this, f17, source));
    }

    public final void k(int i17, int i18) {
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

    public final void l(yz5.l lVar) {
        mm4.g gVar = this.L;
        if (gVar != null) {
            lVar.invoke(gVar);
        }
        mm4.g gVar2 = this.M;
        if (gVar2 != null) {
            lVar.invoke(gVar2);
        }
        mm4.g gVar3 = this.N;
        if (gVar3 != null) {
            lVar.invoke(gVar3);
        }
        mm4.g gVar4 = this.P;
        if (gVar4 != null) {
            lVar.invoke(gVar4);
        }
        java.util.Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            lVar.invoke((mm4.f) it.next());
        }
    }

    public final void m(android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yz5.l lVar = this.A;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        super.onSingleTapUp(e17);
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.V = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.V;
        kotlin.jvm.internal.o.d(paint2);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        int[] iArr = {com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.aaw), 0};
        android.graphics.Paint paint3 = this.V;
        kotlin.jvm.internal.o.d(paint3);
        paint3.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f319537x0, iArr, this.f319532p0, android.graphics.Shader.TileMode.CLAMP));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.W = paint4;
        paint4.setColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.aaw));
        this.f319539y0 = getWidth();
        this.f319531l1 = getHeight();
    }

    public final void setBackgroundComponent(mm4.g component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.P = component;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.f319530J;
            if (frameLayout != null) {
                m(frameLayout, a17);
            } else {
                kotlin.jvm.internal.o.o("backgroundContainer");
                throw null;
            }
        }
    }

    public final void setCenterComponent(mm4.g component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.M = component;
        android.view.View a17 = component.a();
        if (a17 != null) {
            m(getCenterContainer(), a17);
        }
    }

    public final void setCenterContainer(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.H = frameLayout;
    }

    public final void setContainer(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.F = view;
    }

    public final void setContentReachTop(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.f319534v = aVar;
    }

    public final void setEnableFading(boolean z17) {
        this.f319533p1 = z17;
    }

    @Override // com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout
    public void setExpandHeight(float f17) {
        super.setExpandHeight(f17);
        if (this.S == f17) {
            return;
        }
        this.S = f17;
        android.view.View container = getContainer();
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = container instanceof com.tencent.mm.ui.widget.RoundedCornerFrameLayout ? (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) container : null;
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.getLayoutParams().height = (int) this.S;
            roundedCornerFrameLayout.requestLayout();
        }
    }

    public final void setFooterComponent(mm4.g component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.N = component;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.I;
            if (frameLayout != null) {
                m(frameLayout, a17);
            } else {
                kotlin.jvm.internal.o.o("footerContainer");
                throw null;
            }
        }
    }

    public final void setHeaderComponent(mm4.g component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.L = component;
        android.view.View a17 = component.a();
        if (a17 != null) {
            m(getHeaderContainer(), a17);
        }
    }

    public final void setHeaderContainer(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.G = frameLayout;
    }

    public final void setOnDrawerClose(yz5.l lVar) {
        this.f319536x = lVar;
    }

    public final void setOnDrawerDetach(yz5.l lVar) {
        this.A = lVar;
    }

    public final void setOnDrawerExpand(yz5.l lVar) {
        this.f319540z = lVar;
    }

    public final void setOnDrawerOpen(yz5.l lVar) {
        this.f319535w = lVar;
    }

    public final void setOnDrawerPeek(yz5.l lVar) {
        this.f319538y = lVar;
    }

    public final void setOnInterceptFling(yz5.s sVar) {
        kotlin.jvm.internal.o.g(sVar, "<set-?>");
        this.E = sVar;
    }

    public final void setOnInterceptScroll(yz5.q qVar) {
        kotlin.jvm.internal.o.g(qVar, "<set-?>");
        this.D = qVar;
    }

    public final void setOnInterceptTouch(yz5.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<set-?>");
        this.C = pVar;
    }

    public final void setOnTranslationChange(yz5.p pVar) {
        this.B = pVar;
    }
}
