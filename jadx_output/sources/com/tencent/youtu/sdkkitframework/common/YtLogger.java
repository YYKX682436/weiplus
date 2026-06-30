package com.tencent.youtu.sdkkitframework.common;

/* loaded from: classes13.dex */
public final class YtLogger {
    public static final int DEBUG_LEVEL = 4;
    public static final int ERROR_LEVEL = 0;
    public static final int INFO_LEVEL = 2;
    public static final int VERB_LEVEL = 5;
    public static final int WARN_LEVEL = 1;
    private static com.tencent.youtu.sdkkitframework.common.YtLogger.IYtLoggerListener loggerListener;
    private static boolean needLogFile;
    private static java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS");
    private static java.lang.String localLogName = "youtu_log";
    private static java.io.File localFile = null;
    private static int currentLogLevel = 0;
    private static java.lang.String keywords = "default";
    private static java.util.concurrent.ExecutorService mExecutorService = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* loaded from: classes13.dex */
    public interface IYtLoggerListener {
        void log(java.lang.String str, java.lang.String str2);
    }

    public static void d(java.lang.String str, java.lang.Object obj) {
        if (currentLogLevel >= 4) {
            showLog(4, str, "[YoutuLog]-[DEBUG]-" + obj);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (currentLogLevel >= 0) {
            showLog(0, str, "[YoutuLog]-[ERROR]-" + str2);
        }
    }

    private static java.io.File getCustomLogFile(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        java.io.File file2 = new java.io.File(file.getPath() + java.io.File.separator + (dateFormat.format(new java.util.Date()) + ".log"));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (java.lang.Exception unused) {
            }
        }
        return file2;
    }

    private static java.io.File getLogFile(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(android.os.Environment.getExternalStorageDirectory());
        java.lang.String str2 = java.io.File.separator;
        sb6.append(str2);
        sb6.append("youtulog");
        sb6.append(str2);
        sb6.append(str);
        java.io.File file = new java.io.File(sb6.toString());
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        java.io.File file2 = new java.io.File(file.getPath() + str2 + (dateFormat.format(new java.util.Date()) + ".log"));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (java.lang.Exception unused) {
            }
        }
        return file2;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (currentLogLevel >= 2) {
            showLog(2, str, "[YoutuLog]-[INFO]-" + str2);
        }
    }

    private static void save2File(java.lang.String str) {
        java.io.File file = localFile;
        if (file != null) {
            writeFile(file, str);
        }
    }

    public static void setLogLevel(int i17) {
        currentLogLevel = java.lang.Math.min(i17, java.lang.Math.max(i17, 0));
    }

    public static void setLoggerListener(com.tencent.youtu.sdkkitframework.common.YtLogger.IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public static void setNeedLogFile(boolean z17, java.lang.String str, java.lang.String str2) {
        needLogFile = z17;
        keywords = str2;
        if (z17) {
            localLogName = str;
            localFile = getCustomLogFile(str);
        }
    }

    private static void showLog(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.youtu.sdkkitframework.common.YtLogger.IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
    }

    public static void v(java.lang.String str, java.lang.Object obj) {
        if (currentLogLevel >= 5) {
            showLog(5, str, "[YoutuLog]-[VERB]-" + obj);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        if (currentLogLevel >= 1) {
            showLog(1, str, "[YoutuLog]-[WARN]-" + str2);
        }
    }

    private static void writeFile(final java.io.File file, final java.lang.String str) {
        if (str.contains(keywords)) {
            mExecutorService.submit(new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.common.YtLogger.1
                @Override // java.lang.Runnable
                public void run() {
                    java.io.PrintWriter printWriter;
                    java.lang.Throwable th6;
                    java.io.PrintWriter printWriter2 = null;
                    try {
                        printWriter = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(file, true)));
                    } catch (java.lang.Exception unused) {
                    } catch (java.lang.Throwable th7) {
                        printWriter = null;
                        th6 = th7;
                    }
                    try {
                        printWriter.println(str);
                        printWriter.flush();
                        printWriter.close();
                    } catch (java.lang.Exception unused2) {
                        printWriter2 = printWriter;
                        if (printWriter2 != null) {
                            printWriter2.close();
                        }
                    } catch (java.lang.Throwable th8) {
                        th6 = th8;
                        if (printWriter != null) {
                            printWriter.close();
                        }
                        throw th6;
                    }
                }
            });
        }
    }

    public static void setNeedLogFile(boolean z17, java.lang.String str) {
        needLogFile = z17;
        if (z17) {
            localLogName = str;
            localFile = getLogFile(str);
        }
    }
}
