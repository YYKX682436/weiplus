package vh0;

/* loaded from: classes8.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.d1 f436972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f436974f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(vh0.d1 d1Var, java.lang.String str, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436972d = d1Var;
        this.f436973e = str;
        this.f436974f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.u2(this.f436972d, this.f436973e, this.f436974f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vh0.u2 u2Var = (vh0.u2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((vh0.f2) this.f436972d).Ni(this.f436973e, this.f436974f, true);
        return jz5.f0.f302826a;
    }
}
