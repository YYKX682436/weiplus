package x03;

/* loaded from: classes15.dex */
public final class w implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451154d;

    public w(x03.i0 i0Var) {
        this.f451154d = i0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public final void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        x03.i0 i0Var = this.f451154d;
        com.tencent.mars.xlog.Log.i(i0Var.f451044a, iTPPlayer + " on seek");
        x03.s1 s1Var = i0Var.f451047d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 9, iTPPlayer);
        }
    }
}
