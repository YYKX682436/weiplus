package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class FileDataSource implements com.tencent.qqmusic.mediaplayer.upstream.IDataSource {
    private long currentPosition;
    private java.io.RandomAccessFile file;
    private java.io.FileInputStream fileInputStream;
    private final java.lang.String filePath;
    private boolean opened = false;
    private java.io.BufferedInputStream readingStream;

    public FileDataSource(java.lang.String str) {
        this.filePath = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.opened) {
            java.io.FileInputStream fileInputStream = this.fileInputStream;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            java.io.BufferedInputStream bufferedInputStream = this.readingStream;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            java.io.RandomAccessFile randomAccessFile = this.file;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.opened = false;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        return com.tencent.qqmusic.mediaplayer.AudioRecognition.recognitionAudioFormatExactly(this.filePath);
    }

    public java.lang.String getFilePath() {
        return this.filePath;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public long getSize() {
        return this.file.length();
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public void open() {
        if (this.opened) {
            return;
        }
        this.opened = true;
        this.file = new java.io.RandomAccessFile(this.filePath, "r");
        this.fileInputStream = new java.io.FileInputStream(this.file.getFD());
        this.readingStream = new java.io.BufferedInputStream(this.fileInputStream);
        this.currentPosition = 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        long skipForBufferStream;
        long j18 = this.currentPosition;
        if (j18 != j17) {
            if (j18 > j17) {
                this.file.seek(j17);
                this.readingStream = new java.io.BufferedInputStream(this.fileInputStream);
                skipForBufferStream = j17;
            } else {
                skipForBufferStream = j18 + com.tencent.qqmusic.mediaplayer.util.StreamUtils.skipForBufferStream(this.readingStream, j17 - j18);
            }
            if (skipForBufferStream != j17) {
                return -1;
            }
            this.currentPosition = j17;
        }
        int read = this.readingStream.read(bArr, i17, i18);
        if (read >= 0) {
            this.currentPosition += read;
        }
        return read;
    }

    public java.lang.String toString() {
        return "(fd)" + this.filePath;
    }
}
