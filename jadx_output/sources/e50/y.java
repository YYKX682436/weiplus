package e50;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f249550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f249551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f249552f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j17, long j18, long j19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f249550d = j17;
        this.f249551e = j18;
        this.f249552f = j19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e50.y(this.f249550d, this.f249551e, this.f249552f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        e50.y yVar = (e50.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jx3.f.INSTANCE.idkeyStat(this.f249550d, this.f249551e, this.f249552f, false);
        return jz5.f0.f302826a;
    }
}
