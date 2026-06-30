package ll0;

/* loaded from: classes11.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f319120c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b4 f319121d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f319122a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f319123b = false;

    static {
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4("KaraCleanCache", (com.tencent.mm.sdk.platformtools.a4) new ll0.a(), false);
        f319121d = b4Var;
        b4Var.setLogging(false);
    }

    public java.lang.Object a(java.lang.String str, ll0.b bVar) {
        java.lang.Object obj;
        if (!this.f319123b) {
            this.f319122a = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_plugin_kara_data_cache", "1", false, true), 1) != 0;
            this.f319123b = true;
        }
        if (!this.f319122a) {
            return bVar.getData();
        }
        java.util.Map map = f319120c;
        synchronized (map) {
            java.lang.Class<?> cls = getClass();
            if (((java.util.HashMap) map).get(cls) == null) {
                ((java.util.HashMap) map).put(cls, new java.util.HashMap());
            }
            java.util.Map map2 = (java.util.Map) ((java.util.HashMap) map).get(cls);
            obj = map2.get(str);
            if (obj == null) {
                obj = bVar.getData();
                map2.put(str, obj);
            }
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = f319121d;
        if (b4Var.e()) {
            b4Var.c(1200000L, 1200000L);
        }
        return obj;
    }
}
