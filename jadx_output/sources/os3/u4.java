package os3;

/* loaded from: classes8.dex */
public class u4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348219d;

    public u4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348219d = readMailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348219d;
        if (readMailUI.f154927f == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReadMailUI", "mailObject is null!");
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 15);
        java.lang.String[] stringArray = readMailUI.getResources().getStringArray(com.tencent.mm.R.array.f478010x);
        android.view.LayoutInflater.from(readMailUI);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) readMailUI, 1, false);
        db5.g4 g4Var = new db5.g4(readMailUI);
        new db5.g4(readMailUI);
        os3.p4 p4Var = new os3.p4(this, stringArray);
        os3.s4 s4Var = new os3.s4(this);
        k0Var.C = new os3.t4(this);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(readMailUI);
        p4Var.onCreateMMMenu(g4Var2);
        if (g4Var2.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = p4Var;
            k0Var.f211881s = s4Var;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        return false;
    }
}
