package com.tencent.mm.plugin.lite.config;

/* loaded from: classes15.dex */
public class LiteAppConfigMgr {
    public static final java.lang.String KEY_LITE_APP_COMMON = "common";
    public static final java.lang.String KEY_LITE_APP_CONFIG_INFO = "LiteAppConfigInfo";
    public static final java.lang.String KEY_LITE_APP_CONFIG_INFO_LIST = "LiteAppConfigInfoList";
    public static final java.lang.String KEY_LITE_APP_SAMPLING_CONFIG_INFO = "LiteAppSamplingConfigInfo";
    public static final java.lang.String LITE_APP_GLOBAL_CONFIG = "wxaliteglobalconfig";
    static final java.lang.String TAG = "LiteApp.LiteAppConfigMgr";
    private static volatile com.tencent.mm.plugin.lite.config.LiteAppConfigMgr instance;

    /* loaded from: classes15.dex */
    public enum LiteAppConfigType {
        AppConfig,
        EngineConfig,
        SamplingConfig
    }

    private LiteAppConfigMgr() {
    }

    public static com.tencent.mm.plugin.lite.config.LiteAppConfigMgr getInstance() {
        if (instance == null) {
            synchronized (com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.class) {
                if (instance == null) {
                    instance = new com.tencent.mm.plugin.lite.config.LiteAppConfigMgr();
                }
            }
        }
        return instance;
    }

    private org.json.JSONObject mergeConfigJson(org.json.JSONObject... jSONObjectArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (org.json.JSONObject jSONObject2 : jSONObjectArr) {
            jSONObject = mergeJsonObjects(jSONObject, jSONObject2);
        }
        return jSONObject;
    }

