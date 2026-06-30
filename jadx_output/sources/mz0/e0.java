package mz0;

/* loaded from: classes5.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(mz0.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332935d = b2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.e0(this.f332935d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mz0.e0 e0Var = (mz0.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        mz0.b2 b2Var = this.f332935d;
        ((com.tencent.mm.mj_template.sns.compose.widget.c1) b2Var.f332896t.getValue()).f69873d = mz0.b2.O6(b2Var);
        return jz5.f0.f302826a;
    }
}
