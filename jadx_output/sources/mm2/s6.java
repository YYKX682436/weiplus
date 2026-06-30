package mm2;

/* loaded from: classes3.dex */
public final class s6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.o6 f329420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(mm2.o6 o6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329420d = o6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.s6(this.f329420d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mm2.s6 s6Var = (mm2.s6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f329420d.f329338b.invoke();
        return jz5.f0.f302826a;
    }
}
