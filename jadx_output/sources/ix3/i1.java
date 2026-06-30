package ix3;

/* loaded from: classes10.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.j1 f295446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ix3.j1 j1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295446d = j1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix3.i1(this.f295446d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ix3.i1 i1Var = (ix3.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ix3.a2 a2Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ix3.j1 j1Var = this.f295446d;
        j75.f Q6 = j1Var.Q6();
        if (Q6 != null && (a2Var = (ix3.a2) Q6.getState()) != null) {
            java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(a2Var.f295361f, false);
            java.util.List S0 = s17 != null ? kz5.n0.S0(s17) : kz5.p0.f313996d;
            j75.f Q62 = j1Var.Q6();
            if (Q62 != null) {
                Q62.B3(new ix3.k1(S0));
            }
        }
        return jz5.f0.f302826a;
    }
}
