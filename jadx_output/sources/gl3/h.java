package gl3;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f272831a = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f272832b = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f272833c = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f272834d = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f272835e = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f272836f = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f272837g = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f272838h = null;

    /* renamed from: i, reason: collision with root package name */
    public static int f272839i = 0;

    public static java.lang.String a() {
        java.lang.String str = f272838h;
        if (str != null) {
            return str;
        }
        java.lang.String a17 = gl3.e.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheHelper", "retAccPath:%s is invalid", a17);
            return lp0.b.D();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheHelper", "getAccPath retAccPath:%s", a17);
        f272838h = a17;
        return a17;
    }

    public static java.lang.String b(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.r2 r2Var = f272831a;
        return r2Var.k(str) ? (java.lang.String) r2Var.get(str) : "";
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String b17 = b(str);
        if (android.text.TextUtils.isEmpty(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.PieceCacheHelper", "getMusicMIMEType musicId is empty!");
            return null;
        }
        if (gl3.e.d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            return com.tencent.mm.plugin.music.model.cache.ipc.n.d(b17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        return null;
    }

    public static boolean d(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.r2 r2Var = f272837g;
        if (r2Var.k(str)) {
            return ((java.lang.Boolean) r2Var.get(str)).booleanValue();
        }
        return false;
    }

    public static void e(java.lang.String str, int i17) {
        if (str != null) {
            f272834d.put(str, java.lang.Integer.valueOf(i17));
        }
    }

    public static void f(java.lang.String str) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(b(str))) {
            if (gl3.e.d()) {
                ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
                str2 = com.tencent.mm.plugin.music.model.cache.ipc.n.l(str);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
                str2 = "";
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            arrayList.add(str2);
            gl3.g gVar = new gl3.g(arrayList);
            long j17 = 0;
            if (gl3.g.f272829f == 0) {
                if (gl3.e.d()) {
                    ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
                    j17 = com.tencent.mm.plugin.music.model.cache.ipc.n.c();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
                }
                gl3.g.f272829f = j17;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - gl3.g.f272829f <= gl3.b.f272821d.longValue()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.PieceCacheCleanController", "startClean the last clean time is in MUSIC_NO_SCAN_TIME time");
            } else {
                gl3.g.f272829f = currentTimeMillis;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheCleanController", "start clean music file");
                s75.d.b(new gl3.f(gVar, currentTimeMillis), "PieceCacheCleanController");
            }
            if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
                return;
            }
            f272831a.put(str, str2);
        }
    }
}
