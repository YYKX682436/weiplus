package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public final class n extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder {
    public boolean D0;
    public android.view.View E0;
    public java.lang.String F0 = "";
    public android.widget.ImageView G0;
    public android.view.View H0;
    public android.widget.ImageView I0;
    public android.widget.TextView J0;
    public android.widget.TextView K0;
    public android.view.View L0;
    public android.view.View M0;
    public long N0;

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder
    public java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        java.lang.String string = this.f169272h.getContext().getString(com.tencent.mm.R.string.jcc);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.view.View view = this.M0;
        boolean z17 = false;
        if (view != null && view.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            string = this.f169272h.getContext().getString(com.tencent.mm.R.string.f493206ja3);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("，");
        sb6.append(string);
        sb6.append((char) 65292);
        java.lang.String string2 = this.f169272h.getContext().getString(com.tencent.mm.R.string.ja6);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{this.F0}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return sb7;
    }

    public final android.widget.ImageView b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.widget.ImageView imageView = this.I0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return imageView;
    }

    public final android.widget.ImageView c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.widget.ImageView imageView = this.G0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return imageView;
    }

    public final android.widget.TextView d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.widget.TextView textView = this.J0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return textView;
    }

    public final android.view.View e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveFeedTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View view = this.M0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveFeedTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return view;
    }

    public final android.view.View f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View view = this.H0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return view;
    }

    public final android.view.View g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View view = this.E0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return view;
    }

    public final android.view.View h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View view = this.L0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return view;
    }

    public final long i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLiveId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        long j17 = this.N0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return j17;
    }

    public final android.widget.TextView j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.widget.TextView textView = this.K0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        return textView;
    }
}
