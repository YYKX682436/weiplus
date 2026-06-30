package lo4;

/* loaded from: classes10.dex */
public final class b implements com.tencent.tav.decoder.IEncoderFactory {

    /* renamed from: a, reason: collision with root package name */
    public boolean f320200a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f320201b;

    /* renamed from: c, reason: collision with root package name */
    public t21.d2 f320202c;

    /* renamed from: d, reason: collision with root package name */
    public int f320203d;

    public b(boolean z17, boolean z18, t21.d2 d2Var) {
        this.f320200a = z17;
        this.f320201b = z18;
        this.f320202c = d2Var;
    }

    @Override // com.tencent.tav.decoder.IEncoderFactory
    public com.tencent.tav.decoder.AssetWriterAudioEncoder getAudioEncoder() {
        if (!this.f320201b) {
            try {
                return new com.tencent.tav.decoder.MediaCodecAudioEncoder();
            } catch (java.lang.Exception unused) {
                this.f320203d = 2;
                return new lo4.a();
            }
        }
        try {
            this.f320203d = 1;
            return new lo4.a();
        } catch (com.tencent.tav.core.ExportRuntimeException unused2) {
            this.f320203d = 3;
            return new com.tencent.tav.decoder.MediaCodecAudioEncoder();
        }
    }

    @Override // com.tencent.tav.decoder.IEncoderFactory
    public com.tencent.tav.decoder.AssetWriterVideoEncoder getVideoEncoder() {
        return this.f320200a ? new com.tencent.mm.plugin.vlog.model.w(this.f320202c) : new com.tencent.tav.decoder.MediaCodecAssetWriterVideoEncoder();
    }
}
