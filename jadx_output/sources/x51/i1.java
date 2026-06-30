package x51;

/* loaded from: classes5.dex */
public abstract class i1 {
    public static void a(android.content.Context context, java.lang.String str) {
        c01.b9.f37069c.d("login_user_name", str);
    }

    public static void b(android.app.Activity activity, java.lang.Runnable runnable, boolean z17, int i17) {
        if (r61.q0.b() != js.x0.SUCC && r61.q0.b() != js.x0.SUCC_UNLOAD) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PostLoginUtil", "not successfully binded, skip addrbook confirm");
        } else if (!com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) gm0.j1.u().c().l(12322, null)) && (z17 || !com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) gm0.j1.u().c().l(12323, null)))) {
            r61.q0.k(false);
            java.lang.String U = com.tencent.mm.sdk.platformtools.t8.U(activity);
            if (U == null) {
                U = "";
            }
            if (U.length() > 0 && U.equals(gm0.j1.u().c().l(6, null))) {
                r61.q0.k(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.PostLoginUtil", "same none-nil phone number, leave it");
            } else if (i17 != 2) {
                db5.e1.j(activity, com.tencent.mm.R.string.afr, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f490608zu, com.tencent.mm.R.string.f490503wx, new x51.d1(i17, activity, runnable), new x51.e1(runnable, activity));
                gm0.j1.u().c().w(12323, java.lang.Boolean.TRUE);
                return;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void c(android.content.Context context, java.lang.String str, int i17) {
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            if (b17.f420400c == 8) {
                c71.b.c(context, b17.f420398a, i17, false);
                return;
            }
            tm.j jVar = b17.f420404g;
            java.lang.String str2 = jVar.f420441f;
            java.lang.String str3 = jVar.f420442g;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = context.getString(com.tencent.mm.R.string.f490507x1);
            }
            java.lang.String str4 = str2;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                str3 = context.getString(com.tencent.mm.R.string.f490347sg);
            }
            java.lang.String str5 = str3;
            x51.h1 h1Var = new x51.h1(context, b17, i17);
            int i18 = b17.f420400c;
            if (i18 == 1 || i18 == 4) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(b17.f420398a)) {
                    db5.e1.s(context, b17.f420399b, b17.f420401d);
                } else {
                    db5.e1.A(context, b17.f420399b, b17.f420401d, str4, str5, h1Var, null);
                }
            }
        }
    }

    public static void d(android.content.Context context) {
        db5.e1.A(context, context.getString(com.tencent.mm.R.string.f489997hz), "", context.getString(com.tencent.mm.R.string.f490939bb1), context.getString(com.tencent.mm.R.string.baz), new x51.f1(context.getString(com.tencent.mm.R.string.f489996hy), context), null);
    }

    public static void e(android.content.Context context, java.lang.String str, java.lang.String str2) {
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            b17.c(context, new x51.g1(str2, context), null);
        }
    }

    public static void f(android.content.Context context, com.tencent.mm.modelsimple.u0 u0Var, int i17) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.BioHelperUI.class);
        intent.putExtra("k_type", u0Var.f71417a);
        intent.putExtra("KVoiceHelpCode", i17);
        intent.putExtra("Kvertify_key", u0Var.f71418b);
        intent.putExtra("KVoiceHelpUrl", u0Var.f71419c);
        intent.putExtra("KVoiceHelpWording", u0Var.f71420d);
        intent.putExtra("Kusername", u0Var.f71421e);
        if (u0Var.f71422f != null) {
            intent.getExtras().putAll(u0Var.f71422f);
        }
    }

    public static void g(boolean z17, boolean z18) {
        int p17 = c01.z1.p();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(z17 ? p17 & (-131073) : p17 | 131072));
        int i17 = !z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 17;
        p53Var.f382762e = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        if (z18) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        }
    }
}
