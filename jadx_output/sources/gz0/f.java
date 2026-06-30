package gz0;

/* loaded from: classes13.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gz0.h f277659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gz0.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277659d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gz0.f(this.f277659d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gz0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.thumbplayer.api.ITPPlayer createTPPlayer;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer;
        jz5.f0 f0Var = jz5.f0.f302826a;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gz0.h hVar = this.f277659d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "startPlay: start create tpPlayer");
            createTPPlayer = com.tencent.thumbplayer.api.TPPlayerFactory.createTPPlayer(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (createTPPlayer == null) {
            return f0Var;
        }
        hVar.f277665e = createTPPlayer;
        long j17 = hVar.f277662b;
        java.lang.String str = hVar.f277661a;
        gz0.d dVar = hVar.f277666f;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "startPlay: start set params url " + str + ", startTime:" + j17 + " endTime:" + hVar.f277663c);
        createTPPlayer.setDataSource(str);
        createTPPlayer.setOnPreparedListener(dVar);
        createTPPlayer.setOnInfoListener(dVar);
        createTPPlayer.setOnPlayerStateChangeListener(dVar);
        createTPPlayer.setOnCompletionListener(dVar);
        createTPPlayer.setOnErrorListener(dVar);
        createTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(100, j17));
        createTPPlayer.setLoopback(true, hVar.f277662b, hVar.f277663c);
        createTPPlayer.prepareAsync();
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        if ((voipCheckIsDeviceUsingEvent.f54943g.f8247c || iq.b.H()) && (iTPPlayer = hVar.f277665e) != null) {
            iTPPlayer.setAudioGainRatio(0.0f);
        }
        kotlin.Result.m521constructorimpl(f0Var);
        return f0Var;
    }
}
