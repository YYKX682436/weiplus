package ls0;

/* loaded from: classes10.dex */
public final class q0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320884e;

    public q0(ls0.r0 r0Var) {
        this.f320884e = r0Var;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MediaCodecRemuxer#timeoutInvoke";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e(this.f320884e.f320916t, "remux error! handing one frame time out ,isInvokeEndCallback:" + this.f320884e.U);
        if (this.f320884e.U) {
            return;
        }
        this.f320884e.i(!r0.f320896e0, true);
    }
}
