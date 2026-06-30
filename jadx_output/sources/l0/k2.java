package l0;

/* loaded from: classes14.dex */
public final class k2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f314323d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ float f314324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f314325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l0.a3 a3Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f314325f = a3Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        float floatValue = ((java.lang.Number) obj2).floatValue();
        l0.k2 k2Var = new l0.k2(this.f314325f, (kotlin.coroutines.Continuation) obj3);
        k2Var.f314323d = (kotlinx.coroutines.y0) obj;
        k2Var.f314324e = floatValue;
        jz5.f0 f0Var = jz5.f0.f302826a;
        k2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) this.f314323d, null, null, new l0.j2(this.f314325f, this.f314324e, null), 3, null);
        return jz5.f0.f302826a;
    }
}
