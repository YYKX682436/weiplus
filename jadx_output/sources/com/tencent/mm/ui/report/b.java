package com.tencent.mm.ui.report;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.b f209619a = new com.tencent.mm.ui.report.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f209620b = new java.util.LinkedHashSet();

    public final long a(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, boolean z17) {
        if (z17) {
            r45.gp0 n17 = bt3.g2.n(str, str2);
            if (n17 != null) {
                return n17.R;
            }
            return 0L;
        }
        v05.b bVar = new v05.b();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        bVar.fromXml(U1);
        v05.a aVar = (v05.a) bVar.getCustom(bVar.f432315e + 8);
        if (aVar != null) {
            return aVar.getLong(aVar.f368364d + 0);
        }
        return 0L;
    }

    public final void b(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePreviewReportHelper", "reportFileBubbleSent: " + i17 + ", sendTaskId: " + str);
        java.util.Set set = f209620b;
        if (str != null) {
            if (set.contains(str + '_' + i17)) {
                return;
            }
        }
        if (msgIdTalker == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewReportHelper", "reportFileBubbleSent msgIdTalker is null");
            return;
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(msgIdTalker.a(), msgIdTalker.f149480d);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewReportHelper", "reportFileBubbleSent msg is null");
            return;
        }
        java.lang.String b17 = sc5.g.f406572a.b(k17);
        if (b17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewReportHelper", "reportFileBubbleSent fileExt is empty");
            return;
        }
        if (str != null) {
            set.add(str + '_' + i17);
        }
        com.tencent.mm.ui.report.o oVar = new com.tencent.mm.ui.report.o(k17, b17, "", a(k17, null, null, false));
        com.tencent.mm.ui.report.e.f209628e.getClass();
        com.tencent.mm.ui.report.e eVar = (com.tencent.mm.ui.report.e) ((java.util.LinkedHashMap) com.tencent.mm.ui.report.e.f209629f).get(java.lang.Integer.valueOf(i17));
        if (eVar == null) {
            eVar = com.tencent.mm.ui.report.e.f209630g;
        }
        oVar.f209717l = eVar;
        com.tencent.mm.ui.report.d0.f209626a.d(com.tencent.mm.ui.report.p.f209719d, oVar);
        if (i17 != 3 || str == null) {
            return;
        }
        set.removeIf(new com.tencent.mm.ui.report.a(str));
    }

    public final void c(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, int i17, boolean z17, boolean z18) {
        java.lang.String b17;
        r45.gp0 n17;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilePreviewHelper", "reportFileDownloadButtonEvent msgInfo is null");
            return;
        }
        if (z17) {
            sc5.g gVar = sc5.g.f406572a;
            b17 = (str == null || str2 == null || (n17 = bt3.g2.n(str, str2)) == null) ? null : n17.K;
        } else {
            b17 = sc5.g.f406572a.b(f9Var);
        }
        long a17 = a(f9Var, str, str2, z17);
        if (b17 == null) {
            b17 = "";
        }
        com.tencent.mm.ui.report.o oVar = new com.tencent.mm.ui.report.o(f9Var, b17, null, a17, 4, null);
        oVar.f209718m = z18;
        if (!z18) {
            com.tencent.mm.ui.report.l.f209684e.getClass();
            com.tencent.mm.ui.report.l lVar = (com.tencent.mm.ui.report.l) ((java.util.LinkedHashMap) com.tencent.mm.ui.report.l.f209685f).get(java.lang.Integer.valueOf(i17));
            if (lVar == null) {
                lVar = com.tencent.mm.ui.report.l.f209686g;
            }
            oVar.f209712g = lVar;
        }
        com.tencent.mm.ui.report.d0.f209626a.d(com.tencent.mm.ui.report.p.f209725m, oVar);
    }

    public final void d(com.tencent.mm.storage.f9 msgInfo, boolean z17) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.lang.String b17 = sc5.g.f406572a.b(msgInfo);
        if (b17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewReportHelper", "reportFilePreview fileExt is empty");
            return;
        }
        com.tencent.mm.ui.report.o oVar = new com.tencent.mm.ui.report.o(msgInfo, b17, "", a(msgInfo, null, null, false));
        oVar.f209715j = z17 ? com.tencent.mm.ui.report.c.f209623g : com.tencent.mm.ui.report.c.f209622f;
        com.tencent.mm.ui.report.d0.f209626a.d(com.tencent.mm.ui.report.p.f209728p, oVar);
    }

    public final void e(com.tencent.mm.storage.f9 msg, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String b17;
        r45.gp0 n17;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (z17) {
            sc5.g gVar = sc5.g.f406572a;
            b17 = (str == null || str2 == null || (n17 = bt3.g2.n(str, str2)) == null) ? null : n17.K;
        } else {
            b17 = sc5.g.f406572a.b(msg);
        }
        long a17 = a(msg, str, str2, z17);
        if (b17 == null) {
            b17 = "";
        }
        com.tencent.mm.ui.report.o oVar = new com.tencent.mm.ui.report.o(msg, b17, null, a17, 4, null);
        oVar.f209710e = te5.h.f418649a.c() ? com.tencent.mm.ui.report.g.f209639e : com.tencent.mm.ui.report.g.f209640f;
        com.tencent.mm.ui.report.d0.f209626a.d(com.tencent.mm.ui.report.p.f209721f, oVar);
    }
}
