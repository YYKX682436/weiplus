package l0;

/* loaded from: classes14.dex */
public abstract class l3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f314363a;

    /* renamed from: c, reason: collision with root package name */
    public static final float f314365c;

    /* renamed from: f, reason: collision with root package name */
    public static final float f314368f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f314369g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f314370h;

    /* renamed from: b, reason: collision with root package name */
    public static final float f314364b = 14;

    /* renamed from: d, reason: collision with root package name */
    public static final float f314366d = 24;

    /* renamed from: e, reason: collision with root package name */
    public static final float f314367e = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final z.v2 f314371i = new z.v2(100, 0, null, 6, null);

    /* renamed from: j, reason: collision with root package name */
    public static final float f314372j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final float f314373k = 6;

    static {
        float f17 = 34;
        f314363a = f17;
        float f18 = 20;
        f314365c = f18;
        f314368f = f17;
        f314369g = f18;
        f314370h = f17 - f18;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r44, yz5.l r45, z0.t r46, boolean r47, c0.o r48, l0.b3 r49, n0.o r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.l3.a(boolean, yz5.l, z0.t, boolean, c0.o, l0.b3, n0.o, int, int):void");
    }

    public static final void b(d0.z zVar, boolean z17, boolean z18, l0.b3 b3Var, n0.e5 e5Var, c0.n nVar, n0.o oVar, int i17) {
        int i18;
        z0.p pVar;
        long j17;
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1834839253);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(zVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.f(z17) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var.f(z18) ? 256 : 128;
        }
        if ((i17 & 7168) == 0) {
            i18 |= y0Var.e(b3Var) ? 2048 : 1024;
        }
        if ((57344 & i17) == 0) {
            i18 |= y0Var.e(e5Var) ? 16384 : 8192;
        }
        if ((458752 & i17) == 0) {
            i18 |= y0Var.e(nVar) ? 131072 : 65536;
        }
        if ((374491 & i18) == 74898 && y0Var.v()) {
            y0Var.O();
        } else {
            y0Var.U(-492369756);
            java.lang.Object y17 = y0Var.y();
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                y17 = new x0.i0();
                y0Var.g0(y17);
            }
            y0Var.o(false);
            x0.i0 i0Var = (x0.i0) y17;
            int i19 = (i18 >> 15) & 14;
            y0Var.U(511388516);
            boolean e17 = y0Var.e(nVar) | y0Var.e(i0Var);
            java.lang.Object y18 = y0Var.y();
            if (e17 || y18 == obj2) {
                y18 = new l0.h3(nVar, i0Var, null);
                y0Var.g0(y18);
            }
            y0Var.o(false);
            n0.d2.f(nVar, (yz5.p) y18, y0Var, i19);
            float f17 = i0Var.isEmpty() ^ true ? f314373k : f314372j;
            l0.x xVar = (l0.x) b3Var;
            xVar.getClass();
            y0Var.U(-1176343362);
            n0.e5 e18 = n0.s4.e(new e1.y(z18 ? z17 ? xVar.f314588b : xVar.f314590d : z17 ? xVar.f314592f : xVar.f314594h), y0Var, 0);
            y0Var.o(false);
            z0.p pVar2 = z0.p.f468921d;
            z0.t e19 = d0.a3.e(zVar.a(pVar2, z0.a.f468893e), 0.0f, 1, null);
            y0Var.U(1157296644);
            boolean e27 = y0Var.e(e18);
            java.lang.Object y19 = y0Var.y();
            if (e27 || y19 == obj2) {
                y19 = new l0.i3(e18);
                y0Var.g0(y19);
            }
            y0Var.o(false);
            a0.m.a(e19, (yz5.l) y19, y0Var, 0);
            y0Var.U(-66424183);
            n0.e5 e28 = n0.s4.e(new e1.y(z18 ? z17 ? xVar.f314587a : xVar.f314589c : z17 ? xVar.f314591e : xVar.f314593g), y0Var, 0);
            y0Var.o(false);
            l0.c0 c0Var = (l0.c0) y0Var.i(l0.f0.f314178a);
            float f18 = ((p2.h) y0Var.i(l0.f0.f314179b)).f351380d + f17;
            y0Var.U(-539245361);
            if (!e1.y.c(((e1.y) e28.getValue()).f246322a, ((l0.i) y0Var.i(l0.k.f314314a)).k()) || c0Var == null) {
                pVar = pVar2;
                j17 = ((e1.y) e28.getValue()).f246322a;
            } else {
                pVar = pVar2;
                j17 = ((l0.w) c0Var).a(((e1.y) e28.getValue()).f246322a, f18, y0Var, 0);
            }
            long j18 = j17;
            y0Var.o(false);
            z0.t a17 = zVar.a(pVar, z0.a.f468892d);
            y0Var.U(1157296644);
            boolean e29 = y0Var.e(e5Var);
            java.lang.Object y27 = y0Var.y();
            if (e29 || y27 == obj2) {
                y27 = new l0.j3(e5Var);
                y0Var.g0(y27);
            }
            y0Var.o(false);
            yz5.l offset = (yz5.l) y27;
            kotlin.jvm.internal.o.g(a17, "<this>");
            kotlin.jvm.internal.o.g(offset, "offset");
            androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
            z0.t requiredSize = a0.v1.a(a17.k(new d0.z1(offset, true, e3Var)), nVar, m0.x.a(false, f314366d, 0L, y0Var, 54, 4));
            float f19 = f314365c;
            kotlin.jvm.internal.o.g(requiredSize, "$this$requiredSize");
            z0.t k17 = requiredSize.k(new d0.d3(f19, f19, f19, f19, false, e3Var, null));
            i0.g gVar = i0.h.f286493a;
            d0.e3.a(a0.b.b(b1.s.a(k17, f17, gVar, false, 0L, 0L, 24, null), j18, gVar), y0Var, 0);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new l0.k3(zVar, z17, z18, b3Var, e5Var, nVar, i17);
    }
}
