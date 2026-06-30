package mz2;

/* loaded from: classes9.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333168d;

    public p0(mz2.q0 q0Var, java.lang.String str) {
        this.f333168d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f333168d;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "rsaKey is null");
        }
        oz2.e eVar = new oz2.e(str);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(eVar);
    }
}
