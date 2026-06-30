package gm0;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f273227d = true;

    /* renamed from: a, reason: collision with root package name */
    public int f273228a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f273229b = false;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.storage.j3 f273230c;

    public static int a(gm0.l lVar) {
        int i17;
        synchronized (lVar) {
            if (!lVar.f273229b) {
                synchronized (lVar) {
                    iz5.a.d(null, lVar.f273230c);
                    lVar.f273228a = c(lVar.f273230c);
                    lVar.f273229b = true;
                }
            }
            i17 = lVar.f273228a;
        }
        return i17;
    }

    public static void b(gm0.l lVar, int i17) {
        synchronized (lVar) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "Uin From %s To %s hash:%d thread:%d[%s] stack:%s", kk.v.a(lVar.f273228a), kk.v.a(i17), java.lang.Integer.valueOf(kk.m.b(i17, 100)), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Thread.currentThread().getName(), new com.tencent.mm.sdk.platformtools.z3());
            iz5.a.d(null, lVar.f273230c);
            e(lVar.f273230c, i17);
            lVar.f273228a = i17;
        }
    }

    public static int c(com.tencent.mm.storage.j3 j3Var) {
        if (j3Var == null) {
            com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", "summer read detault uin exception sysCfg is null!");
            return 0;
        }
        java.lang.Integer num = (java.lang.Integer) j3Var.a(1);
        if (num == null) {
            if (j3Var.f195043c) {
                jx3.f.INSTANCE.idkeyStat(148L, 40L, 1L, false);
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(d());
            if (valueOf != null) {
                com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "summer read detault uin[%d], bakUin[%d] sysCfg.isOpenException[%b]", num, valueOf, java.lang.Boolean.valueOf(j3Var.f195043c));
                if (f273227d) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", "summer read detault uin exception backup uin[%d], stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
                    jx3.f.INSTANCE.d(11911, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.q1(valueOf)));
                    f273227d = false;
                }
                e(j3Var, valueOf.intValue());
                num = valueOf;
            }
        } else if (num.intValue() != 0) {
            int d17 = d();
            if (!num.equals(java.lang.Integer.valueOf(d17))) {
                com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "bak uin(%s) != uin(%s), reset it.", java.lang.Integer.valueOf(d17), num);
                e(j3Var, num.intValue());
            }
        }
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "summer getDefaultUin uin[%d]", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.q1(num)));
        return com.tencent.mm.sdk.platformtools.t8.q1(num);
    }

    public static int d() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0);
    }

    public static void e(com.tencent.mm.storage.j3 j3Var, int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "setSysUin uin: %d, stack: %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        if (!com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 4).edit().putInt("default_uin", i17).commit()) {
            jx3.f.INSTANCE.idkeyStat(148L, 150L, 1L, false);
            com.tencent.mars.xlog.Log.e("MMKernel.CoreAccount", "uin_sp save fail");
        }
        com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs").A("default_uin", i17);
        j3Var.f(1, java.lang.Integer.valueOf(i17));
        j3Var.k();
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs");
        M.A("default_uin_timely", i17);
        M.G("has_uin_timely", true);
    }
}
