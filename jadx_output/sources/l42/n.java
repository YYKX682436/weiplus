package l42;

@j95.b
/* loaded from: classes15.dex */
public class n extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f315999d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f316000e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f316001f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f316002g;

    /* renamed from: h, reason: collision with root package name */
    public l42.c f316003h;

    /* renamed from: i, reason: collision with root package name */
    public final l42.y f316004i = new l42.d(this);

    public static l42.n Ai() {
        return (l42.n) i95.n0.c(l42.n.class);
    }

    public static void wi(l42.n nVar) {
        r45.yh0 yh0Var;
        com.tencent.mm.sdk.platformtools.o4 d17;
        java.util.Map map = nVar.f315999d;
        if (map != null) {
            java.util.HashMap hashMap = (java.util.HashMap) map;
            if (hashMap.size() > 0) {
                yh0Var = new r45.yh0();
                for (s42.b bVar : hashMap.values()) {
                    if (!u46.l.e(bVar.f402931a)) {
                        r45.xh0 xh0Var = new r45.xh0();
                        xh0Var.f390092d = bVar.f402931a;
                        xh0Var.f390093e = bVar.f402932b;
                        xh0Var.f390094f = bVar.f402933c;
                        xh0Var.f390095g = bVar.f402934d;
                        xh0Var.f390097i = bVar.f402936f;
                        xh0Var.f390104s = bVar.f402940j;
                        xh0Var.f390102q = bVar.f402937g;
                        xh0Var.f390101p = bVar.f402938h;
                        xh0Var.f390098m = bVar.f402939i;
                        xh0Var.f390099n = bVar.f402941k;
                        xh0Var.f390105t = bVar.f402942l;
                        xh0Var.f390103r = bVar.f402944n;
                        xh0Var.f390100o = bVar.f402943m;
                        java.util.Iterator it = ((java.util.ArrayList) bVar.f402935e).iterator();
                        while (it.hasNext()) {
                            s42.a aVar = (s42.a) it.next();
                            r45.sh0 sh0Var = new r45.sh0();
                            sh0Var.f385711d = aVar.f402928a;
                            sh0Var.f385713f = aVar.f402930c;
                            sh0Var.f385712e = aVar.f402929b;
                            xh0Var.f390096h.add(sh0Var);
                        }
                        yh0Var.f391076d.add(xh0Var);
                    }
                }
                if (yh0Var != null || (d17 = g42.i.d()) == null) {
                }
                try {
                    com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionPageConfigChangeEvent encode mmkvEncode : " + d17.H("mmkv_key_script_config_container", yh0Var.toByteArray()));
                    return;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionPageConfigChangeEvent encode throw IOException : " + e17.getMessage());
                    return;
                }
            }
        }
        yh0Var = null;
        if (yh0Var != null) {
        }
    }

    public java.util.List Bi() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f315999d) {
            java.util.Iterator it = this.f315999d.values().iterator();
            while (it.hasNext()) {
                arrayList.add((s42.b) it.next());
            }
        }
        java.util.Collections.sort(arrayList, new l42.f(this));
        return arrayList;
    }

    public final void Di() {
        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig, uin : " + j62.e.g().n());
        com.tencent.mm.sdk.platformtools.o4 d17 = g42.i.d();
        if (d17 == null) {
            return;
        }
        byte[] j17 = d17.j("mmkv_key_script_config_container");
        if (j17 != null && j17.length > 0) {
            r45.yh0 yh0Var = new r45.yh0();
            try {
                yh0Var.parseFrom(j17);
                java.util.Map b17 = r42.c.b(yh0Var);
                if (b17 != null) {
                    java.util.Iterator it = ((java.util.HashMap) b17).values().iterator();
                    while (it.hasNext()) {
                        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig, scriptConfigModel configID : " + ((s42.b) it.next()).f402931a);
                    }
                    this.f315999d = b17;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig parse script config throw Exception : " + e17.getMessage());
            }
        }
        byte[] j18 = d17.j("mmkv_key_sql_config_container");
        if (j18 == null || j18.length <= 0) {
            return;
        }
        r45.ai0 ai0Var = new r45.ai0();
        try {
            ai0Var.parseFrom(j18);
            java.util.Map c17 = r42.c.c(ai0Var);
            if (c17 != null) {
                java.util.Iterator it6 = ((java.util.HashMap) c17).values().iterator();
                while (it6.hasNext()) {
                    com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig, sqlConfigModel configID : " + ((s42.c) it6.next()).f402945a);
                }
                this.f316000e = c17;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("EdgeComputingConfigService", "[EdgeComputingConfigService] initConfig parse sql config throw Exception : " + e18.getMessage());
        }
    }

    public final void Ni() {
        int i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (s42.b bVar : this.f315999d.values()) {
            if (bVar.f402932b == 1 && (i17 = bVar.f402933c) > 0) {
                java.util.List list = (java.util.List) hashMap.get(java.lang.String.valueOf(i17));
                if (list == null) {
                    list = new java.util.ArrayList();
                    hashMap.put(java.lang.String.valueOf(bVar.f402933c), list);
                }
                list.add(bVar);
            }
        }
        this.f316001f = hashMap;
    }

    public final void Ri() {
        r45.ai0 ai0Var;
        com.tencent.mm.sdk.platformtools.o4 d17;
        java.util.Map map = this.f316000e;
        if (map != null) {
            java.util.HashMap hashMap = (java.util.HashMap) map;
            if (hashMap.size() > 0) {
                ai0Var = new r45.ai0();
                for (s42.c cVar : hashMap.values()) {
                    if (!u46.l.e(cVar.f402945a)) {
                        r45.zh0 zh0Var = new r45.zh0();
                        zh0Var.f392054d = cVar.f402945a;
                        zh0Var.f392055e = cVar.f402946b;
                        zh0Var.f392056f = cVar.f402947c;
                        zh0Var.f392061n = cVar.f402948d;
                        zh0Var.f392059i = cVar.f402952h;
                        zh0Var.f392057g = cVar.f402949e;
                        zh0Var.f392060m = cVar.f402950f;
                        zh0Var.f392058h = cVar.f402951g;
                        ai0Var.f370018d.add(zh0Var);
                    }
                }
                if (ai0Var != null || (d17 = g42.i.d()) == null) {
                }
                try {
                    com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionEdgeSqlChangeEvent encode mmkvEncode : " + d17.H("mmkv_key_sql_config_container", ai0Var.toByteArray()));
                    return;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionEdgeSqlChangeEvent encode throw IOException : " + e17.getMessage());
                    return;
                }
            }
        }
        ai0Var = null;
        if (ai0Var != null) {
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] onAccountInitialized, uin : " + j62.e.g().n());
        this.f315999d = new java.util.HashMap();
        this.f316000e = new java.util.HashMap();
        this.f316001f = new java.util.HashMap();
        Di();
        Ni();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("EdgeComputingConfigService", "[EdgeComputingConfigService] onAccountRåelease, uin : " + j62.e.g().n());
        this.f315999d = new java.util.HashMap();
        this.f316000e = new java.util.HashMap();
        this.f316001f = new java.util.HashMap();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        this.f315999d = new java.util.HashMap();
        this.f316000e = new java.util.HashMap();
        this.f316001f = new java.util.HashMap();
        this.f316002g = new com.tencent.mm.sdk.platformtools.n3("EdgeComputingConfigService#mParseConfigHandler");
        this.f316003h = new l42.c();
        Di();
        Ni();
    }
}
