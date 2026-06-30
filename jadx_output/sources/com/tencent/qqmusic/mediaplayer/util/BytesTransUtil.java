package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes10.dex */
public class BytesTransUtil {
    private static com.tencent.qqmusic.mediaplayer.util.BytesTransUtil instance;
    private java.lang.String TAG = "BytesTransUtil";

    private BytesTransUtil() {
    }

    public static com.tencent.qqmusic.mediaplayer.util.BytesTransUtil getInstance() {
        if (instance == null) {
            instance = new com.tencent.qqmusic.mediaplayer.util.BytesTransUtil();
        }
        return instance;
    }

    public int[] Bytes2Ints(byte[] bArr) {
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        for (int i17 = 0; i17 < length; i17++) {
            byte[] bArr2 = new byte[4];
            for (int i18 = 0; i18 < 4; i18++) {
                bArr2[i18] = bArr[(i17 * 4) + i18];
            }
            iArr[i17] = getInt(bArr2);
            java.lang.System.out.println("2out->" + iArr[i17]);
        }
        return iArr;
    }

    public long[] Bytes2Longs(byte[] bArr) {
        int length = bArr.length / 8;
        long[] jArr = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            byte[] bArr2 = new byte[8];
            for (int i18 = 0; i18 < 8; i18++) {
                bArr2[i18] = bArr[(i17 * 8) + i18];
            }
            jArr[i17] = getLong(bArr2);
        }
        return jArr;
    }

    public short[] Bytes2Shorts(short[] sArr, byte[] bArr) {
        byte[] bArr2 = new byte[2];
        for (int i17 = 0; i17 < sArr.length; i17++) {
            java.lang.System.arraycopy(bArr, i17 * 2, bArr2, 0, 2);
            sArr[i17] = getShort(bArr2);
        }
        return sArr;
    }

    public byte[] Ints2Bytes(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            byte[] bytes = getBytes(iArr[i17]);
            java.lang.System.out.println("1out->" + iArr[i17]);
            for (int i18 = 0; i18 < 4; i18++) {
                bArr[(i17 * 4) + i18] = bytes[i18];
            }
        }
        return bArr;
    }

    public byte[] Longs2Bytes(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        for (int i17 = 0; i17 < jArr.length; i17++) {
            byte[] bytes = getBytes(jArr[i17]);
            for (int i18 = 0; i18 < 8; i18++) {
                bArr[(i17 * 8) + i18] = bytes[i18];
            }
        }
        return bArr;
    }

    public byte[] Shorts2Bytes(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        Shorts2Bytes(sArr, bArr);
        return bArr;
    }

    public byte[] getBytes(short s17, boolean z17) {
        byte[] bArr = new byte[2];
        if (z17) {
            for (int i17 = 1; i17 >= 0; i17--) {
                bArr[i17] = (byte) (s17 & 255);
                s17 = (short) (s17 >> 8);
            }
        } else {
            for (int i18 = 0; i18 < 2; i18++) {
                bArr[i18] = (byte) (s17 & 255);
                s17 = (short) (s17 >> 8);
            }
        }
        return bArr;
    }

    public int getInt(byte[] bArr, boolean z17) {
        if (bArr != null) {
            if (bArr.length > 4) {
                throw new java.lang.IllegalArgumentException("byte array size > 4 !");
            }
            int i17 = 0;
            if (z17) {
                int i18 = 0;
                while (i17 < bArr.length) {
                    i18 = (i18 << 8) | (bArr[i17] & 255);
                    i17++;
                }
                return i18;
            }
            for (int length = bArr.length - 1; length >= 0; length--) {
                i17 = (i17 << 8) | (bArr[length] & 255);
            }
            return i17;
        }
        throw new java.lang.IllegalArgumentException("byte array is null!");
    }

    public long getLong(byte[] bArr, boolean z17) {
        if (bArr != null) {
            if (bArr.length > 8) {
                throw new java.lang.IllegalArgumentException("byte array size > 8 !");
            }
            long j17 = 0;
            if (z17) {
                for (byte b17 : bArr) {
                    j17 = (j17 << 8) | (b17 & 255);
                }
            } else {
                for (int length = bArr.length - 1; length >= 0; length--) {
                    j17 = (j17 << 8) | (bArr[length] & 255);
                }
            }
            return j17;
        }
        throw new java.lang.IllegalArgumentException("byte array is null!");
    }

    public short getShort(byte[] bArr, boolean z17) {
        if (bArr != null) {
            if (bArr.length > 2) {
                throw new java.lang.IllegalArgumentException("byte array size > 2 !");
            }
            int i17 = 0;
            if (z17) {
                short s17 = 0;
                while (i17 < bArr.length) {
                    s17 = (short) (((short) (s17 << 8)) | (bArr[i17] & 255));
                    i17++;
                }
                return s17;
            }
            for (int length = bArr.length - 1; length >= 0; length--) {
                i17 = (short) (((short) (i17 << 8)) | (bArr[length] & 255));
            }
            return i17 == true ? (short) 1 : (short) 0;
        }
        throw new java.lang.IllegalArgumentException("byte array is null!");
    }

    public boolean testCPU() {
        return java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    public void Shorts2Bytes(short[] sArr, byte[] bArr) {
        for (int i17 = 0; i17 < sArr.length; i17++) {
            java.lang.System.arraycopy(getBytes(sArr[i17]), 0, bArr, i17 * 2, 2);
        }
    }

    public byte[] getBytes(int i17, boolean z17) {
        byte[] bArr = new byte[4];
        if (z17) {
            for (int i18 = 3; i18 >= 0; i18--) {
                bArr[i18] = (byte) (i17 & 255);
                i17 >>= 8;
            }
        } else {
            java.lang.System.out.println("1");
            for (int i19 = 0; i19 < 4; i19++) {
                bArr[i19] = (byte) (i17 & 255);
                i17 >>= 8;
            }
        }
        return bArr;
    }

    public byte[] getBytes(long j17, boolean z17) {
        byte[] bArr = new byte[8];
        if (z17) {
            for (int i17 = 7; i17 >= 0; i17--) {
                bArr[i17] = (byte) (j17 & 255);
                j17 >>= 8;
            }
        } else {
            for (int i18 = 0; i18 < 8; i18++) {
                bArr[i18] = (byte) (j17 & 255);
                j17 >>= 8;
            }
        }
        return bArr;
    }

    public byte[] getBytes(int i17) {
        return getBytes(i17, testCPU());
    }

    public int getInt(byte[] bArr) {
        return getInt(bArr, testCPU());
    }

    public long getLong(byte[] bArr) {
        return getLong(bArr, testCPU());
    }

    public short getShort(byte[] bArr) {
        return getShort(bArr, testCPU());
    }

    public byte[] getBytes(short s17) {
        return getBytes(s17, testCPU());
    }

    public byte[] getBytes(long j17) {
        return getBytes(j17, testCPU());
    }
}
