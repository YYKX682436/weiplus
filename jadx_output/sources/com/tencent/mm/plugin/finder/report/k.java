package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f125089a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f125090b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f125091c = "";

    public static void a(com.tencent.mm.plugin.finder.report.k kVar, r45.qt2 qt2Var, long j17, long j18, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            l17 = 1L;
        }
        kVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderChatSendClickStruct finderChatSendClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderChatSendClickStruct();
        finderChatSendClickStruct.f56626d = finderChatSendClickStruct.b("finderUsername", kVar.f125089a, true);
        finderChatSendClickStruct.f56627e = finderChatSendClickStruct.b("toUsername", kVar.f125090b, true);
        finderChatSendClickStruct.f56628f = finderChatSendClickStruct.b("toFinderUsername", kVar.f125091c, true);
        finderChatSendClickStruct.f56629g = 2L;
        finderChatSendClickStruct.f56630h = j18;
        finderChatSendClickStruct.f56633k = j17;
        if (qt2Var != null) {
            java.lang.String string = qt2Var.getString(0);
            if (string == null) {
                string = "";
            }
            finderChatSendClickStruct.f56631i = finderChatSendClickStruct.b("sessionid", string, true);
            java.lang.String string2 = qt2Var.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            finderChatSendClickStruct.f56632j = finderChatSendClickStruct.b("clicktabcontextid", string2, true);
        }
        java.lang.String str = finderChatSendClickStruct.f56631i;
        if (str == null) {
            str = "";
        }
        finderChatSendClickStruct.f56631i = finderChatSendClickStruct.b("sessionid", str, true);
        java.lang.String str2 = finderChatSendClickStruct.f56632j;
        finderChatSendClickStruct.f56632j = finderChatSendClickStruct.b("clicktabcontextid", str2 != null ? str2 : "", true);
        finderChatSendClickStruct.f56634l = l17 != null ? l17.longValue() : 1L;
        finderChatSendClickStruct.k();
        com.tencent.mm.plugin.finder.report.p.a(com.tencent.mm.plugin.finder.report.p.f125222a, "onClickFinderChat", finderChatSendClickStruct);
    }

    public static void b(com.tencent.mm.plugin.finder.report.k kVar, r45.qt2 qt2Var, long j17, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            l17 = 1L;
        }
        kVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderChatSendClickStruct finderChatSendClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderChatSendClickStruct();
        finderChatSendClickStruct.f56626d = finderChatSendClickStruct.b("finderUsername", kVar.f125089a, true);
        finderChatSendClickStruct.f56627e = finderChatSendClickStruct.b("toUsername", kVar.f125090b, true);
        finderChatSendClickStruct.f56628f = finderChatSendClickStruct.b("toFinderUsername", kVar.f125091c, true);
        finderChatSendClickStruct.f56629g = 1L;
        finderChatSendClickStruct.f56630h = 0L;
        if (qt2Var != null) {
            java.lang.String string = qt2Var.getString(0);
            if (string == null) {
                string = "";
            }
            finderChatSendClickStruct.f56631i = finderChatSendClickStruct.b("sessionid", string, true);
            java.lang.String string2 = qt2Var.getString(2);
            finderChatSendClickStruct.f56632j = finderChatSendClickStruct.b("clicktabcontextid", string2 != null ? string2 : "", true);
        }
        finderChatSendClickStruct.f56633k = j17;
        finderChatSendClickStruct.f56634l = l17 != null ? l17.longValue() : 1L;
        finderChatSendClickStruct.k();
        com.tencent.mm.plugin.finder.report.p.a(com.tencent.mm.plugin.finder.report.p.f125222a, "onExpose", finderChatSendClickStruct);
    }

    public final void c(java.lang.String finderUserName, java.lang.String toUserName, java.lang.String toFinderUserName) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        kotlin.jvm.internal.o.g(toFinderUserName, "toFinderUserName");
        this.f125089a = finderUserName;
        this.f125090b = toUserName;
        this.f125091c = toFinderUserName;
    }
}
