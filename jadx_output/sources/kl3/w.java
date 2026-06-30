package kl3;

/* loaded from: classes11.dex */
public class w implements f25.f {
    public w(kl3.z zVar) {
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "audio focus lossTransient");
        if (kl3.t.g().a().g()) {
            kl3.t.g().a().b();
        }
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "audio focus gain");
        if (kl3.t.g().a().g()) {
            kl3.t.g().a().j(false);
        }
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "audio focus loss, passive pause");
        if (kl3.t.g().a().g()) {
            kl3.t.g().a().b();
            kl3.t.g().c();
            kl3.t.g().p(600000);
        }
    }
}
