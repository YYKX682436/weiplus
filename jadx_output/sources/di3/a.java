package di3;

/* loaded from: classes8.dex */
public abstract class a {
    public static void a(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, int i28) {
        int b17 = b(i27);
        byteBuffer.put(i17, (byte) -1);
        byteBuffer.put(i17 + 1, (byte) -7);
        byteBuffer.put(i17 + 2, (byte) (((i19 - 1) << 6) + (b17 << 2) + (i28 >> 2)));
        byteBuffer.put(i17 + 3, (byte) (((i28 & 3) << 6) + (i18 >> 11)));
        byteBuffer.put(i17 + 4, (byte) ((i18 & 2047) >> 3));
        byteBuffer.put(i17 + 5, (byte) (((i18 & 7) << 5) + 31));
        byteBuffer.put(i17 + 6, (byte) -4);
    }

    public static int b(int i17) {
        switch (i17) {
            case 7350:
                return 12;
            case 8000:
                return 11;
            case 11025:
                return 10;
            case 12000:
                return 9;
            case 16000:
            default:
                return 8;
            case 22050:
                return 7;
            case 24000:
                return 6;
            case 32000:
                return 5;
            case 44100:
                return 4;
            case 48000:
                return 3;
            case 64000:
                return 2;
            case 88200:
                return 1;
            case 96000:
                return 0;
        }
    }
}
