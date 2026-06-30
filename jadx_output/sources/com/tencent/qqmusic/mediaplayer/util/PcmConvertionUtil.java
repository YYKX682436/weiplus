package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes16.dex */
public class PcmConvertionUtil {
    private static void checkArrayLength(int[] iArr, int i17) {
        if (iArr != null && iArr.length != 0) {
            if (i17 <= iArr.length) {
                return;
            }
            throw new java.lang.IllegalArgumentException("the length param can not larger than int Array length. param:" + i17 + ", int array length:" + iArr.length);
        }
        throw new java.lang.IllegalArgumentException("int Array must not be null or zero length");
    }

    private static void checkBufferLength(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo) {
        if (bufferInfo == null || bufferInfo.byteBuffer == null || bufferInfo.bufferSize <= 0) {
            throw new java.lang.IllegalArgumentException("bufferInfo must not be null or zero length");
        }
    }

    private static void convertBitDepth24To16(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, int i17) {
        checkBufferLength(bufferInfo);
        if (bufferInfo2 == null) {
            throw new java.lang.IllegalArgumentException("BufferInfo dest must not be null");
        }
        if (i17 != 3) {
            throw new java.lang.IllegalArgumentException("origin bit depth must be 3");
        }
        int i18 = bufferInfo.bufferSize;
        bufferInfo2.setTempByteBufferCapacity(i18);
        int i19 = 0;
        for (int i27 = 0; i27 < i18; i27++) {
            if (i27 % 3 != 0) {
                bufferInfo2.tempByteBuffer[i19] = bufferInfo.byteBuffer[i27];
                i19++;
            }
        }
        bufferInfo2.fillByte(bufferInfo2.tempByteBuffer, i19);
        bufferInfo2.bufferSize = i19;
    }

    private static void convertBitDepth32To16(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, int i17) {
        checkBufferLength(bufferInfo);
        if (bufferInfo2 == null) {
            throw new java.lang.IllegalArgumentException("BufferInfo dest must not be null");
        }
        if (i17 != 4) {
            throw new java.lang.IllegalArgumentException("origin bit depth must be 4");
        }
        int i18 = bufferInfo.bufferSize;
        bufferInfo2.setTempByteBufferCapacity(i18);
        int i19 = 0;
        for (int i27 = 0; i27 < i18; i27 += 4) {
            com.tencent.qqmusic.mediaplayer.util.DataConversionUtil.floatTo2Bytes(com.tencent.qqmusic.mediaplayer.util.DataConversionUtil.bytesToFloat32bitInLittleEndian(bufferInfo.byteBuffer, i27), bufferInfo2.tempByteBuffer, i19);
            i19 += 2;
        }
        bufferInfo2.fillByte(bufferInfo2.tempByteBuffer, i19);
        bufferInfo2.bufferSize = i19;
    }

    public static void convertBitDepthTo16(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, int i17) {
        if (i17 == 2) {
            checkBufferLength(bufferInfo);
            bufferInfo.fillInto(bufferInfo2);
        } else if (i17 == 3) {
            convertBitDepth24To16(bufferInfo, bufferInfo2, i17);
        } else if (i17 == 4) {
            convertBitDepth32To16(bufferInfo, bufferInfo2, i17);
        } else {
            throw new java.lang.IllegalArgumentException("not support originBitDepth, originBitDepth=" + i17);
        }
    }

