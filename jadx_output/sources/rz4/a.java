package rz4;

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
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/adapter/NoteRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (java.lang.Math.abs(i18) > 0) {
            if (!recyclerView.canScrollVertically(-1)) {
                ((com.tencent.mm.plugin.wenote.ui.nativenote.f2) this).f188204d.hideActionbarLine();
            } else if (!recyclerView.canScrollVertically(1)) {
                int i19 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = ((com.tencent.mm.plugin.wenote.ui.nativenote.f2) this).f188204d;
                noteEditorUI.f100600g.f343492q = true;
                noteEditorUI.I1 = true;
            } else if (i18 < 0) {
                int i27 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI2 = ((com.tencent.mm.plugin.wenote.ui.nativenote.f2) this).f188204d;
                noteEditorUI2.getClass();
                gm0.j1.e().j(new com.tencent.mm.plugin.wenote.ui.nativenote.z(noteEditorUI2));
            } else if (i18 > 0) {
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI3 = ((com.tencent.mm.plugin.wenote.ui.nativenote.f2) this).f188204d;
                noteEditorUI3.showActionbarLine();
                int i28 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
                gm0.j1.e().j(new com.tencent.mm.plugin.wenote.ui.nativenote.z(noteEditorUI3));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/adapter/NoteRecyclerViewAbstractScroller", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
