package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class k extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView f123373a;

    public k(com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView) {
        this.f123373a = finderTopicFilterView;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView.a(this.f123373a, false, true);
        }
    }
}
