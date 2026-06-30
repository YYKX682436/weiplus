package xt2;

/* loaded from: classes3.dex */
public final class c5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel f456663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f456664e;

    public c5(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel finderLiveShoppingPanel, yz5.a aVar) {
        this.f456663d = finderLiveShoppingPanel;
        this.f456664e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel finderLiveShoppingPanel = this.f456663d;
        finderLiveShoppingPanel.setShowing(false);
        yz5.l onVisibilityListener = finderLiveShoppingPanel.getOnVisibilityListener();
        if (onVisibilityListener != null) {
            onVisibilityListener.invoke(java.lang.Boolean.FALSE);
        }
        yz5.a aVar = this.f456664e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
