package kl4;

/* loaded from: classes13.dex */
public final class i implements com.tencent.mm.audio.mix.decode.IDecodeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kl4.k f308914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.io.ByteArrayOutputStream f308915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f308916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.y1 f308917d;

    public i(kl4.k kVar, java.io.ByteArrayOutputStream byteArrayOutputStream, int i17, bw5.y1 y1Var) {
        this.f308914a = kVar;
        this.f308915b = byteArrayOutputStream;
        this.f308916c = i17;
        this.f308917d = y1Var;
    }

    @Override // com.tencent.mm.audio.mix.decode.IDecodeCallback
    public final boolean onDecodeData(byte[] bArr, int i17, boolean z17) {
        kl4.k kVar = this.f308914a;
        if (!kVar.f308925h.get()) {
            return true;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.f308915b;
        if (z17) {
            if (bArr != null) {
                byteArrayOutputStream.write(bArr);
            }
            return true;
        }
        if (bArr != null && i17 != 0) {
            byteArrayOutputStream.write(bArr);
            if (byteArrayOutputStream.size() >= this.f308916c) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                com.tencent.unit_rc.ByteBuffer a17 = kVar.f308928n.a(byteArray.length, byteArray);
                try {
                    try {
                        jm4.x xVar = kVar.f308923f;
                        if (xVar != null) {
                            ((jm4.y) xVar).a(a17, this.f308917d, true);
                        }
                        kVar.f308928n.b(a17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w(kVar.f308921d, "audio decode frame out callback error: " + e17.getMessage());
                        kVar.f308928n.b(a17);
                    }
                    byteArrayOutputStream.reset();
                } catch (java.lang.Throwable th6) {
                    kVar.f308928n.b(a17);
                    throw th6;
                }
            }
        }
        return false;
    }
}
