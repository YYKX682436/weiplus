package mz2;

/* loaded from: classes9.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f333160a;

    public static final java.lang.String a(android.content.Context context) {
        return context.getApplicationContext().getFilesDir().getAbsolutePath() + "/b7c9a7fd-851e-7761-07df-8ab7c0b02787.sec";
    }

    public static java.lang.String b() {
        return com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.wallet_core.ui.r1.D()) + com.tencent.mm.sdk.platformtools.w2.b(wo.w0.k().getBytes()));
    }

    public static boolean c() {
        return ((nz2.o) gm0.j1.s(nz2.o.class)).Je();
    }

    public static boolean d() {
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_IS_SO_LOAD_SUCCESS_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        if (m17 != null) {
            return ((java.lang.Boolean) m17).booleanValue();
        }
        return false;
    }

    public static void e(boolean z17) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_IS_SO_LOAD_SUCCESS_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }
}
