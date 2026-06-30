package f;

/* loaded from: classes14.dex */
public abstract class l {
    public static final void a(boolean z17, yz5.a onBack, n0.o oVar, int i17, int i18) {
        int i19;
        kotlin.jvm.internal.o.g(onBack, "onBack");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-971160336);
        int i27 = i18 & 1;
        if (i27 != 0) {
            i19 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i19 = (y0Var.f(z17) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        if ((i18 & 2) != 0) {
            i19 |= 48;
        } else if ((i17 & 112) == 0) {
            i19 |= y0Var.e(onBack) ? 32 : 16;
        }
        if (((i19 & 91) ^ 18) == 0 && y0Var.v()) {
            y0Var.O();
        } else {
            if (i27 != 0) {
                z17 = true;
            }
            n0.e5 e17 = n0.s4.e(onBack, y0Var, (i19 >> 3) & 14);
            y0Var.U(-3687241);
            java.lang.Object y17 = y0Var.y();
            int i28 = n0.o.f333629a;
            java.lang.Object obj = n0.n.f333620a;
            if (y17 == obj) {
                y17 = new f.k(e17, z17);
                y0Var.g0(y17);
            }
            y0Var.o(false);
            f.k kVar = (f.k) y17;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            y0Var.U(-3686552);
            boolean e18 = y0Var.e(valueOf) | y0Var.e(kVar);
            java.lang.Object y18 = y0Var.y();
            if (e18 || y18 == obj) {
                y18 = new f.g(kVar, z17);
                y0Var.g0(y18);
            }
            y0Var.o(false);
            n0.d2.h((yz5.a) y18, y0Var, 0);
            n0.h3 h3Var = f.q.f257993a;
            y0Var.U(1680121376);
            androidx.activity.k kVar2 = (androidx.activity.k) y0Var.i(f.q.f257993a);
            if (kVar2 == null) {
                java.lang.Object obj2 = (android.content.Context) y0Var.i(androidx.compose.ui.platform.a1.f10503b);
                while (true) {
                    if (!(obj2 instanceof android.content.ContextWrapper)) {
                        obj2 = null;
                        break;
                    } else {
                        if (obj2 instanceof androidx.activity.k) {
                            break;
                        }
                        obj2 = ((android.content.ContextWrapper) obj2).getBaseContext();
                        kotlin.jvm.internal.o.f(obj2, "innerContext.baseContext");
                    }
                }
                kVar2 = (androidx.activity.k) obj2;
            }
            y0Var.o(false);
            if (kVar2 == null) {
                throw new java.lang.IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            androidx.activity.i onBackPressedDispatcher = kVar2.getOnBackPressedDispatcher();
            kotlin.jvm.internal.o.f(onBackPressedDispatcher, "checkNotNull(LocalOnBack…}.onBackPressedDispatcher");
            androidx.lifecycle.y yVar = (androidx.lifecycle.y) y0Var.i(androidx.compose.ui.platform.a1.f10505d);
            n0.d2.b(yVar, onBackPressedDispatcher, new f.i(onBackPressedDispatcher, yVar, kVar), y0Var, 72);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new f.j(z17, onBack, i17, i18);
    }
}
