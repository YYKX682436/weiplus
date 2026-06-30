package uu3;

/* loaded from: classes5.dex */
public class u extends com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout {
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
    public android.widget.FrameLayout f431298J;
    public boolean K;
    public vu3.c L;
    public vu3.c M;
    public vu3.c N;
    public vu3.c P;
    public final java.util.Set Q;
    public float R;
    public float S;
    public final java.util.List T;
    public final uu3.i U;
    public android.graphics.Paint V;
    public android.graphics.Paint W;

    /* renamed from: l1, reason: collision with root package name */
    public int f431299l1;

    /* renamed from: p0, reason: collision with root package name */
    public final float[] f431300p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f431301p1;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f431302v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f431303w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f431304x;

    /* renamed from: x0, reason: collision with root package name */
    public final float f431305x0;

    /* renamed from: y, reason: collision with root package name */
    public yz5.l f431306y;

    /* renamed from: y0, reason: collision with root package name */
    public int f431307y0;

    /* renamed from: z, reason: collision with root package name */
    public yz5.l f431308z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, uu3.f builder) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f431302v = uu3.h.f431284d;
        this.C = uu3.s.f431294d;
        this.D = uu3.r.f431293d;
        this.E = uu3.q.f431292d;
        this.Q = new java.util.HashSet();
        this.R = -1.0f;
        this.T = new java.util.ArrayList();
        this.U = new uu3.i();
        this.f431300p0 = new float[]{0.0f, 1.0f};
        this.f431305x0 = ym5.x.a(getContext(), 60.0f);
        this.R = -1.0f;
        this.S = builder.f431276a;
        setCancelSettleOnDown(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f431298J = frameLayout;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dbq, (android.view.ViewGroup) null);
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
        getHeaderContainer().setContentDescription(i65.a.r(getContext(), com.tencent.mm.R.string.f490356so));
        getHeaderContainer().setOnClickListener(new uu3.j(this));
        getCenterContainer().setOnClickListener(uu3.k.f431286d);
        android.widget.FrameLayout frameLayout2 = this.I;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.o.o("footerContainer");
            throw null;
        }
        frameLayout2.setOnClickListener(uu3.l.f431287d);
        android.view.View container = getContainer();
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = container instanceof com.tencent.mm.ui.widget.RoundedCornerFrameLayout ? (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) container : null;
        if (roundedCornerFrameLayout != null) {
            float dimension = roundedCornerFrameLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
            roundedCornerFrameLayout.b(dimension, dimension, 0.0f, 0.0f);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) this.S);
            layoutParams.gravity = 80;
            roundedCornerFrameLayout.setLayoutParams(layoutParams);
        }
        android.widget.FrameLayout frameLayout3 = this.f431298J;
        if (frameLayout3 == null) {
            kotlin.jvm.internal.o.o("backgroundContainer");
            throw null;
        }
        addView(frameLayout3);
        addView(getContainer());
        vu3.c cVar = builder.f431277b;
        if (cVar != null) {
            setHeaderComponent(cVar);
        }
        vu3.c cVar2 = builder.f431278c;
        if (cVar2 != null) {
            setCenterComponent(cVar2);
        }
        vu3.c cVar3 = builder.f431279d;
        if (cVar3 != null) {
            setBackgroundComponent(cVar3);
        }
        java.util.Iterator it = ((java.util.HashSet) builder.f431280e).iterator();
        while (it.hasNext()) {
            vu3.i callbackComponent = (vu3.i) it.next();
            kotlin.jvm.internal.o.g(callbackComponent, "callbackComponent");
            callbackComponent.f440224a = this;
            ((java.util.HashSet) this.Q).add(callbackComponent);
        }
        uu3.i area = this.U;
        kotlin.jvm.internal.o.g(area, "area");
        ((java.util.ArrayList) this.T).add(area);
        java.util.Iterator it6 = ((java.util.ArrayList) builder.f431282g).iterator();
        while (it6.hasNext()) {
            uu3.g area2 = (uu3.g) it6.next();
            kotlin.jvm.internal.o.g(area2, "area");
            ((java.util.ArrayList) this.T).add(area2);
        }
        setLayoutParams(builder.f431281f);
        setContentView(getContainer());
        int i17 = builder.f431283h;
        if (i17 >= 0 && java.lang.Math.abs(i17) <= 2) {
            this.edgeAttached = i17;
        }
        setPeekHeight(this.R);
        setExpandHeight(this.S);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout
    public void d() {
        yz5.l lVar = this.f431304x;
        if (lVar != null) {
            lVar.invoke(this);
        }
        n(new uu3.m(this));
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(child, "child");
        if (!this.f431301p1) {
            return super.drawChild(canvas, child, j17);
        }
        int save = canvas.save();
        canvas.rotate(180.0f, this.f431307y0 / 2.0f, this.f431299l1 / 2.0f);
        float f17 = this.f431307y0;
        float f18 = this.f431305x0;
        android.graphics.Paint paint = this.W;
        kotlin.jvm.internal.o.d(paint);
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        canvas.restoreToCount(save);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, child, j17);
        int save2 = canvas.save();
        canvas.rotate(180.0f, this.f431307y0 / 2.0f, this.f431299l1 / 2.0f);
        float f19 = this.f431307y0;
        float f27 = this.f431305x0;
        android.graphics.Paint paint2 = this.V;
        kotlin.jvm.internal.o.d(paint2);
        canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout
    public void e() {
        m((int) this.R, (int) this.S);
        yz5.l lVar = this.f431308z;
        if (lVar != null) {
            lVar.invoke(this);
        }
        n(new uu3.n(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout
    public void f() {
        yz5.l lVar = this.f431303w;
        if (lVar != null) {
            lVar.invoke(this);
        }
        n(new uu3.o(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout
    public void g() {
        m((int) this.S, (int) this.R);
        yz5.l lVar = this.f431306y;
        if (lVar != null) {
            lVar.invoke(this);
        }
        n(new uu3.p(this));
    }

    public final vu3.c getBackgroundComponent() {
        return this.P;
    }

    public final vu3.c getCenterComponent() {
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
        return this.f431302v;
    }

    public final boolean getEnableFading() {
        return this.f431301p1;
    }

    public final vu3.c getFooterComponent() {
        return this.N;
    }

    public final vu3.c getHeaderComponent() {
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
        return this.f431304x;
    }

    public final yz5.l getOnDrawerDetach() {
        return this.A;
    }

    public final yz5.l getOnDrawerExpand() {
        return this.f431308z;
    }

    public final yz5.l getOnDrawerOpen() {
        return this.f431303w;
    }

    public final yz5.l getOnDrawerPeek() {
        return this.f431306y;
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

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout
    public boolean h(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return this.K || (((java.lang.Boolean) this.f431302v.invoke()).booleanValue() && f18 > 0.0f && ((java.lang.Boolean) this.E.v(this, motionEvent, e27, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18))).booleanValue());
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout
    public boolean i(boolean z17, float f17) {
        boolean z18;
        boolean booleanValue = ((java.lang.Boolean) this.f431302v.invoke()).booleanValue();
        if (z17) {
            z18 = false;
        } else {
            z18 = this.isDrawerOpen && this.K && booleanValue && (f17 < 0.0f || !b());
            b();
        }
        boolean z19 = z18 && ((java.lang.Boolean) this.D.invoke(this, java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17))).booleanValue();
        if (z19) {
            m((int) this.R, (int) this.S);
        }
        return z19;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout
    public boolean j(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        int action = e17.getAction();
        if (action == 0) {
            this.K = false;
            java.util.Iterator it = this.T.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((uu3.g) it.next()).a(this).contains((int) e17.getX(), (int) e17.getY())) {
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
        e17.getAction();
        e17.getX();
        e17.getY();
        return z17;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout
    public void k(float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        yz5.p pVar = this.B;
        if (pVar != null) {
            pVar.invoke(this, java.lang.Float.valueOf(f17));
        }
        n(new uu3.t(this, f17, source));
    }

    public final void m(int i17, int i18) {
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

    public final void n(yz5.l lVar) {
        vu3.c cVar = this.L;
        if (cVar != null) {
            lVar.invoke(cVar);
        }
        vu3.c cVar2 = this.M;
        if (cVar2 != null) {
            lVar.invoke(cVar2);
        }
        vu3.c cVar3 = this.N;
        if (cVar3 != null) {
            lVar.invoke(cVar3);
        }
        vu3.c cVar4 = this.P;
        if (cVar4 != null) {
            lVar.invoke(cVar4);
        }
        java.util.Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            lVar.invoke((vu3.i) it.next());
        }
    }

    public final void o(android.view.ViewGroup viewGroup, android.view.View view) {
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

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout, android.view.GestureDetector.OnGestureListener
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
        paint3.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f431305x0, iArr, this.f431300p0, android.graphics.Shader.TileMode.CLAMP));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.W = paint4;
        paint4.setColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.aaw));
        this.f431307y0 = getWidth();
        this.f431299l1 = getHeight();
    }

    public final void setBackgroundComponent(vu3.c component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.P = component;
        component.f440224a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.f431298J;
            if (frameLayout != null) {
                o(frameLayout, a17);
            } else {
                kotlin.jvm.internal.o.o("backgroundContainer");
                throw null;
            }
        }
    }

    public final void setCenterComponent(vu3.c component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.M = component;
        component.f440224a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            o(getCenterContainer(), a17);
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
        this.f431302v = aVar;
    }

    public final void setEnableFading(boolean z17) {
        this.f431301p1 = z17;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout
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

    public final void setFooterComponent(vu3.c component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.N = component;
        component.f440224a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.I;
            if (frameLayout != null) {
                o(frameLayout, a17);
            } else {
                kotlin.jvm.internal.o.o("footerContainer");
                throw null;
            }
        }
    }

    public final void setHeaderComponent(vu3.c component) {
        kotlin.jvm.internal.o.g(component, "component");
        this.L = component;
        component.f440224a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            o(getHeaderContainer(), a17);
        }
    }

    public final void setHeaderContainer(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.G = frameLayout;
    }

    public final void setOnDrawerClose(yz5.l lVar) {
        this.f431304x = lVar;
    }

    public final void setOnDrawerDetach(yz5.l lVar) {
        this.A = lVar;
    }

    public final void setOnDrawerExpand(yz5.l lVar) {
        this.f431308z = lVar;
    }

    public final void setOnDrawerOpen(yz5.l lVar) {
        this.f431303w = lVar;
    }

    public final void setOnDrawerPeek(yz5.l lVar) {
        this.f431306y = lVar;
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
