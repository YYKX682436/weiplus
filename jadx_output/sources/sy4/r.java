package sy4;

/* loaded from: classes15.dex */
public abstract class r {
    public static void a(java.lang.String str, int i17, boolean z17) {
        sy4.q qVar = new sy4.q();
        qVar.f413891a = str;
        qVar.f413893c = i17;
        qVar.f413894d = java.lang.System.currentTimeMillis();
        qVar.f413892b = sy4.m.f413884c.b(str).field_expId;
        qVar.f413895e = z17;
        b(qVar);
    }

    public static void b(sy4.q qVar) {
        if (qVar != null) {
            m21.x xVar = new m21.x();
            xVar.a("expid", qVar.f413892b + ",");
            xVar.a("appid", qVar.f413891a + ",");
            xVar.a("action", qVar.f413893c + ",");
            xVar.a(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, qVar.f413894d + ",");
            xVar.a("hasRedPoint", (qVar.f413895e ? 1 : 0) + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report ");
            sb6.append(xVar.c());
            com.tencent.mars.xlog.Log.i("WelabReporter", sb6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14206, xVar);
        }
    }
}
