package com.tencent.thumbplayer.datatransport.config;

/* loaded from: classes16.dex */
public class TPProxyServiceConfig {
    public java.lang.String cacheDir;
    public java.lang.String dataDir;
    public java.lang.String initConfig;
    public long maxUseMemoryMB;
    public long maxUseStorageMB;
    public int serviceType;
    public boolean vodCachedEnable = false;
    public boolean reportEnable = true;

    /* loaded from: classes16.dex */
    public static final class Helper {
        public static java.lang.String bufferTimeSecJsonConfig(long j17) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("VodEmergencyTimeMax", j17);
                jSONObject.put("VodSafePlayTimeMax", j17);
                jSONObject.put("FileVodEmergencyTimeMax", j17);
                jSONObject.put("FileVodSafePlayTimeMax", j17);
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }

        public static com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig clone(com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig tPProxyServiceConfig) {
            com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig tPProxyServiceConfig2 = new com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig();
            tPProxyServiceConfig2.serviceType = tPProxyServiceConfig.serviceType;
            tPProxyServiceConfig2.cacheDir = tPProxyServiceConfig.cacheDir;
            tPProxyServiceConfig2.dataDir = tPProxyServiceConfig.dataDir;
            tPProxyServiceConfig2.maxUseMemoryMB = tPProxyServiceConfig.maxUseMemoryMB;
            tPProxyServiceConfig2.maxUseStorageMB = tPProxyServiceConfig.maxUseStorageMB;
            tPProxyServiceConfig2.vodCachedEnable = tPProxyServiceConfig.vodCachedEnable;
            tPProxyServiceConfig2.reportEnable = tPProxyServiceConfig.reportEnable;
            tPProxyServiceConfig2.initConfig = tPProxyServiceConfig.initConfig;
            return tPProxyServiceConfig2;
        }

        public static java.lang.String jsonConfig(com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig tPProxyServiceConfig) {
            if (!android.text.TextUtils.isEmpty(tPProxyServiceConfig.initConfig)) {
                return tPProxyServiceConfig.initConfig;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("EnableReport", tPProxyServiceConfig.reportEnable);
                jSONObject.put("VodCacheEnable", tPProxyServiceConfig.vodCachedEnable);
                long j17 = tPProxyServiceConfig.maxUseMemoryMB;
                if (j17 > 0) {
                    jSONObject.put("MaxUseMemoryLevel1MB", j17);
                    jSONObject.put("MaxUseMemoryLevel2MB", tPProxyServiceConfig.maxUseMemoryMB);
                    jSONObject.put("MaxUseMemoryMB", tPProxyServiceConfig.maxUseMemoryMB);
                }
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }

        public static java.lang.String maxUseMemoryMBJsonConfig(long j17) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("MaxUseMemoryLevel1MB", j17);
                jSONObject.put("MaxUseMemoryLevel2MB", j17);
                jSONObject.put("MaxUseMemoryMB", j17);
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }

        public static java.lang.String reportEnableJsonConfig(boolean z17) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("EnableReport", z17);
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }

        public static java.lang.String vodCachedEnableJsonConfig(boolean z17) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("VodCacheEnable", z17);
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return "";
            }
        }
    }
}
