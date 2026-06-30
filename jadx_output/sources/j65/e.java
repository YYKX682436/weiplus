package j65;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final hq.a f297927a = new j65.d();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f297928b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f297929c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f297930d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f297931e = false;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f297932f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f297933g = false;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f297934h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f297935i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f297936j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f297937k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.Boolean f297938l;

    public static com.tencent.mm.sdk.platformtools.o4 a() {
        gm0.m.i();
        return com.tencent.mm.sdk.platformtools.o4.M("care_mode_" + gm0.m.i());
    }

    public static boolean b() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.h()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "mmkernel not initialized");
            return false;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f297929c) {
            f297928b = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, false)));
            f297929c = true;
        }
        return f297928b;
    }

    public static boolean c() {
        return !gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_HEARING_AID_MODE_LOCAL_STRING, "CLOSE").equals("CLOSE");
    }

    public static boolean d() {
        if (f297938l == null) {
            try {
                if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_care_mode_switch", "1", false, true), 1) > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMCareModeManager", "openCareModeEntrance!!");
                    f297938l = java.lang.Boolean.TRUE;
                } else {
                    f297938l = java.lang.Boolean.FALSE;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMCareModeManager", e17, "closeCareModeEntrance", new java.lang.Object[0]);
                f297938l = java.lang.Boolean.FALSE;
            }
        }
        if (!f297938l.booleanValue()) {
            return true;
        }
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("DisableCareModeEntry");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMCareModeManager", "isHideCareModeEntrance, ShowCareMode is null");
            return false;
        }
        int parseInt = java.lang.Integer.parseInt(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMCareModeManager", "isHideCareModeEntrance, val is %s", java.lang.Integer.valueOf(parseInt));
        return d17 != null && parseInt > 0;
    }

    public static boolean e() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f297935i) {
            f297934h = com.tencent.mm.sdk.platformtools.t8.t1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_LARGE_FONT_BOOLEAN, true)));
            f297935i = true;
        }
        return f297934h;
    }

    public static boolean f() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f297931e) {
            f297930d = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, false)));
            f297931e = true;
        }
        return f297930d;
    }

    public static boolean g() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f297933g) {
            f297932f = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_MUTE_BOOLEAN, false)));
            f297933g = true;
        }
        return f297932f;
    }

    public static boolean h() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f297937k) {
            f297936j = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_TEMPORARY_PLAY_BOOLEAN, false)));
            f297937k = true;
        }
        return f297936j;
    }

    public static void i(boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 a17 = a();
        a17.getClass();
        a17.putBoolean("care_mode_change", z17).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMCareModeManager", "setCareModeChange:%s", java.lang.Boolean.valueOf(z17));
    }

    public static void j(int i17) {
        com.tencent.mm.sdk.platformtools.o4 a17 = a();
        a17.getClass();
        a17.putInt("care_mode_font_size", i17).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMCareModeManager", "setCareModeFontSize:%s", java.lang.Integer.valueOf(i17));
    }

    public static void k(boolean z17) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_LARGE_FONT_BOOLEAN;
        c17.x(u3Var, java.lang.Boolean.valueOf(z17));
        f297934h = com.tencent.mm.sdk.platformtools.t8.t1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(u3Var, true)));
        f297935i = false;
    }

    public static void l(boolean z17) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_MUTE_BOOLEAN;
        c17.x(u3Var, java.lang.Boolean.valueOf(z17));
        f297932f = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(u3Var, false)));
        f297933g = false;
    }

    public static void m(boolean z17) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_TEMPORARY_PLAY_BOOLEAN;
        c17.x(u3Var, java.lang.Boolean.valueOf(z17));
        f297936j = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(u3Var, false)));
        f297937k = false;
    }

    public static void n(boolean z17) {
        boolean n17 = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, false)));
        if (z17 && n17 != f297928b) {
            i(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMCareModeManager", "care mode state change, before:%s, now:%s", java.lang.Boolean.valueOf(f297928b), java.lang.Boolean.valueOf(n17));
        }
        f297928b = n17;
    }

    public static void o() {
        f297930d = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, false)));
        f297931e = false;
    }
}
