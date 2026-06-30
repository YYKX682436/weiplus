package com.tencent.tav.core.audio;

/* loaded from: classes16.dex */
public interface IAudioSource<T extends com.tencent.tav.decoder.IDecoderTrack> {
    com.tencent.tav.coremedia.CMTime getDuration();

    T getSourceAudioDecoder(com.tencent.tav.coremedia.CMTimeRange cMTimeRange);
}
