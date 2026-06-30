package fs0;

/* loaded from: classes10.dex */
public final class l extends fs0.f {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f266261u;

    /* renamed from: v, reason: collision with root package name */
    public int f266262v;

    /* renamed from: w, reason: collision with root package name */
    public final long f266263w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f266264x;

    /* renamed from: y, reason: collision with root package name */
    public final yz5.a f266265y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hs0.a mediaExtractorWrapper, java.lang.String audioId, long j17, long j18, yz5.p pVar, yz5.a aVar) {
        super(mediaExtractorWrapper, audioId, j17, j18, pVar, aVar);
        kotlin.jvm.internal.o.g(mediaExtractorWrapper, "mediaExtractorWrapper");
        kotlin.jvm.internal.o.g(audioId, "audioId");
        this.f266261u = "MicroMsg.MediaCodecAACDecoderAsync@".concat(audioId);
        this.f266263w = j18;
        fs0.i iVar = new fs0.i(this, audioId, j17, mediaExtractorWrapper);
        wo.i1 i1Var = this.f266218h;
        if (i1Var != null) {
            i1Var.f447719a.setCallback(iVar);
        }
        this.f266265y = new fs0.k(this);
    }

    @Override // fs0.f
    public void d() {
        java.lang.String str = this.f266261u;
        try {
            wo.i1 i1Var = this.f266218h;
            if (i1Var != null) {
                i1Var.x();
            }
            com.tencent.mars.xlog.Log.i(str, "startDecoder " + this.f266212b);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "startDecoder error", new java.lang.Object[0]);
        }
    }
}
