package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class p1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f125810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f125812f;

    public p1(android.view.View view, com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, int i17) {
        this.f125810d = view;
        this.f125811e = finderFeedSearchUI;
        this.f125812f = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f125810d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125811e;
        int h17 = com.tencent.mm.ui.bl.h(finderFeedSearchUI.getContext()) + com.tencent.mm.ui.bl.a(finderFeedSearchUI.getContext()) + this.f125812f;
        android.view.ViewGroup.LayoutParams layoutParams = finderFeedSearchUI.getContext().findViewById(com.tencent.mm.R.id.h0r).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = h17;
        android.view.ViewGroup.LayoutParams layoutParams2 = finderFeedSearchUI.getContext().findViewById(com.tencent.mm.R.id.f487177ns4).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).topMargin = h17;
        return true;
    }
}
