package lb;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f317655b;

    /* renamed from: c, reason: collision with root package name */
    public lb.i f317656c;

    /* renamed from: d, reason: collision with root package name */
    public lb.c f317657d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317658e;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f317654a = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public final android.content.ServiceConnection f317659f = new lb.d(this, null);

    public e(android.content.Context context) {
        new lb.a(this);
        this.f317655b = new java.lang.ref.WeakReference(context);
    }

    public static void a(lb.e eVar) {
        android.content.Context context;
        synchronized (eVar.f317654a) {
            if (eVar.f317656c == null) {
                android.content.Intent intent = new android.content.Intent("com.huawei.nfc.action.OPEN_AIDL_API_PAY");
                intent.setPackage("com.huawei.wallet");
                java.lang.ref.WeakReference weakReference = eVar.f317655b;
                boolean bindService = (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) ? false : context.bindService(intent, eVar.f317659f, 1);
                "---bindService---end:".concat(java.lang.String.valueOf(bindService));
                if (bindService) {
                    eVar.f317658e = true;
                    if (eVar.f317656c == null) {
                        try {
                            eVar.f317654a.wait();
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                lb.c cVar = eVar.f317657d;
                if (cVar != null) {
                    ((com.unionpay.i) cVar).a(0, new android.os.Bundle());
                }
                eVar.b();
            }
        }
    }

    public final void b() {
        android.content.ServiceConnection serviceConnection;
        if (this.f317658e) {
            this.f317658e = false;
            this.f317656c = null;
            java.lang.ref.WeakReference weakReference = this.f317655b;
            if (weakReference == null || (serviceConnection = this.f317659f) == null) {
                return;
            }
            try {
                android.content.Context context = (android.content.Context) weakReference.get();
                if (context != null) {
                    context.unbindService(serviceConnection);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
