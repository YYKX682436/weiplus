package oy1;

/* loaded from: classes13.dex */
public final class s extends oy1.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f349924e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f349925f = new java.util.LinkedHashMap();

    public s() {
        int i17;
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
                            this.f349924e = true;
                        } else {
                            java.util.Map map = this.f349925f;
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
                            this.f349924e = true;
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
                        com.tencent.mars.xlog.Log.i("MicroMsg.CgiReporter", sb6.toString());
                    } else {
                        this.f349924e = true;
                    }
                }
            }
            i17 = 105;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiReporter", "get kv log config err");
            g();
            i17 = 105;
            jx3.f.INSTANCE.t(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, 105);
        }
        if (this.f349924e) {
            jx3.f.INSTANCE.t(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, i17);
            g();
        }
    }

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                a(null);
                b();
            }
            oy1.u.f349928a.c(true);
            ((ku5.t0) ku5.t0.f312615d).h(new oy1.r(this), "MicroMsg.CgiReporter");
        }
    }

    @Override // oy1.l, ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            oy1.u.f349928a.c(false);
        }
    }

    @Override // oy1.l
    public void c(int i17, java.util.List reportInfoList, boolean z17) {
        kotlin.jvm.internal.o.g(reportInfoList, "reportInfoList");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = reportInfoList.iterator();
            while (it.hasNext()) {
                oy1.n nVar = (oy1.n) it.next();
                int i18 = nVar.f349898d;
                if (ny1.b.f341399b == null) {
                    ny1.b.f341399b = new ny1.b();
                }
                if (ny1.b.f341399b.a(i18, nVar.f349901g, nVar.f349906o)) {
                    r45.uc4 uc4Var = new r45.uc4();
                    uc4Var.f387217d = nVar.f349899e;
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
                        java.util.Map map = this.f349925f;
                        if (map.containsKey(java.lang.Integer.valueOf(i18))) {
                            oy1.p pVar = oy1.p.f349911a;
                            java.lang.String event_id = pq5Var.f383314e;
                            kotlin.jvm.internal.o.f(event_id, "event_id");
                            if (!oy1.p.f349916f.contains(event_id)) {
                                com.tencent.mm.autogen.mmdata.rpt.SDKClientReportDataStruct sDKClientReportDataStruct = new com.tencent.mm.autogen.mmdata.rpt.SDKClientReportDataStruct();
                                sDKClientReportDataStruct.f60118d = i18;
                                sDKClientReportDataStruct.f60119e = sDKClientReportDataStruct.b("Version", "3.1.1", true);
                                sDKClientReportDataStruct.f60120f = sz1.a.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                sDKClientReportDataStruct.f60121g = sz1.a.d();
                                r45.nq5 nq5Var3 = pq5Var.f383313d;
                                sDKClientReportDataStruct.f60122h = nq5Var3.f381602d;
                                sDKClientReportDataStruct.f60123i = sDKClientReportDataStruct.b("ReportSDKItemID", nq5Var3.f381603e, true);
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
                                r45.uq5 uq5Var2 = pq5Var.f383315f;
                                sDKClientReportDataStruct.f60130p = uq5Var2.f387577d;
                                sDKClientReportDataStruct.f60129o = uq5Var2.f387578e;
                                java.lang.String data_json = pq5Var.f383316g;
                                kotlin.jvm.internal.o.f(data_json, "data_json");
                                sDKClientReportDataStruct.f60131q = sDKClientReportDataStruct.b("EventDataJson", r26.i0.u(data_json, ',', ';', false, 4, null), true);
                                java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i18));
                                if (list != null) {
                                    java.util.Iterator it6 = list.iterator();
                                    while (it6.hasNext()) {
                                        int intValue = ((java.lang.Number) it6.next()).intValue();
                                        sDKClientReportDataStruct.n();
                                        jx3.f.INSTANCE.p(intValue, sDKClientReportDataStruct.m(), false, false, true);
                                    }
                                }
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.CgiReporter", "cur businessId = " + i18);
                        }
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createItemData : ");
                    try {
                        java.lang.String optString = new org.json.JSONObject(pq5Var.f383316g).optString("feedid", "null");
                        r45.nq5 nq5Var4 = pq5Var.f383313d;
                        java.lang.String format = java.lang.String.format("%s_[%s]_[%s]_[%s]", java.util.Arrays.copyOf(new java.lang.Object[]{nq5Var4.f381603e, pq5Var.f383314e, optString, nq5Var4.f381607i}, 4));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                        str8 = format;
                    } catch (java.lang.NullPointerException | org.json.JSONException | java.lang.Exception unused) {
                    }
                    sb6.append(str8);
                    com.tencent.mars.xlog.Log.i("MicroMsg.CgiReporter", sb6.toString());
                    uc4Var.f387218e = pq5Var;
                    uc4Var.f387219f = "default";
                    uc4Var.f387220g = java.lang.System.currentTimeMillis();
                    if (z17) {
                        arrayList.add(uc4Var);
                    } else {
                        oy1.c0 a17 = oy1.u.f349928a.a(i18);
                        if (a17 != null) {
                            a17.e(uc4Var);
                        }
                    }
                    if (z17) {
                        oy1.u.f349928a.b(i17, arrayList);
                    }
                }
            }
        }
    }

    @Override // oy1.l
    public void d(java.lang.String str) {
        oy1.m.f349885a.c("expt_change");
    }

    @Override // oy1.l
    public void e(boolean z17) {
        if (z17) {
            qy1.g gVar = qy1.g.f367725a;
            if (!qy1.g.f367726b.get()) {
                oy1.u.f349928a.e();
            }
        }
        qy1.g gVar2 = qy1.g.f367725a;
        qy1.g.f367726b.set(z17);
    }

    @Override // oy1.l
    public void f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            super.f(context);
            oy1.u.f349928a.d();
            qy1.c.f367717a.a();
        }
    }

    public final void g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(29309);
        java.util.Map map = this.f349925f;
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

    public void h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                a(context);
                b();
                ez1.g.f257840i.P(this);
            }
            qy1.c cVar = qy1.c.f367717a;
            if (qy1.c.f367718b != null) {
                cVar.a();
            }
            qy1.c.f367719c.put(428459010, qy1.b.f367701a);
            cVar.c();
            oy1.m.f349885a.d();
            java.util.List V0 = kz5.n0.V0(((java.util.LinkedHashMap) this.f349925f).keySet());
            if (oy1.m.f349889e == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(V0);
                oy1.m.f349889e = arrayList;
            }
            java.lang.Integer num = oy1.m.f349886b;
            if ((num != null ? num.intValue() : 1) == 1) {
                ((ku5.t0) ku5.t0.f312615d).l(new oy1.q(this), 60000L, "MicroMsg.CgiReporter");
            }
        }
    }
}
