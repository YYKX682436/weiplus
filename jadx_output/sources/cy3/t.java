package cy3;

/* loaded from: classes2.dex */
public final class t extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f224847d;

    /* renamed from: e, reason: collision with root package name */
    public final int f224848e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f224849f;

    public t(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f224847d = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479642bh);
        this.f224848e = dimension;
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(i65.a.d(context, com.tencent.mm.R.color.f478491c));
        this.f224849f = colorDrawable;
        colorDrawable.setBounds(0, 0, 0, dimension);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        outRect.left = 0;
        outRect.right = 0;
        outRect.top = 0;
        outRect.bottom = this.f224848e;
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
            int left = childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            int i18 = this.f224847d + left;
            android.graphics.drawable.ColorDrawable colorDrawable = this.f224849f;
            colorDrawable.setBounds(left, bottom, i18, colorDrawable.getBounds().height() + bottom);
            colorDrawable.draw(c17);
        }
    }
}
