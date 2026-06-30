package fr5;

/* loaded from: classes11.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f266018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ er5.g f266019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(er5.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266019e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fr5.r(this.f266019e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fr5.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f266018d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f266018d = 1;
            java.lang.Object g17 = this.f266019e.f256242c.g("onActionDown", this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
