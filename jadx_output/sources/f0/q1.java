package f0;

/* loaded from: classes14.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(f0.r1 r1Var) {
        super(1);
        this.f258202d = r1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        int i18;
        int i19;
        float f17 = -((java.lang.Number) obj).floatValue();
        f0.r1 r1Var = this.f258202d;
        if ((f17 >= 0.0f || r1Var.f258224r) && (f17 <= 0.0f || r1Var.f258223q)) {
            if (!(java.lang.Math.abs(r1Var.f258210d) <= 0.5f)) {
                throw new java.lang.IllegalStateException(("entered drag with non-zero pending scroll: " + r1Var.f258210d).toString());
            }
            float f18 = r1Var.f258210d + f17;
            r1Var.f258210d = f18;
            if (java.lang.Math.abs(f18) > 0.5f) {
                float f19 = r1Var.f258210d;
                s1.r1 r1Var2 = r1Var.f258219m;
                if (r1Var2 != null) {
                    ((u1.w) r1Var2).h();
                }
                boolean z17 = r1Var.f258215i;
                if (z17) {
                    float f27 = f19 - r1Var.f258210d;
                    if (z17) {
                        f0.l0 f28 = r1Var.f();
                        if (!f28.b().isEmpty()) {
                            boolean z18 = f27 < 0.0f;
                            if (z18) {
                                f0.q0 q0Var = (f0.q0) ((f0.k) kz5.n0.i0(f28.b()));
                                i17 = (r1Var.f258213g ? q0Var.f258190e : q0Var.f258191f) + 1;
                                i18 = ((f0.q0) ((f0.k) kz5.n0.i0(f28.b()))).f258188c + 1;
                            } else {
                                f0.q0 q0Var2 = (f0.q0) ((f0.k) kz5.n0.X(f28.b()));
                                i17 = (r1Var.f258213g ? q0Var2.f258190e : q0Var2.f258191f) - 1;
                                i18 = ((f0.q0) ((f0.k) kz5.n0.X(f28.b()))).f258188c - 1;
                            }
                            if (i17 != r1Var.f258216j) {
                                if (i18 >= 0 && i18 < f28.a()) {
                                    boolean z19 = r1Var.f258218l;
                                    o0.i iVar = r1Var.f258217k;
                                    if (z19 != z18 && (i19 = iVar.f341852f) > 0) {
                                        java.lang.Object[] objArr = iVar.f341850d;
                                        int i27 = 0;
                                        do {
                                            ((androidx.compose.foundation.lazy.layout.t) objArr[i27]).cancel();
                                            i27++;
                                        } while (i27 < i19);
                                    }
                                    r1Var.f258218l = z18;
                                    r1Var.f258216j = i17;
                                    iVar.e();
                                    java.util.List list = (java.util.List) r1Var.f258221o.invoke(new f0.i2(i17));
                                    int size = list.size();
                                    for (int i28 = 0; i28 < size; i28++) {
                                        jz5.l lVar = (jz5.l) list.get(i28);
                                        iVar.b(r1Var.f258225s.a(((java.lang.Number) lVar.f302833d).intValue(), ((p2.c) lVar.f302834e).f351377a));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (java.lang.Math.abs(r1Var.f258210d) > 0.5f) {
                f17 -= r1Var.f258210d;
                r1Var.f258210d = 0.0f;
            }
        } else {
            f17 = 0.0f;
        }
        return java.lang.Float.valueOf(-f17);
    }
}
