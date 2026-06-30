package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class f extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer f122299d;

    public f(com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer) {
        this.f122299d = finderPlayListDrawer;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer$Companion$createDrawerToAttachWindow$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.playlist.k.a(com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer.G, this.f122299d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer$Companion$createDrawerToAttachWindow$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer$Companion$createDrawerToAttachWindow$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer = this.f122299d;
        if (finderPlayListDrawer.E) {
            com.tencent.mm.plugin.finder.playlist.k.a(com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer.G, finderPlayListDrawer);
        }
        finderPlayListDrawer.E = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer$Companion$createDrawerToAttachWindow$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
