package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanCardRectView f159965d;

    public o(com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView) {
        this.f159965d = scanCardRectView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/view/ScanCardRectView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = this.f159965d;
        if (scanCardRectView.f159894v.f159465g) {
            com.tencent.mm.autogen.events.ScanFlashSwitchEvent scanFlashSwitchEvent = new com.tencent.mm.autogen.events.ScanFlashSwitchEvent();
            scanFlashSwitchEvent.f54730g.f8033a = 2;
            scanFlashSwitchEvent.e();
            scanCardRectView.f159894v.a();
        } else {
            com.tencent.mm.autogen.events.ScanFlashSwitchEvent scanFlashSwitchEvent2 = new com.tencent.mm.autogen.events.ScanFlashSwitchEvent();
            scanFlashSwitchEvent2.f54730g.f8033a = 1;
            scanFlashSwitchEvent2.e();
            com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = scanCardRectView.f159894v;
            scannerFlashSwitcher.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScannerFlashSwitcher", "openFlashStatus");
            scannerFlashSwitcher.f159465g = true;
            scannerFlashSwitcher.f159462d.setImageResource(com.tencent.mm.R.raw.scanner_flash_open_on);
            scannerFlashSwitcher.f159463e.setText(com.tencent.mm.R.string.i9j);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/view/ScanCardRectView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
