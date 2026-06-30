package km1;

/* loaded from: classes16.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f309007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f309008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f309009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f309010g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f309011h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf.f f309012i;

    public k(km1.s sVar, byte[] bArr, int i17, int i18, int i19, sf.f fVar) {
        this.f309007d = sVar;
        this.f309008e = bArr;
        this.f309009f = i17;
        this.f309010g = i18;
        this.f309011h = i19;
        this.f309012i = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km1.s sVar = this.f309007d;
        sVar.getClass();
        com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame();
        v2TXLiveVideoFrame.pixelFormat = com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        v2TXLiveVideoFrame.bufferType = com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
        v2TXLiveVideoFrame.data = this.f309008e;
        v2TXLiveVideoFrame.width = this.f309009f;
        v2TXLiveVideoFrame.height = this.f309010g;
        v2TXLiveVideoFrame.rotation = this.f309011h;
        sVar.f309028e.d(v2TXLiveVideoFrame);
        this.f309012i.a(jc1.f.f298912a);
    }
}
