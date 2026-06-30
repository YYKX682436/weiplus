package com.tencent.tav.decoder.muxer;

/* loaded from: classes10.dex */
public class DefaultMediaMuxer implements com.tencent.tav.decoder.muxer.IMediaMuxer {
    private android.media.MediaMuxer muxer;
    private final java.lang.String TAG = "DefaultMediaMuxer";
    private boolean isStarted = false;
    private int videoTrackIndex = -1;
    private int audioTrackIndex = -1;

    public DefaultMediaMuxer(java.lang.String str, int i17) {
        this.muxer = new android.media.MediaMuxer(str, i17);
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public int addTrack(android.media.MediaFormat mediaFormat) {
        int addTrack = this.muxer.addTrack(mediaFormat);
        if (mediaFormat.containsKey("mime")) {
            java.lang.String string = mediaFormat.getString("mime");
            com.tencent.tav.decoder.logger.Logger.i("DefaultMediaMuxer", "add track mime:" + string);
            if (string.contains("video")) {
                this.videoTrackIndex = addTrack;
            } else if (string.contains("audio")) {
                this.audioTrackIndex = addTrack;
            }
        }
        return addTrack;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public int audioTrackIndex() {
        return this.audioTrackIndex;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void clearResource() {
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public com.tencent.tav.core.ExportConfig getExportConfig() {
        return null;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public boolean ignoreHeader() {
        return true;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public boolean isMuxerStarted() {
        return this.isStarted;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void prepareParallelSegmentInfo(int i17, com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void release() {
        this.muxer.release();
        this.isStarted = false;
        com.tencent.tav.decoder.logger.Logger.i("DefaultMediaMuxer", "release muxer");
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void setExportConfig(com.tencent.tav.core.ExportConfig exportConfig) {
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void start() {
        this.muxer.start();
        this.isStarted = true;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public boolean stop(boolean z17) {
        this.muxer.stop();
        this.isStarted = false;
        com.tencent.tav.decoder.logger.Logger.i("DefaultMediaMuxer", "stop muxer");
        return true;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public int videoTrackIndex() {
        return this.videoTrackIndex;
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void writeSampleData(int i17, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        this.muxer.writeSampleData(i17, byteBuffer, bufferInfo);
    }

    @Override // com.tencent.tav.decoder.muxer.IMediaMuxer
    public void writeSampleDataTime(boolean z17, com.tencent.tav.coremedia.CMTime cMTime) {
    }
}
