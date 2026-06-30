package gt4;

/* loaded from: classes14.dex */
public final class n0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f275476d;

    public n0(gt4.s0 s0Var) {
        this.f275476d = s0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        gt4.s0 s0Var = this.f275476d;
        if (s0Var.f275533J != null) {
            if (s0Var.I <= 0) {
                yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                int w17 = linearLayoutManager.w();
                java.util.List list = s0Var.E;
                gt4.j1 j1Var = (gt4.j1) ((java.util.ArrayList) list).get(w17);
                int i19 = s0Var.H;
                boolean z17 = false;
                if (i19 == 0 || i19 != j1Var.f275459d) {
                    s0Var.H = j1Var.f275459d;
                    android.widget.FrameLayout frameLayout = s0Var.C;
                    if (frameLayout == null) {
                        kotlin.jvm.internal.o.o("headerLayout");
                        throw null;
                    }
                    frameLayout.setVisibility(0);
                    s0Var.m();
                }
                if (j1Var.f275456a != 1) {
                    int i27 = j1Var.f275457b;
                    if (i27 < 0) {
                        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                        return;
                    }
                    gt4.j1 j1Var2 = (gt4.j1) ((java.util.ArrayList) list).get(i27);
                    int size = ((java.util.ArrayList) list).size();
                    int i28 = j1Var2.f275458c;
                    if (size <= i28 || i28 <= 0) {
                        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                        return;
                    }
                    j1Var = (gt4.j1) ((java.util.ArrayList) list).get(i28);
                }
                android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(j1Var.f275457b);
                if (findViewByPosition == null) {
                    yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                    return;
                }
                int i29 = s0Var.I;
                int top = findViewByPosition.getTop();
                if (1 <= top && top <= i29) {
                    z17 = true;
                }
                if (z17) {
                    android.widget.FrameLayout frameLayout2 = s0Var.C;
                    if (frameLayout2 == null) {
                        kotlin.jvm.internal.o.o("headerLayout");
                        throw null;
                    }
                    frameLayout2.setY(findViewByPosition.getTop() - s0Var.I);
                } else {
                    android.widget.FrameLayout frameLayout3 = s0Var.C;
                    if (frameLayout3 == null) {
                        kotlin.jvm.internal.o.o("headerLayout");
                        throw null;
                    }
                    frameLayout3.setY(0.0f);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
