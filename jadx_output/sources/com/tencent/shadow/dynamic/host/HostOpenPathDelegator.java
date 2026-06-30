package com.tencent.shadow.dynamic.host;

/* loaded from: classes12.dex */
public class HostOpenPathDelegator {
    private static final com.tencent.shadow.core.common.Logger logger = com.tencent.shadow.core.common.LoggerFactory.getLogger("WVA.HostOpenPathDelegator");
    private static com.tencent.shadow.dynamic.host.IHostOpenedFdCallback mCallback;

    public static com.tencent.shadow.dynamic.host.IHostOpenedFdCallback getCallback() {
        return mCallback;
    }

    public static void setCallback(com.tencent.shadow.dynamic.host.IHostOpenedFdCallback iHostOpenedFdCallback) {
        mCallback = iHostOpenedFdCallback;
        logger.info("HostOpenPathDelegator setCallback:" + iHostOpenedFdCallback);
    }
}
