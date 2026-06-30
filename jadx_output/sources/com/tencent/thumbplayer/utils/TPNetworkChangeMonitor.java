package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPNetworkChangeMonitor extends android.content.BroadcastReceiver {
    private static final java.lang.String DETAIL_WIFI_NETTYPE = "wifi";
    public static final int NETSTATUS_INAVAILABLE = 1;
    public static final int NETSTATUS_MOBILE = 3;
    public static final int NETSTATUS_NONE = 0;
    public static final int NETSTATUS_WIFI = 2;
    public static final int NETWORK_SUBTYPE_2G = 2;
    public static final int NETWORK_SUBTYPE_3G = 3;
    public static final int NETWORK_SUBTYPE_4G = 4;
    public static final int NETWORK_SUBTYPE_UNKNOWN = 0;
    public static final int NETWORK_SUBTYPE_WIFI = 1;
    private static final java.lang.String TAG = "TPNetworkChangeMonitor";
    private static final java.lang.String UNKNOWN_STR = "unknown";
    private static int lastNetStatus = 0;
    private static java.lang.String mDetailNetworkType = "unknown";
    private static java.lang.String mLastDetailNetType;
    private static int mNetStatus;
    private static int mobileNetSubType;
    private java.util.ArrayList<com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener> mListeners;
    private android.os.HandlerThread mNetworkChangeInformThread;

    /* loaded from: classes13.dex */
    public static class InstanceHolder {
        private static com.tencent.thumbplayer.utils.TPNetworkChangeMonitor instance = new com.tencent.thumbplayer.utils.TPNetworkChangeMonitor();

        private InstanceHolder() {
        }
    }

    /* loaded from: classes13.dex */
    public interface OnNetStatusChangeListener {
        void onStatusChanged(int i17, int i18, int i19, int i27);
    }

    private void dumpNetworkInfo() {
        com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "-->updateNetStatus(), mNetStatus=" + mNetStatus + "[wifi: 2, mobile: 3], lastNetStatus=" + lastNetStatus + ", mDetailNetworkType=" + mDetailNetworkType + ", mobileNetSubType=" + mobileNetSubType + "[2G:2 3G:3 4G:4], currentDetailNetType=" + mDetailNetworkType + ", lastDetailNetType=" + mLastDetailNetType);
    }

    public static int getDetailNetSubType() {
        return mobileNetSubType;
    }

    private java.lang.String getDetailNetworkType(android.net.NetworkInfo networkInfo) {
        java.lang.String typeName = networkInfo != null ? networkInfo.getTypeName() : null;
        com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "getDetailNetworkType, typeName: " + typeName);
        if (typeName == null) {
            return "unknown";
        }
        java.lang.String str = "wifi";
        if (!typeName.toLowerCase(java.util.Locale.getDefault()).equals("wifi")) {
            java.lang.String extraInfo = networkInfo.getExtraInfo();
            java.lang.String lowerCase = extraInfo != null ? extraInfo.toLowerCase(java.util.Locale.getDefault()) : null;
            if (lowerCase == null) {
                return "unknown";
            }
            java.lang.String str2 = "cmwap";
            if (!lowerCase.startsWith("cmwap")) {
                str2 = "cmnet";
                if (!lowerCase.startsWith("cmnet") && !lowerCase.startsWith("epc.tmobile.com")) {
                    str2 = "uniwap";
                    if (!lowerCase.startsWith("uniwap")) {
                        str2 = "uninet";
                        if (!lowerCase.startsWith("uninet")) {
                            str2 = "wap";
                            if (!lowerCase.startsWith("wap")) {
                                str2 = "net";
                                if (!lowerCase.startsWith("net")) {
                                    str2 = "ctwap";
                                    if (!lowerCase.startsWith("ctwap")) {
                                        if (lowerCase.startsWith("ctnet")) {
                                            return "ctnet";
                                        }
                                        str = "3gwap";
                                        if (!lowerCase.startsWith("3gwap")) {
                                            str = "3gnet";
                                            if (!lowerCase.startsWith("3gnet")) {
                                                if (!lowerCase.startsWith("#777")) {
                                                    return "unknown";
                                                }
                                                java.lang.String defaultHost = android.net.Proxy.getDefaultHost();
                                                if (defaultHost == null || defaultHost.length() <= 0) {
                                                    str2 = "ctnet";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return str2;
        }
        return str;
    }

    public static com.tencent.thumbplayer.utils.TPNetworkChangeMonitor getInstance() {
        return com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.InstanceHolder.instance;
    }

    private static int getMobileNetworkSubType(android.net.NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 0;
        }
        switch (networkInfo.getSubtype()) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            default:
                return 3;
            case 13:
                return 4;
        }
    }

    public static int getNetworkStatus() {
        return mNetStatus;
    }

    public static java.lang.String getSimpleNetTypeDesc() {
        if (android.text.TextUtils.isEmpty(mDetailNetworkType)) {
            return "unknown";
        }
        if (android.text.TextUtils.equals(mDetailNetworkType, "wifi")) {
            return "wifi";
        }
        if ("unknown".equals(mDetailNetworkType)) {
            return "unknown";
        }
        int i17 = mobileNetSubType;
        return i17 == 2 ? "2G" : i17 == 3 ? "3G" : i17 == 4 ? "4G" : "unknown";
    }

    private static boolean isMainThread() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    public static boolean isMobileNetwork() {
        return mNetStatus == 3;
    }

    public static boolean isNetStatusInited() {
        return mNetStatus != 0;
    }

    private boolean isNetworkActive(android.net.NetworkInfo networkInfo) {
        return networkInfo != null && (networkInfo.isConnected() || networkInfo.isConnectedOrConnecting());
    }

    public static boolean isNetworkAvailable() {
        return mNetStatus != 1;
    }

    public static boolean isNetworkNoneStatus(int i17) {
        return i17 == 0;
    }

    private boolean isTheSameNet(android.net.NetworkInfo networkInfo, android.net.NetworkInfo networkInfo2) {
        return (networkInfo == null || networkInfo2 == null || (networkInfo != networkInfo2 && ((!networkInfo.isConnected() && !networkInfo.isConnectedOrConnecting()) || (!networkInfo2.isConnected() && !networkInfo2.isConnectedOrConnecting())))) ? false : true;
    }

    public static boolean isWifiNetwork() {
        return mNetStatus == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000c, B:10:0x001a, B:12:0x005e, B:13:0x0064, B:15:0x006a, B:17:0x007a), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void notifyIfNetChanged() {
        /*
            r6 = this;
            java.lang.String r0 = "onNetworkStatusChanged oldNetStatus: "
            java.lang.String r1 = "notifyIfNetChanged, isNetChanged: "
            monitor-enter(r6)
            int r2 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus     // Catch: java.lang.Throwable -> L84
            int r3 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.lastNetStatus     // Catch: java.lang.Throwable -> L84
            r4 = 0
            if (r2 != r3) goto L19
            java.lang.String r2 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mDetailNetworkType     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mLastDetailNetType     // Catch: java.lang.Throwable -> L84
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L17
            goto L19
        L17:
            r2 = r4
            goto L1a
        L19:
            r2 = 1
        L1a:
            java.lang.String r3 = "TPNetworkChangeMonitor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L84
            r5.append(r2)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = ",  mListeners:  "
            r5.append(r1)     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList<com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener> r1 = r6.mListeners     // Catch: java.lang.Throwable -> L84
            r5.append(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L84
            com.tencent.thumbplayer.utils.TPLogUtil.i(r3, r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "TPNetworkChangeMonitor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L84
            int r0 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.lastNetStatus     // Catch: java.lang.Throwable -> L84
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = ", netStatus: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            int r0 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus     // Catch: java.lang.Throwable -> L84
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = ", mobileNetSubType"
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            int r0 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mobileNetSubType     // Catch: java.lang.Throwable -> L84
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L84
            com.tencent.thumbplayer.utils.TPLogUtil.i(r1, r0)     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L82
            java.util.ArrayList<com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener> r0 = r6.mListeners     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L84
        L64:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L84
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener r1 = (com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener) r1     // Catch: java.lang.Throwable -> L84
            int r2 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.lastNetStatus     // Catch: java.lang.Throwable -> L84
            int r3 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus     // Catch: java.lang.Throwable -> L84
            int r5 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mobileNetSubType     // Catch: java.lang.Throwable -> L84
            r1.onStatusChanged(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L84
            goto L64
        L7a:
            int r0 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus     // Catch: java.lang.Throwable -> L84
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.lastNetStatus = r0     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mDetailNetworkType     // Catch: java.lang.Throwable -> L84
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mLastDetailNetType = r0     // Catch: java.lang.Throwable -> L84
        L82:
            monitor-exit(r6)
            return
        L84:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.notifyIfNetChanged():void");
    }

    private synchronized void registerReceiver(android.content.Context context, android.os.Handler handler) {
        if (context != null) {
            context.registerReceiver(this, new android.content.IntentFilter(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION), null, handler);
        }
    }

    private synchronized void unregisterReceiver(android.content.Context context) {
        if (context != null) {
            try {
                context.unregisterReceiver(this);
            } catch (java.lang.Exception unused) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "unregister receiver may throw illegal state exception ...");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:41:0x0002, B:4:0x000e, B:6:0x0020, B:8:0x0026, B:9:0x004b, B:14:0x0060, B:16:0x006a, B:17:0x0070, B:23:0x0054, B:24:0x005b, B:25:0x005e, B:26:0x0029, B:28:0x002f, B:29:0x0033, B:31:0x0036, B:33:0x003c, B:36:0x0045, B:38:0x0048), top: B:40:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:41:0x0002, B:4:0x000e, B:6:0x0020, B:8:0x0026, B:9:0x004b, B:14:0x0060, B:16:0x006a, B:17:0x0070, B:23:0x0054, B:24:0x005b, B:25:0x005e, B:26:0x0029, B:28:0x002f, B:29:0x0033, B:31:0x0036, B:33:0x003c, B:36:0x0045, B:38:0x0048), top: B:40:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateNetStatus(android.content.Context r8) {
        /*
            r7 = this;
            if (r8 == 0) goto Lb
            java.lang.String r0 = "connectivity"
            java.lang.Object r8 = r8.getSystemService(r0)     // Catch: java.lang.Exception -> L76
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8     // Catch: java.lang.Exception -> L76
            goto Lc
        Lb:
            r8 = 0
        Lc:
            if (r8 == 0) goto L76
            r0 = 0
            android.net.NetworkInfo r1 = r8.getNetworkInfo(r0)     // Catch: java.lang.Exception -> L76
            r2 = 1
            android.net.NetworkInfo r3 = r8.getNetworkInfo(r2)     // Catch: java.lang.Exception -> L76
            android.net.NetworkInfo r8 = r8.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L76
            r4 = 2
            r5 = 3
            if (r8 != 0) goto L36
            boolean r6 = r7.isNetworkActive(r1)     // Catch: java.lang.Exception -> L76
            if (r6 == 0) goto L29
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus = r5     // Catch: java.lang.Exception -> L76
            goto L4b
        L29:
            boolean r1 = r7.isNetworkActive(r3)     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L33
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus = r4     // Catch: java.lang.Exception -> L76
            r1 = r3
            goto L4b
        L33:
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus = r2     // Catch: java.lang.Exception -> L76
            goto L4a
        L36:
            boolean r3 = r7.isNetworkActive(r8)     // Catch: java.lang.Exception -> L76
            if (r3 == 0) goto L48
            boolean r1 = r7.isNetworkActive(r1)     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L44
            r1 = r5
            goto L45
        L44:
            r1 = r4
        L45:
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus = r1     // Catch: java.lang.Exception -> L76
            goto L4a
        L48:
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus = r2     // Catch: java.lang.Exception -> L76
        L4a:
            r1 = r8
        L4b:
            int r8 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus     // Catch: java.lang.Exception -> L76
            if (r8 == r2) goto L5e
            if (r8 == r4) goto L5b
            if (r8 == r5) goto L54
            goto L60
        L54:
            int r8 = getMobileNetworkSubType(r1)     // Catch: java.lang.Exception -> L76
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mobileNetSubType = r8     // Catch: java.lang.Exception -> L76
            goto L60
        L5b:
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mobileNetSubType = r2     // Catch: java.lang.Exception -> L76
            goto L60
        L5e:
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mobileNetSubType = r0     // Catch: java.lang.Exception -> L76
        L60:
            java.lang.String r8 = r7.getDetailNetworkType(r1)     // Catch: java.lang.Exception -> L76
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mDetailNetworkType = r8     // Catch: java.lang.Exception -> L76
            int r0 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.lastNetStatus     // Catch: java.lang.Exception -> L76
            if (r0 != 0) goto L70
            int r0 = com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mNetStatus     // Catch: java.lang.Exception -> L76
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.lastNetStatus = r0     // Catch: java.lang.Exception -> L76
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.mLastDetailNetType = r8     // Catch: java.lang.Exception -> L76
        L70:
            r7.dumpNetworkInfo()     // Catch: java.lang.Exception -> L76
            r7.notifyIfNetChanged()     // Catch: java.lang.Exception -> L76
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.updateNetStatus(android.content.Context):void");
    }

    public synchronized void addOnNetStatusChangeListener(com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener onNetStatusChangeListener) {
        java.util.ArrayList<com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener> arrayList = this.mListeners;
        if (arrayList != null && !arrayList.contains(onNetStatusChangeListener)) {
            this.mListeners.add(onNetStatusChangeListener);
            com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "add onNetStatus change listener: " + onNetStatusChangeListener + ", mListeners: " + this.mListeners.size());
        }
    }

    public synchronized void init(android.content.Context context) {
        com.tencent.thumbplayer.utils.TPCommonUtils.requireNotNull(context, "context can not be null!");
        if (this.mNetworkChangeInformThread == null) {
            this.mNetworkChangeInformThread = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainShareThread();
        }
        registerReceiver(context, new android.os.Handler(this.mNetworkChangeInformThread.getLooper()));
        updateNetStatus(context);
    }

    public boolean isCurrentUnicomWap() {
        return "3gwap".equals(mDetailNetworkType) || "uniwap".equals(mDetailNetworkType);
    }

    public boolean isNonUnicomMobileNetwork() {
        return "cmnet".equals(mDetailNetworkType) || "cmwap".equals(mDetailNetworkType) || "ctnet".equals(mDetailNetworkType) || "ctwap".equals(mDetailNetworkType);
    }

    public boolean isUnicomMobileNetwork() {
        return "3gnet".equals(mDetailNetworkType) || "cmnet".equals(mDetailNetworkType);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceive broadcast action and update net status,onReceive broadcast in ");
        sb6.append(isMainThread() ? com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM : "work");
        sb6.append(" thread.");
        com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, sb6.toString());
        updateNetStatus(context);
    }

    public synchronized void release(android.content.Context context) {
        com.tencent.thumbplayer.utils.TPCommonUtils.requireNotNull(context, "context can not be null!");
        unregisterReceiver(context);
        com.tencent.thumbplayer.utils.TPThreadPool.getInstance().recycle(this.mNetworkChangeInformThread, null);
        this.mNetworkChangeInformThread = null;
    }

    public synchronized void removeOnNetStatusChangeListener(com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener onNetStatusChangeListener) {
        java.util.ArrayList<com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(onNetStatusChangeListener);
            com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "remove netStatusChangeListener, listener: " + onNetStatusChangeListener + ", mListeners: " + this.mListeners.size());
        }
    }

    private TPNetworkChangeMonitor() {
        this.mListeners = null;
        this.mListeners = new java.util.ArrayList<>();
    }

    public static java.lang.String getDetailNetworkType() {
        return mDetailNetworkType;
    }
}
