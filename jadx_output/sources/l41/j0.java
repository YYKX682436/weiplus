package l41;

/* loaded from: classes11.dex */
public abstract class j0 {
    public static com.tencent.mm.storage.z3 a(r45.a05 a05Var) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(a05Var.f369581d, true);
        if (n17 == null) {
            n17 = new com.tencent.mm.storage.z3();
        }
        n17.X1(a05Var.f369581d);
        n17.M1(a05Var.f369582e);
        n17.setType(a05Var.f369583f);
        n17.W1(a05Var.f369599y);
        n17.n1(a05Var.f369584g);
        n17.j3(a05Var.f369587m);
        n17.R1(a05Var.f369588n);
        n17.S1(a05Var.f369589o);
        n17.p1(a05Var.f369590p);
        n17.o1(a05Var.f369591q);
        r45.b05 b05Var = a05Var.f369592r;
        n17.J1 = b05Var == null ? "" : b05Var.f370396e;
        n17.f236581u = true;
        n17.I1 = b05Var == null ? 0 : b05Var.f370395d;
        n17.f236581u = true;
        n17.C2(a05Var.f369593s);
        n17.P1(a05Var.f369594t);
        n17.g3(a05Var.f369595u);
        n17.C1(a05Var.f369596v);
        n17.K2((int) com.tencent.mm.sdk.platformtools.t8.i1());
        if (n17.A0() == null) {
            n17.q1(new r45.o80());
        }
        n17.A0().f382019e = a05Var.f369600z;
        return n17;
    }

    public static int b(r45.ck3 ck3Var) {
        int i17 = ck3Var.f371618d;
        r45.a05 a05Var = ck3Var.f371619e;
        com.tencent.mm.storage.z3 a17 = a(a05Var);
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = a17.d1();
        objArr[1] = a17.P0();
        objArr[2] = a17.w0();
        objArr[3] = java.lang.Integer.valueOf(a17.getSource());
        objArr[4] = java.lang.Integer.valueOf(a17.I);
        objArr[5] = a17.Q0();
        objArr[6] = a17.J1;
        objArr[7] = java.lang.Integer.valueOf(a17.I1);
        objArr[8] = java.lang.Integer.valueOf(a17.getType());
        objArr[9] = a17.G0();
        objArr[10] = a17.A0() != null ? java.lang.Integer.valueOf(a17.A0().f382019e) : r45.f05.OPENIM_ENTERPRISE_AUTHORIZATION_STATUS_UNKNOWN;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMContactLogic", "onGYNetEnd openim_processModContact user:%s nick:%s remark:%s, source:%d, sex%d, appId:%s, customDetail:%s, customDetailVisible:%d， type:%d, wordingId:%s, enterprise_auth_status:%d", objArr);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(a17);
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Bi(a05Var.f369594t, a05Var.f369596v, 0);
        c(a05Var);
        e(a05Var);
        d(a05Var);
        return i17;
    }

    public static void c(r45.a05 a05Var) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(a05Var.f369581d);
        if (n07 != null) {
            str = n07.c();
            str2 = n07.d();
        } else {
            str = "";
            str2 = "";
        }
        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
        r0Var.f70537i = -1;
        r0Var.f70529a = a05Var.f369581d;
        r0Var.f70532d = a05Var.f369586i;
        r0Var.f70533e = a05Var.f369585h;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMContactLogic", "dealwithAvatarFromModContact contact %s b[%s] s[%s]", r0Var.e(), r0Var.c(), r0Var.d());
        boolean z18 = true;
        if (r0Var.c().equals(str)) {
            z17 = false;
        } else {
            com.tencent.mm.modelavatar.d1.Ai().p(a05Var.f369581d, true);
            z17 = true;
        }
        if (r0Var.d().equals(str2)) {
            z18 = z17;
        } else {
            com.tencent.mm.modelavatar.d1.Ai().p(a05Var.f369581d, false);
        }
        if (z18) {
            com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
            com.tencent.mm.modelavatar.d1.wi().i(a05Var.f369581d);
        }
    }

    public static void d(r45.a05 a05Var) {
        if (a05Var.f369581d != null) {
            u41.g gVar = new u41.g();
            gVar.field_openIMUsername = a05Var.f369581d;
            java.lang.String str = a05Var.f369597w;
            if (str == null) {
                str = "";
            }
            gVar.field_finder_username = str;
            ((i41.l) i95.n0.c(i41.l.class)).Ni().replace(gVar);
        }
    }

    public static void e(r45.a05 a05Var) {
        if (a05Var.f369581d != null) {
            u41.i iVar = new u41.i();
            iVar.field_openIMUsername = a05Var.f369581d;
            iVar.field_openIMSnsFlag = a05Var.f369598x;
            ((i41.l) i95.n0.c(i41.l.class)).Ri().replace(iVar);
        }
    }
}
