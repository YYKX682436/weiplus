package k50;

/* loaded from: classes9.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f304239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r70.g f304240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r70.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f304240e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k50.m(this.f304240e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((k50.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f304239d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            v70.w wVar = (v70.w) ((xs.d1) i95.n0.c(xs.d1.class));
            r70.g gVar = this.f304240e;
            kotlinx.coroutines.flow.j nj6 = wVar.nj(gVar);
            k50.l lVar = new k50.l(gVar);
            this.f304239d = 1;
            if (kotlinx.coroutines.flow.q2.l((kotlinx.coroutines.flow.q2) nj6, lVar, this) == aVar) {
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
