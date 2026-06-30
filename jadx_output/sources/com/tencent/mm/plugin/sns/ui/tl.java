package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class tl implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f170528d;

    public tl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f170528d = snsMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$3");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f170528d;
        db5.e1.u(snsMsgUI.getContext(), snsMsgUI.getString(com.tencent.mm.R.string.jcq), "", new com.tencent.mm.plugin.sns.ui.sl(this), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$3");
        return true;
    }
}
