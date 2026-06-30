package mz2;

/* loaded from: classes9.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz2.c1 f333093e;

    public b1(mz2.c1 c1Var, java.lang.String str) {
        this.f333093e = c1Var;
        this.f333092d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback running");
        android.os.Message obtainMessage = this.f333093e.f333095a.f333108h.obtainMessage();
        obtainMessage.what = 1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("rsaKey", this.f333092d);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }
}
