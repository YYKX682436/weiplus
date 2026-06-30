package dz0;

/* loaded from: classes5.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244882e = maasSdkUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.i1(this.f244882e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244881d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f244882e;
            az0.n7 n7Var = maasSdkUIC.f69783d;
            if (n7Var != null) {
                com.tencent.maas.model.time.MJTime mJTime = maasSdkUIC.f69800x;
                kotlin.jvm.internal.o.f(mJTime, "access$getCurPlayTime$p(...)");
                this.f244881d = 1;
                obj = az0.n7.p(n7Var, mJTime, null, this, 2, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return jz5.f0.f302826a;
    }
}
