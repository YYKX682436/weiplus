package mx0;

/* loaded from: classes5.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.i0 f332445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f332446g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.q23 f332447h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(mx0.e1 e1Var, java.lang.String str, com.tencent.maas.camstudio.i0 i0Var, yz5.p pVar, r45.q23 q23Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332443d = e1Var;
        this.f332444e = str;
        this.f332445f = i0Var;
        this.f332446g = pVar;
        this.f332447h = q23Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.y0(this.f332443d, this.f332444e, this.f332445f, this.f332446g, this.f332447h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.y0 y0Var = (mx0.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f332443d.f331934a.g0(this.f332444e, this.f332445f);
        this.f332446g.invoke(java.lang.Boolean.TRUE, this.f332447h);
        return jz5.f0.f302826a;
    }
}
