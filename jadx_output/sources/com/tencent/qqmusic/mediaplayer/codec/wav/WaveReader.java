package com.tencent.qqmusic.mediaplayer.codec.wav;

/* loaded from: classes13.dex */
public class WaveReader {
    private static final java.lang.String TAG = "WaveReader";
    private static final int WAV_FORMAT = 1463899717;
    private static final int WAV_FORMAT_CHUNK_ID = 1718449184;
    private static final int WAV_HEADER_CHUNK_ID = 1380533830;
    private static final int WAV_HEADER_SIZE = 50;

    private static short byteToShortLE(byte b17, byte b18) {
        return (short) ((b17 & 255) | ((b18 & 255) << 8));
    }

    public static boolean isWavFormat(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        byte[] bArr = new byte[50];
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new java.io.FileInputStream(str);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            int readUnsignedInt = readUnsignedInt(bArr, 0);
            if (readUnsignedInt != WAV_HEADER_CHUNK_ID) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "isWavFormat Invalid WAVE header chunk ID = " + readUnsignedInt);
                try {
                    fileInputStream.close();
                } catch (java.lang.Exception e18) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e18);
                }
                return false;
            }
            int readUnsignedInt2 = readUnsignedInt(bArr, 8);
            if (readUnsignedInt2 != WAV_FORMAT) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "isWavFormat Invalid WAVE format = " + readUnsignedInt2);
                try {
                    fileInputStream.close();
                } catch (java.lang.Exception e19) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e19);
                }
                return false;
            }
            int readUnsignedInt3 = readUnsignedInt(bArr, 12);
            if (readUnsignedInt3 != WAV_FORMAT_CHUNK_ID) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "isWavFormat Invalid WAVE format chunk ID formatId = " + readUnsignedInt3);
                try {
                    fileInputStream.close();
                } catch (java.lang.Exception e27) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e27);
                }
                return false;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "isWavFormat formatSize = " + readUnsignedIntLE(bArr, 16));
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "isWavFormat mAudioFormat = " + ((int) readUnsignedShortLE(bArr, 20)));
            try {
                fileInputStream.close();
                return true;
            } catch (java.lang.Exception e28) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e28);
                return true;
            }
        } catch (java.lang.Exception e29) {
            e = e29;
            fileInputStream2 = fileInputStream;
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.lang.Exception e37) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e37);
                }
            }
            return false;
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.lang.Exception e38) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e38);
                }
            }
            throw th;
        }
    }

    private static int readUnsignedInt(byte[] bArr, int i17) {
        if (i17 + 4 > bArr.length) {
            return -1;
        }
        return (bArr[i17 + 3] & 255) | ((bArr[i17] & 255) << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
    }

    private static int readUnsignedIntLE(byte[] bArr, int i17) {
        if (i17 + 4 > bArr.length) {
            return -1;
        }
        return ((bArr[i17 + 3] & 255) << 24) | (bArr[0] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16);
    }

    private static short readUnsignedShortLE(byte[] bArr, int i17) {
        if (i17 + 2 > bArr.length) {
            return (short) -1;
        }
        return byteToShortLE(bArr[i17], bArr[i17 + 1]);
    }
}
