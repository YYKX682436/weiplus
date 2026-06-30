package hc2;

/* loaded from: classes10.dex */
public abstract class p {
    public static final void a(r45.kv0 kv0Var) {
        kotlin.jvm.internal.o.g(kv0Var, "<this>");
        kv0Var.set(3, 0);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127629c0).getValue()).r()).intValue() == 1) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 1));
        }
        if (pr2.a.f357949a.a()) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 2));
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127996w2).getValue()).r()).intValue() == 1) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 4));
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.B2).getValue()).r()).intValue() == 1) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 8));
        }
        kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 16 | 32 | 64 | 128 | 256));
        c92.g gVar = c92.g.f39738a;
        if (gVar.b()) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 512));
        }
        if (gVar.c()) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 1024));
        }
        kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 32768));
        kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 16384));
        if (((java.lang.Number) t70Var.y0().r()).intValue() == 1) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 1048576));
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.X2).getValue()).r()).intValue() == 1) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62));
        }
        if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.p() == 1) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 67108864));
        }
        kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62));
        jm4.a0 a0Var = (jm4.a0) ((jz5.n) ((wy2.g) ((o40.e) i95.n0.c(o40.e.class))).f450638e).getValue();
        if ((a0Var != null ? urgen.ur_0025.UR_5379.UR_FC8F(((jm4.c0) a0Var).getCppPointer()) : 0) > 0) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 268435456));
        }
        kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING));
        i95.m c17 = i95.n0.c(l85.g0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((l85.d0) ((l85.g0) c17)).wi()) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 1073741824));
        }
        com.tencent.mars.xlog.Log.i("FinderCgiExt", "[fillExptFlag] exptFlag=" + kv0Var.getInteger(3));
    }

    public static final boolean b(int i17, int i18) {
        return i18 == -4012 && i17 == 4;
    }
}
