package uc4;

/* loaded from: classes4.dex */
public final class p0 extends uc4.b1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // uc4.g
    public void k(android.view.View view, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick");
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        for (android.view.View view2 : ((pd4.b) view).getChildList()) {
            com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView = view2 instanceof com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView ? (com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) view2 : null;
            com.tencent.mm.plugin.sns.ui.MaskImageView imageView = maskImageWithLivePhotoTagView != null ? maskImageWithLivePhotoTagView.getImageView() : null;
            if (imageView != null && imageView.getTag(com.tencent.mm.R.id.n99) == null) {
                imageView.setTag(com.tencent.mm.R.id.n99, 1);
                rl5.r f17 = f();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotoMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
                com.tencent.mm.plugin.sns.ui.listener.h1 h1Var = this.f426382g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
                f17.j(imageView, h1Var, new uc4.n0(this));
                imageView.setOnClickListener(new uc4.o0(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick");
    }
}
