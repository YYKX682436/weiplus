package j0;

/* loaded from: classes14.dex */
public final class n4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f296464d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f296465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f296466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f296467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f296468h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f296469i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(kotlinx.coroutines.y0 y0Var, n0.v2 v2Var, c0.o oVar, n0.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296466f = y0Var;
        this.f296467g = v2Var;
        this.f296468h = oVar;
        this.f296469i = e5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        j0.n4 n4Var = new j0.n4(this.f296466f, this.f296467g, this.f296468h, this.f296469i, continuation);
        n4Var.f296465e = obj;
        return n4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.n4) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296464d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f296465e;
            j0.l4 l4Var = new j0.l4(this.f296466f, this.f296467g, this.f296468h, null);
            j0.m4 m4Var = new j0.m4(this.f296469i);
            this.f296464d = 1;
            if (b0.d4.d(a0Var, l4Var, m4Var, this) == aVar) {
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
