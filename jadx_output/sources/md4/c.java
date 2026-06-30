package md4;

/* loaded from: classes3.dex */
public final class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f325874d;

    public c(android.view.View view) {
        this.f325874d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$1");
        android.view.View view = this.f325874d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        md4.e eVar = md4.e.f325877a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addGradientBackground", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        kotlin.jvm.internal.o.g(view, "view");
        android.content.Context context = view.getContext();
        int[] iArr = {context.getColor(com.tencent.mm.R.color.aml), context.getColor(com.tencent.mm.R.color.aml), context.getColor(com.tencent.mm.R.color.f478490b), context.getColor(com.tencent.mm.R.color.f478490b)};
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bcb);
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout improveRoundLinearLayout = (com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveRoundLinearLayout) view.findViewById(com.tencent.mm.R.id.f483400sj2);
        if (imageView == null || improveRoundLinearLayout == null || view.getHeight() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addGradientBackground", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        } else {
            float[] fArr = {0.0f, (imageView.getHeight() * 1.0f) / view.getHeight(), ((imageView.getHeight() + context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz)) * 1.0f) / view.getHeight(), 1.0f};
            android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
            paintDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
            paintDrawable.setShaderFactory(new md4.a(iArr, fArr));
            improveRoundLinearLayout.setBackground(paintDrawable);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addGradientBackground", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$1");
    }
}
