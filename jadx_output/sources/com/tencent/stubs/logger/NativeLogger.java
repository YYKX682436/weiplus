package com.tencent.stubs.logger;

/* loaded from: classes12.dex */
final class NativeLogger implements com.tencent.stubs.logger.Log.Logger {
    private static final com.tencent.stubs.logger.NativeLogger sInstance = new com.tencent.stubs.logger.NativeLogger();

    private static void setLogger(long j17) {
        com.tencent.stubs.logger.Log.sLoggerPtr = j17;
        com.tencent.stubs.logger.Log.sLogger = sInstance;
    }

    @Override // com.tencent.stubs.logger.Log.Logger
    public native boolean isLoggable(java.lang.String str, int i17);

    @Override // com.tencent.stubs.logger.Log.Logger
    public native void println(int i17, java.lang.String str, java.lang.String str2);
}
