package ev0;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f256862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f256863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f256864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ev0.t f256865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, long j18, ev0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f256863e = j17;
        this.f256864f = j18;
        this.f256865g = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ev0.o oVar = new ev0.o(this.f256863e, this.f256864f, this.f256865g, continuation);
        oVar.f256862d = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ev0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPlayRange [");
        long j17 = this.f256863e;
        sb6.append(j17);
        sb6.append(", ");
        long j18 = this.f256864f;
        sb6.append(j18);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPlayer", sb6.toString());
        ev0.b bVar = this.f256865g.f256879b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPlayer", "setPlayRange skip: player is null");
            return f0Var;
        }
        bVar.A(true);
        bVar.H(j17, j18);
        kk4.b.f(bVar, (int) j17, false, null, 4, null);
        bVar.O();
        return f0Var;
    }
}
