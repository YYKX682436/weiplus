package com.tencent.shadow.dynamic.host;

/* loaded from: classes12.dex */
public class HostOpenPathDelegate {
    private static final com.tencent.shadow.core.common.Logger logger = com.tencent.shadow.core.common.LoggerFactory.getLogger("WVA.HostOpenPathDelegate");
    private static final java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> mHostFds = new java.util.HashMap();

    public static void addHostOpenPath(java.lang.String str, java.lang.String str2) {
        try {
            android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(new java.io.File(str2), 939524096);
            java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> map = mHostFds;
            if (map.containsKey(str)) {
                map.get(str).close();
            }
            map.put(str, open);
            logger.info("addHostOpenPath key:" + str + " path:" + str2);
        } catch (java.lang.Exception e17) {
            logger.error("addHostOpenPath error", (java.lang.Throwable) e17);
        }
    }

    public static java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> getHostOpenFdsMap() {
        return mHostFds;
    }
}
