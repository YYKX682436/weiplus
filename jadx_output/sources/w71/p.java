package w71;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w71.s f443432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f443433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w71.s sVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f443432d = sVar;
        this.f443433e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new w71.p(this.f443432d, this.f443433e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        w71.p pVar = (w71.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        w71.s sVar = this.f443432d;
        bw5.fs0 fs0Var = sVar.f443440a;
        int i17 = fs0Var.f27510n;
        java.lang.String c17 = fs0Var.c();
        bw5.fs0 fs0Var2 = sVar.f443440a;
        su4.k2.j(4, i17, c17, fs0Var2.c(), fs0Var2.I[9] ? fs0Var2.f27511o : "", 0, true, sVar.f443441b, true, fs0Var2.b(), "", (int) fs0Var2.f27506g, false, this.f443433e);
        return jz5.f0.f302826a;
    }
}
