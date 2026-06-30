package fm3;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f264049b = true;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f264050c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f264051d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Integer f264052e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Long f264053f;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f264055h;

    /* renamed from: i, reason: collision with root package name */
    public static r45.hf2 f264056i;

    /* renamed from: j, reason: collision with root package name */
    public static com.tencent.mm.protobuf.g f264057j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f264058k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.ArrayList f264059l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f264060m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f264061n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f264062o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashMap f264063p;

    /* renamed from: q, reason: collision with root package name */
    public static hm3.t f264064q;

    /* renamed from: r, reason: collision with root package name */
    public static int f264065r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f264066s;

    /* renamed from: t, reason: collision with root package name */
    public static android.app.Activity f264067t;

    /* renamed from: a, reason: collision with root package name */
    public static final fm3.f0 f264048a = new fm3.f0();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f264054g = new java.util.HashMap();

    static {
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.o.f(synchronizedList, "synchronizedList(...)");
        f264058k = synchronizedList;
        f264059l = new java.util.ArrayList();
        f264060m = new java.util.HashMap();
        f264061n = new java.util.HashMap();
        f264062o = new java.util.HashMap();
        f264063p = new java.util.HashMap();
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), fm3.e0.f264045d);
    }

    public final void a(boolean z17) {
        f264055h = z17;
        r45.hf2 hf2Var = f264056i;
        java.lang.String string = hf2Var != null ? hf2Var.getString(5) : null;
        com.tencent.mm.protobuf.g gVar = f264057j;
        if (string == null || gVar == null) {
            return;
        }
        gm0.j1.d().g(new hm3.r(string, gVar, z17, 0));
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSessionEnd, songName:");
        r45.hf2 hf2Var = f264056i;
        sb6.append(hf2Var != null ? hf2Var.getString(0) : null);
        sb6.append(", singer:");
        r45.hf2 hf2Var2 = f264056i;
        sb6.append(hf2Var2 != null ? hf2Var2.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvChattingDataManger", sb6.toString());
        a(true);
        f264059l.clear();
        f264049b = true;
    }
}
