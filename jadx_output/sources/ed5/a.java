package ed5;

/* loaded from: classes3.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f251333d;

    /* renamed from: e, reason: collision with root package name */
    public final int f251334e;

    /* renamed from: f, reason: collision with root package name */
    public final int f251335f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f251336g;

    public a(int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i19 = (i27 & 4) != 0 ? 0 : i19;
        this.f251333d = i17;
        this.f251334e = i18;
        this.f251335f = i19;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        int u07;
        androidx.recyclerview.widget.f2 adapter;
        int itemViewType;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        outRect.set(0, 0, 0, 0);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || (u07 = parent.u0(view)) == -1 || (adapter = parent.getAdapter()) == null || (itemViewType = adapter.getItemViewType(u07)) == this.f251335f || itemViewType == -2 || layoutParams2.f11866i != 1) {
            return;
        }
        int i17 = layoutParams2.f11865h;
        int i18 = this.f251333d;
        int f17 = e06.p.f(i17, 0, i18 - 1);
        int i19 = this.f251334e;
        outRect.left = (i19 * f17) / i18;
        outRect.right = i19 - (((f17 + 1) * i19) / i18);
        outRect.bottom = i19;
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        android.graphics.Paint paint = this.f251336g;
        if (paint == null) {
            paint = new android.graphics.Paint();
            paint.setColor(i65.a.d(parent.getContext(), com.tencent.mm.R.color.f478491c));
            paint.setStyle(android.graphics.Paint.Style.FILL);
            this.f251336g = paint;
        }
        float width = parent.getWidth();
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            if (childAt != null) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    c17.drawRect(0.0f, childAt.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin, width, childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + (layoutParams2.f11866i == 1 ? this.f251334e : 0), paint);
                }
            }
        }
    }
}
