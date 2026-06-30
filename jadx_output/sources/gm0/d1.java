package gm0;

/* loaded from: classes7.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.io.File f273177a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.io.File f273178b;

    static {
        java.io.File file = new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "file-disappeared-logs");
        f273177a = file;
        java.io.File file2 = new java.io.File(file, android.text.format.DateFormat.format("yyyy-MM-dd", new java.util.Date()).toString());
        f273178b = file2;
        com.tencent.mars.xlog.Log.w("MicroMsg.FileDisappearedObserver", "FileDisappearedLogging %s", file2.getAbsoluteFile());
        try {
            if (file.isDirectory() && file.listFiles().length > 3) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                for (java.io.File file3 : file.listFiles()) {
                    if (file3.isFile()) {
                        if (currentTimeMillis >= file3.lastModified()) {
                            if (currentTimeMillis - file3.lastModified() >= 259200000) {
                                file3.delete();
                            }
                        } else if (currentTimeMillis < file3.lastModified() && file3.lastModified() - currentTimeMillis >= 259200000) {
                            file3.delete();
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th6, "", new java.lang.Object[0]);
        }
    }

    public static void a() {
        java.io.InputStreamReader inputStreamReader;
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th6;
        java.io.FileInputStream fileInputStream;
        try {
            java.io.File file = f273177a;
            if (file.isDirectory()) {
                long j17 = 0;
                java.io.File file2 = null;
                for (java.io.File file3 : file.listFiles()) {
                    if (file3.isFile() && file3.lastModified() > j17) {
                        j17 = file3.lastModified();
                        file2 = file3;
                    }
                }
                if (file2 == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.FileDisappearedObserver", "Print content of file %s", file2.getAbsolutePath());
                try {
                    fileInputStream = new java.io.FileInputStream(file2);
                    try {
                        inputStreamReader = new java.io.InputStreamReader(fileInputStream);
                        try {
                            bufferedReader = new java.io.BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    java.lang.String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    } else {
                                        com.tencent.mars.xlog.Log.w("MicroMsg.FileDisappearedObserver", readLine);
                                    }
                                } catch (java.lang.Throwable th7) {
                                    th6 = th7;
                                    try {
                                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th6, th6.getMessage(), new java.lang.Object[0]);
                                        com.tencent.mm.sdk.platformtools.t8.v1(fileInputStream);
                                        com.tencent.mm.sdk.platformtools.t8.v1(inputStreamReader);
                                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
                                    } catch (java.lang.Throwable th8) {
                                        com.tencent.mm.sdk.platformtools.t8.v1(fileInputStream);
                                        com.tencent.mm.sdk.platformtools.t8.v1(inputStreamReader);
                                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
                                        throw th8;
                                    }
                                }
                            }
                            com.tencent.mm.sdk.platformtools.t8.v1(fileInputStream);
                            com.tencent.mm.sdk.platformtools.t8.v1(inputStreamReader);
                        } catch (java.lang.Throwable th9) {
                            bufferedReader = null;
                            th6 = th9;
                        }
                    } catch (java.lang.Throwable th10) {
                        bufferedReader = null;
                        th6 = th10;
                        inputStreamReader = null;
                    }
                } catch (java.lang.Throwable th11) {
                    inputStreamReader = null;
                    bufferedReader = null;
                    th6 = th11;
                    fileInputStream = null;
                }
                com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
            }
        } catch (java.lang.Throwable th12) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th12, "", new java.lang.Object[0]);
        }
    }
}
