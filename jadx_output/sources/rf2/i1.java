package rf2;

/* loaded from: classes.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f394771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(xg2.h hVar, kotlin.coroutines.Continuation continuation, rf2.o1 o1Var) {
        super(2, continuation);
        this.f394771d = hVar;
        this.f394772e = o1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.i1(this.f394771d, continuation, this.f394772e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rf2.i1 i1Var = (rf2.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f394771d).f454381b;
        rf2.o1 o1Var = this.f394772e;
        com.tencent.mars.xlog.Log.w(o1Var.f394838c, "reserveLottery failed. " + aVar2);
        db5.t7.g(o1Var.f394836a.getContext(), o1Var.f394836a.getContext().getString(com.tencent.mm.R.string.drh));
        return jz5.f0.f302826a;
    }
}
