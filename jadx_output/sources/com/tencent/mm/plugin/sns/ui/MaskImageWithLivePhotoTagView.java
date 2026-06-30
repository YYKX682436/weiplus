package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/MaskImageWithLivePhotoTagView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/sns/ui/MaskImageView;", "d", "Lcom/tencent/mm/plugin/sns/ui/MaskImageView;", "getImageView", "()Lcom/tencent/mm/plugin/sns/ui/MaskImageView;", "imageView", "Landroid/view/View;", "e", "Landroid/view/View;", "getLivePhotoTagView", "()Landroid/view/View;", "livePhotoTagView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MaskImageWithLivePhotoTagView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.plugin.sns.ui.MaskImageView imageView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final android.view.View livePhotoTagView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskImageWithLivePhotoTagView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dpo, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485861jc5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.imageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rwh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.livePhotoTagView = findViewById2;
    }

    public final com.tencent.mm.plugin.sns.ui.MaskImageView getImageView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView");
        return this.imageView;
    }

    public final android.view.View getLivePhotoTagView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoTagView", "com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoTagView", "com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView");
        return this.livePhotoTagView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskImageWithLivePhotoTagView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dpo, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485861jc5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.imageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rwh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.livePhotoTagView = findViewById2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskImageWithLivePhotoTagView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dpo, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485861jc5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.imageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rwh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.livePhotoTagView = findViewById2;
    }
}
