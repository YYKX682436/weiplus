package com.tencent.mm.ui.report;

/* loaded from: classes11.dex */
public abstract class k0 {
    public static final java.util.Map a(java.lang.String str, java.lang.String digest, int i17) {
        kotlin.jvm.internal.o.g(digest, "digest");
        java.lang.String str2 = i17 > 0 ? "1" : "0";
        try {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            java.lang.String str3 = n17 != null && c01.e2.P(n17) ? "1" : "2";
            com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(str);
            boolean z17 = q57 != null && q57.A0() == 1;
            java.lang.String str4 = z17 ? "1" : "0";
            if (z17) {
                digest = "";
            }
            java.util.Map l17 = kz5.c1.l(new jz5.l("if_sent_from_self", str4), new jz5.l("if_have_red", str2), new jz5.l("red_type", str3), new jz5.l("number_red_cnt", java.lang.String.valueOf(i17)));
            if (!z17) {
                l17.put("digest", digest);
            }
            return l17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuConversationReporter", "buildKfListReportParams ex %s", e17.getMessage());
            return kz5.q0.f314001d;
        }
    }

    public static final void b(int i17, java.lang.String talker, com.tencent.mm.storage.l4 l4Var) {
        long j17;
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct leftSlideOptionStruct = new com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct();
        if (i17 == 1) {
            j17 = 12;
        } else if (i17 == 2) {
            j17 = 15;
        } else if (i17 == 3) {
            j17 = 16;
        } else if (i17 != 4) {
            return;
        } else {
            j17 = 17;
        }
        leftSlideOptionStruct.f58551d = j17;
        leftSlideOptionStruct.f58552e = leftSlideOptionStruct.b("SessionName", talker, true);
        leftSlideOptionStruct.f58554g = c01.h2.b(talker);
        leftSlideOptionStruct.f58553f = l4Var != null ? l4Var.d1() : 0L;
        leftSlideOptionStruct.k();
        if (i17 == 1) {
            int d17 = l4Var != null ? l4Var.d1() : 0;
            com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct leftSlideOptionStruct2 = new com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct();
            leftSlideOptionStruct2.f58551d = 1L;
            leftSlideOptionStruct2.f58552e = leftSlideOptionStruct2.b("SessionName", talker, true);
            leftSlideOptionStruct2.f58554g = c01.h2.b(talker);
            leftSlideOptionStruct2.f58553f = d17;
            leftSlideOptionStruct2.k();
        }
    }
}
