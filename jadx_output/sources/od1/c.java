package od1;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public long f344603b;

    /* renamed from: c, reason: collision with root package name */
    public long f344604c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f344602a = "";

    /* renamed from: d, reason: collision with root package name */
    public final org.json.JSONObject f344605d = new org.json.JSONObject();

    public final void a(com.tencent.mm.plugin.appbrand.e9 receiver) {
        kotlin.jvm.internal.o.g(receiver, "receiver");
        if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(receiver.getRuntime())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "game not need to trigger the callback");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = receiver.x();
        java.lang.Boolean bool = null;
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.y(x17 != null ? x17.qe("supportListenNewPerformanceMetric") : null, false)) {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f344602a);
            jSONObject.put("startTime", this.f344603b);
            jSONObject.put("endTime", this.f344604c);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, this.f344605d);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "dispatch " + jSONObject);
            receiver.g("onNewPerformanceMetric", jSONObject.toString());
            return;
        }
        if (receiver.k(od1.i.class) == null) {
            synchronized (receiver) {
                if (receiver.k(od1.i.class) == null) {
                    receiver.l(new od1.i());
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "support listen NewPerformanceMetric");
                }
            }
        }
        od1.i iVar = (od1.i) receiver.k(od1.i.class);
        if (iVar != null) {
            java.lang.String str = this.f344602a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NewPerformanceMetricStateManager", "checkIsListeningProvidedName: " + str);
            java.util.HashSet hashSet = iVar.f344606d;
            if (hashSet == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NewPerformanceMetricStateManager", "false");
            } else {
                z17 = hashSet.contains(str);
            }
            bool = java.lang.Boolean.valueOf(z17);
        }
        if (iVar != null) {
            java.lang.String str2 = this.f344602a;
            long j17 = this.f344603b;
            long j18 = this.f344604c;
            org.json.JSONObject jSONObject2 = this.f344605d;
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NewPerformanceMetricStateManager", "updateCachedData:" + str2);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str2);
                jSONObject3.put("startTime", j17);
                jSONObject3.put("endTime", j18);
                jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, jSONObject2);
                iVar.f344607e.add(jSONObject3);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.NewPerformanceMetricStateManager", e17.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "canUseProvidedName:" + bool);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f344602a);
        jSONObject.put("startTime", this.f344603b);
        jSONObject.put("endTime", this.f344604c);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, this.f344605d);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "dispatch after Listened " + jSONObject);
        receiver.g("onNewPerformanceMetric", jSONObject.toString());
    }

    public final void b(java.lang.String name, java.lang.Object value) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(value, "value");
        this.f344605d.put(name, value);
    }
}
