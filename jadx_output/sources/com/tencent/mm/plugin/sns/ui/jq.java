package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class jq implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI f169539d;

    public jq(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        this.f169539d = snsSingleTextViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$4");
        this.f169539d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$4");
        return true;
    }
}
