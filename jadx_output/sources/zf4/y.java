package zf4;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.a0 f472706d;

    public y(zf4.a0 a0Var) {
        this.f472706d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        zf4.a0 a0Var = this.f472706d;
        long j17 = currentTimeMillis - a0Var.f472643n;
        boolean z17 = a0Var.f472641i;
        boolean z18 = a0Var.f472640h;
        boolean z19 = a0Var.f472639g;
        if (z17) {
            if (j17 < 60000) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindService", "ERR: Try Run service runningFlag:" + a0Var.f472641i + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + a0Var.f472640h + " recving:" + a0Var.f472639g);
        }
        a0Var.f472641i = true;
        a0Var.f472640h = false;
        a0Var.f472642m = 3;
        a0Var.f472639g = false;
        a0Var.f472644o.b();
        a0Var.f472645p.c(10L, 10L);
    }
}
