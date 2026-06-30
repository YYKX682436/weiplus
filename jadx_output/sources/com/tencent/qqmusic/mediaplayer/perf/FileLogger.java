package com.tencent.qqmusic.mediaplayer.perf;

/* loaded from: classes13.dex */
public class FileLogger {
    private static final java.lang.String TAG = "FileLogger";

    public static void write(java.lang.StringBuilder sb6, java.io.File file, boolean z17) {
        java.io.FileWriter fileWriter;
        java.io.FileWriter fileWriter2 = null;
        try {
            try {
                try {
                    fileWriter = new java.io.FileWriter(file, z17);
                } catch (java.io.IOException unused) {
                    return;
                }
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            fileWriter.write(sb6.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (java.io.IOException e18) {
            e = e18;
            fileWriter2 = fileWriter;
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[write] failed!", e);
            if (fileWriter2 != null) {
                fileWriter2.close();
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
    }
}
