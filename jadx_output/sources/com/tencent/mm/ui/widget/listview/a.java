package com.tencent.mm.ui.widget.listview;

/* loaded from: classes11.dex */
public class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f212174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f212175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f212176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.listview.PullDownListView f212177g;

    public a(com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView, int i17, int i18, boolean z17) {
        this.f212177g = pullDownListView;
        this.f212174d = i17;
        this.f212175e = i18;
        this.f212176f = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "onAnimationCancel ", new java.lang.Object[0]);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int i17 = this.f212174d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = com.tencent.mm.ui.widget.listview.PullDownListView.f212146y1;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f212177g;
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "onAnimationEnd start:%s, openLimitPx():%s, closeLimitPx():%s", valueOf, java.lang.Integer.valueOf(pullDownListView.g()), java.lang.Integer.valueOf(pullDownListView.c()));
        pullDownListView.I = false;
        pullDownListView.K = false;
        pullDownListView.L = false;
        pullDownListView.M = false;
        if (pullDownListView.f212173z == null || i17 <= pullDownListView.g() || i17 >= pullDownListView.c()) {
            return;
        }
        if (!pullDownListView.f212147J) {
            pullDownListView.f212173z.onPostOpen(this.f212176f);
        } else {
            pullDownListView.f212173z.onPostClose();
            android.view.View view = pullDownListView.F;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        int i17 = this.f212174d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = com.tencent.mm.ui.widget.listview.PullDownListView.f212146y1;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f212177g;
        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "onAnimationStart start:%s, openLimitPx():%s, closeLimitPx():%s", valueOf, java.lang.Integer.valueOf(pullDownListView.g()), java.lang.Integer.valueOf(pullDownListView.c()));
        pullDownListView.K = true;
        if (this.f212175e == 0) {
            pullDownListView.f212147J = true;
        } else {
            pullDownListView.f212147J = false;
        }
        if (pullDownListView.f212173z == null || i17 <= pullDownListView.g() || i17 >= pullDownListView.c()) {
            return;
        }
        if (pullDownListView.f212147J) {
            pullDownListView.f212173z.onPreClose();
        } else {
            pullDownListView.f212173z.onPreOpen();
        }
    }
}
