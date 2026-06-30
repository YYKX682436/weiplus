package com.tencent.qqmusic.mediaplayer.seektable.flac;

/* loaded from: classes16.dex */
public class Id3Util {
    public static int synchsafe(int i17) {
        int i18 = 0;
        int i19 = 127;
        while ((Integer.MAX_VALUE ^ i19) > 0) {
            i18 = (((~i19) & i17) << 1) | (i17 & i19);
            i19 = ((i19 + 1) << 8) - 1;
            i17 = i18;
        }
        return i18;
    }

    public static int unsynchsafe(int i17) {
        int i18 = 0;
        for (int i19 = 2130706432; i19 > 0; i19 >>= 8) {
            i18 = (i18 >> 1) | (i17 & i19);
        }
        return i18;
    }
}
