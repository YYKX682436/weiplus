package gz3;

/* loaded from: classes4.dex */
public class b implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI f277748d;

    public b(com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI) {
        this.f277748d = scannerHistoryUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i17 > 0) {
            i17--;
        }
        com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI = this.f277748d;
        fz3.a aVar = (fz3.a) scannerHistoryUI.f158737f.getItem(i17);
        if (aVar != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(scannerHistoryUI, com.tencent.mm.plugin.scanner.ui.ProductUI.class);
            intent.setFlags(65536);
            intent.putExtra("key_Product_xml", aVar.field_xmlContent);
            intent.putExtra("key_Product_funcType", aVar.field_funcType);
            intent.putExtra("key_Qrcode_Url", aVar.field_qrcodeUrl);
            intent.putExtra("key_need_add_to_history", false);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(scannerHistoryUI, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "OnItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            scannerHistoryUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(scannerHistoryUI, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "OnItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12684, 0, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
