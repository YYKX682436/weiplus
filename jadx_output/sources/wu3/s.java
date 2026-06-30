package wu3;

/* loaded from: classes5.dex */
public final class s extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView f449802d;

    public s(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView) {
        this.f449802d = editorAudioSearchView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$mScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
            wt3.u uVar = wt3.v.f449504h;
            wt3.v.f449506j.f61554g = y17;
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView = this.f449802d;
            su3.m mVar = editorAudioSearchView.f155964u;
            if (mVar != null && y17 == mVar.getItemCount() - 1) {
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo x17 = mVar.x(y17);
                boolean z17 = false;
                if (x17 != null && x17.f155718o == 5) {
                    z17 = true;
                }
                if (z17) {
                    editorAudioSearchView.c(true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$mScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$mScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$mScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
