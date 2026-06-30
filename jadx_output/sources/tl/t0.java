package tl;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.q0 f420144d;

    public t0(tl.q0 q0Var) {
        this.f420144d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f420144d.f420103q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "Try Run service runningFlag:" + this.f420144d.f420101o + " timeWait:" + currentTimeMillis + " sending:" + this.f420144d.f420100n + " recving:" + this.f420144d.f420099m + "[" + this.f420144d.toString() + "]");
        if (this.f420144d.f420101o) {
            if (currentTimeMillis < 60000) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoiceService", "ERR: Try Run service runningFlag:" + this.f420144d.f420101o + " timeWait:" + currentTimeMillis + ">=MAX_TIME_WAIT sending:" + this.f420144d.f420100n + " recving:" + this.f420144d.f420099m);
        }
        tl.q0 q0Var = this.f420144d;
        q0Var.f420101o = true;
        q0Var.f420100n = false;
        q0Var.f420102p = 3;
        q0Var.f420099m = false;
        q0Var.f420104r.b();
        if (this.f420144d.f420095f) {
            tl.q0.b(this.f420144d);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoiceService", "acc not ready");
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|run";
    }
}
