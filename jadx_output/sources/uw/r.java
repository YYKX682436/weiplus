package uw;

/* loaded from: classes.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f431503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw.y f431504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f431505f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f431506g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(uw.y yVar, float f17, float f18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431504e = yVar;
        this.f431505f = f17;
        this.f431506g = f18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        uw.r rVar = new uw.r(this.f431504e, this.f431505f, this.f431506g, continuation);
        rVar.f431503d = obj;
        return rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        uw.r rVar = (uw.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f431503d;
        uw.y yVar = this.f431504e;
        float f17 = this.f431505f;
        float f18 = this.f431506g;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            yVar.f431523b = kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.brand_service.BSPOIInfo(new java.lang.Double(f17), new java.lang.Double(f18), null, 4, null)));
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            uw.y yVar2 = this.f431504e;
            com.tencent.mars.xlog.Log.printErrStackTrace("FlutterBSGetPoiHelper", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
            yVar2.f431523b = kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(m524exceptionOrNullimpl)));
        }
        uw.y yVar3 = this.f431504e;
        synchronized (y0Var) {
            if (kotlinx.coroutines.z0.h(y0Var)) {
                yz5.l lVar = yVar3.f431524c;
                if (lVar != null) {
                    kotlin.Result result = yVar3.f431523b;
                    lVar.invoke(kotlin.Result.m520boximpl(result != null ? result.getValue() : kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("No Location")))));
                }
                yVar3.f431524c = null;
            }
        }
        return jz5.f0.f302826a;
    }
}
