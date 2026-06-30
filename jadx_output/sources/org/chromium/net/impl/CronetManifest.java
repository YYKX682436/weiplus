package org.chromium.net.impl;

/* loaded from: classes13.dex */
public final class CronetManifest {
    static final java.lang.String ENABLE_TELEMETRY_META_DATA_KEY = "android.net.http.EnableTelemetry";
    static final java.lang.String META_DATA_HOLDER_SERVICE_NAME = "android.net.http.MetaDataHolder";
    public static final java.lang.String READ_HTTP_FLAGS_META_DATA_KEY = "android.net.http.EXPERIMENTAL_ReadHttpFlags";

    private CronetManifest() {
    }

    private static android.os.Bundle getMetaData(android.content.Context context) {
        android.content.pm.ServiceInfo serviceInfo;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, META_DATA_HOLDER_SERVICE_NAME), 787072);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        return serviceInfo != null ? serviceInfo.metaData : new android.os.Bundle();
    }

    public static boolean isAppOptedInForTelemetry(android.content.Context context, org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
        return getMetaData(context).getBoolean(ENABLE_TELEMETRY_META_DATA_KEY, cronetSource == org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM || cronetSource == org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES);
    }

    public static boolean shouldReadHttpFlags(android.content.Context context) {
        return getMetaData(context).getBoolean(READ_HTTP_FLAGS_META_DATA_KEY, false);
    }
}
