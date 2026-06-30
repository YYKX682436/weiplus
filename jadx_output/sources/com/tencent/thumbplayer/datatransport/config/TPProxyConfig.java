package com.tencent.thumbplayer.datatransport.config;

/* loaded from: classes16.dex */
public class TPProxyConfig {
    private static final int SERVICE_TYPE_DEFAULT = 0;
    private static final java.util.Map<java.lang.Integer, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> mConfigs = new java.util.HashMap(1);
    private static volatile boolean mProxyEnable = true;
    private static int mDefaultServiceType = 0;

    private static void addServiceConfig(com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig tPProxyServiceConfig) {
        java.util.Map<java.lang.Integer, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            map.put(java.lang.Integer.valueOf(tPProxyServiceConfig.serviceType), tPProxyServiceConfig);
        }
    }

    public static int getDefaultServiceType() {
        return mDefaultServiceType;
    }

    public static com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig getProxyConfig(int i17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig serviceConfig = getServiceConfig(i17);
        return serviceConfig == null ? new com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig() : com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig.Helper.clone(serviceConfig);
    }

    public static com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam getProxyInitParam(int i17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig serviceConfig = getServiceConfig(i17);
        if (serviceConfig == null) {
            serviceConfig = getProxyConfig(mDefaultServiceType);
        }
        return new com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam(com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform(), com.tencent.thumbplayer.config.TPPlayerConfig.getAppVersionName(com.tencent.thumbplayer.api.TPPlayerMgr.getAppContext()), com.tencent.thumbplayer.config.TPPlayerConfig.getGuid(), serviceConfig.cacheDir, serviceConfig.dataDir, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig.Helper.jsonConfig(serviceConfig));
    }

    private static com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig getServiceConfig(int i17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig tPProxyServiceConfig;
        java.util.Map<java.lang.Integer, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            tPProxyServiceConfig = map.get(java.lang.Integer.valueOf(i17));
        }
        return tPProxyServiceConfig;
    }

    public static boolean isProxyEnable() {
        return mProxyEnable;
    }

    public static void setDefaultServiceType(int i17) {
        mDefaultServiceType = i17;
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig tPProxyServiceConfig = new com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig();
        tPProxyServiceConfig.serviceType = mDefaultServiceType;
        setProxyConfig(tPProxyServiceConfig);
    }

    public static void setInitConfig(int i17, java.lang.String str) {
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig serviceConfig = getServiceConfig(i17);
        if (serviceConfig == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        serviceConfig.initConfig = str;
    }

    public static void setMaxUseMemoryMB(long j17) {
        java.util.Map<java.lang.Integer, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            java.util.Iterator<com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().maxUseMemoryMB = j17;
            }
        }
    }

    public static void setMaxUseStorageMB(long j17) {
        java.util.Map<java.lang.Integer, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            java.util.Iterator<com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().maxUseStorageMB = j17;
            }
        }
    }

    public static void setProxyConfig(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig serviceConfig = getServiceConfig(i17);
        if (serviceConfig == null) {
            serviceConfig = new com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig();
        }
        serviceConfig.serviceType = i17;
        serviceConfig.cacheDir = str;
        serviceConfig.dataDir = str2;
        addServiceConfig(serviceConfig);
    }

    public static void setProxyEnable(boolean z17) {
        mProxyEnable = z17;
    }

    public static void setReportEnable(boolean z17) {
        java.util.Map<java.lang.Integer, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            java.util.Iterator<com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().reportEnable = z17;
            }
        }
    }

    public static void setVodCachedEnable(boolean z17) {
        java.util.Map<java.lang.Integer, com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> map = mConfigs;
        synchronized (map) {
            java.util.Iterator<com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().vodCachedEnable = z17;
            }
        }
    }

    public static void setMaxUseMemoryMB(int i17, long j17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig serviceConfig = getServiceConfig(i17);
        if (serviceConfig != null) {
            serviceConfig.maxUseMemoryMB = j17;
        }
    }

    public static void setMaxUseStorageMB(int i17, long j17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig serviceConfig = getServiceConfig(i17);
        if (serviceConfig != null) {
            serviceConfig.maxUseStorageMB = j17;
        }
    }

    public static void setReportEnable(int i17, boolean z17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig serviceConfig = getServiceConfig(i17);
        if (serviceConfig != null) {
            serviceConfig.reportEnable = z17;
        }
    }

    public static void setVodCachedEnable(int i17, boolean z17) {
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig serviceConfig = getServiceConfig(i17);
        if (serviceConfig != null) {
            serviceConfig.vodCachedEnable = z17;
        }
    }

    public static void setProxyConfig(com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig tPProxyServiceConfig) {
        if (getServiceConfig(tPProxyServiceConfig.serviceType) == null) {
            com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig clone = com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig.Helper.clone(tPProxyServiceConfig);
            clone.serviceType = tPProxyServiceConfig.serviceType;
            clone.cacheDir = tPProxyServiceConfig.cacheDir;
            clone.dataDir = tPProxyServiceConfig.dataDir;
            clone.maxUseMemoryMB = tPProxyServiceConfig.maxUseMemoryMB;
            clone.maxUseStorageMB = tPProxyServiceConfig.maxUseStorageMB;
            clone.vodCachedEnable = tPProxyServiceConfig.vodCachedEnable;
            clone.initConfig = tPProxyServiceConfig.initConfig;
            addServiceConfig(clone);
        }
    }
}
