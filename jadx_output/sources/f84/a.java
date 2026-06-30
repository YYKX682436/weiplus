package f84;

/* loaded from: classes4.dex */
public final class a extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f260168d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f260169e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f260170f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View rootView, int i17) {
        super(rootView);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        if (i17 == 0) {
            this.f260168d = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.hjb);
            this.f260169e = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.vgh);
            this.f260170f = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.skt);
        }
    }

    public final android.widget.ImageView i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopicImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopicImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
        return this.f260169e;
    }
}
