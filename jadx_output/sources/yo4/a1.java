package yo4;

/* loaded from: classes10.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f464170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.h1 f464171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.p f464172g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464173h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f464174i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f464175m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f464176n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f464177o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f464178p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.q f464179q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout, java.util.ArrayList arrayList, com.tencent.mm.plugin.vlog.model.h1 h1Var, com.tencent.mm.plugin.vlog.model.p pVar, java.lang.String str, android.util.Size size, android.graphics.Rect rect, android.graphics.Rect rect2, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var, yz5.q qVar) {
        super(0);
        this.f464169d = multiVideoPluginLayout;
        this.f464170e = arrayList;
        this.f464171f = h1Var;
        this.f464172g = pVar;
        this.f464173h = str;
        this.f464174i = size;
        this.f464175m = rect;
        this.f464176n = rect2;
        this.f464177o = h0Var;
        this.f464178p = c0Var;
        this.f464179q = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout.M1;
        com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout = this.f464169d;
        multiVideoPluginLayout.getClass();
        pm0.v.L("MultiVideoPluginLayout_report", true, new yo4.e1(multiVideoPluginLayout, 1L));
        uo4.a aVar = uo4.a.f429674a;
        java.util.ArrayList arrayList = this.f464170e;
        aVar.d(arrayList);
        com.tencent.mm.plugin.vlog.model.h1 h1Var = this.f464171f;
        aVar.c(h1Var);
        if (multiVideoPluginLayout.B1) {
            aVar.b(116L);
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = multiVideoPluginLayout.f175879v.f464287r;
            if (audioCacheInfo != null && audioCacheInfo.f155722s) {
                aVar.b(117L);
            }
        }
        com.tencent.mm.plugin.vlog.model.p pVar = this.f464172g;
        java.lang.String outPath = this.f464173h;
        kotlin.jvm.internal.o.f(outPath, "$outPath");
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = multiVideoPluginLayout.E;
        kotlin.jvm.internal.o.d(recordConfigProvider);
        com.tencent.mm.modelcontrol.VideoTransPara videoParam = recordConfigProvider.f155676n;
        kotlin.jvm.internal.o.f(videoParam, "videoParam");
        com.tencent.mm.plugin.vlog.model.g0.a(pVar, outPath, videoParam, this.f464174i, this.f464175m, false, false, 48, null);
        float[] fArr = (float[]) this.f464177o.f310123d;
        com.tencent.mm.plugin.vlog.model.p pVar2 = this.f464172g;
        pVar2.b(this.f464176n, fArr, arrayList);
        pVar2.c(multiVideoPluginLayout.T.f23267r.f398123a);
        if (multiVideoPluginLayout.A1) {
            multiVideoPluginLayout.f175885y0.z();
            pVar2.d(null);
            throw null;
        }
        r45.h70 f17 = pVar2.f();
        f17.f375909s = multiVideoPluginLayout.D1;
        boolean z17 = this.f464178p.f310112d;
        yz5.q qVar = this.f464179q;
        if (z17) {
            android.graphics.Rect rect = new android.graphics.Rect();
            com.tencent.mm.plugin.vlog.model.x.f(f17.f375902i.f376778g, rect);
            h1Var.t(rect);
            zv3.c e17 = com.tencent.mm.plugin.vlog.model.x.e(f17);
            ((zv3.f) e17).e();
            h1Var.p(e17);
            h1Var.l(f17.f375902i.f376780i, new yo4.x0(e17, qVar, f17));
        } else {
            com.tencent.mm.plugin.vlog.model.n nVar = new com.tencent.mm.plugin.vlog.model.n();
            nVar.f175683b = false;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = multiVideoPluginLayout.E;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            com.tencent.mm.modelcontrol.VideoTransPara videoParam2 = recordConfigProvider2.f155676n;
            kotlin.jvm.internal.o.f(videoParam2, "videoParam");
            nVar.i(true, videoParam2);
            com.tencent.mm.plugin.vlog.model.f0.a(nVar, f17, false, new yo4.z0(qVar), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
