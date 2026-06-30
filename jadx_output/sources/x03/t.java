package x03;

/* loaded from: classes15.dex */
public final class t implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451125d;

    public t(x03.i0 i0Var) {
        this.f451125d = i0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        x03.i0 i0Var = this.f451125d;
        com.tencent.mars.xlog.Log.i(i0Var.f451044a, "FVPlayer video_status " + iTPPlayer + " prepared");
        i0Var.f451052i = true;
        x03.s1 s1Var = i0Var.f451047d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 3, iTPPlayer);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1414, 0);
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = i0Var.f451056m;
        if (!(b4Var2 != null && b4Var2.e()) || (b4Var = i0Var.f451056m) == null) {
            return;
        }
        b4Var.c(500L, 500L);
    }
}
