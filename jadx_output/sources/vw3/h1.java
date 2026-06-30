package vw3;

/* loaded from: classes.dex */
public final class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f440975d;

    public h1(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        this.f440975d = repairerFileListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f440975d;
        switch (itemId) {
            case 1:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.b1.f440887d);
                return;
            case 2:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.c1.f440906d);
                return;
            case 3:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.d1.f440922d);
                return;
            case 4:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.e1.f440937d);
                return;
            case 5:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.f1.f440947d);
                return;
            case 6:
                com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.U6(repairerFileListUI, vw3.g1.f440959d);
                return;
            default:
                return;
        }
    }
}
