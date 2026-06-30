package com.tencent.skyline.jni;

/* loaded from: classes7.dex */
public final class IOUtil {
    private static final java.lang.String TAG = "IOUtil";

    private IOUtil() {
    }

    public static java.lang.String convertStreamToString(java.io.InputStream inputStream) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream);
        char[] cArr = new char[16384];
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        while (true) {
            try {
                try {
                    int read = inputStreamReader.read(cArr);
                    if (-1 == read) {
                        qualityClose(inputStreamReader);
                        qualityClose(inputStream);
                        return stringWriter.toString();
                    }
                    stringWriter.write(cArr, 0, read);
                } catch (java.lang.Exception e17) {
                    java.lang.String.format("convertStreamToString: read, %s", e17.getMessage());
                    qualityClose(inputStreamReader);
                    qualityClose(inputStream);
                    return "";
                }
            } catch (java.lang.Throwable th6) {
                qualityClose(inputStreamReader);
                qualityClose(inputStream);
                throw th6;
            }
        }
    }

    public static java.lang.String getAssetAsString(android.content.Context context, java.lang.String str) {
        java.io.InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
        } catch (java.lang.Exception e17) {
            java.lang.String.format("openRead file( %s ) failed, exp = %s", str, e17);
            inputStream = null;
        }
        return inputStream == null ? "" : convertStreamToString(inputStream);
    }

    public static void qualityClose(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
