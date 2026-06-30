package yr3;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f465046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f465047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465048f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(yz5.p pVar, kotlin.jvm.internal.h0 h0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465046d = pVar;
        this.f465047e = h0Var;
        this.f465048f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yr3.u(this.f465046d, this.f465047e, this.f465048f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yr3.u uVar = (yr3.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f465046d.invoke(this.f465047e.f310123d, this.f465048f);
        return jz5.f0.f302826a;
    }
}
