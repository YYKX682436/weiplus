package f11;

/* loaded from: classes.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f258559b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f258560c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f258561d;

    /* renamed from: e, reason: collision with root package name */
    public static f11.j f258562e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f258563a = false;

    static {
        java.lang.String str = lp0.b.h() + "fonts/";
        f258559b = str + "temp/";
        f258560c = str + "WXkatonglemiao.ttf";
        f258561d = str + "WXxiari.ttf";
    }

    public static f11.j b() {
        synchronized (f11.j.class) {
            if (f258562e == null) {
                f11.j jVar = new f11.j();
                f258562e = jVar;
                jVar.c();
            }
        }
        return f258562e;
    }

    public boolean a() {
        if (com.tencent.mm.vfs.w6.j(f258560c) && com.tencent.mm.vfs.w6.j(f258561d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FontResLogic", "font file exist");
            this.f258563a = true;
        } else {
            this.f258563a = false;
        }
        return this.f258563a;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FontResLogic", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        if (a()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(933L, 4L);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.B(933L, 5L);
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(57, 1);
        if (com.tencent.mm.vfs.w6.j(Bi)) {
            g0Var.B(933L, 6L);
            com.tencent.mars.xlog.Log.i("MicroMsg.FontResLogic", "cache file exist %s", Bi);
            d(Bi, 57, 1, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1 A[Catch: all -> 0x0131, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0012, B:18:0x008b, B:25:0x00a8, B:33:0x00d1, B:34:0x00f6, B:35:0x00db, B:41:0x0120, B:42:0x012e, B:39:0x0111, B:10:0x0030, B:12:0x0047, B:15:0x007c, B:17:0x0084, B:22:0x0099, B:24:0x00a1, B:28:0x00b6, B:30:0x00c3, B:38:0x00fb), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db A[Catch: all -> 0x0131, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0012, B:18:0x008b, B:25:0x00a8, B:33:0x00d1, B:34:0x00f6, B:35:0x00db, B:41:0x0120, B:42:0x012e, B:39:0x0111, B:10:0x0030, B:12:0x0047, B:15:0x007c, B:17:0x0084, B:22:0x0099, B:24:0x00a1, B:28:0x00b6, B:30:0x00c3, B:38:0x00fb), top: B:2:0x0001, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void d(java.lang.String r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f11.j.d(java.lang.String, int, int, int):void");
    }

    public final boolean e(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        java.lang.String optString2 = jSONObject.optString("md5");
        java.lang.String str2 = f258559b + optString;
        java.lang.String b17 = uk.k.b(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17) || !b17.equalsIgnoreCase(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FontResLogic", "download %s not match! %s %s", optString, b17, optString2);
            return false;
        }
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        com.tencent.mm.vfs.w6.w(str2, str);
        return true;
    }
}
