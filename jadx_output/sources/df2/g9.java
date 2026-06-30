package df2;

/* loaded from: classes10.dex */
public final class g9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k9 f230206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(df2.k9 k9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230206d = k9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.g9(this.f230206d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.g9 g9Var = (df2.g9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f230206d.f230565s;
        if (mMPAGView != null) {
            mMPAGView.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
