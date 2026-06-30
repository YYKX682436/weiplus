package xw2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457691d;

    public g(xw2.s sVar) {
        this.f457691d = sVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int extendCount;
        kotlinx.coroutines.flow.h3 h3Var;
        java.lang.Object value;
        int i39;
        int i47;
        xw2.s sVar = this.f457691d;
        androidx.recyclerview.widget.RecyclerView recyclerView = sVar.f457722m;
        int width = recyclerView.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int marginStart = width + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        if (marginStart == sVar.f457723n) {
            return;
        }
        sVar.f457723n = marginStart;
        if (marginStart > 0) {
            int i48 = 0;
            while (true) {
                int initialGroupCount = sVar.getInitialGroupCount() - i48;
                float f17 = initialGroupCount;
                extendCount = (int) (marginStart * (f17 / (sVar.getExtendCount() + f17)));
                if (extendCount / initialGroupCount < sVar.getItemMinWidth()) {
                    sVar.getItemMinWidth();
                    i48++;
                    if (i48 >= sVar.getInitialGroupCount()) {
                        break;
                    }
                } else {
                    sVar.getItemMinWidth();
                    kotlinx.coroutines.flow.j2 j2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.h00) sVar.f457716d).f134568f;
                    do {
                        h3Var = (kotlinx.coroutines.flow.h3) j2Var;
                        value = h3Var.getValue();
                        xw2.t tVar = (xw2.t) value;
                        i39 = tVar.f457724a;
                        i47 = tVar.f457725b;
                        tVar.getClass();
                    } while (!h3Var.j(value, new xw2.t(i39, i47, initialGroupCount)));
                }
            }
            int i49 = marginStart - extendCount;
            recyclerView.setPadding(i49, 0, i49, 0);
            android.view.ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMargins(-i49, 0, 0, 0);
            recyclerView.setLayoutParams(layoutParams2);
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = sVar.f457721i;
            int w17 = linearLayoutManager.w();
            android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(w17);
            if ((findViewByPosition != null ? findViewByPosition.getLeft() : -1) != i49) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i49));
                arrayList.add(java.lang.Integer.valueOf(w17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/base/PagerRowView", "invalidatePageWidth", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/view/base/PagerRowView", "invalidatePageWidth", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            recyclerView.getWidth();
            sVar.f457720h.notifyDataSetChanged();
        }
    }
}
