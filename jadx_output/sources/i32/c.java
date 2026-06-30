package i32;

/* loaded from: classes13.dex */
public class c extends i32.e {
    public c(long j17, int i17, int i18, byte[] bArr) {
        super(j17, i17, i18, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdAuth", "ExDeviceCmdAuth deviceId = " + j17 + " seq = " + i17 + " cmdId = " + i18);
    }

    @Override // i32.e
    public com.tencent.mm.protobuf.f d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceCmdAuth", "paras body is null");
            return null;
        }
        o32.a aVar = new o32.a();
        try {
            aVar.parseFrom(bArr);
            this.f288123e = aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------AuthRequest------ ClientVersion = " + aVar.f342683f + " DeviceName = " + aVar.f342690p + " Language = " + aVar.f342689o + " TimeZone = " + aVar.f342688n);
            return aVar;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceCmdAuth", "AuthRequest.parseFrom Failed!!! %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdAuth", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public void e(int i17, java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------setAuthResponse------ret = " + i17 + "errMsg = " + str);
        o32.b bVar = new o32.b();
        o32.e eVar = new o32.e();
        this.f288121c = eVar;
        eVar.f342694d = i17;
        eVar.f342695e = str;
        bVar.f342714d = eVar;
        bVar.f342691e = com.tencent.mm.protobuf.g.b(bArr);
        this.f288122d = bVar;
        this.f288120b = (short) 20001;
    }
}
