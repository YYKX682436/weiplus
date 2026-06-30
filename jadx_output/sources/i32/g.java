package i32;

/* loaded from: classes13.dex */
public class g extends i32.e {
    public g(long j17, int i17, int i18, byte[] bArr) {
        super(j17, i17, i18, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "ExDeviceCmdSendDataToManufacturer deviceId = " + j17 + " seq = " + i17 + " cmdId = " + i18);
    }

    @Override // i32.e
    public com.tencent.mm.protobuf.f d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "data is null");
            return null;
        }
        o32.k kVar = new o32.k();
        try {
            kVar.parseFrom(bArr);
            this.f288123e = kVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest cmd has been received");
            return kVar;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest.parseFrom Failed!!! %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public void e(int i17, java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "setSendDataToManufacturerResponse ret = " + i17 + str);
        o32.l lVar = new o32.l();
        o32.e eVar = new o32.e();
        this.f288121c = eVar;
        eVar.f342694d = i17;
        eVar.f342695e = str;
        lVar.f342714d = eVar;
        if (bArr == null) {
            bArr = new byte[0];
        }
        lVar.f342717e = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
        this.f288122d = lVar;
        this.f288120b = (short) 20002;
    }
}
