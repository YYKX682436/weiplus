package so2;

/* loaded from: classes8.dex */
public final class n5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.k5 f410497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f410499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ix0 f410500g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(so2.k5 k5Var, java.lang.String str, int i17, r45.ix0 ix0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410497d = k5Var;
        this.f410498e = str;
        this.f410499f = i17;
        this.f410500g = ix0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so2.n5(this.f410497d, this.f410498e, this.f410499f, this.f410500g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        so2.n5 n5Var = (so2.n5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ix0 ix0Var = this.f410500g;
        this.f410497d.a(this.f410498e, this.f410499f, ix0Var.getInteger(1), ix0Var.getString(2));
        return jz5.f0.f302826a;
    }
}
