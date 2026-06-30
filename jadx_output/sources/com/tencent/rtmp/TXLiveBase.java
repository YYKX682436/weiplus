package com.tencent.rtmp;

/* loaded from: classes16.dex */
public class TXLiveBase {
    private static final java.lang.String TAG = "TXLiveBase";
    private static com.tencent.rtmp.TXLiveBase instance = new com.tencent.rtmp.TXLiveBase();
    private static com.tencent.rtmp.TXLiveBase.b networkTimeCallback = new com.tencent.rtmp.TXLiveBase.b(0);
    private static com.tencent.rtmp.TXLiveBaseListener sListener;

    /* loaded from: classes16.dex */
    public static class a implements com.tencent.liteav.base.util.LiteavLog.a {
        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }

        @Override // com.tencent.liteav.base.util.LiteavLog.a
        public final void a(int i17, java.lang.String str, java.lang.String str2) {
            com.tencent.rtmp.TXLiveBaseListener tXLiveBaseListener = com.tencent.rtmp.TXLiveBase.sListener;
            if (tXLiveBaseListener != null) {
                tXLiveBaseListener.onLog(i17, str, str2);
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class b implements com.tencent.liteav.base.util.CommonUtil.a {
        private b() {
        }

        public /* synthetic */ b(byte b17) {
            this();
        }

        @Override // com.tencent.liteav.base.util.CommonUtil.a
        public final void a(int i17, java.lang.String str) {
            com.tencent.rtmp.TXLiveBase.onUpdateNetworkTime(i17, str);
        }
    }

    static {
        if (com.tencent.liteav.base.util.q.a()) {
            com.tencent.liteav.base.util.CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
    }

    private TXLiveBase() {
    }

    public static void enableCustomHttpDNS(boolean z17) {
        if (z17) {
            com.tencent.liteav.base.util.HttpDnsUtil.enableCustomHttpDNS(true, new com.tencent.liteav.base.util.HttpDnsUtil.a() { // from class: com.tencent.rtmp.TXLiveBase.2
                @Override // com.tencent.liteav.base.util.HttpDnsUtil.a
                public final void a(java.lang.String str, java.util.List<java.lang.String> list) {
                    if (com.tencent.rtmp.TXLiveBase.sListener != null) {
                        com.tencent.rtmp.TXLiveBase.sListener.onCustomHttpDNS(str, list);
                    }
                }
            });
        } else {
            com.tencent.liteav.base.util.HttpDnsUtil.enableCustomHttpDNS(false, null);
        }
    }

    public static com.tencent.rtmp.TXLiveBase getInstance() {
        return instance;
    }

    public static long getNetworkTimestamp() {
        return com.tencent.liteav.base.util.CommonUtil.getNetworkTimestamp();
    }

    public static java.lang.String getPituSDKVersion() {
        return "";
    }

    public static java.lang.String getSDKVersionStr() {
        return com.tencent.liteav.base.util.CommonUtil.getSDKVersionStr();
    }

    public static boolean isLibraryPathValid(java.lang.String str) {
        return false;
    }

    public static void onUpdateNetworkTime(int i17, java.lang.String str) {
        com.tencent.rtmp.TXLiveBaseListener tXLiveBaseListener = sListener;
        if (tXLiveBaseListener != null) {
            tXLiveBaseListener.onUpdateNetworkTime(i17, str);
        }
    }

    public static void setAppID(java.lang.String str) {
        com.tencent.liteav.LiveSettingJni.setAppId(str);
    }

    public static void setAppVersion(java.lang.String str) {
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "Set app version:".concat(java.lang.String.valueOf(str)));
        com.tencent.liteav.LiveSettingJni.setAppVersion(str);
    }

    public static void setConsoleEnabled(boolean z17) {
        com.tencent.liteav.base.util.LiteavLog.nativeSetConsoleLogEnabled(z17);
    }

    public static boolean setExtID(java.lang.String str, java.lang.String str2) {
        return com.tencent.liteav.base.system.LiteavSystemInfo.setExtID(str, str2);
    }

    public static int setGlobalEnv(java.lang.String str) {
        return com.tencent.liteav.base.util.CommonUtil.setGlobalEnv(str);
    }

    public static boolean setLibraryPath(java.lang.String str) {
        com.tencent.liteav.base.util.q.a(str);
        boolean a17 = com.tencent.liteav.base.util.q.a();
        if (a17) {
            com.tencent.liteav.base.util.CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
        return a17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setListener(com.tencent.rtmp.TXLiveBaseListener tXLiveBaseListener) {
        com.tencent.liteav.base.util.LiteavLog.setCallback(new com.tencent.rtmp.TXLiveBase.a(0 == true ? 1 : 0));
        com.tencent.liteav.base.util.LiteavLog.nativeSetLogCallbackEnabled(tXLiveBaseListener != null);
        sListener = tXLiveBaseListener;
    }

    public static void setLogLevel(int i17) {
        com.tencent.liteav.base.util.LiteavLog.b bVar = com.tencent.liteav.base.util.LiteavLog.b.kAll;
        com.tencent.liteav.base.util.LiteavLog.nativeSetLogLevel((i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 6 ? com.tencent.liteav.base.util.LiteavLog.b.kAll : com.tencent.liteav.base.util.LiteavLog.b.kNone : com.tencent.liteav.base.util.LiteavLog.b.kFatal : com.tencent.liteav.base.util.LiteavLog.b.kError : com.tencent.liteav.base.util.LiteavLog.b.kWarning : com.tencent.liteav.base.util.LiteavLog.b.kInfo).mNativeValue);
    }

    public static void setPituLicencePath(java.lang.String str) {
    }

    public static void setUserId(java.lang.String str) {
        com.tencent.liteav.LiveSettingJni.setUserId(str);
    }

    public static int updateNetworkTime() {
        return com.tencent.liteav.base.util.CommonUtil.updateNetworkTime();
    }

    public java.lang.String getLicenceInfo(android.content.Context context) {
        com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
        com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
        return com.tencent.liteav.sdk.common.LicenseChecker.getInstance().getLicense(com.tencent.liteav.sdk.common.LicenseChecker.c.LIVE);
    }

    public void setLicence(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.ContextUtils.initApplicationContext(context.getApplicationContext());
        com.tencent.liteav.base.ContextUtils.setDataDirectorySuffix("liteav");
        com.tencent.liteav.sdk.common.LicenseChecker.getInstance().setListener(new com.tencent.liteav.sdk.common.LicenseChecker.b() { // from class: com.tencent.rtmp.TXLiveBase.1
            @Override // com.tencent.liteav.sdk.common.LicenseChecker.b
            public final void a(int i17, java.lang.String str3) {
                com.tencent.rtmp.TXLiveBaseListener tXLiveBaseListener = com.tencent.rtmp.TXLiveBase.sListener;
                if (tXLiveBaseListener != null) {
                    tXLiveBaseListener.onLicenceLoaded(i17, str3);
                }
            }
        });
        com.tencent.liteav.sdk.common.LicenseChecker.getInstance().setLicense(com.tencent.liteav.sdk.common.LicenseChecker.c.LIVE, str, str2);
    }
}
