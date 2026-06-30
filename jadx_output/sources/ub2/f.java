package ub2;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ub2.k f426047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ub2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426047e = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ub2.f(this.f426047e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ub2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f426046d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderPostWatermarkDetHelper", "[release] before cancel");
            kotlinx.coroutines.r2 r2Var = this.f426047e.f426074c;
            if (r2Var != null) {
                this.f426046d = 1;
                if (kotlinx.coroutines.v2.d(r2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderPostWatermarkDetHelper", "[release] after cancel");
        long j17 = ub2.n.f426085b;
        if (j17 != 0) {
            com.tencent.mm.xeffect.WeWatermarkDet.nRelease(j17);
            ub2.n.f426085b = 0L;
        }
        return jz5.f0.f302826a;
    }
}
