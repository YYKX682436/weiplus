package dl3;

/* loaded from: classes13.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f235278d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.d0 f235279e;

    public c0(dl3.d0 d0Var, dl3.a0 a0Var) {
        this.f235279e = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl3.d0 d0Var = this.f235279e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "start run play progress task");
        while (!this.f235278d) {
            try {
                if (d0Var.f235282e != null && d0Var.i() && d0Var.f235280c.equalsIgnoreCase(d0Var.f235281d.f333836a) && d0Var.f235282e != null && d0Var.i()) {
                    d0Var.f235282e.getCurrentPosition();
                    d0Var.f235282e.getDuration();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "PlayProgressTask run exception:" + e17.getMessage());
            }
            try {
                java.lang.Thread.sleep(200L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
