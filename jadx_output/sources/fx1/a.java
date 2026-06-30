package fx1;

/* loaded from: classes12.dex */
public abstract class a extends androidx.recyclerview.widget.w2 {
    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/adapter/CollectEditorRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (java.lang.Math.abs(i18) > 0) {
            if (!recyclerView.canScrollVertically(-1)) {
                ((com.tencent.mm.plugin.component.editor.r1) this).f96630d.hideActionbarLine();
            } else if (recyclerView.canScrollVertically(1)) {
                if (i18 < 0) {
                    int i19 = com.tencent.mm.plugin.component.editor.EditorUI.f96496J;
                    com.tencent.mm.plugin.component.editor.EditorUI editorUI = ((com.tencent.mm.plugin.component.editor.r1) this).f96630d;
                    editorUI.getClass();
                    gm0.j1.e().j(new com.tencent.mm.plugin.component.editor.b1(editorUI));
                } else if (i18 > 0) {
                    com.tencent.mm.plugin.component.editor.EditorUI editorUI2 = ((com.tencent.mm.plugin.component.editor.r1) this).f96630d;
                    editorUI2.showActionbarLine();
                    int i27 = com.tencent.mm.plugin.component.editor.EditorUI.f96496J;
                    gm0.j1.e().j(new com.tencent.mm.plugin.component.editor.b1(editorUI2));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/CollectEditorRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
