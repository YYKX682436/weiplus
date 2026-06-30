package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class w1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f151978d;

    public w1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView) {
        this.f151978d = musicMvCommentView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView = this.f151978d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = musicMvCommentView.f151662h.f22495c.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
        int i19 = musicMvCommentView.f151660f;
        if (y17 >= i19) {
            i19 = y17;
        }
        musicMvCommentView.f151660f = i19;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = musicMvCommentView.f151659e;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        if (y17 == wxRecyclerAdapter.getItemCount() - 1) {
            musicMvCommentView.b();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = musicMvCommentView.f151659e;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            musicMvCommentView.f151660f = wxRecyclerAdapter2.getItemCount();
        } else {
            musicMvCommentView.d(musicMvCommentView.f151658d.size() - musicMvCommentView.f151660f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
