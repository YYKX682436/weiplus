package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public final class FdCrashHandlerGuest {
    private static final com.tencent.shadow.core.common.Logger logger = com.tencent.shadow.core.common.LoggerFactory.getLogger("WVA.FdCrashHandlerGuest");
    private static com.tencent.shadow.dynamic.host.FdCrashHandlerCallback mCallback;

    public static com.tencent.shadow.dynamic.host.FdCrashHandlerCallback getCallback() {
        logger.info("initCrashHandlerByFd getCallback:" + mCallback);
        return mCallback;
    }

    public static void setCallback(com.tencent.shadow.dynamic.host.FdCrashHandlerCallback fdCrashHandlerCallback) {
        logger.info("initCrashHandlerByFd setCallback:" + fdCrashHandlerCallback);
        mCallback = fdCrashHandlerCallback;
    }
}
