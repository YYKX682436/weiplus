package cp4;

/* loaded from: classes8.dex */
public final class h0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f221025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f221026e;

    public h0(cp4.g1 g1Var, int i17) {
        this.f221026e = g1Var;
        this.f221025d = i17;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        cp4.g1 g1Var = this.f221026e;
        if (i17 != 0) {
            if (i17 == 1) {
                g1Var.I = true;
                yz5.a videoPauseListener = g1Var.getVideoPauseListener();
                if (videoPauseListener != null) {
                    videoPauseListener.invoke();
                }
            }
        } else if (g1Var.I) {
            java.util.List list = g1Var.A;
            int i18 = this.f221025d;
            long j17 = ((r45.is) ((cp4.k0) list.get(i18)).f221043f.get(((java.lang.Number) g1Var.H.get(i18)).intValue())).f377298e;
            yz5.l videoSeekListener = g1Var.getVideoSeekListener();
            if (videoSeekListener != null) {
                if (j17 >= 2147483637) {
                    j17 = 0;
                }
                videoSeekListener.invoke(java.lang.Long.valueOf(j17));
            }
            g1Var.I = false;
            cp4.g1.g(g1Var, i18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.List captionViews;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        cp4.g1 g1Var = this.f221026e;
        if (!g1Var.I) {
            yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        java.util.List list = g1Var.H;
        int i19 = this.f221025d;
        int intValue = ((java.lang.Number) list.get(i19)).intValue();
        captionViews = g1Var.getCaptionViews();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((androidx.recyclerview.widget.RecyclerView) captionViews.get(i19)).getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        int w17 = (linearLayoutManager.w() + linearLayoutManager.y()) / 2;
        java.util.List list2 = g1Var.A;
        if (w17 == ((cp4.k0) list2.get(i19)).f221044g) {
            yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        int i27 = w17 - 1;
        int i28 = w17 + 1;
        if (i27 <= i28) {
            while (true) {
                if (!cp4.g1.f(g1Var, i19, linearLayoutManager.findViewByPosition(i27))) {
                    if (i27 == i28) {
                        break;
                    } else {
                        i27++;
                    }
                } else {
                    list.set(i19, java.lang.Integer.valueOf(i27));
                    ((cp4.k0) list2.get(i19)).f221044g = ((java.lang.Number) list.get(i19)).intValue();
                    ((cp4.k0) list2.get(i19)).y(linearLayoutManager.findViewByPosition(intValue));
                    ((cp4.k0) list2.get(i19)).x(linearLayoutManager.findViewByPosition(((java.lang.Number) list.get(i19)).intValue()), null);
                    java.util.Objects.toString(list);
                    break;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
