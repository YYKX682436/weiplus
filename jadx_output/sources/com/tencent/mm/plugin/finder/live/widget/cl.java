package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class cl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f118009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(com.tencent.mm.plugin.finder.live.widget.hl hlVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118009d = hlVar;
        this.f118010e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.cl(this.f118009d, this.f118010e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.cl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.widget.hl hlVar = this.f118009d;
        if (hlVar.f118573a.getVisibility() != 0) {
            hlVar.f118573a.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "plagPagAudio start pag");
        hlVar.f118573a.g();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("plagPagAudio start audio, audioPath:");
        java.lang.String path = this.f118010e;
        sb6.append(path);
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", sb6.toString());
        tn0.w0 Z0 = hlVar.f118574b.Z0();
        if (Z0 == null) {
            return null;
        }
        int hashCode = path.hashCode();
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "playLocalBgmAudio path:" + path + ", listener:null");
        Z0.G0();
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = new com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam(hashCode, path);
        audioMusicParam.publish = false;
        audioMusicParam.loopCount = -1;
        if (hashCode == 0) {
            audioMusicParam.f46245id = new java.util.Random().nextInt();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "playLocalBgmAudio generated random id " + audioMusicParam.f46245id + " for music play");
        }
        Z0.H1 = audioMusicParam;
        Z0.T().getAudioEffectManager().setMusicPlayoutVolume(audioMusicParam.f46245id, 50);
        Z0.T().getAudioEffectManager().setMusicObserver(audioMusicParam.f46245id, new tn0.k(null, Z0));
        Z0.T().getAudioEffectManager().startPlayMusic(audioMusicParam);
        return jz5.f0.f302826a;
    }
}
