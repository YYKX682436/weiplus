package i64;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f289176d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f289177e;

    /* renamed from: f, reason: collision with root package name */
    public int f289178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f289179g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f289180h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289181i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r45.mr5 mr5Var, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289179g = mr5Var;
        this.f289180h = i17;
        this.f289181i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
        i64.h hVar = new i64.h(this.f289179g, this.f289180h, this.f289181i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
        return hVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
        java.lang.Object invokeSuspend = ((i64.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f289178f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.mr5 mr5Var = this.f289179g;
            int i18 = this.f289180h;
            java.lang.String str = this.f289181i;
            this.f289176d = mr5Var;
            this.f289177e = str;
            this.f289178f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            i64.f fVar = new i64.f(rVar);
            k64.h.a(mr5Var, i18, str, fVar, (r45.js5) r45.oy.class.newInstance(), true);
            rVar.m(new i64.g(fVar, i18, mr5Var));
            obj = rVar.j();
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$lambda$1$$inlined$requestCgiAsync$default$1");
        return obj;
    }
}
