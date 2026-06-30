package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xj extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView f120342d;

    public xj(com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView finderLiveFixClickIssueRecyclerView) {
        this.f120342d = finderLiveFixClickIssueRecyclerView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView finderLiveFixClickIssueRecyclerView = this.f120342d;
        finderLiveFixClickIssueRecyclerView.setAnimating(false);
        com.tencent.mars.xlog.Log.i("FinderLiveFixClickIssueRecyclerView", "resetTranslationY finish translationY:" + finderLiveFixClickIssueRecyclerView.getTranslationY() + '!');
    }
}
