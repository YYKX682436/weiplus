package u90;

@j95.b
/* loaded from: classes8.dex */
public class v extends i95.w implements v90.x {
    public void wi(int i17, float f17, float f18, int i18) {
        java.util.HashMap hashMap = com.tencent.mm.modelstat.i0.f71511a;
        synchronized (com.tencent.mm.modelstat.i0.class) {
            if (i17 < 2000 || f17 == 0.0f || f18 == 0.0f) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "reportGps, invalid args, scene = %d, lon = %f, lat = %f, pre = %d", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i18));
                return;
            }
            long j17 = com.tencent.mm.modelstat.i0.f71524n;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (java.lang.System.currentTimeMillis() - j17 < 60000) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "reportGps, hit lastReportGpsLimit, request dropped, scene = %d, lon = %f, lat = %f, pre = %d", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i18));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "reportGps scene:%d lon:%f lat:%f pre:%d last:%d", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.tencent.mm.modelstat.i0.f71524n));
            com.tencent.mm.modelstat.i0.f71524n = java.lang.System.currentTimeMillis();
            com.tencent.mm.modelstat.i0.f71523m = i17;
            com.tencent.mm.modelstat.i0.f71519i = java.lang.System.currentTimeMillis();
            com.tencent.mm.modelstat.i0.f71522l = i18;
            com.tencent.mm.modelstat.i0.f71520j = f18;
            com.tencent.mm.modelstat.i0.f71521k = f17;
            com.tencent.mm.autogen.events.GpsInfoEvent gpsInfoEvent = new com.tencent.mm.autogen.events.GpsInfoEvent();
            am.ch chVar = gpsInfoEvent.f54427g;
            chVar.f6353a = i17;
            chVar.f6354b = java.lang.System.currentTimeMillis();
            am.ch chVar2 = gpsInfoEvent.f54427g;
            chVar2.f6355c = i18;
            chVar2.f6356d = f17;
            chVar2.f6357e = f18;
            gpsInfoEvent.e();
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetTypeReporter", "reportGps failed, no location perms: scene=%d", java.lang.Integer.valueOf(i17));
                return;
            }
            try {
                gm0.j1.e().k(new com.tencent.mm.modelstat.g0(), 5000L);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "reportGps :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
    }
}
