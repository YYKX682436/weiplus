package df2;

/* loaded from: classes3.dex */
public final class rz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f231276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f231277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(kotlinx.coroutines.q qVar, df2.a00 a00Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231276d = qVar;
        this.f231277e = a00Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.rz(this.f231276d, this.f231277e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.rz rzVar = (df2.rz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rzVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        v65.n nVar = new v65.n(this.f231276d);
        df2.a00 a00Var = this.f231277e;
        com.tencent.mm.view.MMPAGView b76 = a00Var.b7();
        if (b76 != null) {
            b76.setComposition(a00Var.f229652q);
            b76.d();
            b76.setRepeatCount(1);
            b76.setProgress(0.0d);
            b76.g();
            b76.a(new df2.qz(b76, a00Var, nVar));
        }
        return jz5.f0.f302826a;
    }
}
