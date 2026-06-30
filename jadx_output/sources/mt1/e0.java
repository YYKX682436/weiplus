package mt1;

/* loaded from: classes12.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f331213a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f331214b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Integer[] f331215c;

    static {
        nt1.e eVar = new nt1.e();
        f331213a = kz5.c1.k(new jz5.l(43, eVar), new jz5.l(62, eVar), new jz5.l(44, eVar), new jz5.l(486539313, eVar), new jz5.l(34, new nt1.f()), new jz5.l(3, new nt1.d()), new jz5.l(49, new nt1.b()), new jz5.l(268435505, new nt1.a()));
        f331214b = j62.e.g().l("clicfg_mm_bg_task_scheduler_calc_wx_service_enable", false, true, true);
        f331215c = new java.lang.Integer[]{7, 8, 9, 10};
    }

    public static final boolean a() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_attachment_duplicate_file_linkify, false);
    }

    public static final boolean b() {
        return kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_download_migration_linkify_04", "0", false, true));
    }

    public static final java.lang.String c(java.lang.String str) {
        if (!r26.i0.y(str, "wcf://", false)) {
            return r26.i0.y(str, "/storage/emulated/0/tencent/MicroMsg/", false) ? j(r26.n0.W(str, "/storage/emulated/0/tencent/MicroMsg/")) : j(str);
        }
        java.lang.String str2 = "";
        java.lang.String w17 = r26.i0.w(str, "wcf://", "", false);
        int length = w17.length();
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            if (!(w17.charAt(i17) == '/')) {
                str2 = w17.substring(i17);
                kotlin.jvm.internal.o.f(str2, "substring(...)");
                break;
            }
            i17++;
        }
        return (java.lang.String) q26.h0.g(r26.n0.g0(str2, new char[]{'/'}, false, 0, 6, null), 0, mt1.d0.f331208d);
    }

    public static final /* synthetic */ java.util.Map d() {
        return f331213a;
    }

    public static final long e() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_file_index_rescan", "0");
        kotlin.jvm.internal.o.f(aj6, "getExpt(...)");
        java.lang.Long j17 = r26.h0.j(aj6);
        if (j17 != null) {
            return j17.longValue();
        }
        return 0L;
    }

    public static final boolean f() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_all_duplicate_file_linkify, false);
    }

    public static final boolean g() {
        return kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_linkify_failed_killself", "0", false, true));
    }

    public static final long h(long j17) {
        if (j17 < 1000000) {
            return j17;
        }
        if (j17 < 10000000) {
            return 1000000L;
        }
        return j17 - 9000000;
    }

    public static final android.os.PowerManager.WakeLock i() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        if (systemService instanceof android.os.PowerManager) {
            try {
                android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) systemService).newWakeLock(1, "WxIndex");
                yj0.a.c(newWakeLock, "com/tencent/mm/plugin/calcwx/CalcWxNewServiceKt", "newWakeLock", "()Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                newWakeLock.acquire();
                yj0.a.f(newWakeLock, "com/tencent/mm/plugin/calcwx/CalcWxNewServiceKt", "newWakeLock", "()Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                return newWakeLock;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CalcWxNewService", e17, "Cannot acquire wake-lock", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public static final java.lang.String j(java.lang.String str) {
        java.lang.String str2;
        int length = str.length();
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                str2 = "";
                break;
            }
            if (!(str.charAt(i17) == '/')) {
                str2 = str.substring(i17);
                kotlin.jvm.internal.o.f(str2, "substring(...)");
                break;
            }
            i17++;
        }
        return (java.lang.String) q26.h0.g(r26.n0.g0(r26.i0.w(str2, "Download/", "Download/Download/", false), new char[]{'/'}, false, 0, 6, null), 1, mt1.c0.f331206d);
    }
}
