package m31;

/* loaded from: classes3.dex */
public final class f1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f323143d;

    public f1(m31.p1 p1Var) {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f323143d = paint;
        paint.setColor(p1Var.f323180d.getResources().getColor(com.tencent.mm.R.color.f478891k0));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setFlags(1);
        paint.setStrokeWidth(2);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        if (parent.u0(view) == 0) {
            outRect.set(0, 2, 0, 2);
        } else {
            outRect.set(0, 0, 0, 2);
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        float paddingLeft = parent.getPaddingLeft();
        float width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.ViewGroup.LayoutParams layoutParams = parent.getChildAt(i17).getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
            float f17 = 2;
            float bottom = r0.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + f17;
            android.graphics.Paint paint = this.f323143d;
            if (i17 == 0) {
                float top = (r0.getTop() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - f17;
                c17.drawLine(paddingLeft, top, width, top, paint);
            }
            c17.drawLine(paddingLeft, bottom, width, bottom, paint);
        }
    }
}
