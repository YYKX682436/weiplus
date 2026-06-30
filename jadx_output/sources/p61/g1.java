package p61;

/* loaded from: classes5.dex */
public class g1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f352261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI f352262e;

    public g1(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI, int i17) {
        this.f352262e = bindMContactIntroUI;
        this.f352261d = i17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        androidx.appcompat.app.AppCompatActivity context = this.f352262e.getContext();
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
        db5.g4 g4Var = new db5.g4(context);
        new db5.g4(context);
        p61.e1 e1Var = new p61.e1(this);
        p61.f1 f1Var = new p61.f1(this);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(context);
        e1Var.onCreateMMMenu(g4Var2);
        if (g4Var2.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = e1Var;
            k0Var.f211881s = f1Var;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        return false;
    }
}
