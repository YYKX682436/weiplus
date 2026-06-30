package le4;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f318156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs.b f318157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bs.b f318158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318160h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318161i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f318162m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f318163n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f318164o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318165p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f318166q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f318167r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f318168s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bs.b bVar, bs.b bVar2, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, android.content.Context context, java.lang.String str4, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f318157e = bVar;
        this.f318158f = bVar2;
        this.f318159g = str;
        this.f318160h = str2;
        this.f318161i = str3;
        this.f318162m = j17;
        this.f318163n = j18;
        this.f318164o = context;
        this.f318165p = str4;
        this.f318166q = i17;
        this.f318167r = i18;
        this.f318168s = i19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
        le4.b bVar = new le4.b(this.f318157e, this.f318158f, this.f318159g, this.f318160h, this.f318161i, this.f318162m, this.f318163n, this.f318164o, this.f318165p, this.f318166q, this.f318167r, this.f318168s, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
        java.lang.Object invokeSuspend = ((le4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f318156d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qk.r7 r7Var = (qk.r7) i95.n0.c(qk.r7.class);
            bs.b bVar = this.f318157e;
            bVar.b(this.f318158f);
            java.lang.String str = this.f318159g;
            java.lang.String str2 = this.f318160h;
            java.lang.String exportPath = this.f318161i;
            kotlin.jvm.internal.o.f(exportPath, "$exportPath");
            aq.t0 t0Var = new aq.t0(str, str2, exportPath, this.f318162m, null, 16, null);
            this.f318156d = 1;
            ((hs.v) r7Var).getClass();
            a17 = qp.b.f365674a.a(bVar, t0Var, this);
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
                    throw illegalStateException;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        aq.s0 s0Var = (aq.s0) a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f318163n;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoExportHelper", "cost " + currentTimeMillis + ", result: " + s0Var.f12960a + " code:" + s0Var.f12961b);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        le4.a aVar2 = new le4.a(s0Var, this.f318164o, this.f318161i, this.f318165p, this.f318166q, this.f318167r, this.f318168s, currentTimeMillis, null);
        this.f318156d = 2;
        if (kotlinx.coroutines.l.g(g3Var, aVar2, this) == aVar) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
            return aVar;
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1");
        return f0Var2;
    }
}
