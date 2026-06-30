package yo4;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f464331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.h1 f464332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.p f464333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f464335i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f464336m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f464337n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f464338o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f464339p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.q f464340q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, java.util.ArrayList arrayList, com.tencent.mm.plugin.vlog.model.h1 h1Var, com.tencent.mm.plugin.vlog.model.p pVar, java.lang.String str, android.util.Size size, android.graphics.Rect rect, android.graphics.Rect rect2, kotlin.jvm.internal.h0 h0Var, boolean z17, yz5.q qVar) {
        super(0);
        this.f464330d = multiVideoFullScreenPluginLayout;
        this.f464331e = arrayList;
        this.f464332f = h1Var;
        this.f464333g = pVar;
        this.f464334h = str;
        this.f464335i = size;
        this.f464336m = rect;
        this.f464337n = rect2;
        this.f464338o = h0Var;
        this.f464339p = z17;
        this.f464340q = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.T1;
        com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464330d;
        multiVideoFullScreenPluginLayout.getClass();
        pm0.v.L("MultiVideoPluginLayout_report", true, new yo4.d0(multiVideoFullScreenPluginLayout, 1L));
        uo4.a aVar = uo4.a.f429674a;
        java.util.ArrayList arrayList = this.f464331e;
        aVar.d(arrayList);
        com.tencent.mm.plugin.vlog.model.h1 h1Var = this.f464332f;
        aVar.c(h1Var);
        if (multiVideoFullScreenPluginLayout.H1) {
            aVar.b(116L);
            yo4.p pVar = multiVideoFullScreenPluginLayout.f175855w;
            if (pVar == null) {
                kotlin.jvm.internal.o.o("addMusicPlugin");
                throw null;
            }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = pVar.f464287r;
            if (audioCacheInfo != null && audioCacheInfo.f155722s) {
                aVar.b(117L);
            }
        }
        com.tencent.mm.plugin.vlog.model.p pVar2 = this.f464333g;
        java.lang.String outPath = this.f464334h;
        kotlin.jvm.internal.o.f(outPath, "$outPath");
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = multiVideoFullScreenPluginLayout.F;
        kotlin.jvm.internal.o.d(recordConfigProvider);
        com.tencent.mm.modelcontrol.VideoTransPara videoParam = recordConfigProvider.f155676n;
        kotlin.jvm.internal.o.f(videoParam, "videoParam");
        android.util.Size size = this.f464335i;
        android.graphics.Rect rect = this.f464336m;
        bp4.c2 c2Var = multiVideoFullScreenPluginLayout.f175863z1;
        com.tencent.mm.plugin.vlog.model.g0.a(pVar2, outPath, videoParam, size, rect, false, !c2Var.f23134z, 16, null);
        float[] fArr = (float[]) this.f464338o.f310123d;
        com.tencent.mm.plugin.vlog.model.p pVar3 = this.f464333g;
        pVar3.b(this.f464337n, fArr, arrayList);
        bp4.m1 m1Var = multiVideoFullScreenPluginLayout.U;
        if (m1Var == null) {
            kotlin.jvm.internal.o.o("editMagicPlugin");
            throw null;
        }
        pVar3.c(m1Var.f23267r.f398123a);
        if (multiVideoFullScreenPluginLayout.G1) {
            multiVideoFullScreenPluginLayout.f175842l1.z();
            pVar3.d(null);
            throw null;
        }
        r45.h70 f17 = pVar3.f();
        f17.f375909s = multiVideoFullScreenPluginLayout.K1;
        bp4.k0 multiPreviewPlugin = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin();
        f17.f375910t = !kotlin.jvm.internal.o.b(multiPreviewPlugin.C(), multiPreviewPlugin.f23227z);
        boolean z17 = this.f464339p;
        yz5.q qVar = this.f464340q;
        if (z17) {
            if (c2Var.f23134z) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                com.tencent.mm.plugin.vlog.model.x.f(f17.f375902i.f376778g, rect2);
                h1Var.t(rect2);
            }
            zv3.c e17 = com.tencent.mm.plugin.vlog.model.x.e(f17);
            ((zv3.f) e17).e();
            h1Var.p(e17);
            h1Var.l(f17.f375902i.f376780i, new yo4.v(e17, qVar, f17));
        } else {
            com.tencent.mm.plugin.vlog.model.n nVar = new com.tencent.mm.plugin.vlog.model.n();
            nVar.f175683b = false;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = multiVideoFullScreenPluginLayout.F;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            com.tencent.mm.modelcontrol.VideoTransPara videoParam2 = recordConfigProvider2.f155676n;
            kotlin.jvm.internal.o.f(videoParam2, "videoParam");
            nVar.i(true, videoParam2);
            com.tencent.mm.plugin.vlog.model.f0.a(nVar, f17, false, new yo4.x(qVar), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
