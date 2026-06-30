package org.chromium.base.memory;

/* loaded from: classes7.dex */
public final class JavaHeapDumpGenerator {
    private static final java.lang.String TAG = "JavaHprofGenerator";

    private JavaHeapDumpGenerator() {
    }

    public static boolean generateHprof(java.lang.String str) {
        try {
            android.os.Debug.dumpHprofData(str);
            return true;
        } catch (java.io.IOException e17) {
            org.chromium.base.Log.i(TAG, "Error writing to file " + str + ". Error: " + e17.getMessage());
            return false;
        }
    }
}
