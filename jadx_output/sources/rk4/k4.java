package rk4;

/* loaded from: classes2.dex */
public final class k4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l4 f396780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(rk4.l4 l4Var, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396780e = l4Var;
        this.f396781f = str;
        this.f396782g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.k4(this.f396780e, this.f396781f, this.f396782g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.k4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396779d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f396779d = 1;
            this.f396780e.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            new rk4.t3(this.f396782g).l().q(new rk4.i4(new kotlin.jvm.internal.c0(), rVar, this.f396781f));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
