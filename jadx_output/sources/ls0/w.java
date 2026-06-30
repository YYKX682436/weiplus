package ls0;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320940d;

    public w(ls0.r0 r0Var) {
        this.f320940d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i(this.f320940d.f320916t, "delay check frameDraw: " + this.f320940d.f320898f0);
        if (this.f320940d.f320898f0) {
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f320940d.f320916t, "after 1000 ms, first frame stil not draw!!!");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawTimeout");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 54L, 1L);
    }
}
