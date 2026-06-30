package com.tencent.tav;

/* loaded from: classes14.dex */
public class ResourceLoadUtil {
    public static final java.lang.String TAG = "ResourceLoadUtil";
    private static boolean success;

    public static boolean isLoaded() {
        return success;
    }

    public static boolean loadSoSync(java.lang.String str) {
        boolean z17 = success;
        if (z17) {
            return z17;
        }
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                success = false;
                com.tencent.tav.decoder.logger.Logger.e(TAG, "load so path is empty.");
                return success;
            }
            try {
                try {
                    com.tencent.cso.CsoLoader.g(str);
                    success = true;
                    com.tencent.tav.decoder.logger.Logger.d(TAG, "load " + str + ": " + success);
                    return success;
                } catch (java.lang.UnsatisfiedLinkError e17) {
                    success = false;
                    java.lang.String str2 = TAG;
                    com.tencent.tav.decoder.logger.Logger.e(str2, "loadSoSync: load soPath = " + str, e17);
                    com.tencent.tav.decoder.logger.Logger.d(str2, "load " + str + ": " + success);
                    return success;
                }
            } catch (java.lang.RuntimeException e18) {
                success = false;
                java.lang.String str3 = TAG;
                com.tencent.tav.decoder.logger.Logger.e(str3, "loadSoSync: load soPath = " + str, e18);
                com.tencent.tav.decoder.logger.Logger.d(str3, "load " + str + ": " + success);
                return success;
            } catch (java.lang.Exception e19) {
                success = false;
                java.lang.String str4 = TAG;
                com.tencent.tav.decoder.logger.Logger.e(str4, "loadSoSync: load soPath = " + str, e19);
                com.tencent.tav.decoder.logger.Logger.d(str4, "load " + str + ": " + success);
                return success;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.tav.decoder.logger.Logger.d(TAG, "load " + str + ": " + success);
            return success;
        }
    }

    public static void setLoaded(boolean z17) {
        success = z17;
    }
}
