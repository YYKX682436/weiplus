package i32;

/* loaded from: classes8.dex */
public final class j extends i32.k {
    public j(byte[] bArr, int i17, long j17) {
        o32.h hVar = new o32.h();
        hVar.f342710d = new o32.c();
        hVar.f342711e = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
        hVar.f342712f = i17;
        this.f288122d = hVar;
        this.f288119a = j17;
        this.f288120b = (short) 30001;
    }

    @Override // i32.d
    public byte[] c() {
        iz5.a.d(null, this.f288122d);
        try {
            return this.f288122d.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDevicePushManufacturerSvrSendData", "mResp.toByteArray() Failed!!! %s", e17.getMessage());
            return null;
        }
    }
}
