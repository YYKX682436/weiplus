package urgen.ur_54A4;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0012"}, d2 = {"Lurgen/ur_54A4/URS_3370;", "", "", dm.i4.COL_FINDEROBJECT, "", "commentScene", "duration", "Ljz5/f0;", "UR_F09B", "", "UR_FB2E", "UR_6826", dm.i4.COL_USERNAME, "UR_4141", "cmdId", "UR_053C", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class URS_3370 {
    public static final urgen.ur_54A4.URS_3370 INSTANCE = new urgen.ur_54A4.URS_3370();

    private URS_3370() {
    }

    public static final byte[] UR_053C(int cmdId, int commentScene) {
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(commentScene));
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        bw5.c30 c30Var = new bw5.c30();
        bw5.sc scVar = new bw5.sc();
        db2.t4 t4Var = db2.t4.f228171a;
        c30Var.f25899d = scVar.parseFrom(t4Var.b(cmdId, qt2Var).toByteArray());
        boolean[] zArr = c30Var.f25903h;
        zArr[1] = true;
        c30Var.f25902g = new bw5.hd().parseFrom(t4Var.n().toByteArray());
        zArr[4] = true;
        c30Var.f25900e = ((java.lang.Number) P6.f302833d).floatValue();
        zArr[2] = true;
        c30Var.f25901f = ((java.lang.Number) P6.f302834e).floatValue();
        zArr[3] = true;
        byte[] byteArray = c30Var.toByteArray();
        kotlin.jvm.internal.o.d(byteArray);
        return byteArray;
    }

    public static final java.lang.String UR_4141(java.lang.String username) {
        java.lang.String g27;
        java.lang.String str;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        if (n17 == null) {
            return "";
        }
        if (n17.g2() == null) {
            g27 = n17.f2();
            str = "getDisplayNick(...)";
        } else {
            g27 = n17.g2();
            str = "getDisplayRemark(...)";
        }
        kotlin.jvm.internal.o.f(g27, str);
        return g27;
    }

    public static final java.lang.String UR_6826() {
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        java.lang.String c17 = b52.b.c();
        kotlin.jvm.internal.o.f(c17, "getFinderCurTabContextId(...)");
        return c17;
    }

    public static final void UR_F09B(byte[] finderObject, int i17, int i18) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        if (finderObject.length == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).a(new qg3.j(finderObject, i17, i18));
    }

    public static final java.lang.String UR_FB2E() {
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        java.lang.String b17 = b52.b.b();
        return b17 == null ? "" : b17;
    }
}
