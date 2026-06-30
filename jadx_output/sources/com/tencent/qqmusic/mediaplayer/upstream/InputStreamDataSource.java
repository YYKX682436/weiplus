package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes7.dex */
public class InputStreamDataSource implements com.tencent.qqmusic.mediaplayer.upstream.IDataSource {
    private long currentPosition;
    private java.io.InputStream currentStream;
    private final com.tencent.qqmusic.mediaplayer.upstream.InputStreamDataSource.InputStreamFactory factory;
    private long size;

    /* loaded from: classes7.dex */
    public interface InputStreamFactory {
        java.io.InputStream create();
    }

    public InputStreamDataSource(com.tencent.qqmusic.mediaplayer.upstream.InputStreamDataSource.InputStreamFactory inputStreamFactory) {
        this.factory = inputStreamFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.InputStream inputStream = this.currentStream;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        return com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector.getAudioFormat((com.tencent.qqmusic.mediaplayer.upstream.IDataSource) this, false);
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public long getSize() {
        return this.size;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public void open() {
        java.io.InputStream inputStream = this.currentStream;
        if (inputStream != null) {
            inputStream.close();
        }
        this.currentStream = this.factory.create();
        this.size = r0.available();
        this.currentPosition = 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        long j18 = this.currentPosition;
        if (j17 < j18) {
            open();
            return readAt(j17, bArr, i17, i18);
        }
        if (j17 > j18) {
            long j19 = j17 - j18;
            while (true) {
                long skip = this.currentStream.skip(j19);
                j19 -= skip;
                if (j19 <= 0 && skip > 0) {
                    break;
                }
            }
            if (j19 < 0) {
                throw new java.io.IOException("skipped too much bytes");
            }
            this.currentPosition = j17;
        }
        int read = this.currentStream.read(bArr, i17, i18);
        if (read > 0) {
            this.currentPosition += read;
        }
        return read;
    }
}
