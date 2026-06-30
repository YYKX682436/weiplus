package cw0;

/* loaded from: classes5.dex */
public final class p implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222666d;

    public p(cw0.l0 l0Var) {
        this.f222666d = l0Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.a
    public void s1(fv0.a operation) {
        ex0.q qVar;
        java.lang.String str;
        java.lang.String str2;
        pp0.s0 s0Var;
        kotlin.jvm.internal.o.g(operation, "operation");
        int ordinal = operation.ordinal();
        if (ordinal == 1) {
            this.f222666d.J7();
            return;
        }
        if (ordinal == 4) {
            this.f222666d.L7();
            return;
        }
        if (ordinal == 9) {
            cw0.l0 l0Var = this.f222666d;
            yy0.m7 m7Var = (yy0.m7) l0Var.R6().O6();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.g3(m7Var, null), 3, null);
            cw0.w0 w0Var = new cw0.w0(l0Var.getContext());
            java.util.List y76 = l0Var.y7();
            float C = (y76 == null || (qVar = (ex0.q) kz5.n0.Z(y76)) == null) ? l0Var.f222650v : qVar.C();
            ex0.o w76 = l0Var.w7();
            java.lang.Float valueOf = w76 != null ? java.lang.Float.valueOf(w76.C()) : null;
            ex0.c u76 = l0Var.u7();
            java.lang.Float valueOf2 = u76 != null ? java.lang.Float.valueOf(u76.C()) : null;
            w0Var.setOnAttached(new cw0.r(w0Var, l0Var, valueOf2, valueOf, C));
            w0Var.setOnNarrationVolumeChangeListener(new cw0.s(w0Var, l0Var));
            w0Var.setOnOSTVolumeChangedListener(new cw0.t(w0Var, l0Var));
            w0Var.setOnMusicVolumeChangedListener(new cw0.u(w0Var, l0Var));
            w0Var.setOnAutoAdjustStateChange(new cw0.v(l0Var, w0Var, valueOf2, valueOf));
            w0Var.I(new cw0.w(w0Var, l0Var), new cw0.y(w0Var, l0Var, C, valueOf2, valueOf));
            l0Var.g7(w0Var);
            return;
        }
        switch (ordinal) {
            case 12:
                cw0.l0 l0Var2 = this.f222666d;
                yy0.m7 m7Var2 = (yy0.m7) l0Var2.R6().O6();
                kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.j4(m7Var2, null), 3, null);
                ex0.r v76 = l0Var2.v7();
                ex0.q qVar2 = v76 instanceof ex0.q ? (ex0.q) v76 : null;
                if (qVar2 == null) {
                    return;
                }
                qVar2.N(kz5.p0.f313996d);
                java.lang.String H = qVar2.H();
                qu0.i t76 = l0Var2.t7();
                t76.getClass();
                ru0.b bVar = (ru0.b) t76.f366734e.get(H);
                java.lang.String str3 = bVar != null ? bVar.f399657c : null;
                if (str3 == null) {
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    str = null;
                } else {
                    str = str3;
                }
                if (str == null) {
                    return;
                }
                uu0.k a17 = l0Var2.t7().a();
                a17.f431248f = H;
                vu0.k kVar = (vu0.k) ((jz5.n) l0Var2.f222652x).getValue();
                kVar.getClass();
                java.lang.String str5 = a17.f431248f;
                if (str5 == null) {
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    str2 = null;
                } else {
                    str2 = str5;
                }
                if (str2 == null) {
                    return;
                }
                pp0.s0 s0Var2 = kVar.f440106a;
                if (s0Var2 == null) {
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    s0Var = null;
                } else {
                    s0Var = s0Var2;
                }
                if (s0Var == null) {
                    return;
                }
                java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(com.tencent.mm.sdk.platformtools.t8.s0());
                kVar.f440110e.c(str2, vu0.u.f440161f);
                ((ku5.t0) ku5.t0.f312615d).g(new vu0.j(str, a17, s0Var, b17, kVar, str2));
                return;
            case 13:
                cw0.l0 l0Var3 = this.f222666d;
                yy0.m7 m7Var3 = (yy0.m7) l0Var3.R6().O6();
                kotlinx.coroutines.l.d(m7Var3.Di(), null, null, new yy0.o3(m7Var3, null), 3, null);
                ex0.r v77 = l0Var3.v7();
                ex0.q qVar3 = v77 instanceof ex0.q ? (ex0.q) v77 : null;
                if (qVar3 == null || l0Var3.z7().X6()) {
                    return;
                }
                com.tencent.maas.moviecomposing.segments.Segment segment = qVar3.f257167a;
                com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = segment instanceof com.tencent.maas.moviecomposing.segments.NarrationSegment ? (com.tencent.maas.moviecomposing.segments.NarrationSegment) segment : null;
                if (narrationSegment != null) {
                    pf5.e.launchUI$default(l0Var3, null, null, new cw0.a0(l0Var3, narrationSegment, null), 3, null);
                    return;
                }
                return;
            case 14:
                cw0.l0 l0Var4 = this.f222666d;
                boolean F7 = l0Var4.F7();
                if (!F7) {
                    l0Var4.V7();
                }
                if (F7) {
                    yy0.m7 m7Var4 = (yy0.m7) l0Var4.R6().O6();
                    kotlinx.coroutines.l.d(m7Var4.Di(), null, null, new yy0.u2(m7Var4, null), 3, null);
                    ex0.r v78 = l0Var4.v7();
                    ex0.q qVar4 = v78 instanceof ex0.q ? (ex0.q) v78 : null;
                    if (qVar4 == null) {
                        return;
                    }
                    com.tencent.maas.base.MJID mjid = qVar4.f257168b;
                    if (qVar4.I().isEmpty()) {
                        l0Var4.V7();
                        return;
                    } else {
                        cw0.l0.Q7(l0Var4, ov0.e.f349125e, mjid, null, 4, null);
                        return;
                    }
                }
                return;
            case 15:
                cw0.l0 l0Var5 = this.f222666d;
                boolean F72 = l0Var5.F7();
                if (!F72) {
                    l0Var5.V7();
                }
                if (F72) {
                    yy0.m7 m7Var5 = (yy0.m7) l0Var5.R6().O6();
                    kotlinx.coroutines.l.d(m7Var5.Di(), null, null, new yy0.d3(m7Var5, null), 3, null);
                    ex0.r v79 = l0Var5.v7();
                    ex0.q qVar5 = v79 instanceof ex0.q ? (ex0.q) v79 : null;
                    if (qVar5 == null) {
                        return;
                    }
                    com.tencent.maas.base.MJID mjid2 = qVar5.f257168b;
                    if (qVar5.I().isEmpty()) {
                        l0Var5.V7();
                        return;
                    } else {
                        cw0.l0.Q7(l0Var5, ov0.e.f349126f, mjid2, null, 4, null);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
