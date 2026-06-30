package e71;

/* loaded from: classes.dex */
public abstract class j {
    public static java.lang.String a(android.content.Context context) {
        return context == null ? com.tencent.mm.sdk.platformtools.a0.f192448k ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i7d) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i7c) : com.tencent.mm.sdk.platformtools.a0.f192448k ? context.getString(com.tencent.mm.R.string.i7d) : context.getString(com.tencent.mm.R.string.i7c);
    }

    public static void b(boolean z17, boolean z18) {
        if (gm0.j1.a()) {
            int o17 = c01.z1.o();
            gm0.j1.u().c().w(40, java.lang.Integer.valueOf(z17 ? o17 | 16384 : o17 & (-16385)));
            if (z18) {
                r45.p53 p53Var = new r45.p53();
                p53Var.f382761d = 28;
                p53Var.f382762e = z17 ? 1 : 2;
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            }
        }
    }
}
