package gi1;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f272248a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f272249b = new java.lang.Object();

    public static void a(final java.lang.String str, final int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceServiceVoipCallSubIdStatusCache", "putVoipCallSubIdStatus: subId = " + str + ", status = " + i17);
        synchronized (f272249b) {
            f272248a.put(str, java.lang.Integer.valueOf(i17));
        }
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: gi1.n$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.sdk.platformtools.o4.J("appbrand_service_voip_call_id_status_mmkv_name", gm0.j1.b().h(), 2).A(str, i17);
            }
        });
    }
}
