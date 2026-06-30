package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public abstract class i0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.GridLayoutManager f201013d;

    public i0(androidx.recyclerview.widget.GridLayoutManager layoutManager) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        this.f201013d = layoutManager;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment$EmojiScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment$EmojiScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment$EmojiScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.ui.chatting.gallery.l0 l0Var = (com.tencent.mm.ui.chatting.gallery.l0) this;
        com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment = l0Var.f201167e;
        if (!emojiHistoryListFragment.f200555x && !emojiHistoryListFragment.f200554w) {
            int childCount = this.f201013d.getChildCount();
            int itemCount = this.f201013d.getItemCount();
            int w17 = this.f201013d.w();
            if ((itemCount - childCount) - w17 <= 30) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListFragment", "[onScrolled] :: total(" + itemCount + ") - loaded:(" + (childCount + w17) + ") <= 30, ready to load more");
                com.tencent.mm.ui.chatting.gallery.EmojiHistoryListFragment emojiHistoryListFragment2 = l0Var.f201167e;
                if (!emojiHistoryListFragment2.f200554w && !emojiHistoryListFragment2.f200555x) {
                    emojiHistoryListFragment2.f200555x = true;
                    com.tencent.mm.ui.chatting.presenter.h0 h0Var = emojiHistoryListFragment2.f200550s;
                    if (h0Var != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListPresenter", "[loadMore] :: query: " + h0Var.f202240i);
                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.f0(h0Var));
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListFragment$EmojiScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
