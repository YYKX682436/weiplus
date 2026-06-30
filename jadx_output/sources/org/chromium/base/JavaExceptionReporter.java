package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
@org.chromium.build.annotations.MainDex
/* loaded from: classes13.dex */
public class JavaExceptionReporter implements java.lang.Thread.UncaughtExceptionHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final java.lang.Thread.UncaughtExceptionHandler mParent;

    /* loaded from: classes13.dex */
    public interface Natives {
        void reportJavaException(boolean z17, java.lang.Throwable th6);

        void reportJavaStackTrace(java.lang.String str);
    }

    private JavaExceptionReporter(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z17) {
        this.mParent = uncaughtExceptionHandler;
        this.mCrashAfterReport = z17;
    }

    private static void installHandler(boolean z17) {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new org.chromium.base.JavaExceptionReporter(java.lang.Thread.getDefaultUncaughtExceptionHandler(), z17));
    }

    public static void reportException(java.lang.Throwable th6) {
        org.chromium.base.JavaExceptionReporterJni.get().reportJavaException(false, th6);
    }

    public static void reportStackTrace(java.lang.String str) {
        org.chromium.base.JavaExceptionReporterJni.get().reportJavaStackTrace(org.chromium.base.PiiElider.sanitizeStacktrace(str));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        if (!this.mHandlingException) {
            this.mHandlingException = true;
            org.chromium.base.JavaExceptionReporterJni.get().reportJavaException(this.mCrashAfterReport, th6);
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mParent;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th6);
        }
    }
}
