package pc1;

/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f353348a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static android.content.BroadcastReceiver f353349b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f353350c;

    public static void a(java.lang.String str) {
        java.util.Map map = f353348a;
        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "remove Beacon appid:%s", str);
        if (((java.util.concurrent.ConcurrentHashMap) map).size() != 0 || f353349b == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "bluetoothStateListener uninit");
        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(f353349b);
        f353349b = null;
    }
}
