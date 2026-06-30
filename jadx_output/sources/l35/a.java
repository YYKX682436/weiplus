package l35;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final l35.a f315443a = new l35.a();

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context, 14, r45.pk5.class);
        if (pk5Var != null) {
            com.tencent.mm.autogen.mmdata.rpt.ForwardHalfPanelReportStruct forwardHalfPanelReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ForwardHalfPanelReportStruct();
            forwardHalfPanelReportStruct.f58219d = pk5Var.f383132d;
            forwardHalfPanelReportStruct.f58220e = pk5Var.f383133e;
            forwardHalfPanelReportStruct.f58221f = forwardHalfPanelReportStruct.b("Del_list", pk5Var.f383134f, true);
            forwardHalfPanelReportStruct.f58222g = pk5Var.f383135g;
            forwardHalfPanelReportStruct.f58223h = pk5Var.f383136h;
            forwardHalfPanelReportStruct.f58224i = pk5Var.f383137i;
            forwardHalfPanelReportStruct.f58225j = forwardHalfPanelReportStruct.b("MsgType", pk5Var.f383138m, true);
            forwardHalfPanelReportStruct.f58226k = forwardHalfPanelReportStruct.b("InnerAppMsgType", pk5Var.f383139n, true);
            forwardHalfPanelReportStruct.f58227l = pk5Var.f383140o;
            forwardHalfPanelReportStruct.f58228m = pk5Var.f383141p;
            forwardHalfPanelReportStruct.f58229n = forwardHalfPanelReportStruct.b("ToUser", pk5Var.f383142q, true);
            forwardHalfPanelReportStruct.k();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(forwardHalfPanelReportStruct.g());
            java.lang.String n17 = forwardHalfPanelReportStruct.n();
            kotlin.jvm.internal.o.f(n17, "toShowString(...)");
            com.tencent.mars.xlog.Log.i("MircoMsg.ForwardHalfPanelReporter", "report%s %s", valueOf, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
        }
    }
}
