package com.tencent.mm.ui.report;

/* loaded from: classes12.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.m implements yz5.l {
    public a0(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.ui.report.d0.class, "reportMidPageDownload", "reportMidPageDownload(Lcom/tencent/mm/ui/report/FilePreviewReporter$FilePreviewReportParams;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.report.o p07 = (com.tencent.mm.ui.report.o) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.ui.report.d0 d0Var = (com.tencent.mm.ui.report.d0) this.receiver;
        d0Var.getClass();
        if (p07.f209718m) {
            java.util.HashMap c17 = d0Var.c(p07);
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePreviewReporter", "reportMidPageDownloadExp " + c17);
            dy1.r b17 = d0Var.b();
            if (b17 != null) {
                ((cy1.a) b17).Hj("mid_page_download_button", "view_exp", c17, 36223);
            }
        } else {
            java.util.HashMap c18 = d0Var.c(p07);
            c18.put("mid_page_click_type", java.lang.Integer.valueOf(p07.f209712g.f209691d));
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePreviewReporter", "reportMidPageDownloadClick " + c18);
            dy1.r b18 = d0Var.b();
            if (b18 != null) {
                ((cy1.a) b18).Hj("mid_page_download_button", "view_clk", c18, 36223);
            }
        }
        return jz5.f0.f302826a;
    }
}
