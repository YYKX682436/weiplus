package du0;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.o f243377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f243378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(du0.o oVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243377e = oVar;
        this.f243378f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.l(this.f243377e, this.f243378f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243376d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f243376d = 1;
            if (this.f243377e.d5(this.f243378f, this) == aVar) {
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
