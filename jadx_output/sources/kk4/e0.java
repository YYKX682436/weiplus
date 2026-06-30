package kk4;

/* loaded from: classes15.dex */
public final class e0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f308524d;

    public e0(kk4.f0 f0Var) {
        this.f308524d = f0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public final void onStateChange(int i17, int i18) {
        kk4.f0 f0Var = this.f308524d;
        com.tencent.mars.xlog.Log.i(f0Var.e(), "state from:" + i17 + " to:" + i18 + " id:" + f0Var.f308533i);
        if (i18 == 4) {
            f0Var.f308532h = java.lang.System.currentTimeMillis() - f0Var.f308531g;
            com.tencent.mars.xlog.Log.i(f0Var.e(), "prepared cost:" + f0Var.f308532h + " id:" + f0Var.f308533i);
        }
        com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener = f0Var.f308541q;
        if (iOnStateChangeListener != null) {
            iOnStateChangeListener.onStateChange(i17, i18);
        }
    }
}
