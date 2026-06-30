package um2;

/* loaded from: classes3.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f428813f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f428814g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(um2.x5 x5Var, android.app.Activity activity, android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428812e = x5Var;
        this.f428813f = activity;
        this.f428814g = viewGroup;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new um2.g6(this.f428812e, this.f428813f, this.f428814g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((um2.g6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f428811d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            um2.x5 x5Var = this.f428812e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.f6) x5Var.c(mm2.f6.class)).f329034h;
            um2.f6 f6Var = new um2.f6(x5Var, this.f428813f, this.f428814g);
            this.f428811d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(f6Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
