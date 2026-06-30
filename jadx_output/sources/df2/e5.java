package df2;

/* loaded from: classes3.dex */
public final class e5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.h5 f230033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(df2.h5 h5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230033d = h5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.e5(this.f230033d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.e5 e5Var = (df2.e5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ts5.d wi6 = ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).wi(ts5.c.f421732d, ts5.a.f421725g);
        wi6.start();
        this.f230033d.f230283n = wi6;
        return jz5.f0.f302826a;
    }
}
