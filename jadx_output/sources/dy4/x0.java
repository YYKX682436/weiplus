package dy4;

/* loaded from: classes15.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244733d;

    public x0(dy4.f1 f1Var) {
        this.f244733d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar;
        dy4.f1 f1Var = this.f244733d;
        if (!f1Var.I) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onMediaPlayerSeekComplete, mp released");
            return;
        }
        dy4.w wVar2 = f1Var.U;
        if (wVar2 != null) {
            try {
                wVar2.a("onVideoSeekEnd", wVar2.c());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e(wVar2.f244715a, "onVideoSeedEnd fail", e17);
            }
        }
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onSeekComplete");
        if (f1Var.f244629p) {
            if (f1Var.M && f1Var.N) {
                com.tencent.mars.xlog.Log.e(f1Var.x(), "onSeekComplete, background not allow play");
                return;
            }
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onSeekComplete, start when seek complete");
            f1Var.f244629p = false;
            f1Var.A(false, true);
            return;
        }
        ye1.e eVar = f1Var.f244627n;
        kotlin.jvm.internal.o.d(eVar);
        boolean isPlaying = eVar.isPlaying();
        if (!f1Var.f244631q || (f1Var.M && f1Var.N)) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onSeekComplete, video not playing before seeking, isCurrentPlaying:%b", java.lang.Boolean.valueOf(isPlaying));
            if (!isPlaying && f1Var.J()) {
                com.tencent.mars.xlog.Log.i(f1Var.x(), "onSeekComplete, dispatch pause again");
                dy4.w wVar3 = f1Var.U;
                if (wVar3 != null) {
                    wVar3.e(false);
                }
            }
            if (isPlaying && f1Var.M && f1Var.N) {
                f1Var.Y = new java.util.concurrent.atomic.AtomicBoolean(true);
                f1Var.z();
                return;
            }
            return;
        }
        ye1.e eVar2 = f1Var.f244627n;
        kotlin.jvm.internal.o.d(eVar2);
        long duration = eVar2.getDuration();
        ye1.e eVar3 = f1Var.f244627n;
        kotlin.jvm.internal.o.d(eVar3);
        long currentPosition = eVar3.getCurrentPosition();
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onSeekComplete, video playing before seeking, isCurrentPlaying:%b, position:%s, duration:%s", java.lang.Boolean.valueOf(isPlaying), java.lang.Long.valueOf(currentPosition), java.lang.Long.valueOf(duration));
        f1Var.f244631q = false;
        long j17 = 1000;
        if (currentPosition / j17 < duration / j17) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onSeekComplete, video not end");
            if (isPlaying && f1Var.J()) {
                com.tencent.mars.xlog.Log.i(f1Var.x(), "onSeekComplete, dispatch play again");
                dy4.w wVar4 = f1Var.U;
                if (wVar4 != null) {
                    wVar4.f(false);
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onSeekComplete, video ends");
        ye1.e eVar4 = f1Var.f244627n;
        if (eVar4 != null) {
            eVar4.pause();
        }
        if (f1Var.J() && (wVar = f1Var.U) != null) {
            wVar.f(false);
        }
        ye1.e eVar5 = f1Var.f244627n;
        if (eVar5 != null) {
            eVar5.start();
        }
    }
}
