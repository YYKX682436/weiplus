package dl3;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f235349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.a0 f235350e;

    public x(dl3.a0 a0Var, int i17) {
        this.f235350e = a0Var;
        this.f235349d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onSeekComplete, seekPosition:%d", java.lang.Integer.valueOf(this.f235349d));
        dl3.a0 a0Var = this.f235350e;
        int i17 = a0Var.f235273e.f235292o;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "seek complete to startTime :%d", java.lang.Integer.valueOf(i17));
            a0Var.f235273e.f235292o = 0;
            return;
        }
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onSeekComplete");
        dl3.d0 d0Var = a0Var.f235273e;
        d0Var.o();
        if (d0Var.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "seek end, send play event!");
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onResumeEvent");
            com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
            am.g0 g0Var = audioPlayerEvent.f53990g;
            g0Var.f6716a = 1;
            g0Var.f6719d = com.tencent.tav.core.AssetExtension.SCENE_PLAY;
            g0Var.f6718c = d0Var.f235280c;
            g0Var.f6720e = d0Var.k();
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            dl3.f fVar = d0Var.f235348b;
            if (fVar != null) {
                ((dl3.l) fVar).a(d0Var.f235280c);
            }
        }
    }
}
