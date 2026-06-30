package hw0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.z f285483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f285484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hw0.z zVar, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285483d = zVar;
        this.f285484e = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hw0.u(this.f285483d, this.f285484e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hw0.u uVar = (hw0.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((ow0.a0) ((jz5.n) this.f285483d.f285495r).getValue()).N7(this.f285484e, zw0.b.f476551e, mv0.c.f331533e);
        return jz5.f0.f302826a;
    }
}
