package com.tencent.tav.report;

/* loaded from: classes13.dex */
public class AudioBufferPrintHelper {
    public static final boolean CLEAR_MODE = false;
    public static final boolean ENABLE = false;
    public static final java.lang.String SDCARD_TAVKIT_DEMO_INFO = "/sdcard/tavkit_demo/info/";
    private static final java.lang.String TAG = "DebugUtils";
    private long waitMs;
    private long startTimeMs = 0;
    private java.lang.String startName = "";
    private boolean enable = false;
    private int maxPrintCount = 0;
    private long startIndex = 0;
    private java.util.List<java.lang.String> list = new java.util.ArrayList();

    /* loaded from: classes13.dex */
    public static class Instance {
        private static com.tencent.tav.report.AudioBufferPrintHelper INSTANCE = new com.tencent.tav.report.AudioBufferPrintHelper();

        private Instance() {
        }
    }

    public static void clearFiles() {
    }

    public static java.nio.ByteBuffer clone(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        allocate.flip();
        return allocate;
    }

    public static java.io.File createNewFile(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        java.io.File file2 = new java.io.File(file, str2);
        try {
            file2.delete();
            if (file2.createNewFile()) {
                return file2;
            }
            file2.getAbsolutePath();
            return null;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private static void deleteAllFiles(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (java.io.File file2 : listFiles) {
            if (file2.isDirectory()) {
                deleteAllFiles(file2);
                file2.delete();
            } else if (file2.exists()) {
                deleteAllFiles(file2);
                file2.delete();
            }
        }
    }

    public static com.tencent.tav.report.AudioBufferPrintHelper getInstance() {
        return com.tencent.tav.report.AudioBufferPrintHelper.Instance.INSTANCE;
    }

    private void initFlag(int i17) {
        if (this.startTimeMs == 0) {
            this.startTimeMs = java.lang.System.currentTimeMillis();
            this.startName = new java.text.SimpleDateFormat("HHmmss").format(new java.util.Date(this.startTimeMs));
        }
        if (this.maxPrintCount == 0) {
            this.maxPrintCount = i17;
        }
    }

    public static void reset() {
        com.tencent.tav.report.AudioBufferPrintHelper unused = com.tencent.tav.report.AudioBufferPrintHelper.Instance.INSTANCE = new com.tencent.tav.report.AudioBufferPrintHelper();
    }

    public void printByteBuffer(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
    }

    public void startDelay(long j17) {
        startDelay(j17, 100);
    }

    public void startIgnoreBegin(int i17) {
        startIgnoreBegin(i17, 100);
    }

    public void printByteBuffer(java.lang.String str, java.nio.ShortBuffer shortBuffer) {
    }

    public void startDelay(long j17, int i17) {
        initFlag(i17);
        boolean z17 = java.lang.System.currentTimeMillis() >= this.startTimeMs + j17;
        this.enable = z17;
        if (z17) {
            int i18 = this.maxPrintCount;
            this.maxPrintCount = i18 - 1;
            if (i18 < 0) {
                this.enable = false;
            }
        }
    }

    public void startIgnoreBegin(int i17, int i18) {
        initFlag(i18);
        long j17 = this.startIndex;
        this.startIndex = 1 + j17;
        if (j17 > i17) {
            this.enable = true;
        }
        if (this.enable) {
            int i19 = this.maxPrintCount;
            this.maxPrintCount = i19 - 1;
            if (i19 < 0) {
                this.enable = false;
            }
        }
    }

    public void printByteBuffer(java.lang.String str, short[] sArr) {
    }

    public static java.nio.ShortBuffer clone(java.nio.ShortBuffer shortBuffer) {
        java.nio.ShortBuffer allocate = java.nio.ShortBuffer.allocate(shortBuffer.capacity());
        shortBuffer.rewind();
        allocate.put(shortBuffer);
        shortBuffer.rewind();
        allocate.flip();
        return allocate;
    }
}
