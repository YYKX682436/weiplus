package sj3;

/* loaded from: classes14.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408808d;

    public y0(sj3.a1 a1Var) {
        this.f408808d = a1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "onClick: " + menuItem.getItemId());
        this.f408808d.f().R6(menuItem.getItemId() == 1);
        com.tencent.mm.plugin.multitalk.model.e3.Di().O(menuItem.getItemId(), true);
    }
}
