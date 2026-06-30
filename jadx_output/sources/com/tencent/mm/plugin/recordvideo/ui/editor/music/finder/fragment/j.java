package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

/* loaded from: classes5.dex */
public final class j extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment f156372d;

    public j(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment finderMusicPickerRecommendFeedFragment) {
        this.f156372d = finderMusicPickerRecommendFeedFragment;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecommendFeedFragment$initListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment finderMusicPickerRecommendFeedFragment = this.f156372d;
            nv3.t tVar = finderMusicPickerRecommendFeedFragment.f156345x;
            if (tVar != null) {
                tVar.b(false);
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
            wt3.u uVar = wt3.v.f449504h;
            wt3.v.f449506j.f61554g = y17;
            dv3.c cVar = finderMusicPickerRecommendFeedFragment.f156381e;
            if (cVar != null && y17 == cVar.getItemCount() - 1 && cVar.M0(y17) == 2) {
                finderMusicPickerRecommendFeedFragment.C0(false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecommendFeedFragment$initListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecommendFeedFragment$initListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecommendFeedFragment$initListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
