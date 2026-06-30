package gx0;

/* loaded from: classes5.dex */
public final class ch extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.kh f276305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(gx0.kh khVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276305d = khVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ch(this.f276305d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.ch chVar = (gx0.ch) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        chVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f276305d.f276642r = null;
        return jz5.f0.f302826a;
    }
}
