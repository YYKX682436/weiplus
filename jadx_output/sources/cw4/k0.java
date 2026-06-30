package cw4;

/* loaded from: classes8.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f224233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(cw4.m0 m0Var) {
        super(0);
        this.f224233d = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cw4.y yVar;
        cw4.m0 m0Var = this.f224233d;
        if (m0Var.f224247p.f11605c.a(androidx.lifecycle.n.STARTED)) {
            hy4.g0 g0Var = m0Var.f224252u;
            int i17 = g0Var.f286105c;
            androidx.lifecycle.j0 j0Var = m0Var.f224253v;
            if (i17 == 2) {
                j0Var.postValue(cw4.y.f224303h);
            } else {
                double d17 = g0Var.f286104b;
                if (0.7d <= d17 && d17 <= 1.0d) {
                    yVar = cw4.y.f224300e;
                } else {
                    if (0.2d <= d17 && d17 <= 0.7d) {
                        yVar = cw4.y.f224302g;
                    } else {
                        yVar = 0.0d <= d17 && d17 <= 0.2d ? cw4.y.f224301f : cw4.y.f224299d;
                    }
                }
                j0Var.postValue(yVar);
            }
        } else {
            com.tencent.mars.xlog.Log.w(m0Var.f224239e, "pageLogic is inActive!");
        }
        return jz5.f0.f302826a;
    }
}
