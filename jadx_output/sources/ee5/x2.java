package ee5;

/* loaded from: classes3.dex */
public final class x2 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f252088d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f252089e = new android.graphics.Paint(1);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.a3 f252090f;

    public x2(ee5.a3 a3Var) {
        this.f252090f = a3Var;
        this.f252088d = (int) a3Var.getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479567j);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int i17 = this.f252088d;
        outRect.set(i17, i17, i17, i17);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        android.graphics.Paint paint = this.f252089e;
        paint.setColor(-2434342);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            int i18 = this.f252088d;
            if (i17 == 1 || i17 == 4 || i17 == 7 || i17 == 10) {
                c17.drawLine(childAt.getLeft() - i18, childAt.getTop(), childAt.getLeft() - i18, childAt.getBottom(), paint);
                c17.drawLine(childAt.getRight() + i18, childAt.getTop(), childAt.getRight() + i18, childAt.getBottom(), paint);
            }
            if (i17 == 13) {
                c17.drawLine(childAt.getLeft() - i18, childAt.getTop(), childAt.getLeft() - i18, childAt.getBottom(), paint);
                ee5.a3 a3Var = this.f252090f;
                if (a3Var.f251820i && com.tencent.mm.storage.z3.R4(a3Var.f251817f)) {
                    c17.drawLine(childAt.getRight() + i18, childAt.getTop(), childAt.getRight() + i18, childAt.getBottom(), paint);
                }
            }
        }
    }
}
