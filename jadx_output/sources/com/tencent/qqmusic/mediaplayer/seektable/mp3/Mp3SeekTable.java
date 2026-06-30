package com.tencent.qqmusic.mediaplayer.seektable.mp3;

/* loaded from: classes16.dex */
public class Mp3SeekTable implements com.tencent.qqmusic.mediaplayer.seektable.SeekTable {
    private final com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mInfo = new com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info();

    private static long timeToBytePositionInCbr(com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mp3Info, long j17) {
        int i17;
        if (mp3Info == null || (i17 = mp3Info.bit_rate) <= 0 || j17 < 0) {
            return -1L;
        }
        long j18 = (i17 / 8) * j17;
        int i18 = mp3Info.idv2Size;
        return i18 > 0 ? j18 + i18 : j18;
    }

    private static long timeToBytePositionInVBRIVbr(com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mp3Info, long j17) {
        long[] jArr;
        if (mp3Info == null || (jArr = mp3Info.toc_table) == null) {
            return -1L;
        }
        long j18 = mp3Info.fileLengthInBytes;
        if (j18 <= 0) {
            return -1L;
        }
        long j19 = mp3Info.firstFramePosition;
        if (j19 < 0) {
            return -1L;
        }
        long j27 = mp3Info.duration;
        if (j27 <= 0 || j17 < 0) {
            return -1L;
        }
        int i17 = mp3Info.entry_count;
        int i18 = i17 + 1;
        int i19 = (int) (((j17 * 1.0d) / j27) * i18);
        if (i19 >= 0) {
            j19 = jArr[i19];
        }
        if (i19 < i17) {
            j18 = jArr[i19 + 1];
        }
        long j28 = (i19 * j27) / i18;
        return j19 + (j18 == j19 ? 0L : (long) ((((j18 - j19) * 1.0d) * (j17 - j28)) / ((((i19 + 1) * j27) / r14) - j28)));
    }

    private static long timeToBytePositionInXingVbr(com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mp3Info, long j17) {
        long[] jArr;
        if (mp3Info == null || (jArr = mp3Info.toc_table) == null) {
            return -1L;
        }
        long j18 = mp3Info.fileLengthInBytes;
        if (j18 <= 0) {
            return -1L;
        }
        long j19 = mp3Info.firstFramePosition;
        if (j19 < 0) {
            return -1L;
        }
        long j27 = mp3Info.duration;
        if (j27 < 0 || j17 < 0) {
            return -1L;
        }
        double d17 = (j17 * 100.0d) / j27;
        double d18 = 0.0d;
        if (d17 > 0.0d) {
            if (d17 >= 100.0d) {
                d18 = 256.0d;
            } else {
                int i17 = (int) d17;
                d18 = (i17 == 0 ? 0.0f : (float) jArr[i17]) + (((i17 < 99 ? (float) jArr[i17 + 1] : 256.0f) - r4) * (d17 - i17));
            }
        }
        long round = java.lang.Math.round(d18 * 0.00390625d * j18) + j19;
        long j28 = (j19 + j18) - 1;
        int i18 = mp3Info.idv2Size;
        if (i18 > 0) {
            j28 -= i18;
        }
        return round < j28 ? round : j28;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public void parse(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.parseFrameInfo(new com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource(iDataSource), this.mInfo);
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public long seek(long j17) {
        if (j17 < 0) {
            return -1L;
        }
        com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mp3Info = this.mInfo;
        int i17 = mp3Info.VBRType;
        if (i17 == 0) {
            return timeToBytePositionInCbr(mp3Info, j17);
        }
        if (i17 == 1) {
            return timeToBytePositionInVBRIVbr(mp3Info, j17);
        }
        if (i17 != 2) {
            return -1L;
        }
        return timeToBytePositionInXingVbr(mp3Info, j17);
    }
}
