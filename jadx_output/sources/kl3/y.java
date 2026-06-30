package kl3;

/* loaded from: classes11.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f308852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kl3.z f308853e;

    public y(kl3.z zVar, kl3.v vVar) {
        this.f308853e = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String a17 = xl3.c.a(this.f308853e.o());
        int i17 = this.f308853e.f308855d;
        boolean z17 = false;
        for (int i18 = 0; i18 < this.f308852d.size(); i18++) {
            if (((java.lang.String) this.f308852d.get(i18)).equals(a17)) {
                z17 = true;
                i17 = i18;
            }
        }
        if (z17) {
            synchronized (this.f308853e.f308858g) {
                for (int i19 = i17 + 1; i19 < this.f308852d.size(); i19++) {
                    ((java.util.ArrayList) this.f308853e.f308856e).add((java.lang.String) this.f308852d.get(i19));
                }
                for (int i27 = 0; i27 < i17; i27++) {
                    ((java.util.ArrayList) this.f308853e.f308856e).add((java.lang.String) this.f308852d.get(i27));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "GetMusicWrapperListTask currentMusicSize=%d currentMusicIndex=%d", java.lang.Integer.valueOf(((java.util.ArrayList) this.f308853e.f308856e).size()), java.lang.Integer.valueOf(this.f308853e.f308855d));
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
            musicPlayerEvent.f54512g.f7036b = 5;
            musicPlayerEvent.e();
        }
    }
}
