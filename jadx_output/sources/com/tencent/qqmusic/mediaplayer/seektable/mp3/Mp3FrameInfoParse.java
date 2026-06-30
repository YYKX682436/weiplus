package com.tencent.qqmusic.mediaplayer.seektable.mp3;

/* loaded from: classes16.dex */
class Mp3FrameInfoParse {
    private static final int DECODE_ERROR_IO_READ = -3;
    private static final int DECODE_ERROR_MEMORY_ALLOC = -2;
    private static final int DECODE_ERROR_SUCCESS = 0;
    private static final int DECODE_FAIL = -1;
    private static final java.lang.String TAG = "Mp3FrameInfoParse";
    public static final int VBR_TYPE_CBR = 0;
    public static final int VBR_TYPE_VBRI = 1;
    public static final int VBR_TYPE_XING = 2;
    private static final int[][][] BitrateTable = {new int[][]{new int[]{0, 32, 64, 96, 128, 160, 192, 224, 256, 288, com.tencent.mapsdk.internal.km.f50100e, com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX, 384, com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, com.tencent.wcdb.FileUtils.S_IRWXU}, new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.tencent.mapsdk.internal.km.f50100e, 384}, new int[]{0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.tencent.mapsdk.internal.km.f50100e}}, new int[][]{new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}}};
    private static final int[][] SAMPLE_RATE_TABLE = {new int[]{11025, 12000, 8000}, new int[]{0, 0, 0}, new int[]{22050, 24000, 16000}, new int[]{44100, 48000, 32000}};
    private static final int[][] SAMPLE_PER_FRAME = {new int[]{384, dc1.e.CTRL_INDEX, dc1.e.CTRL_INDEX}, new int[]{384, dc1.e.CTRL_INDEX, 576}, new int[]{384, dc1.e.CTRL_INDEX, 576}};

    /* loaded from: classes16.dex */
    public static class Mp3Info {
        int channels = 0;
        int bit_rate = 0;
        long sample_rate = 0;
        long duration = 0;
        int isVbr = 0;
        int idv2Size = 0;
        long firstFramePosition = 0;
        long firstFrameSize = 0;
        int mpeg_version = 0;
        int layer = 0;
        long lengthInFrames = 0;
        long fileLengthInBytes = 0;
        long[] toc_table = null;
        int flag_value = 0;
        int VBRType = 0;
        int entry_count = 0;
        int entry_size = 0;
        int scale_factor = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean IsMp3Header(com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource r21, byte[] r22, int r23, int r24, com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info r25) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.IsMp3Header(com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource, byte[], int, int, com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse$Mp3Info):boolean");
    }

    public static int parseFrameInfo(com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource trackPositionDataSource, com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mp3Info) {
        int i17;
        int i18 = -1;
        if (trackPositionDataSource == null) {
            return -1;
        }
        byte[] bArr = new byte[1024];
        if (trackPositionDataSource.read(bArr, 1024) < 1024) {
            return -2;
        }
        long j17 = 0;
        if (com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.hasId3v2(bArr, 4)) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "hasId3v2");
            skipId3v2(trackPositionDataSource, bArr, mp3Info);
        } else {
            trackPositionDataSource.seek(0L);
        }
        long size = trackPositionDataSource.getSize();
        long j18 = mp3Info.idv2Size;
        if (j18 > 0 && size > j18) {
            size -= j18;
        }
        int i19 = 0;
        while (true) {
            long curPosition = trackPositionDataSource.getCurPosition();
            if (j18 > 0) {
                curPosition -= j18;
            }
            if (curPosition >= size / 10) {
                return -3;
            }
            if (i19 >= 3) {
                i17 = i19;
                if (trackPositionDataSource.seek(trackPositionDataSource.getCurPosition() - 3) < j17) {
                    return -3;
                }
            } else {
                i17 = i19;
            }
            int read = trackPositionDataSource.read(bArr, 1024);
            if (read == i18) {
                mp3Info.firstFramePosition = -1L;
                return -3;
            }
            i19 = i17 + read;
            for (int i27 = 0; i27 + 4 <= read; i27++) {
                if (255 == (bArr[i27] & 255) && 224 == (bArr[i27 + 1] & 224) && IsMp3Header(trackPositionDataSource, bArr, 1024, i27, mp3Info)) {
                    mp3Info.firstFramePosition = ((mp3Info.idv2Size + i19) - read) + i27;
                    com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "FirstFramePos = " + mp3Info.firstFramePosition);
                    if (trackPositionDataSource.seek(mp3Info.firstFramePosition) < 0) {
                        return -1;
                    }
                    return (trackPositionDataSource.seek(0L) < 0 || !parseVBRFrameInfo(trackPositionDataSource, mp3Info)) ? -1 : 0;
                }
                j17 = 0;
            }
            i18 = -1;
        }
    }

    private static boolean parseVBRFrameInfo(com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource trackPositionDataSource, com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mp3Info) {
        if (trackPositionDataSource == null || mp3Info == null) {
            return false;
        }
        long j17 = mp3Info.sample_rate;
        int i17 = mp3Info.channels;
        byte[] bArr = new byte[1024];
        long j18 = 21;
        if (mp3Info.mpeg_version == 0) {
            if (i17 != 1) {
                j18 = 36;
            }
        } else if (i17 == 1) {
            j18 = 13;
        }
        if (trackPositionDataSource.seek(trackPositionDataSource.getCurPosition() + j18) < 0 || trackPositionDataSource.read(bArr, 1024) < 1024) {
            return false;
        }
        if (com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.isXingVBRheader(bArr, 4)) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "is Xing VBR");
            mp3Info.VBRType = 2;
            mp3Info.isVbr = 1;
            parseXingInfo(bArr, j17, mp3Info);
            return true;
        }
        if (trackPositionDataSource.seek(trackPositionDataSource.getCurPosition() - (j18 + 1024)) < 0 || trackPositionDataSource.seek(trackPositionDataSource.getCurPosition() + 36) < 0 || trackPositionDataSource.read(bArr, 1024) < 1024) {
            return false;
        }
        if (com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.isVBRIVBRHeader(bArr, 4)) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "is VBRI VBR");
            mp3Info.VBRType = 1;
            mp3Info.isVbr = 1;
            parseVBRIInfo(mp3Info, bArr, j17);
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "is CBR");
            mp3Info.VBRType = 0;
            long size = trackPositionDataSource.getSize();
            if (mp3Info.fileLengthInBytes <= 0) {
                mp3Info.fileLengthInBytes = size;
            }
            mp3Info.duration = (((float) (mp3Info.fileLengthInBytes - mp3Info.idv2Size)) * 8.0f) / mp3Info.bit_rate;
        }
        return true;
    }

    private static void parseVBRIInfo(com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mp3Info, byte[] bArr, long j17) {
        int i17;
        long[] jArr;
        int readUnsignedInt24;
        if (bArr == null || mp3Info == null) {
            return;
        }
        long readLong = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readLong(bArr, 10, 4);
        mp3Info.fileLengthInBytes = readLong;
        long readLong2 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readLong(bArr, 14, 4);
        if (readLong2 > 0 && j17 > 0) {
            int i18 = mp3Info.mpeg_version;
            int i19 = mp3Info.layer - 1;
            mp3Info.lengthInFrames = readLong2;
            mp3Info.duration = (long) ((((readLong2 * SAMPLE_PER_FRAME[i18][i19]) * 1.0d) / j17) * 1000.0d);
        }
        int readShort = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readShort(bArr, 18, 2);
        int readShort2 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readShort(bArr, 20, 2);
        int readShort3 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readShort(bArr, 22, 2);
        if (readShort <= 0 || readShort2 <= 0) {
            return;
        }
        int i27 = readShort + 1;
        long[] jArr2 = new long[i27];
        long j18 = mp3Info.firstFramePosition;
        int i28 = j18 > 0 ? (int) (0 + j18) : 0;
        long j19 = mp3Info.firstFrameSize;
        if (j19 > 0) {
            i28 = (int) (i28 + j19);
        }
        int i29 = 24;
        int i37 = 1;
        while (true) {
            if (i37 >= i27) {
                break;
            }
            if (readShort3 == 1) {
                int readByte = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readByte(bArr, i29, 1);
                i29++;
                jArr = jArr2;
                i17 = readByte;
            } else {
                if (readShort3 == 2) {
                    readUnsignedInt24 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readShort(bArr, i29, 2);
                    i29 += 2;
                } else if (readShort3 == 3) {
                    readUnsignedInt24 = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readUnsignedInt24(bArr, i29, 3);
                    i29 += 3;
                } else if (readShort3 == 4) {
                    int readInt = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readInt(bArr, i29, 4);
                    i29 += 4;
                    jArr = jArr2;
                    i17 = readInt;
                } else {
                    i17 = -1;
                    jArr = null;
                }
                jArr = jArr2;
                i17 = readUnsignedInt24;
            }
            if (i17 < 0) {
                jArr2 = jArr;
                break;
            }
            i28 += i17 * readShort2;
            if (i28 >= readLong) {
                i28 = (int) readLong;
            }
            jArr[i37] = i28;
            i37++;
            jArr2 = jArr;
        }
        mp3Info.entry_count = readShort;
        mp3Info.entry_size = readShort3;
        mp3Info.scale_factor = readShort2;
        mp3Info.toc_table = jArr2;
    }

    private static void parseXingInfo(byte[] bArr, long j17, com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mp3Info) {
        long[] jArr;
        if (bArr == null || mp3Info == null) {
            return;
        }
        int readInt = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readInt(bArr, 4, 4);
        int i17 = 8;
        if ((readInt & 1) == 1) {
            long readLong = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readLong(bArr, 8, 4) - 1;
            if (readLong > 0 && j17 > 0) {
                int i18 = mp3Info.mpeg_version;
                int i19 = mp3Info.layer - 1;
                mp3Info.lengthInFrames = readLong;
                mp3Info.duration = (long) ((((readLong * SAMPLE_PER_FRAME[i18][i19]) * 1.0d) / j17) * 1000.0d);
            }
            i17 = 12;
        }
        if ((readInt & 2) == 2) {
            mp3Info.fileLengthInBytes = com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase.readLong(bArr, i17, 4);
            i17 += 4;
        }
        if ((readInt & 4) == 4) {
            jArr = new long[100];
            for (int i27 = 0; i27 < 100; i27++) {
                jArr[i27] = bArr[i27 + i17] & 255;
            }
        } else {
            jArr = null;
        }
        if (readInt <= 0 || jArr == null) {
            return;
        }
        mp3Info.toc_table = jArr;
        mp3Info.flag_value = readInt;
    }

    private static void skipId3v2(com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource trackPositionDataSource, byte[] bArr, com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse.Mp3Info mp3Info) {
        int i17;
        boolean z17;
        if (trackPositionDataSource != null && bArr != null && bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            int i18 = ((bArr[6] & Byte.MAX_VALUE) << 21) + ((bArr[7] & Byte.MAX_VALUE) << 14) + ((bArr[8] & Byte.MAX_VALUE) << 7) + (bArr[9] & Byte.MAX_VALUE);
            if ((bArr[5] & com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) != 0) {
                i17 = i18 + 20;
                z17 = true;
            } else {
                i17 = i18 + 10;
                z17 = false;
            }
            if (trackPositionDataSource.seek(i17) < 0) {
                return;
            }
            if (!z17) {
                byte[] bArr2 = new byte[1];
                int read = trackPositionDataSource.read(bArr2, 1);
                while (bArr2[0] == 0 && read == 1) {
                    i17++;
                    read = trackPositionDataSource.read(bArr2, 1);
                }
            }
            mp3Info.idv2Size = i17;
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "id3V2 Size: " + mp3Info.idv2Size);
            trackPositionDataSource.seek((long) i17);
        }
    }
}
