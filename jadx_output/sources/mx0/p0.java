package mx0;

/* loaded from: classes5.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f332205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yz5.p pVar, boolean z17, mx0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332205d = pVar;
        this.f332206e = z17;
        this.f332207f = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.p0(this.f332205d, this.f332206e, this.f332207f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.p0 p0Var = (mx0.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f332205d.invoke(java.lang.Boolean.valueOf(this.f332206e), java.lang.Boolean.valueOf(this.f332207f.f331936c));
        return jz5.f0.f302826a;
    }
}
