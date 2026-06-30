package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class lm implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll f169871d;

    public lm(com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll snsMsgUIWithAll) {
        this.f169871d = snsMsgUIWithAll;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll$1");
        com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll snsMsgUIWithAll = this.f169871d;
        if (snsMsgUIWithAll.B && com.tencent.mm.plugin.sns.model.l4.Aj().f() > 0) {
            com.tencent.mm.plugin.sns.model.l4.Aj().p1();
        }
        boolean z17 = snsMsgUIWithAll.f167288p0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        snsMsgUIWithAll.u7(-1, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll$1");
        return true;
    }
}