    public static void convertByteBufferToFloatBuffer(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo, int i17) {
        checkBufferLength(bufferInfo);
        if (floatBufferInfo == null) {
            throw new java.lang.IllegalArgumentException("BufferInfo dest must not be null");
        }
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("bit depth must not be zero");
        }
        floatBufferInfo.setTempFloatBufferCapacity(bufferInfo.bufferSize / i17);
        int i18 = bufferInfo.bufferSize;
        floatBufferInfo.bufferSize = i18 / i17;
        com.tencent.qqmusic.mediaplayer.util.DataConversionUtil.byteArrayToFloatArray(bufferInfo.byteBuffer, i18, i17, floatBufferInfo.tempFloatBuffer);
        floatBufferInfo.fillFloat(floatBufferInfo.tempFloatBuffer, floatBufferInfo.bufferSize);
    }

    private static void interpolateIn16Bit(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, long j17, long j18) {
        int i17 = bufferInfo.bufferSize / 2;
        float f17 = i17;
        int round = java.lang.Math.round(((1.0f * f17) / ((float) j17)) * ((float) j18));
        short[] sArr = new short[i17];
        short[] sArr2 = new short[round];
        com.tencent.qqmusic.mediaplayer.util.DataConversionUtil.byteArray16BitToShortArray(bufferInfo.byteBuffer, bufferInfo.bufferSize, sArr);
        linearInterpolate(sArr, i17, sArr2, round, round / f17);
        int i18 = round * 2;
        byte[] bArr = new byte[i18];
        com.tencent.qqmusic.mediaplayer.util.DataConversionUtil.shortArrayToByteArray16Bit(sArr2, round, bArr);
        bufferInfo2.fillByte(bArr, i18);
    }

    private static void interpolateIn24Bit(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, long j17, long j18) {
        int i17 = bufferInfo.bufferSize / 3;
        float f17 = i17;
        int round = java.lang.Math.round(((1.0f * f17) / ((float) j17)) * ((float) j18));
        int[] iArr = new int[i17];
        int[] iArr2 = new int[round];
        com.tencent.qqmusic.mediaplayer.util.DataConversionUtil.byteArray24BitToIntArray(bufferInfo.byteBuffer, bufferInfo.bufferSize, iArr);
        linearInterpolate(iArr, i17, iArr2, round, round / f17);
        int i18 = round * 3;
        byte[] bArr = new byte[i18];
        com.tencent.qqmusic.mediaplayer.util.DataConversionUtil.intArrayToByteArray24Bit(iArr2, round, bArr);
        bufferInfo2.fillByte(bArr, i18);
    }

    private static void interpolateIn32Bit(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, long j17, long j18) {
        int i17 = bufferInfo.bufferSize / 4;
        float f17 = i17;
        int round = java.lang.Math.round(((1.0f * f17) / ((float) j17)) * ((float) j18));
        int[] iArr = new int[i17];
        int[] iArr2 = new int[round];
        com.tencent.qqmusic.mediaplayer.util.DataConversionUtil.byteArray32BitToIntArray(bufferInfo.byteBuffer, bufferInfo.bufferSize, iArr);
        linearInterpolate(iArr, i17, iArr2, round, round / f17);
        int i18 = round * 4;
        byte[] bArr = new byte[i18];
        com.tencent.qqmusic.mediaplayer.util.DataConversionUtil.intArrayToByteArray32Bit(iArr2, round, bArr);
        bufferInfo2.fillByte(bArr, i18);
    }

    private static void linearInterpolate(int[] iArr, int i17, int[] iArr2, int i18, float f17) {
        checkArrayLength(iArr, i17);
        checkArrayLength(iArr2, i18);
        for (int i19 = 0; i19 < i18; i19++) {
            float f18 = i19 / f17;
            int i27 = (int) f18;
            int i28 = i27 + 1;
            if (i28 >= i17) {
                i28 = i17 - 1;
            }
            int i29 = iArr[i28];
            iArr2[i19] = (int) (((i29 - r4) * (f18 - i27)) + iArr[i27]);
        }
    }

    public static void reSample(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, long j17, long j18, int i17) {
        checkBufferLength(bufferInfo);
        if (bufferInfo2 == null) {
            throw new java.lang.IllegalArgumentException("BufferInfo dest must not be null");
        }
        if (j17 == j18 || j18 <= 0 || j17 <= 0) {
            bufferInfo.fillInto(bufferInfo2);
            return;
        }
        if (i17 == 2) {
            interpolateIn16Bit(bufferInfo, bufferInfo2, j17, j18);
            return;
        }
        if (i17 == 3) {
            interpolateIn24Bit(bufferInfo, bufferInfo2, j17, j18);
        } else if (i17 != 4) {
            bufferInfo.fillInto(bufferInfo2);
        } else {
            interpolateIn32Bit(bufferInfo, bufferInfo2, j17, j18);
        }
    }

    private static void checkArrayLength(short[] sArr, int i17) {
        if (sArr != null && sArr.length != 0) {
            if (i17 <= sArr.length) {
                return;
            }
            throw new java.lang.IllegalArgumentException("the length param can not larger than short Array length. param:" + i17 + ", short array length:" + sArr.length);
        }
        throw new java.lang.IllegalArgumentException("short Array must not be null or zero length");
    }

    private static void linearInterpolate(short[] sArr, int i17, short[] sArr2, int i18, float f17) {
        checkArrayLength(sArr, i17);
        checkArrayLength(sArr2, i18);
        for (int i19 = 0; i19 < i18; i19++) {
            int i27 = (int) (i19 / f17);
            int i28 = i27 + 1;
            if (i28 >= i17) {
                i28 = i17 - 1;
            }
            short s17 = sArr[i28];
            short s18 = sArr[i27];
            sArr2[i19] = (short) (((s17 - s18) * (r1 - i27)) + s18);
        }
    }
}
