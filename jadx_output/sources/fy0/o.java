package fy0;

/* loaded from: classes5.dex */
public final class o extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final e3.d f267219d;

    public o(e3.d insets) {
        kotlin.jvm.internal.o.g(insets, "insets");
        this.f267219d = insets;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        if (parent.getAdapter() == null) {
            return;
        }
        e3.d dVar = this.f267219d;
        outRect.top = dVar.f247045b;
        outRect.bottom = dVar.f247047d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).b();
        if (b17 == 0) {
            outRect.left = dVar.f247044a;
        }
        if (b17 == r4.getItemCount() - 1) {
            outRect.right = dVar.f247046c;
        }
    }
}
