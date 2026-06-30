package lo3;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f320178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo3.b f320179e;

    public a(lo3.b bVar, android.content.Intent intent) {
        this.f320179e = bVar;
        this.f320178d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        lo3.c cVar = this.f320179e.f320180a;
        android.content.Intent intent = this.f320178d;
        lo3.c cVar2 = lo3.c.INSTANCE;
        cVar.getClass();
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_disable_receive_oppo_app_feature, 0) > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ORIM", "disable orim");
                return;
            }
            android.os.Bundle bundleExtra = intent.getBundleExtra("sendData");
            if (bundleExtra == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ORIM", "sendData is null");
                return;
            }
            byte[] byteArray = bundleExtra.getByteArray("sendData");
            if (byteArray == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ORIM", "sendData is empty");
                return;
            }
            r45.k25 k25Var = new r45.k25();
            k25Var.parseFrom(byteArray);
            if (k25Var.f378332d != 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ORIM", "ret error:" + k25Var.f378332d);
                return;
            }
            if (android.text.TextUtils.isEmpty(k25Var.f378334f)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ORIM", "id is empty");
                return;
            }
            com.tencent.mm.network.g1 c17 = com.tencent.mm.network.x2.c();
            if (c17 != null && c17.f71993n != null) {
                byte[] bArr = null;
                android.os.Bundle call = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().call(android.net.Uri.parse("content://com.oplus.phonemanager.AppRiskProvider"), k25Var.f378334f, (java.lang.String) null, (android.os.Bundle) null);
                if (call == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ORIM", "return null");
                } else {
                    byte[] byteArray2 = call.getByteArray("outputData");
                    if (byteArray2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ORIM", "result is null");
                    } else {
                        bArr = byteArray2;
                    }
                }
                if (bArr == null) {
                    return;
                }
                w04.l.INSTANCE.D7(bArr);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ORIM", "error: " + th6);
        }
    }
}
