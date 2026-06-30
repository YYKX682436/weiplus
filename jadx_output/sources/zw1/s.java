package zw1;

/* loaded from: classes9.dex */
public class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillUI f476784d;

    public s(com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI) {
        this.f476784d = collectBillUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
            com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI = this.f476784d;
            ww1.g gVar = (ww1.g) collectBillUI.f96357d.getItemAtPosition(adapterContextMenuInfo.position);
            if (gVar != null) {
                java.lang.String str = gVar.f450187a;
                long j17 = gVar.f450189c;
                collectBillUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "do delete, billid: %s, timestamp: %s", str, java.lang.Long.valueOf(j17));
                ww1.w1 w1Var = new ww1.w1(str, collectBillUI.f96373w, j17);
                collectBillUI.f96371u = true;
                collectBillUI.doSceneForceProgress(w1Var);
            }
        }
    }
}
