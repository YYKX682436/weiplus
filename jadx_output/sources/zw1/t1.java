package zw1;

/* loaded from: classes15.dex */
public class t1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ln f476800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476801e;

    public t1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, r45.ln lnVar) {
        this.f476801e = collectMainUI;
        this.f476800d = lnVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.wf5 wf5Var = (r45.wf5) this.f476800d.f379648e.get(menuItem.getItemId());
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476801e;
        collectMainUI.f96394h = 2;
        com.tencent.mm.plugin.collect.ui.CollectMainUI.X6(collectMainUI, wf5Var);
    }
}
