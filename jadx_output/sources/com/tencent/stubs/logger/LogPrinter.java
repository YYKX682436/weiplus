package com.tencent.stubs.logger;

/* loaded from: classes12.dex */
public class LogPrinter implements android.util.Printer {
    private final int mPriority;
    private final java.lang.String mTag;

    public LogPrinter(int i17, java.lang.String str) {
        this.mPriority = i17;
        this.mTag = str;
    }

    @Override // android.util.Printer
    public void println(java.lang.String str) {
        com.tencent.stubs.logger.Log.println(this.mPriority, this.mTag, str);
    }
}
