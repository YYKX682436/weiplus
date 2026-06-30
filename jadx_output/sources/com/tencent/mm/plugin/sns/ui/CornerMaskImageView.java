package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/CornerMaskImageView;", "Lcom/tencent/mm/plugin/sns/ui/MaskImageView;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/sns/ui/z1", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CornerMaskImageView extends com.tencent.mm.plugin.sns.ui.MaskImageView {
    public int W;

    /* renamed from: p0, reason: collision with root package name */
    public final al5.p2 f166273p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornerMaskImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f166273p0 = new al5.p2(this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n34.w2.f334765b);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.W = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        setClipToOutline(true);
        setOutlineProvider(new com.tencent.mm.plugin.sns.ui.z1(this.W));
    }

    @Override // com.tencent.mm.plugin.sns.ui.MaskImageView, com.tencent.mm.memory.ui.QPictureView, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        super.onAttachedToWindow();
        this.f166273p0.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.MaskImageView, com.tencent.mm.memory.ui.QPictureView, com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        super.onDetachedFromWindow();
        this.f166273p0.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("post", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        this.f166273p0.getClass();
        boolean post = super.post(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("post", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        return post;
    }

    public final void setRadius(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRadius", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
        this.W = i17;
        setClipToOutline(true);
        setOutlineProvider(new com.tencent.mm.plugin.sns.ui.z1(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRadius", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView");
    }
}
