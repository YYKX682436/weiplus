package db2;

/* loaded from: classes2.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    public static final db2.t4 f228171a = new db2.t4();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f228172b = kz5.c0.i(3688, 3901, 8432, 9935, 3763, 11842, 8083);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f228173c = jz5.h.b(db2.s4.f228153d);

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f228174d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f228175e = "";

    /* renamed from: f, reason: collision with root package name */
    public static long f228176f;

    /* renamed from: g, reason: collision with root package name */
    public static long f228177g;

    public static void i(db2.t4 t4Var, r45.kv0 kv0Var, java.util.List list, r45.qt2 qt2Var, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            qt2Var = null;
        }
        t4Var.getClass();
        kotlin.jvm.internal.o.g(list, "list");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            f228171a.d(kv0Var, new jz5.o(lVar.f302833d, lVar.f302834e, null), qt2Var, "");
        }
    }

    public static java.lang.String m(db2.t4 t4Var, java.lang.String udfKv, java.lang.String kvJsonStr, boolean z17, int i17, java.lang.Object obj) {
        java.lang.String str;
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        t4Var.getClass();
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        kotlin.jvm.internal.o.g(kvJsonStr, "kvJsonStr");
        if (com.tencent.mm.sdk.platformtools.t8.K0(kvJsonStr)) {
            if (!r26.i0.y(udfKv, "{", false)) {
                return udfKv;
            }
            byte[] bytes = udfKv.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
            kotlin.jvm.internal.o.d(encodeToString);
            return encodeToString;
        }
        if (r26.i0.y(udfKv, "{", false)) {
            str = t4Var.l(new org.json.JSONObject(udfKv), kvJsonStr, z17);
        } else {
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(udfKv)) {
                    byte[] decode = android.util.Base64.decode(udfKv, 2);
                    kotlin.jvm.internal.o.f(decode, "decode(...)");
                    str = t4Var.l(new org.json.JSONObject(new java.lang.String(decode, r26.c.f368865a)), kvJsonStr, z17);
                } else if (z17) {
                    byte[] bytes2 = kvJsonStr.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                    str = android.util.Base64.encodeToString(bytes2, 2);
                } else {
                    str = new org.json.JSONObject(kvJsonStr).toString();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.BaseRequestFactory", e17, "fillClientReportInfo", new java.lang.Object[0]);
                str = "";
            }
            kotlin.jvm.internal.o.d(str);
        }
        return str;
    }

    public final r45.kv0 a(int i17) {
        r45.kv0 kv0Var = new r45.kv0();
        hc2.p.a(kv0Var);
        e(kv0Var);
        kv0Var.set(0, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0)));
        kv0Var.set(6, java.lang.Integer.valueOf(s()));
        kv0Var.set(5, java.lang.Long.valueOf(c01.id.c()));
        kv0Var.set(9, new r45.it0());
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127950ta).getValue()).r()).booleanValue()) {
            c(kv0Var, i17);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127640cb).getValue()).r()).intValue() == 1) {
            kv0Var.set(11, java.lang.Long.valueOf(kv0Var.getLong(11) | 2));
        }
        kv0Var.set(10, r(i17));
        java.util.LinkedList linkedList = ((com.tencent.mm.plugin.finder.report.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).f125213i;
        if (linkedList != null && (!linkedList.isEmpty())) {
            r45.bo2 bo2Var = new r45.bo2();
            bo2Var.set(1, linkedList);
            kv0Var.set(12, bo2Var);
        }
        return kv0Var;
    }

    public final r45.kv0 b(int i17, r45.qt2 qt2Var) {
        r45.kv0 kv0Var = new r45.kv0();
        hc2.p.a(kv0Var);
        e(kv0Var);
        kv0Var.set(0, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0)));
        kv0Var.set(6, java.lang.Integer.valueOf(s()));
        kv0Var.set(4, new r45.g40());
        kv0Var.set(10, r(i17));
        if (qt2Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(qt2Var.getInteger(5)));
            r45.g40 g40Var = (r45.g40) kv0Var.getCustom(4);
            if (g40Var != null) {
                g40Var.set(0, qt2Var.getString(1));
            }
            r45.g40 g40Var2 = (r45.g40) kv0Var.getCustom(4);
            if (g40Var2 != null) {
                g40Var2.set(1, qt2Var.getString(2));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, qt2Var.getString(0));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(qt2Var.getString(11))) {
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, qt2Var.getString(11));
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(qt2Var.getString(12))) {
                    jSONObject.put("enterSourceInfo", qt2Var.getString(12));
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(qt2Var.getString(16))) {
                    jSONObject.put("jumpId", qt2Var.getString(16));
                }
            } catch (java.lang.Exception unused) {
            }
            r45.g40 g40Var3 = (r45.g40) kv0Var.getCustom(4);
            if (g40Var3 != null) {
                g40Var3.set(2, jSONObject.toString());
            }
        }
        kv0Var.set(5, java.lang.Long.valueOf(c01.id.c()));
        kv0Var.set(9, new r45.it0());
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127950ta).getValue()).r()).booleanValue()) {
            c(kv0Var, i17);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127640cb).getValue()).r()).intValue() == 1) {
            kv0Var.set(11, java.lang.Long.valueOf(kv0Var.getLong(11) | 2));
        }
        java.util.LinkedList linkedList = ((com.tencent.mm.plugin.finder.report.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).f125213i;
        if (linkedList != null && (!linkedList.isEmpty())) {
            r45.bo2 bo2Var = new r45.bo2();
            bo2Var.set(1, linkedList);
            kv0Var.set(12, bo2Var);
        }
        return kv0Var;
    }

    public final void c(r45.kv0 kv0Var, int i17) {
        boolean contains = f228172b.contains(java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("Finder.BaseRequestFactory", "[needAdDeviceInfo] cmdId:" + i17 + " res:" + contains);
        if (!contains) {
            com.tencent.mars.xlog.Log.i("Finder.BaseRequestFactory", "[fillAdBaseRequest] cmdId:" + i17 + ", no need return");
            return;
        }
        if (((r45.it0) kv0Var.getCustom(9)) == null) {
            kv0Var.set(9, new r45.it0());
        }
        try {
            r45.it0 it0Var = (r45.it0) kv0Var.getCustom(9);
            if (it0Var != null) {
                db2.t4 t4Var = f228171a;
                int i18 = 0;
                it0Var.set(0, t4Var.p());
                it0Var.set(1, t4Var.t());
                it0Var.set(2, java.lang.Integer.valueOf(t4Var.o()));
                int iSPCode = com.tencent.mars.comm.NetStatusUtil.getISPCode(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (iSPCode != 0) {
                    int i19 = iSPCode / 100;
                    int i27 = iSPCode % 100;
                    if (i19 == 460) {
                        if (i27 != 0) {
                            if (i27 != 1) {
                                if (i27 != 2) {
                                    if (i27 != 3 && i27 != 5) {
                                        if (i27 != 6) {
                                            if (i27 != 7) {
                                                if (i27 != 9) {
                                                    if (i27 != 11) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i18 = 3;
                                }
                            }
                            i18 = 2;
                        }
                        i18 = 1;
                    }
                }
                it0Var.set(3, java.lang.Integer.valueOf(i18));
                com.tencent.mars.xlog.Log.i("Finder.BaseRequestFactory", "it is going to get vangogh version");
                ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.SnsAdService");
                java.lang.String e17 = m54.j.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.SnsAdService");
                kotlin.jvm.internal.o.f(e17, "getVangoghVersion(...)");
                it0Var.set(5, e17);
                it0Var.set(4, 1);
                if (com.tencent.mm.sdk.platformtools.a0.c()) {
                    it0Var.set(4, java.lang.Integer.valueOf(it0Var.getInteger(4) | 2));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Finder.BaseRequestFactory", "fillAdBaseRequest failed, " + th6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.kv0 r18, jz5.o r19, r45.qt2 r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.t4.d(r45.kv0, jz5.o, r45.qt2, java.lang.String):void");
    }

    public final void e(r45.kv0 kv0Var) {
        if (kv0Var != null) {
            kv0Var.set(8, java.lang.Integer.valueOf(kv0Var.getInteger(8) | 1));
            if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f39226d) {
                kv0Var.set(8, java.lang.Integer.valueOf(kv0Var.getInteger(8) | 2));
            }
        }
    }

    public final java.lang.String f(java.lang.String udfKv, java.lang.String commonReportInfo, boolean z17) {
        java.lang.String jSONObject;
        java.lang.String str;
        java.lang.String jSONObject2;
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        kotlin.jvm.internal.o.g(commonReportInfo, "commonReportInfo");
        if (com.tencent.mm.sdk.platformtools.t8.K0(commonReportInfo)) {
            if (!r26.i0.y(udfKv, "{", false)) {
                return udfKv;
            }
            byte[] bytes = udfKv.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
            kotlin.jvm.internal.o.d(encodeToString);
            return encodeToString;
        }
        if (r26.i0.y(udfKv, "{", false)) {
            return g(new org.json.JSONObject(udfKv), commonReportInfo, z17);
        }
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.BaseRequestFactory", e17, "fillClientReportInfo", new java.lang.Object[0]);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(udfKv)) {
            byte[] decode = android.util.Base64.decode(udfKv, 2);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            return g(new org.json.JSONObject(new java.lang.String(decode, r26.c.f368865a)), commonReportInfo, z17);
        }
        if (z17) {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(commonReportInfo).optJSONObject("clientReportInfo");
            if (optJSONObject == null || (jSONObject2 = optJSONObject.toString()) == null) {
                str = null;
            } else {
                byte[] bytes2 = jSONObject2.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                str = android.util.Base64.encodeToString(bytes2, 2);
            }
            if (str != null) {
                return str;
            }
        } else {
            org.json.JSONObject optJSONObject2 = new org.json.JSONObject(commonReportInfo).optJSONObject("clientReportInfo");
            if (optJSONObject2 != null && (jSONObject = optJSONObject2.toString()) != null) {
                return jSONObject;
            }
        }
        return "";
    }

    public final java.lang.String g(org.json.JSONObject jSONObject, java.lang.String str, boolean z17) {
        java.lang.String jSONObject2;
        java.util.Iterator<java.lang.String> keys;
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("clientReportInfo");
            if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject.put(next, optJSONObject.get(next));
                }
            }
            if (z17) {
                java.lang.String jSONObject3 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                byte[] bytes = jSONObject3.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                jSONObject2 = android.util.Base64.encodeToString(bytes, 2);
            } else {
                jSONObject2 = jSONObject.toString();
            }
            kotlin.jvm.internal.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.BaseRequestFactory", e17, "fillClientReportJson", new java.lang.Object[0]);
            return "";
        }
    }

    public final void h(r45.kv0 kv0Var, r45.qt2 qt2Var, java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f228171a.d(kv0Var, (jz5.o) it.next(), qt2Var, "");
        }
    }

    public final void j(r45.kv0 kv0Var, long j17, java.lang.String sessionBuffer) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(sessionBuffer, "sessionBuffer");
        if (kv0Var == null || (list = kv0Var.getList(7)) == null) {
            return;
        }
        r45.fl2 fl2Var = new r45.fl2();
        fl2Var.set(1, sessionBuffer);
        fl2Var.set(0, java.lang.Long.valueOf(j17));
        list.add(fl2Var);
    }

    public final void k(r45.kv0 kv0Var, r45.a34 a34Var) {
        if (a34Var == null || kv0Var == null) {
            return;
        }
        kv0Var.set(13, a34Var);
    }

    public final java.lang.String l(org.json.JSONObject jSONObject, java.lang.String str, boolean z17) {
        java.lang.String jSONObject2;
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject.put(next, jSONObject3.get(next));
            }
            if (z17) {
                java.lang.String jSONObject4 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                byte[] bytes = jSONObject4.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                jSONObject2 = android.util.Base64.encodeToString(bytes, 2);
            } else {
                jSONObject2 = jSONObject.toString();
            }
            kotlin.jvm.internal.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.BaseRequestFactory", e17, "fillClientReportJson", new java.lang.Object[0]);
            return "";
        }
    }

    public final r45.dx0 n() {
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        return cw2.p4.f223911a.d();
    }

    public final int o() {
        int i17;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393261h) {
            i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
        } else if (r75.d.f393258e == -100) {
            i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
            r75.d.f393258e = i17;
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.tencent.mars.xlog.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f393258e);
            i17 = r75.d.f393258e;
        }
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 2;
        }
        if (i17 == 3) {
            return 3;
        }
        if (i17 != 4) {
            return i17 != 5 ? 0 : 7;
        }
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r2 > ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ha).getValue()).r()).intValue()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p() {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = db2.t4.f228176f
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L37
            java.lang.String r2 = db2.t4.f228174d
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto L37
            long r2 = db2.t4.f228176f
            long r2 = r0 - r2
            long r2 = java.lang.Math.abs(r2)
            com.tencent.mm.plugin.finder.storage.t70 r4 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r4 = com.tencent.mm.plugin.finder.storage.t70.Ha
            jz5.n r4 = (jz5.n) r4
            java.lang.Object r4 = r4.getValue()
            lb2.j r4 = (lb2.j) r4
            java.lang.Object r4 = r4.r()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L49
        L37:
            db2.t4.f228176f = r0
            java.lang.Class<fe0.m3> r0 = fe0.m3.class
            i95.m r0 = i95.n0.c(r0)
            fe0.m3 r0 = (fe0.m3) r0
            ee0.g r0 = (ee0.g) r0
            java.lang.String r0 = r0.wi()
            db2.t4.f228174d = r0
        L49:
            java.lang.String r0 = db2.t4.f228174d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.t4.p():java.lang.String");
    }

    public final boolean q() {
        return ((java.lang.Boolean) ((jz5.n) f228173c).getValue()).booleanValue();
    }

    public final com.tencent.mm.protobuf.g r(int i17) {
        java.util.LinkedList list = g92.b.f269769e.k2().d().getList(25);
        kotlin.jvm.internal.o.f(list, "getExpt_buffers(...)");
        int i18 = 0;
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) obj;
            if (gVar != null && gVar.f192156a.length > 0) {
                try {
                    r45.l21 l21Var = new r45.l21();
                    l21Var.fromProtobuf(gVar.g());
                    if (l21Var.getInteger(1) == i17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("[getExptBuffer] index:");
                        sb6.append(i18);
                        sb6.append(" cmdId=");
                        sb6.append(i17);
                        sb6.append(" found ");
                        java.util.LinkedList<r45.k21> list2 = l21Var.getList(0);
                        kotlin.jvm.internal.o.f(list2, "getContainer(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
                        for (r45.k21 k21Var : list2) {
                            arrayList.add(k21Var.getString(1) + " => " + k21Var.getString(0));
                        }
                        sb6.append(arrayList);
                        com.tencent.mars.xlog.Log.i("Finder.BaseRequestFactory", sb6.toString());
                        return gVar;
                    }
                    continue;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.i("Finder.BaseRequestFactory", "[getExptBuffer] index:" + i18 + "  cmdId=" + i17 + " buf:" + android.util.Base64.encodeToString(gVar.g(), 0) + " err:" + th6.getMessage());
                }
            }
            i18 = i19;
        }
        return null;
    }

    public final int s() {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_VISITOR_ASSISTANT_INT_SYNC, 0);
        int r18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_VISITOR_HARDCODE_ROLE_INT_SYNC, 0);
        if (r18 != 0) {
            com.tencent.mars.xlog.Log.i("Finder.BaseRequestFactory", "cgi, get svrHardCodeRole, " + r18);
            return r18;
        }
        if (r17 == 1) {
            com.tencent.mars.xlog.Log.i("Finder.BaseRequestFactory", "cgi, get isAssistant, 1");
            return r17;
        }
        com.tencent.mars.xlog.Log.i("Finder.BaseRequestFactory", "cgi, get isAssistant, " + r17);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        return g92.b.f269769e.k2().getInteger(4);
    }

    public final java.lang.String t() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (f228177g == 0 || com.tencent.mm.sdk.platformtools.t8.K0(f228175e) || java.lang.Math.abs(currentTimeMillis - f228177g) > ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ia).getValue()).r()).intValue()) {
            f228177g = currentTimeMillis;
            ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSysUserAgent", "com.tencent.mm.feature.sns.AdDeviceInfoService");
            java.lang.String e17 = v34.b.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSysUserAgent", "com.tencent.mm.feature.sns.AdDeviceInfoService");
            kotlin.jvm.internal.o.f(e17, "getSysUserAgent(...)");
            f228175e = e17;
        }
        return f228175e;
    }
}
