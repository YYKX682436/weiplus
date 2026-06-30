package com.tencent.mm.plugin.lite.jsapi.module;

/* loaded from: classes15.dex */
public class LiteAppDebugPannelModule extends bd.d {
    @bd.c(uiThread = false)
    public org.json.JSONArray getLiteAppConfigList() {
        java.util.ArrayList<com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo> liteAppConfigInfoList = com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getLiteAppConfigInfoList();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (liteAppConfigInfoList != null && !liteAppConfigInfoList.isEmpty()) {
            try {
                java.util.Iterator<com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo> it = liteAppConfigInfoList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo next = it.next();
                    if (!next.field_appId.equals(com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.LITE_APP_GLOBAL_CONFIG)) {
                        com.tencent.mm.plugin.lite.config.LiteAppConfigModel configModel = com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getConfigModel(next.field_appId);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("appId", next.field_appId);
                        jSONObject.put("config", configModel.toString());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONArray;
    }

    @bd.c(uiThread = false)
    public org.json.JSONArray getLiteAppList() {
        java.util.List<com.tencent.liteapp.storage.WxaLiteAppInfo> A = com.tencent.mm.plugin.lite.logic.g1.s().A();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo : A) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", wxaLiteAppInfo.appId);
                jSONObject.put(dm.i4.COL_UPDATETIME, wxaLiteAppInfo.updateTime);
                jSONObject.put("version", com.tencent.mm.plugin.lite.LiteAppCenter.getLiteAppVersion(wxaLiteAppInfo.path, wxaLiteAppInfo.appId, wxaLiteAppInfo.signatureKey));
                jSONObject.put("versionType", com.tencent.mm.plugin.lite.LiteAppCenter.getLiteAppVersionType(wxaLiteAppInfo.path, wxaLiteAppInfo.appId, wxaLiteAppInfo.signatureKey));
                jSONObject.put("type", wxaLiteAppInfo.type);
                jSONObject.put("md5", wxaLiteAppInfo.f46019md5);
                jSONArray.put(jSONObject);
            } catch (org.json.JSONException unused) {
            }
        }
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo u17 = com.tencent.mm.plugin.lite.logic.g1.s().u(null);
        if (u17 != null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("appId", com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
                jSONObject2.put(dm.i4.COL_UPDATETIME, u17.updateTime);
                jSONObject2.put("version", u17.version);
                jSONObject2.put("type", u17.type);
                jSONObject2.put("md5", u17.f46017md5);
                jSONArray.put(jSONObject2);
            } catch (org.json.JSONException unused2) {
            }
        }
        return jSONArray;
    }

    @bd.c(uiThread = false)
    public boolean removeLiteApp(java.lang.String str) {
        if (str.equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo u17 = com.tencent.mm.plugin.lite.logic.g1.s().u(null);
            if (u17 != null) {
                com.tencent.mm.plugin.lite.logic.g1.s().K(u17);
                com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
                if (Ui != null && Ui.f217597o == 1 && com.tencent.mm.vfs.w6.j(Ui.getPath())) {
                    com.tencent.mm.vfs.w6.h(Ui.getPath());
                }
            }
        } else {
            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
            if (y17 != null) {
                com.tencent.mm.plugin.lite.logic.g1.s().L(y17);
                md.k.a(com.tencent.mm.storage.v3.f196275c + "/pkg/" + str);
                com.tencent.wechat.aff.udr.x Ui2 = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(str, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
                if (Ui2 != null && Ui2.f217597o == 1 && com.tencent.mm.vfs.w6.j(Ui2.getPath())) {
                    com.tencent.mm.vfs.w6.h(Ui2.getPath());
                }
            }
        }
        return true;
    }
}
