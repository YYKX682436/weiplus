package cy3;

/* loaded from: classes2.dex */
public final class r extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f224840d;

    /* renamed from: e, reason: collision with root package name */
    public final int f224841e;

    /* renamed from: f, reason: collision with root package name */
    public final int f224842f;

    public r(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f224840d = paint;
        this.f224841e = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479642bh);
        this.f224842f = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479651bp);
        paint.setAntiAlias(true);
        paint.setColor(i65.a.d(context, com.tencent.mm.R.color.FG_3));
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = this.f224841e;
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDrawOver(c17, parent, state);
        int childCount = parent.getChildCount() - 1;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams)).bottomMargin;
            int i18 = this.f224841e + bottom;
            c17.drawRect(childAt.getLeft() + this.f224842f, bottom, (childAt.getWidth() + r4) - r5, i18, this.f224840d);
        }
    }
}
