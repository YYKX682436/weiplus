package eq1;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eq1.u f255827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f255828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f255829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(eq1.u uVar, float f17, float f18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255827e = uVar;
        this.f255828f = f17;
        this.f255829g = f18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        eq1.l lVar = new eq1.l(this.f255827e, this.f255828f, this.f255829g, continuation);
        lVar.f255826d = obj;
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        eq1.l lVar = (eq1.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f255826d;
        eq1.u uVar = this.f255827e;
        float f17 = this.f255828f;
        float f18 = this.f255829g;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            uVar.f255867b = kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.biz.BizPOIInfo(new java.lang.Double(f17), new java.lang.Double(f18), "", null, 8, null)));
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            eq1.u uVar2 = this.f255827e;
            com.tencent.mars.xlog.Log.printErrStackTrace("FlutterBizGetPOIHelper", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
            uVar2.f255867b = kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(m524exceptionOrNullimpl)));
        }
        eq1.u uVar3 = this.f255827e;
        synchronized (y0Var) {
            if (kotlinx.coroutines.z0.h(y0Var)) {
                yz5.l lVar = uVar3.f255868c;
                if (lVar != null) {
                    kotlin.Result result = uVar3.f255867b;
                    lVar.invoke(kotlin.Result.m520boximpl(result != null ? result.getValue() : kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("No Location")))));
                }
                uVar3.f255868c = null;
            }
        }
        return jz5.f0.f302826a;
    }
}
