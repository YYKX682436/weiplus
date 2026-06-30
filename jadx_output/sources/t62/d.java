package t62;

/* loaded from: classes12.dex */
public class d extends com.tencent.mm.sdk.platformtools.d8 {
    public d(com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi extControlProviderOpenApi, long j17, android.database.MatrixCursor matrixCursor, boolean z17, java.lang.String[] strArr) {
        super(j17, matrixCursor, z17);
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        try {
            com.tencent.mm.autogen.events.ExtGetWifiListEvent extGetWifiListEvent = new com.tencent.mm.autogen.events.ExtGetWifiListEvent();
            extGetWifiListEvent.f54198g.getClass();
            extGetWifiListEvent.f192364d = new t62.c(this, extGetWifiListEvent);
            if (extGetWifiListEvent.e()) {
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderOpenApi", "getWifiList publish getWifiListEvent fail");
            c(v25.a.a(8));
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderOpenApi", "exception in getWifiList syncTaskCur.", e17);
            c(v25.a.a(12));
            return null;
        }
    }
}
