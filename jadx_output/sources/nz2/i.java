package nz2;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz2.n f341559d;

    public i(nz2.n nVar) {
        this.f341559d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean d17 = mz2.n0.d();
        nz2.n nVar = this.f341559d;
        if (!d17) {
            try {
                nz2.n.b(nVar, com.tencent.mm.sdk.platformtools.x2.f193071a);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HuaweiBiometricPayManagerImpl", e17, "", new java.lang.Object[0]);
                mz2.n0.e(false);
            }
        }
        if (!mz2.n0.f333160a) {
            try {
                com.tencent.mm.plugin.wxpay.g.class.getClassLoader();
                if (android.text.TextUtils.isEmpty(fp.d0.g("teec"))) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "can not LoadLibrary fingerprintauth.so, because can not find the libteec");
                    mz2.n0.f333160a = false;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "LoadLibrary fingerprintauth.so, find the libteec so");
                    fp.d0.n("fingerprintauth");
                    mz2.n0.f333160a = true;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HuaweiBiometricPayManagerImpl", th6, "", new java.lang.Object[0]);
                mz2.n0.f333160a = false;
            }
        }
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "initRsaKey");
        if (!mz2.n0.d()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "device is not support");
            return;
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "user had not reg wxpay or is isSimpleReg");
            return;
        }
        try {
            java.lang.String b17 = mz2.n0.b();
            com.tencent.mars.xlog.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "initRsaKey userId:" + b17);
            java.lang.String rsaKey = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.getRsaKey(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), b17, wo.w0.k());
            if (android.text.TextUtils.isEmpty(rsaKey)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "FingerPrintAuth.getRsaKey() is null");
                rsaKey = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.genRsaKey(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), mz2.n0.b(), wo.w0.k());
            }
            if (android.text.TextUtils.isEmpty(rsaKey)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "FingerPrintAuth.genRsaKey() return null");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "initRsaKey success!");
            }
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HuaweiBiometricPayManagerImpl", e18, "", new java.lang.Object[0]);
        }
    }
}
