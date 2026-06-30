package vw;

/* loaded from: classes11.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw.m2 f440675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(vw.m2 m2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440675e = m2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw.k1(this.f440675e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f440674d;
        vw.m2 m2Var = this.f440675e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.l1 l1Var = m2Var.f440687g;
            if (l1Var != null) {
                this.f440674d = 1;
                if (l1Var.h(m2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        m2Var.f440687g = null;
        return jz5.f0.f302826a;
    }
}
