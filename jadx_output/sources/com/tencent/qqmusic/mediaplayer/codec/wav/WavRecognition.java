package com.tencent.qqmusic.mediaplayer.codec.wav;

/* loaded from: classes13.dex */
public class WavRecognition implements com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition {
    public static boolean isWav(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        byte[] bArr = new byte[4];
        try {
            iDataSource.readAt(0L, bArr, 0, 4);
        } catch (java.io.IOException unused) {
        }
        if (bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70) {
            return true;
        }
        try {
            iDataSource.readAt(8L, bArr, 0, 4);
        } catch (java.io.IOException unused2) {
        }
        return bArr[0] == 87 && bArr[1] == 65 && bArr[2] == 86 && bArr[3] == 69;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String str, byte[] bArr) {
        return com.tencent.qqmusic.mediaplayer.codec.wav.WaveReader.isWavFormat(str) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.WAV : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessAudioType(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !str.toLowerCase().contains(".wav")) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.WAV;
    }
}
