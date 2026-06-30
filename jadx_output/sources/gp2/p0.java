package gp2;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.q0 f274290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(gp2.q0 q0Var) {
        super(0);
        this.f274290d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gp2.q0 q0Var = this.f274290d;
        q0Var.getClass();
        java.lang.Object obj = -1;
        try {
            obj = new gp2.m0(q0Var).invoke();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("NearbyLiveItemOnTouchEventAdapter", "safelyInvoke exception", th6.getMessage());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            pm0.v.X(new gp2.o0(q0Var, valueOf.intValue()));
        }
        return jz5.f0.f302826a;
    }
}
