package x03;

/* loaded from: classes15.dex */
public final class o0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f451083d;

    public o0(x03.u0 u0Var) {
        this.f451083d = u0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        x03.u0 u0Var = this.f451083d;
        com.tencent.mars.xlog.Log.i(u0Var.f451133a, "FVPlayer video_status " + iTPPlayer + " prepared");
        u0Var.f451142j = true;
        x03.s1 s1Var = u0Var.f451136d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 3, iTPPlayer);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1414, 0);
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = u0Var.f451145m;
        if (!(b4Var2 != null && b4Var2.e()) || (b4Var = u0Var.f451145m) == null) {
            return;
        }
        b4Var.c(500L, 500L);
    }
}
