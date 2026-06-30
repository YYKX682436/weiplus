package m11;

/* loaded from: classes9.dex */
public abstract class c0 {
    public static java.lang.String a(java.lang.String str) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        return kk.k.g((str + "-" + com.tencent.mm.vfs.w6.k(str)).getBytes());
    }

    public static java.lang.String b(m11.b0 b0Var) {
        return b0Var == null ? "" : b0Var.j() ? m11.b1.Di().C1(java.lang.Long.valueOf(b0Var.f322649q)).f322637e : b0Var.f322637e;
    }

    public static java.lang.String c(com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var) {
        if (b0Var == null) {
            return "";
        }
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f22563h, b0Var.f322638f, "", "", true, false);
        if (com.tencent.mm.vfs.w6.j(bj6)) {
            return bj6;
        }
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.c0.f22550a.d(b0Var.l()), b0Var.f322637e, "", "", true, false);
    }

    public static m11.b0 d(m11.b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        return b0Var.j() ? m11.b1.Di().C1(java.lang.Long.valueOf(b0Var.f322649q)) : b0Var;
    }
}
