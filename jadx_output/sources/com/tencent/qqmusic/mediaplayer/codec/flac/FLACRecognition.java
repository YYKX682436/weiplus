package com.tencent.qqmusic.mediaplayer.codec.flac;

/* loaded from: classes13.dex */
public class FLACRecognition implements com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition {
    public static final java.lang.String TAG = "FLACRecognition";

    private boolean checkFormatBySoftDecoder(java.lang.String str) {
        com.tencent.qqmusic.mediaplayer.codec.NativeDecoder nativeDecoder = new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder();
        boolean z17 = false;
        try {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
            }
        } catch (java.lang.Throwable th7) {
            try {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th7);
                nativeDecoder.release();
            } finally {
                try {
                    nativeDecoder.release();
                } catch (java.lang.Throwable th8) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th8);
                }
            }
        }
        if (nativeDecoder.init(str, false) != 0) {
            nativeDecoder.release();
            return false;
        }
        com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation = nativeDecoder.getAudioInformation();
        if (audioInformation != null) {
            if (audioInformation.getAudioType() == com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC) {
                z17 = true;
            }
        }
        return z17;
    }

    public static boolean isFlac(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        int i17;
        boolean z17;
        int i18;
        byte[] bArr = new byte[10];
        try {
            iDataSource.readAt(0L, bArr, 0, 10);
        } catch (java.io.IOException unused) {
        }
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            int i19 = ((bArr[6] & Byte.MAX_VALUE) << 21) + ((bArr[7] & Byte.MAX_VALUE) << 14) + ((bArr[8] & Byte.MAX_VALUE) << 7) + (bArr[9] & Byte.MAX_VALUE);
            if ((bArr[5] & com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) > 0) {
                i17 = i19 + 20;
                z17 = true;
            } else {
                i17 = i19 + 10;
                z17 = false;
            }
            if (!z17) {
                byte[] bArr2 = new byte[1];
                try {
                    i18 = iDataSource.readAt(i17, bArr2, 0, 1);
                } catch (java.io.IOException unused2) {
                    i18 = 0;
                }
                while (bArr2[0] == 0 && i18 == 1) {
                    i17++;
                    try {
                        i18 = iDataSource.readAt(i17, bArr2, 0, 1);
                    } catch (java.io.IOException unused3) {
                    }
                }
            }
        } else {
            i17 = 0;
        }
        byte[] bArr3 = new byte[4];
        try {
            iDataSource.readAt(i17, bArr3, 0, 4);
        } catch (java.io.IOException unused4) {
        }
        return bArr3[0] == 102 && bArr3[1] == 76 && bArr3[2] == 97 && bArr3[3] == 67;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String str, byte[] bArr) {
        if ((bArr == null || bArr.length <= 0 || !new java.lang.String(bArr).startsWith("flaC")) && !checkFormatBySoftDecoder(str)) {
            return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
        }
        return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessAudioType(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (str.toLowerCase().contains(".flac")) {
                return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC;
            }
            com.tencent.qqmusic.mediaplayer.upstream.FileDataSource fileDataSource = new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(str);
            boolean z17 = false;
            try {
                fileDataSource.open();
                z17 = isFlac(fileDataSource);
                fileDataSource.close();
            } catch (java.io.IOException unused) {
            }
            if (z17) {
                return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC;
            }
        }
        return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
    }
}
