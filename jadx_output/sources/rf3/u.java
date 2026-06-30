package rf3;

/* loaded from: classes12.dex */
public class u extends mf3.e implements rf3.q, mg3.d, sf3.l, ml5.g, rf3.v {

    /* renamed from: o, reason: collision with root package name */
    public final mf3.p f395002o;

    /* renamed from: p, reason: collision with root package name */
    public em.l1 f395003p;

    /* renamed from: q, reason: collision with root package name */
    public em.k1 f395004q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f395005r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f395006s;

    /* renamed from: t, reason: collision with root package name */
    public sf3.d f395007t;

    /* renamed from: u, reason: collision with root package name */
    public lf3.k f395008u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f395009v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.ImagePreviewLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f395002o = apiCenter;
        this.f395005r = jz5.h.b(new rf3.r(this));
        this.f395006s = jz5.h.b(new rf3.t(this));
    }

    public static /* synthetic */ void X(rf3.u uVar, java.lang.String str, sf3.g gVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoadFailed");
        }
        if ((i17 & 2) != 0) {
            gVar = null;
        }
        uVar.W(str, gVar);
    }

    @Override // mg3.d
    public void B(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        mf3.o oVar = (mf3.o) g(mf3.o.class);
        if (oVar != null) {
            oVar.j();
        }
    }

    @Override // mf3.e, mf3.l
    public void F() {
        mf3.k kVar;
        java.lang.String g17;
        this.f326111n = true;
        R();
        cg3.a aVar = (cg3.a) H(cg3.a.class);
        if (aVar != null) {
            aVar.u3(new rf3.s(this));
        }
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (g17 = kVar.g()) == null) {
            return;
        }
        Y(g17);
    }

    @Override // mf3.e, mf3.n
    public mf3.p G() {
        return this.f395002o;
    }

    @Override // mf3.e, kg3.d
    public void H2() {
        Q("onVerticalUIApply", new java.lang.Object[0]);
        Z(true);
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f395003p = new em.l1(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejh, (android.view.ViewGroup) null));
        android.view.View view = S().f254536a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    public final em.l1 S() {
        em.l1 l1Var = this.f395003p;
        if (l1Var != null) {
            return l1Var;
        }
        kotlin.jvm.internal.o.o("rootVB");
        throw null;
    }

    public final void T() {
        em.k1 k1Var = this.f395004q;
        android.view.View view = k1Var != null ? k1Var.f254498a : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "hideFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "hideFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        S().a().setVisibility(0);
    }

    public final void U(sf3.g param) {
        kotlin.jvm.internal.o.g(param, "param");
        em.l1 S = S();
        if (S.f254543h == null) {
            S.f254543h = (android.widget.ProgressBar) S.f254536a.findViewById(com.tencent.mm.R.id.h9c);
        }
        S.f254543h.setVisibility(8);
        T();
        ((com.tencent.mm.plugin.media.image.SwitchableImageContainer) ((jz5.n) this.f395006s).getValue()).e(param);
        lf3.k a17 = lf3.l.f318326a.a(param.c());
        this.f395008u = a17;
        if (a17 != null) {
            Q("parserImageInfo: " + this.f395008u, new java.lang.Object[0]);
        }
        R();
    }

    public final void V(sf3.g param) {
        kotlin.jvm.internal.o.g(param, "param");
        em.l1 S = S();
        if (S.f254543h == null) {
            S.f254543h = (android.widget.ProgressBar) S.f254536a.findViewById(com.tencent.mm.R.id.h9c);
        }
        S.f254543h.setVisibility(0);
        T();
    }

    public final void W(java.lang.String failMsg, sf3.g gVar) {
        android.widget.TextView b17;
        android.widget.ImageView a17;
        android.widget.ImageView a18;
        android.widget.TextView b18;
        android.view.View view;
        android.widget.ImageView a19;
        kotlin.jvm.internal.o.g(failMsg, "failMsg");
        em.l1 S = S();
        if (S.f254543h == null) {
            S.f254543h = (android.widget.ProgressBar) S.f254536a.findViewById(com.tencent.mm.R.id.h9c);
        }
        S.f254543h.setVisibility(8);
        em.k1 k1Var = this.f395004q;
        android.view.View view2 = k1Var != null ? k1Var.f254498a : null;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "showFailedView", "(Ljava/lang/String;Lcom/tencent/mm/plugin/media/image/api/ImageLoadParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "showFailedView", "(Ljava/lang/String;Lcom/tencent/mm/plugin/media/image/api/ImageLoadParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.k1 k1Var2 = this.f395004q;
        if (k1Var2 != null && (a19 = k1Var2.a()) != null) {
            a19.requestLayout();
        }
        em.k1 k1Var3 = this.f395004q;
        android.widget.TextView b19 = k1Var3 != null ? k1Var3.b() : null;
        if (b19 != null) {
            b19.setText(failMsg);
        }
        java.lang.String c17 = gVar != null ? gVar.a(sf3.m.f407406h).c() : null;
        if ((c17 == null || c17.length() == 0) || !com.tencent.mm.vfs.w6.j(c17)) {
            S().a().setVisibility(8);
            em.k1 k1Var4 = this.f395004q;
            if (k1Var4 != null && (b17 = k1Var4.b()) != null) {
                int currentTextColor = b17.getCurrentTextColor();
                em.k1 k1Var5 = this.f395004q;
                if (k1Var5 != null && (a17 = k1Var5.a()) != null) {
                    a17.setColorFilter(currentTextColor, android.graphics.PorterDuff.Mode.SRC_IN);
                }
            }
        } else {
            S().a().setVisibility(0);
            com.tencent.mm.plugin.media.image.SwitchableImageContainer switchableImageContainer = (com.tencent.mm.plugin.media.image.SwitchableImageContainer) ((jz5.n) this.f395006s).getValue();
            gVar.getClass();
            switchableImageContainer.e(gVar.a(sf3.m.f407406h));
            em.k1 k1Var6 = this.f395004q;
            if (k1Var6 != null && (view = k1Var6.f254498a) != null) {
                view.setBackgroundColor(b3.l.getColor(K(), com.tencent.mm.R.color.BW_0_Alpha_0_1_5));
            }
            em.k1 k1Var7 = this.f395004q;
            if (k1Var7 != null && (b18 = k1Var7.b()) != null) {
                b18.setTextColor(b3.l.getColor(K(), com.tencent.mm.R.color.aaz));
            }
            em.k1 k1Var8 = this.f395004q;
            if (k1Var8 != null && (a18 = k1Var8.a()) != null) {
                a18.setColorFilter(b3.l.getColor(K(), com.tencent.mm.R.color.aaz), android.graphics.PorterDuff.Mode.SRC_IN);
            }
        }
        rf3.h hVar = (rf3.h) g(rf3.h.class);
        if (hVar != null) {
            hVar.b();
        }
    }

    public final void Y(java.lang.String path) {
        cg3.a aVar;
        kotlin.jvm.internal.o.g(path, "path");
        if (this.f326111n && (aVar = (cg3.a) H(cg3.a.class)) != null) {
            aVar.o4(path);
        }
    }

    public final void Z(boolean z17) {
        float height;
        mg3.l lVar;
        com.tencent.mm.ui.base.MultiTouchImageView b17 = S().b();
        kotlin.jvm.internal.o.f(b17, "getNormalImage(...)");
        com.tencent.mm.ui.base.MultiTouchImageView b18 = S().b();
        kotlin.jvm.internal.o.f(b18, "getNormalImage(...)");
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer = (com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) ((jz5.n) this.f395005r).getValue();
        kotlin.jvm.internal.o.f(previewGestureContainer, "<get-gestureContainer>(...)");
        em.l1 S = S();
        if (S.f254541f == null) {
            S.f254541f = (com.tencent.mm.plugin.media.live.LiveSwitchableContainer) S.f254536a.findViewById(com.tencent.mm.R.id.ubo);
        }
        com.tencent.mm.plugin.media.live.LiveSwitchableContainer liveSwitchableContainer = S.f254541f;
        kotlin.jvm.internal.o.f(liveSwitchableContainer, "getLiveSwitchableContainer(...)");
        com.tencent.mm.plugin.media.image.SwitchableImageContainer d17 = S().d();
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = d17.f148562d;
        if (multiTouchImageView != null) {
            multiTouchImageView.i();
        }
        com.tencent.mm.ui.base.WxImageView wxImageView = d17.sampleImageView;
        if (wxImageView != null) {
            wxImageView.i();
        }
        lf3.k kVar = this.f395008u;
        int imageWidth = kVar != null ? kVar.f318322a : b18.getImageWidth();
        lf3.k kVar2 = this.f395008u;
        int imageHeight = kVar2 != null ? kVar2.f318323b : b18.getImageHeight();
        java.lang.Boolean valueOf = (java.lang.Float.isNaN(b17.f197654q) || java.lang.Float.isInfinite(b17.f197654q)) ? null : java.lang.Boolean.valueOf(b17.G);
        boolean booleanValue = valueOf == null ? false : valueOf.booleanValue();
        float f17 = 1.0f;
        if (imageWidth <= 0 || imageHeight <= 0) {
            previewGestureContainer.setLongVertical(booleanValue);
            previewGestureContainer.O(liveSwitchableContainer, 1.0f, 1.0f, false);
            Q("resetGesture default, isLongVerticalImage=" + booleanValue, new java.lang.Object[0]);
            return;
        }
        float f18 = imageHeight / imageWidth;
        float f19 = (com.tencent.mm.ui.bh.a(K()).f197136b <= 0 || com.tencent.mm.ui.bh.a(K()).f197135a <= 0 || ((float) com.tencent.mm.ui.bh.a(K()).f197136b) / ((float) com.tencent.mm.ui.bh.a(K()).f197135a) >= 1.5f) ? 2.2f : 2.5f;
        boolean z18 = f18 > f19 || booleanValue;
        Q("resetGesture2 removeListener containerWH: " + liveSwitchableContainer.getWidth() + '-' + liveSwitchableContainer.getHeight() + ", contentWH: " + imageWidth + '-' + imageHeight + ", isScreenVertical: " + z17 + " imageRatio:" + f18 + " longRatio:" + f19 + " finalLongVertical: " + z18, new java.lang.Object[0]);
        if (z17 || z18) {
            height = liveSwitchableContainer.getHeight() / (liveSwitchableContainer.getWidth() * f18);
        } else {
            f17 = liveSwitchableContainer.getWidth() / (liveSwitchableContainer.getHeight() / f18);
            height = 1.0f;
        }
        S().c().invalidate();
        previewGestureContainer.setLongVertical(z18);
        yz5.l lVar2 = this.f395009v;
        if (lVar2 != null && (lVar = (mg3.l) lVar2.invoke(this.f395008u)) != null) {
            previewGestureContainer.setScaleConfig(lVar);
        }
        previewGestureContainer.O(liveSwitchableContainer, f17, height, true);
    }

    public void a0() {
        mf3.k kVar;
        cg3.b bVar;
        com.tencent.mm.ui.base.MultiTouchImageView b17 = S().b();
        kotlin.jvm.internal.o.f(b17, "getNormalImage(...)");
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (bVar = (cg3.b) H(cg3.b.class)) == null) {
            return;
        }
        android.graphics.Bitmap b18 = ug5.x.b(b17);
        cg3.g gVar = (cg3.g) bVar;
        cg3.a aVar = (cg3.a) gVar.U6(cg3.a.class);
        if (aVar != null) {
            aVar.u0(kVar, b18, gVar);
        }
    }

    @Override // sf3.l
    public void f(sf3.k state, sf3.g param, mf3.w level) {
        mf3.k kVar;
        mf3.k kVar2;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(level, "level");
        mf3.s sVar = this.f326110m;
        java.lang.String str = null;
        java.lang.String id6 = (sVar == null || (kVar2 = sVar.f326117a) == null) ? null : kVar2.getId();
        java.lang.String str2 = param.f407388b;
        if (!kotlin.jvm.internal.o.b(str2, id6)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged apply abort. callback id: ");
            sb6.append(str2);
            sb6.append(", bind id: ");
            mf3.s sVar2 = this.f326110m;
            if (sVar2 != null && (kVar = sVar2.f326117a) != null) {
                str = kVar.getId();
            }
            sb6.append(str);
            P(sb6.toString(), new java.lang.Object[0]);
            return;
        }
        Q("onImageStateChanged: id:" + str2 + " path:" + param.c() + ", state: " + state.name(), new java.lang.Object[0]);
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            V(param);
            return;
        }
        if (ordinal == 2) {
            V(param);
            return;
        }
        if (ordinal == 3) {
            U(param);
            Q("onImageParserSuccess, start preScan: " + param.c(), new java.lang.Object[0]);
            Y(param.c());
            return;
        }
        if (ordinal == 4) {
            java.lang.String string = K().getString(com.tencent.mm.R.string.p_u);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            W(string, param);
        } else {
            if (ordinal == 5) {
                U(param);
                return;
            }
            java.lang.String string2 = K().getString(com.tencent.mm.R.string.fjg);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            X(this, string2, null, 2, null);
        }
    }

    @Override // mf3.e, kg3.d
    public void h4() {
        Q("onHorizontalUIApply", new java.lang.Object[0]);
        Z(false);
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f326111n = false;
        R();
    }

    @Override // mg3.d
    public void k(android.view.MotionEvent e17) {
        mf3.s sVar;
        mf3.k kVar;
        dg3.m mVar;
        android.view.View view;
        kotlin.jvm.internal.o.g(e17, "e");
        em.k1 k1Var = this.f395004q;
        boolean z17 = false;
        if (k1Var != null && (view = k1Var.f254498a) != null && view.getVisibility() == 0) {
            z17 = true;
        }
        if (z17 || (sVar = this.f326110m) == null || (kVar = sVar.f326117a) == null || (mVar = (dg3.m) H(dg3.m.class)) == null) {
            return;
        }
        mVar.y6(kVar, this.f395002o);
    }

    @Override // mf3.l
    public mg3.b l() {
        return S().a();
    }

    @Override // ml5.g
    public void onScroll(float f17, float f18) {
        S().c().A(f17, f18);
    }

    @Override // mf3.e, rf3.v
    public void r(int i17, int i18) {
        Q("onImageParserSuccess, width: " + i17 + " height: " + i18, new java.lang.Object[0]);
        R();
    }

    @Override // mf3.e, mf3.l
    public void recycle() {
        super.recycle();
        sf3.d dVar = this.f395007t;
        if (dVar != null) {
            dVar.recycle();
        }
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        mf3.k kVar;
        sf3.f fVar;
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.f395008u = null;
        this.f326109i = bindContext.f326118b;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (fVar = (sf3.f) H(sf3.f.class)) == null) {
            return;
        }
        fVar.W4(kVar, this);
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        if (this.f395004q == null) {
            em.l1 S = S();
            if (S.f254539d == null) {
                S.f254539d = (android.view.ViewStub) S.f254536a.findViewById(com.tencent.mm.R.id.h9d);
            }
            this.f395004q = new em.k1(((android.view.ViewStub) S.f254539d.findViewById(com.tencent.mm.R.id.h9d)).inflate());
        }
        sf3.e eVar = (sf3.e) H(sf3.e.class);
        this.f395007t = eVar != null ? eVar.create() : null;
        em.k1 k1Var = this.f395004q;
        android.view.View view = k1Var != null ? k1Var.f254498a : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "attach", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "attach", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.media.image.SwitchableImageContainer d17 = S().d();
        d17.setInnerLoader(this.f395007t);
        d17.setSampleImageView(S().c());
        com.tencent.mm.ui.base.WxImageView sampleImageView = d17.getSampleImageView();
        if (sampleImageView != null) {
            sampleImageView.setDoubleTabZoomToNormal(true);
        }
        d17.d();
        d17.setListener(this);
        em.l1 S2 = S();
        if (S2.f254541f == null) {
            S2.f254541f = (com.tencent.mm.plugin.media.live.LiveSwitchableContainer) S2.f254536a.findViewById(com.tencent.mm.R.id.ubo);
        }
        S2.f254541f.setDelegate(S().d());
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer a17 = S().a();
        a17.setEnableTouch(false);
        a17.setHasBorder(false);
        a17.setEnableOverScroll(false);
        a17.setBackgroundColor(b3.l.getColor(a17.getContext(), android.R.color.transparent));
        a17.setGestureListener(this);
        a17.setCropLayoutTouchListener(this);
    }

    @Override // ml5.g
    public void y(float f17, float f18, float f19) {
        S().c().z(f17, f18, f19);
    }

    @Override // rf3.v
    public void z(sf3.g param) {
        kotlin.jvm.internal.o.g(param, "param");
        java.lang.String string = K().getString(com.tencent.mm.R.string.fjg);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        X(this, string, null, 2, null);
    }
}
