package com.tencent.tav.decoder;

/* loaded from: classes10.dex */
public interface IEncoderFactory {
    com.tencent.tav.decoder.AssetWriterAudioEncoder getAudioEncoder();

    com.tencent.tav.decoder.AssetWriterVideoEncoder getVideoEncoder();
}
