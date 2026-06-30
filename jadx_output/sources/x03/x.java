package x03;

/* loaded from: classes15.dex */
public final class x implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451160d;

    public x(x03.i0 i0Var) {
        this.f451160d = i0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public final void onStateChange(int i17, int i18) {
        x03.s1 s1Var;
        x03.i0 i0Var = this.f451160d;
        com.tencent.mars.xlog.Log.i(i0Var.f451044a, i0Var.f451045b + " prestate: " + i17 + ", curState: " + i18);
        i0Var.f451051h = i18;
        if (i18 != 3 || (s1Var = i0Var.f451047d) == null) {
            return;
        }
        ((x03.i1) s1Var).c(false, 5, null);
    }
}
