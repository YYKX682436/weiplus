package gx0;

/* loaded from: classes5.dex */
public final class l8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.ExportInitParam f276671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.tencent.maas.moviecomposing.ExportInitParam exportInitParam, gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276671d = exportInitParam;
        this.f276672e = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.l8(this.f276671d, this.f276672e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.l8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.maas.moviecomposing.ExportSession exportSession = new com.tencent.maas.moviecomposing.ExportSession(this.f276671d);
        this.f276672e.T = exportSession;
        return exportSession;
    }
}
