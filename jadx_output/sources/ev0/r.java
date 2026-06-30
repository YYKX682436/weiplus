package ev0;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f256872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f256873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f256874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ev0.t f256875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f256876h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, yz5.p pVar, ev0.t tVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f256873e = audioCacheInfo;
        this.f256874f = pVar;
        this.f256875g = tVar;
        this.f256876h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ev0.r(this.f256873e, this.f256874f, this.f256875g, this.f256876h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ev0.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ev0.t tVar = this.f256875g;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f256872d;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f256873e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPlayer", "play music: " + audioCacheInfo);
                yz5.p pVar = this.f256874f;
                if (pVar != null) {
                    this.f256872d = 1;
                    if (pVar.invoke(audioCacheInfo, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            ev0.t.b(tVar, audioCacheInfo, this.f256876h);
            ev0.b bVar = tVar.f256879b;
            if (bVar != null) {
                bVar.O();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MovieComposingMusicPlayer", "play music " + audioCacheInfo + " fail:" + e17.getLocalizedMessage());
        }
        return jz5.f0.f302826a;
    }
}
