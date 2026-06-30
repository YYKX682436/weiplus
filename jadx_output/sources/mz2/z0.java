package mz2;

/* loaded from: classes9.dex */
public class z0 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz2.b f333212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz2.d1 f333213b;

    public z0(mz2.d1 d1Var, pz2.b bVar) {
        this.f333213b = d1Var;
        this.f333212a = bVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HwFingerprintOpenDelegate", "result: %s", java.lang.Integer.valueOf(cVar.f341543a));
        int i17 = cVar.f341543a;
        pz2.b bVar = this.f333212a;
        java.lang.String str = "";
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HwFingerprintOpenDelegate", "identify success");
            this.f333213b.f333107g = cVar.f341544b;
            bVar.h(0, "");
            return;
        }
        if (i17 == 2005) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiz);
            re4.n.g(1000, -1000223, cVar.f341543a, "fingerprint error");
        } else if (i17 == 2007 || i17 == 10308) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HwFingerprintOpenDelegate", "hy: on error: %s", java.lang.Integer.valueOf(i17));
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiv);
            int i18 = cVar.f341543a;
            if (i18 == 10308) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jix);
                re4.n.g(6, -1000223, -1, "too many trial");
                bVar.h(-3, string);
                return;
            }
            re4.n.g(1000, -1000223, i18, "fingerprint error");
        } else if (i17 == 2001) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HwFingerprintOpenDelegate", "identify timeout");
        } else if (i17 == 2002) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HwFingerprintOpenDelegate", "identify FingerPrintConst.RESULT_NO_MATCH");
            bVar.h(-1, "");
            return;
        }
        bVar.h(-2, str);
    }
}
