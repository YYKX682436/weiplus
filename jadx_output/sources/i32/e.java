package i32;

/* loaded from: classes13.dex */
public abstract class e extends i32.d {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f288123e = null;

    /* renamed from: f, reason: collision with root package name */
    public final short f288124f;

    /* renamed from: g, reason: collision with root package name */
    public final short f288125g;

    public e(long j17, int i17, int i18, byte[] bArr) {
        this.f288124f = (short) -1;
        this.f288125g = (short) -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "onDeviceRequest deviceId = " + j17 + " seq = " + i17 + " cmdId = " + i18);
        this.f288119a = j17;
        this.f288124f = (short) i18;
        this.f288125g = (short) i17;
        d(bArr);
    }

    @Override // i32.d
    public final short a() {
        return this.f288125g;
    }

    @Override // i32.d
    public final short b() {
        return this.f288124f;
    }

    @Override // i32.d
    public byte[] c() {
        try {
            return this.f288122d.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "mResp.toByteArray() Failed!!! %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public abstract com.tencent.mm.protobuf.f d(byte[] bArr);
}
