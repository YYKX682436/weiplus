package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class om implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance f170113d;

    public om(com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance snsMsgUIWithRelevance) {
        this.f170113d = snsMsgUIWithRelevance;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$1");
        if (com.tencent.mm.plugin.sns.model.l4.Aj().f1() > 0) {
            com.tencent.mm.plugin.sns.model.l4.Aj().p1();
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance snsMsgUIWithRelevance = this.f170113d;
        intent.putExtra("sns_cmd_list", snsMsgUIWithRelevance.f167280t);
        snsMsgUIWithRelevance.setResult(-1, intent);
        snsMsgUIWithRelevance.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$1");
        return true;
    }
}
