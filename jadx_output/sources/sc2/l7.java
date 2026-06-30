package sc2;

/* loaded from: classes2.dex */
public final class l7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f406054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406055e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(sc2.r7 r7Var, int i17) {
        super(1);
        this.f406054d = r7Var;
        this.f406055e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view;
        in5.s0 s0Var;
        int i17;
        int i18;
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        sc2.r7 r7Var = this.f406054d;
        r7Var.getClass();
        xc2.p0 p0Var = observer.f3147h;
        if (p0Var != null && (view = observer.f3143d) != null && (s0Var = observer.f3148i) != null) {
            int i19 = this.f406055e;
            observer.z(s0Var, view, p0Var, i19);
            if (p0Var.B == 1 && !observer.f3154r) {
                if (i19 < p0Var.E || (i19 >= (i18 = p0Var.F) && i18 != 0)) {
                    if (view.getVisibility() == 0 && (i17 = p0Var.F) != 0) {
                        ad2.h hVar = p0Var.f453240d;
                        if (i19 == i17) {
                            observer.d(s0Var, view, p0Var, true, new sc2.k7(hVar, r7Var, s0Var));
                        } else {
                            ad2.k.a(observer, s0Var, view, p0Var, false, null, 16, null);
                        }
                    }
                } else if (view.getVisibility() == 8) {
                    if (i19 != p0Var.E) {
                        ad2.k.b(observer, s0Var, view, p0Var, false, null, 16, null);
                        yz5.l lVar = r7Var.f406215n;
                        if (lVar != null) {
                            lVar.invoke(s0Var);
                        }
                    } else if (!p0Var.D) {
                        ad2.k.b(observer, s0Var, view, p0Var, true, null, 16, null);
                        yz5.l lVar2 = r7Var.f406215n;
                        if (lVar2 != null) {
                            lVar2.invoke(s0Var);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
