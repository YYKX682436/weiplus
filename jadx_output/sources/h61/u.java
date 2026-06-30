package h61;

/* loaded from: classes9.dex */
public class u implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.x f279174a;

    public u(h61.x xVar) {
        this.f279174a = xVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        h61.t tVar = this.f279174a.f279177a;
        int intValue = ((java.lang.Integer) bVar.a(0)).intValue();
        java.util.Map map = (java.util.Map) bVar.a(1);
        tVar.getClass();
        tVar.f279173g = km5.u.b();
        if (tVar.f279170d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
            tVar.f279173g.a(java.lang.Boolean.FALSE);
            return null;
        }
        if (map == null || map.size() == 0) {
            tVar.f279173g.a(java.lang.Boolean.FALSE);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAALogic", "launchAAByMoney, data.keySet: %s", map.keySet());
        tVar.f279170d = true;
        tVar.f279172f = map;
        tVar.f279171e = intValue;
        if (intValue == 1) {
            if (!map.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE) || !tVar.f279172f.containsKey("perAmount") || !tVar.f279172f.containsKey("totalUserNumber") || !tVar.f279172f.containsKey("launchScene") || !tVar.f279172f.containsKey("chatRoomName") || !tVar.f279172f.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
                tVar.f279173g.a(java.lang.Boolean.FALSE);
                tVar.f279170d = false;
                return null;
            }
            try {
                java.lang.String str = (java.lang.String) tVar.f279172f.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                long longValue = ((java.lang.Long) tVar.f279172f.get("perAmount")).longValue();
                int intValue2 = ((java.lang.Integer) tVar.f279172f.get("totalUserNumber")).intValue();
                int intValue3 = ((java.lang.Integer) tVar.f279172f.get("launchScene")).intValue();
                java.lang.String str2 = (java.lang.String) tVar.f279172f.get("chatRoomName");
                long longValue2 = ((java.lang.Long) tVar.f279172f.get(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)).longValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAALogic", "launchAAByMoney");
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new i61.f(longValue, str, intValue2, intValue3, longValue2, str2));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, (intValue2 <= 0 || intValue2 > 10) ? (intValue2 <= 10 || intValue2 > 20) ? (intValue2 <= 20 || intValue2 > 50) ? 16 : 15 : 14 : 13, 1L, false);
                tVar.f279173g.b();
                return null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAALogic", "launchAAByMoney, without specific user error: %s", e17.getMessage());
                tVar.f279173g.a(java.lang.Boolean.FALSE);
                tVar.f279170d = false;
                return null;
            }
        }
        if (intValue != 2) {
            return null;
        }
        if (!map.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE) || !tVar.f279172f.containsKey("perAmount") || !tVar.f279172f.containsKey("payerlist") || !tVar.f279172f.containsKey("launchScene") || !tVar.f279172f.containsKey("chatRoomName") || !tVar.f279172f.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            tVar.f279173g.a(java.lang.Boolean.FALSE);
            tVar.f279170d = false;
            return null;
        }
        try {
            java.lang.String str3 = (java.lang.String) tVar.f279172f.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            long longValue3 = ((java.lang.Long) tVar.f279172f.get("perAmount")).longValue();
            java.util.List list = (java.util.List) tVar.f279172f.get("payerlist");
            int intValue4 = ((java.lang.Integer) tVar.f279172f.get("launchScene")).intValue();
            java.lang.String str4 = (java.lang.String) tVar.f279172f.get("chatRoomName");
            long longValue4 = ((java.lang.Long) tVar.f279172f.get(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)).longValue();
            java.lang.String str5 = (java.lang.String) tVar.f279172f.get("pic_cdn_url");
            java.lang.String str6 = (java.lang.String) tVar.f279172f.get("pic_cdn_thumb_url");
            java.lang.String str7 = (java.lang.String) tVar.f279172f.get("pf_order_no");
            java.lang.String str8 = (java.lang.String) tVar.f279172f.get("pic_cdn_md5");
            boolean booleanValue = ((java.lang.Boolean) tVar.f279172f.get("isGroupSolitatire")).booleanValue();
            java.util.LinkedList linkedList = new java.util.LinkedList((java.util.List) tVar.f279172f.get("payerlistGroupSolitatire"));
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new i61.f(longValue3, str3, list, intValue4, longValue4, str4, str5, str6, str7, str8, booleanValue, linkedList));
            int size = list.size();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, (size <= 0 || size > 10) ? (size <= 10 || size > 20) ? (size <= 20 || size > 50) ? 16 : 15 : 14 : 13, 1L, false);
            tVar.f279173g.b();
            return null;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAALogic", "launchAAByMoney, specific user error: %", e18.getMessage());
            tVar.f279173g.a(java.lang.Boolean.FALSE);
            tVar.f279170d = false;
            return null;
        }
    }
}
