package x03;

/* loaded from: classes15.dex */
public final class r0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f451110d;

    public r0(x03.u0 u0Var) {
        this.f451110d = u0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public final void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        x03.u0 u0Var = this.f451110d;
        com.tencent.mars.xlog.Log.i(u0Var.f451133a, iTPPlayer + " on seek");
        x03.s1 s1Var = u0Var.f451136d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 9, iTPPlayer);
        }
    }
}
