package kf1;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f307176a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f307177b = 600000;

    /* renamed from: c, reason: collision with root package name */
    public int f307178c = 44100;

    /* renamed from: d, reason: collision with root package name */
    public int f307179d = 2;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f307180e = "pcm";

    /* renamed from: f, reason: collision with root package name */
    public int f307181f = com.tencent.tav.decoder.EncoderWriter.OUTPUT_AUDIO_BIT_RATE;

    /* renamed from: g, reason: collision with root package name */
    public double f307182g = 0.0d;

    /* renamed from: h, reason: collision with root package name */
    public int f307183h = 10;

    public java.lang.String toString() {
        return "RecordParams{filePath='" + this.f307176a + "', duration=" + this.f307177b + ", sampleRate=" + this.f307178c + ", numberOfChannels=" + this.f307179d + ", format='" + this.f307180e + "', encodeBitRate=" + this.f307181f + ", frameSize=" + this.f307182g + ", audioSource=" + kf1.e.MIC + ", minBufferSizeMultiplier=" + this.f307183h + '}';
    }
}
