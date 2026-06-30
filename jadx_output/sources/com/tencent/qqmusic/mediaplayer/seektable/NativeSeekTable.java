package com.tencent.qqmusic.mediaplayer.seektable;

/* loaded from: classes13.dex */
public class NativeSeekTable implements com.tencent.qqmusic.mediaplayer.seektable.SeekTable {
    private final com.tencent.qqmusic.mediaplayer.codec.BaseDecoder nativeDecoder;

    public NativeSeekTable(com.tencent.qqmusic.mediaplayer.codec.BaseDecoder baseDecoder) {
        this.nativeDecoder = baseDecoder;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public void parse(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public long seek(long j17) {
        return this.nativeDecoder.getBytePositionOfTime(j17);
    }
}
