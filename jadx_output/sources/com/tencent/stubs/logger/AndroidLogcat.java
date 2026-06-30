package com.tencent.stubs.logger;

/* loaded from: classes12.dex */
final class AndroidLogcat implements com.tencent.stubs.logger.Log.Logger {
    @Override // com.tencent.stubs.logger.Log.Logger
    public boolean isLoggable(java.lang.String str, int i17) {
        return android.util.Log.isLoggable(str, i17);
    }

    @Override // com.tencent.stubs.logger.Log.Logger
    public void println(int i17, java.lang.String str, java.lang.String str2) {
        android.util.Log.println(i17, str, str2);
    }
}
