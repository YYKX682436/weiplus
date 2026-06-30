package t62;

/* loaded from: classes12.dex */
public class f extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f416001h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi extControlProviderOpenApi, long j17, java.lang.Integer num, boolean z17, java.lang.String[] strArr) {
        super(j17, num, z17);
        this.f416001h = strArr;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        java.lang.String[] strArr = this.f416001h;
        try {
            com.tencent.mm.autogen.events.ExtConnectWifiEvent extConnectWifiEvent = new com.tencent.mm.autogen.events.ExtConnectWifiEvent();
            am.a8 a8Var = extConnectWifiEvent.f54192g;
            com.tencent.mm.sdk.platformtools.t8.P(strArr[0], 0);
            a8Var.getClass();
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[2];
            com.tencent.mm.sdk.platformtools.t8.P(strArr[3], 0);
            extConnectWifiEvent.f192364d = new t62.e(this, extConnectWifiEvent);
            if (!extConnectWifiEvent.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderOpenApi", "connectWifi publish getWifiListEvent fail");
                c(8);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderOpenApi", "exception in connectWifi syncTaskInt.", e17);
            c(12);
        }
        return 0;
    }
}
