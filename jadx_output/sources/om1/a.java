package om1;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f346263a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f346264b;

    /* renamed from: c, reason: collision with root package name */
    public static int f346265c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f346266d;

    /* renamed from: e, reason: collision with root package name */
    public static long f346267e;

    public static final void a() {
        long j17 = f346267e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        wo.c cVar = wo.v1.f447823c;
        int i17 = cVar.f447627t;
        if (i17 == -1) {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_audio_bluetooth_forbid_use_sco_refresh_time, 50);
        }
        if (elapsedRealtime > i17 * 1000) {
            int i18 = cVar.f447625s;
            if (i18 == -1) {
                i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_audio_bluetooth_forbid_use_sco_strategy, 1);
            }
            if (i18 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothMgr", "refresh forbidden time");
                an1.c.f8836d = true;
            }
        }
        f346265c = 0;
    }
}
