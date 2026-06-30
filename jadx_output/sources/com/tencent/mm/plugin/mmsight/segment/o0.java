package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class o0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend f149063d;

    public o0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend) {
        this.f149063d = recyclerThumbSeekBarExtend;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend;
        com.tencent.mm.plugin.mmsight.segment.h hVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBarExtend$recyclerViewScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0 && (hVar = (recyclerThumbSeekBarExtend = this.f149063d).f148893i) != null) {
            kotlin.jvm.internal.o.d(hVar);
            hVar.u(recyclerThumbSeekBarExtend.c(), recyclerThumbSeekBarExtend.b());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBarExtend$recyclerViewScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBarExtend$recyclerViewScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBarExtend$recyclerViewScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
