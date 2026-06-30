package org.chromium.net.httpflags;

/* loaded from: classes13.dex */
public final class HttpFlagsLoader {
    static final java.lang.String FLAGS_FILE_DIR_NAME = "app_httpflags";
    static final java.lang.String FLAGS_FILE_NAME = "flags.binarypb";
    static final java.lang.String FLAGS_FILE_PROVIDER_INTENT_ACTION = "android.net.http.FLAGS_FILE_PROVIDER";
    private static final java.lang.String TAG = "HttpFlagsLoader";

    private HttpFlagsLoader() {
    }

    private static java.io.File getFlagsFileFromProvider(android.content.Context context, android.content.pm.ApplicationInfo applicationInfo) {
        return new java.io.File(new java.io.File(new java.io.File(applicationInfo.deviceProtectedDataDir), FLAGS_FILE_DIR_NAME), FLAGS_FILE_NAME);
    }

    private static android.content.pm.ApplicationInfo getProviderApplicationInfo(android.content.Context context) {
        android.content.pm.ResolveInfo resolveService = context.getPackageManager().resolveService(new android.content.Intent(FLAGS_FILE_PROVIDER_INTENT_ACTION), 1048576);
        if (resolveService != null) {
            return resolveService.serviceInfo.applicationInfo;
        }
        org.chromium.base.Log.w(TAG, "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
        return null;
    }

    public static org.chromium.net.httpflags.Flags load(android.content.Context context) {
        if (!org.chromium.net.impl.CronetManifest.shouldReadHttpFlags(context)) {
            org.chromium.base.Log.d(TAG, "Not loading HTTP flags because they are disabled in the manifest", new java.lang.Object[0]);
            return null;
        }
        try {
            android.content.pm.ApplicationInfo providerApplicationInfo = getProviderApplicationInfo(context);
            if (providerApplicationInfo == null) {
                return null;
            }
            org.chromium.base.Log.d(TAG, "Found application exporting HTTP flags: %s", providerApplicationInfo.packageName);
            java.io.File flagsFileFromProvider = getFlagsFileFromProvider(context, providerApplicationInfo);
            org.chromium.base.Log.d(TAG, "HTTP flags file path: %s", flagsFileFromProvider.getAbsolutePath());
            org.chromium.net.httpflags.Flags loadFlagsFile = loadFlagsFile(flagsFileFromProvider);
            if (loadFlagsFile == null) {
                return null;
            }
            org.chromium.base.Log.d(TAG, "Successfully loaded HTTP flags: %s", loadFlagsFile);
            return loadFlagsFile;
        } catch (java.lang.RuntimeException e17) {
            org.chromium.base.Log.e(TAG, "Unable to load HTTP flags file", (java.lang.Throwable) e17);
            return null;
        }
    }

    private static org.chromium.net.httpflags.Flags loadFlagsFile(java.io.File file) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                org.chromium.net.httpflags.Flags parseDelimitedFrom = org.chromium.net.httpflags.Flags.parseDelimitedFrom(fileInputStream);
                fileInputStream.close();
                return parseDelimitedFrom;
            } catch (java.lang.Throwable th6) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (java.io.FileNotFoundException unused) {
            org.chromium.base.Log.w(TAG, "HTTP flags file `%s` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.", file.getPath());
            return null;
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Unable to read HTTP flags file", e17);
        }
    }
}
