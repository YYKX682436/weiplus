package df2;

/* loaded from: classes3.dex */
public final class hf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.qf f230324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(df2.qf qfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230324e = qfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.hf(this.f230324e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.hf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230323d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.qf qfVar = this.f230324e;
            kotlinx.coroutines.flow.j j17 = kotlinx.coroutines.flow.l.j(((mm2.j2) qfVar.business(mm2.j2.class)).f329165m, 1);
            df2.gf gfVar = new df2.gf(qfVar);
            this.f230323d = 1;
            if (((kotlinx.coroutines.flow.p0) j17).a(gfVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
