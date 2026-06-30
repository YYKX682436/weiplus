package p61;

/* loaded from: classes5.dex */
public class g3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindQQUI f352264d;

    public g3(com.tencent.mm.plugin.account.bind.ui.BindQQUI bindQQUI) {
        this.f352264d = bindQQUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        androidx.appcompat.app.AppCompatActivity context = this.f352264d.getContext();
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
        db5.g4 g4Var = new db5.g4(context);
        new db5.g4(context);
        p61.e3 e3Var = new p61.e3(this);
        p61.f3 f3Var = new p61.f3(this);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(context);
        e3Var.onCreateMMMenu(g4Var2);
        if (g4Var2.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = e3Var;
            k0Var.f211881s = f3Var;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        return false;
    }
}
