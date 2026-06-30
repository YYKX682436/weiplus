package ir2;

/* loaded from: classes2.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f294183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ir2.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294183d = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.m1(this.f294183d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ir2.m1 m1Var = (ir2.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ym5.m1 m1Var = this.f294183d.f294206a.f294098n;
        if (m1Var != null) {
            m1Var.onChanged();
        }
        return jz5.f0.f302826a;
    }
}
