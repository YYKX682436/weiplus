package yz3;

@j95.b
/* loaded from: classes.dex */
public final class m extends i95.w implements kd0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public int f468534d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f468535e;

    public m() {
        try {
            Ai();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanEntryConfigService", th6, "updateConfig exception", new java.lang.Object[0]);
        }
    }

    public void Ai() {
        int nj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.scan.RepairerConfigScanWeDrop());
        this.f468534d = nj6;
        this.f468535e = nj6 == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanEntryConfigService", "updateConfig weDropConfig: " + this.f468534d + ", showSendFileEntry: " + this.f468535e);
    }

    public int wi() {
        if (!this.f468535e) {
            yz3.p[] pVarArr = yz3.p.f468540d;
            yz3.p[] pVarArr2 = yz3.p.f468540d;
            yz3.p[] pVarArr3 = yz3.p.f468540d;
            return 11;
        }
        yz3.p[] pVarArr4 = yz3.p.f468540d;
        yz3.p[] pVarArr5 = yz3.p.f468540d;
        yz3.p[] pVarArr6 = yz3.p.f468540d;
        yz3.p[] pVarArr7 = yz3.p.f468540d;
        return 15;
    }
}
