package sb4;

/* loaded from: classes4.dex */
public final class i0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f405525d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f405526e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f405527f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f405528g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f405529h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f405530i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f487048nb2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById;
        this.f405525d = mMRoundCornerImageView;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f487050nb4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f405526e = imageView;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f487049nb3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f405527f = textView;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.naz);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f405528g = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.f487046nb0);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f405529h = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.s6y);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f405530i = findViewById6;
        int Oj = com.tencent.mm.plugin.sns.model.l4.Oj();
        i(mMRoundCornerImageView, Oj);
        i(textView, Oj);
        i(findViewById4, Oj);
        i(imageView, Oj / 3);
    }

    public final void i(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeViewSize", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        kotlin.jvm.internal.o.g(view, "view");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = i17;
        layoutParams2.height = i17;
        view.setLayoutParams(layoutParams2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeViewSize", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
    }

    public final android.widget.TextView j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        return this.f405527f;
    }

    public final com.tencent.mm.ui.widget.MMRoundCornerImageView k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        return this.f405525d;
    }

    public final android.widget.ImageView l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSightIcon", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightIcon", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        return this.f405526e;
    }
}
