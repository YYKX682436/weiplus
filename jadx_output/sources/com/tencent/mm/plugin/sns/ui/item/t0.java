package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public final class t0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder {
    public boolean D0;
    public android.view.View E0;
    public com.tencent.mm.plugin.ting.widget.MusicView F0;
    public android.view.View G0;
    public android.view.View H0;

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder
    public java.lang.String a() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        com.tencent.mm.plugin.ting.widget.MusicView musicView = this.F0;
        if (musicView == null || (str = musicView.getAccessibilityDesc()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        return str;
    }

    public final com.tencent.mm.plugin.ting.widget.MusicView b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        com.tencent.mm.plugin.ting.widget.MusicView musicView = this.F0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        return musicView;
    }
}
