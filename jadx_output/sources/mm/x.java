package mm;

/* loaded from: classes12.dex */
public class x extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public long f328564b = 0;

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "bg");
        this.f328564b = android.os.SystemClock.uptimeMillis();
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: mm.x$$a
            @Override // java.lang.Runnable
            public final void run() {
                mm.x.this.getClass();
                synchronized ("MicroMsg.NotifyPowerInspector") {
                    ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.NotifyPowerInspector");
                    mm.w.a();
                }
            }
        }, "MicroMsg.NotifyPowerInspector");
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "fg");
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: mm.x$$b
            @Override // java.lang.Runnable
            public final void run() {
                mm.x xVar = mm.x.this;
                xVar.getClass();
                synchronized ("MicroMsg.NotifyPowerInspector") {
                    ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.NotifyPowerInspector");
                }
                final long uptimeMillis = xVar.f328564b > 0 ? android.os.SystemClock.uptimeMillis() - xVar.f328564b : 0L;
                ((ku5.t0) ku5.t0.f312615d).l(new java.lang.Runnable() { // from class: mm.x$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j17 = uptimeMillis;
                        synchronized ("MicroMsg.NotifyPowerInspector") {
                            if (!com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
                                if (j17 > 0) {
                                    long max = java.lang.Math.max(1L, j17 / 60000);
                                    if (z65.c.a() || max > 10) {
                                        mm.w.k(max, false);
                                    }
                                }
                                mm.w.a();
                            }
                        }
                    }
                }, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "MicroMsg.NotifyPowerInspector");
            }
        }, "MicroMsg.NotifyPowerInspector");
    }
}
