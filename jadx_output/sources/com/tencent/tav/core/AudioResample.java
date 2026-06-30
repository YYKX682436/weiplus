package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AudioResample {
    public final java.lang.String TAG;
    private com.tencent.tav.coremedia.IAVResample avResample;
    private final com.tencent.tav.decoder.AudioInfo destAudioInfo;
    private java.nio.ByteBuffer destBuffer;
    private com.tencent.tav.decoder.AudioInfo srcAudioInfo;

    public AudioResample() {
        this(newDefaultDestAudioInfo());
    }

    private boolean compareAudioInfo(com.tencent.tav.decoder.AudioInfo audioInfo) {
        com.tencent.tav.decoder.AudioInfo audioInfo2 = this.srcAudioInfo;
        return audioInfo2 != null && audioInfo2.pcmEncoding == audioInfo.pcmEncoding && audioInfo2.channelCount == audioInfo.channelCount && audioInfo2.sampleRate == audioInfo.sampleRate;
    }

    private static com.tencent.tav.decoder.AudioInfo newDefaultDestAudioInfo() {
        com.tencent.tav.decoder.AudioInfo audioInfo = new com.tencent.tav.decoder.AudioInfo();
        audioInfo.channelCount = 1;
        audioInfo.sampleRate = 44100;
        audioInfo.pcmEncoding = 2;
        return audioInfo;
    }

    public com.tencent.tav.decoder.AudioInfo getDestAudioInfo() {
        return this.destAudioInfo;
    }

    public java.nio.ByteBuffer resample(java.nio.ByteBuffer byteBuffer, com.tencent.tav.decoder.AudioInfo audioInfo) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "resample() called with: srcBuffer = [" + byteBuffer + "], srcAudioInfo = [" + audioInfo + "]， thread = " + java.lang.Thread.currentThread().getName());
        if (!compareAudioInfo(audioInfo) && com.tencent.tav.decoder.factory.AVResampleFactory.getInstance().isResampleEnable()) {
            com.tencent.tav.decoder.factory.AVResampleFactory aVResampleFactory = com.tencent.tav.decoder.factory.AVResampleFactory.getInstance();
            int i17 = audioInfo.sampleRate;
            int i18 = audioInfo.channelCount;
            com.tencent.tav.decoder.AudioInfo audioInfo2 = this.destAudioInfo;
            com.tencent.tav.coremedia.IAVResample newAVResample = aVResampleFactory.newAVResample(i17, i18, audioInfo2.sampleRate, audioInfo2.channelCount);
            this.avResample = newAVResample;
            this.srcAudioInfo = audioInfo;
            java.lang.String name = newAVResample != null ? newAVResample.getClass().getName() : "null";
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "resample: 创建重采样库，class = " + name + ", srcAudioInfo = " + audioInfo + ", thread = " + java.lang.Thread.currentThread().getName());
        }
        com.tencent.tav.coremedia.IAVResample iAVResample = this.avResample;
        if (iAVResample == null) {
            com.tencent.tav.decoder.logger.Logger.w(this.TAG, "resample: avResample 创建失败！");
            return null;
        }
        byte[] resample = iAVResample.resample(byteBuffer, byteBuffer.limit());
        java.nio.ByteBuffer byteBuffer2 = this.destBuffer;
        if (byteBuffer2 == null || resample.length > byteBuffer2.limit()) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(resample.length);
            this.destBuffer = allocateDirect;
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        this.destBuffer.clear();
        this.destBuffer.put(resample);
        this.destBuffer.position(0);
        this.destBuffer.limit(resample.length);
        return this.destBuffer;
    }

    public AudioResample(com.tencent.tav.decoder.AudioInfo audioInfo) {
        java.lang.String str = "AudioResample@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.destAudioInfo = audioInfo;
        com.tencent.tav.decoder.logger.Logger.i(str, "AudioResample() called with: destAudioInfo = [" + audioInfo + "], thread = " + java.lang.Thread.currentThread().getName());
    }
}
