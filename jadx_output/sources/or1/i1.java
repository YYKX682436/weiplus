package or1;

/* loaded from: classes9.dex */
public class i1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.j1 f347506d;

    public i1(or1.j1 j1Var) {
        this.f347506d = j1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        or1.j1 j1Var = this.f347506d;
        com.tencent.mm.ui.tools.w6 w6Var = j1Var.f347512c;
        if (w6Var != null) {
            w6Var.a();
            j1Var.f347512c = null;
        }
        j1Var.f347512c = new com.tencent.mm.ui.tools.w6(j1Var.f347510a);
        com.tencent.mm.ui.tools.w6 w6Var2 = j1Var.f347512c;
        w6Var2.f210880u = new or1.g1(this);
        w6Var2.f210881v = new or1.h1(this);
        w6Var2.e();
        return false;
    }
}
