package x03;

/* loaded from: classes15.dex */
public final class s0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f451124d;

    public s0(x03.u0 u0Var) {
        this.f451124d = u0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public final void onStateChange(int i17, int i18) {
        x03.s1 s1Var;
        x03.u0 u0Var = this.f451124d;
        com.tencent.mars.xlog.Log.i(u0Var.f451133a, u0Var.f451134b + " prestate: " + i17 + ", curState: " + i18);
        u0Var.f451141i = i18;
        if (i18 != 3 || (s1Var = u0Var.f451136d) == null) {
            return;
        }
        ((x03.i1) s1Var).c(false, 5, null);
    }
}
