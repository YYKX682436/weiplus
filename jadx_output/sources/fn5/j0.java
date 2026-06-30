package fn5;

/* loaded from: classes3.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(fn5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264685d = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn5.j0(this.f264685d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fn5.j0 j0Var = (fn5.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "loadingTextUpdateTask >> go to update loading text");
        this.f264685d.f264730p.setValue(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzw));
        return jz5.f0.f302826a;
    }
}
