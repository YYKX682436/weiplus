package com.tencent.qqmusic.mediaplayer.codec.ape;

/* loaded from: classes13.dex */
public class ApeRecognition implements com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition {
    public static final java.lang.String TAG = "ApeRecognition";

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String str, byte[] bArr) {
        com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation;
        if (bArr != null && bArr.length > 0 && new java.lang.String(bArr).startsWith("MAC")) {
            return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.APE;
        }
        com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
        com.tencent.qqmusic.mediaplayer.codec.NativeDecoder nativeDecoder = new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder();
        if (nativeDecoder.init(new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(str)) != 0 || (audioInformation = nativeDecoder.getAudioInformation()) == null) {
            return audioType;
        }
        com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType2 = audioInformation.getAudioType();
        com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType3 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.APE;
        return audioType2 == audioType3 ? audioType3 : audioType;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessAudioType(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !(str.toLowerCase().contains(".ape") || str.toLowerCase().contains(".mac"))) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.APE;
    }
}
