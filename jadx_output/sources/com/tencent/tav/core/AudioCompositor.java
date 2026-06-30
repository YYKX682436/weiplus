package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AudioCompositor {
    private com.tencent.tav.decoder.AudioMixer audioMixer;
    private java.nio.ShortBuffer currentSamples;
    private java.nio.ShortBuffer lastSamples;
    private final java.lang.String TAG = "AudioCompositor@" + java.lang.Integer.toHexString(hashCode());
    private final com.tencent.tav.core.AudioResample audioResample = new com.tencent.tav.core.AudioResample();

    public AudioCompositor(com.tencent.tav.decoder.AudioInfo audioInfo) {
        this.audioMixer = new com.tencent.tav.decoder.AudioMixer(audioInfo.sampleRate, audioInfo.channelCount);
    }

    private com.tencent.tav.decoder.AudioInfo resample(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer, com.tencent.tav.decoder.AudioInfo audioInfo) {
        java.nio.ByteBuffer resample;
        java.nio.ByteBuffer sampleByteBuffer = cMSampleBuffer.getSampleByteBuffer();
        if (sampleByteBuffer == null || sampleByteBuffer.limit() <= 0) {
            com.tencent.tav.decoder.logger.Logger.d(this.audioResample.TAG, "resample: 不进行重采样 byteBuffer = " + sampleByteBuffer);
            return audioInfo;
        }
        if (com.tencent.tav.decoder.factory.AVResampleFactory.getInstance().isResampleEnable() && (resample = this.audioResample.resample(sampleByteBuffer, audioInfo)) != null) {
            audioInfo = this.audioResample.getDestAudioInfo();
            sampleByteBuffer = resample;
        }
        cMSampleBuffer.setSampleByteBuffer(sampleByteBuffer);
        return audioInfo;
    }

    public synchronized void clear() {
        this.currentSamples = null;
        this.lastSamples = null;
    }

    public java.nio.ByteBuffer processFrame(java.nio.ByteBuffer byteBuffer, float f17, float f18, com.tencent.tav.decoder.AudioInfo audioInfo) {
        this.audioMixer.setAudioInfo(audioInfo.sampleRate, audioInfo.channelCount, audioInfo.pcmEncoding);
        return this.audioMixer.processBytes(byteBuffer, f18, f17, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[Catch: all -> 0x01cc, TryCatch #1 {, blocks: (B:10:0x0009, B:14:0x0013, B:16:0x0023, B:19:0x002a, B:20:0x0047, B:22:0x004b, B:24:0x0051, B:26:0x0059, B:27:0x007d, B:28:0x008d, B:79:0x01b1, B:82:0x0030, B:5:0x01c6, B:33:0x0099, B:35:0x00cd, B:38:0x00db, B:40:0x00e6, B:41:0x00f0, B:43:0x00f6, B:48:0x0102, B:50:0x010c, B:52:0x0112, B:53:0x0129, B:58:0x013d, B:60:0x0146, B:63:0x014d, B:64:0x016a, B:69:0x0153, B:55:0x0183, B:65:0x0190), top: B:9:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x01cc, TryCatch #1 {, blocks: (B:10:0x0009, B:14:0x0013, B:16:0x0023, B:19:0x002a, B:20:0x0047, B:22:0x004b, B:24:0x0051, B:26:0x0059, B:27:0x007d, B:28:0x008d, B:79:0x01b1, B:82:0x0030, B:5:0x01c6, B:33:0x0099, B:35:0x00cd, B:38:0x00db, B:40:0x00e6, B:41:0x00f0, B:43:0x00f6, B:48:0x0102, B:50:0x010c, B:52:0x0112, B:53:0x0129, B:58:0x013d, B:60:0x0146, B:63:0x014d, B:64:0x016a, B:69:0x0153, B:55:0x0183, B:65:0x0190), top: B:9:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0190 A[EDGE_INSN: B:81:0x0190->B:65:0x0190 BREAK  A[LOOP:0: B:30:0x0095->B:47:0x018d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.tencent.tav.coremedia.CMSampleBuffer readMergeSample(com.tencent.tav.decoder.AudioDecoderTrack r17, com.tencent.tav.core.AudioMixInputParameters r18, com.tencent.tav.coremedia.CMSampleBuffer r19) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.AudioCompositor.readMergeSample(com.tencent.tav.decoder.AudioDecoderTrack, com.tencent.tav.core.AudioMixInputParameters, com.tencent.tav.coremedia.CMSampleBuffer):com.tencent.tav.coremedia.CMSampleBuffer");
    }

    public void setAudioInfo(com.tencent.tav.decoder.AudioInfo audioInfo) {
        this.audioMixer = new com.tencent.tav.decoder.AudioMixer(audioInfo.sampleRate, audioInfo.channelCount);
    }
}
