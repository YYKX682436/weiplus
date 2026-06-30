package com.tencent.mm.ui.report;

/* loaded from: classes12.dex */
public final /* synthetic */ class c0 extends kotlin.jvm.internal.m implements yz5.l {
    public c0(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.ui.report.d0.class, "reportClickedToOpenFile", "reportClickedToOpenFile(Lcom/tencent/mm/ui/report/FilePreviewReporter$FilePreviewReportParams;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.report.o p07 = (com.tencent.mm.ui.report.o) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.ui.report.d0 d0Var = (com.tencent.mm.ui.report.d0) this.receiver;
        d0Var.getClass();
        java.util.HashMap c17 = d0Var.c(p07);
        c17.put("click_open_method", java.lang.Integer.valueOf(p07.f209714i.f209647d));
        c17.put("is_normal_render", java.lang.Integer.valueOf(p07.f209713h.f209705d));
        d0Var.a(c17, p07);
        com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePreviewReporter", "reportClickedToOpenFile " + c17);
        dy1.r b17 = d0Var.b();
        if (b17 != null) {
            ((cy1.a) b17).Ej("click_open_file", c17, 36223);
        }
        return jz5.f0.f302826a;
    }
}
