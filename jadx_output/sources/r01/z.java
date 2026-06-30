package r01;

/* loaded from: classes9.dex */
public abstract class z {
    public static void a(java.lang.String str) {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(str);
        qk.o b17 = b(str);
        if (b17 == null) {
            r01.q3.bj().d(str);
            return;
        }
        if (b17.I0()) {
            com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            if (Di.f195117d.delete(Di.E(str), "username=? or parentRef =?", new java.lang.String[]{str, str}) != 0) {
                Di.b(5, Di, str);
            }
            java.util.List i17 = r01.q3.cj().i1(str);
            c01.w9.i(i17, new r01.y(i17), com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        }
        if (b17.F0()) {
            java.lang.String d17 = r01.q3.cj().d1(str);
            if (d17 != null) {
                c01.w9.h(d17, null);
            }
            s01.r.b(str, true, null);
        }
        r01.q3.cj().P0(b17);
        r01.q3.bj().d(str);
    }

    public static qk.o b(java.lang.String str) {
        qk.o b17 = r01.q3.cj().b1(str);
        if (b17.field_updateTime > 0) {
            return b17;
        }
        return null;
    }

    public static boolean c() {
        return r01.q3.cj().u1(256) > 0;
    }

    public static boolean d() {
        return r01.q3.cj().u1(4) > 0;
    }

    public static boolean e() {
        return r01.q3.cj().u1(128) > 0;
    }

    public static boolean f() {
        return r01.q3.cj().u1(8) > 0;
    }

    public static boolean g(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.F0();
    }

    public static boolean h(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.G0();
    }

    public static boolean i(java.lang.String str) {
        qk.o b17 = b(str);
        if (b17 == null) {
            return false;
        }
        return b17.W0();
    }

    public static boolean j(java.lang.String str) {
        qk.o b17;
        return (str == null || (b17 = b(str)) == null || !b17.I0()) ? false : true;
    }

    public static boolean k(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.J0();
    }

    public static boolean l(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.L0();
    }

    public static boolean m(java.lang.String str) {
        qk.o b17 = b(str);
        if (b17 == null) {
            return false;
        }
        b17.A0();
        return b17.field_type == 5;
    }

    public static boolean n(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.Q0();
    }

    public static boolean o(java.lang.String str) {
        qk.o b17 = b(str);
        if (b17 == null) {
            return false;
        }
        return b17.T0();
    }

    public static void p(qk.o oVar) {
        if (oVar != null) {
            r45.ln4 ln4Var = new r45.ln4();
            ln4Var.f379659d = oVar.field_brandFlag;
            ln4Var.f379660e = oVar.field_username;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(47, ln4Var));
            r01.q3.cj().update(oVar, new java.lang.String[0]);
        }
    }

    public static void q(qk.o oVar) {
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession bizInfo is Null");
            return;
        }
        r45.ln4 ln4Var = new r45.ln4();
        ln4Var.f379659d = oVar.field_brandFlag;
        ln4Var.f379660e = oVar.field_username;
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(oVar.field_username);
        if (f07 == null || !f07.r2()) {
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(58, ln4Var));
        } else {
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(47, ln4Var));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession ret = %b, BrandFlag = %b", java.lang.Boolean.valueOf(r01.q3.cj().update(oVar, new java.lang.String[0])), java.lang.Integer.valueOf(oVar.field_brandFlag));
    }
}
