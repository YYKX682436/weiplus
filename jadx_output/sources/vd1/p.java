package vd1;

/* loaded from: classes.dex */
public class p extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 45;
    private static final java.lang.String NAME = "reportAction";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String optString = jSONObject.optString("key");
        java.lang.String optString2 = jSONObject.optString("value");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey =  %s, actionValue =  %s", optString, optString2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue is null");
            lVar.a(i17, o("fail"));
            return;
        }
        if (optString.length() <= 0 || optString.length() > 32 || optString2.length() <= 0 || optString2.length() > 1024) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue size is bad");
            lVar.a(i17, o("fail"));
            return;
        }
        java.lang.String appId = lVar.getAppId();
        if (android.text.TextUtils.isEmpty(appId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportAction", "doReportActionInfo, appId is empty");
            lVar.a(i17, o("fail"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportAction", "doReportActionInfo, appId %s", appId);
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(lVar.getContext())) {
            i18 = com.tencent.mars.comm.NetStatusUtil.isWifi(lVar.getContext()) ? 1 : com.tencent.mars.comm.NetStatusUtil.is5G(lVar.getContext()) ? 5 : com.tencent.mars.comm.NetStatusUtil.is4G(lVar.getContext()) ? 4 : com.tencent.mars.comm.NetStatusUtil.is3G(lVar.getContext()) ? 3 : com.tencent.mars.comm.NetStatusUtil.is2G(lVar.getContext()) ? 2 : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportAction", "doReportActionInfo, get networkType %d", java.lang.Integer.valueOf(i18));
        } else {
            i18 = 0;
        }
        long i19 = com.tencent.mm.sdk.platformtools.t8.i1();
        try {
            str2 = java.net.URLEncoder.encode("", com.tencent.mapsdk.internal.rv.f51270c);
            try {
                str3 = java.net.URLEncoder.encode("", com.tencent.mapsdk.internal.rv.f51270c);
                try {
                    str = java.net.URLEncoder.encode(optString, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    e = e17;
                    str = "";
                }
                try {
                    str4 = java.net.URLEncoder.encode(optString2, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.io.UnsupportedEncodingException e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiReportAction", e, "", new java.lang.Object[0]);
                    str4 = "";
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13579, appId, java.lang.Integer.valueOf(i18), str2, str3, "", str, str4, java.lang.Long.valueOf(i19), java.lang.Long.valueOf(i19));
                    lVar.a(i17, o("ok"));
                }
            } catch (java.io.UnsupportedEncodingException e19) {
                e = e19;
                str = "";
                str3 = str;
            }
        } catch (java.io.UnsupportedEncodingException e27) {
            e = e27;
            str = "";
            str2 = str;
            str3 = str2;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13579, appId, java.lang.Integer.valueOf(i18), str2, str3, "", str, str4, java.lang.Long.valueOf(i19), java.lang.Long.valueOf(i19));
        lVar.a(i17, o("ok"));
    }
}
