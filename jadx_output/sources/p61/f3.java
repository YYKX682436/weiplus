package p61;

/* loaded from: classes5.dex */
public class f3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.g3 f352249d;

    public f3(p61.g3 g3Var) {
        this.f352249d = g3Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 0) {
            return;
        }
        com.tencent.mm.plugin.account.bind.ui.BindQQUI bindQQUI = this.f352249d.f352264d;
        bindQQUI.getClass();
        gm0.j1.d().g(new r61.f1(1));
        bindQQUI.f73065f = db5.e1.Q(bindQQUI, bindQQUI.getString(com.tencent.mm.R.string.f490573yv), bindQQUI.getString(com.tencent.mm.R.string.f490468vx), true, true, new p61.y2(bindQQUI));
    }
}
