package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsAdStreamVideoView extends com.tencent.mm.modelvideo.MMVideoView {
    public static final /* synthetic */ int P1 = 0;
    public final com.tencent.mm.sdk.platformtools.b4 O1;

    public SnsAdStreamVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O1 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.sns.ui.widget.t0(this), false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public m34.e B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSeekCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        com.tencent.mm.plugin.sns.ui.widget.s0 s0Var = new com.tencent.mm.plugin.sns.ui.widget.s0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSeekCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        return s0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public int M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        return com.tencent.mm.R.layout.cqd;
    }

    public void k0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        this.O1.c(5000L, 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
    }

    public SnsAdStreamVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.O1 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.sns.ui.widget.t0(this), false);
    }
}
