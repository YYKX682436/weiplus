package fg3;

/* loaded from: classes12.dex */
public class v extends mf3.e implements fg3.p, mg3.d, sf3.l, gg3.f, ig3.d {

    /* renamed from: o, reason: collision with root package name */
    public final mf3.p f262455o;

    /* renamed from: p, reason: collision with root package name */
    public em.r1 f262456p;

    /* renamed from: q, reason: collision with root package name */
    public ig3.a f262457q;

    /* renamed from: r, reason: collision with root package name */
    public gg3.b f262458r;

    /* renamed from: s, reason: collision with root package name */
    public sf3.f f262459s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.r2 f262460t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f262461u;

    /* renamed from: v, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f262462v;

    /* renamed from: w, reason: collision with root package name */
    public gg3.c f262463w;

    /* renamed from: x, reason: collision with root package name */
    public float f262464x;

    /* renamed from: y, reason: collision with root package name */
    public float f262465y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.VideoPreviewLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f262455o = apiCenter;
        this.f262462v = kotlinx.coroutines.z0.b();
        this.f262464x = -1.0f;
        this.f262465y = -1.0f;
    }

    public static void T(fg3.v vVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyErrorUI");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        vVar.Q("applyErrorUI", new java.lang.Object[0]);
        vVar.V().c().setVisibility(0);
        android.widget.TextView d17 = vVar.V().d();
        if (str == null) {
            str = vVar.K().getString(com.tencent.mm.R.string.pjg);
        }
        d17.setText(str);
        vVar.V().b().setVisibility(8);
        if (vVar.V().e().getDrawable() != null) {
            vVar.V().a().setVisibility(0);
            vVar.V().e().setVisibility(0);
            vVar.V().c().setBackgroundColor(b3.l.getColor(vVar.K(), com.tencent.mm.R.color.BW_0_Alpha_0_1_5));
            vVar.V().d().setTextColor(b3.l.getColor(vVar.K(), com.tencent.mm.R.color.aaz));
            em.r1 V = vVar.V();
            if (V.f254751d == null) {
                V.f254751d = (android.widget.ImageView) V.f254748a.findViewById(com.tencent.mm.R.id.oyx);
            }
            V.f254751d.setColorFilter(b3.l.getColor(vVar.K(), com.tencent.mm.R.color.aaz), android.graphics.PorterDuff.Mode.SRC_IN);
        } else {
            vVar.V().e().setVisibility(8);
            vVar.V().a().setVisibility(8);
            int currentTextColor = vVar.V().d().getCurrentTextColor();
            em.r1 V2 = vVar.V();
            if (V2.f254751d == null) {
                V2.f254751d = (android.widget.ImageView) V2.f254748a.findViewById(com.tencent.mm.R.id.oyx);
            }
            V2.f254751d.setColorFilter(currentTextColor, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        fg3.h hVar = (fg3.h) vVar.G().a(fg3.h.class);
        if (hVar != null) {
            hVar.reset();
        }
        fg3.h hVar2 = (fg3.h) vVar.G().a(fg3.h.class);
        if (hVar2 != null) {
            hVar2.s(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(boolean z17) {
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer a17 = V().a();
        kotlin.jvm.internal.o.f(a17, "getPreviewGestureContainer(...)");
        em.r1 V = V();
        if (V.f254749b == null) {
            V.f254749b = (android.widget.RelativeLayout) V.f254748a.findViewById(com.tencent.mm.R.id.jdk);
        }
        android.widget.RelativeLayout relativeLayout = V.f254749b;
        if (!(relativeLayout instanceof android.view.View)) {
            relativeLayout = null;
        }
        if (relativeLayout == null) {
            return;
        }
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = ((ig3.i) U()).f291429b;
        if (!(thumbPlayerViewContainer instanceof android.view.View)) {
            thumbPlayerViewContainer = null;
        }
        int height = thumbPlayerViewContainer != null ? thumbPlayerViewContainer.getHeight() : 0;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer2 = ((ig3.i) U()).f291429b;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer3 = thumbPlayerViewContainer2 instanceof android.view.View ? thumbPlayerViewContainer2 : null;
        int width = thumbPlayerViewContainer3 != null ? thumbPlayerViewContainer3.getWidth() : 0;
        if (height <= 1) {
            Q("resetGesture default, video height: " + height, new java.lang.Object[0]);
            a17.O(relativeLayout, 1.0f, 1.0f, true);
            if (!this.f326111n || z17) {
                return;
            }
            ig3.a U = U();
            fg3.t tVar = new fg3.t(relativeLayout, this);
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer4 = ((ig3.i) U).f291429b;
            kotlin.jvm.internal.o.g(thumbPlayerViewContainer4, "<this>");
            thumbPlayerViewContainer4.getViewTreeObserver().addOnGlobalLayoutListener(new ig3.j(thumbPlayerViewContainer4, tVar));
            return;
        }
        if (height <= 0 || width <= 0) {
            Q("resetGesture return, content w-h invalid", new java.lang.Object[0]);
            return;
        }
        Q("resetGesture containerWH: " + relativeLayout.getWidth() + '-' + relativeLayout.getHeight() + ", contentWH: " + width + '-' + height, new java.lang.Object[0]);
        float width2 = ((float) relativeLayout.getWidth()) / ((float) width);
        float height2 = ((float) relativeLayout.getHeight()) / ((float) height);
        if (width2 == this.f262464x) {
            if (height2 == this.f262465y) {
                return;
            }
        }
        this.f262464x = width2;
        this.f262465y = height2;
        a17.O(relativeLayout, width2, height2, true);
    }

    public static /* synthetic */ void Z(fg3.v vVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetGesture");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        vVar.Y(z17);
    }

    private final void a0() {
        Q("resetUI", new java.lang.Object[0]);
        V().c().setVisibility(8);
        V().b().setVisibility(8);
        V().b().setProgress(0);
        V().e().setVisibility(0);
        fg3.h hVar = (fg3.h) G().a(fg3.h.class);
        if (hVar != null) {
            hVar.reset();
        }
    }

    @Override // mg3.d
    public void B(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        if (V().c().getVisibility() == 0) {
            return;
        }
        fg3.h hVar = (fg3.h) g(fg3.h.class);
        if (hVar != null) {
            hVar.c();
        }
        fg3.a aVar = (fg3.a) g(fg3.a.class);
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // ig3.d
    public void C(android.view.View view, int i17, int i18) {
        kotlin.jvm.internal.o.g(view, "view");
        Z(this, false, 1, null);
    }

    @Override // gg3.f
    public void E(gg3.c param, gg3.d state, gg3.e extraInfo) {
        mf3.k kVar;
        mf3.k kVar2;
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        mf3.s sVar = this.f326110m;
        java.lang.String str = null;
        java.lang.String id6 = (sVar == null || (kVar2 = sVar.f326117a) == null) ? null : kVar2.getId();
        java.lang.String str2 = param.f271726a;
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
        P("onVideoStateChanged apply: " + state.name(), new java.lang.Object[0]);
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onVideoDownloading, progress:");
            float f17 = extraInfo.f271738c;
            sb7.append(f17);
            Q(sb7.toString(), new java.lang.Object[0]);
            V().f().setVisibility(8);
            V().b().setVisibility(0);
            V().b().setProgress((int) (f17 * 100));
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            T(this, null, 1, null);
            fg3.a aVar = (fg3.a) g(fg3.a.class);
            if (aVar != null) {
                aVar.b();
                return;
            }
            return;
        }
        a0();
        Q("onVideoLoadSuccess", new java.lang.Object[0]);
        this.f262463w = param;
        mf3.s sVar3 = this.f326110m;
        if (sVar3 != null && sVar3.f326119c) {
            ((ig3.i) U()).e(param);
            ((ig3.i) U()).g();
            mf3.s sVar4 = this.f326110m;
            if (sVar4 == null) {
                return;
            }
            sVar4.f326119c = false;
        }
    }

    @Override // mf3.e, mf3.l
    public void F() {
        mf3.k kVar;
        this.f326111n = true;
        ((ig3.i) U()).f291429b.setScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null) {
            return;
        }
        gg3.b bVar = this.f262458r;
        if (bVar != null) {
            bVar.a5(kVar, this);
        }
        Z(this, false, 1, null);
    }

    @Override // mf3.e, mf3.n
    public mf3.p G() {
        return this.f262455o;
    }

    @Override // mf3.e, kg3.d
    public void H2() {
        Q("onVerticalUIApply", new java.lang.Object[0]);
        this.f262464x = -1.0f;
        this.f262465y = -1.0f;
        Z(this, false, 1, null);
    }

    @Override // ig3.d
    public void I(ig3.c state) {
        kotlin.jvm.internal.o.g(state, "state");
        P("change video ui, onStateChanged: " + state.name(), new java.lang.Object[0]);
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            Q("applyPlayingUI", new java.lang.Object[0]);
            V().c().setVisibility(8);
            V().b().setVisibility(8);
            V().f().setVisibility(0);
            fg3.h hVar = (fg3.h) G().a(fg3.h.class);
            if (hVar != null) {
                hVar.e(true);
            }
            android.content.Context context = M().getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                Q("keep screen on", new java.lang.Object[0]);
                activity.getWindow().addFlags(128);
            }
            kotlinx.coroutines.r2 r2Var = this.f262460t;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f262460t = kotlinx.coroutines.l.d(this.f262462v, null, null, new fg3.u(this, null), 3, null);
            return;
        }
        if (ordinal == 2) {
            Q("applyRenderUI", new java.lang.Object[0]);
            V().e().setVisibility(8);
            V().f().setVisibility(0);
            return;
        }
        if (ordinal != 3) {
            if (ordinal == 5) {
                Q("applyStopUI", new java.lang.Object[0]);
                a0();
                return;
            } else {
                if (ordinal != 6) {
                    return;
                }
                T(this, null, 1, null);
                return;
            }
        }
        Q("applyPauseUI", new java.lang.Object[0]);
        fg3.h hVar2 = (fg3.h) G().a(fg3.h.class);
        if (hVar2 != null) {
            hVar2.e(false);
        }
        android.content.Context context2 = M().getContext();
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity2 != null) {
            Q("release screen on", new java.lang.Object[0]);
            activity2.getWindow().clearFlags(128);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f262460t;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f262460t = null;
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f262456p = new em.r1(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejq, (android.view.ViewGroup) null));
        android.view.View view = V().f254748a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    public final ig3.a U() {
        ig3.a aVar = this.f262457q;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("controller");
        throw null;
    }

    public final em.r1 V() {
        em.r1 r1Var = this.f262456p;
        if (r1Var != null) {
            return r1Var;
        }
        kotlin.jvm.internal.o.o("rootVB");
        throw null;
    }

    public void W(int i17) {
        Q("onSeekEnd: " + i17, new java.lang.Object[0]);
        ig3.i iVar = (ig3.i) U();
        iVar.f291429b.a((double) i17, true);
        iVar.i(ig3.c.f291417e);
    }

    public void X(int i17) {
        O("onSeeking: " + i17, new java.lang.Object[0]);
        if (((ig3.i) U()).b()) {
            ((ig3.i) U()).f();
        }
        ((ig3.i) U()).f291429b.a(i17, false);
    }

    public void b0() {
        boolean b17 = ((ig3.i) U()).b();
        boolean z17 = !b17;
        Q("toggle " + b17 + " -> " + z17, new java.lang.Object[0]);
        if (b17) {
            ((ig3.i) U()).f();
        } else {
            ((ig3.i) U()).e(this.f262463w);
            ((ig3.i) U()).g();
        }
        fg3.h hVar = (fg3.h) G().a(fg3.h.class);
        if (hVar != null) {
            hVar.e(z17);
        }
    }

    @Override // sf3.l
    public void f(sf3.k state, sf3.g param, mf3.w level) {
        mf3.k kVar;
        mf3.k kVar2;
        mf3.k kVar3;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(level, "level");
        mf3.s sVar = this.f326110m;
        java.lang.String str = null;
        java.lang.String id6 = (sVar == null || (kVar3 = sVar.f326117a) == null) ? null : kVar3.getId();
        java.lang.String str2 = param.f407388b;
        if (!kotlin.jvm.internal.o.b(str2, id6)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageStateChanged apply abort. callback id: ");
            sb6.append(str2);
            sb6.append(", bind id: ");
            mf3.s sVar2 = this.f326110m;
            if (sVar2 != null && (kVar2 = sVar2.f326117a) != null) {
                str = kVar2.getId();
            }
            sb6.append(str);
            P(sb6.toString(), new java.lang.Object[0]);
            return;
        }
        mf3.s sVar3 = this.f326110m;
        if (sVar3 != null && (kVar = sVar3.f326117a) != null) {
            str = kVar.getId();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onImageStateChanged: id:");
        sb7.append(str);
        sb7.append(" path:");
        sb7.append(param.c());
        sb7.append(", state: ");
        sb7.append(state.name());
        sb7.append(" videoState: ");
        sb7.append(((ig3.i) U()).f291429b.isPlaying() ? ig3.c.f291417e : ig3.c.f291416d);
        sb7.append(" videoProgress: ");
        sb7.append(((ig3.i) U()).a());
        Q(sb7.toString(), new java.lang.Object[0]);
        if (fg3.r.f262448a[state.ordinal()] == 1) {
            java.lang.String c17 = param.c();
            android.graphics.Bitmap b17 = com.tencent.mm.sdk.platformtools.j.b(c17, 4194304);
            if (((ig3.i) U()).b() || ((java.lang.Number) ((ig3.i) U()).a().f302833d).intValue() != 0) {
                V().e().setImageBitmap(b17);
                V().e().setVisibility(8);
                Q("set thumb, but hide, because video is playing", new java.lang.Object[0]);
            } else {
                if (b17 == null) {
                    P("set thumb failed, get bitmap null, file: " + c17, new java.lang.Object[0]);
                    return;
                }
                Q("set thumb success, file: " + c17 + ", w: " + b17.getWidth() + ", h: " + b17.getHeight(), new java.lang.Object[0]);
                V().e().setImageBitmap(b17);
                V().e().setVisibility(0);
            }
        }
    }

    @Override // mf3.e, kg3.d
    public void h4() {
        Q("onHorizontalUIApply", new java.lang.Object[0]);
        this.f262464x = -1.0f;
        this.f262465y = -1.0f;
        Z(this, false, 1, null);
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f326111n = false;
        U();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ig3.i) U()).h();
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = ((ig3.i) U()).f291429b;
        kotlin.jvm.internal.o.e(thumbPlayerViewContainer, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
        thumbPlayerViewContainer.setVideoSpeedRatio(1.0f);
        thumbPlayerViewContainer.getF();
        Q("onUnSelected cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
        kotlinx.coroutines.r2 r2Var = this.f262460t;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f262460t = null;
        Z(this, false, 1, null);
    }

    @Override // mg3.d
    public void k(android.view.MotionEvent e17) {
        mf3.s sVar;
        mf3.k kVar;
        dg3.m mVar;
        kotlin.jvm.internal.o.g(e17, "e");
        if (V().c().getVisibility() == 0 || (sVar = this.f326110m) == null || (kVar = sVar.f326117a) == null || (mVar = (dg3.m) H(dg3.m.class)) == null) {
            return;
        }
        mVar.y6(kVar, G());
    }

    @Override // mf3.l
    public mg3.b l() {
        return V().a();
    }

    @Override // mf3.l
    public void onPause() {
        if (((ig3.i) U()).b()) {
            this.f262461u = true;
            ((ig3.i) U()).f();
        }
    }

    @Override // mf3.l
    public void onResume() {
        if (this.f262461u) {
            ((ig3.i) U()).g();
            this.f262461u = false;
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        if (f17 > 0.5f || !((ig3.i) U()).b()) {
            return;
        }
        ((ig3.i) U()).f();
    }

    @Override // mf3.e, mf3.l
    public void recycle() {
        super.recycle();
        Q("recycle", new java.lang.Object[0]);
        ig3.i iVar = (ig3.i) U();
        iVar.h();
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = iVar.f291429b;
        thumbPlayerViewContainer.onDetach();
        thumbPlayerViewContainer.setVideoCallback(null);
        thumbPlayerViewContainer.setOnSeekCompleteCallback(null);
        kotlinx.coroutines.r2 r2Var = this.f262460t;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f262460t = null;
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        mf3.k kVar = bindContext.f326117a;
        if (kVar == null) {
            return;
        }
        V().e().setVisibility(8);
        V().c().setVisibility(8);
        V().b().setProgress(0);
        sf3.f fVar = this.f262459s;
        if (fVar != null) {
            fVar.W4(kVar, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        Q("attach", new java.lang.Object[0]);
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer a17 = V().a();
        a17.setEnableTouch(false);
        a17.setHasBorder(false);
        a17.setEnableOverScroll(false);
        a17.setBackgroundColor(b3.l.getColor(a17.getContext(), android.R.color.transparent));
        a17.setGestureListener(this);
        gg3.a aVar = (gg3.a) H(gg3.a.class);
        if (aVar == null) {
            throw new java.lang.RuntimeException("must register IGalleryVideoFactory");
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 Z5 = aVar.Z5(K());
        ig3.a F6 = aVar.F6(this.f326106f, Z5);
        kotlin.jvm.internal.o.g(F6, "<set-?>");
        this.f262457q = F6;
        ((ig3.i) U()).f291431d = aVar.r1();
        android.view.View view = Z5 instanceof android.view.View ? (android.view.View) Z5 : null;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        V().f().addView(view, layoutParams);
        this.f262458r = (gg3.b) H(gg3.b.class);
        this.f262459s = (sf3.f) H(sf3.f.class);
        ((ig3.i) U()).f291430c = new fg3.q(new java.lang.ref.WeakReference(this));
    }
}
