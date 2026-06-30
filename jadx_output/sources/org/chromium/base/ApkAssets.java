package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes7.dex */
public class ApkAssets {
    private static final java.lang.String TAG = "ApkAssets";
    private static java.lang.String sLastError;

    public static long[] open(java.lang.String str, java.lang.String str2) {
        android.content.res.AssetFileDescriptor assetFileDescriptor = null;
        sLastError = null;
        try {
            try {
                android.content.Context applicationContext = org.chromium.base.ContextUtils.getApplicationContext();
                if (!android.text.TextUtils.isEmpty(str2) && org.chromium.base.BundleUtils.isIsolatedSplitInstalled(str2)) {
                    applicationContext = org.chromium.base.BundleUtils.createIsolatedSplitContext(applicationContext, str2);
                }
                assetFileDescriptor = applicationContext.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                try {
                    assetFileDescriptor.close();
                } catch (java.io.IOException e17) {
                    org.chromium.base.Log.e(TAG, "Unable to close AssetFileDescriptor", (java.lang.Throwable) e17);
                }
                return jArr;
            } catch (java.lang.Throwable th6) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (java.io.IOException e18) {
                        org.chromium.base.Log.e(TAG, "Unable to close AssetFileDescriptor", (java.lang.Throwable) e18);
                    }
                }
                throw th6;
            }
        } catch (java.io.IOException e19) {
            sLastError = "Error while loading asset " + str + " from " + str2 + ": " + e19;
            if (!e19.getMessage().equals("") && !e19.getMessage().equals(str)) {
                org.chromium.base.Log.e(TAG, sLastError);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (java.io.IOException e27) {
                    org.chromium.base.Log.e(TAG, "Unable to close AssetFileDescriptor", (java.lang.Throwable) e27);
                }
            }
            return jArr2;
        }
    }

    private static java.lang.String takeLastErrorString() {
        java.lang.String str = sLastError;
        sLastError = null;
        return str;
    }
}
