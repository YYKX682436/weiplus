package com.tencent.mm.plugin.vlog.ui;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0012\u001a\u00020\u000b8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lju3/d0;", "Lbp4/z;", "Lso4/b;", "template", "Ljz5/f0;", "setupTemplateVideoPlugins", "", "selectFirst", "setupImageEditPlugins", "Lbp4/k0;", "K", "Lbp4/k0;", "getMultiPreviewPlugin", "()Lbp4/k0;", "setMultiPreviewPlugin", "(Lbp4/k0;)V", "multiPreviewPlugin", "Lru3/o;", "M1", "Lru3/o;", "getCurrentStyle", "()Lru3/o;", "setCurrentStyle", "(Lru3/o;)V", "currentStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class MultiVideoFullScreenPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout implements ju3.d0, bp4.z {
    public static final /* synthetic */ int T1 = 0;
    public final yt3.t A;
    public android.view.View A1;
    public final bp4.o3 B;
    public final android.view.View B1;
    public final ep4.j C;
    public final android.view.View C1;
    public java.lang.String D;
    public final com.tencent.mm.plugin.vlog.ui.widget.PhotoMaskView D1;
    public boolean E;
    public boolean E1;
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider F;
    public final android.view.ViewStub F1;
    public ct0.b G;
    public boolean G1;
    public final com.tencent.mm.plugin.vlog.model.u0 H;
    public boolean H1;
    public boolean I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f175839J;
    public java.lang.String J1;

    /* renamed from: K, reason: from kotlin metadata */
    public bp4.k0 multiPreviewPlugin;
    public java.lang.String K1;
    public final bp4.x L;
    public final java.util.ArrayList L1;
    public bp4.r1 M;

    /* renamed from: M1, reason: from kotlin metadata */
    public ru3.o currentStyle;
    public final bp4.e4 N;
    public final nu3.h N1;
    public boolean O1;
    public final bp4.o4 P;
    public yo4.q P1;
    public final bp4.n Q;
    public final int Q1;
    public final fp4.s R;
    public boolean R1;
    public final dw3.g0 S;
    public long S1;
    public bp4.d1 T;
    public bp4.m1 U;
    public final bp4.o1 V;
    public final bp4.z3 W;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f175840h;

    /* renamed from: i, reason: collision with root package name */
    public it3.y f175841i;

    /* renamed from: l1, reason: collision with root package name */
    public final bp4.f3 f175842l1;

    /* renamed from: m, reason: collision with root package name */
    public long f175843m;

    /* renamed from: n, reason: collision with root package name */
    public int f175844n;

    /* renamed from: o, reason: collision with root package name */
    public int f175845o;

    /* renamed from: p, reason: collision with root package name */
    public int f175846p;

    /* renamed from: p0, reason: collision with root package name */
    public final hp4.a f175847p0;

    /* renamed from: p1, reason: collision with root package name */
    public final bp4.x2 f175848p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f175849q;

    /* renamed from: r, reason: collision with root package name */
    public final gp4.j f175850r;

    /* renamed from: s, reason: collision with root package name */
    public final bp4.k2 f175851s;

    /* renamed from: t, reason: collision with root package name */
    public yt3.i f175852t;

    /* renamed from: u, reason: collision with root package name */
    public yt3.m f175853u;

    /* renamed from: v, reason: collision with root package name */
    public bp4.b4 f175854v;

    /* renamed from: w, reason: collision with root package name */
    public yo4.p f175855w;

    /* renamed from: x, reason: collision with root package name */
    public cp4.r f175856x;

    /* renamed from: x0, reason: collision with root package name */
    public final bp4.z2 f175857x0;

    /* renamed from: x1, reason: collision with root package name */
    public final bp4.p4 f175858x1;

    /* renamed from: y, reason: collision with root package name */
    public bp4.f1 f175859y;

    /* renamed from: y0, reason: collision with root package name */
    public final bp4.h3 f175860y0;

    /* renamed from: y1, reason: collision with root package name */
    public final bp4.p2 f175861y1;

    /* renamed from: z, reason: collision with root package name */
    public final yt3.q f175862z;

    /* renamed from: z1, reason: collision with root package name */
    public final bp4.c2 f175863z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiVideoFullScreenPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f175843m = 60000L;
        this.f175844n = 1080;
        this.f175845o = 1080;
        this.f175846p = 90;
        this.f175849q = "";
        this.D = "";
        this.E = true;
        com.tencent.mm.plugin.vlog.model.u0 u0Var = new com.tencent.mm.plugin.vlog.model.u0();
        this.H = u0Var;
        dw3.g0 g0Var = new dw3.g0();
        this.S = g0Var;
        this.J1 = "";
        this.K1 = "";
        this.L1 = new java.util.ArrayList();
        this.currentStyle = ru3.o.f399764e;
        this.N1 = new nu3.h();
        this.P1 = yo4.q.f464300d;
        this.Q1 = android.graphics.Color.parseColor("#232323");
        yo4.j0 j0Var = new yo4.j0(this);
        android.app.Activity activity = (android.app.Activity) context;
        if (((android.view.ViewGroup) activity.findViewById(com.tencent.mm.R.id.lpx)).getChildCount() == 0) {
            ((android.view.ViewGroup) activity.getWindow().getDecorView().findViewById(android.R.id.content)).setAlpha(0.0f);
        }
        ou3.q qVar = ou3.q.f348970c;
        qVar.a();
        qVar.j();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "init MultiVideoPluginLayout");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c2w, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f175840h = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.jvq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.jvp);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.F1 = (android.view.ViewStub) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.d8b);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.C1 = findViewById3;
        so4.g.f410776a.b(null);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.jup);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.cmy);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        setMultiPreviewPlugin(new bp4.k0((com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout) findViewById4, (com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout) findViewById5, this));
        getMultiPreviewPlugin().f23223v = u0Var;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.oyw);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        gp4.j jVar = new gp4.j((com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer) findViewById6, this);
        this.f175850r = jVar;
        getMultiPreviewPlugin().L(jVar.f274412f);
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f486311kv5);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        bp4.k2 k2Var = new bp4.k2((android.widget.FrameLayout) findViewById7, this);
        this.f175851s = k2Var;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.bet);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        yt3.t tVar = new yt3.t((com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView) findViewById8, this);
        this.A = tVar;
        tVar.f465670f.setEnableClickOutsideConfirm(false);
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.d7v);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        yt3.q qVar2 = new yt3.q((android.widget.ImageView) findViewById9, this);
        this.f175862z = qVar2;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.f485040gc0);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        bp4.x xVar = new bp4.x((androidx.recyclerview.widget.RecyclerView) findViewById10, this);
        this.L = xVar;
        xVar.f23420m = new yo4.r(this);
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.l4s);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        bp4.o3 o3Var = new bp4.o3((android.widget.ImageView) findViewById11, this);
        this.B = o3Var;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.f484183d95);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        ep4.j jVar2 = new ep4.j((android.view.ViewGroup) findViewById12, this);
        this.C = jVar2;
        getMultiPreviewPlugin().L(jVar2);
        bp4.e4 e4Var = new bp4.e4(this, this);
        this.N = e4Var;
        e4Var.f23160h.setSortCallback(j0Var);
        getMultiPreviewPlugin().L(e4Var);
        bp4.n nVar = new bp4.n(this, this);
        this.Q = nVar;
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.f484180d91);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        bp4.o4 o4Var = new bp4.o4((com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById13, this);
        this.P = o4Var;
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.f484179d90);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        fp4.s sVar = new fp4.s((com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById14, this);
        this.R = sVar;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder(context);
        addView(editorPanelHolder, -1, -1);
        editorPanelHolder.setVisibility(8);
        bp4.z3 z3Var = new bp4.z3(editorPanelHolder, this);
        this.W = z3Var;
        this.V = new bp4.o1(this, this);
        this.f175847p0 = new hp4.a(this, this, true);
        bp4.z2 z2Var = new bp4.z2(this, this);
        this.f175857x0 = z2Var;
        bp4.p2 p2Var = new bp4.p2(this, this);
        this.f175861y1 = p2Var;
        p2Var.z(jVar);
        p2Var.z(nVar);
        bp4.h3 h3Var = new bp4.h3(this, this);
        this.f175860y0 = h3Var;
        bp4.f3 f3Var = new bp4.f3(this, this);
        this.f175842l1 = f3Var;
        bp4.x2 x2Var = new bp4.x2(this, this);
        this.f175848p1 = x2Var;
        bp4.p4 p4Var = new bp4.p4(this, this);
        this.f175858x1 = p4Var;
        bp4.c2 c2Var = new bp4.c2(this, this);
        this.f175863z1 = c2Var;
        getMultiPreviewPlugin().L(c2Var);
        android.content.Intent intent = activity.getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        op4.l lVar = new op4.l(this, intent);
        lVar.z(new op4.h(this));
        lVar.z(new op4.j(this));
        getPluginList().add(lVar);
        getMultiPreviewPlugin().L(nVar);
        getMultiPreviewPlugin().L(o4Var);
        getMultiPreviewPlugin().L(sVar);
        getMultiPreviewPlugin().f23211g.setOutsideTouckListener(new yo4.s(this));
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.jvq);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.A1 = findViewById15;
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.jvr);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.B1 = findViewById16;
        android.view.View findViewById17 = findViewById(com.tencent.mm.R.id.kv_);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.D1 = (com.tencent.mm.plugin.vlog.ui.widget.PhotoMaskView) findViewById17;
        getPluginList().add(nVar);
        getPluginList().add(o4Var);
        getPluginList().add(sVar);
        getPluginList().add(jVar);
        getPluginList().add(k2Var);
        getPluginList().add(qVar2);
        getPluginList().add(e4Var);
        getPluginList().add(getMultiPreviewPlugin());
        getPluginList().add(xVar);
        getPluginList().add(g0Var);
        getPluginList().add(o3Var);
        getPluginList().add(z3Var);
        getPluginList().add(z2Var);
        getPluginList().add(jVar2);
        getPluginList().add(h3Var);
        getPluginList().add(f3Var);
        getPluginList().add(x2Var);
        getPluginList().add(p4Var);
        getPluginList().add(p2Var);
        getPluginList().add(c2Var);
        int i17 = vt3.q.f440038b;
        int i18 = vt3.q.f440037a;
        float f17 = i17;
        float f18 = i18;
        float f19 = f17 / f18;
        float f27 = f17 / 2.18f;
        float f28 = 2;
        float f29 = (f18 - f27) / f28;
        float f37 = (f17 - f17) / f28;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "initSafeArea, displaySize:[" + i18 + ", " + i17 + "], scale:" + f19 + ", safeAreaWidth:" + f27 + ", safeAreaFrameWidth:" + f29 + ", safeAreaHeight:" + f17 + ", safeAreaFrameHeight:" + f37);
        if (f19 <= 1.78f) {
            tVar.A(f27, f29);
            jVar.K(f27, f29);
        } else if (f19 >= 2.18f) {
            tVar.z(f27, f29);
            jVar.J(f17, f37);
        } else {
            tVar.A(f27, f29);
            tVar.z(f27, f29);
            jVar.K(f27, f29);
            jVar.J(f17, f37);
        }
    }

    public static /* synthetic */ void E(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, boolean z17, boolean z18, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recreateVideo");
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            j17 = -1;
        }
        multiVideoFullScreenPluginLayout.D(z17, z18, j17);
    }

    public static void J(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, boolean z17, boolean z18, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeVideo");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            j17 = -1;
        }
        if (!multiVideoFullScreenPluginLayout.H.f175734h || multiVideoFullScreenPluginLayout.G1) {
            if (z17) {
                multiVideoFullScreenPluginLayout.D(true, z18, j17);
            } else {
                if (j17 != -1) {
                    multiVideoFullScreenPluginLayout.getMultiPreviewPlugin().M(j17);
                }
                bp4.k0 multiPreviewPlugin = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin();
                com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f23214m;
                if (videoCompositionPlayView != null) {
                    videoCompositionPlayView.h();
                }
                com.tencent.mm.plugin.vlog.model.c0 c0Var = multiPreviewPlugin.I;
                c0Var.f175573b = 0L;
                c0Var.f175572a = 0;
                multiPreviewPlugin.f23209J = 0L;
                bp4.c0 c0Var2 = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin().D;
                if (c0Var2 != null) {
                    c0Var2.resume();
                }
            }
            multiVideoFullScreenPluginLayout.f175861y1.B();
        }
    }

    private final void setupTemplateVideoPlugins(so4.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "setupTemplateVideoPlugins, template:" + bVar);
        this.f175848p1.setVisibility(4);
        this.f175842l1.setVisibility(0);
        bp4.x xVar = this.L;
        xVar.setVisibility(8);
        this.V.setVisibility(8);
        yo4.p pVar = this.f175855w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        pVar.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "showTemplateEditPlugins");
        yo4.p pVar2 = this.f175855w;
        if (pVar2 == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        pVar2.setVisibility(8);
        bp4.b4 b4Var = this.f175854v;
        if (b4Var == null) {
            kotlin.jvm.internal.o.o("cropVideoPlugin");
            throw null;
        }
        b4Var.setVisibility(8);
        this.N.setVisibility(8);
        bp4.d1 d1Var = this.T;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("editCropPlugin");
            throw null;
        }
        d1Var.setVisibility(8);
        bp4.m1 m1Var = this.U;
        if (m1Var == null) {
            kotlin.jvm.internal.o.o("editMagicPlugin");
            throw null;
        }
        m1Var.setVisibility(8);
        xVar.setVisibility(8);
        bp4.r1 r1Var = this.M;
        if (r1Var == null) {
            kotlin.jvm.internal.o.o("editPencilPlugin");
            throw null;
        }
        r1Var.setVisibility(8);
        this.f175851s.setVisibility(8);
        cp4.r rVar = this.f175856x;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("captionPlugin");
            throw null;
        }
        rVar.setVisibility(8);
        yt3.m mVar = this.f175853u;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("addTextPlugin");
            throw null;
        }
        mVar.setVisibility(8);
        yt3.i iVar = this.f175852t;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("addEmojiPlugin");
            throw null;
        }
        iVar.setVisibility(8);
        this.f175858x1.getClass();
        gp4.j jVar = this.f175850r;
        jVar.f274412f.setVisibility(4);
        jVar.O(true);
        boolean z17 = this.G1;
        this.G1 = true;
        setBackgroundColor(this.Q1);
        com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout multiEditCropOperationLayout = getMultiPreviewPlugin().f23211g;
        ru3.o oVar = ru3.o.f399766g;
        multiEditCropOperationLayout.setStyle(oVar);
        this.currentStyle = oVar;
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.setVisibility(0);
        }
        this.H.f175741r = this.f175843m;
        android.graphics.RectF rectF = getMultiPreviewPlugin().f23216o;
        rectF.round(lt3.n.f321263d);
        getMultiPreviewPlugin().O(rectF);
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new yo4.i0(this, bVar, z17, null), 2, null);
    }

    public final void A(z23.f fVar, java.lang.String[] strArr, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, int i17) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object obj = this.H.f175730d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        h0Var.f310123d = obj;
        if (this.R1) {
            so4.g gVar = so4.g.f410776a;
            java.util.HashMap hashMap = so4.g.f410782g;
            if (hashMap.containsKey(obj)) {
                java.lang.String str = (java.lang.String) hashMap.get(h0Var.f310123d);
                if (str == null) {
                    str = "";
                }
                if (com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "generateCropImage enable enhancement, use enhancement result image path:".concat(str));
                    h0Var.f310123d = str;
                }
            }
        }
        this.f175851s.C((java.lang.String) h0Var.f310123d, new yo4.z(h0Var, i17, this, fVar, strArr, arrayList, arrayList2, captureDataManager$CaptureVideoNormalModel));
    }

    public final void B() {
        this.f175860y0.setVisibility(8);
        this.f175858x1.getClass();
        android.view.View view = this.A1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.B1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getMultiPreviewPlugin().f23211g.setStyle(ru3.o.f399765f);
        this.L.setVisibility(4);
        if (yo4.t.f464311a[this.P1.ordinal()] == 1) {
            this.V.setVisibility(8);
            this.f175847p0.getClass();
        }
    }

    public final void C() {
        if (!this.H.f175734h || this.G1) {
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f23214m;
            if (videoCompositionPlayView != null) {
                videoCompositionPlayView.pause();
            }
            this.N.f23160h.recyclerView.f1();
            bp4.c0 c0Var = getMultiPreviewPlugin().D;
            if (c0Var != null) {
                c0Var.pause();
            }
            this.f175861y1.A();
        }
    }

    public final void D(boolean z17, boolean z18, long j17) {
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.H;
        jz5.l f17 = u0Var.f175743t.f();
        u0Var.c(u0Var.f175743t.m(), this.f175850r.f274412f.getAllTTSData());
        java.lang.Number number = (java.lang.Number) f17.f302833d;
        if (number.longValue() != -1) {
            java.lang.Number number2 = (java.lang.Number) f17.f302834e;
            if (number2.longValue() != -1) {
                u0Var.f175743t.s(number.longValue(), java.lang.Math.min(number2.longValue(), u0Var.f175743t.g()));
            }
        }
        bp4.k0 multiPreviewPlugin = getMultiPreviewPlugin();
        yo4.p pVar = this.f175855w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        multiPreviewPlugin.J(pVar.B(), z17, z18, j17);
        bp4.p2 p2Var = this.f175861y1;
        if (z17) {
            p2Var.B();
        } else {
            p2Var.A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.F():void");
    }

    public final void G(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "reportEdit20741Image, isVideoEnhancementEnable:" + this.R1);
        long j18 = this.H1 ? 1L : 4L;
        uo4.i iVar = new uo4.i();
        java.util.ArrayList E = this.f175850r.E();
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct = iVar.f429709a;
        multiMediaEditResultStruct.f59323d = multiMediaEditResultStruct.b("EditId", this.K1, true);
        iVar.f429709a.f59333n = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(getContext());
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct2 = iVar.f429709a;
        multiMediaEditResultStruct2.f59337r = 2;
        multiMediaEditResultStruct2.f59326g = this.H.f175730d.size();
        iVar.f429709a.f59330k = j18;
        iVar.c(E);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct3 = iVar.f429709a;
        multiMediaEditResultStruct3.f59329j = j17;
        multiMediaEditResultStruct3.f59332m = this.R1 ? 1L : 0L;
        y(multiMediaEditResultStruct3);
        iVar.a();
    }

    public final void H(boolean z17) {
        long j17;
        com.tencent.mm.autogen.mmdata.rpt.FinderPostPagePreviewStruct finderPostPagePreviewStruct = xo4.c.f455769a;
        com.tencent.mm.autogen.mmdata.rpt.FinderPostPagePreviewStruct finderPostPagePreviewStruct2 = xo4.c.f455769a;
        finderPostPagePreviewStruct2.f57546d = finderPostPagePreviewStruct2.b("PostId", this.J1, true);
        finderPostPagePreviewStruct2.f57547e = finderPostPagePreviewStruct2.b("EditId", this.K1, true);
        int i17 = 0;
        finderPostPagePreviewStruct2.f57548f = 0;
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.H;
        if (u0Var.f175734h) {
            java.util.ArrayList arrayList = this.L1;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if ((((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()) instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            j17 = i17;
        } else {
            j17 = 0;
        }
        finderPostPagePreviewStruct2.f57549g = j17;
        finderPostPagePreviewStruct2.f57550h = u0Var.f175734h ? 0L : u0Var.f175743t.g();
        finderPostPagePreviewStruct2.f57551i = z17 ? 2L : 1L;
        finderPostPagePreviewStruct2.f57552j = 1L;
        finderPostPagePreviewStruct2.k();
    }

    public final void I() {
        com.tencent.mm.plugin.vlog.model.i1 i1Var = this.H.f175747x;
        if (i1Var != null) {
            bp4.e4 e4Var = this.N;
            int i17 = this.V.f23310i;
            rm5.j jVar = i1Var.f175627l;
            e4Var.z(i17, jVar.f397502d, jVar.f397503e);
            getMultiPreviewPlugin().N(jVar.f397502d, jVar.f397503e);
            getMultiPreviewPlugin().M(jVar.f397502d);
        }
    }

    public final void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "setupNormalVideoPlugins");
        bp4.k0 multiPreviewPlugin = getMultiPreviewPlugin();
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.H;
        multiPreviewPlugin.O(u0Var.f175739p);
        this.f175848p1.setVisibility(0);
        this.f175842l1.setVisibility(8);
        N();
        gp4.j jVar = this.f175850r;
        jVar.f274412f.setVisibility(0);
        jVar.O(true);
        this.N.f23160h.D = false;
        this.G1 = false;
        u0Var.f175741r = this.f175843m;
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new yo4.h0(this, null), 2, null);
    }

    public final void L() {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "showImageEditPlugins");
        this.L.setVisibility(0);
        bp4.r1 r1Var = this.M;
        if (r1Var == null) {
            kotlin.jvm.internal.o.o("editPencilPlugin");
            throw null;
        }
        r1Var.setVisibility(0);
        this.f175851s.setVisibility(0);
        ct0.b bVar = this.G;
        if (bVar != null && (arrayList = bVar.f222214k) != null) {
            arrayList.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.L1.get(0)).f138430e);
        }
        yo4.p pVar = this.f175855w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        pVar.setVisibility(8);
        bp4.b4 b4Var = this.f175854v;
        if (b4Var == null) {
            kotlin.jvm.internal.o.o("cropVideoPlugin");
            throw null;
        }
        b4Var.setVisibility(8);
        this.N.setVisibility(8);
        bp4.d1 d1Var = this.T;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("editCropPlugin");
            throw null;
        }
        d1Var.setVisibility(8);
        bp4.m1 m1Var = this.U;
        if (m1Var == null) {
            kotlin.jvm.internal.o.o("editMagicPlugin");
            throw null;
        }
        m1Var.setVisibility(8);
        cp4.r rVar = this.f175856x;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("captionPlugin");
            throw null;
        }
        rVar.setVisibility(8);
        yt3.m mVar = this.f175853u;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("addTextPlugin");
            throw null;
        }
        mVar.setVisibility(0);
        yt3.i iVar = this.f175852t;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("addEmojiPlugin");
            throw null;
        }
        iVar.setVisibility(0);
        this.f175858x1.getClass();
        if (!com.tencent.mm.plugin.vlog.model.v0.b() || this.f175839J) {
            yo4.p pVar2 = this.f175855w;
            if (pVar2 != null) {
                pVar2.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("addMusicPlugin");
                throw null;
            }
        }
        yo4.p pVar3 = this.f175855w;
        if (pVar3 != null) {
            pVar3.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
    }

    public final void M() {
        if (this.I1) {
            return;
        }
        android.view.View view = this.C1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.H;
        if (u0Var.f175734h && !this.G1) {
            this.L.setVisibility(0);
        }
        boolean z17 = u0Var.f175734h;
        bp4.e4 e4Var = this.N;
        if (!z17) {
            e4Var.setVisibility(0);
        } else if (com.tencent.mm.plugin.vlog.model.v0.b() && !this.f175839J) {
            yo4.p pVar = this.f175855w;
            if (pVar == null) {
                kotlin.jvm.internal.o.o("addMusicPlugin");
                throw null;
            }
            pVar.setVisibility(0);
        }
        if (yo4.t.f464311a[this.P1.ordinal()] == 1) {
            this.V.setVisibility(0);
            e4Var.setVisibility(0);
            return;
        }
        getMultiPreviewPlugin().f23211g.setStyle(this.currentStyle);
        android.view.View view2 = this.B1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.A1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.G1) {
            return;
        }
        this.f175858x1.getClass();
    }

    public final void N() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "showVideoEditPlugins");
        yo4.p pVar = this.f175855w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        pVar.setVisibility(0);
        bp4.b4 b4Var = this.f175854v;
        if (b4Var == null) {
            kotlin.jvm.internal.o.o("cropVideoPlugin");
            throw null;
        }
        b4Var.setVisibility(0);
        this.N.setVisibility(0);
        bp4.d1 d1Var = this.T;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("editCropPlugin");
            throw null;
        }
        d1Var.setVisibility(0);
        bp4.m1 m1Var = this.U;
        if (m1Var == null) {
            kotlin.jvm.internal.o.o("editMagicPlugin");
            throw null;
        }
        m1Var.setVisibility(0);
        this.L.setVisibility(8);
        bp4.r1 r1Var = this.M;
        if (r1Var == null) {
            kotlin.jvm.internal.o.o("editPencilPlugin");
            throw null;
        }
        r1Var.setVisibility(8);
        this.f175851s.setVisibility(8);
        cp4.r rVar = this.f175856x;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("captionPlugin");
            throw null;
        }
        rVar.setVisibility(0);
        yt3.m mVar = this.f175853u;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("addTextPlugin");
            throw null;
        }
        mVar.setVisibility(0);
        yt3.i iVar = this.f175852t;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("addEmojiPlugin");
            throw null;
        }
        iVar.setVisibility(0);
        this.f175858x1.getClass();
    }

    public final void O() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        android.os.Bundle bundle4;
        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markPressEditFinish");
        if (com.tencent.mm.plugin.vlog.model.b0.f175555i <= 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.vlog.model.b0.f175555i = android.os.SystemClock.elapsedRealtime();
        }
        this.B.A(com.tencent.mm.R.string.k8s, false);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.F;
        kotlin.jvm.internal.o.d(recordConfigProvider);
        java.lang.String str = recordConfigProvider.B;
        this.N1.f340217a.f59316t = 2L;
        F();
        xo4.b.a(xo4.b.f455768a, 101, 1, java.lang.System.currentTimeMillis() - this.S1, 1, null, null, null, 112, null);
        yo4.p0 p0Var = new yo4.p0(this, str);
        ut3.f fVar = ut3.f.f431176c;
        int i17 = fVar.f431178b.getInt("SOUND_TRACK_TYPE", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "startMux: currentSoundTrackType=" + i17);
        if (i17 <= 0) {
            fVar.e(0);
        }
        yo4.p pVar = this.f175855w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = pVar.f464287r;
        android.os.Bundle bundle5 = fVar.f431178b;
        if (audioCacheInfo != null) {
            if (audioCacheInfo.f155722s) {
                ct0.b bVar = this.G;
                bundle5.putString("ORIGIN_MUSIC_ID", (bVar == null || (bundle4 = bVar.f222217n) == null) ? null : bundle4.getString("KEY_ORIGIN_MUSIC_ID"));
                ct0.b bVar2 = this.G;
                bundle5.putString("ORIGIN_MUSIC_PATH", (bVar2 == null || (bundle3 = bVar2.f222217n) == null) ? null : bundle3.getString("KEY_ORIGIN_MUSIC_PATH"));
                ct0.b bVar3 = this.G;
                bundle5.putByteArray("ORIGIN_MUSIC_INFO", (bVar3 == null || (bundle2 = bVar3.f222217n) == null) ? null : bundle2.getByteArray("KEY_ORIGIN_MUSIC_INFO"));
            } else if (audioCacheInfo.f155728y == null) {
                bundle5.putByteArray("MEDIA_EXTRA_MUSIC", audioCacheInfo.f155710d.toByteArray());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "startMux: soundTrackType=" + audioCacheInfo.f155719p);
            fVar.e(audioCacheInfo.f155719p);
        }
        ct0.b bVar4 = this.G;
        bundle5.putString("ORIGIN_BGM_URL", (bVar4 == null || (bundle = bVar4.f222217n) == null) ? null : bundle.getString("KEY_ORIGIN_BGM_URL"));
        yo4.p pVar2 = this.f175855w;
        if (pVar2 == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        bundle5.putBoolean("MEDIA_IS_MUTE", pVar2.B() || this.I);
        if (this.f175855w == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        bundle5.putBoolean("MUSIC_IS_MUTE", !r5.A().getWithMusic());
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.H;
        if (u0Var.f175734h) {
            if (!(this.f175860y0.f23190h.getSelectedTabPosition() == 1)) {
                e60.g1 g1Var = new e60.g1();
                g1Var.a(this.f175849q);
                g1Var.f249700d = this.f175845o;
                g1Var.f249701e = this.f175844n;
                g1Var.f249702f = 100;
                z23.f fVar2 = new z23.f(g1Var);
                java.lang.String[] strArr = new java.lang.String[u0Var.f175730d.size()];
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                nu3.i iVar = nu3.i.f340218a;
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, str, "", 0L, bool, iVar.l());
                yo4.p pVar3 = this.f175855w;
                if (pVar3 == null) {
                    kotlin.jvm.internal.o.o("addMusicPlugin");
                    throw null;
                }
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = pVar3.f464287r;
                if ((audioCacheInfo2 != null ? audioCacheInfo2.f155728y : null) != null) {
                    wt3.c1 c1Var = wt3.c1.f449387b;
                    kotlin.jvm.internal.o.d(audioCacheInfo2);
                    c1Var.c(audioCacheInfo2, new yo4.l0(this, fVar2, strArr, arrayList, arrayList2, captureDataManager$CaptureVideoNormalModel));
                    return;
                } else {
                    fVar.d(true, iVar.l());
                    G(1L);
                    A(fVar2, strArr, arrayList, arrayList2, captureDataManager$CaptureVideoNormalModel, 0);
                    return;
                }
            }
        }
        C();
        yo4.p pVar4 = this.f175855w;
        if (pVar4 == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo3 = pVar4.f464287r;
        if (audioCacheInfo3 != null) {
            wt3.c1.f449387b.c(audioCacheInfo3, new yo4.n0(this, p0Var));
        } else {
            z(null, p0Var);
        }
    }

    public final ru3.o getCurrentStyle() {
        return this.currentStyle;
    }

    public final bp4.k0 getMultiPreviewPlugin() {
        bp4.k0 k0Var = this.multiPreviewPlugin;
        if (k0Var != null) {
            return k0Var;
        }
        kotlin.jvm.internal.o.o("multiPreviewPlugin");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0480  */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(it3.y r25, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r26) {
        /*
            Method dump skipped, instructions count: 1317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.m(it3.y, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1024 && i18 == -1) {
            getMultiPreviewPlugin().B();
            com.tencent.mm.plugin.vlog.model.u0 u0Var = this.H;
            if (u0Var.f175734h) {
                so4.g.f410776a.d(u0Var.f175730d);
                bp4.x xVar = this.L;
                xVar.A(xVar.z());
            }
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        if (super.onBackPress()) {
            return true;
        }
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.stop();
        }
        it3.y yVar = this.f175841i;
        if (yVar != null) {
            it3.y.a(yVar, 0, null, 2, null);
        }
        this.N1.f340217a.f59316t = 1L;
        F();
        if (this.H.f175734h) {
            if (!(this.f175860y0.f23190h.getSelectedTabPosition() == 1)) {
                G(0L);
                xo4.b.a(xo4.b.f455768a, 101, 1, java.lang.System.currentTimeMillis() - this.S1, 0, null, null, null, 112, null);
                ut3.f.f431176c.d(false, nu3.i.f340218a.l());
                return true;
            }
        }
        pm0.v.L("MultiVideoPluginLayout_report", true, new yo4.d0(this, 0L));
        xo4.b.a(xo4.b.f455768a, 101, 1, java.lang.System.currentTimeMillis() - this.S1, 0, null, null, null, 112, null);
        ut3.f.f431176c.d(false, nu3.i.f340218a.l());
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onDetach() {
        super.onDetach();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "onDetach");
        bp4.k0 multiPreviewPlugin = getMultiPreviewPlugin();
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.g();
            multiPreviewPlugin.f23214m = null;
        }
        android.view.View view = this.f175840h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        so4.g.f410776a.c();
        this.f175858x1.f23350o.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CompositionLabelRetriever", "cancel get label");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo2;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo3;
        android.os.Bundle bundle;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "loadCurrentPage time:" + java.lang.System.currentTimeMillis() + " model:" + bVar);
        super.r(bVar);
        dw3.g0 g0Var = this.S;
        g0Var.getClass();
        g0Var.f244210d.put("start", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        this.G = bVar;
        java.util.ArrayList arrayList = this.L1;
        arrayList.clear();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.F;
        if (recordConfigProvider != null && (bundle = recordConfigProvider.M) != null) {
            bundle.setClassLoader(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.class.getClassLoader());
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("media_list");
            if (parcelableArrayList != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "loadMediaList:" + parcelableArrayList);
                arrayList.addAll(parcelableArrayList);
            }
            this.f175839J = bundle.getBoolean("KEY_DISABLE_IMAGE_ADD_MUSIC", false);
            bundle.getBoolean("KEY_DISABLE_VIDEO_ENHANCEMENT", false);
            this.f175858x1.f23346h.setVisibility(8);
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()).getType() == 1)) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "loadMediaList isAllImage:" + z17);
            bp4.x2 x2Var = this.f175848p1;
            gp4.j jVar = this.f175850r;
            if (z17) {
                this.L.B(arrayList);
                L();
                jVar.D(false);
                jVar.O(true);
                x2Var.f23425h = x2Var.f23423f;
            } else {
                N();
                jVar.O(true);
                x2Var.z();
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.X(arrayList);
            B();
            bp4.o3.B(this.B, galleryItem$MediaItem, 0, true, 2, null);
        }
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Integer num = null;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new yo4.f0(this, null), 2, null);
        if (bVar != null) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.F;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            bp4.k2 k2Var = this.f175851s;
            k2Var.getClass();
            k2Var.f23231h = recordConfigProvider2;
            k2Var.f23232i = bVar;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        nu3.i.f340218a.n("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(currentTimeMillis));
        java.lang.String str = gm0.j1.b().j() + '_' + currentTimeMillis;
        this.K1 = str;
        yo4.p pVar = this.f175855w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        pVar.I(str);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = this.N1.f340217a;
        multiMediaEditInfoStruct.f59301e = multiMediaEditInfoStruct.b("EditId", this.K1, true);
        this.N.f23160h.setScrollCount(0);
        getMultiPreviewPlugin().f23224w = 0;
        op4.l lVar = (op4.l) j(op4.l.class);
        if (lVar != null) {
            op4.h hVar = (op4.h) lVar.A("21875");
            if (hVar != null) {
                java.lang.String b17 = np4.b.b(this.F);
                com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) hVar.f347291d;
                if (finderShowInWXProfileStruct != null) {
                    finderShowInWXProfileStruct.f57827e = finderShowInWXProfileStruct.b("findercontextid", b17, true);
                }
            }
            op4.h hVar2 = (op4.h) lVar.A("21875");
            if (hVar2 != null) {
                java.lang.String c17 = np4.b.c(this.F);
                com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct2 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) hVar2.f347291d;
                if (finderShowInWXProfileStruct2 != null) {
                    finderShowInWXProfileStruct2.s(c17);
                }
            }
            op4.h hVar3 = (op4.h) lVar.A("21875");
            if (hVar3 != null) {
                java.lang.String editId = this.K1;
                kotlin.jvm.internal.o.g(editId, "editId");
                hVar3.f347282f = editId;
            }
            op4.j jVar2 = (op4.j) lVar.A("25496");
            if (jVar2 != null) {
                jVar2.j(this.K1, this.F);
            }
        }
        this.S1 = java.lang.System.currentTimeMillis();
        xo4.b.a(xo4.b.f455768a, 101, 0, 0L, 0, null, null, null, 124, null);
        android.content.Context context = getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            android.content.Intent intent = activity.getIntent();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.F;
            intent.putExtra("key_ref_feed_id", (recordConfigProvider3 == null || (videoCaptureReportInfo3 = recordConfigProvider3.I) == null) ? null : java.lang.Long.valueOf(videoCaptureReportInfo3.f155694h));
            android.content.Intent intent2 = activity.getIntent();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.F;
            intent2.putExtra("key_ref_feed_dup_flag", (recordConfigProvider4 == null || (videoCaptureReportInfo2 = recordConfigProvider4.I) == null) ? null : videoCaptureReportInfo2.f155695i);
            android.content.Intent intent3 = activity.getIntent();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = this.F;
            if (recordConfigProvider5 != null && (videoCaptureReportInfo = recordConfigProvider5.I) != null) {
                num = java.lang.Integer.valueOf(videoCaptureReportInfo.f155693g);
            }
            intent3.putExtra("key_ref_comment_scene", num);
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((c61.w8) paVar).getClass();
            com.tencent.mm.plugin.finder.report.p2.N(com.tencent.mm.plugin.finder.report.p2.f125237a, context2, 67, null, 0L, 0, 28, null);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void release() {
        super.release();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "release");
        this.H.dead();
        so4.g.f410776a.i();
        android.util.SparseArray sparseArray = ir.c0.f293820a;
        int i17 = to4.a.f420989a;
        ir.c0.f293820a.remove(108);
        rm5.l.f397520a.a();
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void reset() {
        super.reset();
        this.currentStyle = ru3.o.f399764e;
        setBackgroundColor(0);
        so4.g.f410776a.c();
    }

    public final void setCurrentStyle(ru3.o oVar) {
        kotlin.jvm.internal.o.g(oVar, "<set-?>");
        this.currentStyle = oVar;
    }

    public final void setMultiPreviewPlugin(bp4.k0 k0Var) {
        kotlin.jvm.internal.o.g(k0Var, "<set-?>");
        this.multiPreviewPlugin = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_edit_image_auto_add_music, 1) == 1 && com.tencent.mm.plugin.vlog.model.v0.b()) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setupImageEditPlugins(boolean r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setupImageEditPlugins, selectFirst:"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MultiVideoFullScreenPluginLayout"
            com.tencent.mars.xlog.Log.i(r1, r0)
            bp4.x2 r0 = r11.f175848p1
            r1 = 0
            r0.setVisibility(r1)
            bp4.f3 r0 = r11.f175842l1
            r2 = 8
            r0.setVisibility(r2)
            bp4.k0 r0 = r11.getMultiPreviewPlugin()
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r0 = r0.f23214m
            if (r0 == 0) goto L2c
            r0.stop()
        L2c:
            bp4.k0 r0 = r11.getMultiPreviewPlugin()
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r0 = r0.f23214m
            if (r0 != 0) goto L35
            goto L38
        L35:
            r0.setVisibility(r2)
        L38:
            gp4.j r0 = r11.f175850r
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f274412f
            r0.setVisibility(r1)
            r11.G1 = r1
            bp4.k0 r0 = r11.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout r0 = r0.f23211g
            ru3.o r2 = ru3.o.f399764e
            r0.setStyle(r2)
            r11.currentStyle = r2
            r11.L()
            boolean r0 = com.tencent.mm.plugin.vlog.model.v0.b()
            if (r0 == 0) goto Lb7
            boolean r0 = r11.f175839J
            if (r0 != 0) goto Lb7
            yo4.p r2 = r11.f175855w
            r0 = 0
            java.lang.String r10 = "addMusicPlugin"
            if (r2 == 0) goto Lb3
            ct0.b r3 = r11.G
            kotlin.jvm.internal.o.d(r3)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r11.F
            r5 = 0
            boolean r6 = r11.I
            com.tencent.mm.plugin.vlog.model.u0 r7 = r11.H
            boolean r7 = r7.f175734h
            r8 = 4
            r9 = 0
            yo4.p.K(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Class<e42.e0> r2 = e42.e0.class
            i95.m r3 = i95.n0.c(r2)
            e42.e0 r3 = (e42.e0) r3
            e42.d0 r4 = e42.d0.clicfg_finder_edit_image_auto_add_music_panel
            h62.d r3 = (h62.d) r3
            int r3 = r3.Ni(r4, r1)
            r4 = 1
            if (r3 != r4) goto La4
            i95.m r2 = i95.n0.c(r2)
            e42.e0 r2 = (e42.e0) r2
            e42.d0 r3 = e42.d0.clicfg_finder_edit_image_auto_add_music
            h62.d r2 = (h62.d) r2
            int r2 = r2.Ni(r3, r4)
            if (r2 != r4) goto La0
            boolean r2 = com.tencent.mm.plugin.vlog.model.v0.b()
            if (r2 == 0) goto La0
            r2 = r4
            goto La1
        La0:
            r2 = r1
        La1:
            if (r2 == 0) goto La4
            goto La5
        La4:
            r4 = r1
        La5:
            if (r4 == 0) goto Lb7
            yo4.p r2 = r11.f175855w
            if (r2 == 0) goto Laf
            r2.L()
            goto Lb7
        Laf:
            kotlin.jvm.internal.o.o(r10)
            throw r0
        Lb3:
            kotlin.jvm.internal.o.o(r10)
            throw r0
        Lb7:
            bp4.x r0 = r11.L
            if (r12 == 0) goto Lbc
            goto Lc0
        Lbc:
            int r1 = r0.z()
        Lc0:
            r0.A(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.setupImageEditPlugins(boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x006e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0073. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x007e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0083. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x009a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x009f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00a2. Please report as an issue. */
    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        ju3.c0 c0Var;
        java.lang.String str;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        int i17;
        bv3.d dVar;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo;
        bp4.o1 o1Var;
        hp4.a aVar;
        java.lang.String string;
        uq5.y yVar;
        java.lang.String obj;
        kotlin.jvm.internal.o.g(status, "status");
        ju3.c0 c0Var2 = ju3.c0.f301871d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "statusChange " + status + "  param:" + bundle);
        int ordinal = status.ordinal();
        if (ordinal == 20) {
            c0Var = status;
            if (bundle != null) {
                bundle.getInt("EDIT_FILTER_INDEX_INT", -1);
                bundle.getFloat("EDIT_FILTER_COLOR_WEIGHT_FLOAT", 0.0f);
                bundle.getString("EDIT_FILTER_COLOR_PATH_STRING");
                com.tencent.mm.plugin.vlog.model.h1 h1Var = getMultiPreviewPlugin().f23215n;
            }
        } else if (ordinal == 32) {
            c0Var = status;
            onBackPress();
        } else if (ordinal != 45) {
            bp4.c2 c2Var = this.f175863z1;
            if (ordinal != 69) {
                bp4.x xVar = this.L;
                if (ordinal != 75) {
                    gp4.j jVar = this.f175850r;
                    if (ordinal != 55) {
                        bp4.n nVar = this.Q;
                        bp4.p2 p2Var = this.f175861y1;
                        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.H;
                        if (ordinal != 56) {
                            switch (ordinal) {
                                case 35:
                                case 36:
                                case 37:
                                    if (status == ju3.c0.F) {
                                        C();
                                    }
                                    B();
                                    c0Var = status;
                                    break;
                                case 38:
                                    if (bundle != null) {
                                        getMultiPreviewPlugin().M(bundle.getInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT"));
                                    }
                                    c0Var = status;
                                    break;
                                case 39:
                                    yt3.i iVar = this.f175852t;
                                    if (iVar == null) {
                                        kotlin.jvm.internal.o.o("addEmojiPlugin");
                                        throw null;
                                    }
                                    iVar.B();
                                    c0Var = status;
                                    break;
                                case 40:
                                    if (bundle != null) {
                                        jVar.getClass();
                                        java.lang.CharSequence charSequence = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                                        int i18 = bundle.getInt("PARAM_EDIT_TEXT_COLOR");
                                        int i19 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                                        java.lang.String string2 = bundle.getString("PARAM_EDIT_TEXT_FONT");
                                        kotlin.jvm.internal.o.d(string2);
                                        zu3.a0 a0Var = new zu3.a0(charSequence, i18, i19, string2, 0, null, 48, null);
                                        a0Var.f475762e = this.E;
                                        gp4.j jVar2 = this.f175850r;
                                        com.tencent.mm.plugin.vlog.model.i1 i1Var = u0Var.f175747x;
                                        java.lang.String str2 = this.D;
                                        bp4.k0 multiPreviewPlugin = getMultiPreviewPlugin();
                                        multiPreviewPlugin.A();
                                        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f23214m;
                                        kotlin.jvm.internal.o.d(videoCompositionPlayView);
                                        jVar2.z(a0Var, i1Var, str2, videoCompositionPlayView.getPosition());
                                        J(this, false, false, 0L, 7, null);
                                    }
                                    c0Var = status;
                                    break;
                                case 41:
                                    yt3.m mVar = this.f175853u;
                                    if (mVar == null) {
                                        kotlin.jvm.internal.o.o("addTextPlugin");
                                        throw null;
                                    }
                                    mVar.f465533h.performClick();
                                    c0Var = status;
                                    break;
                                default:
                                    bp4.e4 e4Var = this.N;
                                    switch (ordinal) {
                                        case 48:
                                            B();
                                            e4Var.setVisibility(4);
                                            c0Var = status;
                                            break;
                                        case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                                            c0Var = status;
                                            break;
                                        case 50:
                                            C();
                                            c0Var = status;
                                            break;
                                        case 51:
                                            C();
                                            B();
                                            c0Var = status;
                                            break;
                                        case 52:
                                            M();
                                            zu3.a aVar2 = jVar.f274413g;
                                            if (aVar2 != null) {
                                                jVar.Q(aVar2);
                                            }
                                            c0Var = status;
                                            break;
                                        case 53:
                                            if (bundle != null) {
                                                java.lang.Boolean.valueOf(bundle.getBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN")).booleanValue();
                                                J(this, true, true, 0L, 4, null);
                                            }
                                            c0Var = status;
                                            break;
                                        default:
                                            switch (ordinal) {
                                                case 60:
                                                    C();
                                                    c0Var = status;
                                                    break;
                                                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                                                    boolean z17 = bundle != null ? bundle.getBoolean("PARAM_1_BOOLEAN", false) : false;
                                                    if (z17 || (!z17 && p2Var.f23341m)) {
                                                        J(this, false, false, 0L, 7, null);
                                                    }
                                                    c0Var = status;
                                                    break;
                                                case 62:
                                                    ct0.b bVar = this.G;
                                                    if (bVar != null) {
                                                        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.F;
                                                        if (bVar.f222208e - bVar.f222207d > (recordConfigProvider != null ? recordConfigProvider.f155685w : 10000) + 250) {
                                                            android.content.Context context = getContext();
                                                            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                                                            ((android.app.Activity) context).setResult(3000);
                                                            android.content.Context context2 = getContext();
                                                            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
                                                            ((android.app.Activity) context2).finish();
                                                            return;
                                                        }
                                                        jVar.f274412f.setEnableTouch(true);
                                                        nu3.i.f340218a.n("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                                                    }
                                                    c0Var = status;
                                                    break;
                                                case 63:
                                                    yo4.p pVar = this.f175855w;
                                                    if (pVar == null) {
                                                        kotlin.jvm.internal.o.o("addMusicPlugin");
                                                        throw null;
                                                    }
                                                    pVar.z();
                                                    jVar.f274412f.setEnableTouch(true);
                                                    nu3.i.f340218a.n("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                                                    c0Var = status;
                                                    break;
                                                case 64:
                                                    if (c2Var.f23124p) {
                                                        c2Var.A(false);
                                                    } else {
                                                        O();
                                                    }
                                                    c0Var = status;
                                                    break;
                                                case 65:
                                                    O();
                                                    c0Var = status;
                                                    break;
                                                case 66:
                                                    if ((bundle == null || bundle.getBoolean("PARAM_VIDEO_NEED_CROP")) ? false : true) {
                                                        yo4.p pVar2 = this.f175855w;
                                                        if (pVar2 == null) {
                                                            kotlin.jvm.internal.o.o("addMusicPlugin");
                                                            throw null;
                                                        }
                                                        pVar2.z();
                                                    }
                                                    this.B.z();
                                                    android.content.Context context3 = getContext();
                                                    kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
                                                    ((android.view.ViewGroup) ((android.app.Activity) context3).getWindow().getDecorView().findViewById(android.R.id.content)).setAlpha(1.0f);
                                                    if (!(this.P.f23316f.getVisibility() == 0)) {
                                                        M();
                                                    }
                                                    this.f175860y0.z(true);
                                                    c2Var.D();
                                                    com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markFirstFrameShow");
                                                    if (com.tencent.mm.plugin.vlog.model.b0.f175554h <= 0) {
                                                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                                        com.tencent.mm.plugin.vlog.model.b0.f175554h = android.os.SystemClock.elapsedRealtime();
                                                    }
                                                    c0Var = status;
                                                    break;
                                                case 67:
                                                    if (bundle != null) {
                                                        int i27 = bundle.getInt("PARAM_DELETE_VIEW_TYPE_INT");
                                                        cw3.j jVar3 = cw3.j.f224165d;
                                                        if (i27 == 4) {
                                                            yo4.p pVar3 = this.f175855w;
                                                            if (pVar3 == null) {
                                                                kotlin.jvm.internal.o.o("addMusicPlugin");
                                                                throw null;
                                                            }
                                                            pVar3.C();
                                                        } else if (i27 == 6) {
                                                            cp4.r rVar = this.f175856x;
                                                            if (rVar == null) {
                                                                kotlin.jvm.internal.o.o("captionPlugin");
                                                                throw null;
                                                            }
                                                            rVar.B(0);
                                                        } else if (i27 == 7) {
                                                            cp4.r rVar2 = this.f175856x;
                                                            if (rVar2 == null) {
                                                                kotlin.jvm.internal.o.o("captionPlugin");
                                                                throw null;
                                                            }
                                                            rVar2.B(1);
                                                        }
                                                    }
                                                    J(this, true, false, 0L, 6, null);
                                                    c0Var = status;
                                                    break;
                                                default:
                                                    bp4.k2 k2Var = this.f175851s;
                                                    switch (ordinal) {
                                                        case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
                                                        case qc1.u.CTRL_INDEX /* 78 */:
                                                            c0Var = status;
                                                            break;
                                                        case 79:
                                                            this.I1 = false;
                                                            M();
                                                            xVar.setVisibility(0);
                                                            k2Var.reset();
                                                            c0Var = status;
                                                            break;
                                                        case 80:
                                                            k2Var.D();
                                                            c0Var = status;
                                                            break;
                                                        case 81:
                                                            k2Var.A();
                                                            c0Var = status;
                                                            break;
                                                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                                                            k2Var.reset();
                                                            if (bundle != null) {
                                                                k2Var.B(bundle.getInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT"));
                                                            }
                                                            c0Var = status;
                                                            break;
                                                        case 83:
                                                            k2Var.E();
                                                            c0Var = status;
                                                            break;
                                                        default:
                                                            bp4.o1 o1Var2 = this.V;
                                                            hp4.a aVar3 = this.f175847p0;
                                                            switch (ordinal) {
                                                                case 101:
                                                                    if (bundle != null && (galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) bundle.getParcelable("PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE")) != null) {
                                                                        this.S.a("start", "select first image");
                                                                        bp4.r1 r1Var = this.M;
                                                                        if (r1Var == null) {
                                                                            kotlin.jvm.internal.o.o("editPencilPlugin");
                                                                            throw null;
                                                                        }
                                                                        r1Var.reset();
                                                                        k2Var.reset();
                                                                        k2Var.f23229f.post(new bp4.f2(new yo4.q0(this, galleryItem$MediaItem)));
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 102:
                                                                    if (bundle != null && (i17 = bundle.getInt("EDIT_VLOG_SELECT_TRACK", -1)) >= 0) {
                                                                        this.P1 = yo4.q.f464301e;
                                                                        com.tencent.mm.plugin.vlog.model.i1 i1Var2 = (com.tencent.mm.plugin.vlog.model.i1) kz5.n0.a0(u0Var.f175743t.m(), i17);
                                                                        if (i1Var2 != null && o1Var2.f23310i != i17) {
                                                                            B();
                                                                            u0Var.f175747x = i1Var2;
                                                                            long max = java.lang.Math.max(u0Var.f175743t.j(), i1Var2.f175627l.f397502d);
                                                                            getMultiPreviewPlugin().N(max, java.lang.Math.min(u0Var.f175743t.h(), i1Var2.f175627l.f397503e));
                                                                            getMultiPreviewPlugin().M(max);
                                                                            o1Var2.f23310i = i17;
                                                                            o1Var2.setVisibility(0);
                                                                            aVar3.f282942f = i17;
                                                                        }
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 103:
                                                                    this.E = true;
                                                                    if (bundle != null) {
                                                                        if (bundle.getBoolean("EDIT_VLOG_TRACK_CROP_CHANGE")) {
                                                                            u0Var.f175743t.s(bundle.getLong("EDIT_VLOG_TRACK_CROP_START"), bundle.getLong("EDIT_VLOG_TRAKC_CROP_END"));
                                                                            bp4.k0 multiPreviewPlugin2 = getMultiPreviewPlugin();
                                                                            yo4.p pVar4 = this.f175855w;
                                                                            if (pVar4 == null) {
                                                                                kotlin.jvm.internal.o.o("addMusicPlugin");
                                                                                throw null;
                                                                            }
                                                                            multiPreviewPlugin2.I(pVar4.B());
                                                                        } else {
                                                                            M();
                                                                            getMultiPreviewPlugin().E = 0L;
                                                                            getMultiPreviewPlugin().getClass();
                                                                            boolean z19 = bundle.getBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM");
                                                                            int i28 = bundle.getInt("EDIT_TRACK_DURATION_CUT_COUNT");
                                                                            int i29 = bundle.getInt("EDIT_TRACK_DURATION_SCROLL_COUNT");
                                                                            long j17 = bundle.getLong("EDIT_VLOG_TRACK_CROP_START");
                                                                            long j18 = bundle.getLong("EDIT_VLOG_TRAKC_CROP_END");
                                                                            com.tencent.mm.plugin.vlog.model.i1 i1Var3 = u0Var.f175747x;
                                                                            long j19 = i1Var3 != null ? i1Var3.f175627l.f397502d : 0L;
                                                                            this.H.l(z19, j17, j18, i28, i29, this.P1 == yo4.q.f464300d);
                                                                            jVar.f274412f.setSegmentOffset(0L);
                                                                            J(this, true, false, j19, 2, null);
                                                                            if (this.P1 == yo4.q.f464301e) {
                                                                                I();
                                                                            }
                                                                        }
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 104:
                                                                    if (bundle != null) {
                                                                        M();
                                                                        if (bundle.getBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM")) {
                                                                            com.tencent.mm.plugin.vlog.model.h1 h1Var2 = u0Var.f175743t;
                                                                            nVar.C(h1Var2, false);
                                                                            u0Var.a(h1Var2, true);
                                                                        } else {
                                                                            com.tencent.mm.plugin.vlog.model.h1 h1Var3 = u0Var.f175743t;
                                                                            nVar.C(h1Var3, true);
                                                                            u0Var.a(h1Var3, true);
                                                                        }
                                                                        bp4.k0 multiPreviewPlugin3 = getMultiPreviewPlugin();
                                                                        yo4.p pVar5 = this.f175855w;
                                                                        if (pVar5 == null) {
                                                                            kotlin.jvm.internal.o.o("addMusicPlugin");
                                                                            throw null;
                                                                        }
                                                                        multiPreviewPlugin3.I(pVar5.B());
                                                                        p2Var.B();
                                                                        p2Var.f23341m = p2Var.f23340i;
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 105:
                                                                case 106:
                                                                    if (bundle != null) {
                                                                        int i37 = bundle.getInt("EDIT_COMPOSITION_TRACK_INDEX");
                                                                        boolean z27 = bundle.getBoolean("EDIT_COMPOSITION_LEFT");
                                                                        this.H.k(i37, bundle.getLong("EDIT_VLOG_TRACK_CROP_START"), bundle.getLong("EDIT_VLOG_TRAKC_CROP_END"));
                                                                        com.tencent.mm.plugin.vlog.model.i1 i1Var4 = (com.tencent.mm.plugin.vlog.model.i1) u0Var.f175743t.f175597c.get(i37);
                                                                        E(this, false, false, z27 ? i1Var4.f175627l.f397502d : i1Var4.f175627l.f397503e, 2, null);
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 107:
                                                                    if (bundle != null) {
                                                                        int i38 = bundle.getInt("EDIT_VLOG_SELECT_TRACK", -1);
                                                                        com.tencent.mm.plugin.vlog.model.i1 i1Var5 = (com.tencent.mm.plugin.vlog.model.i1) kz5.n0.a0(u0Var.f175743t.m(), i38);
                                                                        if (i1Var5 != null) {
                                                                            bp4.k0 multiPreviewPlugin4 = getMultiPreviewPlugin();
                                                                            rm5.j jVar4 = i1Var5.f175627l;
                                                                            multiPreviewPlugin4.E = jVar4.f397502d;
                                                                            e4Var.setVisibility(4);
                                                                            jVar.f274412f.setSegmentOffset(jVar4.f397502d);
                                                                            long j27 = ((java.lang.Number) u0Var.f175743t.f().f302834e).longValue() != -1 ? jVar4.f397504f + (((float) (r3 - jVar4.f397502d)) * jVar4.f397506h) : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                                                                            u0Var.j(i38);
                                                                            this.P.z().setEnableLengthEdit(!u0Var.s());
                                                                            bp4.o4 o4Var = this.P;
                                                                            com.tencent.mm.plugin.vlog.model.i1 i1Var6 = u0Var.f175747x;
                                                                            kotlin.jvm.internal.o.d(i1Var6);
                                                                            bp4.o4.A(o4Var, i1Var6, false, j27, 2, null);
                                                                            bp4.k0 multiPreviewPlugin5 = getMultiPreviewPlugin();
                                                                            yo4.p pVar6 = this.f175855w;
                                                                            if (pVar6 == null) {
                                                                                kotlin.jvm.internal.o.o("addMusicPlugin");
                                                                                throw null;
                                                                            }
                                                                            multiPreviewPlugin5.I(pVar6.B());
                                                                            p2Var.B();
                                                                        }
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 108:
                                                                    B();
                                                                    boolean z28 = !u0Var.s();
                                                                    fp4.s sVar = this.R;
                                                                    sVar.z().setEnableLengthEdit(z28);
                                                                    zu3.a aVar4 = jVar.f274413g;
                                                                    sVar.f265385t = aVar4;
                                                                    if (aVar4 != null && (dVar = aVar4.f475760c) != null) {
                                                                        getMultiPreviewPlugin().N(dVar.c(), dVar.b());
                                                                    }
                                                                    sVar.A(u0Var.f175743t);
                                                                    J(this, false, false, 0L, 7, null);
                                                                    c0Var = status;
                                                                    break;
                                                                case 109:
                                                                    M();
                                                                    zu3.a aVar5 = jVar.f274413g;
                                                                    zu3.y yVar2 = aVar5 instanceof zu3.y ? (zu3.y) aVar5 : null;
                                                                    if (yVar2 != null) {
                                                                        so4.g gVar = so4.g.f410776a;
                                                                        com.tencent.mm.xeffect.effect.EffectManager effectManager = so4.g.f410781f;
                                                                        kotlin.jvm.internal.o.d(effectManager);
                                                                        uq5.y l17 = effectManager.l(yVar2.f475866h);
                                                                        if (l17 != null) {
                                                                            l17.b(yVar2.f475760c.c(), yVar2.f475760c.b());
                                                                        }
                                                                    }
                                                                    jVar.N(false);
                                                                    if (bundle != null) {
                                                                        J(this, true, false, bundle.getLong("PARAM_1_LONG"), 2, null);
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 110:
                                                                    bp4.k0 multiPreviewPlugin6 = getMultiPreviewPlugin();
                                                                    com.tencent.mm.plugin.vlog.model.i1 i1Var7 = (com.tencent.mm.plugin.vlog.model.i1) kz5.n0.a0(u0Var.f175743t.f175597c, aVar3.f282942f);
                                                                    multiPreviewPlugin6.E = i1Var7 != null ? i1Var7.f175627l.f397502d : 0L;
                                                                    u0Var.j(aVar3.f282942f);
                                                                    com.tencent.mm.plugin.vlog.model.i1 i1Var8 = u0Var.f175747x;
                                                                    kotlin.jvm.internal.o.d(i1Var8);
                                                                    this.W.z(i1Var8.f175627l.f397506h);
                                                                    this.W.f23437f.setShow(true);
                                                                    c0Var = status;
                                                                    break;
                                                                case 111:
                                                                    if (bundle != null) {
                                                                        long j28 = bundle.getLong("EDIT_CROP_VLOG_LENGTH_START_TIME_LONG");
                                                                        long j29 = bundle.getLong("EDIT_CROP_VLOG_LENGTH_END_TIME_LONG");
                                                                        long j37 = bundle.getLong("EDIT_CROP_VLOG_SEEKTIME_LONG");
                                                                        if (bundle.getBoolean("EDIT_CROP_VLOG_ON_UP_BOOLEAN")) {
                                                                            J(this, true, true, 0L, 4, null);
                                                                        } else {
                                                                            C();
                                                                            getMultiPreviewPlugin().M(j37);
                                                                        }
                                                                        getMultiPreviewPlugin().N(j28, j29);
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 112:
                                                                    if (bundle != null && (emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) bundle.getParcelable("PARAM_EDIT_EMOJI_INFO")) != null) {
                                                                        gp4.j jVar5 = this.f175850r;
                                                                        zu3.j jVar6 = new zu3.j(emojiInfo, null, null, 6, null);
                                                                        jVar6.f475762e = this.E;
                                                                        gp4.j.B(jVar5, jVar6, u0Var.f175747x, this.D, 0L, 8, null);
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 113:
                                                                    if (bundle != null) {
                                                                        e4Var.setVisibility(4);
                                                                        u0Var.u(bundle.getFloat("EDIT_TRACK_DURATION_SCALE", 1.0f));
                                                                        bp4.k0 multiPreviewPlugin7 = getMultiPreviewPlugin();
                                                                        yo4.p pVar7 = this.f175855w;
                                                                        if (pVar7 == null) {
                                                                            kotlin.jvm.internal.o.o("addMusicPlugin");
                                                                            throw null;
                                                                        }
                                                                        multiPreviewPlugin7.I(pVar7.B());
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 114:
                                                                    if (bundle != null) {
                                                                        u0Var.u(bundle.getFloat("EDIT_TRACK_DURATION_SCALE", 1.0f));
                                                                        M();
                                                                        getMultiPreviewPlugin().E = 0L;
                                                                        getMultiPreviewPlugin().getClass();
                                                                        com.tencent.mm.plugin.vlog.model.i1 i1Var9 = u0Var.f175747x;
                                                                        long j38 = i1Var9 != null ? i1Var9.f175627l.f397502d : 0L;
                                                                        this.H.l(true, (r16 & 2) != 0 ? -1L : 0L, (r16 & 4) == 0 ? 0L : -1L, (r16 & 8) != 0 ? 0 : 0, (r16 & 16) == 0 ? 0 : 0, (r16 & 32) != 0);
                                                                        J(this, true, false, j38, 2, null);
                                                                        I();
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 115:
                                                                    if (bundle != null) {
                                                                        if (bundle.getBoolean("EDIT_FILTER_SHOW")) {
                                                                            B();
                                                                        } else {
                                                                            M();
                                                                        }
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 116:
                                                                    if (bundle != null) {
                                                                        zu3.e eVar = bundle.getInt("PARAM_1_INT") == 0 ? zu3.e.f475801m : zu3.e.f475802n;
                                                                        byte[] byteArray = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                                                        kotlin.jvm.internal.o.d(byteArray);
                                                                        gp4.j.B(this.f175850r, new zu3.d(eVar, byteArray), u0Var.f175747x, this.D, 0L, 8, null);
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 117:
                                                                    if (bundle != null && bundle.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                                                        cp4.r rVar3 = this.f175856x;
                                                                        if (rVar3 == null) {
                                                                            kotlin.jvm.internal.o.o("captionPlugin");
                                                                            throw null;
                                                                        }
                                                                        rVar3.f221074y++;
                                                                        C();
                                                                        int i39 = bundle.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                                                        int i47 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT", 0);
                                                                        java.lang.String string3 = bundle.getString("PARAM_EDIT_TEXT_FONT");
                                                                        yt3.m mVar2 = this.f175853u;
                                                                        if (mVar2 == null) {
                                                                            kotlin.jvm.internal.o.o("addTextPlugin");
                                                                            throw null;
                                                                        }
                                                                        byte[] byteArray2 = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                                                        kotlin.jvm.internal.o.d(byteArray2);
                                                                        mVar2.B(byteArray2, i39, i47, string3);
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 118:
                                                                    if (bundle != null && bundle.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                                                        C();
                                                                        B();
                                                                        cp4.r rVar4 = this.f175856x;
                                                                        if (rVar4 == null) {
                                                                            kotlin.jvm.internal.o.o("captionPlugin");
                                                                            throw null;
                                                                        }
                                                                        byte[] byteArray3 = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                                                        kotlin.jvm.internal.o.d(byteArray3);
                                                                        rVar4.H(byteArray3);
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 119:
                                                                    if (bundle != null) {
                                                                        if (bundle.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                                                            int i48 = bundle.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                                                            int i49 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT", 0);
                                                                            java.lang.String string4 = bundle.getString("PARAM_EDIT_TEXT_FONT");
                                                                            cp4.r rVar5 = this.f175856x;
                                                                            if (rVar5 == null) {
                                                                                kotlin.jvm.internal.o.o("captionPlugin");
                                                                                throw null;
                                                                            }
                                                                            byte[] byteArray4 = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                                                            kotlin.jvm.internal.o.d(byteArray4);
                                                                            rVar5.J(byteArray4, i48, i49, string4);
                                                                        }
                                                                        if (bundle.getLong("PARAM_1_LONG", -1L) >= 0) {
                                                                            J(this, false, false, bundle.getLong("PARAM_1_LONG"), 3, null);
                                                                        }
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 120:
                                                                    if (bundle != null) {
                                                                        zu3.e eVar2 = bundle.getInt("PARAM_1_INT") == 1 ? zu3.e.f475802n : zu3.e.f475801m;
                                                                        jVar.getClass();
                                                                        jVar.f274412f.m(eVar2);
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                case 121:
                                                                    J(this, false, false, 0L, 7, null);
                                                                    jVar.f274412f.s();
                                                                    c0Var = status;
                                                                    break;
                                                                case 122:
                                                                    this.P1 = yo4.q.f464300d;
                                                                    M();
                                                                    if (!u0Var.f175734h || this.G1) {
                                                                        com.tencent.mm.plugin.vlog.model.h1 h1Var4 = u0Var.f175743t;
                                                                        getMultiPreviewPlugin().N(h1Var4.j(), h1Var4.h());
                                                                        if (p2Var.f23341m) {
                                                                            o1Var = o1Var2;
                                                                            aVar = aVar3;
                                                                            J(this, false, false, 0L, 7, null);
                                                                        } else {
                                                                            o1Var = o1Var2;
                                                                            aVar = aVar3;
                                                                        }
                                                                        u0Var.f175747x = null;
                                                                        this.N.z(-1, 0L, 0L);
                                                                        o1Var.f23310i = -1;
                                                                        o1Var.setVisibility(8);
                                                                        aVar.f282942f = -1;
                                                                    }
                                                                    c0Var = status;
                                                                    break;
                                                                default:
                                                                    switch (ordinal) {
                                                                        case 130:
                                                                            if (bundle != null && (string = bundle.getString("EDIT_PAG_STICKER_PATH")) != null) {
                                                                                so4.g gVar2 = so4.g.f410776a;
                                                                                com.tencent.mm.xeffect.effect.EffectManager effectManager2 = so4.g.f410781f;
                                                                                if (effectManager2 != null) {
                                                                                    uq5.k kVar = uq5.k.PAGTextEffect;
                                                                                    android.content.res.AssetManager assets = getContext().getAssets();
                                                                                    kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                                                                                    yVar = effectManager2.h(kVar, assets, string);
                                                                                } else {
                                                                                    yVar = null;
                                                                                }
                                                                                com.tencent.mm.xeffect.effect.EffectManager effectManager3 = so4.g.f410781f;
                                                                                if (effectManager3 != null) {
                                                                                    effectManager3.c(yVar);
                                                                                }
                                                                                long a17 = yVar != null ? yVar.a() : 0L;
                                                                                android.util.Size size = new android.util.Size(0, 0);
                                                                                java.lang.String string5 = getContext().getString(com.tencent.mm.R.string.btk);
                                                                                kotlin.jvm.internal.o.f(string5, "getString(...)");
                                                                                zu3.y yVar3 = new zu3.y(string, null, 2, null);
                                                                                yVar3.k(a17);
                                                                                yVar3.n(string5);
                                                                                yVar3.h(this.E);
                                                                                yVar3.o(size.getWidth());
                                                                                yVar3.l(size.getHeight());
                                                                                yVar3.i().set(getMultiPreviewPlugin().E());
                                                                                float b17 = i65.a.b(getContext(), 160);
                                                                                yVar3.m(java.lang.Math.min(java.lang.Math.min(b17 / size.getWidth(), b17 / size.getHeight()), 1.0f));
                                                                                yVar3.j(new yo4.r0(a17, yVar3, this));
                                                                                gp4.j.B(this.f175850r, yVar3, u0Var.d(), this.D, 0L, 8, null);
                                                                            }
                                                                            c0Var = status;
                                                                            break;
                                                                        case 131:
                                                                            if (bundle != null) {
                                                                                C();
                                                                                B();
                                                                                java.lang.CharSequence charSequence2 = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                                                                                java.lang.String str3 = (charSequence2 == null || (obj = charSequence2.toString()) == null) ? "" : obj;
                                                                                bp4.z2 z2Var = this.f175857x0;
                                                                                z2Var.getClass();
                                                                                com.tencent.mm.plugin.vlog.ui.widget.PagInputView pagInputView = z2Var.f23436f;
                                                                                pagInputView.setup(str3);
                                                                                pagInputView.setShow(true);
                                                                            }
                                                                            c0Var = status;
                                                                            break;
                                                                        case 132:
                                                                            if (bundle != null) {
                                                                                java.lang.String string6 = bundle.getString("EDIT_PAG_CHANGE_TEXT");
                                                                                java.lang.String str4 = string6 == null ? "" : string6;
                                                                                zu3.a aVar6 = jVar.f274413g;
                                                                                zu3.y yVar4 = aVar6 instanceof zu3.y ? (zu3.y) aVar6 : null;
                                                                                if (yVar4 != null) {
                                                                                    yVar4.f475867i = str4;
                                                                                    so4.g gVar3 = so4.g.f410776a;
                                                                                    com.tencent.mm.xeffect.effect.EffectManager effectManager4 = so4.g.f410781f;
                                                                                    kotlin.jvm.internal.o.d(effectManager4);
                                                                                    effectManager4.l(yVar4.f475866h);
                                                                                }
                                                                                J(this, false, false, 0L, 7, null);
                                                                            }
                                                                            c0Var = status;
                                                                            break;
                                                                        default:
                                                                            switch (ordinal) {
                                                                                case 135:
                                                                                    break;
                                                                                case 136:
                                                                                    M();
                                                                                    c0Var = status;
                                                                                    break;
                                                                                case 137:
                                                                                    zu3.a aVar7 = jVar.f274413g;
                                                                                    if (aVar7 != null) {
                                                                                        C();
                                                                                        this.C.B(aVar7);
                                                                                    }
                                                                                    c0Var = status;
                                                                                    break;
                                                                                case 138:
                                                                                    if (bundle != null) {
                                                                                        long j39 = bundle.getLong("PARAM_1_LONG");
                                                                                        zu3.a aVar8 = jVar.f274413g;
                                                                                        zu3.y yVar5 = aVar8 instanceof zu3.y ? (zu3.y) aVar8 : null;
                                                                                        if (yVar5 != null) {
                                                                                            so4.g gVar4 = so4.g.f410776a;
                                                                                            com.tencent.mm.xeffect.effect.EffectManager effectManager5 = so4.g.f410781f;
                                                                                            kotlin.jvm.internal.o.d(effectManager5);
                                                                                            uq5.y l18 = effectManager5.l(yVar5.f475866h);
                                                                                            if (l18 != null) {
                                                                                                l18.b(yVar5.d().c(), yVar5.d().b());
                                                                                            }
                                                                                        }
                                                                                        jVar.P();
                                                                                        jVar.N(false);
                                                                                        J(this, true, false, j39, 2, null);
                                                                                    }
                                                                                    c0Var = status;
                                                                                    break;
                                                                                case 139:
                                                                                    jVar.N(false);
                                                                                    J(this, false, false, 0L, 7, null);
                                                                                    c0Var = status;
                                                                                    break;
                                                                                case 140:
                                                                                    jVar.P();
                                                                                    jVar.N(false);
                                                                                    J(this, true, true, 0L, 4, null);
                                                                                    c0Var = status;
                                                                                    break;
                                                                                case 141:
                                                                                    this.f175842l1.z();
                                                                                    setupTemplateVideoPlugins(null);
                                                                                    c0Var = status;
                                                                                    break;
                                                                                case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                                                                                    if (u0Var.f175734h) {
                                                                                        setupImageEditPlugins(false);
                                                                                        jVar.D(false);
                                                                                    } else {
                                                                                        K();
                                                                                    }
                                                                                    c0Var = status;
                                                                                    break;
                                                                                case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                                                                                    this.f175842l1.z();
                                                                                    setupTemplateVideoPlugins(null);
                                                                                    c0Var = status;
                                                                                    break;
                                                                                case 144:
                                                                                    boolean z29 = bundle != null ? bundle.getBoolean("PARAM_1_BOOLEAN", false) : false;
                                                                                    this.R1 = z29;
                                                                                    so4.g.f410776a.f(u0Var.f175743t, z29);
                                                                                    if (z29) {
                                                                                        getMultiPreviewPlugin().P();
                                                                                    }
                                                                                    if (u0Var.f175734h && !this.G1) {
                                                                                        xVar.A(xVar.z());
                                                                                    }
                                                                                    getMultiPreviewPlugin().B();
                                                                                    c0Var = status;
                                                                                    break;
                                                                                case 145:
                                                                                    yo4.p pVar8 = this.f175855w;
                                                                                    if (pVar8 == null) {
                                                                                        kotlin.jvm.internal.o.o("addMusicPlugin");
                                                                                        throw null;
                                                                                    }
                                                                                    pVar8.L();
                                                                                    c0Var = status;
                                                                                    break;
                                                                                default:
                                                                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unknown key ");
                                                                                    c0Var = status;
                                                                                    sb6.append(c0Var);
                                                                                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", sb6.toString());
                                                                                    break;
                                                                            }
                                                                        case 133:
                                                                            B();
                                                                            c0Var = status;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                        } else {
                            c0Var = status;
                            B();
                            if (u0Var.f175733g.size() == 1) {
                                u0Var.j(0);
                                bp4.o4 o4Var2 = this.P;
                                com.tencent.mm.plugin.vlog.model.i1 i1Var10 = u0Var.f175747x;
                                kotlin.jvm.internal.o.d(i1Var10);
                                bp4.o4.A(o4Var2, i1Var10, false, 0L, 6, null);
                            } else {
                                u0Var.j(-1);
                                com.tencent.mm.plugin.vlog.model.h1 h1Var5 = u0Var.f175743t;
                                nVar.A(h1Var5);
                                u0Var.a(h1Var5, false);
                                nVar.D(u0Var.f175743t, this.f175843m);
                            }
                            bp4.k0 multiPreviewPlugin8 = getMultiPreviewPlugin();
                            yo4.p pVar9 = this.f175855w;
                            if (pVar9 == null) {
                                kotlin.jvm.internal.o.o("addMusicPlugin");
                                throw null;
                            }
                            multiPreviewPlugin8.I(pVar9.B());
                            p2Var.B();
                        }
                    } else {
                        c0Var = status;
                        java.lang.String str5 = "";
                        if (bundle != null) {
                            boolean z37 = bundle.getBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN");
                            com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo lyricsInfo = (com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo) bundle.getParcelable("EDIT_SELECT_MUSIC_LYRICS_LIST");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            if (lyricsInfo != null) {
                                java.util.Iterator it = lyricsInfo.f155730d.iterator();
                                while (it.hasNext()) {
                                    byte[] bArr = (byte[]) it.next();
                                    r45.ge4 ge4Var = new r45.ge4();
                                    if (bArr != null) {
                                        try {
                                            ge4Var.parseFrom(bArr);
                                        } catch (java.lang.Exception e17) {
                                            str = str5;
                                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", str, e17);
                                        }
                                    }
                                    str = str5;
                                    arrayList.add(ge4Var);
                                    str5 = str;
                                }
                            }
                            if (z37) {
                                yo4.p pVar10 = this.f175855w;
                                if (pVar10 == null) {
                                    kotlin.jvm.internal.o.o("addMusicPlugin");
                                    throw null;
                                }
                                zu3.t tVar = new zu3.t(arrayList, pVar10.f464287r != null ? r0.f155720q : 0L);
                                cw3.j jVar7 = cw3.j.f224168g;
                                jVar.getClass();
                                jVar.f274412f.p(jVar7);
                                gp4.j.B(this.f175850r, tVar, null, null, 0L, 12, null);
                            } else {
                                cw3.j jVar8 = cw3.j.f224168g;
                                jVar.getClass();
                                jVar.f274412f.p(jVar8);
                            }
                        }
                    }
                } else {
                    c0Var = status;
                    this.I1 = true;
                    B();
                    xVar.setVisibility(4);
                }
            } else {
                c0Var = status;
                if (bundle != null) {
                    int i57 = bundle.getInt("PARAM_1_INT");
                    bp4.p4 p4Var = this.f175858x1;
                    bp4.x2 x2Var = this.f175848p1;
                    if (i57 == 1) {
                        x2Var.setVisibility(0);
                        p4Var.getClass();
                        getMultiPreviewPlugin().F();
                        c2Var.B(true);
                        c2Var.f23134z = false;
                    } else if (i57 == 2) {
                        x2Var.setVisibility(4);
                        p4Var.getClass();
                        getMultiPreviewPlugin().G();
                        H(true);
                    } else if (i57 == 3) {
                        c2Var.B(false);
                        c2Var.f23134z = false;
                    } else if (i57 == 4) {
                        c2Var.B(false);
                        c2Var.f23134z = true;
                    }
                }
            }
        } else {
            c0Var = status;
            if (bundle != null) {
                C();
                java.lang.CharSequence charSequence3 = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                int i58 = bundle.getInt("PARAM_EDIT_TEXT_COLOR");
                int i59 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                java.lang.String string7 = bundle.getString("PARAM_EDIT_TEXT_FONT");
                yt3.m mVar3 = this.f175853u;
                if (mVar3 == null) {
                    kotlin.jvm.internal.o.o("addTextPlugin");
                    throw null;
                }
                mVar3.z(charSequence3, i58, i59, string7);
            }
        }
        op4.l lVar = (op4.l) j(op4.l.class);
        if (lVar != null) {
            lVar.w(c0Var, bundle);
        }
    }

    public final void y(com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct) {
        yo4.p pVar = this.f175855w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = pVar.f464287r;
        if (audioCacheInfo != null) {
            multiMediaEditResultStruct.f59340u = audioCacheInfo.f155719p;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = audioCacheInfo.f155728y;
            if (finderObject != null) {
                multiMediaEditResultStruct.f59339t = multiMediaEditResultStruct.b("MusicFeedid", com.tencent.mm.sdk.platformtools.t8.r0(finderObject.getId()), true);
            } else {
                multiMediaEditResultStruct.f59338s = audioCacheInfo.f155711e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0107, code lost:
    
        if (r4 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r17, yz5.q r18) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.z(java.lang.String, yz5.q):void");
    }
}
