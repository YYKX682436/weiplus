package ty2;

/* loaded from: classes9.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f423090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty2.o f423091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty2.k f423092f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ty2.o oVar, ty2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f423091e = oVar;
        this.f423092f = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ty2.n(this.f423091e, this.f423092f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ty2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f423090d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ty2.k kVar = this.f423092f;
            bw5.o5 o5Var = kVar.f423073a;
            int i18 = kVar.f423074b;
            this.f423090d = 1;
            if (this.f423091e.b(o5Var, i18, this) == aVar) {
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
