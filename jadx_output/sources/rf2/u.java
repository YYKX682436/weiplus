package rf2;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f394901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(xg2.h hVar, kotlin.coroutines.Continuation continuation, rf2.v0 v0Var) {
        super(2, continuation);
        this.f394901d = hVar;
        this.f394902e = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.u(this.f394901d, continuation, this.f394902e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rf2.u uVar = (rf2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f394901d).f454381b;
        rf2.v0 v0Var = this.f394902e;
        com.tencent.mars.xlog.Log.e(v0Var.f394916c, "attendLottery failed. " + aVar2);
        db5.t7.g(v0Var.f394914a.getContext(), v0Var.f394914a.getContext().getString(com.tencent.mm.R.string.dor));
        return jz5.f0.f302826a;
    }
}
