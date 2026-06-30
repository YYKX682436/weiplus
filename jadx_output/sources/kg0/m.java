package kg0;

@j95.b
/* loaded from: classes14.dex */
public class m extends i95.w implements bd0.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f307680d = new java.util.concurrent.ConcurrentHashMap();

    public void Ai(java.lang.String roomUin, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPFeatureReportService", "newInstance %s", roomUin);
        mg0.a aVar = new mg0.a();
        kotlin.jvm.internal.o.g(roomUin, "roomUin");
        aVar.f326197a = roomUin;
        aVar.f326200d = i17;
        ((java.util.concurrent.ConcurrentHashMap) this.f307680d).put(roomUin, aVar);
    }

    public void Bi(java.lang.String str, boolean z17, int i17) {
        mg0.a wi6 = wi(str);
        if (wi6 != null) {
            if (wi6.f326202f < 1) {
                wi6.f326202f = 1;
            }
            com.tencent.mm.autogen.mmdata.rpt.VoIPMobileReportStruct voIPMobileReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoIPMobileReportStruct();
            voIPMobileReportStruct.f61640e = voIPMobileReportStruct.b("RoomUin", wi6.f326197a, true);
            voIPMobileReportStruct.f61642g = wi6.f326198b;
            voIPMobileReportStruct.f61641f = wi6.f326199c;
            voIPMobileReportStruct.f61639d = wi6.f326200d;
            voIPMobileReportStruct.f61643h = 1;
            voIPMobileReportStruct.f61644i = 10;
            voIPMobileReportStruct.f61645j = z17 ? 1 : 0;
            voIPMobileReportStruct.o();
            voIPMobileReportStruct.k();
        }
    }

    public void Di(java.lang.String roomUin, int i17, int i18, int i19) {
        mg0.a wi6 = wi(roomUin);
        if (wi6 != null) {
            kotlin.jvm.internal.o.g(roomUin, "roomUin");
            wi6.f326197a = roomUin;
            wi6.f326198b = i17;
            wi6.f326199c = i18;
            if (wi6.f326201e) {
                wi6.a();
            }
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        ((java.util.concurrent.ConcurrentHashMap) this.f307680d).clear();
    }

    public final mg0.a wi(java.lang.String str) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.f307680d;
        mg0.a aVar = (mg0.a) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).get(str);
        if (aVar == null && (aVar = (mg0.a) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).get("0")) != null) {
            ((java.util.concurrent.ConcurrentHashMap) concurrentMap).put(str, aVar);
        }
        return aVar;
    }
}
