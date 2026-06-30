package ku3;

/* loaded from: classes3.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.n2 f312283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(ku3.n2 n2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312283d = n2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.j2(this.f312283d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.j2 j2Var = (ku3.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ku3.n2 n2Var = this.f312283d;
        n2Var.b().animate().alpha(0.0f).withEndAction(new ku3.i2(n2Var)).start();
        return jz5.f0.f302826a;
    }
}
