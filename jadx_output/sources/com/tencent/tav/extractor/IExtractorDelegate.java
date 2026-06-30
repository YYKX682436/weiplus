package com.tencent.tav.extractor;

/* loaded from: classes16.dex */
public interface IExtractorDelegate {
    boolean advance();

    long getSampleTime();

    int getSampleTrackIndex();

    int getTrackCount();

    android.media.MediaFormat getTrackFormat(int i17);

    boolean needMirror();

    int readSampleData(java.nio.ByteBuffer byteBuffer, int i17);

    void release();

    void seekTo(long j17, int i17);

    void selectTrack(int i17);

    void setDataSource(java.lang.String str);

    void setIsSoft(boolean z17);

    void unselectTrack(int i17);
}
