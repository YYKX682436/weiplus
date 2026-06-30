package kd2;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f306767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f306768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f306768e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kd2.k0(this.f306768e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kd2.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f306767d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kd2.p1 a17 = kd2.p1.N.a();
            boolean z17 = this.f306768e;
            this.f306767d = 1;
            if (kd2.p1.y0(a17, true, true, z17, null, false, this, 24, null) == aVar) {
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
