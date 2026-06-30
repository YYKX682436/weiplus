package gy4;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.nb f277597e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c01.nb nbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277597e = nbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gy4.f(this.f277597e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gy4.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277596d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gy4.e eVar = new gy4.e(this.f277597e, null);
            this.f277596d = 1;
            obj = kotlinx.coroutines.a4.c(30000L, eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return java.lang.Boolean.valueOf(obj != null);
    }
}
