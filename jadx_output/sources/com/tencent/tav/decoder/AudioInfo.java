package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class AudioInfo implements java.lang.Cloneable {
    public int channelCount;
    public int pcmEncoding;
    public int sampleRate;

    public AudioInfo() {
        this.sampleRate = 44100;
        this.channelCount = 1;
        this.pcmEncoding = 2;
    }

    public java.lang.String toString() {
        return "AudioInfo{sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", pcmEncoding=" + this.pcmEncoding + '}';
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tav.decoder.AudioInfo m416clone() {
        return new com.tencent.tav.decoder.AudioInfo(this.sampleRate, this.channelCount, this.pcmEncoding);
    }

    public AudioInfo(int i17, int i18, int i19) {
        this.sampleRate = i17;
        this.channelCount = i18;
        this.pcmEncoding = i19;
    }
}
