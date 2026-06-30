package com.tenpay.ndk;

/* loaded from: classes9.dex */
public class FitNativeEvent {
    private static com.tenpay.ndk.FitNativeEvent.Logger eventLogger;

    /* loaded from: classes9.dex */
    public interface Logger {
        void onLog(int i17, java.lang.String str);
    }

    private FitNativeEvent() {
    }

    public static com.tenpay.ndk.FitNativeEvent.Logger getListener() {
        return eventLogger;
    }

    private static void onNativeEvent(int i17, java.lang.String str) {
        com.tenpay.ndk.FitNativeEvent.Logger logger = eventLogger;
        if (logger != null) {
            logger.onLog(i17, str);
        }
    }

    public static void setListener(com.tenpay.ndk.FitNativeEvent.Logger logger) {
        eventLogger = logger;
    }
}
