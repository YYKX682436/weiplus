package j0;

/* loaded from: classes14.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(j0.c5 c5Var) {
        super(1);
        this.f296698d = c5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l lVar;
        jz5.f0 f0Var;
        int i17 = ((g2.k) obj).f267714a;
        j0.g2 g2Var = this.f296698d.f296245m;
        g2Var.getClass();
        if (i17 == 7) {
            lVar = g2Var.a().f296339a;
        } else {
            if (i17 == 2) {
                lVar = g2Var.a().f296340b;
            } else {
                if (i17 == 6) {
                    lVar = g2Var.a().f296341c;
                } else {
                    if (i17 == 5) {
                        lVar = g2Var.a().f296342d;
                    } else {
                        if (i17 == 3) {
                            lVar = g2Var.a().f296343e;
                        } else {
                            if (i17 == 4) {
                                lVar = g2Var.a().f296344f;
                            } else {
                                if (!((i17 == 1) || i17 == 0)) {
                                    throw new java.lang.IllegalStateException("invalid ImeAction".toString());
                                }
                                lVar = null;
                            }
                        }
                    }
                }
            }
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (lVar != null) {
            lVar.invoke(g2Var);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (i17 == 6) {
                c1.k kVar = g2Var.f296299b;
                if (kVar == null) {
                    kotlin.jvm.internal.o.o("focusManager");
                    throw null;
                }
                ((c1.m) kVar).b(1);
            } else {
                if (i17 == 5) {
                    c1.k kVar2 = g2Var.f296299b;
                    if (kVar2 == null) {
                        kotlin.jvm.internal.o.o("focusManager");
                        throw null;
                    }
                    ((c1.m) kVar2).b(2);
                }
            }
        }
        return f0Var2;
    }
}
