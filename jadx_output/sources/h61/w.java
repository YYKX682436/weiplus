package h61;

/* loaded from: classes9.dex */
public class w implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.x f279176a;

    public w(h61.x xVar) {
        this.f279176a = xVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        h61.t tVar = this.f279176a.f279177a;
        tVar.getClass();
        tVar.f279173g = km5.u.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAALogic", "launchAAByPerson");
        if (tVar.f279170d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
            tVar.f279173g.a(java.lang.Boolean.FALSE);
            return null;
        }
        if (map == null || map.size() == 0) {
            tVar.f279173g.a(java.lang.Boolean.FALSE);
            return null;
        }
        tVar.f279170d = true;
        tVar.f279172f = map;
        tVar.f279171e = 3;
        if (!map.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE) || !tVar.f279172f.containsKey("totalPayAmount") || !tVar.f279172f.containsKey("payerlist") || !tVar.f279172f.containsKey("launchScene") || !tVar.f279172f.containsKey("chatRoomName") || !tVar.f279172f.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            tVar.f279173g.a(java.lang.Boolean.FALSE);
            tVar.f279170d = false;
            return null;
        }
        try {
            java.lang.String str = (java.lang.String) tVar.f279172f.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            long longValue = ((java.lang.Long) tVar.f279172f.get("totalPayAmount")).longValue();
            java.util.List list = (java.util.List) tVar.f279172f.get("payerlist");
            int intValue = ((java.lang.Integer) tVar.f279172f.get("launchScene")).intValue();
            java.lang.String str2 = (java.lang.String) tVar.f279172f.get("chatRoomName");
            long longValue2 = ((java.lang.Long) tVar.f279172f.get(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)).longValue();
            java.lang.String str3 = (java.lang.String) tVar.f279172f.get("pic_cdn_url");
            java.lang.String str4 = (java.lang.String) tVar.f279172f.get("pic_cdn_thumb_url");
            java.lang.String str5 = (java.lang.String) tVar.f279172f.get("pf_order_no");
            java.lang.String str6 = (java.lang.String) tVar.f279172f.get("pic_cdn_md5");
            boolean booleanValue = ((java.lang.Boolean) tVar.f279172f.get("isGroupSolitatire")).booleanValue();
            java.util.LinkedList linkedList = new java.util.LinkedList((java.util.List) tVar.f279172f.get("payerlistGroupSolitatire"));
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new i61.g(str, longValue, list, intValue, str2, longValue2, str3, str4, str5, str6, booleanValue, linkedList));
            int size = list.size();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, (size <= 0 || size > 10) ? (size <= 10 || size > 20) ? (size <= 20 || size > 50) ? 20 : 19 : 18 : 17, 1L, false);
            tVar.f279173g.b();
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAALogic", "launchAAByPerson error: %s", e17.getMessage());
            tVar.f279173g.a(java.lang.Boolean.FALSE);
            tVar.f279170d = false;
            return null;
        }
    }
}
