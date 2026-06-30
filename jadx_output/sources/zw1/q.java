package zw1;

/* loaded from: classes3.dex */
public class q implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillUI f476762d;

    public q(com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI) {
        this.f476762d = collectBillUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent(this.f476762d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.collect.ui.CollectBillListUI.class);
        com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI = this.f476762d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(collectBillUI, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectBillUI$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        collectBillUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(collectBillUI, "com/tencent/mm/plugin/collect/ui/CollectBillUI$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }
}
