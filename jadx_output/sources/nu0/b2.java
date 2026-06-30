package nu0;

/* loaded from: classes5.dex */
public final class b2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f339872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.y1 f339873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f339874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339875g;

    public b2(androidx.recyclerview.widget.y1 y1Var, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, nu0.b4 b4Var) {
        this.f339873e = y1Var;
        this.f339874f = linearLayoutManager;
        this.f339875g = b4Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.y1 y1Var = this.f339873e;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f339874f;
        android.view.View f17 = y1Var.f(linearLayoutManager);
        int i18 = this.f339872d;
        if (f17 != null) {
            i18 = linearLayoutManager.getPosition(f17);
        }
        int i19 = this.f339872d;
        nu0.b4 b4Var = this.f339875g;
        if (i18 != i19) {
            b4Var.D7(i18);
        }
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[onScrollStateChanged] state:" + i17 + " newPosition:" + i18);
        if (i17 != 0) {
            if (i17 == 1) {
                b4Var.f339880p0 = true;
                b4Var.getClass();
                com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[showContentImageView]");
                androidx.recyclerview.widget.RecyclerView k76 = b4Var.k7();
                android.view.ViewGroup.LayoutParams layoutParams = k76.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = b4Var.t7().getHeight();
                k76.setLayoutParams(layoutParams2);
                android.view.ViewGroup m76 = b4Var.m7();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(m76, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(m76, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "showContentImageView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m76.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(m76, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "showContentImageView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(m76, "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (i18 != this.f339872d) {
                this.f339872d = i18;
                b4Var.getClass();
                b4Var.A7("scroll", i18, new nu0.l3(b4Var));
                b4Var.q7().W6(1);
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            nu0.b4.a7(b4Var);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
