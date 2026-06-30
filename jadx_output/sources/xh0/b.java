package xh0;

/* loaded from: classes11.dex */
public class b extends l75.n0 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f454471p = {l75.n0.getCreateSQLs(dm.w1.M, "ChatBotConfig")};

    /* renamed from: q, reason: collision with root package name */
    public static volatile xh0.b f454472q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Map f454473r = new java.util.HashMap(32);

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f454474d;

    /* renamed from: e, reason: collision with root package name */
    public final xh0.d f454475e;

    /* renamed from: f, reason: collision with root package name */
    public final xh0.d f454476f;

    /* renamed from: g, reason: collision with root package name */
    public final xh0.d f454477g;

    /* renamed from: h, reason: collision with root package name */
    public final xh0.d f454478h;

    /* renamed from: i, reason: collision with root package name */
    public final xh0.d f454479i;

    /* renamed from: m, reason: collision with root package name */
    public final xh0.d f454480m;

    /* renamed from: n, reason: collision with root package name */
    public final xh0.d f454481n;

    /* renamed from: o, reason: collision with root package name */
    public final xh0.d f454482o;

    public b(l75.k0 k0Var) {
        super(k0Var, dm.w1.M, "ChatBotConfig", f454471p);
        this.f454475e = new xh0.d(this, dm.w1.f240720s, null);
        this.f454476f = new xh0.d(this, dm.w1.f240721t, null);
        this.f454477g = new xh0.d(this, dm.w1.f240722u, null);
        this.f454478h = new xh0.d(this, dm.w1.f240723v, null);
        this.f454479i = new xh0.d(this, dm.w1.f240724w, null);
        this.f454480m = new xh0.d(this, dm.w1.f240725x, null);
        this.f454481n = new xh0.d(this, dm.w1.f240726y, null);
        this.f454482o = new xh0.d(this, dm.w1.f240727z, null);
        this.f454474d = k0Var;
    }

    public static xh0.b J0() {
        if (f454472q == null) {
            synchronized (xh0.b.class) {
                if (f454472q == null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(1570978641, new xh0.b$$a());
                    gm0.b0 u17 = gm0.j1.u();
                    u17.b(u17.f273153f, hashMap, false);
                    f454472q = new xh0.b(u17.f273153f);
                }
            }
        }
        return f454472q;
    }

    public java.util.Set D0() {
        java.util.List list;
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            list = dm.w1.f240718q.h(dm.w1.f240719r).a().k(this.f454474d, dm.w1.class);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotConfigStorage", th6, "getAllChatbots maybe timeout", new java.lang.Object[0]);
            list = null;
        }
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatBotConfigStorage", "[-] fail to getAllChatbots from db.");
            hashSet.add("wxid_wi_1d142z0zdj03");
            return hashSet;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) ((dm.w1) it.next()).t0().get(dm.w1.f240719r.f352625a);
            if (!android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotConfigStorage", "[+] get getAllChatbots from db, value: %s", str);
                hashSet.add(str);
            }
        }
        hashSet.add("wxid_wi_1d142z0zdj03");
        return hashSet;
    }
}
