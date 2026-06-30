package yx;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f467053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f467054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f467055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kotlinx.coroutines.y0 y0Var, android.content.Context context, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467053d = y0Var;
        this.f467054e = context;
        this.f467055f = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx.n(this.f467053d, this.f467054e, this.f467055f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx.n nVar = (yx.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.d(this.f467053d, null, null, new yx.m(this.f467054e, this.f467055f, null), 3, null);
        return jz5.f0.f302826a;
    }
}
