package rk4;

/* loaded from: classes11.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.v3 f397007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.j20 f397008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f397009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(rk4.v3 v3Var, bw5.j20 j20Var, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397007e = v3Var;
        this.f397008f = j20Var;
        this.f397009g = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.u3(this.f397007e, this.f397008f, this.f397009g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.u3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397006d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.l1 l1Var = this.f397007e.f397020e;
            kotlin.jvm.internal.o.d(l1Var);
            java.lang.String b17 = this.f397008f.b();
            kotlin.jvm.internal.o.f(b17, "getRouterName(...)");
            this.f397006d = 1;
            if (l1Var.o(b17, this.f397009g, this) == aVar) {
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
