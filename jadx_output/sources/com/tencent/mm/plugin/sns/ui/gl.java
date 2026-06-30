package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gl implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr f168443d;

    public gl(com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr snsMsgInteractionMgr) {
        this.f168443d = snsMsgInteractionMgr;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr$1");
        com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr snsMsgInteractionMgr = this.f168443d;
        boolean z17 = snsMsgInteractionMgr.f167265f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        snsMsgInteractionMgr.V6(-1, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr$1");
        return true;
    }
}
