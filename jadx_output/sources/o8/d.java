package o8;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f343597a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f343598b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f343599c;

    /* renamed from: d, reason: collision with root package name */
    public final android.media.MediaCodec.CryptoInfo f343600d;

    /* renamed from: e, reason: collision with root package name */
    public final o8.c f343601e;

    public d() {
        int i17 = t9.d0.f416498a;
        android.media.MediaCodec.CryptoInfo cryptoInfo = i17 >= 16 ? new android.media.MediaCodec.CryptoInfo() : null;
        this.f343600d = cryptoInfo;
        this.f343601e = i17 >= 24 ? new o8.c(cryptoInfo, null) : null;
    }
}
