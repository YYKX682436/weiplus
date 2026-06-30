package v14;

/* loaded from: classes.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v14.p f432551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f432554h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v14.p pVar, java.lang.String str, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432551e = pVar;
        this.f432552f = str;
        this.f432553g = str2;
        this.f432554h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v14.k(this.f432551e, this.f432552f, this.f432553g, this.f432554h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v14.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432550d;
        v14.p pVar = this.f432551e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kv.b0 b0Var = pVar.f432577d;
            this.f432550d = 1;
            obj = ((hn1.s) b0Var).hj(this.f432552f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = this.f432553g;
        pVar.f432578e = str;
        this.f432554h.invoke(str);
        c01.b9.f37069c.b((java.lang.String) obj);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        v14.j jVar = new v14.j(null);
        this.f432550d = 2;
        if (kotlinx.coroutines.l.g(g3Var, jVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
