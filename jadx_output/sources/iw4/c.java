package iw4;

/* loaded from: classes15.dex */
public class c extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView f295243d;

    public c(com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView similarEmojiLoadMoreRecyclerView) {
        this.f295243d = similarEmojiLoadMoreRecyclerView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.feature.emoji.api.y6 y6Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView similarEmojiLoadMoreRecyclerView = this.f295243d;
            if (!similarEmojiLoadMoreRecyclerView.f182049v2 && similarEmojiLoadMoreRecyclerView.getLayoutManager() != null && similarEmojiLoadMoreRecyclerView.getAdapter() != null) {
                if (((androidx.recyclerview.widget.GridLayoutManager) similarEmojiLoadMoreRecyclerView.getLayoutManager()).y() + 1 + ((androidx.recyclerview.widget.GridLayoutManager) similarEmojiLoadMoreRecyclerView.getLayoutManager()).f11861w >= similarEmojiLoadMoreRecyclerView.getAdapter().getItemCount() && (y6Var = similarEmojiLoadMoreRecyclerView.f182048u2) != null) {
                    similarEmojiLoadMoreRecyclerView.getAdapter();
                    com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI = (com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI) y6Var;
                    iw4.d dVar = sosSimilarUI.f182050d;
                    if (dVar.f295250m) {
                        android.view.ViewParent viewParent = sosSimilarUI.f182052f;
                        boolean z17 = viewParent instanceof com.tencent.mm.feature.emoji.api.z6;
                        com.tencent.mm.feature.emoji.api.z6 z6Var = z17 ? (com.tencent.mm.feature.emoji.api.z6) viewParent : null;
                        if ((z6Var == null || ((com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView) z6Var).f182049v2) ? false : true) {
                            com.tencent.mm.feature.emoji.api.z6 z6Var2 = z17 ? (com.tencent.mm.feature.emoji.api.z6) viewParent : null;
                            if (z6Var2 != null) {
                                com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView similarEmojiLoadMoreRecyclerView2 = (com.tencent.mm.plugin.webview.emojistore.ui.SimilarEmojiLoadMoreRecyclerView) z6Var2;
                                if (!similarEmojiLoadMoreRecyclerView2.f182049v2) {
                                    similarEmojiLoadMoreRecyclerView2.f182049v2 = true;
                                }
                            }
                            sosSimilarUI.W6();
                            dVar.b(sosSimilarUI);
                        }
                    }
                }
                yj0.a.h(this, "com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
