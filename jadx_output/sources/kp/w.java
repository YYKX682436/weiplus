package kp;

/* loaded from: classes13.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.WifiManager f310847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f310850g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.net.wifi.WifiManager wifiManager, java.lang.String str, kp.i1 i1Var, kotlinx.coroutines.q qVar) {
        super(1);
        this.f310847d = wifiManager;
        this.f310848e = str;
        this.f310849f = i1Var;
        this.f310850g = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kotlinx.coroutines.q qVar = this.f310850g;
        kp.i1 i1Var = this.f310849f;
        if (booleanValue) {
            android.net.wifi.WifiInfo wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(this.f310847d, "com/tencent/mm/connection/near/WiFiDirectService$connectLegacyWifi$2$1$1", "invoke", "(Z)V", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
            if (kotlin.jvm.internal.o.b(wifiInfo != null ? wifiInfo.getSSID() : null, this.f310848e)) {
                com.tencent.mars.xlog.Log.i("WiFiDirectService", "connectToGroupCallback: connect success");
                i1Var.f310770n = null;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new gz.a(true, null, null, 6, null)));
            }
        } else {
            i1Var.f310770n = null;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new gz.a(false, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR, "connectToGroup: connectToGroupCallback: connect failed")));
        }
        return jz5.f0.f302826a;
    }
}
