package qu2;

/* loaded from: classes7.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366746d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qu2.b f366748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qu2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366748f = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qu2.a aVar = new qu2.a(this.f366748f, continuation);
        aVar.f366747e = obj;
        return aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qu2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f366746d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f366747e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f366747e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (kotlinx.coroutines.z0.h(y0Var)) {
            this.f366748f.c();
            long j17 = r3.f366757i * 1000;
            this.f366747e = y0Var;
            this.f366746d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
