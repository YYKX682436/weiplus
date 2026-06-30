package com.tencent.qqmusic.mediaplayer.seektable.mp3;

/* loaded from: classes16.dex */
class Mp3DecodeBase {
    public static boolean hasId3v2(byte[] bArr, int i17) {
        return bArr != null && i17 >= 3 && bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51;
    }

    public static boolean isVBRIVBRHeader(byte[] bArr, int i17) {
        return bArr != null && i17 >= 4 && bArr[0] == 86 && bArr[1] == 66 && bArr[2] == 82 && bArr[3] == 73;
    }

    public static boolean isXingVBRheader(byte[] bArr, int i17) {
        if (bArr != null && i17 >= 4) {
            byte b17 = bArr[0];
            if (b17 == 88 && bArr[1] == 105 && bArr[2] == 110 && bArr[3] == 103) {
                return true;
            }
            if (b17 == 73 && bArr[1] == 110 && bArr[2] == 102 && bArr[3] == 111) {
                return true;
            }
        }
        return false;
    }

    public static int readByte(byte[] bArr, int i17) {
        return readByte(bArr, 0, i17);
    }

    public static int readInt(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 4 || bArr.length < i18 + i17) {
            return -1;
        }
        return (bArr[i17 + 3] & 255) | ((bArr[i17] & 255) << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
    }

    public static long readLong(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 4 || bArr.length < i18 + i17) {
            return -1L;
        }
        return (bArr[i17 + 3] & 255) | ((bArr[i17] & 255) << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
    }

    public static int readShort(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 2 || bArr.length < i18 + i17) {
            return -1;
        }
        return (bArr[i17 + 1] & 255) | ((bArr[i17] & 255) << 8);
    }

    public static int readUnsignedInt24(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 3 || bArr.length < i18 + i17) {
            return -1;
        }
        return (bArr[i17 + 2] & 255) | ((bArr[i17] & 255) << 16) | ((bArr[i17 + 1] & 255) << 8);
    }

    public static int readByte(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 1 || bArr.length < i18 + i17) {
            return -1;
        }
        return bArr[i17] & 255;
    }

    public static int readInt(byte[] bArr, int i17) {
        return readInt(bArr, 0, i17);
    }

    public static long readLong(byte[] bArr, int i17) {
        return readLong(bArr, 0, i17);
    }

    public static int readShort(byte[] bArr, int i17) {
        return readShort(bArr, 0, i17);
    }

    public static int readUnsignedInt24(byte[] bArr, int i17) {
        return readUnsignedInt24(bArr, 0, i17);
    }
}
