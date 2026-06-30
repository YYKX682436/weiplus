package ev0;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev0.t f256851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f256852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f256853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ev0.t tVar, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f256851d = tVar;
        this.f256852e = z17;
        this.f256853f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ev0.j(this.f256851d, this.f256852e, this.f256853f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ev0.j jVar = (ev0.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPlayer", "pause play");
        ev0.b bVar = this.f256851d.f256879b;
        if (bVar != null) {
            kk4.b.i(bVar, this.f256852e, false, 2, null);
        }
        yz5.a aVar2 = this.f256853f;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return jz5.f0.f302826a;
    }
}
