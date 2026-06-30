package rj5;

/* loaded from: classes10.dex */
public final class e extends rj5.c {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f396381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetWrapper scrollViewWidgetWrapper, androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(scrollViewWidgetWrapper);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f396381d = recyclerView;
    }

    @Override // rj5.l
    public void a(float f17, boolean z17) {
        int height;
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f396381d;
        int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent();
        if (computeVerticalScrollRange < 0) {
            computeVerticalScrollRange = 0;
        }
        int computeVerticalScrollOffset = ((int) (computeVerticalScrollRange * e17)) - recyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset == 0) {
            return;
        }
        if (this.f396377b != null && !z17) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            rj5.g gVar = null;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
                int itemCount = linearLayoutManager.getItemCount();
                if (itemCount > 0) {
                    androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = linearLayoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) linearLayoutManager : null;
                    int i17 = gridLayoutManager != null ? gridLayoutManager.f11861w : 1;
                    android.view.View childAt = linearLayoutManager.getChildAt(0);
                    if (childAt != null && (height = childAt.getHeight()) > 0) {
                        int i18 = (int) (e17 * (((itemCount + i17) - 1) / i17) * height);
                        gVar = new rj5.g(e06.p.f((i18 / height) * i17, 0, itemCount - 1), -(i18 % height));
                    }
                }
                if (gVar != null) {
                    recyclerView.f1();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(gVar.f396383b));
                    arrayList.add(java.lang.Integer.valueOf(gVar.f396382a));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController", "scrollTo", "(FZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(linearLayoutManager, "com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController", "scrollTo", "(FZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
            }
        }
        if (z17) {
            recyclerView.smoothScrollBy(0, computeVerticalScrollOffset);
        } else {
            recyclerView.scrollBy(0, computeVerticalScrollOffset);
        }
    }

    @Override // rj5.l
    public boolean b() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f396381d;
        return recyclerView.computeVerticalScrollRange() > recyclerView.computeVerticalScrollExtent();
    }

    @Override // rj5.l
    public float getCurrentPosition() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f396381d;
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent();
        if (computeVerticalScrollRange < 0) {
            computeVerticalScrollRange = 0;
        }
        if (computeVerticalScrollRange == 0) {
            return 0.0f;
        }
        return e06.p.e(computeVerticalScrollOffset / computeVerticalScrollRange, 0.0f, 1.0f);
    }
}
