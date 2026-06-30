package kf5;

/* loaded from: classes9.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final kf5.d f307502d = new kf5.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.chatting.widget.RoundClipFrameLayout roundClipFrameLayout = new com.tencent.mm.chatting.widget.RoundClipFrameLayout(context, null, 0, 6, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ImageView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        android.widget.ImageView imageView = new android.widget.ImageView(roundClipFrameLayout.getContext());
        roundClipFrameLayout.addView(imageView);
        imageView.setId(com.tencent.mm.R.id.ui6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = -1;
            imageView.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.height = -1;
            imageView.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ImageView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("FrameLayout", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(roundClipFrameLayout.getContext());
        roundClipFrameLayout.addView(frameLayout);
        frameLayout.setId(com.tencent.mm.R.id.ui7);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            layoutParams3.width = -1;
            frameLayout.setLayoutParams(layoutParams3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
            layoutParams4.height = -1;
            frameLayout.setLayoutParams(layoutParams4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("FrameLayout", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        return roundClipFrameLayout;
    }
}
