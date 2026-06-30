package po5;

/* loaded from: classes11.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final po5.h f357353d = new po5.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("wifi");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) systemService;
        return android.os.Build.VERSION.SDK_INT >= 29 ? wifiManager.createWifiLock(4, "VoIPMPLowLatencyLock") : wifiManager.createWifiLock(1, "VoIPMPLock");
    }
}
