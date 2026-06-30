package ep4;

/* loaded from: classes5.dex */
public abstract class l {
    public static byte[] a(byte[] bArr, int i17, int i18, int i19) {
        byte[] bArr2 = new byte[bArr.length + 44];
        int length = bArr.length;
        long j17 = length + 36;
        long j18 = ((i18 * i17) * i19) / 8;
        java.lang.System.arraycopy(new byte[]{82, 73, 70, 70, (byte) (j17 & 255), (byte) ((j17 >> 8) & 255), (byte) ((j17 >> 16) & 255), (byte) ((j17 >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, 0, 0, 0, 1, 0, (byte) i17, 0, (byte) (i18 & 255), (byte) ((i18 >> 8) & 255), (byte) ((i18 >> 16) & 255), (byte) ((i18 >> 24) & 255), (byte) (j18 & 255), (byte) ((j18 >> 8) & 255), (byte) ((j18 >> 16) & 255), (byte) ((j18 >> 24) & 255), (byte) ((i17 * i19) / 8), 0, (byte) i19, 0, 100, 97, 116, 97, (byte) (length & 255), (byte) ((length >> 8) & 255), (byte) ((length >> 16) & 255), (byte) ((length >> 24) & 255)}, 0, bArr2, 0, 44);
        java.lang.System.arraycopy(bArr, 0, bArr2, 44, bArr.length);
        return bArr2;
    }
}
