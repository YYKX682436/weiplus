package pm1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final pm1.d f356814e = new pm1.d(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f356815f = jz5.h.b(pm1.c.f356813d);

    /* renamed from: a, reason: collision with root package name */
    public final pm1.o f356816a;

    /* renamed from: b, reason: collision with root package name */
    public final pm1.w f356817b;

    /* renamed from: c, reason: collision with root package name */
    public final pm1.s f356818c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f356819d;

    public e() {
        boolean z17;
        pm1.o oVar = new pm1.o();
        this.f356816a = oVar;
        pm1.w wVar = new pm1.w();
        this.f356817b = wVar;
        pm1.s sVar = new pm1.s();
        this.f356818c = sVar;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object systemService = context.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        audioManager.addOnCommunicationDeviceChangedListener(pm1.a.f356811d, oVar);
        audioManager.addOnModeChangedListener(pm1.b.f356812d, sVar);
        try {
            z17 = true;
            context.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, wVar);
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.e("AudioCache", jz5.a.b(e17));
            z17 = false;
        }
        this.f356819d = z17;
        com.tencent.mars.xlog.Log.i("AudioCache", "AudioCache is enable, audioVolumeCacheAvailable=" + z17);
    }
}
