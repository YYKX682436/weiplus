package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public final /* synthetic */ class SnsSettingUI$$g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f167366d;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
        com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI = this.f167366d;
        snsSettingUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onCreate$6", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        snsSettingUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onCreate$6", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        return false;
    }
}
