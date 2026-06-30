package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes16.dex */
public class DataConversionUtil {
    private static final float BASE_16BIT = 32768.0f;
    private static final float BASE_32BIT = 2.1474836E9f;
    private static final boolean IS_LITTLE_ENDIAN;

    static {
        IS_LITTLE_ENDIAN = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN;
    }

    public static int byteArray16BitToShortArray(byte[] bArr, int i17, short[] sArr) {
        checkByteArrayLength(bArr, i17);
        checkShortArrayLength(sArr, i17 / 2);
        if (i17 % 2 != 0) {
            throw new java.lang.IllegalArgumentException("length of byteArray must be multiple of 2");
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17 && i19 < sArr.length) {
            sArr[i19] = IS_LITTLE_ENDIAN ? bytesToShort16bitInLittleEndian(bArr, i18) : bytesToShort16bitInBigEndian(bArr, i18);
            i18 += 2;
            i19++;
        }
        return i19;
    }

    public static int byteArray24BitToIntArray(byte[] bArr, int i17, int[] iArr) {
        checkByteArrayLength(bArr, i17);
        checkIntArrayLength(iArr, i17 / 3);
        if (i17 % 3 != 0) {
            throw new java.lang.IllegalArgumentException("length of byteArray must be multiple of 3");
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17 && i19 < iArr.length) {
            iArr[i19] = IS_LITTLE_ENDIAN ? bytesToInt24bitInLittleEndian(bArr, i18) : bytesToInt24bitInBigEndian(bArr, i18);
            i18 += 3;
            i19++;
        }
        return i19;
    }

    public static int byteArray32BitToIntArray(byte[] bArr, int i17, int[] iArr) {
        checkByteArrayLength(bArr, i17);
        checkIntArrayLength(iArr, i17 / 4);
        if (i17 % 4 != 0) {
            throw new java.lang.IllegalArgumentException("length of byteArray must be multiple of 4");
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17 && i19 < iArr.length) {
            iArr[i19] = IS_LITTLE_ENDIAN ? bytesToInt32bitInLittleEndian(bArr, i18) : bytesToInt32bitInBigEndian(bArr, i18);
            i18 += 4;
            i19++;
        }
        return i19;
    }

    public static int byteArrayToFloatArray(byte[] bArr, int i17, int i18, float[] fArr) {
        checkByteArrayLength(bArr, i17);
        checkFloatArrayLength(fArr, i17 / i18);
        checkByteArrayProperty(i17, i18);
        int i19 = 0;
        int i27 = 0;
        while (i19 < i17) {
            fArr[i19 / i18] = i18 == 3 ? bytesToFloat24bit(bArr, i19) : bytesToFloat32bit(bArr, i19);
            i19 += i18;
            i27++;
        }
        return i27;
    }

    public static float bytesToFloat24bit(byte[] bArr, int i17) {
        return IS_LITTLE_ENDIAN ? bytesToFloat24bitInLittleEndian(bArr, i17) : bytesToFloat24bitInBigEndian(bArr, i17);
    }

    public static float bytesToFloat24bitInBigEndian(byte[] bArr, int i17) {
        return bytesToInt24bitInBigEndian(bArr, i17) / BASE_32BIT;
    }

    public static float bytesToFloat24bitInLittleEndian(byte[] bArr, int i17) {
        return bytesToInt24bitInLittleEndian(bArr, i17) / BASE_32BIT;
    }

    public static float bytesToFloat32bit(byte[] bArr, int i17) {
        return IS_LITTLE_ENDIAN ? bytesToFloat32bitInLittleEndian(bArr, i17) : bytesToFloat32bitInBigEndian(bArr, i17);
    }

    public static float bytesToFloat32bitInBigEndian(byte[] bArr, int i17) {
        return bytesToInt32bitInBigEndian(bArr, i17) / BASE_32BIT;
    }

    public static float bytesToFloat32bitInLittleEndian(byte[] bArr, int i17) {
        return bytesToInt32bitInLittleEndian(bArr, i17) / BASE_32BIT;
    }

    public static int bytesToInt24bitInBigEndian(byte[] bArr, int i17) {
        return ((bArr[i17] & 255) << 24) | ((bArr[i17 + 2] << 8) & 255) | ((bArr[i17 + 1] & 255) << 16);
    }

    public static int bytesToInt24bitInLittleEndian(byte[] bArr, int i17) {
        return ((bArr[i17 + 2] & 255) << 24) | ((bArr[i17] << 8) & 255) | ((bArr[i17 + 1] & 255) << 16);
    }

    public static int bytesToInt32bitInBigEndian(byte[] bArr, int i17) {
        return ((bArr[i17] & 255) << 24) | (bArr[i17 + 3] & 255) | ((bArr[i17 + 2] & 255) << 8) | ((bArr[i17 + 1] & 255) << 16);
    }

