package uc4;

/* loaded from: classes4.dex */
public final class v extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final uc4.s f426457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426457f = new uc4.s(context, this);
    }

    @Override // uc4.g
    public void k(android.view.View view, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        if (view instanceof com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout) {
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout) view;
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView likeLayout = improveInteractionLayout.getLikeLayout();
            xc4.p c17 = c();
            likeLayout.setLikeTvTag(c17 != null ? c17.e1() : null);
            improveInteractionLayout.setCommentClickListener(new uc4.t(this));
            improveInteractionLayout.setCommentLongClickListener(new uc4.u(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
    }
}
