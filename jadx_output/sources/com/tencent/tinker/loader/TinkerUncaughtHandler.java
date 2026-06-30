package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public class TinkerUncaughtHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private static final java.lang.String TAG = "Tinker.UncaughtHandler";
    private final android.content.Context context;
    private final java.io.File crashFile;
    private final java.lang.Thread.UncaughtExceptionHandler ueh = java.lang.Thread.getDefaultUncaughtExceptionHandler();

    public TinkerUncaughtHandler(android.content.Context context) {
        this.context = context;
        this.crashFile = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchLastCrashFile(context);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        java.io.PrintWriter printWriter;
        java.lang.Throwable th7;
        java.io.IOException e17;
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "TinkerUncaughtHandler catch exception:" + android.util.Log.getStackTraceString(th6), new java.lang.Object[0]);
        this.ueh.uncaughtException(thread, th6);
        if (this.crashFile == null || !(java.lang.Thread.getDefaultUncaughtExceptionHandler() instanceof com.tencent.tinker.loader.TinkerUncaughtHandler)) {
            return;
        }
        java.io.File parentFile = this.crashFile.getParentFile();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "print crash file error: create directory fail!", new java.lang.Object[0]);
            return;
        }
        try {
            printWriter = new java.io.PrintWriter(new java.io.FileWriter(this.crashFile, false));
            try {
                try {
                    printWriter.println("process:" + com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getProcessName(this.context));
                    printWriter.println(com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getExceptionCauseString(th6));
                } catch (java.io.IOException e18) {
                    e17 = e18;
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "print crash file error:" + android.util.Log.getStackTraceString(e17), new java.lang.Object[0]);
                    com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(printWriter);
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
            } catch (java.lang.Throwable th8) {
                th7 = th8;
                com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(printWriter);
                throw th7;
            }
        } catch (java.io.IOException e19) {
            printWriter = null;
            e17 = e19;
        } catch (java.lang.Throwable th9) {
            printWriter = null;
            th7 = th9;
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(printWriter);
            throw th7;
        }
        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(printWriter);
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
