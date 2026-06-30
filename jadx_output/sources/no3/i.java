package no3;

/* loaded from: classes11.dex */
public class i implements com.tencent.mm.storage.i8 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f338761d = true;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f338762e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f338763f = new no3.h(this, android.os.Looper.getMainLooper());

    @Override // com.tencent.mm.storage.i8
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationObserver", "event: %d", java.lang.Integer.valueOf(i17));
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            int i18 = 0;
            if (!(c01.d9.f37105b == null)) {
                i18 = (int) ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(str).E2;
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).k0(str);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f338763f;
            n3Var.removeMessages(i18);
            android.os.Message obtain = android.os.Message.obtain();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("com.tencent.mm.notification.observer", str);
            obtain.setData(bundle);
            obtain.what = i18;
            n3Var.sendMessageDelayed(obtain, 50L);
        }
    }
}
