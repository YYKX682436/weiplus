package ss3;

@j95.b
/* loaded from: classes5.dex */
public class d0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public c01.ua f412000d;

    public static void Ai(ss3.c0 c0Var) {
        com.tencent.mm.sdk.platformtools.u3.h(new ss3.z(c0Var));
    }

    public static void Bi(java.util.List list, int i17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i18 = 0; i18 < list.size(); i18++) {
            java.lang.String b17 = tv.a.b(((c01.ta) list.get(i18)).c());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(b17));
                if (r6Var.m() && !r6Var.y()) {
                    r6Var.l();
                }
            }
        }
    }

    public static c01.ua Di() {
        gm0.j1.b().c();
        if (((ss3.d0) i95.n0.c(ss3.d0.class)).f412000d == null) {
            ((ss3.d0) i95.n0.c(ss3.d0.class)).f412000d = new c01.ua(gm0.j1.u().f273153f);
        }
        return ((ss3.d0) i95.n0.c(ss3.d0.class)).f412000d;
    }

    public static void wi(ss3.c0 c0Var) {
        Di().m0(20);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k("newsapp");
        if (gm0.j1.a()) {
            gm0.j1.e().j(new ss3.a0(c0Var, 20));
        } else {
            Ai(c0Var);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        gm0.j1.e().j(new ss3.b0(this));
    }
}
