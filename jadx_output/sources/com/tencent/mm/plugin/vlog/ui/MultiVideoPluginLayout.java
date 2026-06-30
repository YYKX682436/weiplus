package com.tencent.mm.plugin.vlog.ui;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0012\u001a\u00020\u000b8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lju3/d0;", "Lbp4/z;", "Lso4/b;", "template", "Ljz5/f0;", "setupTemplateVideoPlugins", "", "selectFirst", "setupImageEditPlugins", "Lbp4/k0;", "J", "Lbp4/k0;", "getMultiPreviewPlugin", "()Lbp4/k0;", "setMultiPreviewPlugin", "(Lbp4/k0;)V", "multiPreviewPlugin", "Lru3/o;", "F1", "Lru3/o;", "getCurrentStyle", "()Lru3/o;", "setCurrentStyle", "(Lru3/o;)V", "currentStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class MultiVideoPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout implements ju3.d0, bp4.z {
    public static final /* synthetic */ int M1 = 0;
    public final bp4.o3 A;
    public boolean A1;
    public final ep4.j B;
    public boolean B1;
    public java.lang.String C;
    public java.lang.String C1;
    public boolean D;
    public java.lang.String D1;
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider E;
    public final java.util.ArrayList E1;
    public ct0.b F;

    /* renamed from: F1, reason: from kotlin metadata */
    public ru3.o currentStyle;
    public final com.tencent.mm.plugin.vlog.model.u0 G;
    public final nu3.h G1;
    public boolean H;
    public boolean H1;
    public boolean I;
    public yo4.q I1;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public bp4.k0 multiPreviewPlugin;
    public final int J1;
    public final bp4.x K;
    public boolean K1;
    public final bp4.r1 L;
    public long L1;
    public final bp4.e4 M;
    public final bp4.o4 N;
    public final bp4.n P;
    public final fp4.s Q;
    public final dw3.g0 R;
    public final bp4.d1 S;
    public final bp4.m1 T;
    public final bp4.o1 U;
    public final bp4.z3 V;
    public final hp4.a W;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f175865h;

    /* renamed from: i, reason: collision with root package name */
    public it3.y f175866i;

    /* renamed from: l1, reason: collision with root package name */
    public final bp4.x2 f175867l1;

    /* renamed from: m, reason: collision with root package name */
    public long f175868m;

    /* renamed from: n, reason: collision with root package name */
    public int f175869n;

    /* renamed from: o, reason: collision with root package name */
    public int f175870o;

    /* renamed from: p, reason: collision with root package name */
    public int f175871p;

    /* renamed from: p0, reason: collision with root package name */
    public final bp4.z2 f175872p0;

    /* renamed from: p1, reason: collision with root package name */
    public final bp4.p4 f175873p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f175874q;

    /* renamed from: r, reason: collision with root package name */
    public final gp4.j f175875r;

    /* renamed from: s, reason: collision with root package name */
    public final bp4.k2 f175876s;

    /* renamed from: t, reason: collision with root package name */
    public final yt3.i f175877t;

    /* renamed from: u, reason: collision with root package name */
    public final yt3.m f175878u;

    /* renamed from: v, reason: collision with root package name */
    public final yo4.p f175879v;

    /* renamed from: w, reason: collision with root package name */
    public final bp4.b4 f175880w;

    /* renamed from: x, reason: collision with root package name */
    public final yt3.s f175881x;

    /* renamed from: x0, reason: collision with root package name */
    public final bp4.h3 f175882x0;

    /* renamed from: x1, reason: collision with root package name */
    public final bp4.p2 f175883x1;

    /* renamed from: y, reason: collision with root package name */
    public final yt3.q f175884y;

    /* renamed from: y0, reason: collision with root package name */
    public final bp4.f3 f175885y0;

    /* renamed from: y1, reason: collision with root package name */
    public final android.view.View f175886y1;

    /* renamed from: z, reason: collision with root package name */
    public final cp4.r f175887z;

    /* renamed from: z1, reason: collision with root package name */
    public final android.view.View f175888z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiVideoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f175868m = 60000L;
        this.f175869n = 1080;
        this.f175870o = 1080;
        this.f175871p = 90;
        this.f175874q = "";
        this.C = "";
        this.D = true;
        com.tencent.mm.plugin.vlog.model.u0 u0Var = new com.tencent.mm.plugin.vlog.model.u0();
        this.G = u0Var;
        dw3.g0 g0Var = new dw3.g0();
        this.R = g0Var;
        this.C1 = "";
        this.D1 = "";
        this.E1 = new java.util.ArrayList();
        this.currentStyle = ru3.o.f399764e;
        this.G1 = new nu3.h();
        this.I1 = yo4.q.f464300d;
        this.J1 = android.graphics.Color.parseColor("#232323");
        android.app.Activity activity = (android.app.Activity) context;
        if (((android.view.ViewGroup) activity.findViewById(com.tencent.mm.R.id.lpx)).getChildCount() == 0) {
            ((android.view.ViewGroup) activity.getWindow().getDecorView().findViewById(android.R.id.content)).setAlpha(0.0f);
        }
        ou3.q qVar = ou3.q.f348970c;
        qVar.a();
        qVar.j();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "init MultiVideoPluginLayout");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c2x, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f175865h = inflate;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jvq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f175886y1 = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activity.getWindow().setSoftInputMode(48);
        so4.g.f410776a.b(null);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.jup);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.cmy);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setMultiPreviewPlugin(new bp4.k0((com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout) findViewById2, (com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout) findViewById3, this));
        getMultiPreviewPlugin().f23223v = u0Var;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.d7f);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        yt3.i iVar = new yt3.i(this, (android.widget.ImageView) findViewById4, this);
        this.f175877t = iVar;
        com.tencent.mm.plugin.vlog.model.v0.c();
        yo4.s0 s0Var = new yo4.s0(this);
        android.util.SparseArray sparseArray = ir.c0.f293820a;
        to4.d dVar = new to4.d(s0Var);
        android.util.SparseArray sparseArray2 = ir.c0.f293820a;
        int i17 = to4.a.f420989a;
        sparseArray2.put(108, dVar);
        ir.c0.f293821b.put("pag_panel", new to4.b());
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.oyw);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        gp4.j jVar = new gp4.j((com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer) findViewById5, this);
        this.f175875r = jVar;
        getMultiPreviewPlugin().L(jVar.f274412f);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f486311kv5);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        bp4.k2 k2Var = new bp4.k2((android.widget.FrameLayout) findViewById6, this);
        this.f175876s = k2Var;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.bet);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        yt3.t tVar = new yt3.t((com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView) findViewById7, this);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = tVar.f465670f;
        editorInputView.setEnableClickOutsideConfirm(false);
        yt3.m mVar = new yt3.m(this, this, editorInputView);
        this.f175878u = mVar;
        yo4.p pVar = new yo4.p(this, this, false);
        this.f175879v = pVar;
        pVar.A().setBackground(com.tencent.mm.R.drawable.b8v);
        getMultiPreviewPlugin().L(pVar);
        bp4.b4 b4Var = new bp4.b4(this, this);
        this.f175880w = b4Var;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.d8n);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        yt3.s sVar = new yt3.s(findViewById8, this);
        this.f175881x = sVar;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.d7v);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        yt3.q qVar2 = new yt3.q((android.widget.ImageView) findViewById9, this);
        this.f175884y = qVar2;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.f485040gc0);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        bp4.x xVar = new bp4.x((androidx.recyclerview.widget.RecyclerView) findViewById10, this);
        this.K = xVar;
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479653br);
        androidx.recyclerview.widget.RecyclerView recyclerView = xVar.f23416f;
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = h17;
        recyclerView.setLayoutParams(layoutParams2);
        xVar.f23420m = new yo4.t0(this);
        bp4.r1 r1Var = new bp4.r1(this, this);
        this.L = r1Var;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.d7d);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.d7u);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.d7t);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        cp4.r rVar = new cp4.r((android.view.ViewGroup) findViewById11, (com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById12, (com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById13, this);
        this.f175887z = rVar;
        getMultiPreviewPlugin().L(rVar);
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.l4s);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        bp4.o3 o3Var = new bp4.o3((android.widget.ImageView) findViewById14, this);
        this.A = o3Var;
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.f484183d95);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        ep4.j jVar2 = new ep4.j((android.view.ViewGroup) findViewById15, this);
        this.B = jVar2;
        getMultiPreviewPlugin().L(jVar2);
        float f17 = 2;
        float f18 = ((getMultiPreviewPlugin().f23216o.top + getMultiPreviewPlugin().f23216o.bottom) / f17) - (com.tencent.mm.ui.dl.d(context).y / 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ThumbLoadingPlugin", "setTranslateY " + f18);
        o3Var.f23312f.setTranslationY(f18);
        bp4.e4 e4Var = new bp4.e4(this, this);
        this.M = e4Var;
        bp4.n nVar = new bp4.n(this, this);
        this.P = nVar;
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.f484180d91);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        bp4.o4 o4Var = new bp4.o4((com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById16, this);
        this.N = o4Var;
        android.view.View findViewById17 = findViewById(com.tencent.mm.R.id.f484179d90);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        fp4.s sVar2 = new fp4.s((com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById17, this);
        this.Q = sVar2;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder(context);
        addView(editorPanelHolder, -1, -1);
        editorPanelHolder.setVisibility(8);
        bp4.z3 z3Var = new bp4.z3(editorPanelHolder, this);
        this.V = z3Var;
        bp4.d1 d1Var = new bp4.d1(this, this);
        this.S = d1Var;
        bp4.m1 m1Var = new bp4.m1(this, this, u0Var, getMultiPreviewPlugin());
        this.T = m1Var;
        this.U = new bp4.o1(this, this);
        this.W = new hp4.a(this, this, true);
        bp4.z2 z2Var = new bp4.z2(this, this);
        this.f175872p0 = z2Var;
        bp4.p2 p2Var = new bp4.p2(this, this);
        this.f175883x1 = p2Var;
        p2Var.z(jVar);
        p2Var.z(nVar);
        bp4.h3 h3Var = new bp4.h3(this, this);
        this.f175882x0 = h3Var;
        bp4.f3 f3Var = new bp4.f3(this, this);
        this.f175885y0 = f3Var;
        bp4.x2 x2Var = new bp4.x2(this, this);
        this.f175867l1 = x2Var;
        bp4.p4 p4Var = new bp4.p4(this, this);
        this.f175873p1 = p4Var;
        getMultiPreviewPlugin().L(nVar);
        getMultiPreviewPlugin().L(o4Var);
        getMultiPreviewPlugin().L(sVar2);
        getMultiPreviewPlugin().f23211g.setOutsideTouckListener(new yo4.u0(this));
        android.view.View findViewById18 = findViewById(com.tencent.mm.R.id.jvr);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.f175888z1 = findViewById18;
        getPluginList().add(nVar);
        getPluginList().add(o4Var);
        getPluginList().add(sVar2);
        getPluginList().add(iVar);
        getPluginList().add(jVar);
        getPluginList().add(k2Var);
        getPluginList().add(mVar);
        getPluginList().add(pVar);
        getPluginList().add(b4Var);
        getPluginList().add(sVar);
        getPluginList().add(qVar2);
        getPluginList().add(rVar);
        getPluginList().add(e4Var);
        getPluginList().add(getMultiPreviewPlugin());
        getPluginList().add(xVar);
        getPluginList().add(g0Var);
        getPluginList().add(o3Var);
        getPluginList().add(d1Var);
        getPluginList().add(m1Var);
        getPluginList().add(z3Var);
        getPluginList().add(r1Var);
        getPluginList().add(z2Var);
        getPluginList().add(jVar2);
        getPluginList().add(h3Var);
        getPluginList().add(f3Var);
        getPluginList().add(x2Var);
        getPluginList().add(p4Var);
        getPluginList().add(p2Var);
        int i18 = vt3.q.f440038b;
        int i19 = vt3.q.f440037a;
        float f19 = i18;
        float f27 = i19;
        float f28 = f19 / f27;
        float f29 = f19 / 2.18f;
        float f37 = (f27 - f29) / f17;
        float f38 = (f19 - f19) / f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "initSafeArea, displaySize:[" + i19 + ", " + i18 + "], scale:" + f28 + ", safeAreaWidth:" + f29 + ", safeAreaFrameWidth:" + f37 + ", safeAreaHeight:" + f19 + ", safeAreaFrameHeight:" + f38);
        if (f28 <= 1.78f) {
            tVar.A(f29, f37);
            jVar.K(f29, f37);
        } else if (f28 >= 2.18f) {
            tVar.z(f29, f37);
            jVar.J(f19, f38);
        } else {
            tVar.A(f29, f37);
            tVar.z(f29, f37);
            jVar.K(f29, f37);
            jVar.J(f19, f38);
        }
    }

    public static void G(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout, boolean z17, boolean z18, long j17, int i17, java.lang.Object obj) {
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
        if (!multiVideoPluginLayout.G.f175734h || multiVideoPluginLayout.A1) {
            if (z17) {
                multiVideoPluginLayout.C(true, z18, j17);
            } else {
                if (j17 != -1) {
                    multiVideoPluginLayout.getMultiPreviewPlugin().M(j17);
                }
                bp4.k0 multiPreviewPlugin = multiVideoPluginLayout.getMultiPreviewPlugin();
                com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f23214m;
                if (videoCompositionPlayView != null) {
                    videoCompositionPlayView.h();
                }
                com.tencent.mm.plugin.vlog.model.c0 c0Var = multiPreviewPlugin.I;
                c0Var.f175573b = 0L;
                c0Var.f175572a = 0;
                multiPreviewPlugin.f23209J = 0L;
                bp4.c0 c0Var2 = multiVideoPluginLayout.getMultiPreviewPlugin().D;
                if (c0Var2 != null) {
                    c0Var2.resume();
                }
            }
        }
        multiVideoPluginLayout.f175883x1.B();
    }

    private final void setupTemplateVideoPlugins(so4.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "setupTemplateVideoPlugins, template:" + bVar);
        this.f175867l1.setVisibility(4);
        this.f175885y0.setVisibility(0);
        bp4.x xVar = this.K;
        xVar.setVisibility(8);
        this.U.setVisibility(8);
        yo4.p pVar = this.f175879v;
        pVar.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "showTemplateEditPlugins");
        pVar.setVisibility(8);
        this.f175880w.setVisibility(8);
        this.M.setVisibility(8);
        this.S.setVisibility(8);
        this.T.setVisibility(8);
        xVar.setVisibility(8);
        this.L.setVisibility(8);
        this.f175876s.setVisibility(8);
        this.f175887z.setVisibility(8);
        this.f175878u.setVisibility(8);
        this.f175877t.setVisibility(8);
        this.f175873p1.getClass();
        gp4.j jVar = this.f175875r;
        jVar.f274412f.setVisibility(4);
        jVar.O(true);
        boolean z17 = this.A1;
        this.A1 = true;
        setBackgroundColor(this.J1);
        com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout multiEditCropOperationLayout = getMultiPreviewPlugin().f23211g;
        ru3.o oVar = ru3.o.f399766g;
        multiEditCropOperationLayout.setStyle(oVar);
        this.currentStyle = oVar;
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.setVisibility(0);
        }
        this.G.f175741r = this.f175868m;
        android.graphics.RectF rectF = getMultiPreviewPlugin().f23216o;
        rectF.round(lt3.n.f321263d);
        getMultiPreviewPlugin().O(rectF);
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new yo4.j1(this, bVar, z17, null), 2, null);
    }

    public final void A() {
        this.f175882x0.setVisibility(4);
        this.f175873p1.getClass();
        android.view.View view = this.f175886y1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f175888z1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getMultiPreviewPlugin().f23211g.setStyle(ru3.o.f399765f);
        this.K.setVisibility(4);
        if (yo4.v0.f464320a[this.I1.ordinal()] == 1) {
            this.U.setVisibility(4);
            this.W.getClass();
        }
    }

    public final void B() {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.pause();
        }
        this.M.f23160h.recyclerView.f1();
        bp4.c0 c0Var = getMultiPreviewPlugin().D;
        if (c0Var != null) {
            c0Var.pause();
        }
        this.f175883x1.A();
    }

    public final void C(boolean z17, boolean z18, long j17) {
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.G;
        jz5.l f17 = u0Var.f175743t.f();
        u0Var.c(u0Var.f175743t.m(), this.f175875r.f274412f.getAllTTSData());
        java.lang.Number number = (java.lang.Number) f17.f302833d;
        if (number.longValue() != -1) {
            java.lang.Number number2 = (java.lang.Number) f17.f302834e;
            if (number2.longValue() != -1) {
                u0Var.f175743t.s(number.longValue(), java.lang.Math.min(number2.longValue(), u0Var.f175743t.g()));
            }
        }
        getMultiPreviewPlugin().J(this.f175879v.B(), z17, z18, j17);
        bp4.p2 p2Var = this.f175883x1;
        if (z17) {
            p2Var.B();
        } else {
            p2Var.A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout.D():void");
    }

    public final void E(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "reportEdit20741Image, isVideoEnhancementEnable:" + this.K1);
        long j18 = this.B1 ? 1L : 4L;
        uo4.i iVar = new uo4.i();
        java.util.ArrayList E = this.f175875r.E();
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct = iVar.f429709a;
        multiMediaEditResultStruct.f59323d = multiMediaEditResultStruct.b("EditId", this.D1, true);
        iVar.f429709a.f59333n = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(getContext());
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct2 = iVar.f429709a;
        multiMediaEditResultStruct2.f59337r = 2;
        multiMediaEditResultStruct2.f59326g = this.G.f175730d.size();
        iVar.f429709a.f59330k = j18;
        iVar.c(E);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct3 = iVar.f429709a;
        multiMediaEditResultStruct3.f59329j = j17;
        multiMediaEditResultStruct3.f59332m = this.K1 ? 1L : 0L;
        iVar.a();
    }

    public final void F() {
        com.tencent.mm.plugin.vlog.model.i1 i1Var = this.G.f175747x;
        if (i1Var != null) {
            bp4.e4 e4Var = this.M;
            int i17 = this.U.f23310i;
            rm5.j jVar = i1Var.f175627l;
            e4Var.z(i17, jVar.f397502d, jVar.f397503e);
            getMultiPreviewPlugin().N(jVar.f397502d, jVar.f397503e);
            getMultiPreviewPlugin().M(jVar.f397502d);
        }
    }

    public final void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "setupNormalVideoPlugins");
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.G;
        u0Var.y();
        getMultiPreviewPlugin().O(u0Var.f175739p);
        this.f175867l1.setVisibility(0);
        this.f175885y0.setVisibility(8);
        K();
        gp4.j jVar = this.f175875r;
        jVar.f274412f.setVisibility(0);
        jVar.O(true);
        this.M.f23160h.D = false;
        this.A1 = false;
        u0Var.f175741r = this.f175868m;
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new yo4.i1(this, null), 2, null);
    }

    public final void I() {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "showImageEditPlugins");
        this.K.setVisibility(0);
        this.L.setVisibility(0);
        this.f175876s.setVisibility(0);
        ct0.b bVar = this.F;
        if (bVar != null && (arrayList = bVar.f222214k) != null) {
            arrayList.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.E1.get(0)).f138430e);
        }
        this.f175880w.setVisibility(8);
        this.M.setVisibility(8);
        this.S.setVisibility(8);
        this.T.setVisibility(8);
        this.f175887z.setVisibility(8);
        this.f175878u.setVisibility(0);
        this.f175877t.setVisibility(0);
        this.f175873p1.getClass();
        boolean b17 = com.tencent.mm.plugin.vlog.model.v0.b();
        yo4.p pVar = this.f175879v;
        if (!b17 || this.I) {
            pVar.setVisibility(8);
        } else {
            pVar.setVisibility(0);
        }
    }

    public final void J() {
        android.view.View view = this.f175888z1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!this.A1) {
            this.f175873p1.getClass();
        }
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.G;
        if (u0Var.f175734h && !this.A1) {
            this.K.setVisibility(0);
        }
        getMultiPreviewPlugin().f23211g.setStyle(this.currentStyle);
        boolean z17 = u0Var.f175734h;
        bp4.e4 e4Var = this.M;
        if (!z17) {
            e4Var.setVisibility(0);
        } else if (com.tencent.mm.plugin.vlog.model.v0.b() && !this.I) {
            this.f175879v.setVisibility(0);
        }
        if (yo4.v0.f464320a[this.I1.ordinal()] == 1) {
            this.U.setVisibility(0);
            e4Var.setVisibility(0);
            return;
        }
        android.view.View view2 = this.f175886y1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "showVideoEditPlugins");
        this.f175879v.setVisibility(0);
        this.f175880w.setVisibility(0);
        this.M.setVisibility(0);
        this.S.setVisibility(0);
        this.T.setVisibility(0);
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        this.f175876s.setVisibility(8);
        this.f175887z.setVisibility(0);
        this.f175878u.setVisibility(0);
        this.f175877t.setVisibility(0);
        this.f175873p1.getClass();
    }

    public final void L() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        android.os.Bundle bundle4;
        android.os.Bundle bundle5;
        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markPressEditFinish");
        if (com.tencent.mm.plugin.vlog.model.b0.f175555i <= 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.vlog.model.b0.f175555i = android.os.SystemClock.elapsedRealtime();
        }
        this.A.A(com.tencent.mm.R.string.k8s, false);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.E;
        kotlin.jvm.internal.o.d(recordConfigProvider);
        java.lang.String str = recordConfigProvider.B;
        this.G1.f340217a.f59316t = 2L;
        D();
        xo4.b.a(xo4.b.f455768a, 101, 1, java.lang.System.currentTimeMillis() - this.L1, 1, null, null, null, 112, null);
        yo4.m1 m1Var = new yo4.m1(this, str);
        ut3.f fVar = ut3.f.f431176c;
        fVar.e(0);
        yo4.p pVar = this.f175879v;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = pVar.f464287r;
        android.os.Bundle bundle6 = fVar.f431178b;
        if (audioCacheInfo != null) {
            if (audioCacheInfo.f155722s) {
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.E;
                bundle6.putString("ORIGIN_MUSIC_ID", (recordConfigProvider2 == null || (bundle5 = recordConfigProvider2.M) == null) ? null : bundle5.getString("KEY_ORIGIN_MUSIC_ID"));
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.E;
                bundle6.putString("ORIGIN_MUSIC_PATH", (recordConfigProvider3 == null || (bundle4 = recordConfigProvider3.M) == null) ? null : bundle4.getString("KEY_ORIGIN_MUSIC_PATH"));
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.E;
                bundle6.putByteArray("ORIGIN_MUSIC_INFO", (recordConfigProvider4 == null || (bundle3 = recordConfigProvider4.M) == null) ? null : bundle3.getByteArray("KEY_ORIGIN_MUSIC_INFO"));
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = this.E;
                fVar.e((recordConfigProvider5 == null || (bundle2 = recordConfigProvider5.M) == null) ? false : bundle2.getBoolean("KEY_BGM_IF_ORIGIN") ? 1 : 2);
            } else {
                bundle6.putByteArray("MEDIA_EXTRA_MUSIC", audioCacheInfo.f155710d.toByteArray());
                fVar.e(audioCacheInfo.f155719p);
            }
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider6 = this.E;
        bundle6.putString("ORIGIN_BGM_URL", (recordConfigProvider6 == null || (bundle = recordConfigProvider6.M) == null) ? null : bundle.getString("KEY_ORIGIN_BGM_URL"));
        bundle6.putBoolean("MEDIA_IS_MUTE", pVar.B() || this.H);
        bundle6.putBoolean("MUSIC_IS_MUTE", !pVar.A().getWithMusic());
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.G;
        if (u0Var.f175734h) {
            if (!(this.f175882x0.f23190h.getSelectedTabPosition() == 1)) {
                e60.g1 g1Var = new e60.g1();
                g1Var.a(this.f175874q);
                g1Var.f249700d = this.f175870o;
                g1Var.f249701e = this.f175869n;
                g1Var.f249702f = 100;
                z23.f fVar2 = new z23.f(g1Var);
                java.lang.String[] strArr = new java.lang.String[u0Var.f175730d.size()];
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                nu3.i iVar = nu3.i.f340218a;
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, str, "", 0L, bool, iVar.l());
                fVar.d(true, iVar.l());
                E(1L);
                z(fVar2, strArr, captureDataManager$CaptureVideoNormalModel, 0);
                return;
            }
        }
        B();
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = pVar.f464287r;
        if (audioCacheInfo2 != null) {
            wt3.c1.f449387b.c(audioCacheInfo2, new yo4.k1(this, m1Var));
        } else {
            y(null, m1Var);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(it3.y r8, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout.m(it3.y, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1024 && i18 == -1) {
            getMultiPreviewPlugin().B();
            com.tencent.mm.plugin.vlog.model.u0 u0Var = this.G;
            if (u0Var.f175734h) {
                so4.g.f410776a.d(u0Var.f175730d);
                bp4.x xVar = this.K;
                xVar.A(xVar.z());
            }
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        if (!super.onBackPress()) {
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f23214m;
            if (videoCompositionPlayView != null) {
                videoCompositionPlayView.stop();
            }
            it3.y yVar = this.f175866i;
            if (yVar != null) {
                it3.y.a(yVar, 0, null, 2, null);
            }
        }
        xo4.b.a(xo4.b.f455768a, 101, 1, java.lang.System.currentTimeMillis() - this.L1, 0, null, null, null, 112, null);
        this.G1.f340217a.f59316t = 1L;
        D();
        if (this.G.f175734h) {
            if (!(this.f175882x0.f23190h.getSelectedTabPosition() == 1)) {
                E(0L);
                ut3.f.f431176c.d(false, nu3.i.f340218a.l());
                return true;
            }
        }
        pm0.v.L("MultiVideoPluginLayout_report", true, new yo4.e1(this, 0L));
        ut3.f.f431176c.d(false, nu3.i.f340218a.l());
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onDetach() {
        super.onDetach();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "onDetach");
        bp4.k0 multiPreviewPlugin = getMultiPreviewPlugin();
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.g();
            multiPreviewPlugin.f23214m = null;
        }
        android.view.View view = this.f175865h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        so4.g.f410776a.c();
        this.f175873p1.f23350o.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CompositionLabelRetriever", "cancel get label");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        android.os.Bundle bundle;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "loadCurrentPage time:" + java.lang.System.currentTimeMillis() + " model:" + bVar);
        this.L1 = java.lang.System.currentTimeMillis();
        xo4.b.a(xo4.b.f455768a, 101, 0, 0L, 0, null, null, null, 124, null);
        super.r(bVar);
        dw3.g0 g0Var = this.R;
        g0Var.getClass();
        g0Var.f244210d.put("start", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        this.F = bVar;
        java.util.ArrayList arrayList = this.E1;
        arrayList.clear();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.E;
        if (recordConfigProvider != null && (bundle = recordConfigProvider.M) != null) {
            bundle.setClassLoader(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.class.getClassLoader());
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("media_list");
            if (parcelableArrayList != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "loadMediaList:" + parcelableArrayList);
                arrayList.addAll(parcelableArrayList);
            }
            this.I = bundle.getBoolean("KEY_DISABLE_IMAGE_ADD_MUSIC", false);
            bundle.getBoolean("KEY_DISABLE_VIDEO_ENHANCEMENT", false);
            this.f175873p1.f23346h.setVisibility(8);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "loadMediaList isAllImage:" + z17);
            bp4.x2 x2Var = this.f175867l1;
            gp4.j jVar = this.f175875r;
            if (z17) {
                this.K.B(arrayList);
                I();
                jVar.D(false);
                jVar.O(true);
                x2Var.f23425h = x2Var.f23423f;
            } else {
                K();
                jVar.O(true);
                x2Var.z();
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.X(arrayList);
            A();
            bp4.o3.B(this.A, galleryItem$MediaItem, 0, false, 6, null);
        }
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new yo4.g1(this, null), 2, null);
        if (bVar != null) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.E;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            bp4.k2 k2Var = this.f175876s;
            k2Var.getClass();
            k2Var.f23231h = recordConfigProvider2;
            k2Var.f23232i = bVar;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        nu3.i.f340218a.n("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(currentTimeMillis));
        java.lang.String str = gm0.j1.b().j() + '_' + currentTimeMillis;
        this.D1 = str;
        this.f175879v.I(str);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = this.G1.f340217a;
        multiMediaEditInfoStruct.f59301e = multiMediaEditInfoStruct.b("EditId", this.D1, true);
        this.M.f23160h.setScrollCount(0);
        getMultiPreviewPlugin().f23224w = 0;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void release() {
        super.release();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "release");
        this.G.dead();
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_edit_image_auto_add_music, 1) == 1 && com.tencent.mm.plugin.vlog.model.v0.b()) != false) goto L24;
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
            java.lang.String r1 = "MicroMsg.MultiVideoPluginLayout"
            com.tencent.mars.xlog.Log.i(r1, r0)
            com.tencent.mm.plugin.vlog.model.u0 r0 = r11.G
            r0.y()
            bp4.x2 r1 = r11.f175867l1
            r2 = 0
            r1.setVisibility(r2)
            bp4.f3 r1 = r11.f175885y0
            r3 = 8
            r1.setVisibility(r3)
            bp4.k0 r1 = r11.getMultiPreviewPlugin()
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r1 = r1.f23214m
            if (r1 == 0) goto L31
            r1.stop()
        L31:
            bp4.k0 r1 = r11.getMultiPreviewPlugin()
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r1 = r1.f23214m
            if (r1 != 0) goto L3a
            goto L3d
        L3a:
            r1.setVisibility(r3)
        L3d:
            gp4.j r1 = r11.f175875r
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r1 = r1.f274412f
            r1.setVisibility(r2)
            r11.A1 = r2
            bp4.k0 r1 = r11.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout r1 = r1.f23211g
            ru3.o r3 = ru3.o.f399764e
            r1.setStyle(r3)
            r11.currentStyle = r3
            r11.I()
            boolean r1 = com.tencent.mm.plugin.vlog.model.v0.b()
            if (r1 == 0) goto Laa
            boolean r1 = r11.I
            if (r1 != 0) goto Laa
            yo4.p r3 = r11.f175879v
            ct0.b r4 = r11.F
            kotlin.jvm.internal.o.d(r4)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = r11.E
            r6 = 0
            boolean r7 = r11.H
            boolean r8 = r0.f175734h
            r9 = 4
            r10 = 0
            yo4.p.K(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r1 = i95.n0.c(r0)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r3 = e42.d0.clicfg_finder_edit_image_auto_add_music_panel
            h62.d r1 = (h62.d) r1
            int r1 = r1.Ni(r3, r2)
            r3 = 1
            if (r1 != r3) goto La2
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_finder_edit_image_auto_add_music
            h62.d r0 = (h62.d) r0
            int r0 = r0.Ni(r1, r3)
            if (r0 != r3) goto L9e
            boolean r0 = com.tencent.mm.plugin.vlog.model.v0.b()
            if (r0 == 0) goto L9e
            r0 = r3
            goto L9f
        L9e:
            r0 = r2
        L9f:
            if (r0 == 0) goto La2
            goto La3
        La2:
            r3 = r2
        La3:
            if (r3 == 0) goto Laa
            yo4.p r0 = r11.f175879v
            r0.L()
        Laa:
            bp4.x r0 = r11.K
            if (r12 == 0) goto Laf
            goto Lb3
        Laf:
            int r2 = r0.z()
        Lb3:
            r0.A(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout.setupImageEditPlugins(boolean):void");
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        int i17;
        bv3.d dVar;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo;
        bp4.o1 o1Var;
        hp4.a aVar;
        java.lang.String string;
        uq5.y yVar;
        java.lang.String str;
        kotlin.jvm.internal.o.g(status, "status");
        ju3.c0 c0Var = ju3.c0.f301871d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "statusChange " + status + "  param:" + bundle);
        int ordinal = status.ordinal();
        if (ordinal == 20) {
            if (bundle != null) {
                bundle.getInt("EDIT_FILTER_INDEX_INT", -1);
                bundle.getFloat("EDIT_FILTER_COLOR_WEIGHT_FLOAT", 0.0f);
                bundle.getString("EDIT_FILTER_COLOR_PATH_STRING");
                com.tencent.mm.plugin.vlog.model.h1 h1Var = getMultiPreviewPlugin().f23215n;
                return;
            }
            return;
        }
        if (ordinal == 32) {
            onBackPress();
            return;
        }
        yt3.m mVar = this.f175878u;
        if (ordinal == 45) {
            if (bundle != null) {
                B();
                mVar.z(bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT"), bundle.getInt("PARAM_EDIT_TEXT_COLOR"), bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT"), bundle.getString("PARAM_EDIT_TEXT_FONT"));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.G;
        bp4.n nVar = this.P;
        bp4.p2 p2Var = this.f175883x1;
        yo4.p pVar = this.f175879v;
        if (ordinal == 56) {
            A();
            if (u0Var.f175733g.size() == 1) {
                u0Var.j(0);
                bp4.o4 o4Var = this.N;
                com.tencent.mm.plugin.vlog.model.i1 i1Var = u0Var.f175747x;
                kotlin.jvm.internal.o.d(i1Var);
                bp4.o4.A(o4Var, i1Var, false, 0L, 6, null);
            } else {
                u0Var.j(-1);
                com.tencent.mm.plugin.vlog.model.h1 h1Var2 = u0Var.f175743t;
                nVar.A(h1Var2);
                u0Var.a(h1Var2, false);
                nVar.D(u0Var.f175743t, this.f175868m);
            }
            getMultiPreviewPlugin().I(pVar.B());
            p2Var.B();
            return;
        }
        bp4.x xVar = this.K;
        if (ordinal == 75) {
            A();
            xVar.setVisibility(4);
            return;
        }
        bp4.e4 e4Var = this.M;
        if (ordinal == 48) {
            A();
            e4Var.setVisibility(4);
            return;
        }
        if (ordinal != 49) {
            gp4.j jVar = this.f175875r;
            switch (ordinal) {
                case 35:
                case 36:
                case 37:
                    if (status == ju3.c0.F) {
                        B();
                    }
                    A();
                    return;
                case 38:
                    if (bundle != null) {
                        getMultiPreviewPlugin().M(bundle.getInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT"));
                        return;
                    }
                    return;
                case 39:
                    this.f175877t.B();
                    return;
                case 40:
                    if (bundle != null) {
                        zu3.a aVar2 = jVar.f274413g;
                        java.lang.CharSequence charSequence = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                        int i18 = bundle.getInt("PARAM_EDIT_TEXT_COLOR");
                        int i19 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                        java.lang.String string2 = bundle.getString("PARAM_EDIT_TEXT_FONT");
                        kotlin.jvm.internal.o.d(string2);
                        zu3.a0 a0Var = new zu3.a0(charSequence, i18, i19, string2, 0, null, 48, null);
                        a0Var.f475762e = this.D;
                        gp4.j jVar2 = this.f175875r;
                        com.tencent.mm.plugin.vlog.model.i1 i1Var2 = u0Var.f175747x;
                        java.lang.String str2 = this.C;
                        bp4.k0 multiPreviewPlugin = getMultiPreviewPlugin();
                        multiPreviewPlugin.A();
                        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f23214m;
                        kotlin.jvm.internal.o.d(videoCompositionPlayView);
                        jVar2.z(a0Var, i1Var2, str2, videoCompositionPlayView.getPosition());
                        if (this.D) {
                            if (aVar2 != null) {
                                G(this, false, false, 0L, 7, null);
                                return;
                            } else {
                                jVar.f274413g = a0Var;
                                ju3.d0.k(jVar.f465332d, ju3.c0.f301884k2, null, 2, null);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                case 41:
                    mVar.f465533h.performClick();
                    return;
                default:
                    switch (ordinal) {
                        case 51:
                            B();
                            A();
                            return;
                        case 52:
                            post(new yo4.o1(this));
                            J();
                            zu3.a aVar3 = jVar.f274413g;
                            if (aVar3 != null) {
                                jVar.Q(aVar3);
                                return;
                            }
                            return;
                        case 53:
                            if (bundle != null) {
                                java.lang.Boolean.valueOf(bundle.getBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN")).booleanValue();
                                G(this, true, true, 0L, 4, null);
                                return;
                            }
                            return;
                        default:
                            switch (ordinal) {
                                case 60:
                                    B();
                                    return;
                                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                                    boolean z17 = bundle != null ? bundle.getBoolean("PARAM_1_BOOLEAN", false) : false;
                                    if (z17 || (!z17 && p2Var.f23341m)) {
                                        G(this, false, false, 0L, 7, null);
                                        return;
                                    }
                                    return;
                                case 62:
                                    ct0.b bVar = this.F;
                                    if (bVar != null) {
                                        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.E;
                                        if (bVar.f222208e - bVar.f222207d <= (recordConfigProvider != null ? recordConfigProvider.f155685w : 10000) + 250) {
                                            jVar.f274412f.setEnableTouch(true);
                                            nu3.i.f340218a.n("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                                            return;
                                        }
                                        android.content.Context context = getContext();
                                        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                                        ((android.app.Activity) context).setResult(3000);
                                        android.content.Context context2 = getContext();
                                        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
                                        ((android.app.Activity) context2).finish();
                                        return;
                                    }
                                    return;
                                case 63:
                                    pVar.z();
                                    jVar.f274412f.setEnableTouch(true);
                                    nu3.i.f340218a.n("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                                    return;
                                default:
                                    bp4.o4 o4Var2 = this.N;
                                    cp4.r rVar = this.f175887z;
                                    switch (ordinal) {
                                        case 65:
                                            L();
                                            return;
                                        case 66:
                                            if ((bundle == null || bundle.getBoolean("PARAM_VIDEO_NEED_CROP")) ? false : true) {
                                                pVar.z();
                                            }
                                            this.A.z();
                                            android.content.Context context3 = getContext();
                                            kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
                                            ((android.view.ViewGroup) ((android.app.Activity) context3).getWindow().getDecorView().findViewById(android.R.id.content)).setAlpha(1.0f);
                                            if (!(o4Var2.f23316f.getVisibility() == 0)) {
                                                J();
                                            }
                                            this.f175882x0.z(true);
                                            com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
                                            com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markFirstFrameShow");
                                            if (com.tencent.mm.plugin.vlog.model.b0.f175554h <= 0) {
                                                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                                com.tencent.mm.plugin.vlog.model.b0.f175554h = android.os.SystemClock.elapsedRealtime();
                                                return;
                                            }
                                            return;
                                        case 67:
                                            if (bundle != null) {
                                                int i27 = bundle.getInt("PARAM_DELETE_VIEW_TYPE_INT");
                                                cw3.j jVar3 = cw3.j.f224165d;
                                                if (i27 == 4) {
                                                    pVar.C();
                                                } else if (i27 == 6) {
                                                    rVar.B(0);
                                                } else if (i27 == 7) {
                                                    rVar.B(1);
                                                }
                                            }
                                            G(this, true, false, 0L, 6, null);
                                            return;
                                        default:
                                            bp4.k2 k2Var = this.f175876s;
                                            switch (ordinal) {
                                                case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
                                                case qc1.u.CTRL_INDEX /* 78 */:
                                                    return;
                                                case 79:
                                                    J();
                                                    xVar.setVisibility(0);
                                                    k2Var.reset();
                                                    return;
                                                case 80:
                                                    k2Var.D();
                                                    return;
                                                case 81:
                                                    k2Var.A();
                                                    return;
                                                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                                                    k2Var.reset();
                                                    if (bundle != null) {
                                                        k2Var.B(bundle.getInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT"));
                                                        return;
                                                    }
                                                    return;
                                                case 83:
                                                    k2Var.E();
                                                    return;
                                                default:
                                                    bp4.o1 o1Var2 = this.U;
                                                    hp4.a aVar4 = this.W;
                                                    switch (ordinal) {
                                                        case 101:
                                                            if (bundle == null || (galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) bundle.getParcelable("PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE")) == null) {
                                                                return;
                                                            }
                                                            this.R.a("start", "select first image");
                                                            this.L.reset();
                                                            k2Var.reset();
                                                            k2Var.f23229f.post(new bp4.f2(new yo4.n1(this, galleryItem$MediaItem)));
                                                            return;
                                                        case 102:
                                                            if (bundle == null || (i17 = bundle.getInt("EDIT_VLOG_SELECT_TRACK", -1)) < 0) {
                                                                return;
                                                            }
                                                            this.I1 = yo4.q.f464301e;
                                                            com.tencent.mm.plugin.vlog.model.i1 i1Var3 = (com.tencent.mm.plugin.vlog.model.i1) kz5.n0.a0(u0Var.f175743t.m(), i17);
                                                            if (i1Var3 == null || o1Var2.f23310i == i17) {
                                                                return;
                                                            }
                                                            A();
                                                            u0Var.f175747x = i1Var3;
                                                            long max = java.lang.Math.max(u0Var.f175743t.j(), i1Var3.f175627l.f397502d);
                                                            getMultiPreviewPlugin().N(max, java.lang.Math.min(u0Var.f175743t.h(), i1Var3.f175627l.f397503e));
                                                            getMultiPreviewPlugin().M(max);
                                                            o1Var2.f23310i = i17;
                                                            o1Var2.setVisibility(0);
                                                            aVar4.f282942f = i17;
                                                            return;
                                                        case 103:
                                                            this.D = true;
                                                            if (bundle != null) {
                                                                if (bundle.getBoolean("EDIT_VLOG_TRACK_CROP_CHANGE")) {
                                                                    u0Var.f175743t.s(bundle.getLong("EDIT_VLOG_TRACK_CROP_START"), bundle.getLong("EDIT_VLOG_TRAKC_CROP_END"));
                                                                    getMultiPreviewPlugin().I(pVar.B());
                                                                    return;
                                                                }
                                                                J();
                                                                getMultiPreviewPlugin().E = 0L;
                                                                getMultiPreviewPlugin().getClass();
                                                                boolean z19 = bundle.getBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM");
                                                                int i28 = bundle.getInt("EDIT_TRACK_DURATION_CUT_COUNT");
                                                                int i29 = bundle.getInt("EDIT_TRACK_DURATION_SCROLL_COUNT");
                                                                long j17 = bundle.getLong("EDIT_VLOG_TRACK_CROP_START");
                                                                long j18 = bundle.getLong("EDIT_VLOG_TRAKC_CROP_END");
                                                                com.tencent.mm.plugin.vlog.model.i1 i1Var4 = u0Var.f175747x;
                                                                long j19 = i1Var4 != null ? i1Var4.f175627l.f397502d : 0L;
                                                                u0Var.l(z19, j17, j18, i28, i29, this.I1 == yo4.q.f464300d);
                                                                jVar.f274412f.setSegmentOffset(0L);
                                                                G(this, true, false, j19, 2, null);
                                                                if (this.I1 == yo4.q.f464301e) {
                                                                    F();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        case 104:
                                                            if (bundle != null) {
                                                                J();
                                                                if (bundle.getBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM")) {
                                                                    com.tencent.mm.plugin.vlog.model.h1 h1Var3 = u0Var.f175743t;
                                                                    nVar.C(h1Var3, false);
                                                                    u0Var.a(h1Var3, true);
                                                                } else {
                                                                    com.tencent.mm.plugin.vlog.model.h1 h1Var4 = u0Var.f175743t;
                                                                    nVar.C(h1Var4, true);
                                                                    u0Var.a(h1Var4, true);
                                                                }
                                                                getMultiPreviewPlugin().I(pVar.B());
                                                                p2Var.B();
                                                                p2Var.f23341m = p2Var.f23340i;
                                                                return;
                                                            }
                                                            return;
                                                        case 105:
                                                        case 106:
                                                            if (bundle != null) {
                                                                int i37 = bundle.getInt("EDIT_COMPOSITION_TRACK_INDEX");
                                                                boolean z27 = bundle.getBoolean("EDIT_COMPOSITION_LEFT");
                                                                this.G.k(i37, bundle.getLong("EDIT_VLOG_TRACK_CROP_START"), bundle.getLong("EDIT_VLOG_TRAKC_CROP_END"));
                                                                com.tencent.mm.plugin.vlog.model.i1 i1Var5 = (com.tencent.mm.plugin.vlog.model.i1) u0Var.f175743t.f175597c.get(i37);
                                                                C(false, false, z27 ? i1Var5.f175627l.f397502d : i1Var5.f175627l.f397503e);
                                                                return;
                                                            }
                                                            return;
                                                        case 107:
                                                            if (bundle != null) {
                                                                int i38 = bundle.getInt("EDIT_VLOG_SELECT_TRACK", -1);
                                                                com.tencent.mm.plugin.vlog.model.i1 i1Var6 = (com.tencent.mm.plugin.vlog.model.i1) kz5.n0.a0(u0Var.f175743t.m(), i38);
                                                                if (i1Var6 != null) {
                                                                    bp4.k0 multiPreviewPlugin2 = getMultiPreviewPlugin();
                                                                    rm5.j jVar4 = i1Var6.f175627l;
                                                                    multiPreviewPlugin2.E = jVar4.f397502d;
                                                                    e4Var.setVisibility(4);
                                                                    jVar.f274412f.setSegmentOffset(jVar4.f397502d);
                                                                    long j27 = ((java.lang.Number) u0Var.f175743t.f().f302834e).longValue() != -1 ? jVar4.f397504f + (((float) (r4 - jVar4.f397502d)) * jVar4.f397506h) : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                                                                    u0Var.j(i38);
                                                                    o4Var2.z().setEnableLengthEdit(!u0Var.s());
                                                                    bp4.o4 o4Var3 = this.N;
                                                                    com.tencent.mm.plugin.vlog.model.i1 i1Var7 = u0Var.f175747x;
                                                                    kotlin.jvm.internal.o.d(i1Var7);
                                                                    bp4.o4.A(o4Var3, i1Var7, false, j27, 2, null);
                                                                    getMultiPreviewPlugin().I(pVar.B());
                                                                    p2Var.B();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        case 108:
                                                            A();
                                                            boolean z28 = !u0Var.s();
                                                            fp4.s sVar = this.Q;
                                                            sVar.z().setEnableLengthEdit(z28);
                                                            zu3.a aVar5 = jVar.f274413g;
                                                            sVar.f265385t = aVar5;
                                                            if (aVar5 != null && (dVar = aVar5.f475760c) != null) {
                                                                getMultiPreviewPlugin().N(dVar.c(), dVar.b());
                                                            }
                                                            sVar.A(u0Var.f175743t);
                                                            G(this, false, false, 0L, 7, null);
                                                            return;
                                                        case 109:
                                                            J();
                                                            zu3.a aVar6 = jVar.f274413g;
                                                            zu3.y yVar2 = aVar6 instanceof zu3.y ? (zu3.y) aVar6 : null;
                                                            if (yVar2 != null) {
                                                                com.tencent.mm.xeffect.effect.EffectManager effectManager = so4.g.f410781f;
                                                                kotlin.jvm.internal.o.d(effectManager);
                                                                uq5.y l17 = effectManager.l(yVar2.f475866h);
                                                                if (l17 != null) {
                                                                    l17.b(yVar2.f475760c.c(), yVar2.f475760c.b());
                                                                }
                                                            }
                                                            jVar.N(false);
                                                            if (bundle != null) {
                                                                G(this, true, false, bundle.getLong("PARAM_1_LONG"), 2, null);
                                                                return;
                                                            }
                                                            return;
                                                        case 110:
                                                            bp4.k0 multiPreviewPlugin3 = getMultiPreviewPlugin();
                                                            com.tencent.mm.plugin.vlog.model.i1 i1Var8 = (com.tencent.mm.plugin.vlog.model.i1) kz5.n0.a0(u0Var.f175743t.f175597c, aVar4.f282942f);
                                                            multiPreviewPlugin3.E = i1Var8 != null ? i1Var8.f175627l.f397502d : 0L;
                                                            u0Var.j(aVar4.f282942f);
                                                            com.tencent.mm.plugin.vlog.model.i1 i1Var9 = u0Var.f175747x;
                                                            kotlin.jvm.internal.o.d(i1Var9);
                                                            this.V.z(i1Var9.f175627l.f397506h);
                                                            this.V.f23437f.setShow(true);
                                                            return;
                                                        case 111:
                                                            if (bundle != null) {
                                                                long j28 = bundle.getLong("EDIT_CROP_VLOG_LENGTH_START_TIME_LONG");
                                                                long j29 = bundle.getLong("EDIT_CROP_VLOG_LENGTH_END_TIME_LONG");
                                                                long j37 = bundle.getLong("EDIT_CROP_VLOG_SEEKTIME_LONG");
                                                                if (bundle.getBoolean("EDIT_CROP_VLOG_ON_UP_BOOLEAN")) {
                                                                    G(this, true, true, 0L, 4, null);
                                                                } else {
                                                                    B();
                                                                    getMultiPreviewPlugin().M(j37);
                                                                }
                                                                getMultiPreviewPlugin().N(j28, j29);
                                                                return;
                                                            }
                                                            return;
                                                        case 112:
                                                            if (bundle == null || (emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) bundle.getParcelable("PARAM_EDIT_EMOJI_INFO")) == null) {
                                                                return;
                                                            }
                                                            gp4.j jVar5 = this.f175875r;
                                                            zu3.j jVar6 = new zu3.j(emojiInfo, null, null, 6, null);
                                                            jVar6.f475762e = this.D;
                                                            gp4.j.B(jVar5, jVar6, u0Var.f175747x, this.C, 0L, 8, null);
                                                            return;
                                                        case 113:
                                                            if (bundle != null) {
                                                                e4Var.setVisibility(4);
                                                                u0Var.u(bundle.getFloat("EDIT_TRACK_DURATION_SCALE", 1.0f));
                                                                getMultiPreviewPlugin().I(pVar.B());
                                                                return;
                                                            }
                                                            return;
                                                        case 114:
                                                            if (bundle != null) {
                                                                u0Var.u(bundle.getFloat("EDIT_TRACK_DURATION_SCALE", 1.0f));
                                                                J();
                                                                getMultiPreviewPlugin().E = 0L;
                                                                getMultiPreviewPlugin().getClass();
                                                                com.tencent.mm.plugin.vlog.model.i1 i1Var10 = u0Var.f175747x;
                                                                long j38 = i1Var10 != null ? i1Var10.f175627l.f397502d : 0L;
                                                                u0Var.l(true, (r16 & 2) != 0 ? -1L : 0L, (r16 & 4) == 0 ? 0L : -1L, (r16 & 8) != 0 ? 0 : 0, (r16 & 16) == 0 ? 0 : 0, (r16 & 32) != 0);
                                                                G(this, true, false, j38, 2, null);
                                                                F();
                                                                return;
                                                            }
                                                            return;
                                                        case 115:
                                                            if (bundle != null) {
                                                                if (bundle.getBoolean("EDIT_FILTER_SHOW")) {
                                                                    A();
                                                                    return;
                                                                } else {
                                                                    J();
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        case 116:
                                                            if (bundle != null) {
                                                                zu3.e eVar = bundle.getInt("PARAM_1_INT") == 0 ? zu3.e.f475801m : zu3.e.f475802n;
                                                                byte[] byteArray = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                                                kotlin.jvm.internal.o.d(byteArray);
                                                                gp4.j.B(this.f175875r, new zu3.d(eVar, byteArray), u0Var.f175747x, this.C, 0L, 8, null);
                                                                return;
                                                            }
                                                            return;
                                                        case 117:
                                                            if (bundle == null || bundle.getByteArray("PARAM_1_BYTEARRAY") == null) {
                                                                return;
                                                            }
                                                            rVar.f221074y++;
                                                            B();
                                                            int i39 = bundle.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                                            int i47 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT", 0);
                                                            java.lang.String string3 = bundle.getString("PARAM_EDIT_TEXT_FONT");
                                                            byte[] byteArray2 = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                                            kotlin.jvm.internal.o.d(byteArray2);
                                                            mVar.B(byteArray2, i39, i47, string3);
                                                            return;
                                                        case 118:
                                                            if (bundle == null || bundle.getByteArray("PARAM_1_BYTEARRAY") == null) {
                                                                return;
                                                            }
                                                            B();
                                                            A();
                                                            byte[] byteArray3 = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                                            kotlin.jvm.internal.o.d(byteArray3);
                                                            rVar.H(byteArray3);
                                                            return;
                                                        case 119:
                                                            if (bundle != null) {
                                                                if (bundle.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                                                    int i48 = bundle.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                                                    int i49 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT", 0);
                                                                    java.lang.String string4 = bundle.getString("PARAM_EDIT_TEXT_FONT");
                                                                    byte[] byteArray4 = bundle.getByteArray("PARAM_1_BYTEARRAY");
                                                                    kotlin.jvm.internal.o.d(byteArray4);
                                                                    rVar.J(byteArray4, i48, i49, string4);
                                                                }
                                                                if (bundle.getLong("PARAM_1_LONG", -1L) >= 0) {
                                                                    G(this, false, false, bundle.getLong("PARAM_1_LONG"), 3, null);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        case 120:
                                                            if (bundle != null) {
                                                                zu3.e eVar2 = bundle.getInt("PARAM_1_INT") == 1 ? zu3.e.f475802n : zu3.e.f475801m;
                                                                jVar.getClass();
                                                                jVar.f274412f.m(eVar2);
                                                                return;
                                                            }
                                                            return;
                                                        case 121:
                                                            G(this, false, false, 0L, 7, null);
                                                            jVar.f274412f.s();
                                                            return;
                                                        case 122:
                                                            this.I1 = yo4.q.f464300d;
                                                            J();
                                                            if (!u0Var.f175734h || this.A1) {
                                                                com.tencent.mm.plugin.vlog.model.h1 h1Var5 = u0Var.f175743t;
                                                                getMultiPreviewPlugin().N(h1Var5.j(), h1Var5.h());
                                                                if (p2Var.f23341m) {
                                                                    o1Var = o1Var2;
                                                                    aVar = aVar4;
                                                                    G(this, false, false, 0L, 7, null);
                                                                } else {
                                                                    o1Var = o1Var2;
                                                                    aVar = aVar4;
                                                                }
                                                                u0Var.f175747x = null;
                                                                this.M.z(-1, 0L, 0L);
                                                                o1Var.f23310i = -1;
                                                                o1Var.setVisibility(4);
                                                                aVar.f282942f = -1;
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            switch (ordinal) {
                                                                case 130:
                                                                    if (bundle == null || (string = bundle.getString("EDIT_PAG_STICKER_PATH")) == null) {
                                                                        return;
                                                                    }
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
                                                                    long j39 = yVar != null ? yVar.f430267a : 0L;
                                                                    android.util.Size size = new android.util.Size(0, 0);
                                                                    java.lang.String string5 = getContext().getString(com.tencent.mm.R.string.btk);
                                                                    kotlin.jvm.internal.o.f(string5, "getString(...)");
                                                                    zu3.y yVar3 = new zu3.y(string, null, 2, null);
                                                                    yVar3.f475866h = j39;
                                                                    yVar3.f475867i = string5;
                                                                    yVar3.f475762e = this.D;
                                                                    yVar3.f475868j = size.getWidth();
                                                                    yVar3.f475869k = size.getHeight();
                                                                    yVar3.f475873o.set(getMultiPreviewPlugin().f23216o);
                                                                    float b17 = i65.a.b(getContext(), 160);
                                                                    yVar3.f475872n = java.lang.Math.min(java.lang.Math.min(b17 / size.getWidth(), b17 / size.getHeight()), 1.0f);
                                                                    yVar3.f475875q = new yo4.p1(j39, yVar3, this);
                                                                    gp4.j.B(this.f175875r, yVar3, u0Var.f175747x, this.C, 0L, 8, null);
                                                                    return;
                                                                case 131:
                                                                    if (bundle != null) {
                                                                        B();
                                                                        A();
                                                                        java.lang.CharSequence charSequence2 = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                                                                        if (charSequence2 == null || (str = charSequence2.toString()) == null) {
                                                                            str = "";
                                                                        }
                                                                        bp4.z2 z2Var = this.f175872p0;
                                                                        z2Var.getClass();
                                                                        com.tencent.mm.plugin.vlog.ui.widget.PagInputView pagInputView = z2Var.f23436f;
                                                                        pagInputView.setup(str);
                                                                        pagInputView.setShow(true);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 132:
                                                                    if (bundle != null) {
                                                                        java.lang.String string6 = bundle.getString("EDIT_PAG_CHANGE_TEXT");
                                                                        if (string6 == null) {
                                                                            string6 = "";
                                                                        }
                                                                        zu3.a aVar7 = jVar.f274413g;
                                                                        zu3.y yVar4 = aVar7 instanceof zu3.y ? (zu3.y) aVar7 : null;
                                                                        if (yVar4 != null) {
                                                                            yVar4.f475867i = string6;
                                                                            so4.g gVar = so4.g.f410776a;
                                                                            com.tencent.mm.xeffect.effect.EffectManager effectManager4 = so4.g.f410781f;
                                                                            kotlin.jvm.internal.o.d(effectManager4);
                                                                            effectManager4.l(yVar4.f475866h);
                                                                        }
                                                                        G(this, false, false, 0L, 7, null);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 133:
                                                                    break;
                                                                default:
                                                                    switch (ordinal) {
                                                                        case 135:
                                                                            break;
                                                                        case 136:
                                                                            J();
                                                                            return;
                                                                        case 137:
                                                                            zu3.a aVar8 = jVar.f274413g;
                                                                            if (aVar8 != null) {
                                                                                B();
                                                                                this.B.B(aVar8);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 138:
                                                                            if (bundle != null) {
                                                                                long j47 = bundle.getLong("PARAM_1_LONG");
                                                                                zu3.a aVar9 = jVar.f274413g;
                                                                                zu3.y yVar5 = aVar9 instanceof zu3.y ? (zu3.y) aVar9 : null;
                                                                                if (yVar5 != null) {
                                                                                    com.tencent.mm.xeffect.effect.EffectManager effectManager5 = so4.g.f410781f;
                                                                                    kotlin.jvm.internal.o.d(effectManager5);
                                                                                    uq5.y l18 = effectManager5.l(yVar5.f475866h);
                                                                                    if (l18 != null) {
                                                                                        l18.b(yVar5.f475760c.c(), yVar5.f475760c.b());
                                                                                    }
                                                                                }
                                                                                jVar.P();
                                                                                jVar.N(false);
                                                                                G(this, true, false, j47, 2, null);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 139:
                                                                            jVar.N(false);
                                                                            G(this, false, false, 0L, 7, null);
                                                                            return;
                                                                        case 140:
                                                                            jVar.P();
                                                                            jVar.N(false);
                                                                            G(this, true, true, 0L, 4, null);
                                                                            return;
                                                                        case 141:
                                                                            this.f175885y0.z();
                                                                            setupTemplateVideoPlugins(null);
                                                                            return;
                                                                        case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                                                                            if (!u0Var.f175734h) {
                                                                                H();
                                                                                return;
                                                                            } else {
                                                                                setupImageEditPlugins(false);
                                                                                jVar.D(false);
                                                                                return;
                                                                            }
                                                                        case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                                                                            this.f175885y0.z();
                                                                            setupTemplateVideoPlugins(null);
                                                                            return;
                                                                        case 144:
                                                                            boolean z29 = bundle != null ? bundle.getBoolean("PARAM_1_BOOLEAN", false) : false;
                                                                            this.K1 = z29;
                                                                            so4.g.f410776a.f(u0Var.f175743t, z29);
                                                                            if (z29) {
                                                                                getMultiPreviewPlugin().P();
                                                                            }
                                                                            if (u0Var.f175734h && !this.A1) {
                                                                                xVar.A(xVar.z());
                                                                            }
                                                                            getMultiPreviewPlugin().B();
                                                                            return;
                                                                        case 145:
                                                                            pVar.L();
                                                                            return;
                                                                        default:
                                                                            com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "unknown key " + status);
                                                                            return;
                                                                    }
                                                            }
                                                            A();
                                                            return;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0108, code lost:
    
        if (r4 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r17, yz5.q r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout.y(java.lang.String, yz5.q):void");
    }

    public final void z(z23.f fVar, java.lang.String[] strArr, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, int i17) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object obj = this.G.f175730d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        h0Var.f310123d = obj;
        if (this.K1) {
            so4.g gVar = so4.g.f410776a;
            java.util.HashMap hashMap = so4.g.f410782g;
            if (hashMap.containsKey(obj)) {
                java.lang.String str = (java.lang.String) hashMap.get(h0Var.f310123d);
                if (str == null) {
                    str = "";
                }
                if (com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", "generateCropImage enable enhancement, use enhancement result image path:".concat(str));
                    h0Var.f310123d = str;
                }
            }
        }
        this.f175876s.C((java.lang.String) h0Var.f310123d, new yo4.b1(h0Var, i17, this, fVar, strArr, captureDataManager$CaptureVideoNormalModel));
    }
}
