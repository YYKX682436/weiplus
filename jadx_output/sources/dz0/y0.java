package dz0;

/* loaded from: classes5.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245064d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f245065e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f245066f;

    /* renamed from: g, reason: collision with root package name */
    public long f245067g;

    /* renamed from: h, reason: collision with root package name */
    public int f245068h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245069i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f245070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245071n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f245072o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlinx.coroutines.q qVar, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245069i = maasSdkUIC;
        this.f245070m = qVar;
        this.f245071n = str;
        this.f245072o = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.y0(this.f245069i, this.f245070m, this.f245071n, this.f245072o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        az0.n7 n7Var;
        kotlinx.coroutines.q qVar;
        java.lang.String str;
        long j17;
        java.lang.String str2;
        long j18;
        az0.n7 n7Var2;
        long j19;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245068h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            n7Var = this.f245069i.f69783d;
            if (n7Var != null) {
                boolean i18 = n7Var.i();
                qVar = this.f245070m;
                str = this.f245071n;
                j17 = this.f245072o;
                if (!i18) {
                    if (n7Var.f15742a.getCurrentState() == com.tencent.maas.instamovie.MJMovieSessionState.Initial) {
                        str2 = str;
                        j18 = j17;
                        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "callSessionSnapshotAndExportClipBundle: failed, session state, now:" + n7Var.f15742a.getCurrentState());
                        com.tencent.maas.instamovie.base.MJError mJError = new com.tencent.maas.instamovie.base.MJError(-1, "movieSession state not match, " + n7Var.f15742a.getCurrentState());
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new az0.p7(mJError))));
                        az0.rc.i(str2, j18, mJError, false, 0, 24, null);
                    } else {
                        this.f245064d = qVar;
                        this.f245065e = str;
                        this.f245066f = n7Var;
                        this.f245067g = j17;
                        this.f245068h = 1;
                        java.lang.Object q17 = n7Var.q(this);
                        if (q17 == aVar) {
                            return aVar;
                        }
                        n7Var2 = n7Var;
                        obj = q17;
                        j19 = j17;
                    }
                }
                n7Var.f15742a.snapshotAndExportClipbundle(new dz0.x0(qVar, str, j17));
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j19 = this.f245067g;
        n7Var2 = (az0.n7) this.f245066f;
        str = (java.lang.String) this.f245065e;
        qVar = (kotlinx.coroutines.q) this.f245064d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Boolean) obj).booleanValue()) {
            j17 = j19;
            n7Var = n7Var2;
            n7Var.f15742a.snapshotAndExportClipbundle(new dz0.x0(qVar, str, j17));
            return jz5.f0.f302826a;
        }
        n7Var = n7Var2;
        j18 = j19;
        str2 = str;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "callSessionSnapshotAndExportClipBundle: failed, session state, now:" + n7Var.f15742a.getCurrentState());
        com.tencent.maas.instamovie.base.MJError mJError2 = new com.tencent.maas.instamovie.base.MJError(-1, "movieSession state not match, " + n7Var.f15742a.getCurrentState());
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new az0.p7(mJError2))));
        az0.rc.i(str2, j18, mJError2, false, 0, 24, null);
        return jz5.f0.f302826a;
    }
}
