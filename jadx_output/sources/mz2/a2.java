package mz2;

/* loaded from: classes9.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz2.c2 f333087d;

    public a2(mz2.c2 c2Var) {
        this.f333087d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        if (mz2.n0.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncGenRsaKey", "device is support FingerPrintAuth");
            str = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.genRsaKey(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), mz2.n0.b(), wo.w0.k());
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncGenRsaKey", "device is not support FingerPrintAuth");
            str = "";
        }
        mz2.b2 b2Var = this.f333087d.f333096a;
        if (b2Var != null) {
            b2Var.a(str);
        }
    }
}