    public static int bytesToInt32bitInLittleEndian(byte[] bArr, int i17) {
        return ((bArr[i17 + 3] & 255) << 24) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16);
    }

    public static short bytesToShort16bitInBigEndian(byte[] bArr, int i17) {
        return (short) (((bArr[i17] & 255) << 8) | (bArr[i17 + 1] & 255));
    }

    public static short bytesToShort16bitInLittleEndian(byte[] bArr, int i17) {
        return (short) (((bArr[i17 + 1] & 255) << 8) | (bArr[i17] & 255));
    }

    private static void checkByteArrayLength(byte[] bArr, int i17) {
        if (bArr == null || bArr.length == 0) {
            throw new java.lang.IllegalArgumentException("byte Array must not be null or zero length");
        }
        if (i17 <= bArr.length) {
            return;
        }
        throw new java.lang.IllegalArgumentException("the length param can not larger than byte Array length. param:" + i17 + ", byte array length:" + bArr.length);
    }

    private static void checkByteArrayProperty(int i17, int i18) {
        if (i18 <= 4 && i18 >= 3) {
            if (i17 % i18 != 0) {
                throw new java.lang.IllegalArgumentException("length of byteArray must be multiple of bytesPerSample");
            }
        } else {
            throw new java.lang.IllegalArgumentException("bytesPerSample of " + i18 + " is not supported");
        }
    }

    private static void checkFloatArrayLength(float[] fArr, int i17) {
        if (fArr == null || fArr.length == 0) {
            throw new java.lang.IllegalArgumentException("float Array must not be null or zero length");
        }
        if (i17 <= fArr.length) {
            return;
        }
        throw new java.lang.IllegalArgumentException("the length param can not larger than float Array length. param:" + i17 + ", float array length:" + fArr.length);
    }

    private static void checkIntArrayLength(int[] iArr, int i17) {
        if (iArr == null || iArr.length == 0) {
            throw new java.lang.IllegalArgumentException("int Array must not be null or zero length");
        }
        if (i17 <= iArr.length) {
            return;
        }
        throw new java.lang.IllegalArgumentException("the length param can not larger than int Array length. param:" + i17 + ", int array length:" + iArr.length);
    }

    private static void checkShortArrayLength(short[] sArr, int i17) {
        if (sArr == null || sArr.length == 0) {
            throw new java.lang.IllegalArgumentException("short Array must not be null or zero length");
        }
        if (i17 <= sArr.length) {
            return;
        }
        throw new java.lang.IllegalArgumentException("the length param can not larger than short Array length. param:" + i17 + ", short array length:" + sArr.length);
    }

    public static void floatTo2Bytes(float f17, byte[] bArr, int i17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f17 < -1.0f) {
            f17 = -1.0f;
        }
        shortTo2Bytes((short) (f17 * BASE_16BIT), bArr, i17);
    }

    public static int intArrayToByteArray24Bit(int[] iArr, int i17, byte[] bArr) {
        checkIntArrayLength(iArr, i17);
        checkByteArrayLength(bArr, i17 * 3);
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            intTo3Bytes(iArr[i18], bArr, i19);
            i18++;
            i19 += 3;
        }
        return i19;
    }

    public static int intArrayToByteArray32Bit(int[] iArr, int i17, byte[] bArr) {
        checkIntArrayLength(iArr, i17);
        checkByteArrayLength(bArr, i17 * 4);
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            intTo4Bytes(iArr[i18], bArr, i19);
            i18++;
            i19 += 4;
        }
        return i19;
    }

    public static void intTo3Bytes(int i17, byte[] bArr, int i18) {
        if (IS_LITTLE_ENDIAN) {
            bArr[i18] = (byte) ((i17 >> 8) & 255);
            bArr[i18 + 1] = (byte) ((i17 >> 16) & 255);
            bArr[i18 + 2] = (byte) ((i17 >> 24) & 255);
        } else {
            bArr[i18 + 2] = (byte) ((i17 >> 8) & 255);
            bArr[i18 + 1] = (byte) ((i17 >> 16) & 255);
            bArr[i18] = (byte) ((i17 >> 24) & 255);
        }
    }

    public static void intTo4Bytes(int i17, byte[] bArr, int i18) {
        if (IS_LITTLE_ENDIAN) {
            bArr[i18] = (byte) (i17 & 255);
            bArr[i18 + 1] = (byte) ((i17 >> 8) & 255);
            bArr[i18 + 2] = (byte) ((i17 >> 16) & 255);
            bArr[i18 + 3] = (byte) ((i17 >> 24) & 255);
            return;
        }
        bArr[i18 + 3] = (byte) (i17 & 255);
        bArr[i18 + 2] = (byte) ((i17 >> 8) & 255);
        bArr[i18 + 1] = (byte) ((i17 >> 16) & 255);
        bArr[i18] = (byte) ((i17 >> 24) & 255);
    }

    public static int shortArrayToByteArray16Bit(short[] sArr, int i17, byte[] bArr) {
        checkShortArrayLength(sArr, i17);
        checkByteArrayLength(bArr, i17 * 2);
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            shortTo2Bytes(sArr[i18], bArr, i19);
            i18++;
            i19 += 2;
        }
        return i19;
    }

    public static void shortTo2Bytes(short s17, byte[] bArr, int i17) {
        if (IS_LITTLE_ENDIAN) {
            bArr[i17] = (byte) (s17 & 255);
            bArr[i17 + 1] = (byte) ((s17 >> 8) & 255);
        } else {
            bArr[i17 + 1] = (byte) (s17 & 255);
            bArr[i17] = (byte) ((s17 >> 8) & 255);
        }
    }
}
