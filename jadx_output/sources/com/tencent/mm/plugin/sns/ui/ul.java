package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ul implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f170587d;

    public ul(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f170587d = snsMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$4");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f170587d;
        if (snsMsgUI.B && com.tencent.mm.plugin.sns.model.l4.Aj().f() > 0) {
            com.tencent.mm.plugin.sns.model.l4.Aj().p1();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_cmd_list", snsMsgUI.f167280t);
        snsMsgUI.setResult(-1, intent);
        snsMsgUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$4");
        return true;
    }
}
