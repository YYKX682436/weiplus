package gu0;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275845d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275846e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f275847f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f275848g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f275849h;

    /* renamed from: i, reason: collision with root package name */
    public int f275850i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275851m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275852n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJExportSettings f275853o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f275854p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(gu0.k2 k2Var, java.lang.String str, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, com.tencent.maas.moviecomposing.Timeline timeline, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275851m = k2Var;
        this.f275852n = str;
        this.f275853o = mJExportSettings;
        this.f275854p = timeline;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.x0(this.f275851m, this.f275852n, this.f275853o, this.f275854p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.ExportSession exportSession;
        java.lang.Exception e17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f275850i;
        gu0.k2 k2Var = this.f275851m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((yy0.k8) ((pp0.q0) i95.n0.c(pp0.q0.class))).getClass();
            if (!az0.i5.f15557a.t()) {
                com.tencent.mars.xlog.Log.e("MJCC.Session", "exportVideoInternal: MaasCore not inited, skip ExportSession creation");
                return null;
            }
            com.tencent.maas.moviecomposing.ExportSession exportSession2 = new com.tencent.maas.moviecomposing.ExportSession();
            k2Var.f275739o = exportSession2;
            try {
                java.lang.String str = this.f275852n;
                com.tencent.maas.instamovie.MJExportSettings mJExportSettings = this.f275853o;
                com.tencent.maas.moviecomposing.Timeline timeline = this.f275854p;
                this.f275845d = exportSession2;
                this.f275846e = str;
                this.f275847f = mJExportSettings;
                this.f275848g = timeline;
                this.f275849h = k2Var;
                this.f275850i = 1;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                rVar.k();
                rVar.m(new gu0.t0(exportSession2));
                exportSession2.c(str, mJExportSettings, timeline, timeline.f48414a.n(), gu0.u0.f275817a, gu0.v0.f275827a, new gu0.w0(exportSession2, k2Var, str, rVar));
                java.lang.Object j17 = rVar.j();
                if (j17 == aVar) {
                    return aVar;
                }
                exportSession = exportSession2;
                obj = j17;
            } catch (java.lang.Exception e18) {
                exportSession = exportSession2;
                e17 = e18;
                com.tencent.mars.xlog.Log.e("MJCC.Session", "exportVideoInternal exception: " + e17.getMessage());
                exportSession.b();
                k2Var.f275739o = null;
                return null;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            exportSession = (com.tencent.maas.moviecomposing.ExportSession) this.f275845d;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Exception e19) {
                e17 = e19;
                com.tencent.mars.xlog.Log.e("MJCC.Session", "exportVideoInternal exception: " + e17.getMessage());
                exportSession.b();
                k2Var.f275739o = null;
                return null;
            }
        }
        return (jz5.o) obj;
    }
}
