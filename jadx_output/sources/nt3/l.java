package nt3;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f339796d;

    public l(nt3.a0 a0Var) {
        this.f339796d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i(this.f339796d.f339722m, "decode end after 1000, isFinishEncode:" + this.f339796d.L);
        if (this.f339796d.L) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberCheckTimeout");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 91L, 1L);
        this.f339796d.f();
    }
}
