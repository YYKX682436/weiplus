package ls1;

/* loaded from: classes7.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.m implements yz5.a {
    public i(java.lang.Object obj) {
        super(0, obj, ls1.e0.class, "updateData", "updateData()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        ls1.e0 e0Var = (ls1.e0) this.receiver;
        e0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        e0Var.V.a("onInjectStart", currentTimeMillis);
        java.lang.String B1 = e0Var.B1();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateData]data contentId:");
        java.lang.String str = e0Var.Y1;
        if (str == null) {
            kotlin.jvm.internal.o.o("contentId");
            throw null;
        }
        sb6.append(str);
        sb6.append(" startLoadPage:");
        sb6.append(e0Var.Q1);
        sb6.append(" receivePageData:");
        sb6.append(e0Var.S1);
        com.tencent.mars.xlog.Log.i(B1, sb6.toString());
        org.json.JSONObject put = new org.json.JSONObject().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "@param").put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, new org.json.JSONObject().put("startLoadPage", e0Var.Q1).put("receivePageData", e0Var.S1)).put("url", e0Var.i());
        com.tencent.mm.ui.widget.MMWebView mMWebView = e0Var.f181916a;
        org.json.JSONObject put2 = put.put("key", mMWebView.getRandomStr());
        cy4.b bVar = cy4.b.f224859a;
        java.lang.String str2 = "";
        if (bVar.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mm.sdk.platformtools.v3 v3Var = cy4.b.f224861c;
            java.lang.String s17 = v3Var.s("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(s17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData vid null");
            } else {
                ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).D("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", "");
                java.util.Map b17 = bVar.b(s17);
                java.lang.Object obj2 = b17 != null ? b17.get("videoInitialSnapshot") : null;
                java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str3 == null) {
                    str3 = "";
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData snap null");
                } else {
                    if (b17 == null || (obj = b17.get("videoInitialTime")) == null) {
                        obj = 0;
                    }
                    jSONObject.put("videoInitialTime", obj);
                    jSONObject.put("videoInitialSnapshot", b17 != null ? b17.get("videoInitialSnapshot") : null);
                    str2 = ",window.onReceiveNativeData(" + jSONObject + ')';
                }
            }
        }
        java.lang.String jSONObject2 = put2.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String str4 = "[window.onReceivePageData(" + jSONObject2 + "),Date.now()" + str2 + "].join(',')";
        java.lang.String x17 = r26.i0.x(str4, "\"@param\"", e0Var.f320977c2, false, 4, null);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        com.tencent.mm.sdk.platformtools.g3 g3Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94439e;
        java.lang.String str5 = e0Var.Y1;
        if (str5 == null) {
            kotlin.jvm.internal.o.o("contentId");
            throw null;
        }
        com.tencent.mm.vfs.r6 c17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.c(g3Var, str5);
        if (mMWebView.u(2008) && c17 != null) {
            java.lang.String w17 = r26.i0.w(str4, "\"@param\"", "@param", false);
            com.tencent.mars.xlog.Log.i(e0Var.B1(), "onReceivePageData buff parse native:" + w17);
            com.tencent.xweb.y2 y2Var = new com.tencent.xweb.y2(0, 0, mMWebView);
            y2Var.f220633c = w17;
            y2Var.f220632b = "string";
            y2Var.f220637g = c17.u();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(e0Var.f320975a2 + ".__log(JSON.stringify({err:window['___xweb_script_err']}));console.log('__log', {err:window['___xweb_script_err']});");
            sb7.append('\n');
            sb7.append(x17);
            y2Var.f220636f = sb7.toString();
            str4 = y2Var.toString();
            kotlin.jvm.internal.o.f(str4, "toString(...)");
            c0Var.f310112d = true;
            ax4.a.d(120, java.lang.System.currentTimeMillis() - currentTimeMillis2);
        }
        if (!c0Var.f310112d) {
            str4 = "javascript:" + x17;
        }
        e0Var.L(str4, new ls1.c0(e0Var, currentTimeMillis, c0Var, currentTimeMillis2));
        return jz5.f0.f302826a;
    }
}
