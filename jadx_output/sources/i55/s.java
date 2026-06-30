package i55;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f288879b = false;

    /* renamed from: c, reason: collision with root package name */
    public static int f288880c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f288881d = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f288885h;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Set f288887j;

    /* renamed from: a, reason: collision with root package name */
    public static final i55.s f288878a = new i55.s();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f288882e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f288883f = jz5.h.b(i55.r.f288877d);

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f288884g = "";

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f288886i = jz5.h.b(i55.q.f288876d);

    static {
        f55.e eVar = f55.e.f259771e;
        f55.e eVar2 = f55.e.f259771e;
        f288887j = kz5.z.D0(new java.lang.Integer[]{2, 3});
    }

    public final void a(int i17, long j17, int i18, java.lang.String curPageName) {
        g55.g gVar;
        if (i17 == -1 || (gVar = (g55.g) d().get(java.lang.Integer.valueOf(i17))) == null) {
            return;
        }
        kotlin.jvm.internal.o.g(curPageName, "curPageName");
        if (kotlin.jvm.internal.o.b(curPageName, gVar.f268978c)) {
            long j18 = gVar.f268989n;
            if (j17 <= j18 || j18 == 0) {
                return;
            }
            gVar.f268987l += j17 - j18;
            gVar.f268989n = 0L;
        }
    }

    public final void b(int i17, long j17, int i18, java.lang.String pageName, int i19) {
        boolean z17;
        java.lang.Long l17;
        boolean z18;
        if (i17 != -1) {
            e55.e eVar = e55.e.f249667a;
            kotlin.jvm.internal.o.g(pageName, "pageName");
            if (e55.e.f249669c.contains(pageName)) {
                return;
            }
            if (!f288879b && !d().containsKey(java.lang.Integer.valueOf(i17))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleLogic", "last page [" + i17 + "] out");
                java.lang.Object obj = "";
                jz5.l lVar = (jz5.l) ((java.util.LinkedHashMap) f288882e).get(java.lang.Integer.valueOf(i17));
                if (lVar != null) {
                    z17 = ((java.lang.Boolean) lVar.f302834e).booleanValue();
                    obj = lVar.f302833d;
                } else {
                    z17 = false;
                }
                i55.m mVar = i55.m.f288857a;
                java.util.Map map = (java.util.Map) ((java.util.LinkedHashMap) i55.m.f288858b).get(java.lang.Integer.valueOf(i17));
                java.util.Map d17 = d();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                java.lang.String str = (java.lang.String) obj;
                g55.g gVar = new g55.g(j17, i18, pageName, i19, str);
                gVar.a(j17, 0);
                if (map != null) {
                    java.util.Map map2 = gVar.f268981f;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    linkedHashMap.putAll(map);
                    map2.put("tab_info", linkedHashMap);
                }
                gVar.f268994s = z17;
                d17.put(valueOf, gVar);
                if (z17) {
                    synchronized (c()) {
                        i55.s sVar = f288878a;
                        if (!sVar.c().containsKey(java.lang.Integer.valueOf(i19))) {
                            sVar.c().put(java.lang.Integer.valueOf(i19), new g55.h(pageName, i19));
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleLogic", pageName + "  " + str + " onClick ");
                    java.lang.Integer num = (java.lang.Integer) i55.m.f288864h.get(java.lang.Integer.valueOf(i17));
                    i55.p pVar = new i55.p(i18, pageName, i19, str, num != null ? num.intValue() : 32024, map);
                    java.lang.String key = pVar.f288871b;
                    kotlin.jvm.internal.o.g(key, "key");
                    if (e55.e.f249672f == null) {
                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_red_dot_report_page_delay_time, "*$5000", true);
                        if (Zi != null) {
                            java.util.List f07 = r26.n0.f0(Zi, new java.lang.String[]{"|"}, false, 0, 6, null);
                            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
                            java.util.Iterator it = f07.iterator();
                            while (it.hasNext()) {
                                java.util.List f08 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"$"}, false, 0, 6, null);
                                if (f08.size() == 2) {
                                    try {
                                        java.lang.Long.parseLong((java.lang.String) f08.get(1));
                                        z18 = true;
                                    } catch (java.lang.Exception unused) {
                                        z18 = false;
                                    }
                                    if (z18) {
                                        linkedHashMap2.put(f08.get(0), java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) f08.get(1))));
                                    }
                                }
                                arrayList.add(jz5.f0.f302826a);
                            }
                        }
                        e55.e.f249672f = linkedHashMap2;
                    }
                    java.util.Map map3 = e55.e.f249672f;
                    if (map3 == null || (l17 = (java.lang.Long) ((java.util.LinkedHashMap) map3).get(key)) == null) {
                        java.util.Map map4 = e55.e.f249672f;
                        l17 = map4 != null ? (java.lang.Long) ((java.util.LinkedHashMap) map4).get("*") : null;
                    }
                    if (l17 != null) {
                        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a), null, null, new i55.o(l17.longValue(), pVar, null), 3, null);
                    }
                }
                f288882e.remove(java.lang.Integer.valueOf(i17));
            } else if (f288879b) {
                g55.g gVar2 = (g55.g) d().get(java.lang.Integer.valueOf(i17));
                if (gVar2 != null) {
                    gVar2.b(j17, 0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleLogic", "other tab out " + gVar2);
                    i55.s sVar2 = f288878a;
                    sVar2.e("main_entry_page_session_out", i17, gVar2.c());
                    synchronized (sVar2.c()) {
                        g55.h hVar = (g55.h) sVar2.c().get(java.lang.Integer.valueOf(gVar2.f268979d));
                        if (hVar != null) {
                            hVar.f268997c++;
                            com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleLogic", pageName + " resume cur back to 4tab cnt = " + hVar.f268997c);
                        }
                    }
                }
                f288881d = -1;
            }
            g55.g gVar3 = (g55.g) d().get(java.lang.Integer.valueOf(i17));
            if (gVar3 != null && kotlin.jvm.internal.o.b(pageName, gVar3.f268978c) && gVar3.f268989n == 0) {
                gVar3.f268989n = j17;
            }
        }
    }

    public final java.util.Map c() {
        return (java.util.Map) ((jz5.n) f288886i).getValue();
    }

    public final java.util.Map d() {
        return (java.util.Map) ((jz5.n) f288883f).getValue();
    }

    public final void e(java.lang.String event, int i17, java.util.Map params) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(params, "params");
        if (f288887j.contains(java.lang.Integer.valueOf(i17))) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.putAll(params);
            linkedHashMap.putAll(e55.e.f249667a.j());
            i55.m mVar = i55.m.f288857a;
            java.lang.Integer num = (java.lang.Integer) i55.m.f288864h.get(java.lang.Integer.valueOf(i17));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(event, linkedHashMap, num != null ? num.intValue() : 32024);
        }
    }
}
