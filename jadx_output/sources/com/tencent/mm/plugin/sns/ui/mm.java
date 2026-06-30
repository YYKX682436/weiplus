package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class mm implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll f169926d;

    public mm(com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll snsMsgUIWithAll) {
        this.f169926d = snsMsgUIWithAll;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUIWithAll", "goToSnsMsgInteractionMgr");
        com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll snsMsgUIWithAll = this.f169926d;
        snsMsgUIWithAll.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToSnsMsgInteractionMgr", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUIWithAll", "goToSnsMsgInteractionMgr");
        snsMsgUIWithAll.startActivityForResult(new android.content.Intent(snsMsgUIWithAll, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr.class), 25);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToSnsMsgInteractionMgr", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithAll$2");
        return true;
    }
}
