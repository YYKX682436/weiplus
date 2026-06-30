package kj1;

/* loaded from: classes7.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f308352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f308353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308354f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308353e = n7Var;
        this.f308354f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kj1.k0(this.f308353e, this.f308354f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kj1.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f308352d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kj1.o0 o0Var = kj1.o0.f308373a;
            this.f308352d = 1;
            if (kj1.o0.a(o0Var, this.f308353e, this.f308354f, this) == aVar) {
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
