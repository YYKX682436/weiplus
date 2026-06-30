package ed5;

/* loaded from: classes2.dex */
public final class n extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f251375d;

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        android.graphics.Paint paint = this.f251375d;
        if (paint == null) {
            paint = new android.graphics.Paint();
            paint.setColor(i65.a.d(parent.getContext(), com.tencent.mm.R.color.f478491c));
            paint.setStyle(android.graphics.Paint.Style.FILL);
            this.f251375d = paint;
        }
        float width = parent.getWidth();
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            if (childAt != null) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams ? (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams : null) != null) {
                    c17.drawRect(0.0f, childAt.getTop() - ((android.view.ViewGroup.MarginLayoutParams) r2).topMargin, width, childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) r2).bottomMargin, paint);
                }
            }
        }
    }
}
