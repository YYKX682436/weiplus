package oy1;

/* loaded from: classes13.dex */
public final class q0 implements ez1.a {

    /* renamed from: d, reason: collision with root package name */
    public static final oy1.q0 f349919d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f349920e;

    /* renamed from: f, reason: collision with root package name */
    public static android.net.ConnectivityManager.NetworkCallback f349921f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f349922g;

    static {
        int i17;
        oy1.q0 q0Var = new oy1.q0();
        f349919d = q0Var;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.datareport.cgi.newreport.NewCgiReportService$exptIListener$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.autogen.events.ExptChangeEvent event = exptChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                oy1.m.f349885a.c("expt_change");
                return false;
            }
        };
        f349922g = new java.util.LinkedHashMap();
        iListener.alive();
        try {
            java.lang.reflect.Field[] declaredFields = iy1.b.class.getDeclaredFields();
            kotlin.jvm.internal.o.f(declaredFields, "getDeclaredFields(...)");
            for (java.lang.reflect.Field field : declaredFields) {
                java.lang.Object obj = field.get(iy1.b.class);
                java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                ey1.a aVar = (ey1.a) field.getAnnotation(ey1.a.class);
                if (aVar != null) {
                    if (num != null) {
                        java.util.List x07 = kz5.z.x0(aVar.clientLogId());
                        if (x07.isEmpty()) {
                            f349920e = true;
                        } else {
                            java.util.Map map = f349922g;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.Iterator it = x07.iterator();
                            while (it.hasNext()) {
                                int intValue = ((java.lang.Number) it.next()).intValue();
                                if (intValue > 0) {
                                    arrayList.add(java.lang.Integer.valueOf(intValue));
                                }
                            }
                            map.put(num, arrayList);
                        }
                        int cmdId = aVar.cmdId();
                        java.lang.String cgiPath = aVar.cgiPath();
                        int retryCnt = aVar.retryCnt();
                        if (cmdId <= 0 || kotlin.jvm.internal.o.b(cgiPath, "")) {
                            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                            f349920e = true;
                        } else {
                            oy1.m mVar = oy1.m.f349885a;
                            int intValue2 = num.intValue();
                            kotlin.jvm.internal.o.g(cgiPath, "cgiPath");
                            if (intValue2 > 0) {
                                oy1.m.f349893i.put(java.lang.Integer.valueOf(intValue2), new ny1.a(intValue2, cmdId, cgiPath, retryCnt));
                            }
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("init report route bizId = ");
                        sb6.append(num);
                        sb6.append(", cmdId = ");
                        sb6.append(cmdId);
                        sb6.append(" cgiPath = ");
                        sb6.append(cgiPath);
                        sb6.append(" retryCnt = ");
                        sb6.append(retryCnt);
                        sb6.append(" clientLogId = ");
                        java.lang.String arrays = java.util.Arrays.toString(aVar.clientLogId());
                        kotlin.jvm.internal.o.f(arrays, "toString(...)");
                        sb6.append(arrays);
                        sb6.append(" serverLogId = ");
                        java.lang.String arrays2 = java.util.Arrays.toString(aVar.serverLogId());
                        kotlin.jvm.internal.o.f(arrays2, "toString(...)");
                        sb6.append(arrays2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", sb6.toString());
                    } else {
                        f349920e = true;
                    }
                }
            }
            i17 = 105;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiReportService", "get kv log config err");
            q0Var.c();
            i17 = 105;
            jx3.f.INSTANCE.t(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, 105);
        }
        if (f349920e) {
            jx3.f.INSTANCE.t(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, i17);
            q0Var.c();
        }
    }

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            oy1.u.f349928a.c(true);
            a(null);
            b();
            ((ku5.t0) ku5.t0.f312615d).h(oy1.p0.f349917d, "MicroMsg.CgiReportService");
        }
    }

    public final void a(android.content.Context context) {
        if (f349921f == null) {
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            java.lang.Object systemService = context != null ? context.getSystemService("connectivity") : null;
            android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    oy1.m0 m0Var = new oy1.m0(connectivityManager);
                    f349921f = m0Var;
                    connectivityManager.requestNetwork(new android.net.NetworkRequest.Builder().build(), m0Var);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMKvUtils", "check on line err " + e17);
                    try {
                        android.net.ConnectivityManager.NetworkCallback networkCallback = f349921f;
                        if (networkCallback != null) {
                            connectivityManager.unregisterNetworkCallback(networkCallback);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    f349921f = null;
                }
            }
        }
    }

    public final void b() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((ku5.t0) ku5.t0.f312615d).l(oy1.n0.f349909d, 1000L, "MicroMsg.CgiReportService");
        }
    }

    @Override // ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            oy1.u.f349928a.c(false);
        }
    }

    public final void c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(29309);
        java.util.Map map = f349922g;
        map.put(1, arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(29309);
        map.put(2, arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(29205);
        map.put(3, arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(29572);
        map.put(4, arrayList4);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(29771);
        map.put(5, arrayList5);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(29771);
        map.put(9, arrayList6);
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(30149);
        map.put(6, arrayList7);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(30481);
        map.put(7, arrayList8);
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(30482);
        map.put(8, arrayList9);
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(31502);
        map.put(10, arrayList10);
    }

    public final void d(int i17, r45.pq5 pq5Var) {
        java.util.Map map = f349922g;
        if (!map.containsKey(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiReportService", "cur businessId = " + i17);
            return;
        }
        oy1.p pVar = oy1.p.f349911a;
        java.lang.String event_id = pq5Var.f383314e;
        kotlin.jvm.internal.o.f(event_id, "event_id");
        if (oy1.p.f349916f.contains(event_id)) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.SDKClientReportDataStruct sDKClientReportDataStruct = new com.tencent.mm.autogen.mmdata.rpt.SDKClientReportDataStruct();
        sDKClientReportDataStruct.f60118d = i17;
        sDKClientReportDataStruct.f60119e = sDKClientReportDataStruct.b("Version", "3.1.1", true);
        sDKClientReportDataStruct.f60120f = sz1.a.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        sDKClientReportDataStruct.f60121g = sz1.a.d();
        r45.nq5 nq5Var = pq5Var.f383313d;
        sDKClientReportDataStruct.f60122h = nq5Var.f381602d;
        sDKClientReportDataStruct.f60123i = sDKClientReportDataStruct.b("ReportSDKItemID", nq5Var.f381603e, true);
        sDKClientReportDataStruct.f60124j = sDKClientReportDataStruct.b("SDKSessionID", pq5Var.f383313d.f381607i, true);
        java.lang.String curr_page_json = pq5Var.f383313d.f381604f;
        kotlin.jvm.internal.o.f(curr_page_json, "curr_page_json");
        sDKClientReportDataStruct.f60125k = sDKClientReportDataStruct.b("CurPageJson", r26.i0.u(curr_page_json, ',', ';', false, 4, null), true);
        java.lang.String ref_page_json = pq5Var.f383313d.f381606h;
        kotlin.jvm.internal.o.f(ref_page_json, "ref_page_json");
        sDKClientReportDataStruct.f60126l = sDKClientReportDataStruct.b("RefPageJson", r26.i0.u(ref_page_json, ',', ';', false, 4, null), true);
        java.lang.String source_page_json = pq5Var.f383313d.f381605g;
        kotlin.jvm.internal.o.f(source_page_json, "source_page_json");
        sDKClientReportDataStruct.f60127m = sDKClientReportDataStruct.b("SourcePageJson", r26.i0.u(source_page_json, ',', ';', false, 4, null), true);
        sDKClientReportDataStruct.f60128n = sDKClientReportDataStruct.b("EventID", pq5Var.f383314e, true);
        r45.uq5 uq5Var = pq5Var.f383315f;
        sDKClientReportDataStruct.f60130p = uq5Var.f387577d;
        sDKClientReportDataStruct.f60129o = uq5Var.f387578e;
        java.lang.String data_json = pq5Var.f383316g;
        kotlin.jvm.internal.o.f(data_json, "data_json");
        sDKClientReportDataStruct.f60131q = sDKClientReportDataStruct.b("EventDataJson", r26.i0.u(data_json, ',', ';', false, 4, null), true);
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                sDKClientReportDataStruct.n();
                jx3.f.INSTANCE.p(intValue, sDKClientReportDataStruct.m(), false, false, true);
            }
        }
    }

    public final void e(int i17, java.util.List reportInfoList, boolean z17) {
        java.util.Iterator it;
        kotlin.jvm.internal.o.g(reportInfoList, "reportInfoList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = reportInfoList.iterator();
        while (it6.hasNext()) {
            oy1.n nVar = (oy1.n) it6.next();
            int i18 = nVar.f349898d;
            if (ny1.b.f341399b == null) {
                ny1.b.f341399b = new ny1.b();
            }
            if (ny1.b.f341399b.a(i18, nVar.f349901g, nVar.f349906o)) {
                r45.uc4 uc4Var = new r45.uc4();
                uc4Var.f387217d = nVar.f349899e;
                oy1.q0 q0Var = f349919d;
                int i19 = nVar.f349900f;
                java.lang.String str = nVar.f349901g;
                java.lang.String str2 = nVar.f349902h;
                java.lang.String str3 = nVar.f349903i;
                java.lang.String str4 = nVar.f349904m;
                java.lang.String str5 = nVar.f349905n;
                java.lang.String str6 = nVar.f349906o;
                long j17 = nVar.f349907p;
                java.lang.String str7 = nVar.f349908q;
                r45.pq5 pq5Var = new r45.pq5();
                it = it6;
                r45.nq5 nq5Var = new r45.nq5();
                pq5Var.f383313d = nq5Var;
                nq5Var.f381602d = i19;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str8 = "";
                if (str == null) {
                    str = "";
                }
                nq5Var.f381603e = str;
                if (str2 == null) {
                    str2 = "";
                }
                nq5Var.f381604f = str2;
                if (str3 == null) {
                    str3 = "";
                }
                nq5Var.f381605g = str3;
                if (str4 == null) {
                    str4 = "";
                }
                nq5Var.f381606h = str4;
                if (str5 == null) {
                    str5 = "";
                }
                nq5Var.f381607i = str5;
                r45.uq5 uq5Var = new r45.uq5();
                pq5Var.f383315f = uq5Var;
                uq5Var.f387577d = j17;
                uq5Var.f387578e = c01.id.c();
                pq5Var.f383314e = str6;
                if (str7 == null) {
                    str7 = "";
                }
                pq5Var.f383316g = str7;
                if (com.tencent.mm.sdk.platformtools.t8.K0(pq5Var.f383313d.f381605g)) {
                    r45.nq5 nq5Var2 = pq5Var.f383313d;
                    nq5Var2.f381605g = nq5Var2.f381606h;
                }
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    q0Var.d(i18, pq5Var);
                }
                try {
                    java.lang.String optString = new org.json.JSONObject(pq5Var.f383316g).optString("feedid", "null");
                    r45.nq5 nq5Var3 = pq5Var.f383313d;
                    java.lang.String format = java.lang.String.format("%s_[%s]_[%s]_[%s]", java.util.Arrays.copyOf(new java.lang.Object[]{nq5Var3.f381603e, pq5Var.f383314e, optString, nq5Var3.f381607i}, 4));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    str8 = format;
                } catch (java.lang.NullPointerException | org.json.JSONException | java.lang.Exception unused) {
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", "createItemData : ".concat(str8));
                uc4Var.f387218e = pq5Var;
                uc4Var.f387219f = "default";
                uc4Var.f387220g = java.lang.System.currentTimeMillis();
                if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("other_process_add_msg_id", i18);
                    bundle.putByteArray("other_process_add_msg", uc4Var.toByteArray());
                    com.tencent.mm.ipcinvoker.d0.d(str9, bundle, oy1.k0.class, null);
                } else if (z17) {
                    arrayList.add(uc4Var);
                } else {
                    oy1.c0 a17 = oy1.u.f349928a.a(i18);
                    if (a17 != null) {
                        a17.e(uc4Var);
                    }
                }
            } else {
                it = it6;
            }
            it6 = it;
        }
        if (z17) {
            oy1.u.f349928a.b(i17, arrayList);
        }
    }
}
