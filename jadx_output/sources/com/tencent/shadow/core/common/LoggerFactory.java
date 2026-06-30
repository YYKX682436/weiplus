package com.tencent.shadow.core.common;

/* loaded from: classes16.dex */
public final class LoggerFactory {
    private static volatile com.tencent.shadow.core.common.ILoggerFactory sILoggerFactory;

    public static com.tencent.shadow.core.common.ILoggerFactory getILoggerFactory() {
        return sILoggerFactory;
    }

    public static com.tencent.shadow.core.common.Logger getLogger(java.lang.Class<?> cls) {
        return getILoggerFactory().getLogger(cls.getSimpleName());
    }

    public static long getNativeLogFunc() {
        return getILoggerFactory().getNativeLogFunc();
    }

    public static void init(boolean z17) {
        getILoggerFactory().init(z17);
    }

    public static void setILoggerFactory(com.tencent.shadow.core.common.ILoggerFactory iLoggerFactory) {
        sILoggerFactory = iLoggerFactory;
    }

    public static com.tencent.shadow.core.common.Logger getLogger(java.lang.String str) {
        return getILoggerFactory().getLogger(str);
    }
}
