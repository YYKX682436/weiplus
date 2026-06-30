package p74;

/* loaded from: classes4.dex */
public final class g extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f352545d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f352546e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f352547f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f352548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f352545d = (android.widget.FrameLayout) itemView.findViewById(com.tencent.mm.R.id.v7q);
        this.f352546e = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.v7r);
        this.f352547f = (android.widget.FrameLayout) itemView.findViewById(com.tencent.mm.R.id.v7v);
        this.f352548g = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.v7s);
    }

    public final android.widget.ImageView i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardImageView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardImageView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
        return this.f352546e;
    }

    public final android.widget.ImageView j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayButton", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayButton", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
        return this.f352548g;
    }

    public final android.widget.FrameLayout k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
        return this.f352547f;
    }
}
