package r74;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder {
    public android.view.ViewGroup D0;
    public boolean E0;
    public android.view.ViewStub F0;
    public android.view.ViewStub G0;
    public com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer H0;
    public int I0;
    public int J0;

    public final com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLivingContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.H0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLivingContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        return adLivingStreamContainer;
    }

    public final int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLivingContainerWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        int i17 = this.I0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLivingContainerWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        return i17;
    }

    public final void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLivingContainerHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        this.J0 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLivingContainerHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
    }

    public final void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLivingContainerWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        this.I0 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLivingContainerWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
    }
}
