package ev0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev0.t f256870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f256871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ev0.t tVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f256870d = tVar;
        this.f256871e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ev0.q(this.f256870d, this.f256871e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ev0.q qVar = (ev0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPlayer", "start download");
        ev0.t tVar = this.f256870d;
        ev0.b bVar = tVar.f256879b;
        kk4.h hVar = bVar != null ? bVar.f308580e : null;
        if (hVar != null) {
            hVar.f308551m = new ev0.p(tVar, this.f256871e);
        }
        if (bVar != null) {
            bVar.L();
        }
        return jz5.f0.f302826a;
    }
}
