package com.tencent.qqmusic.mediaplayer.codec.ogg;

/* loaded from: classes13.dex */
public class VorbisRecognition implements com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition {
    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String str, byte[] bArr) {
        return (bArr == null || bArr.length <= 0 || !new java.lang.String(bArr).startsWith("OggS")) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.OGG;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessAudioType(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !str.toLowerCase().contains(".ogg")) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.OGG;
    }
}
