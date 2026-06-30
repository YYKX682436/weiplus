package ko4;

/* loaded from: classes10.dex */
public final class e implements com.tencent.tav.codec.IDecoderFactory {

    /* renamed from: a, reason: collision with root package name */
    public boolean f310064a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f310065b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.tav.codec.DefaultDecoderFactory f310066c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f310067d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f310068e;

    /* renamed from: f, reason: collision with root package name */
    public int f310069f;

    /* renamed from: g, reason: collision with root package name */
    public int f310070g;

    public e(boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        this.f310064a = z17;
        this.f310065b = z18;
        this.f310066c = new com.tencent.tav.codec.DefaultDecoderFactory();
        this.f310067d = true;
        this.f310068e = true;
        this.f310069f = 0;
        this.f310070g = 0;
    }

    @Override // com.tencent.tav.codec.IDecoderFactory
    public com.tencent.tav.codec.IMediaCodec createAudioDecoder(java.lang.String mime, java.lang.String scene) {
        kotlin.jvm.internal.o.g(mime, "mime");
        kotlin.jvm.internal.o.g(scene, "scene");
        if (this.f310067d && r26.i0.y(mime, "audio/pcm", false)) {
            this.f310069f = 3;
            return new ko4.a();
        }
        if (this.f310065b) {
            this.f310069f = 1;
            return new ko4.a();
        }
        try {
            com.tencent.tav.codec.IMediaCodec createAudioDecoder = this.f310066c.createAudioDecoder(mime, scene);
            kotlin.jvm.internal.o.f(createAudioDecoder, "createAudioDecoder(...)");
            return createAudioDecoder;
        } catch (java.lang.Exception e17) {
            if (!this.f310068e) {
                throw e17;
            }
            this.f310069f = 2;
            return new ko4.a();
        }
    }

    @Override // com.tencent.tav.codec.IDecoderFactory
    public com.tencent.tav.codec.IMediaCodec createVideoDecoder(java.lang.String mime) {
        kotlin.jvm.internal.o.g(mime, "mime");
        if (this.f310064a) {
            this.f310070g = 1;
            return new ko4.l();
        }
        try {
            com.tencent.tav.codec.IMediaCodec createVideoDecoder = this.f310066c.createVideoDecoder(mime);
            kotlin.jvm.internal.o.f(createVideoDecoder, "createVideoDecoder(...)");
            return createVideoDecoder;
        } catch (java.lang.Exception e17) {
            if (!this.f310068e) {
                throw e17;
            }
            this.f310070g = 2;
            return new ko4.l();
        }
    }
}
