package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class ur implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI f170594d;

    public ur(com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI) {
        this.f170594d = snsTagPartlyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$3");
        com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI = this.f170594d;
        com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.T6(snsTagPartlyUI).f171708p = !com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.T6(snsTagPartlyUI).f171708p;
        snsTagPartlyUI.updateOptionMenuText(0, snsTagPartlyUI.getString(com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.T6(snsTagPartlyUI).f171708p ? com.tencent.mm.R.string.f490441v5 : com.tencent.mm.R.string.jft));
        com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.T6(snsTagPartlyUI).notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$3");
        return true;
    }
}
