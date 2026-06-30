package x03;

/* loaded from: classes15.dex */
public final class v implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451151d;

    public v(x03.i0 i0Var) {
        this.f451151d = i0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public final void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        x03.i0 i0Var = this.f451151d;
        com.tencent.mars.xlog.Log.i(i0Var.f451044a, iTPPlayer + " on complete");
        x03.s1 s1Var = i0Var.f451047d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 4, iTPPlayer);
        }
    }
}
