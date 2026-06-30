package ne;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne/e;", "Lcom/tencent/mm/plugin/appbrand/jsapi/g0;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.plugin.appbrand.jsapi.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f336479d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONArray f336480e;

    public e(ze.n rt6) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f336479d = rt6;
    }

    public final int a(java.lang.String pluginId) {
        org.json.JSONArray optJSONArray;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo;
        com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap;
        boolean z17 = true;
        if (pluginId == null || pluginId.length() == 0) {
            return 0;
        }
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = this.f336479d.E0();
        if (E0 != null && (wxaPkgWrappingInfo = E0.f305852r) != null && (wxaRuntimeModulePluginListMap = wxaPkgWrappingInfo.f75404i) != null) {
            kotlin.jvm.internal.o.g(pluginId, "pluginId");
            android.util.ArrayMap arrayMap = wxaRuntimeModulePluginListMap.f75407e;
            if (arrayMap == null) {
                kotlin.jvm.internal.o.o("mSecondaryMap");
                throw null;
            }
            java.util.LinkedList linkedList = (java.util.LinkedList) arrayMap.get(new com.tencent.mm.plugin.appbrand.appcache.lb(pluginId));
            com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo = linkedList != null ? (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) kz5.n0.Z(linkedList) : null;
            if (wxaPluginPkgInfo != null) {
                return wxaPluginPkgInfo.pkgVersion();
            }
        }
        if (this.f336480e == null) {
            java.lang.String str = this.f336479d.u0().N.f77455r;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                optJSONArray = new org.json.JSONArray();
            } else {
                try {
                    optJSONArray = new org.json.JSONObject(str).optJSONArray("call_plugin_info");
                    kotlin.jvm.internal.o.d(optJSONArray);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimePluginInfoConfig", "getPluginInnerVersion(appId:" + pluginId + ") parse call_plugin_info get exception:" + e17);
                    return 0;
                }
            }
            this.f336480e = optJSONArray;
        }
        org.json.JSONArray jSONArray = this.f336480e;
        if (jSONArray == null) {
            kotlin.jvm.internal.o.o("call_plugin_info");
            throw null;
        }
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONArray jSONArray2 = this.f336480e;
            if (jSONArray2 == null) {
                kotlin.jvm.internal.o.o("call_plugin_info");
                throw null;
            }
            org.json.JSONObject optJSONObject = jSONArray2.optJSONObject(i17);
            if (kotlin.jvm.internal.o.b(pluginId, optJSONObject.optString("plugin_id"))) {
                return optJSONObject.optInt("inner_version");
            }
        }
        return 0;
    }
}
