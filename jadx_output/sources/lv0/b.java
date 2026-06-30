package lv0;

/* loaded from: classes5.dex */
public final class b extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final lv0.a f321479d;

    public b(lv0.a builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f321479d = builder;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(-1);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(-1);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        int i17 = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? ((androidx.recyclerview.widget.GridLayoutManager) layoutManager).f11861w : layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? ((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager).f11920d : -1;
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int b17 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).b();
            if (b17 < 0) {
                return;
            }
            int i18 = b17 % i17;
            lv0.a aVar = this.f321479d;
            int i19 = aVar.f321476b;
            int i27 = (i18 * i19) / i17;
            int i28 = i18 + 1;
            int i29 = i19 - ((i28 * i19) / i17);
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = parent.getLayoutManager();
            if (layoutManager2 instanceof androidx.recyclerview.widget.GridLayoutManager) {
                ((androidx.recyclerview.widget.GridLayoutManager) layoutManager2).B.a(b17, i17);
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager3 = parent.getLayoutManager();
            boolean z17 = true;
            if (!(layoutManager3 instanceof androidx.recyclerview.widget.GridLayoutManager) ? !(layoutManager3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) || (((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager3).f11924h != 1 ? (b17 + 1) % i17 != 0 : b17 < itemCount - (((itemCount - 1) % i17) + 1)) : b17 < itemCount - (((itemCount - 1) % i17) + 1)) {
                z17 = false;
            }
            outRect.set(i27, 0, i29, z17 ? 0 : aVar.f321475a);
            int i37 = aVar.f321478d;
            if (i37 == 0 && aVar.f321477c == 0) {
                return;
            }
            int i38 = aVar.f321477c;
            int i39 = (i37 + i38) / i17;
            outRect.left += i38 - (i18 * i39);
            outRect.right += (i28 * i39) - i38;
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        lv0.a aVar = this.f321479d;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
    }
}
