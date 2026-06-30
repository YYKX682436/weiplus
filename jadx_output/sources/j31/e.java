package j31;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j31.e f297392a = new j31.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f297393b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f297394c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static int f297395d;

    public static final void a(int i17, j31.c reportInfo, int i18, int i19, java.lang.String str) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgReporter", "reportFooterRejectMsgOp opType: %s, username: %s, jumpType: %s, jumpInfo: %s businessType: " + i18 + " containerType: " + i19 + ' ', java.lang.Integer.valueOf(i17), reportInfo.f297369a, java.lang.Integer.valueOf(reportInfo.f297375g), reportInfo.f297376h);
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[28];
        objArr[0] = reportInfo.f297369a;
        objArr[1] = reportInfo.f297371c;
        objArr[2] = java.lang.Integer.valueOf(reportInfo.f297372d);
        objArr[3] = reportInfo.f297373e;
        objArr[4] = reportInfo.f297374f;
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[7] = java.lang.Integer.valueOf(reportInfo.f297375g);
        objArr[8] = reportInfo.f297376h;
        objArr[9] = java.lang.Integer.valueOf(reportInfo.f297370b);
        objArr[10] = java.lang.Integer.valueOf(i18);
        objArr[11] = java.lang.Integer.valueOf(i19);
        objArr[12] = java.lang.Integer.valueOf(reportInfo.f297377i);
        objArr[13] = java.lang.Integer.valueOf(reportInfo.f297378j);
        objArr[14] = java.lang.Integer.valueOf(reportInfo.f297379k);
        objArr[15] = reportInfo.f297380l;
        objArr[16] = java.lang.Integer.valueOf(reportInfo.f297381m);
        objArr[17] = reportInfo.f297383o;
        objArr[18] = reportInfo.f297382n;
        objArr[19] = str;
        objArr[20] = i17 == 17 ? reportInfo.f297384p : null;
        objArr[21] = reportInfo.f297385q;
        objArr[22] = java.lang.Integer.valueOf(reportInfo.f297386r);
        objArr[23] = java.lang.Integer.valueOf(reportInfo.f297387s);
        objArr[24] = java.lang.Integer.valueOf(reportInfo.f297388t);
        objArr[25] = reportInfo.f297389u;
        objArr[26] = java.lang.Integer.valueOf(reportInfo.f297390v);
        objArr[27] = reportInfo.f297391w;
        fVar.d(21811, objArr);
    }

    public static final void b(int i17, j31.c reportInfo, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgReporter", "reportNewBizTypeMsgOp opType: %s, username: %s, jumpType: %s, jumpInfo: %s businessType: " + i18, java.lang.Integer.valueOf(i17), reportInfo.f297369a, java.lang.Integer.valueOf(reportInfo.f297375g), reportInfo.f297376h);
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[28];
        objArr[0] = reportInfo.f297369a;
        objArr[1] = reportInfo.f297371c;
        objArr[2] = java.lang.Integer.valueOf(reportInfo.f297372d);
        objArr[3] = reportInfo.f297373e;
        objArr[4] = reportInfo.f297374f;
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[7] = java.lang.Integer.valueOf(reportInfo.f297375g);
        objArr[8] = reportInfo.f297376h;
        objArr[9] = java.lang.Integer.valueOf(reportInfo.f297370b);
        objArr[10] = java.lang.Integer.valueOf(i18);
        objArr[11] = 0;
        objArr[12] = java.lang.Integer.valueOf(reportInfo.f297377i);
        objArr[13] = java.lang.Integer.valueOf(reportInfo.f297378j);
        objArr[14] = java.lang.Integer.valueOf(reportInfo.f297379k);
        objArr[15] = reportInfo.f297380l;
        objArr[16] = java.lang.Integer.valueOf(reportInfo.f297381m);
        objArr[17] = reportInfo.f297383o;
        objArr[18] = reportInfo.f297382n;
        objArr[19] = str;
        objArr[20] = i17 == 17 ? reportInfo.f297384p : null;
        objArr[21] = reportInfo.f297385q;
        objArr[22] = java.lang.Integer.valueOf(reportInfo.f297386r);
        objArr[23] = java.lang.Integer.valueOf(reportInfo.f297387s);
        objArr[24] = java.lang.Integer.valueOf(reportInfo.f297388t);
        objArr[25] = reportInfo.f297389u;
        objArr[26] = java.lang.Integer.valueOf(reportInfo.f297390v);
        objArr[27] = reportInfo.f297391w;
        fVar.d(21811, objArr);
    }

    public static final void d(int i17, com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo reportInfo) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        jx3.f.INSTANCE.d(21814, reportInfo.f71840e, java.lang.Long.valueOf(reportInfo.f71841f), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(reportInfo.f71842g ? 1 : 0), java.lang.Integer.valueOf(reportInfo.f71843h), kz5.n0.g0(reportInfo.f71844i, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f71847o, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f71846n, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f71845m, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f71848p, "#", null, null, 0, null, null, 62, null), java.lang.Integer.valueOf(reportInfo.f71839d));
    }

    public final void c(int i17, j31.b reportInfo) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        if (i17 != 5) {
            jx3.f.INSTANCE.d(21802, reportInfo.f297363a, reportInfo.f297365c, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), kz5.n0.g0(reportInfo.f297366d, "#", null, null, 0, null, null, 62, null), kz5.n0.g0(reportInfo.f297367e, "#", null, null, 0, null, null, 62, null), java.lang.Integer.valueOf(reportInfo.f297368f), reportInfo.f297364b, 1);
        } else {
            jx3.f.INSTANCE.d(21802, reportInfo.f297363a, reportInfo.f297365c, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", "", 0, reportInfo.f297364b);
        }
    }

    public final void e(java.lang.String bizUsername, int i17, java.lang.String templateId, int i18, java.lang.String templateName, int i19) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(templateName, "templateName");
        jx3.f.INSTANCE.d(17638, bizUsername, java.lang.Integer.valueOf(i17), templateId, java.lang.Integer.valueOf(i18), templateName, java.lang.Integer.valueOf(i19));
    }
}
