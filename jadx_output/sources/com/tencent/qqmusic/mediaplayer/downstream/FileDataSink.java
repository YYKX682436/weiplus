package com.tencent.qqmusic.mediaplayer.downstream;

/* loaded from: classes13.dex */
public class FileDataSink implements com.tencent.qqmusic.mediaplayer.downstream.IDataSink {
    private static final java.lang.String TAG = "FileDataSink";
    private final java.lang.String filePath;
    private java.io.RandomAccessFile randomAccessFile = null;
    private long currentPosition = 0;
    private boolean opened = false;

    public FileDataSink(java.lang.String str) {
        this.filePath = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.opened) {
            this.randomAccessFile.close();
            this.currentPosition = 0L;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.downstream.IDataSink
    public void open() {
        if (this.opened) {
            return;
        }
        this.randomAccessFile = new java.io.RandomAccessFile(this.filePath, "rw");
        this.currentPosition = 0L;
        this.opened = true;
    }

    @Override // com.tencent.qqmusic.mediaplayer.downstream.IDataSink
    public int write(long j17, byte[] bArr, int i17, int i18) {
        if (this.randomAccessFile == null) {
            return 0;
        }
        if (this.currentPosition != j17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "[write] seek to: " + j17);
            this.randomAccessFile.seek(j17);
            this.currentPosition = j17;
        }
        this.randomAccessFile.write(bArr, i17, i18);
        this.currentPosition += i18;
        return i18;
    }
}
