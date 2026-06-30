package zw1;

/* loaded from: classes9.dex */
public class p implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillUI f476752d;

    public p(com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI) {
        this.f476752d = collectBillUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < 0 || i17 >= adapterView.getAdapter().getCount()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "illegal position: %s, count: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(adapterView.getAdapter().getCount()));
            return false;
        }
        com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI = this.f476752d;
        collectBillUI.f96367q.b(view, i17, j17, collectBillUI, collectBillUI.C);
        return true;
    }
}
