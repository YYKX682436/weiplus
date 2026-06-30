package zw1;

/* loaded from: classes9.dex */
public class o implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillUI f476745d;

    public o(com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI) {
        this.f476745d = collectBillUI;
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
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectBillUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 < 0 || i17 >= adapterView.getAdapter().getCount()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "illegal position: %s, count: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(adapterView.getAdapter().getCount()));
            yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectBillUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI = this.f476745d;
        ww1.g gVar = (ww1.g) collectBillUI.f96357d.getItemAtPosition(i17);
        if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectBillUI", "invalid position: %d", java.lang.Integer.valueOf(i17));
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
            intent.putExtra("trans_id", gVar.f450188b);
            intent.putExtra("bill_id", gVar.f450187a);
            j45.l.j(collectBillUI.getContext(), "order", ".ui.MallOrderTransactionInfoUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectBillUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
