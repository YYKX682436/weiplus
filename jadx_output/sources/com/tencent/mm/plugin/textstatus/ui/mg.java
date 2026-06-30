package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class mg extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f174107d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f174108e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f174109f;

    /* renamed from: g, reason: collision with root package name */
    public int f174110g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f174107d = new java.util.HashMap();
    }

    public static void P6(com.tencent.mm.plugin.textstatus.ui.mg mgVar, int i17, int i18, java.lang.Object obj) {
        java.lang.Integer num = mgVar.f174109f;
        if (num != null) {
            int intValue = num.intValue();
            try {
                androidx.recyclerview.widget.RecyclerView recyclerView = mgVar.f174108e;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    int i19 = mgVar.f174110g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    arrayList.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public final void O6(int i17, int i18, androidx.recyclerview.widget.RecyclerView recyclerView, int i19) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(IILandroidx/recyclerview/widget/RecyclerView;I)V", "Undefined", "scrollToPosition", "(I)V");
            gridLayoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(gridLayoutManager, "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(IILandroidx/recyclerview/widget/RecyclerView;I)V", "Undefined", "scrollToPosition", "(I)V");
        }
        this.f174109f = java.lang.Integer.valueOf(i17);
        int i27 = -((i18 / 2) + 1);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f174108e;
        int measuredHeight = (i27 * (recyclerView2 != null ? recyclerView2.getMeasuredHeight() : 0)) / 3;
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f174108e;
        this.f174110g = measuredHeight + (((recyclerView3 != null ? recyclerView3.getMeasuredHeight() : 0) * 2) / 3);
        P6(this, 0, 1, null);
        java.util.Objects.toString(recyclerView);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f174108e;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int w17 = linearLayoutManager.w();
            android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(w17);
            int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
            this.f174109f = java.lang.Integer.valueOf(w17);
            this.f174110g = top;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }
}
