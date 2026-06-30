package dl3;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.i f235337d;

    public m(dl3.i iVar) {
        this.f235337d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "stopAudioDelayRunnable, run");
        dl3.i iVar = this.f235337d;
        java.util.Iterator it = iVar.f235313f.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (iVar.p(str) == 0) {
                iVar.y(str);
            }
        }
    }
}
