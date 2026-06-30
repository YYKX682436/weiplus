package o45;

/* loaded from: classes12.dex */
public abstract class ji {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f342972a = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);

    public static boolean a() {
        try {
            return j62.e.g().l("clicfg_synccheck_3", false, true, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSyncCheck", "synccheck3 useSyncCheck3 failed: " + e17.getMessage());
            return false;
        }
    }
}
