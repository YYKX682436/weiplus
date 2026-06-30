package sj3;

/* loaded from: classes12.dex */
public final class m2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408640d;

    public m2(sj3.g3 g3Var) {
        this.f408640d = g3Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        sj3.g3 g3Var = this.f408640d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            sj3.g3.a(g3Var);
        } else {
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = g3Var.f408520a;
            multiTalkMainUI.f150241t = true;
            com.tencent.mm.ui.ee.f(multiTalkMainUI.getTaskId(), null);
            if (com.tencent.mm.ui.bk.w0()) {
                com.tencent.mm.ui.fj.f(g3Var.f408520a, true);
            }
        }
    }
}
