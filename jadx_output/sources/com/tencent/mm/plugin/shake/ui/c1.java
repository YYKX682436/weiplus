package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class c1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI f162247d;

    public c1(com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI) {
        this.f162247d = shakeTvHistoryListUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int delete;
        if (menuItem.getItemId() != 0) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 1;
        com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI = this.f162247d;
        java.lang.String str = shakeTvHistoryListUI.f162221f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        g0Var.d(12662, objArr);
        h34.i0 Ui = c34.h0.Ui();
        java.lang.String str2 = shakeTvHistoryListUI.f162221f;
        Ui.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            delete = -1;
        } else {
            delete = Ui.f278543d.delete(Ui.getTableName(), "username = '" + str2 + "'", null);
        }
        if (delete < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeTvHistoryListUI", "delete tv history fail, ret[%d]", java.lang.Integer.valueOf(delete));
        } else {
            c01.d9.e().g(new h34.h(1, shakeTvHistoryListUI.f162221f));
        }
        shakeTvHistoryListUI.f162219d.f();
    }
}
