package ed5;

/* loaded from: classes10.dex */
public final class z extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryTypeFilterView f251404d;

    public z(com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryTypeFilterView msgHistoryGalleryTypeFilterView) {
        this.f251404d = msgHistoryGalleryTypeFilterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f251404d.f201822i = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f251404d.f201822i = false;
    }
}
