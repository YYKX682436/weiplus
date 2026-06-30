package com.tencent.qqmusic.mediaplayer.codec;

/* loaded from: classes13.dex */
public interface IAudioRecognition {
    com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String str, byte[] bArr);

    com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessAudioType(java.lang.String str);
}
