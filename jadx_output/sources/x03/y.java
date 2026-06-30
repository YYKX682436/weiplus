package x03;

/* loaded from: classes15.dex */
public final class y implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451169d;

    public y(x03.i0 i0Var) {
        this.f451169d = i0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public final void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        x03.s1 s1Var;
        x03.i0 i0Var = this.f451169d;
        com.tencent.mars.xlog.Log.i(i0Var.f451044a, "tpplayer log " + iTPPlayer + ", what:" + i17 + ", arg1:" + j17 + ", arg2:" + j18 + ", extra:" + obj);
        if (i17 == 108) {
            com.tencent.mars.xlog.Log.i(i0Var.f451044a, "video_status firstFrame ok: " + iTPPlayer);
            x03.s1 s1Var2 = i0Var.f451047d;
            if (s1Var2 != null) {
                ((x03.i1) s1Var2).c(false, 10, iTPPlayer);
                return;
            }
            return;
        }
        if (i17 == 503) {
            com.tencent.mars.xlog.Log.i(i0Var.f451044a, "video_status getMessage");
            if ((obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo ? (com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo) obj : null) == null || (s1Var = i0Var.f451047d) == null) {
                return;
            }
            ((x03.i1) s1Var).b((com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo) obj);
            return;
        }
        if (i17 != 200) {
            if (i17 != 201) {
                return;
            }
            com.tencent.mars.xlog.Log.i(i0Var.f451044a, "video_status buffer ok: " + iTPPlayer);
            x03.s1 s1Var3 = i0Var.f451047d;
            if (s1Var3 != null) {
                ((x03.i1) s1Var3).c(false, 8, iTPPlayer);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(i0Var.f451044a, "video_status need buffer: " + iTPPlayer + " mediaId:" + i0Var.f451050g);
        x03.s1 s1Var4 = i0Var.f451047d;
        if (s1Var4 != null) {
            ((x03.i1) s1Var4).c(false, 7, iTPPlayer);
        }
    }
}
