package yn1;

/* loaded from: classes9.dex */
public final class e2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(yn1.r2 r2Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463650d = r2Var;
        this.f463651e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.e2(this.f463650d, this.f463651e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.e2 e2Var = (yn1.e2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Zi();
        com.tencent.wechat.aff.migration.g gVar = this.f463650d.f463810a;
        if (gVar != null) {
            gVar.L(this.f463651e, true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
