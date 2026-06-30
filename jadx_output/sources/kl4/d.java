package kl4;

/* loaded from: classes13.dex */
public final class d implements com.tencent.mm.audio.mix.decode.IDecodeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.io.ByteArrayOutputStream f308897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f308899c;

    public d(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17, long j17) {
        this.f308897a = byteArrayOutputStream;
        this.f308898b = i17;
        this.f308899c = j17;
    }

    @Override // com.tencent.mm.audio.mix.decode.IDecodeCallback
    public final boolean onDecodeData(byte[] bArr, int i17, boolean z17) {
        long j17 = this.f308899c;
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.f308897a;
        if (z17) {
            if (bArr != null) {
                byteArrayOutputStream.write(bArr);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioDecoder", "onDecodeData decodeEnd cost:" + (java.lang.System.currentTimeMillis() - j17) + ", size:" + byteArrayOutputStream.size());
            return true;
        }
        if (bArr != null && i17 != 0) {
            byteArrayOutputStream.write(bArr);
            if (byteArrayOutputStream.size() >= this.f308898b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioDecoder", "onDecodeData end cost:" + (java.lang.System.currentTimeMillis() - j17) + ", size:" + byteArrayOutputStream.size());
                return true;
            }
        }
        return false;
    }
}
