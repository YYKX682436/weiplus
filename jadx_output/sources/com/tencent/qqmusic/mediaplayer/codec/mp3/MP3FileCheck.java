package com.tencent.qqmusic.mediaplayer.codec.mp3;

/* loaded from: classes13.dex */
public class MP3FileCheck {
    private static final java.lang.String TAG = "MP3FileCheck";
    private int endPos;
    private boolean eof;
    private int frameCount;
    private int headerMask;
    private java.lang.String mFilePath;
    private int pos;
    private int skipped;
    private boolean sync;
    private boolean hasCheck = false;
    private java.io.RandomAccessFile mRandomAccessFile = null;
    private int mID3V2Size = -1;
    private boolean hasID3V2 = false;
    private com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Header header = new com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Header();
    private byte[] buf = new byte[8192];
    private boolean isMP3 = false;

    public MP3FileCheck(java.lang.String str) {
        this.mFilePath = null;
        this.mFilePath = str;
    }

    private boolean available(int i17, int i18) {
        int i19;
        return ((i17 & i18) != i18 || ((i17 >> 19) & 3) == 1 || ((i17 >> 17) & 3) == 0 || (i19 = (i17 >> 12) & 15) == 15 || i19 == 0 || ((i17 >> 10) & 3) == 3) ? false : true;
    }

    private int byte2int(byte[] bArr, int i17) {
        return (bArr[i17 + 3] & 255) | (bArr[i17] << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
    }

    private boolean checkAndSeekID3V2Tag() {
        byte[] bArr = new byte[10];
        int fillBuffer = fillBuffer(bArr, 0, 10);
        if (fillBuffer <= 0) {
            return false;
        }
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            int i17 = (bArr[6] << 21) + (bArr[7] << 14) + (bArr[8] << 7) + bArr[9];
            this.mID3V2Size = i17;
            this.hasID3V2 = true;
            seekTo(i17 - fillBuffer);
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "有ID3V2，ID3V2大小 = " + this.mID3V2Size);
        } else {
            closeFileStream();
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "没有有ID3V2");
        }
        return this.hasID3V2;
    }

    private void closeFileStream() {
        java.io.RandomAccessFile randomAccessFile = this.mRandomAccessFile;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
            }
            this.mRandomAccessFile = null;
        }
    }

    private int fillBuffer(byte[] bArr, int i17, int i18) {
        try {
            if (this.mRandomAccessFile == null) {
                this.mRandomAccessFile = new java.io.RandomAccessFile(this.mFilePath, "r");
            }
            return this.mRandomAccessFile.read(bArr, i17, i18);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static boolean isMp3File(java.lang.String str) {
        return new com.tencent.qqmusic.mediaplayer.codec.mp3.MP3FileCheck(str).isMp3File();
    }

    private void nextFrameHeader() {
        int i17 = 0;
        while (!this.eof && !syncFrame()) {
            int i18 = this.endPos;
            int i19 = this.pos;
            int i27 = i18 - i19;
            if (i27 > 0) {
                byte[] bArr = this.buf;
                java.lang.System.arraycopy(bArr, i19, bArr, 0, i27);
            }
            int fillBuffer = fillBuffer(this.buf, i27, this.pos) + i27;
            this.endPos = fillBuffer;
            if (fillBuffer <= i27 || (i17 = i17 + this.pos) > 65536) {
                this.eof = true;
            }
            this.pos = 0;
        }
    }

    private void seekTo(int i17) {
        try {
            this.mRandomAccessFile.seek(i17);
        } catch (java.lang.Exception e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
    }

    private boolean syncFrame() {
        int i17 = this.pos;
        if (this.endPos - i17 <= 4) {
            return false;
        }
        int byte2int = byte2int(this.buf, i17);
        this.pos += 4;
        java.lang.System.out.println(this.frameCount);
        while (true) {
            if (this.eof) {
                break;
            }
            while (!available(byte2int, this.headerMask)) {
                byte[] bArr = this.buf;
                int i18 = this.pos;
                int i19 = i18 + 1;
                this.pos = i19;
                byte2int = (byte2int << 8) | (bArr[i18] & 255);
                if (i19 == this.endPos) {
                    int i27 = this.skipped;
                    int i28 = i19 - 4;
                    this.pos = i28;
                    this.skipped = i27 + (i28 - i17);
                    return false;
                }
            }
            int i29 = this.pos;
            if (i29 > i17 + 4) {
                this.sync = false;
                this.skipped += (i29 - 4) - i17;
            }
            this.header.decode(byte2int);
            int frameSize = this.header.getFrameSize();
            int i37 = this.pos;
            int i38 = i37 + frameSize;
            int i39 = this.endPos;
            if (i38 <= i39 + 4) {
                if (this.sync) {
                    break;
                }
                if (i37 + frameSize > i39) {
                    int i47 = this.skipped;
                    int i48 = i37 - 4;
                    this.pos = i48;
                    this.skipped = i47 + (i48 - i17);
                    return false;
                }
                int i49 = (1572864 & byte2int) | (-2097152) | (393216 & byte2int) | (byte2int & 3072);
                if (available(byte2int(this.buf, (i37 - 4) + frameSize), i49)) {
                    if (this.headerMask == -2097152) {
                        this.headerMask = i49;
                    }
                    this.sync = true;
                } else {
                    byte[] bArr2 = this.buf;
                    int i57 = this.pos;
                    this.pos = i57 + 1;
                    byte2int = (byte2int << 8) | (bArr2[i57] & 255);
                }
            } else {
                int i58 = this.skipped;
                int i59 = i37 - 4;
                this.pos = i59;
                this.skipped = i58 + (i59 - i17);
                return false;
            }
        }
        if (this.header.isProtected()) {
            this.pos += 2;
        }
        this.frameCount++;
        int i66 = this.skipped;
        if (i66 > 0 || (i66 == 0 && this.sync)) {
            this.isMP3 = true;
            this.skipped = 0;
        }
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0039 -> B:7:0x003c). Please report as a decompilation issue!!! */
    public void fileCheck() {
        try {
            try {
                try {
                    this.hasCheck = true;
                    checkAndSeekID3V2Tag();
                    this.headerMask = -2097152;
                    this.sync = false;
                    this.eof = false;
                    this.frameCount = 0;
                    int length = this.buf.length;
                    this.pos = length;
                    this.endPos = length;
                    this.header.initialize();
                    nextFrameHeader();
                    java.io.RandomAccessFile randomAccessFile = this.mRandomAccessFile;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
                    java.io.RandomAccessFile randomAccessFile2 = this.mRandomAccessFile;
                    if (randomAccessFile2 == null) {
                    } else {
                        randomAccessFile2.close();
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e18);
            }
        } catch (java.lang.Throwable th6) {
            java.io.RandomAccessFile randomAccessFile3 = this.mRandomAccessFile;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.close();
                } catch (java.lang.Exception e19) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e19);
                }
            }
            throw th6;
        }
    }

    public int getFrameSize() {
        com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Header mP3Header = this.header;
        if (mP3Header != null) {
            return mP3Header.getFrameSize();
        }
        return -1;
    }

    private boolean isMp3File() {
        if (!this.hasCheck) {
            fileCheck();
        }
        return this.isMP3;
    }
}
