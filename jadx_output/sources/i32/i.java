package i32;

/* loaded from: classes8.dex */
public class i extends i32.k {
    public i(int i17, int i18, long j17) {
        o32.n nVar = new o32.n();
        nVar.f342720d = new o32.c();
        nVar.f342721e = i17;
        nVar.f342722f = i18;
        this.f288122d = nVar;
        this.f288119a = j17;
        this.f288120b = (short) 30002;
    }

    @Override // i32.d
    public byte[] c() {
        try {
            return this.f288122d.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "mResp.toByteArray() Failed!!! %s", e17.getMessage());
            return null;
        }
    }
}
