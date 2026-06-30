package si0;

/* loaded from: classes13.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.v f408150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f408151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(si0.v vVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408150d = vVar;
        this.f408151e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.q(this.f408150d, this.f408151e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        si0.q qVar = (si0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        si0.v vVar = this.f408150d;
        vVar.f408192o.setCurrentPlayTime(vVar.f408191n);
        si0.b bVar = vVar.C;
        if (bVar != null) {
            bVar.f408037a.seekTo((int) this.f408151e);
        }
        return jz5.f0.f302826a;
    }
}
