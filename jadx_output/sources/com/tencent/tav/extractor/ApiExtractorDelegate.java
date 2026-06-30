package com.tencent.tav.extractor;

/* loaded from: classes10.dex */
public class ApiExtractorDelegate implements com.tencent.tav.extractor.IExtractorDelegate {
    private static final java.lang.String TAG = "ApiAssetExtractorDelegate";
    private boolean released = false;
    private android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public synchronized boolean advance() {
        if (!this.released) {
            this.mediaExtractor.advance();
        }
        return false;
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public synchronized long getSampleTime() {
        if (this.released) {
            return -1L;
        }
        return this.mediaExtractor.getSampleTime();
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public synchronized int getSampleTrackIndex() {
        if (this.released) {
            return -1;
        }
        return this.mediaExtractor.getSampleTrackIndex();
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public final synchronized int getTrackCount() {
        if (this.released) {
            return 0;
        }
        return this.mediaExtractor.getTrackCount();
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public synchronized android.media.MediaFormat getTrackFormat(int i17) {
        return this.mediaExtractor.getTrackFormat(i17);
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public boolean needMirror() {
        return true;
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public synchronized int readSampleData(java.nio.ByteBuffer byteBuffer, int i17) {
        if (this.released) {
            return -1;
        }
        return this.mediaExtractor.readSampleData(byteBuffer, i17);
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public final synchronized void release() {
        this.mediaExtractor.release();
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public synchronized void seekTo(long j17, int i17) {
        if (!this.released) {
            this.mediaExtractor.seekTo(j17, i17);
        }
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public synchronized void selectTrack(int i17) {
        if (!this.released) {
            this.mediaExtractor.selectTrack(i17);
        }
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public final synchronized void setDataSource(java.lang.String str) {
        try {
            this.mediaExtractor.setDataSource(str);
        } catch (java.io.IOException e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "setDataSource", e17);
        }
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public void setIsSoft(boolean z17) {
    }

    @Override // com.tencent.tav.extractor.IExtractorDelegate
    public synchronized void unselectTrack(int i17) {
        if (!this.released) {
            this.mediaExtractor.unselectTrack(i17);
        }
    }
}
