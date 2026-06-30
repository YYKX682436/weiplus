package nu0;

/* loaded from: classes5.dex */
public final class h4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.i4 f339956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f339957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(nu0.i4 i4Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339956d = i4Var;
        this.f339957e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.h4(this.f339956d, this.f339957e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nu0.h4 h4Var = (nu0.h4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((nu0.b1) ((jz5.n) this.f339956d.f339973m).getValue()).U6(this.f339957e);
        return jz5.f0.f302826a;
    }
}
