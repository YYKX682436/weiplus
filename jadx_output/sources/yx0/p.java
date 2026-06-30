package yx0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f467529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f467530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467531f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467529d = mJTime;
        this.f467530e = mJTime2;
        this.f467531f = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.p(this.f467529d, this.f467530e, this.f467531f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx0.p pVar = (yx0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "ReachToRecordMaxTime lastFrameTime:" + this.f467529d.toSeconds() + " maxRecordingDuration:" + this.f467530e.toSeconds());
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.f467531f.f467177d).M0(true);
        return jz5.f0.f302826a;
    }
}
