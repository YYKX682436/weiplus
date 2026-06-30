package su2;

/* loaded from: classes2.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f412754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su2.f f412755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(su2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f412755e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new su2.k(this.f412755e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((su2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f412754d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(com.tencent.mm.udr.d0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String str = this.f412755e.f412739a;
            this.f412754d = 1;
            if (((fa5.j) ((com.tencent.mm.udr.d0) c17)).wi("ilinkres_6c359432", str, this) == aVar) {
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
