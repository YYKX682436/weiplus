package com.tencent.mm.plugin.finder.report;

/* loaded from: classes4.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.o4 f125220a = new com.tencent.mm.plugin.finder.report.o4();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f125221b;

    public static void a(com.tencent.mm.plugin.finder.report.o4 o4Var, java.lang.String sessionID, int i17, java.lang.String wording, boolean z17, boolean z18, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            wording = "";
        }
        if ((i18 & 8) != 0) {
            z17 = true;
        }
        if ((i18 & 16) != 0) {
            z18 = true;
        }
        if ((i18 & 32) != 0) {
            j17 = 0;
        }
        o4Var.getClass();
        kotlin.jvm.internal.o.g(sessionID, "sessionID");
        kotlin.jvm.internal.o.g(wording, "wording");
        com.tencent.mm.autogen.mmdata.rpt.FinderSnsPostStruct finderSnsPostStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSnsPostStruct();
        java.lang.String str = f125221b;
        if (str != null) {
            sessionID = str;
        }
        finderSnsPostStruct.f57837d = finderSnsPostStruct.b("SessinId", sessionID, true);
        f125221b = null;
        finderSnsPostStruct.f57838e = i17;
        finderSnsPostStruct.f57839f = c01.id.c();
        finderSnsPostStruct.f57842i = finderSnsPostStruct.b("FinderFeedId", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(j17), true);
        finderSnsPostStruct.f57843j = z17 ? 1L : 0L;
        finderSnsPostStruct.f57844k = z18 ? 1L : 0L;
        finderSnsPostStruct.f57845l = finderSnsPostStruct.b("Wording", wording, true);
        finderSnsPostStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderSnsPostStruct);
    }
}
