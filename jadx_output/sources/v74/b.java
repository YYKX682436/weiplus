package v74;

/* loaded from: classes4.dex */
public final class b extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f433761d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f433762e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f433763f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.FrameLayout f433764g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f433765h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f433766i;

    /* renamed from: m, reason: collision with root package name */
    public int f433767m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(android.view.View rootView, int i17, v74.s itemSize) {
        super(rootView);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(itemSize, "itemSize");
        android.widget.TextView textView = null;
        if (i17 != 0 && i17 != 1) {
            android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.o_r);
            if (textView2 != null) {
                textView2.setTextSize(0, ca4.m0.I(com.tencent.mm.R.dimen.a_g));
                textView = textView2;
            }
            this.f433766i = textView;
            return;
        }
        this.f433763f = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.cl6);
        android.widget.TextView textView3 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.obc);
        if (textView3 != null) {
            textView3.setTextSize(0, ca4.m0.I(com.tencent.mm.R.dimen.a_g));
        } else {
            textView3 = null;
        }
        this.f433761d = textView3;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f487336oc0);
        if (findViewById != 0) {
            findViewById.getLayoutParams().width = itemSize.a();
            textView = findViewById;
        }
        this.f433762e = textView;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) rootView.findViewById(com.tencent.mm.R.id.jdk);
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.setRadius(i65.a.b(rootView.getContext(), 8));
            roundedCornerFrameLayout.getLayoutParams().width = itemSize.a();
            android.view.ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCardHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCardHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            layoutParams.height = itemSize.f433889d;
        }
        this.f433764g = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.oy7);
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.p0h);
        this.f433765h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(rootView.getContext(), com.tencent.mm.R.raw.shortvideo_play_btn));
        }
        if (imageView == null) {
            return;
        }
        imageView.setContentDescription(rootView.getContext().getString(com.tencent.mm.R.string.hjf));
    }

    public final android.widget.FrameLayout i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        return this.f433764g;
    }

    public final android.widget.ImageView j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoStatusIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoStatusIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        return this.f433765h;
    }

    public final void k(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        this.f433767m = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
    }
}
