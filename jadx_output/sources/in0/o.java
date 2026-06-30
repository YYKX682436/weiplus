package in0;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f292765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f292766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f292767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(in0.q qVar, int i17, long j17) {
        super(0);
        this.f292765d = qVar;
        this.f292766e = i17;
        this.f292767f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p05.l0 l0Var = (p05.l0) this.f292765d.W1;
        int i17 = this.f292766e;
        if (l0Var.d(i17)) {
            long j17 = l0Var.f350580f;
            long j18 = this.f292767f;
            if (j18 != j17) {
                if (j17 != 0) {
                    rh0.d0 d0Var = l0Var.f350576b;
                    if (d0Var != null) {
                        ((p05.l4) d0Var).z(j17, null);
                    }
                    l0Var.f350580f = 0L;
                }
                l0Var.f350580f = j18;
                yz5.a aVar = l0Var.f350581g;
                if (aVar != null) {
                    aVar.invoke();
                }
                l0Var.f350581g = null;
                rh0.d0 d0Var2 = l0Var.f350576b;
                if (d0Var2 != null) {
                    ((p05.l4) d0Var2).z(j18, new p05.k0(l0Var));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveGestureRenderEffect", "#applyAnimationCallback effectId=" + i17 + " not match");
        }
        return jz5.f0.f302826a;
    }
}
