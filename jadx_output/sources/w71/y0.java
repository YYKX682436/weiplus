package w71;

/* loaded from: classes11.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f443471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f443472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(yz5.l lVar, long j17, java.lang.Exception exc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f443470d = lVar;
        this.f443471e = j17;
        this.f443472f = exc;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new w71.y0(this.f443470d, this.f443471e, this.f443472f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        w71.y0 y0Var = (w71.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bw5.a0 a0Var = new bw5.a0();
        a0Var.c(this.f443471e);
        a0Var.b(-1);
        a0Var.f24954f = this.f443472f.getMessage();
        a0Var.f24957i[3] = true;
        this.f443470d.invoke(a0Var);
        return jz5.f0.f302826a;
    }
}
