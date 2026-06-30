package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

/* loaded from: classes5.dex */
public final class o extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment f156375d;

    public o(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment finderMusicPickerSearchFragment) {
        this.f156375d = finderMusicPickerSearchFragment;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerSearchFragment$initListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            this.f156375d.K0(recyclerView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerSearchFragment$initListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerSearchFragment$initListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerSearchFragment$initListeners$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
