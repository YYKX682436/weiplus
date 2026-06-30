package com.tencent.tav.core;

/* loaded from: classes16.dex */
public interface AudioTapProcessor {
    com.tencent.tav.decoder.AudioInfo getDestAudioInfo();

    java.nio.ByteBuffer processAudioPCM(com.tencent.tav.coremedia.CMTime cMTime, java.nio.ByteBuffer byteBuffer, com.tencent.tav.decoder.AudioInfo audioInfo);

    void release();
}
