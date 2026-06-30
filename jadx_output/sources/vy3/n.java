package vy3;

/* loaded from: classes.dex */
public final class n implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vy3.o f441477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f441478e;

    public n(vy3.o oVar, nw4.k kVar) {
        this.f441477d = oVar;
        this.f441478e = kVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSend", "ScanJsApi-Call:send requestCode with MMFragmentActivity: %s, resultCode: %s, data != null: %s", objArr);
        if (i17 == (this.f441477d.hashCode() & 65535) && i18 == -1 && intent != null && intent.getIntExtra("sendResult", -1) == 0) {
            ((ku5.t0) ku5.t0.f312615d).B(new vy3.m(this.f441478e));
        }
    }
}
