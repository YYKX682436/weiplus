package yq1;

/* loaded from: classes8.dex */
public final class z implements zq1.a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.a3 f464496g = new com.tencent.mm.sdk.platformtools.a3();

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.a3 f464497h = new com.tencent.mm.sdk.platformtools.a3();

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.v3 f464498i = new com.tencent.mm.sdk.platformtools.v3(com.tencent.mm.plugin.brandservice.ui.timeline.preload.c3.a(), 60);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f464499d = jz5.h.b(new yq1.u(this));

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f464500e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final long f464501f = 15000;

    public z() {
        jz5.h.b(yq1.t.f464471d);
    }

    public void A(java.lang.String str, r45.nw1 nw1Var) {
        if (nw1Var == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveInfo == null? ");
            sb6.append(nw1Var == null);
            sb6.append(", exportId empty? ");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.K0(str));
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceImpl", sb6.toString());
            return;
        }
        k().H(("Biz_" + gm0.j1.b().j() + "_LivesInfo") + '_' + str, nw1Var.toByteArray());
    }

    public void B(android.content.Context context, yz5.l lVar) {
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        yq1.y yVar = new yq1.y(this, lVar);
        ((vd0.j2) q1Var).getClass();
        v24.o0.b(context, 256L, true, yVar);
    }

    public boolean E(android.content.Context context, java.lang.String url, int i17, boolean z17, int i18, int i19, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(intent, "intent");
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.r(context, url, i17, z17, i18, i19, intent, 0, null, false, ce1.h.CTRL_INDEX, null);
    }

    public boolean F(android.content.Context context, java.lang.String url, int i17, boolean z17, int i18, int i19, android.content.Intent intent, int i27, zq1.z result) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(result, "result");
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.r(context, url, i17, z17, i18, i19, intent, i27, result, false, 512, null);
    }

    public java.lang.String a(java.lang.String str, int i17, int i18, int i19) {
        return ot0.g0.a(str, i17, i18, i19);
    }

    public void b(java.lang.String str, int i17, int i18, int i19, java.lang.Object... vals) {
        kotlin.jvm.internal.o.g(vals, "vals");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        zq1.i0 i0Var = new zq1.i0();
        i0Var.f474983a = str;
        i0Var.f474985c = i19;
        arrayList.add(i0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceImpl", "addToGeneralPreload preloadType:" + i17);
        if (i17 == 1) {
            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).i(arrayList);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        yq1.o oVar = new yq1.o(currentTimeMillis, this);
        ((yq1.x0) m0Var).getClass();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3 b3Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94192a;
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.w2(currentTimeMillis, oVar), "MicroMsg.WebPrefetcherCallbackManager");
        ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).g(currentTimeMillis, arrayList);
    }

    public void c(java.lang.String url, int i17, int i18, java.lang.String str, java.lang.Object... vals) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(vals, "vals");
        java.lang.String h17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.h(url);
        com.tencent.mm.sdk.platformtools.a3 a3Var = f464496g;
        if (a3Var.n(h17)) {
            return;
        }
        a3Var.m(h17);
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceImpl", "preloadData: addToPreload:" + h17 + ", " + url + ", openScene=" + i18 + ", userName=" + str2);
        ((ku5.t0) ku5.t0.f312615d).h(new yq1.p(url, i17, i18, str2, vals, this), "tmplPreload");
    }

    public void d(java.lang.String url, int i17, int i18, java.lang.Object... vals) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(vals, "vals");
        c(url, i17, i18, null, vals);
    }

    public void e(java.lang.String str, java.lang.String str2, java.lang.String event, java.lang.String str3) {
        kotlin.jvm.internal.o.g(event, "event");
        yq1.q qVar = new yq1.q(str, str2, event, str3);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.biz.q.f93870d;
        if (currentTimeMillis >= this.f464501f) {
            qVar.invoke();
            return;
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        ((ku5.t0) ku5.t0.f312615d).k(new yq1.x(qVar), java.lang.Math.max(this.f464501f - currentTimeMillis, 5000L));
    }

    public void f(r45.ee eeVar) {
        com.tencent.mm.plugin.webview.ui.tools.media.q0.f185815a.b(eeVar);
    }

    public r45.nw1 g(java.lang.String str) {
        byte[] j17 = k().j(("Biz_" + gm0.j1.b().j() + "_LivesInfo") + '_' + str);
        if (j17 == null || j17.length == 0) {
            return null;
        }
        try {
            r45.nw1 nw1Var = new r45.nw1();
            nw1Var.parseFrom(j17);
            return nw1Var;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceImpl", "parse finderLive fail, parseFrom:%s", e17.getMessage());
            return null;
        }
    }

    public long h(java.lang.String chatName) {
        kotlin.jvm.internal.o.g(chatName, "chatName");
        java.lang.Long l17 = (java.lang.Long) this.f464500e.get(chatName);
        if (l17 == null) {
            return -1L;
        }
        return l17.longValue();
    }

    public java.lang.String i(java.lang.String str) {
        return com.tencent.mm.pluginsdk.model.b0.f189197a.e(str);
    }

    public int j(java.lang.String str) {
        com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
        if (str == null) {
            return 0;
        }
        return com.tencent.mm.pluginsdk.model.b0.f189199c.o("live_scene-".concat(str), 0);
    }

    public final com.tencent.mm.sdk.platformtools.o4 k() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f464499d).getValue();
    }

    public int l() {
        java.lang.Integer num;
        if (((zq1.x) i95.n0.c(zq1.x.class)) == null || (num = (java.lang.Integer) gg5.b.f271789b.get("officialaccounts")) == null) {
            return -1;
        }
        return num.intValue();
    }

    public java.lang.String m(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.n(url);
    }

    public boolean n() {
        return r26.i0.p("CN", gm0.j1.u().c().u(274436, "CN"), true);
    }

    public boolean o(java.lang.String str) {
        if (str != null) {
            return hy4.i.l(str);
        }
        return false;
    }

    public boolean p(java.lang.String str) {
        if (str != null) {
            return hy4.i.p(str);
        }
        return false;
    }

    public boolean q() {
        if (gm0.j1.a()) {
            return n() || (c01.z1.i() & 256) != 0;
        }
        return false;
    }

    public void r(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, r45.nw1 nw1Var) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.pluginsdk.model.b0.f189197a.p(context, str, str2, null, i17, i18, null, str3, nw1Var, null, null, null, null, null);
    }

    public void s(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, r45.nw1 nw1Var) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.pluginsdk.model.b0.r(com.tencent.mm.pluginsdk.model.b0.f189197a, context, str, str2, null, i17, i18, null, nw1Var, null, null, null, null, null, 7936, null);
    }

    public void t(android.content.Context context, org.json.JSONObject jSONObject, java.util.HashMap ret) {
        java.lang.String message;
        kotlin.jvm.internal.o.g(ret, "ret");
        if (jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("item_show_type");
        android.os.Bundle bundle = new android.os.Bundle();
        if (optInt == 5) {
            cy4.b bVar = cy4.b.f224859a;
            if (bVar.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "saveVideo openwebviewusefastload");
                java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID);
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "saveVideo openwebviewusefastload vid null");
                } else {
                    int L = (int) com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("videoInitialTime"), 0.0f);
                    java.lang.String optString2 = jSONObject.optString("videoInitialSnapshot");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "saveVideo openwebviewusefastload bitmap null");
                    } else {
                        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) cy4.b.f224861c.i();
                        o4Var.A("MicroMsg.MPVideoPreviewDataMgr_" + optString + "_playTime", L);
                        o4Var.B("MicroMsg.MPVideoPreviewDataMgr_" + optString + "_expire", (java.lang.System.currentTimeMillis() / 1000) + 600);
                        o4Var.D("MicroMsg.MPVideoPreviewDataMgr_" + optString + "_bitmap", optString2);
                        bVar.d(optString);
                    }
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1061L, 21L, 1L, false);
        }
        bundle.putString("url", jSONObject.optString("url"));
        bundle.putInt("item_show_type", jSONObject.optInt("item_show_type"));
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
        bundle.putInt("subscene", jSONObject.optInt("subscene"));
        bundle.putInt("openType", jSONObject.optInt("openType"));
        bundle.putString("biz_video_channel_session_id", jSONObject.optString("channelSessionId"));
        zq1.z zVar = new zq1.z();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("immersiveUIStyle", jSONObject.optBoolean("immersiveUIStyle", false) ? 1 : 0);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        intent.putExtra("kBizSessionId", com.tencent.mm.storage.c2.f193803a);
        int i17 = bundle.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        int i18 = bundle.getInt("subscene", 10000);
        java.lang.String string = bundle.getString("url");
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(string)) {
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            string = ot0.g0.a(string, i17, i18, currentTimeMillis);
        }
        ret.put(ya.b.SUCCESS, java.lang.Boolean.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).F(context, string, bundle.getInt("item_show_type"), bundle.getBoolean("isNativePage"), i17, i18, intent, bundle.getInt("openType"), zVar)));
        if (zVar.f475024a || (message = zVar.f475025b) == null) {
            return;
        }
        kotlin.jvm.internal.o.f(message, "message");
        ret.put("desc", message);
    }

    public void u(int i17) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94436b;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        if (i17 != 10000) {
            android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.p1(i17));
            return;
        }
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a.p(i17);
        atomicBoolean.set(false);
    }

    public void v(java.util.List items, int i17) {
        kotlin.jvm.internal.o.g(items, "items");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = items.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String h17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.h((java.lang.String) ((java.util.List) next).get(0));
            com.tencent.mm.sdk.platformtools.a3 a3Var = f464496g;
            if (a3Var.n(h17)) {
                z17 = false;
            } else {
                a3Var.m(h17);
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            if (com.tencent.mars.xlog.Log.getLogLevel() == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadData: preloadByIdAndUrls:");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.h((java.lang.String) ((java.util.List) it6.next()).get(0)));
                }
                sb6.append(arrayList2);
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceImpl", sb6.toString());
            }
            ((ku5.t0) ku5.t0.f312615d).h(new yq1.v(arrayList, i17), "tmplPreload");
        }
    }

    public void w(int i17, java.util.List list) {
        if (!com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(i17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandServiceImpl", "preloadWebView can not preload scene: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceImpl", "preloadWebView openScene: " + i17 + ", itemShowTypeList: " + list);
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a.g(i17, com.tencent.mm.pluginsdk.model.e.f189277a.b());
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.k(com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a.j(((java.lang.Number) it.next()).intValue()));
            }
        }
    }

    public void x(int i17, int i18, int i19) {
        com.tencent.mm.autogen.mmdata.rpt.NewBizPreloadReportStruct newBizPreloadReportStruct = new com.tencent.mm.autogen.mmdata.rpt.NewBizPreloadReportStruct();
        newBizPreloadReportStruct.f59653d = i17;
        newBizPreloadReportStruct.f59654e = newBizPreloadReportStruct.b("NetType", com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wifi" : com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "5g" : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "4g" : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "2g" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE, true);
        newBizPreloadReportStruct.f59655f = i18;
        newBizPreloadReportStruct.f59656g = i19;
        newBizPreloadReportStruct.k();
    }

    public void y(int i17, int i18, int i19, float f17, int i27, int i28) {
        com.tencent.mm.autogen.mmdata.rpt.NewBizPreloadReportStruct newBizPreloadReportStruct = new com.tencent.mm.autogen.mmdata.rpt.NewBizPreloadReportStruct();
        newBizPreloadReportStruct.f59653d = i17;
        newBizPreloadReportStruct.f59654e = newBizPreloadReportStruct.b("NetType", com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wifi" : com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "5g" : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "4g" : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "2g" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE, true);
        newBizPreloadReportStruct.f59660k = i18;
        newBizPreloadReportStruct.f59661l = i19;
        newBizPreloadReportStruct.f59662m = f17 * 100;
        newBizPreloadReportStruct.f59663n = i27;
        newBizPreloadReportStruct.f59664o = i28;
        newBizPreloadReportStruct.k();
    }

    public void z(int i17, int i18, int i19, int i27) {
        com.tencent.mm.autogen.mmdata.rpt.NewBizPreloadReportStruct newBizPreloadReportStruct = new com.tencent.mm.autogen.mmdata.rpt.NewBizPreloadReportStruct();
        newBizPreloadReportStruct.f59653d = i17;
        newBizPreloadReportStruct.f59654e = newBizPreloadReportStruct.b("NetType", com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wifi" : com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "5g" : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "4g" : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "2g" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE, true);
        newBizPreloadReportStruct.f59657h = i18;
        newBizPreloadReportStruct.f59659j = i27;
        newBizPreloadReportStruct.f59658i = i19;
        newBizPreloadReportStruct.k();
    }
}
