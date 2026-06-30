package gq1;

/* loaded from: classes13.dex */
public class p extends gq1.s {
    @Override // gq1.s
    public boolean b(byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconTLVSectionA", "valueByte is null or nil");
            return false;
        }
        if (2 != this.f274541a) {
            return false;
        }
        byte b17 = bArr[0];
        return true;
    }
}
