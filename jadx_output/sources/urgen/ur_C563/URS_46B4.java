package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u008f\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J³\u0001\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010 \u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010!\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010\"\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007¨\u0006%"}, d2 = {"Lurgen/ur_C563/URS_46B4;", "", "", "time", "", "eventId", "pageId", "pageName", "", "paramsKeys", "paramsValues", "", "routeType", "routeRule", "", "isBatchReport", "sourcePageId", "sourcePageName", "sourcePageParamsKeys", "sourcePageParamsValues", "Ljz5/f0;", "UR_B01C", "(JLjava/lang/String;JLjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;IIZILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "viewId", "curPageId", "curPageName", "curPageParamsKeys", "curPageParamsValues", "UR_40B2", "(JLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;IIZILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "", "events", "UR_7420", "UR_D361", "UR_2FD7", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class URS_46B4 {
    public static final urgen.ur_C563.URS_46B4 INSTANCE = new urgen.ur_C563.URS_46B4();

    private URS_46B4() {
    }

    public static final void UR_2FD7(byte[] bArr) {
        java.util.LinkedList linkedList;
        int i17;
        bw5.a1 a1Var = bArr != null ? (bw5.a1) w71.l.a(bArr, new bw5.a1()) : null;
        if (a1Var == null || (linkedList = a1Var.f24962d) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bw5.z0 z0Var = (bw5.z0) it.next();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it6 = z0Var.f35756f.iterator();
            while (it6.hasNext()) {
                bw5.c1 c1Var = (bw5.c1) it6.next();
                java.lang.String key = c1Var.getKey();
                kotlin.jvm.internal.o.f(key, "getKey(...)");
                java.lang.String value = c1Var.getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                linkedHashMap.put(key, value);
            }
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            if (z0Var.b() != null) {
                java.util.Iterator it7 = z0Var.b().f25478f.iterator();
                while (it7.hasNext()) {
                    bw5.c1 c1Var2 = (bw5.c1) it7.next();
                    java.lang.String key2 = c1Var2.getKey();
                    kotlin.jvm.internal.o.f(key2, "getKey(...)");
                    java.lang.String value2 = c1Var2.getValue();
                    kotlin.jvm.internal.o.f(value2, "getValue(...)");
                    linkedHashMap2.put(key2, value2);
                }
                linkedHashMap2.put("page_id", java.lang.Integer.valueOf(z0Var.b().f25476d));
                java.lang.String b17 = z0Var.b().b();
                kotlin.jvm.internal.o.f(b17, "getPageName(...)");
                linkedHashMap2.put("page_name", b17);
                linkedHashMap.put("cur_page", linkedHashMap2);
            }
            if (z0Var.d() != null) {
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                java.util.Iterator it8 = z0Var.d().f25478f.iterator();
                while (it8.hasNext()) {
                    bw5.c1 c1Var3 = (bw5.c1) it8.next();
                    java.lang.String key3 = c1Var3.getKey();
                    kotlin.jvm.internal.o.f(key3, "getKey(...)");
                    java.lang.String value3 = c1Var3.getValue();
                    kotlin.jvm.internal.o.f(value3, "getValue(...)");
                    linkedHashMap3.put(key3, value3);
                }
                linkedHashMap3.put("page_id", java.lang.Integer.valueOf(z0Var.d().f25476d));
                java.lang.String b18 = z0Var.d().b();
                kotlin.jvm.internal.o.f(b18, "getPageName(...)");
                linkedHashMap3.put("page_name", b18);
                linkedHashMap2.put("source_page", linkedHashMap3);
            }
            if (z0Var.c() != null) {
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                java.util.Iterator it9 = z0Var.c().f25478f.iterator();
                while (it9.hasNext()) {
                    bw5.c1 c1Var4 = (bw5.c1) it9.next();
                    java.lang.String key4 = c1Var4.getKey();
                    kotlin.jvm.internal.o.f(key4, "getKey(...)");
                    java.lang.String value4 = c1Var4.getValue();
                    kotlin.jvm.internal.o.f(value4, "getValue(...)");
                    linkedHashMap4.put(key4, value4);
                }
                linkedHashMap4.put("page_id", java.lang.Integer.valueOf(z0Var.c().f25476d));
                java.lang.String b19 = z0Var.c().b();
                kotlin.jvm.internal.o.f(b19, "getPageName(...)");
                linkedHashMap4.put("page_name", b19);
                linkedHashMap2.put("ref_page", linkedHashMap4);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it10 = z0Var.f35757g.iterator();
            while (it10.hasNext()) {
                bw5.d1 d1Var = (bw5.d1) it10.next();
                ky1.d dVar = new ky1.d();
                dVar.f313499a = d1Var.f26271d;
                dVar.f313500b = d1Var.f26272e;
                dVar.f313502d = d1Var.f26273f;
                arrayList.add(dVar);
            }
            fy1.e eVar = (fy1.e) i95.n0.c(fy1.e.class);
            long j17 = z0Var.f35754d;
            java.lang.String str = z0Var.f35761n[2] ? z0Var.f35755e : "";
            my1.k kVar = (my1.k) eVar;
            kVar.getClass();
            if (!android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.i("Amoeba.AmbBridgeService", "[reportCustomEvent] eventId : " + str + ", routeRules : " + arrayList.size());
                java.util.Iterator it11 = arrayList.iterator();
                while (it11.hasNext()) {
                    ky1.d dVar2 = (ky1.d) it11.next();
                    if (dVar2.f313499a == 1 && ((i17 = dVar2.f313500b) == 5 || i17 == 9 || i17 == 999)) {
                        ky1.b a17 = ky1.c.a();
                        a17.f313487a = j17;
                        a17.f313489c = str;
                        a17.b(kVar.Bi(((fm4.f) ((qk.k8) i95.n0.c(qk.k8.class))).Di(dVar2.f313500b), kVar.wi(linkedHashMap), dVar2));
                        a17.c(new java.util.ArrayList());
                        ky1.c a18 = a17.a();
                        a18.f313497e.add(dVar2);
                        cy1.a.Ui().Fj(a18);
                    } else {
                        ky1.b a19 = ky1.c.a();
                        a19.f313487a = j17;
                        a19.f313489c = str;
                        a19.b(kVar.wi(linkedHashMap));
                        a19.c(new java.util.ArrayList());
                        ky1.c a27 = a19.a();
                        a27.f313497e.add(dVar2);
                        cy1.a.Ui().Fj(a27);
                    }
                }
            }
        }
    }

    public static final void UR_40B2(long time, java.lang.String eventId, java.lang.String viewId, java.lang.String[] paramsKeys, java.lang.String[] paramsValues, int routeType, int routeRule, boolean isBatchReport, int curPageId, java.lang.String curPageName, java.lang.String[] curPageParamsKeys, java.lang.String[] curPageParamsValues, int sourcePageId, java.lang.String sourcePageName, java.lang.String[] sourcePageParamsKeys, java.lang.String[] sourcePageParamsValues) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(paramsKeys, "paramsKeys");
        kotlin.jvm.internal.o.g(paramsValues, "paramsValues");
        kotlin.jvm.internal.o.g(curPageName, "curPageName");
        kotlin.jvm.internal.o.g(curPageParamsKeys, "curPageParamsKeys");
        kotlin.jvm.internal.o.g(curPageParamsValues, "curPageParamsValues");
        kotlin.jvm.internal.o.g(sourcePageName, "sourcePageName");
        kotlin.jvm.internal.o.g(sourcePageParamsKeys, "sourcePageParamsKeys");
        kotlin.jvm.internal.o.g(sourcePageParamsValues, "sourcePageParamsValues");
        com.tencent.mars.xlog.Log.i("Amoeba.AmbDataReportSDKJavaStatic", "[reportStandardViewEvent] eventId : " + eventId + ", viewId : " + viewId + ", routeType : " + routeType + ", routeRule : " + routeRule);
    }

    public static final void UR_7420(byte[] bArr) {
        java.util.LinkedList linkedList;
        bw5.f1 f1Var = bArr != null ? (bw5.f1) w71.l.a(bArr, new bw5.f1()) : null;
        if (f1Var == null || (linkedList = f1Var.f27107d) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bw5.e1 e1Var = (bw5.e1) it.next();
            final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it6 = e1Var.f26682h.iterator();
            while (it6.hasNext()) {
                bw5.c1 c1Var = (bw5.c1) it6.next();
                java.lang.String key = c1Var.getKey();
                kotlin.jvm.internal.o.f(key, "getKey(...)");
                java.lang.String value = c1Var.getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                linkedHashMap.put(key, value);
            }
            linkedHashMap.put("page_id", java.lang.Integer.valueOf(e1Var.f26680f));
            boolean[] zArr = e1Var.f26686o;
            java.lang.String str = zArr[4] ? e1Var.f26681g : "";
            kotlin.jvm.internal.o.f(str, "getPageName(...)");
            linkedHashMap.put("page_name", str);
            if (e1Var.c() != null) {
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                java.util.Iterator it7 = e1Var.c().f25478f.iterator();
                while (it7.hasNext()) {
                    bw5.c1 c1Var2 = (bw5.c1) it7.next();
                    java.lang.String key2 = c1Var2.getKey();
                    kotlin.jvm.internal.o.f(key2, "getKey(...)");
                    java.lang.String value2 = c1Var2.getValue();
                    kotlin.jvm.internal.o.f(value2, "getValue(...)");
                    linkedHashMap2.put(key2, value2);
                }
                linkedHashMap2.put("page_id", java.lang.Integer.valueOf(e1Var.c().f25476d));
                java.lang.String b17 = e1Var.c().b();
                kotlin.jvm.internal.o.f(b17, "getPageName(...)");
                linkedHashMap2.put("page_name", b17);
                linkedHashMap.put("source_page", linkedHashMap2);
            }
            if (e1Var.b() != null) {
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                java.util.Iterator it8 = e1Var.b().f25478f.iterator();
                while (it8.hasNext()) {
                    bw5.c1 c1Var3 = (bw5.c1) it8.next();
                    java.lang.String key3 = c1Var3.getKey();
                    kotlin.jvm.internal.o.f(key3, "getKey(...)");
                    java.lang.String value3 = c1Var3.getValue();
                    kotlin.jvm.internal.o.f(value3, "getValue(...)");
                    linkedHashMap3.put(key3, value3);
                }
                linkedHashMap3.put("page_id", java.lang.Integer.valueOf(e1Var.b().f25476d));
                java.lang.String b18 = e1Var.b().b();
                kotlin.jvm.internal.o.f(b18, "getPageName(...)");
                linkedHashMap3.put("page_name", b18);
                linkedHashMap.put("ref_page", linkedHashMap3);
            }
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it9 = e1Var.f26683i.iterator();
            while (it9.hasNext()) {
                bw5.d1 d1Var = (bw5.d1) it9.next();
                ky1.d dVar = new ky1.d();
                dVar.f313499a = d1Var.f26271d;
                dVar.f313500b = d1Var.f26272e;
                dVar.f313502d = d1Var.f26273f;
                arrayList.add(dVar);
            }
            fy1.e eVar = (fy1.e) i95.n0.c(fy1.e.class);
            final long j17 = e1Var.f26678d;
            final java.lang.String str2 = zArr[2] ? e1Var.f26679e : "";
            final int i17 = e1Var.f26680f;
            final java.lang.String str3 = zArr[4] ? e1Var.f26681g : "";
            final my1.k kVar = (my1.k) eVar;
            kVar.getClass();
            if (!android.text.TextUtils.isEmpty(str2) && (!android.text.TextUtils.isEmpty(str3) || i17 > 0)) {
                com.tencent.mars.xlog.Log.i("Amoeba.AmbBridgeService", "[reportStandardPageEvent] pageName : " + str3 + ", pageId : " + i17 + ", eventId : " + str2 + ", routeRules : " + arrayList.size());
                sz1.i.b(new java.lang.Runnable() { // from class: my1.k$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i18;
                        my1.k kVar2 = my1.k.this;
                        kVar2.getClass();
                        sy1.f fVar = cy1.a.Ui().f224690m;
                        java.lang.String str4 = str2;
                        long j18 = j17;
                        if (fVar != null) {
                            boolean c17 = u46.l.c(str4, "session_in");
                            java.util.Map map = kVar2.f332695d;
                            java.lang.String str5 = str3;
                            if (c17) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                int i19 = i17;
                                sb6.append(i19 > 0 ? java.lang.String.valueOf(i19) : str5);
                                sb6.append("_");
                                sb6.append(j18);
                                java.lang.String sb7 = sb6.toString();
                                fVar.h(sb7);
                                ((java.util.HashMap) map).put(str5, sb7);
                            } else if (u46.l.c(str4, "session_out")) {
                                java.lang.String str6 = (java.lang.String) ((java.util.HashMap) map).remove(str5);
                                if (!u46.l.e(str6)) {
                                    fVar.i(str6);
                                }
                            }
                        }
                        java.util.HashMap hashMap = new java.util.HashMap(kVar2.wi(linkedHashMap));
                        if (u46.l.c(str4, "biz_out") || u46.l.c(str4, "session_out") || u46.l.c(str4, "page_out")) {
                            oz1.e.a().d(str4, j18, hashMap);
                        }
                        for (ky1.d dVar2 : arrayList) {
                            if (dVar2.f313499a == 1 && ((i18 = dVar2.f313500b) == 5 || i18 == 9 || i18 == 999)) {
                                ky1.b a17 = ky1.c.a();
                                a17.f313487a = j18;
                                a17.f313489c = str4;
                                a17.b(kVar2.Bi(((fm4.f) ((qk.k8) i95.n0.c(qk.k8.class))).Di(dVar2.f313500b), hashMap, dVar2));
                                a17.c(new java.util.ArrayList());
                                ky1.c a18 = a17.a();
                                a18.f313497e.add(dVar2);
                                cy1.a.Ui().Jj(a18);
                            } else {
                                ky1.b a19 = ky1.c.a();
                                a19.f313487a = j18;
                                a19.f313489c = str4;
                                a19.b(hashMap);
                                a19.c(new java.util.ArrayList());
                                ky1.c a27 = a19.a();
                                a27.f313497e.add(dVar2);
                                cy1.a.Ui().Jj(a27);
                            }
                        }
                    }
                });
            }
        }
    }

    public static final void UR_B01C(long time, java.lang.String eventId, long pageId, java.lang.String pageName, java.lang.String[] paramsKeys, java.lang.String[] paramsValues, int routeType, int routeRule, boolean isBatchReport, int sourcePageId, java.lang.String sourcePageName, java.lang.String[] sourcePageParamsKeys, java.lang.String[] sourcePageParamsValues) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(pageName, "pageName");
        kotlin.jvm.internal.o.g(paramsKeys, "paramsKeys");
        kotlin.jvm.internal.o.g(paramsValues, "paramsValues");
        kotlin.jvm.internal.o.g(sourcePageName, "sourcePageName");
        kotlin.jvm.internal.o.g(sourcePageParamsKeys, "sourcePageParamsKeys");
        kotlin.jvm.internal.o.g(sourcePageParamsValues, "sourcePageParamsValues");
        com.tencent.mars.xlog.Log.i("Amoeba.AmbDataReportSDKJavaStatic", "[reportStandardPageEvent] eventId : " + eventId + ", pageId : " + pageId + ", pageName : " + pageName + ", routeType : " + routeType + ", routeRule : " + routeRule);
    }

    public static final void UR_D361(byte[] bArr) {
        java.util.LinkedList linkedList;
        bw5.h1 h1Var = bArr != null ? (bw5.h1) w71.l.a(bArr, new bw5.h1()) : null;
        if (h1Var == null || (linkedList = h1Var.f28043d) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bw5.g1 g1Var = (bw5.g1) it.next();
            final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it6 = g1Var.f27606g.iterator();
            while (it6.hasNext()) {
                bw5.c1 c1Var = (bw5.c1) it6.next();
                java.lang.String key = c1Var.getKey();
                kotlin.jvm.internal.o.f(key, "getKey(...)");
                java.lang.String value = c1Var.getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                linkedHashMap.put(key, value);
            }
            boolean[] zArr = g1Var.f27611o;
            java.lang.String str = zArr[3] ? g1Var.f27605f : "";
            kotlin.jvm.internal.o.f(str, "getViewId(...)");
            linkedHashMap.put("view_id", str);
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            if (g1Var.b() != null) {
                java.util.Iterator it7 = g1Var.b().f25478f.iterator();
                while (it7.hasNext()) {
                    bw5.c1 c1Var2 = (bw5.c1) it7.next();
                    java.lang.String key2 = c1Var2.getKey();
                    kotlin.jvm.internal.o.f(key2, "getKey(...)");
                    java.lang.String value2 = c1Var2.getValue();
                    kotlin.jvm.internal.o.f(value2, "getValue(...)");
                    linkedHashMap2.put(key2, value2);
                }
                linkedHashMap2.put("page_id", java.lang.Integer.valueOf(g1Var.b().f25476d));
                java.lang.String b17 = g1Var.b().b();
                kotlin.jvm.internal.o.f(b17, "getPageName(...)");
                linkedHashMap2.put("page_name", b17);
                linkedHashMap.put("cur_page", linkedHashMap2);
            }
            if (g1Var.d() != null) {
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                java.util.Iterator it8 = g1Var.d().f25478f.iterator();
                while (it8.hasNext()) {
                    bw5.c1 c1Var3 = (bw5.c1) it8.next();
                    java.lang.String key3 = c1Var3.getKey();
                    kotlin.jvm.internal.o.f(key3, "getKey(...)");
                    java.lang.String value3 = c1Var3.getValue();
                    kotlin.jvm.internal.o.f(value3, "getValue(...)");
                    linkedHashMap3.put(key3, value3);
                }
                linkedHashMap3.put("page_id", java.lang.Integer.valueOf(g1Var.d().f25476d));
                java.lang.String b18 = g1Var.d().b();
                kotlin.jvm.internal.o.f(b18, "getPageName(...)");
                linkedHashMap3.put("page_name", b18);
                linkedHashMap2.put("source_page", linkedHashMap3);
            }
            if (g1Var.c() != null) {
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                java.util.Iterator it9 = g1Var.c().f25478f.iterator();
                while (it9.hasNext()) {
                    bw5.c1 c1Var4 = (bw5.c1) it9.next();
                    java.lang.String key4 = c1Var4.getKey();
                    kotlin.jvm.internal.o.f(key4, "getKey(...)");
                    java.lang.String value4 = c1Var4.getValue();
                    kotlin.jvm.internal.o.f(value4, "getValue(...)");
                    linkedHashMap4.put(key4, value4);
                }
                linkedHashMap4.put("page_id", java.lang.Integer.valueOf(g1Var.c().f25476d));
                java.lang.String b19 = g1Var.c().b();
                kotlin.jvm.internal.o.f(b19, "getPageName(...)");
                linkedHashMap4.put("page_name", b19);
                linkedHashMap2.put("ref_page", linkedHashMap4);
            }
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it10 = g1Var.f27607h.iterator();
            while (it10.hasNext()) {
                bw5.d1 d1Var = (bw5.d1) it10.next();
                ky1.d dVar = new ky1.d();
                dVar.f313499a = d1Var.f26271d;
                dVar.f313500b = d1Var.f26272e;
                dVar.f313502d = d1Var.f26273f;
                arrayList.add(dVar);
            }
            fy1.e eVar = (fy1.e) i95.n0.c(fy1.e.class);
            final long j17 = g1Var.f27603d;
            java.lang.String str2 = zArr[2] ? g1Var.f27604e : "";
            java.lang.String str3 = zArr[3] ? g1Var.f27605f : "";
            final my1.k kVar = (my1.k) eVar;
            kVar.getClass();
            if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
                com.tencent.mars.xlog.Log.i("Amoeba.AmbBridgeService", "[reportStandardViewEvent] viewId : " + str3 + ", eventId : " + str2 + ", routeRules : " + arrayList.size());
                final java.lang.String str4 = str2;
                final java.lang.String str5 = str3;
                sz1.i.b(new java.lang.Runnable() { // from class: my1.k$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        sy1.f fVar;
                        my1.k kVar2 = my1.k.this;
                        kVar2.getClass();
                        java.lang.String str6 = str4;
                        boolean c17 = u46.l.c(str6, "view_clk");
                        long j18 = j17;
                        if (c17 && (fVar = cy1.a.Ui().f224690m) != null) {
                            fVar.f413853h = str5;
                            fVar.f413854i = j18;
                        }
                        for (ky1.d dVar2 : arrayList) {
                            int i18 = dVar2.f313499a;
                            java.util.Map map = linkedHashMap;
                            if (i18 == 1 && ((i17 = dVar2.f313500b) == 5 || i17 == 9 || i17 == 999)) {
                                ky1.b a17 = ky1.c.a();
                                a17.f313487a = j18;
                                a17.f313489c = str6;
                                a17.b(kVar2.Bi(((fm4.f) ((qk.k8) i95.n0.c(qk.k8.class))).Di(dVar2.f313500b), kVar2.wi(map), dVar2));
                                a17.c(new java.util.ArrayList());
                                ky1.c a18 = a17.a();
                                a18.f313497e.add(dVar2);
                                cy1.a.Ui().Jj(a18);
                            } else {
                                ky1.b a19 = ky1.c.a();
                                a19.f313487a = j18;
                                a19.f313489c = str6;
                                a19.b(kVar2.wi(map));
                                a19.c(new java.util.ArrayList());
                                ky1.c a27 = a19.a();
                                a27.f313497e.add(dVar2);
                                cy1.a.Ui().Jj(a27);
                            }
                        }
                    }
                });
            }
        }
    }
}
