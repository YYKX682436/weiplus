package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y3 f125472a = new com.tencent.mm.plugin.finder.report.y3();

    public static void a(com.tencent.mm.plugin.finder.report.y3 y3Var, r45.qt2 qt2Var, int i17, long j17, int i18, int i19, java.lang.String wording, java.lang.Integer num, java.lang.String str, int i27, java.lang.Object obj) {
        java.lang.Integer num2 = (i27 & 64) != 0 ? null : num;
        java.lang.String str2 = (i27 & 128) != 0 ? "" : str;
        y3Var.getClass();
        kotlin.jvm.internal.o.g(wording, "wording");
        if (qt2Var != null) {
            boolean Dk = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dk();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderShareReporter.report21673, sessionId = ");
            sb6.append(qt2Var.getString(0));
            sb6.append(", clickTabContextId = ");
            sb6.append(qt2Var.getString(2));
            sb6.append(", contextId = ");
            sb6.append(qt2Var.getString(1));
            sb6.append(", commentScene = ");
            sb6.append(qt2Var.getInteger(5));
            sb6.append(", eventCode = ");
            sb6.append(i17);
            sb6.append(", eventTime = ");
            sb6.append(j17);
            sb6.append(", index = ");
            sb6.append(i18);
            sb6.append(", jumpType=");
            sb6.append(i19);
            sb6.append(", entranceStatus=");
            sb6.append(Dk ? 1 : 0);
            sb6.append(", wording=");
            sb6.append(wording);
            sb6.append(", frilikecnt=");
            sb6.append(num2 == null ? "null" : num2);
            com.tencent.mars.xlog.Log.i("Finder.FinderShareReporter", sb6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21673, qt2Var.getString(0), qt2Var.getString(2), qt2Var.getString(1), java.lang.Integer.valueOf(qt2Var.getInteger(5)), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(Dk ? 1 : 0), wording, num2, str2);
        }
    }

    public static void b(com.tencent.mm.plugin.finder.report.y3 y3Var, android.content.Context context, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            str = "";
        }
        java.lang.String position = str;
        y3Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(position, "position");
        long c17 = c01.id.c();
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mars.xlog.Log.i("Finder.FinderShareReporter", "FinderShareReporter.report21856, sessionId = " + V6.getString(0) + ", clickTabContextId = " + V6.getString(2) + ", contextId = " + V6.getString(1) + ", commentScene = " + V6.getInteger(5) + ", eventCode = " + i17 + ", eventTime = " + c17 + ", position = " + position);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21856, V6.getString(0), V6.getString(2), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c17), position);
    }
}
