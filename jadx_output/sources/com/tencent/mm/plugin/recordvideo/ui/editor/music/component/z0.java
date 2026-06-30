package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class z0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 f156328d;

    public z0(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var) {
        this.f156328d = b1Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchResultViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var = this.f156328d;
            android.widget.EditText editText = b1Var.f156174o;
            boolean z17 = false;
            if (editText != null && editText.hasFocus()) {
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1.q(b1Var, false);
                android.widget.EditText editText2 = b1Var.f156174o;
                if (editText2 != null && true == editText2.hasFocus()) {
                    z17 = true;
                }
                if (z17) {
                    editText2.clearFocus();
                }
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
            wt3.v.f449506j.f61554g = y17;
            dv3.c cVar = b1Var.f156180u;
            if (cVar != null && y17 == cVar.getItemCount() - 1 && b1Var.E && !cVar.O0()) {
                java.util.ArrayList arrayList2 = cVar.I;
                int size = arrayList2.size();
                arrayList2.add(new rv3.j());
                cVar.notifyItemRangeInserted(size, 1);
                b1Var.u(true, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1.f156188d);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchResultViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchResultViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent$initSearchResultViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
