package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class c6 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView f116227a;

    public c6(com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView finderLiveLocationView) {
        this.f116227a = finderLiveLocationView;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView.f(this.f116227a, 1);
        }
    }
}
