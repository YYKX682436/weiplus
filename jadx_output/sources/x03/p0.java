package x03;

/* loaded from: classes15.dex */
public final class p0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f451087d;

    public p0(x03.u0 u0Var) {
        this.f451087d = u0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public final void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        x03.u0 u0Var = this.f451087d;
        com.tencent.mars.xlog.Log.e(u0Var.f451133a, "tplayer log " + iTPPlayer + " error " + i17 + ' ' + i18);
        x03.s1 s1Var = u0Var.f451136d;
        if (s1Var != null) {
            ((x03.i1) s1Var).a(i18, i17, "视频加载失败，请重试", "重试");
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1414, 1);
    }
}
