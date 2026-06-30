package l0;

/* loaded from: classes14.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f314555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f314556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f314557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(float f17, l0.a3 a3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f314556e = f17;
        this.f314557f = a3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        l0.v2 v2Var = new l0.v2(this.f314556e, this.f314557f, continuation);
        v2Var.f314555d = obj;
        return v2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        l0.v2 v2Var = (l0.v2) create((b0.u0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((b0.j) ((b0.u0) this.f314555d)).f16352a.f16373a.invoke(java.lang.Float.valueOf(this.f314556e - ((java.lang.Number) ((n0.q4) this.f314557f.f314034g).getValue()).floatValue()));
        return jz5.f0.f302826a;
    }
}
