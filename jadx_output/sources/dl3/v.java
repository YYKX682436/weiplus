package dl3;

/* loaded from: classes13.dex */
public abstract class v implements com.tencent.mm.plugin.music.player.base.l, dl3.w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f235347a;

    /* renamed from: b, reason: collision with root package name */
    public dl3.f f235348b = null;

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void b() {
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public b21.o f() {
        return null;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean h() {
        return false;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void j(boolean z17) {
        resume();
    }

    public abstract java.lang.String k();

    /* JADX WARN: Removed duplicated region for block: B:16:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r18) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl3.v.l(int):void");
    }

    public void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onPauseEvent");
        com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
        am.g0 g0Var = audioPlayerEvent.f53990g;
        g0Var.f6716a = 2;
        g0Var.f6719d = "pause";
        dl3.d0 d0Var = (dl3.d0) this;
        g0Var.f6718c = d0Var.f235280c;
        g0Var.f6720e = k();
        audioPlayerEvent.b(android.os.Looper.getMainLooper());
        dl3.f fVar = this.f235348b;
        if (fVar != null) {
            java.lang.String str = d0Var.f235280c;
            dl3.i iVar = ((dl3.l) fVar).f235336a;
            dl3.d0 o17 = iVar.o(str);
            if (o17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onPause player is null");
                return;
            }
            iVar.O(str, o17);
            iVar.w(str, o17);
            dl3.i.c(iVar);
            iVar.F(1800000);
        }
    }

    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onPrepareEvent");
        com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
        am.g0 g0Var = audioPlayerEvent.f53990g;
        g0Var.f6716a = 7;
        g0Var.f6719d = "canplay";
        dl3.d0 d0Var = (dl3.d0) this;
        g0Var.f6717b = d0Var.getDuration();
        g0Var.f6718c = d0Var.f235280c;
        g0Var.f6720e = k();
        if (!dl3.i.s().f235318k.contains(d0Var.f235280c)) {
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "removeSendPreparedEvent audioId:%s", d0Var.f235280c);
        dl3.i.s().f235318k.remove(d0Var.f235280c);
    }

    public void o() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onSeekToEvent");
        com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
        am.g0 g0Var = audioPlayerEvent.f53990g;
        g0Var.f6716a = 6;
        g0Var.f6719d = "seeked";
        g0Var.f6718c = ((dl3.d0) this).f235280c;
        g0Var.f6720e = k();
        audioPlayerEvent.b(android.os.Looper.getMainLooper());
    }

    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onStopEvent");
        com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
        am.g0 g0Var = audioPlayerEvent.f53990g;
        g0Var.f6716a = 3;
        g0Var.f6719d = "stop";
        dl3.d0 d0Var = (dl3.d0) this;
        g0Var.f6718c = d0Var.f235280c;
        g0Var.f6720e = k();
        audioPlayerEvent.b(android.os.Looper.getMainLooper());
        dl3.f fVar = this.f235348b;
        if (fVar != null) {
            java.lang.String str = d0Var.f235280c;
            dl3.i iVar = ((dl3.l) fVar).f235336a;
            dl3.d0 o17 = iVar.o(str);
            if (o17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onStop player is null");
                return;
            }
            iVar.O(str, o17);
            iVar.w(str, o17);
            dl3.i.c(iVar);
            iVar.F(1800000);
            iVar.T(str);
            iVar.A(str);
        }
    }
}
