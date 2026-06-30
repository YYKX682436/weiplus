package ky;

/* loaded from: classes14.dex */
public abstract class w {
    public static final void a(z0.t modifier, boolean z17, n0.o oVar, int i17, int i18) {
        int i19;
        kotlin.jvm.internal.o.g(modifier, "modifier");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(657811078);
        if ((i18 & 1) != 0) {
            i19 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i19 = (y0Var.e(modifier) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        int i27 = i18 & 2;
        if (i27 != 0) {
            i19 |= 48;
        } else if ((i17 & 112) == 0) {
            i19 |= y0Var.f(z17) ? 32 : 16;
        }
        if ((i19 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            if (i27 != 0) {
                z17 = false;
            }
            java.lang.Object obj = n0.e1.f333492a;
            android.content.Context context = (android.content.Context) y0Var.i(androidx.compose.ui.platform.a1.f10503b);
            y0Var.U(-2023655887);
            java.lang.Object y17 = y0Var.y();
            int i28 = n0.o.f333629a;
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                y17 = context.getString(com.tencent.mm.R.string.ngq);
                y0Var.g0(y17);
            }
            java.lang.String str = (java.lang.String) y17;
            y0Var.o(false);
            kotlin.jvm.internal.o.d(str);
            y0Var.U(-2023655783);
            java.lang.Object y18 = y0Var.y();
            if (y18 == obj2) {
                y18 = new e1.y(e1.a0.b(b3.l.getColor(context, com.tencent.mm.R.color.ang)));
                y0Var.g0(y18);
            }
            long j17 = ((e1.y) y18).f246322a;
            y0Var.o(false);
            a0.m.a(modifier, new ky.u(context, z17, j17, str), y0Var, i19 & 14);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new ky.v(modifier, z17, i17, i18);
        }
    }
}
