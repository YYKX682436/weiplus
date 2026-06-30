package cy4;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final cy4.b f224859a = new cy4.b();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f224860b = jz5.h.b(cy4.a.f224858d);

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.v3 f224861c;

    static {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.MPVideoPreviewDataMgr");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        f224861c = new com.tencent.mm.sdk.platformtools.v3(M, 600L);
    }

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) f224860b).getValue()).booleanValue();
    }

    public final java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "getVideo vid null");
            return null;
        }
        com.tencent.mm.sdk.platformtools.v3 v3Var = f224861c;
        int o17 = v3Var.o("MicroMsg.MPVideoPreviewDataMgr_" + str + "_playTime", 0);
        int o18 = v3Var.o("MicroMsg.MPVideoPreviewDataMgr_" + str + "_expire", 0);
        boolean z17 = java.lang.System.currentTimeMillis() / ((long) 1000) > ((long) o18);
        if (o17 != 0 && o18 != 0 && !z17) {
            hashMap = new java.util.HashMap();
            kotlin.jvm.internal.o.e(java.lang.Integer.valueOf(o17), "null cannot be cast to non-null type java.lang.Object");
            hashMap.put("videoInitialTime", java.lang.Integer.valueOf(o17));
            java.lang.String s17 = v3Var.s("MicroMsg.MPVideoPreviewDataMgr_" + str + "_bitmap", "");
            kotlin.jvm.internal.o.e(s17, "null cannot be cast to non-null type java.lang.Object");
            hashMap.put("videoInitialSnapshot", s17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getVideo vid = ");
        sb6.append(str);
        sb6.append(", map size = ");
        sb6.append(hashMap != null ? hashMap.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", sb6.toString());
        return hashMap;
    }

    public final void c(java.lang.String str) {
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("video_data");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "reportByLeaveForMPGateway video_data null");
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(optString);
            java.lang.String optString2 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID);
            int L = (int) com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("lastPlayedTime"), 0.0f);
            int L2 = (int) com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("lastPlayedTimeExpiredTime"), 0.0f);
            if (a()) {
                com.tencent.mm.sdk.platformtools.v3 v3Var = f224861c;
                com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) v3Var.i();
                o4Var.A("MicroMsg.MPVideoPreviewDataMgr_" + optString2 + "_playTime", L);
                o4Var.A("MicroMsg.MPVideoPreviewDataMgr_" + optString2 + "_expire", L2);
                ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).D("MicroMsg.MPVideoPreviewDataMgr_" + optString2 + "_bitmap", "");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "reportByLeaveForMPGateway, ex = %s", e17.getMessage());
        }
    }

    public final void d(java.lang.String str) {
        if (a()) {
            java.util.Map b17 = b(str);
            com.tencent.mm.sdk.platformtools.v3 v3Var = f224861c;
            if (b17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "prepareOnReceivePageData vid not found");
                ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).D("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", "");
                return;
            }
            ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).D("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", str);
            java.lang.Object obj = b17.get("videoInitialSnapshot");
            if (obj instanceof java.lang.String) {
            }
        }
    }
}
