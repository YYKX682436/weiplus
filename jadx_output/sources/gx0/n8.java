package gx0;

/* loaded from: classes5.dex */
public final class n8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.y4 f276760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(gx0.w8 w8Var, gx0.y4 y4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276759d = w8Var;
        this.f276760e = y4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.n8(this.f276759d, this.f276760e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.n8 n8Var = (gx0.n8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f276759d.V.b(this.f276760e == gx0.y4.f277206m);
        return jz5.f0.f302826a;
    }
}
