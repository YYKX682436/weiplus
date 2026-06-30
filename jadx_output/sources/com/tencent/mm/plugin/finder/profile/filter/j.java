package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView f123372d;

    public j(com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView) {
        this.f123372d = finderTopicFilterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView = this.f123372d;
        com.tencent.mm.plugin.finder.profile.filter.h hVar = finderTopicFilterView.presenter;
        if (!((hVar == null || (arrayList2 = hVar.f123368e) == null || !(arrayList2.isEmpty() ^ true)) ? false : true)) {
            com.tencent.mm.plugin.finder.profile.FlowLayoutManager flowLayoutManager = finderTopicFilterView.layoutManager;
            if (flowLayoutManager == null) {
                return;
            }
            flowLayoutManager.f123306q = false;
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) finderTopicFilterView.findViewById(com.tencent.mm.R.id.e4c);
        if (textView != null) {
            textView.setTextSize(1, i65.a.q(finderTopicFilterView.getContext()) * 14.0f);
            ym5.a1.h(textView, new com.tencent.mm.plugin.finder.profile.filter.k(finderTopicFilterView));
            com.tencent.mm.plugin.finder.profile.FlowLayoutManager flowLayoutManager2 = finderTopicFilterView.layoutManager;
            if (flowLayoutManager2 != null) {
                com.tencent.mm.plugin.finder.profile.filter.h hVar2 = finderTopicFilterView.presenter;
                if (((hVar2 == null || (arrayList = hVar2.f123368e) == null) ? 0 : arrayList.size()) > flowLayoutManager2.o(0)) {
                    textView.setVisibility(0);
                }
            }
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.profile.filter.l(finderTopicFilterView, textView));
        }
    }
}
