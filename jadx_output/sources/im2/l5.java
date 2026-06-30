package im2;

/* loaded from: classes3.dex */
public final class l5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f292431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f292432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f292431d = hVar;
        this.f292432e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.l5(this.f292431d, continuation, this.f292432e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        im2.l5 l5Var = (im2.l5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f292432e.f310123d = (r45.l71) ((xg2.i) this.f292431d).f454393b;
        return jz5.f0.f302826a;
    }
}
