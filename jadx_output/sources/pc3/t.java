package pc3;

/* loaded from: classes7.dex */
public final class t extends com.tencent.mm.plugin.magicbrush.m4 implements zg.a {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f353399e;

    /* renamed from: f, reason: collision with root package name */
    public final jc3.c0 f353400f;

    /* renamed from: g, reason: collision with root package name */
    public final jc3.y f353401g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f353402h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f353403i;

    public t(android.content.Context context, jc3.c0 publicServiceMgr, jc3.y pluginMgr) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(publicServiceMgr, "publicServiceMgr");
        kotlin.jvm.internal.o.g(pluginMgr, "pluginMgr");
        this.f353399e = context;
        this.f353400f = publicServiceMgr;
        this.f353401g = pluginMgr;
        this.f353402h = new java.util.concurrent.ConcurrentHashMap();
        this.f353403i = com.tencent.mm.ui.bk.C();
        com.tencent.mm.sdk.platformtools.o4 o4Var = ue3.b.f426891a;
        com.tencent.mars.xlog.Log.i("MagicBrushJsApiMMKVUtil", "init mmkv");
        ue3.b.f426891a.d();
    }

    @Override // com.tencent.mm.plugin.magicbrush.n4
    public synchronized qc3.f B5(java.lang.String instanceName, qc3.c client) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(client, "client");
        com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "biz connect for ".concat(instanceName));
        sc3.k1 k1Var = (sc3.k1) this.f353402h.get(instanceName);
        if (k1Var != null) {
            return k1Var;
        }
        com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "create biz server for ".concat(instanceName));
        sc3.k1 k1Var2 = new sc3.k1(this.f353399e, instanceName, new com.tencent.magicbrush.biz.MBBizManager(this, instanceName), new pc3.n(this), new pc3.o(this));
        k1Var2.m1(client);
        this.f353402h.put(instanceName, k1Var2);
        return k1Var2;
    }

    public final synchronized void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "onAppForegroundStateChange: isForeground = " + z17);
        e(z17 ? com.tencent.mm.plugin.appbrand.page.n2.NAME : com.tencent.mm.plugin.appbrand.page.m2.NAME, "");
    }

    public final void e(java.lang.String eventName, java.lang.String data) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.Set<java.lang.String> keySet = this.f353402h.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        for (java.lang.String str : keySet) {
            bf3.g0 g0Var = bf3.g0.f19627a;
            kotlin.jvm.internal.o.d(str);
            g0Var.b(str, new pc3.s(this, str, eventName, data));
        }
    }
}
