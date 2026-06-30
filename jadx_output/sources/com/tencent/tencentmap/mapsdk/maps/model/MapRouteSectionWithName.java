package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class MapRouteSectionWithName {
    public static final int kMaxRoadNameLength = 128;
    public int color;
    public int endNum;
    public java.lang.String roadName;
    public int startNum;

    public static int byteLength() {
        return 140;
    }

    private byte[] intToBytes(int i17) {
        return new byte[]{(byte) i17, (byte) (i17 >> 8), (byte) (i17 >> 16), (byte) (i17 >> 24)};
    }

    private byte[] stringToBytes(java.lang.String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-16LE");
            } catch (java.lang.Exception unused) {
            }
        }
        return new byte[0];
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[byteLength()];
        java.lang.System.arraycopy(intToBytes(this.startNum), 0, bArr, 0, 4);
        java.lang.System.arraycopy(intToBytes(this.endNum), 0, bArr, 4, 4);
        java.lang.System.arraycopy(intToBytes(this.color), 0, bArr, 8, 4);
        byte[] stringToBytes = stringToBytes(this.roadName);
        if (stringToBytes.length < 128) {
            java.lang.System.arraycopy(stringToBytes, 0, bArr, 12, stringToBytes.length);
        } else {
            java.lang.System.arraycopy(stringToBytes, 0, bArr, 12, 128);
        }
        return bArr;
    }
}
