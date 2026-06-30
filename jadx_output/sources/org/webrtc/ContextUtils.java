package org.webrtc;

/* loaded from: classes13.dex */
public class ContextUtils {
    private static final java.lang.String TAG = "ContextUtils";
    private static android.content.Context applicationContext;

    @java.lang.Deprecated
    public static android.content.Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
        }
        applicationContext = context;
    }
}
