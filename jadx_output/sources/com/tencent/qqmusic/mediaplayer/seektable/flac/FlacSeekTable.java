package com.tencent.qqmusic.mediaplayer.seektable.flac;

/* loaded from: classes16.dex */
public class FlacSeekTable implements com.tencent.qqmusic.mediaplayer.seektable.SeekTable {
    private static final int SEEK_POINT_SIZE = 18;
    private static final byte TYPE_SEEKTABLE = 3;
    private static final byte TYPE_STREAMINFO = 0;
    private long firstFrameOffset;
    private long[] offsets;
    private long[] sampleNumbers;
    private int sampleRate;

    /* loaded from: classes16.dex */
    public interface BlockHandler {
        boolean handle(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, int i17);
    }

    /* loaded from: classes16.dex */
    public class SeektableHandler implements com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler {
        public SeektableHandler() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler
        public boolean handle(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, int i17) {
            if (i17 != 3) {
                return false;
            }
            byte[] bArr = new byte[3];
            parsable.readBytes(bArr, 0, 3);
            int from = com.tencent.qqmusic.mediaplayer.seektable.flac.BytesUtil.from(bArr) / 18;
            com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.this.sampleNumbers = new long[from];
            com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.this.offsets = new long[from];
            for (int i18 = 0; i18 < from; i18++) {
                com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.this.sampleNumbers[i18] = parsable.readLong();
                com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.this.offsets[i18] = parsable.readLong();
                parsable.skip(2L);
            }
            if (!com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.seekToFirstFrame(parsable)) {
                throw new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException("can't find audio frame!");
            }
            com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.this.firstFrameOffset = parsable.tell() - 2;
            return true;
        }
    }

    /* loaded from: classes16.dex */
    public class StreamInfoHandler implements com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler {
        public StreamInfoHandler() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler
        public boolean handle(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, int i17) {
            if (i17 != 0) {
                return false;
            }
            parsable.skip(13L);
            parsable.readBytes(new byte[3], 0, 3);
            parsable.skip(21L);
            return true;
        }
    }

    public FlacSeekTable(int i17) {
        this.sampleRate = i17;
    }

    private static int binarySearchFloor(long[] jArr, long j17, boolean z17, boolean z18) {
        int binarySearch = java.util.Arrays.binarySearch(jArr, j17);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        } else if (!z17) {
            binarySearch--;
        }
        return z18 ? java.lang.Math.max(0, binarySearch) : binarySearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean seekToFirstFrame(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable) {
        byte[] bArr = new byte[1];
        byte[] bArr2 = new byte[3];
        boolean z17 = false;
        while (parsable.available() > 0) {
            if (z17) {
                byte[] bArr3 = new byte[2];
                parsable.readBytes(bArr3, 0, 2);
                return (bArr3[0] & 255) == 255 && ((bArr3[1] & 255) >> 2) == 62;
            }
            parsable.readBytes(bArr, 0, 1);
            if (((255 & bArr[0]) >> 7) == 1) {
                z17 = true;
            }
            parsable.readBytes(bArr2, 0, 3);
            parsable.skip(com.tencent.qqmusic.mediaplayer.seektable.flac.BytesUtil.from(bArr2));
        }
        return false;
    }

    private static boolean seekToFlac(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable) {
        byte[] bArr = new byte[4];
        parsable.readBytes(bArr, 0, 4);
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            parsable.skip(2L);
            parsable.skip(com.tencent.qqmusic.mediaplayer.seektable.flac.Id3Util.unsynchsafe(parsable.readInt()));
            parsable.readBytes(bArr, 0, 4);
        }
        return bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 67;
    }

    private static boolean walkThrough(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler... blockHandlerArr) {
        byte[] bArr = new byte[1];
        byte[] bArr2 = new byte[3];
        java.util.HashSet hashSet = new java.util.HashSet();
        while (hashSet.size() < blockHandlerArr.length && parsable.available() > 0) {
            parsable.readBytes(bArr, 0, 1);
            int i17 = bArr[0] & Byte.MAX_VALUE;
            int length = blockHandlerArr.length;
            int i18 = 0;
            boolean z17 = false;
            while (true) {
                if (i18 >= length) {
                    break;
                }
                com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler blockHandler = blockHandlerArr[i18];
                boolean handle = blockHandler.handle(parsable, i17);
                if (handle) {
                    hashSet.add(java.lang.Integer.valueOf(blockHandler.hashCode()));
                    z17 = handle;
                    break;
                }
                i18++;
                z17 = handle;
            }
            if (!z17) {
                if (((bArr[0] & 255) >> 7) == 1) {
                    break;
                }
                parsable.readBytes(bArr2, 0, 3);
                parsable.skip(com.tencent.qqmusic.mediaplayer.seektable.flac.BytesUtil.from(bArr2));
            }
        }
        return hashSet.size() == blockHandlerArr.length;
    }

    public long[] getOffsetRangeOfSample(int i17) {
        int binarySearchFloor = binarySearchFloor(this.sampleNumbers, i17, true, true);
        int i18 = binarySearchFloor + 1;
        long[] jArr = this.offsets;
        if (i18 >= jArr.length) {
            return new long[]{this.firstFrameOffset + jArr[binarySearchFloor], -1};
        }
        long j17 = this.firstFrameOffset;
        return new long[]{jArr[binarySearchFloor] + j17, j17 + jArr[i18]};
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public void parse(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper parsableInputStreamWrapper = new com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper(iDataSource);
        if (seekToFlac(parsableInputStreamWrapper)) {
            if (!walkThrough(parsableInputStreamWrapper, this.sampleRate == 0 ? new com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler[]{new com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.SeektableHandler(), new com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.StreamInfoHandler()} : new com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler[]{new com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.SeektableHandler()})) {
                throw new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException("lack one or more critical BLOCK(s) to create seek table!");
            }
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public long seek(long j17) {
        return this.firstFrameOffset + this.offsets[binarySearchFloor(this.sampleNumbers, (int) (java.lang.Math.round(j17 / 1000.0d) * this.sampleRate), true, true)];
    }
}
