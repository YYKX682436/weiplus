package gi3;

/* loaded from: classes10.dex */
public abstract class c {
    public static void a(gi3.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoEditReporter", "[report-VideoEditCountData] %s", aVar.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14529, java.lang.Integer.valueOf(aVar.f272274a), java.lang.Integer.valueOf(aVar.f272275b));
    }

    public static void b(gi3.b bVar, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[14];
        objArr[0] = java.lang.Integer.valueOf(bVar.f272276a);
        objArr[1] = java.lang.Integer.valueOf(bVar.f272277b ? 2 : 1);
        objArr[2] = java.lang.Integer.valueOf(bVar.f272280e);
        objArr[3] = java.lang.Integer.valueOf(bVar.f272281f);
        objArr[4] = java.lang.Integer.valueOf(bVar.f272284i);
        objArr[5] = java.lang.Boolean.valueOf(bVar.f272282g);
        objArr[6] = java.lang.Integer.valueOf(bVar.f272283h);
        objArr[7] = java.lang.Integer.valueOf(bVar.f272278c);
        objArr[8] = java.lang.Integer.valueOf(bVar.f272279d);
        objArr[9] = java.lang.Integer.valueOf(bVar.f272285j);
        objArr[10] = 0;
        objArr[11] = java.lang.Integer.valueOf(bVar.f272286k);
        objArr[12] = str;
        objArr[13] = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1());
        g0Var.d(14362, objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoEditReporter", "[report-VideoEditDetailData] %s", bVar.toString());
    }
}
