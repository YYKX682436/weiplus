package py0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ py0.y f359007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(py0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f359007e = yVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        py0.p pVar = new py0.p(this.f359007e, (kotlin.coroutines.Continuation) obj3);
        pVar.f359006d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f359006d;
        py0.y yVar = this.f359007e;
        yVar.P6().dismiss();
        if (th6 != null) {
            db5.t7.g(yVar.getContext(), yVar.getString(com.tencent.mm.R.string.f490777aq5));
        }
        return jz5.f0.f302826a;
    }
}
