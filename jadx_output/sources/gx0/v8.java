package gx0;

/* loaded from: classes5.dex */
public final class v8 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f277066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(gx0.w8 w8Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f277065d = w8Var;
        this.f277066e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new gx0.v8(this.f277065d, this.f277066e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gx0.v8 v8Var = (gx0.v8) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f277065d.V.d(this.f277066e);
        return jz5.f0.f302826a;
    }
}
