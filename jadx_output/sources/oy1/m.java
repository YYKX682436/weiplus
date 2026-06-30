package oy1;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Integer f349886b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Integer f349887c;

    /* renamed from: e, reason: collision with root package name */
    public static java.util.List f349889e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Integer f349890f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Long f349891g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Integer f349892h;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Long f349895k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.Boolean f349896l;

    /* renamed from: a, reason: collision with root package name */
    public static final oy1.m f349885a = new oy1.m();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f349888d = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f349893i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f349894j = new java.util.concurrent.ConcurrentHashMap();

    public final int a(int i17) {
        ny1.a aVar = (ny1.a) f349893i.get(java.lang.Integer.valueOf(i17));
        if (aVar != null) {
            return aVar.f341398d;
        }
        return 0;
    }

    public final int b() {
        if (f349892h == null) {
            f349892h = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_data_report_sdk_cgi_send_fail_retry_type, 1));
        }
        java.lang.Integer num = f349892h;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void c(java.lang.String str) {
        boolean z17;
        boolean z18;
        boolean z19;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f349893i;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_data_report_sdk_cgi_collect_report_config, "", true);
        if (!kotlin.jvm.internal.o.b(Zi, "")) {
            kotlin.jvm.internal.o.d(Zi);
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportConfig", "initCollectReportConfig ".concat(Zi));
            java.util.List f07 = r26.n0.f0(Zi, new java.lang.String[]{"|"}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                java.util.List f08 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"@"}, false, 0, 6, null);
                if (f08.size() == 3) {
                    java.lang.String str2 = (java.lang.String) f08.get(0);
                    java.lang.String str3 = (java.lang.String) f08.get(1);
                    java.lang.String str4 = (java.lang.String) f08.get(2);
                    try {
                        java.lang.Integer.parseInt(str2);
                        z17 = true;
                    } catch (java.lang.Exception unused) {
                        z17 = false;
                    }
                    if (z17) {
                        int parseInt = java.lang.Integer.parseInt(str2);
                        try {
                            java.lang.Integer.parseInt(str3);
                            z18 = true;
                        } catch (java.lang.Exception unused2) {
                            z18 = false;
                        }
                        int parseInt2 = z18 ? java.lang.Integer.parseInt(str3) : 10;
                        try {
                            java.lang.Long.parseLong(str4);
                            z19 = true;
                        } catch (java.lang.Exception unused3) {
                            z19 = false;
                        }
                        f349894j.put(java.lang.Integer.valueOf(parseInt), new jz5.l(java.lang.Integer.valueOf(parseInt2), java.lang.Long.valueOf(z19 ? java.lang.Long.parseLong(str4) : 60000L)));
                    }
                }
                arrayList.add(jz5.f0.f302826a);
            }
        }
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_data_report_sdk_cgi_config, "", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi2)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(Zi2);
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                if (jSONObject != null) {
                    ny1.a aVar = new ny1.a(jSONObject.optInt("businessId"), jSONObject.optInt("cmdId"), jSONObject.optString("cgiPath"), jSONObject.optInt("tryCount"));
                    int i18 = aVar.f341395a;
                    if (i18 > 0) {
                        concurrentHashMap.put(java.lang.Integer.valueOf(i18), aVar);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportConfig", "reset Expt config cgi Router info [" + aVar + ']');
                }
            }
        } catch (org.json.JSONException | java.lang.Exception unused4) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportConfig", "resetExptConfig [" + str + "] routeMap[" + concurrentHashMap.size() + "] cost[" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ']');
    }

    public final void d() {
        boolean z17;
        boolean z18;
        c(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        f349886b = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_data_report_sdk_cgi_history_msg_config, 1));
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_data_report_sdk_cgi_history_msg_order_config, 1);
        f349887c = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_data_report_sdk_cgi_send_task_config, 5));
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_data_report_sdk_cgi_collect_event_config, "", true);
        if (!kotlin.jvm.internal.o.b(Zi, "")) {
            kotlin.jvm.internal.o.d(Zi);
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportConfig", "collectInfoMap = ".concat(Zi));
            java.util.List f07 = r26.n0.f0(Zi, new java.lang.String[]{"|"}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                java.util.List f08 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"@"}, false, 0, 6, null);
                if (f08.size() == 3) {
                    java.lang.String str = (java.lang.String) f08.get(0);
                    try {
                        java.lang.Integer.parseInt(str);
                        z18 = true;
                    } catch (java.lang.Exception unused) {
                        z18 = false;
                    }
                    if (z18) {
                        int parseInt = java.lang.Integer.parseInt(str);
                        java.util.Map map = f349888d;
                        java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(parseInt));
                        if (map2 == null) {
                            map2 = new java.util.LinkedHashMap();
                            map.put(java.lang.Integer.valueOf(parseInt), map2);
                        }
                        java.util.List list = (java.util.List) map2.get(f08.get(1));
                        if (list == null) {
                            list = new java.util.ArrayList();
                            map2.put(f08.get(1), list);
                        }
                        if (!list.contains(f08.get(2))) {
                            list.add(f08.get(2));
                        }
                    }
                }
                arrayList.add(jz5.f0.f302826a);
            }
        }
        java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_data_report_sdk_cgi_history_msg_biz_id_config, "", true);
        if (kotlin.jvm.internal.o.b(Zi2, "")) {
            return;
        }
        kotlin.jvm.internal.o.d(Zi2);
        if (f349889e == null) {
            f349889e = new java.util.ArrayList();
        }
        for (java.lang.String str2 : r26.n0.f0(Zi2, new java.lang.String[]{"|"}, false, 0, 6, null)) {
            try {
                java.lang.Integer.parseInt(str2);
                z17 = true;
            } catch (java.lang.Exception unused2) {
                z17 = false;
            }
            if (z17) {
                java.util.List list2 = f349889e;
                kotlin.jvm.internal.o.d(list2);
                ((java.util.ArrayList) list2).add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
            }
        }
    }
}
