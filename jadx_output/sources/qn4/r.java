package qn4;

/* loaded from: classes12.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.t f365270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn4.a f365271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f365272f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qn4.t tVar, qn4.a aVar, java.lang.Throwable th6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f365270d = tVar;
        this.f365271e = aVar;
        this.f365272f = th6;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qn4.r(this.f365270d, this.f365271e, this.f365272f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qn4.r rVar = (qn4.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f365270d.d();
        java.lang.String message = this.f365272f.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        ((qn4.w) this.f365271e).a(9999, message);
        return jz5.f0.f302826a;
    }
}
