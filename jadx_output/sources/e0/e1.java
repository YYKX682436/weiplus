package e0;

/* loaded from: classes14.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(e0.f1 f1Var) {
        super(1);
        this.f245561d = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.compose.foundation.lazy.layout.t tVar;
        float f17 = -((java.lang.Number) obj).floatValue();
        e0.f1 f1Var = this.f245561d;
        if ((f17 >= 0.0f || f1Var.f245589o) && (f17 <= 0.0f || f1Var.f245588n)) {
            if (!(java.lang.Math.abs(f1Var.f245578d) <= 0.5f)) {
                throw new java.lang.IllegalStateException(("entered drag with non-zero pending scroll: " + f1Var.f245578d).toString());
            }
            float f18 = f1Var.f245578d + f17;
            f1Var.f245578d = f18;
            if (java.lang.Math.abs(f18) > 0.5f) {
                float f19 = f1Var.f245578d;
                s1.r1 r1Var = f1Var.f245584j;
                if (r1Var != null) {
                    ((u1.w) r1Var).h();
                }
                boolean z17 = f1Var.f245580f;
                if (z17) {
                    float f27 = f19 - f1Var.f245578d;
                    if (z17) {
                        e0.h0 f28 = f1Var.f();
                        if (!f28.b().isEmpty()) {
                            boolean z18 = f27 < 0.0f;
                            int i17 = z18 ? ((e0.q0) ((e0.n) kz5.n0.i0(f28.b()))).f245679b + 1 : ((e0.q0) ((e0.n) kz5.n0.X(f28.b()))).f245679b - 1;
                            if (i17 != f1Var.f245581g) {
                                if (i17 >= 0 && i17 < f28.a()) {
                                    if (f1Var.f245583i != z18 && (tVar = f1Var.f245582h) != null) {
                                        tVar.cancel();
                                    }
                                    f1Var.f245583i = z18;
                                    f1Var.f245581g = i17;
                                    f1Var.f245582h = f1Var.f245590p.a(i17, f1Var.f245587m);
                                }
                            }
                        }
                    }
                }
            }
            if (java.lang.Math.abs(f1Var.f245578d) > 0.5f) {
                f17 -= f1Var.f245578d;
                f1Var.f245578d = 0.0f;
            }
        } else {
            f17 = 0.0f;
        }
        return java.lang.Float.valueOf(-f17);
    }
}
