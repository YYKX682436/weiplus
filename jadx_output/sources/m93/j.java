package m93;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static int f325041a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f325042b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f325043c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f325044d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static int f325045e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f325046f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static int f325047g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f325048h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static int f325049i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashMap f325050j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static int f325051k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f325052l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static int f325053m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f325054n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static int f325055o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashMap f325056p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public static int f325057q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f325058r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public static int f325059s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashMap f325060t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public static int f325061u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f325062v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public static int f325063w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.HashMap f325064x = new java.util.HashMap();

    /* renamed from: y, reason: collision with root package name */
    public static int f325065y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.HashMap f325066z = new java.util.HashMap();
    public static int A = 0;
    public static final java.util.HashMap B = new java.util.HashMap();
    public static int C = 0;
    public static final java.util.HashMap D = new java.util.HashMap();
    public static int E = 0;
    public static final java.util.HashMap F = new java.util.HashMap();
    public static int G = 0;
    public static final java.util.HashMap H = new java.util.HashMap();
    public static int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.HashMap f325040J = new java.util.HashMap();
    public static int K = 0;
    public static final java.util.HashMap L = new java.util.HashMap();
    public static int M = 0;
    public static final java.util.HashMap N = new java.util.HashMap();
    public static int O = 0;
    public static final java.util.HashMap P = new java.util.HashMap();
    public static int Q = 0;
    public static final java.util.HashMap R = new java.util.HashMap();

    public static int a(com.tencent.mm.plugin.lite.api.p pVar) {
        int i17 = f325041a + 1;
        f325041a = i17;
        f325042b.put(java.lang.Integer.valueOf(i17), pVar);
        return f325041a;
    }

    public static void b(int i17, boolean z17) {
        java.util.HashMap hashMap = f325050j;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            return;
        }
        pVar.r(z17);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public static void c(int i17, boolean z17) {
        java.util.HashMap hashMap = f325052l;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            return;
        }
        pVar.s(z17);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public static void d(int i17, int i18, int i19, android.content.Intent intent) {
        java.util.HashMap hashMap = f325042b;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            return;
        }
        if (i19 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, stringExtra);
            }
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(stringExtra);
        }
        pVar.x(i18, i19, intent);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public static void e(int i17, int i18, int i19, android.content.Intent intent) {
        java.util.HashMap hashMap = F;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            return;
        }
        pVar.y(i18, i19, intent);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }
}
