package p05;

/* loaded from: classes3.dex */
public final class k0 implements com.tencent.mm.xeffect.IWeEffectCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p05.l0 f350566a;

    public k0(p05.l0 l0Var) {
        this.f350566a = l0Var;
    }

    @Override // com.tencent.mm.xeffect.IWeEffectCallback
    public void a(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("FinderLiveGestureRenderEffect", "#onAnimationStateChange status=" + i17 + " playedTime=" + i18 + " maxPlayTime=" + i19 + " instanceId=" + i27);
        if (i17 == 1) {
            p05.l0 l0Var = this.f350566a;
            long j17 = l0Var.f350580f;
            if (j17 != 0) {
                rh0.d0 d0Var = l0Var.f350576b;
                if (d0Var != null) {
                    ((p05.l4) d0Var).z(j17, null);
                }
                l0Var.f350580f = 0L;
                yz5.a aVar = l0Var.f350582h;
                if (aVar != null) {
                    aVar.invoke();
                }
                l0Var.f350582h = null;
            }
        }
    }
}
