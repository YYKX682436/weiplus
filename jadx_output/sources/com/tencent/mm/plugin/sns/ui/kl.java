package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class kl implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f169639d;

    public kl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f169639d = snsMsgUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$13");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f169639d;
        if (itemId == 0) {
            com.tencent.mm.plugin.sns.ui.SnsMsgUI.c7(snsMsgUI, snsMsgUI.I);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onMMMenuItemSelected delMsg snsCommentID:%d", java.lang.Integer.valueOf(snsMsgUI.I));
        } else if (itemId == 1) {
            int i18 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            snsMsgUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notRemind", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            db5.e1.A(snsMsgUI, snsMsgUI.getString(com.tencent.mm.R.string.hbu), "", snsMsgUI.getString(com.tencent.mm.R.string.hbt), snsMsgUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.sns.ui.nl(snsMsgUI), null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notRemind", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            gc4.e.a();
            gc4.e.f270449b.c();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onMMMenuItemSelected notRemind snsCommentID:%d", java.lang.Integer.valueOf(snsMsgUI.I));
        } else if (itemId == 2) {
            com.tencent.mm.plugin.sns.ui.SnsMsgUI.V6(snsMsgUI, false);
            gc4.e.a();
            gc4.e.f270449b.c();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onMMMenuItemSelected remindImp snsCommentID:%d", java.lang.Integer.valueOf(snsMsgUI.I));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$13");
    }
}
