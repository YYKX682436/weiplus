package com.tencent.tav.decoder;

/* loaded from: classes7.dex */
public class ADTSUtils {
    public static java.nio.ByteBuffer getADTSCodecSpecificData(int i17, int i18, int i19) {
        int freqIndex = getFreqIndex(i18);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(2);
        allocate.put(0, (byte) ((i17 << 3) | (freqIndex >> 1)));
        allocate.put(1, (byte) (((freqIndex << 7) & 128) | (i19 << 3)));
        allocate.flip();
        return allocate;
    }

    public static int getFreqIndex(int i17) {
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