    private org.json.JSONObject mergeJsonObjects(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(jSONObject.toString());
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject2.get(next);
                if (jSONObject3.has(next)) {
                    java.lang.Object obj2 = jSONObject3.get(next);
                    if ((obj2 instanceof org.json.JSONObject) && (obj instanceof org.json.JSONObject)) {
                        jSONObject3.put(next, mergeJsonObjects((org.json.JSONObject) obj2, (org.json.JSONObject) obj));
                    }
                } else {
                    jSONObject3.put(next, obj);
                }
            }
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "mergeJsonObjects exception " + e17.toString());
            return null;
        }
    }

    public java.util.HashMap<java.lang.String, com.tencent.mm.plugin.lite.config.LiteAppConfigModel> getAllConfigModel() {
        java.util.HashMap<java.lang.String, com.tencent.mm.plugin.lite.config.LiteAppConfigModel> hashMap = new java.util.HashMap<>();
        java.util.ArrayList<com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo> liteAppConfigInfoList = getLiteAppConfigInfoList();
        if (liteAppConfigInfoList == null) {
            return hashMap;
        }
        java.util.Iterator<com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo> it = liteAppConfigInfoList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo next = it.next();
            try {
                hashMap.put(next.field_appId, (com.tencent.mm.plugin.lite.config.LiteAppConfigModel) new com.google.gson.i().b(next.field_configJson, com.tencent.mm.plugin.lite.config.LiteAppConfigModel.class));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(TAG, e17.toString());
                removeLiteAppConfigInfo(next.field_appId);
            }
        }
        return hashMap;
    }

    public com.tencent.mm.plugin.lite.config.LiteAppConfigModel getConfigModel(java.lang.String str) {
        com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo liteAppConfigInfo = getLiteAppConfigInfo(str);
        com.tencent.mm.plugin.lite.config.LiteAppConfigModel liteAppConfigModel = new com.tencent.mm.plugin.lite.config.LiteAppConfigModel();
        if (liteAppConfigInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(liteAppConfigInfo.field_configJson)) {
            return liteAppConfigModel;
        }
        try {
            return (com.tencent.mm.plugin.lite.config.LiteAppConfigModel) new com.google.gson.i().b(liteAppConfigInfo.field_configJson, com.tencent.mm.plugin.lite.config.LiteAppConfigModel.class);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, e17.toString());
            removeLiteAppConfigInfo(liteAppConfigInfo.field_appId);
            return liteAppConfigModel;
        }
    }

    public com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel getEngineConfigModel() {
        com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel liteAppEngineConfigModel = new com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel();
        try {
            com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo liteAppEngineConfigInfo = getLiteAppEngineConfigInfo();
            return (liteAppEngineConfigInfo == null || liteAppEngineConfigInfo.field_configJson == null) ? liteAppEngineConfigModel : (com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel) new com.google.gson.i().b(liteAppEngineConfigInfo.field_configJson, com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel.class);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getEngineConfigModel error. " + e17.toString());
            return liteAppEngineConfigModel;
        }
    }

    public com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo getLiteAppConfigInfo(java.lang.String str) {
        try {
            android.os.Bundle a17 = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppConfigInfo", str, null);
            if (a17 != null) {
                a17.setClassLoader(com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo.class.getClassLoader());
                return (com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo) a17.getParcelable(KEY_LITE_APP_CONFIG_INFO);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getLiteAppConfigInfo error: " + e17.toString());
        }
        return null;
    }

    public java.util.ArrayList<com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo> getLiteAppConfigInfoList() {
        try {
            android.os.Bundle a17 = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppConfigList", null, null);
            if (a17 != null) {
                return a17.getParcelableArrayList(KEY_LITE_APP_CONFIG_INFO_LIST);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getLiteAppConfigInfoList error. " + e17.toString());
        }
        return new java.util.ArrayList<>();
    }

    public com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo getLiteAppEngineConfigInfo() {
        try {
            android.os.Bundle a17 = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppConfigInfo", "engineConfig", null);
            if (a17 != null) {
                return (com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo) a17.getParcelable(KEY_LITE_APP_CONFIG_INFO);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getLiteAppEngineConfigInfo error. " + e17.toString());
        }
        return null;
    }

    public com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo getLiteAppGlobalConfigInfo() {
        try {
            android.os.Bundle a17 = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppConfigInfo", LITE_APP_GLOBAL_CONFIG, null);
            if (a17 != null) {
                return (com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo) a17.getParcelable(KEY_LITE_APP_CONFIG_INFO);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getLiteAppGlobalConfigInfo error. " + e17.toString());
        }
        return null;
    }

    public com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo getLiteAppGlobalSamplingConfigInfo() {
        try {
            android.os.Bundle a17 = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppSamplingConfigInfo", LITE_APP_GLOBAL_CONFIG, null);
            if (a17 != null) {
                return (com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo) a17.getParcelable(KEY_LITE_APP_SAMPLING_CONFIG_INFO);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getLiteAppGlobalSamplingConfigInfo error. " + e17.toString());
        }
        return null;
    }

    public com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo getLiteAppSamplingConfigInfo(java.lang.String str) {
        try {
            android.os.Bundle a17 = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppSamplingConfigInfo", str, null);
            if (a17 != null) {
                a17.setClassLoader(com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo.class.getClassLoader());
                return (com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo) a17.getParcelable(KEY_LITE_APP_SAMPLING_CONFIG_INFO);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getLiteAppSamplingConfigInfo error: " + e17.toString());
        }
        return null;
    }

    public java.lang.String getSamplingConfigJson(java.lang.String str) {
        com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo liteAppSamplingConfigInfo = getLiteAppSamplingConfigInfo(str);
        if (liteAppSamplingConfigInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(liteAppSamplingConfigInfo.field_configJson) && !liteAppSamplingConfigInfo.field_configJson.equals("{}")) {
            return liteAppSamplingConfigInfo.field_configJson;
        }
        com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo liteAppSamplingConfigInfo2 = getLiteAppSamplingConfigInfo("common");
        return (liteAppSamplingConfigInfo2 == null || com.tencent.mm.sdk.platformtools.t8.K0(liteAppSamplingConfigInfo2.field_configJson) || liteAppSamplingConfigInfo2.field_configJson.equals("{}")) ? "" : liteAppSamplingConfigInfo2.field_configJson;
    }

    public void insertLiteAppConfigInfo(com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo liteAppConfigInfo) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(KEY_LITE_APP_CONFIG_INFO, liteAppConfigInfo);
        com.tencent.mm.plugin.lite.storage.q.a("insertLiteAppConfigInfo", liteAppConfigInfo.field_appId, bundle);
    }

    public void insertLiteAppSamplingConfigInfo(com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo liteAppSamplingConfigInfo) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(KEY_LITE_APP_SAMPLING_CONFIG_INFO, liteAppSamplingConfigInfo);
        com.tencent.mm.plugin.lite.storage.q.a("insertLiteAppSamplingConfigInfo", liteAppSamplingConfigInfo.field_appId, bundle);
    }

    public void mergeConfig(java.lang.String str) {
        try {
            com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo liteAppGlobalConfigInfo = getLiteAppGlobalConfigInfo();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (liteAppGlobalConfigInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(liteAppGlobalConfigInfo.field_dynamicConfigPath) && com.tencent.mm.vfs.w6.j(liteAppGlobalConfigInfo.field_dynamicConfigPath)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(liteAppGlobalConfigInfo.field_dynamicConfigPath));
                jSONObject = jSONObject2.has(str) ? jSONObject2.getJSONObject(str) : new org.json.JSONObject();
            }
            com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo liteAppConfigInfo = getLiteAppConfigInfo(str);
            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            if (liteAppConfigInfo == null) {
                liteAppConfigInfo = new com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo();
                liteAppConfigInfo.field_appId = str;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(liteAppConfigInfo.field_dynamicConfigPath) && com.tencent.mm.vfs.w6.j(liteAppConfigInfo.field_dynamicConfigPath)) {
                jSONObject4 = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(liteAppConfigInfo.field_dynamicConfigPath));
            }
            if (y17 != null) {
                java.lang.String str2 = com.tencent.mm.plugin.lite.logic.y2.e(str, y17.patchId, y17.f46019md5) + "/pkg/config.json";
                if (com.tencent.mm.vfs.w6.j(str2)) {
                    liteAppConfigInfo.field_packageConfigPath = str2;
                    jSONObject3 = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(str2));
                }
            }
            liteAppConfigInfo.field_configJson = mergeConfigJson(jSONObject4, jSONObject, jSONObject3).toString();
            insertLiteAppConfigInfo(liteAppConfigInfo);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "mergeConfig exception: " + e17.toString());
        }
    }

    public void mergeGlobalConfig() {
        try {
            com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo liteAppGlobalConfigInfo = getLiteAppGlobalConfigInfo();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (liteAppGlobalConfigInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(liteAppGlobalConfigInfo.field_dynamicConfigPath) && com.tencent.mm.vfs.w6.j(liteAppGlobalConfigInfo.field_dynamicConfigPath)) {
                jSONObject = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(liteAppGlobalConfigInfo.field_dynamicConfigPath));
            }
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo liteAppConfigInfo = getLiteAppConfigInfo(next);
                com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(next, null);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                if (liteAppConfigInfo == null) {
                    liteAppConfigInfo = new com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo();
                    liteAppConfigInfo.field_appId = next;
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(liteAppConfigInfo.field_dynamicConfigPath) && com.tencent.mm.vfs.w6.j(liteAppConfigInfo.field_dynamicConfigPath)) {
                    jSONObject4 = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(liteAppConfigInfo.field_dynamicConfigPath));
                }
                if (y17 != null) {
                    java.lang.String str = com.tencent.mm.plugin.lite.logic.y2.e(next, y17.patchId, y17.f46019md5) + "/pkg/config.json";
                    if (com.tencent.mm.vfs.w6.j(str)) {
                        liteAppConfigInfo.field_packageConfigPath = str;
                        jSONObject3 = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(str));
                    }
                }
                liteAppConfigInfo.field_configJson = mergeConfigJson(jSONObject4, jSONObject2, jSONObject3).toString();
                insertLiteAppConfigInfo(liteAppConfigInfo);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "mergeConfig exception: " + e17.toString());
        }
    }

    public void mergeSamplingConfig(java.lang.String str) {
        try {
            com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo liteAppGlobalSamplingConfigInfo = getLiteAppGlobalSamplingConfigInfo();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (liteAppGlobalSamplingConfigInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(liteAppGlobalSamplingConfigInfo.field_dynamicConfigPath) && com.tencent.mm.vfs.w6.j(liteAppGlobalSamplingConfigInfo.field_dynamicConfigPath)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(liteAppGlobalSamplingConfigInfo.field_dynamicConfigPath));
                jSONObject = jSONObject2.has(str) ? jSONObject2.getJSONObject(str) : new org.json.JSONObject();
            }
            com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo liteAppSamplingConfigInfo = getLiteAppSamplingConfigInfo(str);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            if (liteAppSamplingConfigInfo == null) {
                liteAppSamplingConfigInfo = new com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo();
                liteAppSamplingConfigInfo.field_appId = str;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(liteAppSamplingConfigInfo.field_dynamicConfigPath) && com.tencent.mm.vfs.w6.j(liteAppSamplingConfigInfo.field_dynamicConfigPath)) {
                jSONObject3 = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(liteAppSamplingConfigInfo.field_dynamicConfigPath));
            }
            liteAppSamplingConfigInfo.field_configJson = mergeConfigJson(jSONObject3, jSONObject).toString();
            insertLiteAppSamplingConfigInfo(liteAppSamplingConfigInfo);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "mergeSamplingConfig exception: " + e17.toString());
        }
    }

    public void removeLiteAppConfigInfo(java.lang.String str) {
        com.tencent.mm.plugin.lite.storage.q.a("removeLiteAppConfigInfo", str, null);
    }

    public void removeLiteAppSamplingConfigInfo(java.lang.String str) {
        com.tencent.mm.plugin.lite.storage.q.a("removeLiteAppSamplingConfigInfo", str, null);
    }

    public void updateGlobalSamplingConfig(com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo liteAppSamplingConfigInfo, com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo liteAppSamplingConfigInfo2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (liteAppSamplingConfigInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(liteAppSamplingConfigInfo.field_dynamicConfigPath) && com.tencent.mm.vfs.w6.j(liteAppSamplingConfigInfo.field_dynamicConfigPath)) {
                jSONObject = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(liteAppSamplingConfigInfo.field_dynamicConfigPath));
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (liteAppSamplingConfigInfo2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(liteAppSamplingConfigInfo2.field_dynamicConfigPath) && com.tencent.mm.vfs.w6.j(liteAppSamplingConfigInfo2.field_dynamicConfigPath)) {
                jSONObject2 = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(liteAppSamplingConfigInfo2.field_dynamicConfigPath));
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
            java.util.Iterator<java.lang.String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                hashSet.add(keys2.next());
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                if (jSONObject.has(str)) {
                    jSONObject3 = jSONObject.getJSONObject(str);
                }
                com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo liteAppSamplingConfigInfo3 = getLiteAppSamplingConfigInfo(str);
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                if (liteAppSamplingConfigInfo3 == null) {
                    liteAppSamplingConfigInfo3 = new com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo();
                    liteAppSamplingConfigInfo3.field_appId = str;
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(liteAppSamplingConfigInfo3.field_dynamicConfigPath) && com.tencent.mm.vfs.w6.j(liteAppSamplingConfigInfo3.field_dynamicConfigPath)) {
                    jSONObject4 = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(liteAppSamplingConfigInfo3.field_dynamicConfigPath));
                }
                liteAppSamplingConfigInfo3.field_configJson = mergeConfigJson(jSONObject4, jSONObject3).toString();
                insertLiteAppSamplingConfigInfo(liteAppSamplingConfigInfo3);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "updateGlobalSamplingConfig exception: " + e17.toString());
        }
    }
}
