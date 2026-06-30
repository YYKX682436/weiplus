package qs;

/* loaded from: classes8.dex */
public class v extends com.tencent.mm.sdk.event.n {
    public v() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GpsInfoEvent gpsInfoEvent = (com.tencent.mm.autogen.events.GpsInfoEvent) iEvent;
        z71.m wi6 = z71.m.wi();
        wi6.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (gpsInfoEvent != null) {
            try {
                am.ch chVar = gpsInfoEvent.f54427g;
                if (chVar != null) {
                    com.tencent.mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct aiWeixinGpsInfoStruct = wi6.f470535f;
                    aiWeixinGpsInfoStruct.f55027d = chVar.f6353a;
                    aiWeixinGpsInfoStruct.f55028e = chVar.f6354b;
                    aiWeixinGpsInfoStruct.f55029f = chVar.f6355c;
                    aiWeixinGpsInfoStruct.f55031h = aiWeixinGpsInfoStruct.b("latitude", chVar.f6357e + "", true);
                    aiWeixinGpsInfoStruct.f55030g = aiWeixinGpsInfoStruct.b("longitude", chVar.f6356d + "", true);
                    com.tencent.mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct aiWeixinGpsInfoStruct2 = wi6.f470535f;
                    c81.b wi7 = c81.b.wi();
                    wi7.requireAccountInitialized();
                    c81.a aVar = wi7.f39656d;
                    java.lang.String m17 = aiWeixinGpsInfoStruct2.m();
                    com.tencent.mm.sdk.platformtools.o4 a17 = aVar.a();
                    if (a17 != null) {
                        a17.putString("last_gps_info", m17);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiWeixinData", "note gps info cost [%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return false;
    }
}
