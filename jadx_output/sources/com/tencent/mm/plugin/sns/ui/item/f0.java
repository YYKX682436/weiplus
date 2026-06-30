package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public final class f0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder {
    public boolean D0;
    public android.view.View E0;
    public com.tencent.mm.plugin.ting.widget.TingCategoryView F0;

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder
    public java.lang.String a() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
        com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView = this.F0;
        if (tingCategoryView == null || (str = tingCategoryView.getAccessibilityDesc()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
        return str;
    }

    public final android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTingRootView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
        android.view.View view = this.E0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTingRootView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
        return view;
    }
}
