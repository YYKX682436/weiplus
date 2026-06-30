package qy1;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367755d;

    /* renamed from: e, reason: collision with root package name */
    public long f367756e;

    /* renamed from: f, reason: collision with root package name */
    public int f367757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qy1.b0 f367758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f367759h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(qy1.b0 b0Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367758g = b0Var;
        this.f367759h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy1.u(this.f367758g, this.f367759h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.m] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.o oVar;
        long j17;
        kotlinx.coroutines.sync.m mVar;
        java.lang.Throwable th6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367757f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.sync.m mVar2 = (kotlinx.coroutines.sync.m) ((jz5.n) this.f367758g.f367711j).getValue();
                this.f367755d = mVar2;
                long j18 = this.f367759h;
                this.f367756e = j18;
                this.f367757f = 1;
                oVar = (kotlinx.coroutines.sync.o) mVar2;
                if (oVar.a(this) == aVar) {
                    return aVar;
                }
                j17 = j18;
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = (kotlinx.coroutines.sync.m) this.f367755d;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        ((kotlinx.coroutines.sync.o) mVar).c();
                        return jz5.f0.f302826a;
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        ((kotlinx.coroutines.sync.o) mVar).c();
                        throw th6;
                    }
                }
                j17 = this.f367756e;
                ?? r17 = (kotlinx.coroutines.sync.m) this.f367755d;
                kotlin.ResultKt.throwOnFailure(obj);
                oVar = r17;
            }
            this.f367755d = oVar;
            this.f367757f = 2;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
            mVar = oVar;
            ((kotlinx.coroutines.sync.o) mVar).c();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th8) {
            mVar = oVar;
            th6 = th8;
            ((kotlinx.coroutines.sync.o) mVar).c();
            throw th6;
        }
    }
}
