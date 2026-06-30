package rf2;

/* loaded from: classes10.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f394975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f394976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.d2 f394977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394978g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(xg2.h hVar, kotlin.coroutines.Continuation continuation, rf2.c2 c2Var, rf2.d2 d2Var, java.lang.String str) {
        super(2, continuation);
        this.f394975d = hVar;
        this.f394976e = c2Var;
        this.f394977f = d2Var;
        this.f394978g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.z1(this.f394975d, continuation, this.f394976e, this.f394977f, this.f394978g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rf2.z1 z1Var = (rf2.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f394975d).f454381b;
        rf2.c2 c2Var = this.f394976e;
        java.lang.String str = c2Var.f394681c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vote ");
        rf2.d2 d2Var = this.f394977f;
        sb6.append(d2Var.f394699h);
        sb6.append(", ");
        sb6.append(d2Var.f394695d.getInteger(0));
        sb6.append(", voteId:");
        sb6.append(this.f394978g);
        sb6.append(", failed. ");
        sb6.append(aVar2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        db5.t7.g(c2Var.f394679a.getContext(), c2Var.f394679a.getContext().getString(com.tencent.mm.R.string.f491650ds5));
        return jz5.f0.f302826a;
    }
}
