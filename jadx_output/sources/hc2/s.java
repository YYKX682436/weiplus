package hc2;

/* loaded from: classes2.dex */
public abstract class s {
    public static final boolean a(ya2.b2 b2Var) {
        return (b2Var == null || (b2Var.field_extFlag & 16384) == 0) ? false : true;
    }

    public static final boolean b() {
        g92.b bVar = g92.b.f269769e;
        m92.b j37 = g92.a.j3(bVar, bVar.U(), false, 2, null);
        return ((j37 != null ? j37.field_extFlag : 0) & 1024) != 0;
    }

    public static final boolean c(ya2.b2 b2Var) {
        return ((b2Var != null ? b2Var.field_additionalFlag : 0L) & 1024) == 1024;
    }

    public static final boolean d(ya2.b2 b2Var, long j17) {
        if (b2Var != null) {
            return ((((j17 > 1L ? 1 : (j17 == 1L ? 0 : -1)) == 0 || (j17 > 2L ? 1 : (j17 == 2L ? 0 : -1)) == 0) || (j17 > 4L ? 1 : (j17 == 4L ? 0 : -1)) == 0) && (b2Var.field_messageStatus & j17) == j17) ? false : true;
        }
        return true;
    }

    public static final boolean e(ya2.b2 b2Var) {
        long j17 = b2Var != null ? b2Var.field_additionalFlag : 0L;
        return (j17 & 1) == 1 && (j17 & 2) == 2;
    }

    public static final boolean f(ya2.b2 b2Var) {
        if (kotlin.jvm.internal.o.b(b2Var != null ? b2Var.D0() : null, g92.b.f269769e.U())) {
            return b();
        }
        return ((b2Var != null ? b2Var.field_extFlag : 0) & 1024) != 0;
    }

    public static final boolean g() {
        r45.h23 h23Var;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.W0).getValue()).r()).booleanValue()) {
            return false;
        }
        g92.b bVar = g92.b.f269769e;
        m92.b j37 = g92.a.j3(bVar, bVar.U(), false, 2, null);
        return j37 != null && (h23Var = (r45.h23) j37.u0().getCustom(52)) != null && h23Var.getInteger(1) == 1;
    }

    public static final com.tencent.mm.protocal.protobuf.FinderContact h(r45.gb4 gb4Var) {
        kotlin.jvm.internal.o.g(gb4Var, "<this>");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        finderContact.setUsername(gb4Var.getString(0));
        finderContact.setHeadUrl(gb4Var.getString(1));
        finderContact.setNickname(gb4Var.getString(2));
        finderContact.setAuthInfo((com.tencent.mm.protocal.protobuf.FinderAuthInfo) gb4Var.getCustom(3));
        finderContact.setUser_flag(gb4Var.getInteger(7));
        return finderContact;
    }

    public static final r45.gb4 i(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        if (finderContact == null) {
            return null;
        }
        r45.gb4 gb4Var = new r45.gb4();
        gb4Var.set(0, finderContact.getUsername());
        gb4Var.set(2, finderContact.getNickname());
        gb4Var.set(1, finderContact.getHeadUrl());
        gb4Var.set(3, finderContact.getAuthInfo());
        gb4Var.set(7, java.lang.Integer.valueOf(finderContact.getUser_flag()));
        return gb4Var;
    }
}
