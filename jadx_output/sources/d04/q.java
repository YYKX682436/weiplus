package d04;

/* loaded from: classes13.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225489d;

    public q(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView) {
        this.f225489d = scanCodeMaskView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11264, 3);
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView.H1;
        com.tencent.mm.plugin.scanner.model.u scanUIModel = this.f225489d.getScanUIModel();
        if (scanUIModel != null) {
            com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = (com.tencent.mm.plugin.scanner.ui.BaseScanUI) scanUIModel;
            com.tencent.mm.plugin.scanner.model.h2.z(baseScanUI.C, 11, baseScanUI.f159167y0);
            bz3.h hVar = bz3.h.f36774a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanClientConfigManager", "clickQrcodeBtnNew");
            bz3.h.f36776c = true;
            com.tencent.mm.sdk.platformtools.o4 o4Var = bz3.h.f36775b;
            if (o4Var != null) {
                o4Var.putInt("qrcode_btn_new_clicked", 1);
            }
            e04.g2.a(baseScanUI, new c01.ka(7));
            baseScanUI.W = com.tencent.wechat.aff.iam_scan.f1.CLICK_MY_QRCODE;
            com.tencent.mm.plugin.scanner.model.h2.i("view_clk", kd0.g3.f306646h, null);
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = baseScanUI.f159144e;
            if (scanUIRectView != null) {
                e04.j1 scanCameraReporter = scanUIRectView.getScanCameraReporter();
                e04.i1 i1Var = e04.i1.f245960h;
                scanCameraReporter.getClass();
                i1Var.toString();
                scanCameraReporter.f245986u = i1Var;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
