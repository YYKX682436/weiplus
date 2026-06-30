package com.tencent.qqmusic.mediaplayer.codec.mp3;

/* loaded from: classes13.dex */
public class MP3Recognition implements com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition {
    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String str, byte[] bArr) {
        return com.tencent.qqmusic.mediaplayer.codec.mp3.MP3FileCheck.isMp3File(str) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.MP3 : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessAudioType(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !(str.toLowerCase().endsWith(".mp3") || str.endsWith(".mp3.tmp") || str.endsWith(".mp3.mqcc") || str.endsWith(".ofl") || str.endsWith(".efe"))) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.MP3;
    }
}
