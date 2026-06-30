package ix3;

/* loaded from: classes.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.y0 f295569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295570e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ix3.y0 y0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295569d = y0Var;
        this.f295570e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix3.u0(this.f295569d, this.f295570e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ix3.u0 u0Var = (ix3.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ix3.y0 y0Var = this.f295569d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(y0Var.getActivity());
        u1Var.g(this.f295570e + "\n命名不合法！！");
        u1Var.b(new ix3.t0(y0Var));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
