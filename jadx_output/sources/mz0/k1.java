package mz0;

/* loaded from: classes5.dex */
public final class k1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332994f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(mz0.b2 b2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f332993e = b2Var;
        this.f332994f = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.k1 k1Var = new mz0.k1(this.f332993e, this.f332994f, (kotlin.coroutines.Continuation) obj3);
        k1Var.f332992d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        k1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f332992d;
        mz0.b2 b2Var = this.f332993e;
        b2Var.f7().dismiss();
        b2Var.s7(th6, this.f332994f);
        if (th6 != null) {
            db5.t7.g(b2Var.getContext(), b2Var.getString(com.tencent.mm.R.string.f490777aq5));
        } else {
            mz0.b2.Q6(b2Var);
        }
        return jz5.f0.f302826a;
    }
}
