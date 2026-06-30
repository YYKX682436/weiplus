package mx0;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mx0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332425d = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.x0(this.f332425d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.x0 x0Var = (mx0.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f332425d.f331937d) {
            kotlinx.coroutines.l.f(null, new mx0.w0(this.f332425d, null), 1, null);
            this.f332425d.f331937d = false;
        }
        return jz5.f0.f302826a;
    }
}
