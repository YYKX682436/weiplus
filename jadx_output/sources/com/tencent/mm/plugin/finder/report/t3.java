package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.t3 f125364a = new com.tencent.mm.plugin.finder.report.t3();

    public final void a(java.lang.String requestId, java.lang.String str, int i17, java.util.HashMap exposeItemMap, int i18) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(exposeItemMap, "exposeItemMap");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String t17 = r26.i0.t(str, ",", " ", false);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        long j17 = 0;
        for (com.tencent.mm.plugin.finder.search.e0 e0Var : exposeItemMap.values()) {
            if (!e0Var.f125669e) {
                e0Var.f125669e = true;
                stringBuffer.append(e0Var.f125665a);
                stringBuffer.append("#");
                stringBuffer.append(e0Var.f125667c);
                stringBuffer.append("#");
                stringBuffer.append(e0Var.f125666b);
                stringBuffer.append("#");
                stringBuffer.append(e0Var.f125668d);
                stringBuffer.append(";");
                long j18 = e0Var.f125668d;
                if (j18 < j17) {
                    j17 = j18;
                }
            }
        }
        if (stringBuffer.length() == 0) {
            return;
        }
        java.lang.String str2 = requestId + ',' + t17 + ',' + i17 + ',' + ((java.lang.Object) stringBuffer) + ',' + i18 + ',' + (java.lang.System.currentTimeMillis() - j17) + ',' + (!exposeItemMap.isEmpty() ? 1 : 0);
        com.tencent.mars.xlog.Log.i("Finder.FinderSearchReportLogic", "report18691 " + str2);
        jx3.f.INSTANCE.kvStat(18691, str2);
    }
}
