package si0;

/* loaded from: classes13.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f408076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f408077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(si0.l0 l0Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408076d = l0Var;
        this.f408077e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.g0(this.f408076d, this.f408077e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        si0.g0 g0Var = (si0.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        si0.l0 l0Var = this.f408076d;
        l0Var.f408112o.setCurrentPlayTime(l0Var.f408111n);
        si0.b bVar = l0Var.C;
        if (bVar != null) {
            bVar.f408037a.seekTo((int) this.f408077e);
        }
        return jz5.f0.f302826a;
    }
}
