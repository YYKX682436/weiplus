package fc2;

/* loaded from: classes2.dex */
public final class i extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.o f260946d;

    public i(fc2.o oVar) {
        this.f260946d = oVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/event/base/FinderFeedFlowEventSubscriber$getBehavior$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        fc2.o oVar = this.f260946d;
        android.graphics.Rect rect = oVar.f260959d;
        if (rect.isEmpty()) {
            recyclerView.getGlobalVisibleRect(rect);
        }
        if (oVar.f260963h != i17) {
            oVar.f260963h = i17;
        }
        oVar.g(recyclerView, i17);
        if (oVar.f260963h == 0) {
            oVar.f260966k = new int[5];
            oVar.f260965j = 0;
            oVar.f260967l = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/event/base/FinderFeedFlowEventSubscriber$getBehavior$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        int i19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/event/base/FinderFeedFlowEventSubscriber$getBehavior$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        fc2.o oVar = this.f260946d;
        oVar.getClass();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int i27 = layoutManager.getF98486n() ? i17 : i18;
            int abs = java.lang.Math.abs(i27);
            oVar.f260964i += abs;
            int[] iArr = oVar.f260966k;
            int i28 = oVar.f260965j;
            iArr[i28] = abs;
            oVar.f260965j = (i28 + 1) % iArr.length;
            if (oVar.f260963h == 1 && ((java.lang.Boolean) ((jz5.n) oVar.f260958c).getValue()).booleanValue()) {
                oVar.f260967l += i27;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleOnScrolled draggingDistance:");
                sb6.append(oVar.f260967l);
                sb6.append(" offset:");
                sb6.append(i27);
                sb6.append(" heightPixels:");
                int i29 = oVar.f260957b;
                sb6.append(i29);
                com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", sb6.toString());
                if (java.lang.Math.abs(oVar.f260967l) > i29 / 2) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "pushEvent handleOnScrolled draggingDistance:" + oVar.f260967l + " offset:" + i27 + " heightPixels:" + i29);
                    oVar.g(recyclerView, 3);
                    oVar.f260967l = 0;
                }
            } else if (oVar.f260963h == 2) {
                int[] iArr2 = oVar.f260966k;
                kotlin.jvm.internal.o.g(iArr2, "<this>");
                double d17 = 0.0d;
                int i37 = 0;
                double d18 = 0.0d;
                for (int i38 : iArr2) {
                    d18 += i38;
                    i37++;
                }
                double d19 = i37 == 0 ? Double.NaN : d18 / i37;
                int length = oVar.f260966k.length;
                for (int i39 = 0; i39 < length; i39++) {
                    d17 += java.lang.Math.pow(r1[i39] - d19, 2);
                }
                double length2 = d17 / r1.length;
                if (d19 >= 50.0d || length2 >= 50.0d || oVar.f260964i <= oVar.f260962g * 5) {
                    i19 = 0;
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "publish LOW_SPEED_FLING");
                    oVar.g(recyclerView, 8);
                    i19 = 0;
                    oVar.f260964i = 0;
                }
                oVar.f260967l = i19;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/event/base/FinderFeedFlowEventSubscriber$getBehavior$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
