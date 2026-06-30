package le4;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq.s0 f318148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f318149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318151g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f318152h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f318153i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f318154m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f318155n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(aq.s0 s0Var, android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f318148d = s0Var;
        this.f318149e = context;
        this.f318150f = str;
        this.f318151g = str2;
        this.f318152h = i17;
        this.f318153i = i18;
        this.f318154m = i19;
        this.f318155n = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1$1");
        le4.a aVar = new le4.a(this.f318148d, this.f318149e, this.f318150f, this.f318151g, this.f318152h, this.f318153i, this.f318154m, this.f318155n, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1$1");
        return aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1$1");
        le4.a aVar = (le4.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        aq.s0 s0Var = this.f318148d;
        boolean z17 = s0Var.f12960a;
        android.content.Context context = this.f318149e;
        if (z17) {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.o7m, this.f318150f), 1).show();
        } else {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.og6), 1).show();
        }
        int i17 = (int) this.f318155n;
        boolean z18 = s0Var.f12960a;
        int i18 = s0Var.f12961b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSaveLivePhoto", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
        java.lang.String snsId = this.f318151g;
        kotlin.jvm.internal.o.g(snsId, "snsId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportSaveLivePhoto >> ");
        sb6.append(snsId);
        sb6.append(' ');
        int i19 = this.f318152h;
        sb6.append(i19);
        sb6.append(' ');
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoReportHelper", sb6.toString());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("livephoto_save", kz5.c1.k(new jz5.l("sns_feed_id", snsId), new jz5.l("photoindex", java.lang.Integer.valueOf(i19)), new jz5.l("livephoto_scene", java.lang.Integer.valueOf(this.f318153i)), new jz5.l("livevideodurationms", java.lang.Integer.valueOf(this.f318154m)), new jz5.l("totalcosttimesms", java.lang.Integer.valueOf(i17)), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, java.lang.Integer.valueOf(i18)), new jz5.l("issucess", java.lang.Integer.valueOf(z18 ? 1 : 0))), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSaveLivePhoto", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.util.livephoto.export.SnsLivePhotoExportHelper$exportLivePhoto$1$1");
        return f0Var;
    }
}
