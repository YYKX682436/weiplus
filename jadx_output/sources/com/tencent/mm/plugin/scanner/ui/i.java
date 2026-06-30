package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI f159562d;

    public i(com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI confirmScanBankCardResultUI) {
        this.f159562d = confirmScanBankCardResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI confirmScanBankCardResultUI = this.f159562d;
        android.widget.EditText editText = confirmScanBankCardResultUI.f159289g;
        if (editText != null) {
            java.lang.String obj = editText.getEditableText().toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            confirmScanBankCardResultUI.finish();
            com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent scanBankCardConfirmResultEvent = new com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent();
            am.ps psVar = scanBankCardConfirmResultEvent.f54726g;
            psVar.f7657b = 1;
            psVar.f7656a = obj;
            psVar.f7658c = confirmScanBankCardResultUI.f159286d;
            scanBankCardConfirmResultEvent.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
