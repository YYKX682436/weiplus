package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class tf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout f136020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.vf f136021e;

    public tf(com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout, com.tencent.mm.plugin.finder.viewmodel.component.vf vfVar) {
        this.f136020d = trackTipsFrameLayout;
        this.f136021e = vfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout = this.f136020d;
        trackTipsFrameLayout.setVisibility(8);
        android.view.View decorView = this.f136021e.getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) decorView).removeView(trackTipsFrameLayout);
    }
}
