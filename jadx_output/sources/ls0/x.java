package ls0;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320956d;

    public x(ls0.r0 r0Var) {
        this.f320956d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i(this.f320956d.f320916t, "decode end after 1000, isFinishEncode:" + this.f320956d.f320902h0);
        if (this.f320956d.f320902h0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberCheckTimeout");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 91L, 1L);
        this.f320956d.f();
    }
}
