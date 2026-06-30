package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class nr implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagDetailUI f170023d;

    public nr(com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI) {
        this.f170023d = snsTagDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI = this.f170023d;
        sb6.append(snsTagDetailUI.f167448i);
        sb6.append(" ");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.c1(snsTagDetailUI.f167446g, ","));
        if (!sb6.toString().equals(snsTagDetailUI.f167449m) || snsTagDetailUI.f167447h == 0) {
            db5.e1.n(snsTagDetailUI, com.tencent.mm.R.string.jff, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.sns.ui.mr(this), null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5");
            return true;
        }
        snsTagDetailUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5");
        return true;
    }
}
