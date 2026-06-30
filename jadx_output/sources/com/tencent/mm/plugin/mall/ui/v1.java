package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class v1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148504d;

    public v1(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2) {
        this.f148504d = mallIndexUIv2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(14872, 0, 0, "", "", 0);
        g0Var.d(16500, 3);
        boolean f17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().f();
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = this.f148504d;
        if (!f17 || (arrayList = mallIndexUIv2.M) == null || arrayList.size() <= 0) {
            boolean z17 = mallIndexUIv2.f148292y.f7297f;
            mallIndexUIv2.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_default_show_currency", z17);
            j45.l.n(mallIndexUIv2, "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, 6);
        } else {
            mallIndexUIv2.getClass();
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "openNewPayManageMenu");
            androidx.appcompat.app.AppCompatActivity context = mallIndexUIv2.getContext();
            android.view.LayoutInflater.from(context);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            new java.util.ArrayList();
            com.tencent.mm.plugin.mall.ui.w1 w1Var = new com.tencent.mm.plugin.mall.ui.w1(mallIndexUIv2);
            com.tencent.mm.plugin.mall.ui.x1 x1Var = new com.tencent.mm.plugin.mall.ui.x1(mallIndexUIv2);
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f228381y = null;
                h4Var.f228382z = null;
            }
            arrayList2.clear();
            db5.g4 g4Var = new db5.g4(context);
            w1Var.onCreateMMMenu(g4Var);
            if (g4Var.z()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                k0Var.f211872n = w1Var;
                k0Var.f211881s = x1Var;
                k0Var.f211854d = null;
                k0Var.G = null;
                k0Var.v();
            }
        }
        return true;
    }
}
