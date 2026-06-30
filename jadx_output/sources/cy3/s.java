package cy3;

/* loaded from: classes2.dex */
public final class s extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f224843d;

    /* renamed from: e, reason: collision with root package name */
    public final int f224844e;

    /* renamed from: f, reason: collision with root package name */
    public final int f224845f;

    /* renamed from: g, reason: collision with root package name */
    public final int f224846g;

    public s(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f224843d = paint;
        this.f224844e = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479642bh);
        this.f224845f = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479663c1);
        this.f224846g = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
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
        outRect.bottom = this.f224844e;
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
            c17.drawRect(childAt.getLeft() + this.f224845f, bottom, (childAt.getLeft() + childAt.getWidth()) - this.f224846g, this.f224844e + bottom, this.f224843d);
        }
    }
}
