package vw3;

/* loaded from: classes.dex */
public final class a1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f440875d;

    public a1(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        this.f440875d = repairerFileListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f440875d;
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(repairerFileListUI);
            u1Var.g("是否确认清空当前目录所有文件？");
            u1Var.a(true);
            u1Var.b(new vw3.z0(repairerFileListUI));
            u1Var.q(false);
        }
    }
}
