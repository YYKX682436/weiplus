package nu0;

/* loaded from: classes5.dex */
public final class e4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.i4 f339929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f339930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f339931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(nu0.i4 i4Var, com.tencent.maas.base.MJID mjid, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339929d = i4Var;
        this.f339930e = mjid;
        this.f339931f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.e4(this.f339929d, this.f339930e, this.f339931f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nu0.e4 e4Var = (nu0.e4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        du0.o.o7((nu0.b1) ((jz5.n) this.f339929d.f339973m).getValue(), this.f339930e, true, false, 4, null);
        yz5.a aVar2 = this.f339931f;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return jz5.f0.f302826a;
    }
}
