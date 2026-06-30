package com.tencent.mm.view.manager;

/* loaded from: classes15.dex */
public class g extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.d f213659d;

    public g(com.tencent.mm.view.manager.d dVar) {
        this.f213659d = dVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        ir.y0 x17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 != 0) {
            yj0.a.h(this, "com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        com.tencent.mm.view.manager.d dVar = this.f213659d;
        dVar.getClass();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            boolean z17 = false;
            android.view.View findViewByPosition = layoutManager.findViewByPosition(0);
            if (findViewByPosition != null && (x17 = dVar.f213641q.x(0)) != null && x17.f293919a.f293895a == 3 && w75.a.a() && com.tencent.mm.sdk.platformtools.x2.n()) {
                android.graphics.Rect rect = new android.graphics.Rect();
                recyclerView.getGlobalVisibleRect(rect);
                android.graphics.Rect rect2 = new android.graphics.Rect();
                findViewByPosition.getGlobalVisibleRect(rect2);
                if (rect2.left >= rect.left && rect2.right <= rect.right && rect2.top >= rect.top && rect2.bottom <= rect.bottom) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "emoji search tab show");
                    dVar.b(dVar.f213624a);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/view/manager/SmileyPanelManager$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
